package com.pcassem.www.huaweithyj.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;
import com.pcassem.www.huaweithyj.news.NewsDetailsActivity;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.work.adapter.CompletedAdapter;
import com.pcassem.www.huaweithyj.work.adapter.ProductListAdapter;
import com.pcassem.www.huaweithyj.work.adapter.SignInAdapter;
import com.pcassem.www.huaweithyj.work.presenter.ServicePresenter;
import com.pcassem.www.huaweithyj.work.presenter.SignInPresenter;
import com.pcassem.www.huaweithyj.work.view.SignInView;

import java.util.ArrayList;
import java.util.List;

public class SignInActivity extends AppCompatActivity implements SignInView, View.OnClickListener, SignInAdapter.OnItemClickListener {

    private Toolbar mToolbar;
    private ImageView mIvPunchIn;
    private LoadMoreWrapper loadMoreWrapper;
    private RecyclerView mRecyclerView;
    private SignInAdapter mSignInAdapter;
    private SignInPresenter signInPresenter;
    private List<SigninEntity.ListDataBean> mData = new ArrayList<>();

    private int pageIndex = 1;
    private int totalCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initView();
        initEvent();
        initData();

    }

    private void initView(){
        mToolbar = findViewById(R.id.my_toolbar);
        mIvPunchIn = findViewById(R.id.iv_punch_in);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void initEvent(){
        mIvPunchIn.setOnClickListener(this);

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    signInPresenter.getSignList("1", pageIndex++,20);
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_COMPLETE);
                } else {
                    // 显示加载到底的提示
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_END);
                }
            }
        });
    }

    private void initData(){
        signInPresenter = new SignInPresenter(this);
        signInPresenter.onCreate();
        signInPresenter.getSignList("1",pageIndex++,20);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, AttendanceDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("rid", position);
        intent.putExtras(bundle);
        startActivity(intent);
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
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_punch_in:
                Intent intent = new Intent(this,PunchInActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onSuccess(ResultEntity<SigninEntity> signinEntity) {
        mData = signinEntity.getResult().getListData();
        totalCount = signinEntity.getResult().getTotalCount();

        if (mData.equals("")) {
            Toast.makeText(this, "无数据", Toast.LENGTH_SHORT).show();
        } else {
            if (mSignInAdapter == null) {
                mSignInAdapter = new SignInAdapter(this, mData);
                loadMoreWrapper = new LoadMoreWrapper(mSignInAdapter);
                mRecyclerView.setAdapter(loadMoreWrapper);
                mSignInAdapter.setmOnItemClickListener(this);
            }

            mSignInAdapter.setmData(mData);
        }
    }

    @Override
    public void onSuccessDetails(ResultEntity<SignInDetailsEntity> signinDetails) {
    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
