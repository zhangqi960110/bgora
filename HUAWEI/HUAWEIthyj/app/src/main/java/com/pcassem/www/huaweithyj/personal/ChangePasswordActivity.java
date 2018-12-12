package com.pcassem.www.huaweithyj.personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;

    private EditText mEtOriginalPassword;
    private EditText mEtPassword;
    private EditText mEtChangePassword;
    private Button repairBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();
        initEvent();
    }

    private void initView() {
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mEtOriginalPassword = findViewById(R.id.username);
        mEtPassword = findViewById(R.id.password);
        mEtChangePassword = findViewById(R.id.change_password);

        repairBtn = findViewById(R.id.repairBtn);
    }

    private void initEvent() {
        repairBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.repairBtn:

                if (isSubmit()) {
                    Toast.makeText(this, "修改成功", Toast.LENGTH_SHORT).show();
                    this.finish();
                }
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                this.finish();
            default:
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    private boolean isSubmit() {
        if (TextUtils.isEmpty(mEtOriginalPassword.getText())) {
            Toast.makeText(this, "原始密码输入错误", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(mEtPassword.getText())) {
            Toast.makeText(this, "新密码不能为空", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(mEtChangePassword.getText())) {
            Toast.makeText(this, "确认密码不能为空", Toast.LENGTH_SHORT).show();
            return false;
        } else if (mEtPassword.getText() != mEtChangePassword.getText()) {
            Toast.makeText(this, "确认密码错误", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}
