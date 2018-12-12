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
import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.utils.Utils;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.view.SearchView;
import com.pcassem.www.huaweithyj.work.adapter.CompletedAdapter;
import com.pcassem.www.huaweithyj.work.adapter.ProductListAdapter;
import com.pcassem.www.huaweithyj.work.presenter.ProductPresenter;
import com.pcassem.www.huaweithyj.work.view.ProductView;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity implements ProductView, ProductListAdapter.OnItemClickListener,TextView.OnEditorActionListener {

    private Toolbar mToolbar;
    private SearchView searchView;
    private RecyclerView mRecyclerView;
    private ProductListAdapter productListAdapter;
    private LoadMoreWrapper loadMoreWrapper;
    private List<ProductEntity.ListDataBean> mData = new ArrayList<>();
    private ProductPresenter productPresenter;

    private int pageIndex = 1;
    private int totalCount = 0;

    private String searchStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        initView();
        initEvent();

        productPresenter = new ProductPresenter(this);
        productPresenter.onCreate();
        productPresenter.getSearchProduct(searchStr, pageIndex++,20);
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

        searchView = findViewById(R.id.search);
    }

    private void initEvent() {

        searchView.setOnEditorActionListener(this);

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    productPresenter.getSearchProduct(searchStr, pageIndex++,20);
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

            mData.clear();
            pageIndex = 1;
            searchStr = textView.getText().toString();
            Utils.hideKeyboard(textView);
            productPresenter.getSearchProduct(searchStr, pageIndex++, 20);

            return true;
        }
        return false;
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this,ProductDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("pid",position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onSuccessDetails(ResultEntity<ProductDetailsEntity> productDetailsEntity) {

    }

    @Override
    public void onSuccess(ResultEntity<ProductEntity> productEntity) {
        mData = productEntity.getResult().getListData();
        totalCount = productEntity.getResult().getTotalCount();

        if (mData.equals("")) {
            Toast.makeText(this, "无数据", Toast.LENGTH_SHORT).show();
        } else {
            if (productListAdapter == null) {
                productListAdapter = new ProductListAdapter(this, mData);
                loadMoreWrapper = new LoadMoreWrapper(productListAdapter);
                mRecyclerView.setAdapter(loadMoreWrapper);
                productListAdapter.setmOnItemClickListener(this);
            }

            productListAdapter.setmData(mData);
        }
    }

    @Override
    public void onError() {
        Toast.makeText(this, "网络出错", Toast.LENGTH_SHORT).show();
    }

}
