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
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.work.adapter.DeviceListAdapter;
import com.pcassem.www.huaweithyj.work.adapter.FaultListAdapter;
import com.pcassem.www.huaweithyj.work.adapter.ProductListAdapter;
import com.pcassem.www.huaweithyj.work.presenter.FaultPresenter;
import com.pcassem.www.huaweithyj.work.view.FaultView;

import java.util.ArrayList;
import java.util.List;

public class FaultListActivity extends AppCompatActivity implements FaultView, FaultListAdapter.OnItemClickListener {

    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private LoadMoreWrapper loadMoreWrapper;
    private FaultListAdapter mFaultListAdapter;
    private List<FaultEntity.ListDataBean> mData = new ArrayList<>();

    private FaultPresenter faultPresenter;

    private int eid;

    private int pageIndex = 1;
    private int totalCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fault_list);

        initView();
        initEvent();

        eid = getIntent().getIntExtra("eid",-1);

        faultPresenter = new FaultPresenter(this);
        faultPresenter.onCreate();
        faultPresenter.getFaultList(eid+"", pageIndex, 20);

    }


    private void initView() {
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void initEvent() {

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    faultPresenter.getFaultList(eid+"", pageIndex++,20);
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_COMPLETE);
                } else {
                    // 显示加载到底的提示
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_END);
                }
            }
        });
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
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, FaultDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("fid", position);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    @Override
    public void onDevice(ResultEntity<DeviceEntity> productEntity) {

    }

    @Override
    public void onFault(ResultEntity<FaultEntity> faultEntity) {
        mData.addAll(faultEntity.getResult().getListData());
        totalCount = faultEntity.getResult().getTotalCount();

        if (mData.equals("")) {
            Toast.makeText(this, "无数据", Toast.LENGTH_SHORT).show();
        } else {
            if (mFaultListAdapter == null) {
                mFaultListAdapter = new FaultListAdapter(this, mData);
                loadMoreWrapper = new LoadMoreWrapper(mFaultListAdapter);
                mRecyclerView.setAdapter(loadMoreWrapper);
                mFaultListAdapter.setmOnItemClickListener(this);
            }

            mFaultListAdapter.setmData(mData);
        }
    }

    @Override
    public void onFaultDetails(ResultEntity<FaultDetailsEntity> faultDetails) {

    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
