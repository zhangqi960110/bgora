package com.pcassem.www.huaweithyj.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;
import com.pcassem.www.huaweithyj.personal.presenter.PersonalPresenter;
import com.pcassem.www.huaweithyj.personal.view.PersonalView;

public class LoginActivity extends AppCompatActivity implements PersonalView, View.OnClickListener {

    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mLoginBtn;

    private PersonalPresenter personalPresenter;
    private ResultEntity<UserEntity> user;


    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        initEvent();

        personalPresenter = new PersonalPresenter(this);
        personalPresenter.onCreate();
    }

    private void initView() {
        mLoginBtn = findViewById(R.id.loginBtn);
        mEtUsername = findViewById(R.id.username);
        mEtPassword = findViewById(R.id.password);

        sharedPreferences = getSharedPreferences("thyj", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    private void initEvent() {
        mLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loginBtn:
                if (isSubmit()) {
                    personalPresenter.login(mEtUsername.getText().toString(),mEtPassword.getText().toString());
                }
                break;
        }
    }

    private boolean isSubmit() {
        if (TextUtils.isEmpty(mEtUsername.getText())) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(mEtPassword.getText())) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    public void onSuccess(ResultEntity<UserEntity> userEntity) {
        user = userEntity;
        if (user == null){
            Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
        } else {
            editor.putInt("userid",user.getResult().getUserid());
            editor.putString("username",user.getResult().getUsername());
            editor.putString("phone",user.getResult().getPhone());
            editor.commit();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }

    @Override
    public void onSuccessOut(ResultEntity userEntity) {

    }

    @Override
    public void onError() {
        Toast.makeText(this, "网络出错", Toast.LENGTH_SHORT).show();
    }
}
