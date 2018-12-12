package com.pcassem.www.huaweithyj.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;
import com.pcassem.www.huaweithyj.work.presenter.PunchInPresenter;
import com.pcassem.www.huaweithyj.work.presenter.SignInPresenter;
import com.pcassem.www.huaweithyj.work.view.PunchInView;
import com.pcassem.www.huaweithyj.work.view.SignInView;

public class AttendanceDetailsActivity extends AppCompatActivity implements SignInView,PunchInView,View.OnClickListener {

    private Toolbar mToolbar;

    private TextView tvPosition;
    private TextView tvTimestart;
    private TextView tvTimeend;
    private Button signout;

    private SignInDetailsEntity signInDetailsEntity;
    private SignInPresenter signInPresenter;
    private PunchInPresenter punchInPresenter;

    private int rid;
    private String userid = "1";
    private String timeend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_details);

        initView();

        rid = getIntent().getIntExtra("rid",-1);

        signInPresenter = new SignInPresenter(this);
        signInPresenter.onCreate();
        signInPresenter.getSignInDetails(rid+"");

        punchInPresenter = new PunchInPresenter(this);
        punchInPresenter.onCreate();

        initEvent();
    }

    private void initView() {
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        tvPosition = findViewById(R.id.position);
        tvTimestart = findViewById(R.id.timestart);
        tvTimeend = findViewById(R.id.timeend);
        signout = findViewById(R.id.signout);
    }

    private void initEvent(){
        signout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signout:
                timeend = System.currentTimeMillis() + "";
                punchInPresenter.addSignOut(userid, rid+"", timeend);
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

    @Override
    public void onSuccess(ResultEntity<SigninEntity> signinEntity) {

    }

    @Override
    public void onSuccessDetails(ResultEntity<SignInDetailsEntity> signinDetails) {
        signInDetailsEntity = signinDetails.getResult();
        if (!signInDetailsEntity.equals("")){
            tvPosition.setText(signInDetailsEntity.getPosition());
            tvTimestart.setText(signInDetailsEntity.getTimestart());
            if (signInDetailsEntity.getTimeend().length() == 0){
                tvTimeend.setVisibility(View.GONE);
                signout.setVisibility(View.VISIBLE);
            }else{
                tvTimeend.setText(signInDetailsEntity.getTimeend());
                tvTimeend.setVisibility(View.VISIBLE);
                signout.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onSign(ResultEntity serviceEntity) {
        if (serviceEntity.getStatus().equals("success")){
            Toast.makeText(this, "签退成功", Toast.LENGTH_SHORT).show();
            this.finish();
        } else {
            Toast.makeText(this, "签退失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
