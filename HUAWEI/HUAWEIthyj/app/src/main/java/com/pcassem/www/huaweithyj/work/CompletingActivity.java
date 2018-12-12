package com.pcassem.www.huaweithyj.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.news.NewsDetailsActivity;
import com.pcassem.www.huaweithyj.utils.Utils;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.view.SearchView;
import com.pcassem.www.huaweithyj.work.adapter.CompletedAdapter;
import com.pcassem.www.huaweithyj.work.adapter.CompletingAdapter;
import com.pcassem.www.huaweithyj.work.presenter.ServicePresenter;
import com.pcassem.www.huaweithyj.work.view.ServiceView;

import java.util.ArrayList;
import java.util.List;

public class CompletingActivity extends AppCompatActivity implements ServiceView, CompletingAdapter.OnItemClickListener,SearchView.OnEditorActionListener {

    private Toolbar mToolbar;
    private SearchView searchView;
    private RecyclerView mRecyclerView;
    private CompletingAdapter mCompletingAdapter;
    private LoadMoreWrapper loadMoreWrapper;
    private List<ServiceEntity.ListDataBean> mData = new ArrayList<>();

    private int pageIndex = 1;
    private int totalCount = 0;
    private String searchStr = "";

    private ServicePresenter servicePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completing);
        initView();
        initEvent();

        servicePresenter = new ServicePresenter(this);
        servicePresenter.onCreate();
        servicePresenter.getSearchCompleting("1",searchStr,pageIndex++,20);
    }

    private void initView(){
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        searchView = findViewById(R.id.search);
    }

    private void initEvent(){

        searchView.setOnEditorActionListener(this);

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    servicePresenter.getSearchCompleting("1", searchStr,pageIndex++,20);
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
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_SEARCH) {
            Utils.hideKeyboard(searchView);
            mData.clear();
            pageIndex = 1;
            searchStr = textView.getText().toString();
            servicePresenter.getSearchCompleting("1",searchStr, pageIndex++, 20);
        }

        return false;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, ""+position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,NewsDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("seid",position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onSuccess(ResultEntity<ServiceEntity> serviceEntity) {
        mData.addAll(serviceEntity.getResult().getListData());

        totalCount = serviceEntity.getResult().getTotalCount();

        if (mData.equals("")){
            Toast.makeText(this, "无数据", Toast.LENGTH_SHORT).show();
        }

        if (mCompletingAdapter == null){
            mCompletingAdapter = new CompletingAdapter(this,mData);
            loadMoreWrapper = new LoadMoreWrapper(mCompletingAdapter);
            mRecyclerView.setAdapter(loadMoreWrapper);
            mCompletingAdapter.setmOnItemClickListener(this);
        }

        mCompletingAdapter.setmData(mData);
    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }

}
