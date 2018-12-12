package com.pcassem.www.huaweithyj.news.widget;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.adapter.NewsAdapter;
import com.pcassem.www.huaweithyj.news.NewsDetailsActivity;
import com.pcassem.www.huaweithyj.news.presenter.NewsPresenter;
import com.pcassem.www.huaweithyj.news.view.NewsView;
import com.pcassem.www.huaweithyj.utils.Utils;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.view.SearchView;

import java.util.ArrayList;
import java.util.List;


public class NewsFragment extends Fragment implements NewsView, NewsAdapter.OnItemClickListener, SearchView.OnEditorActionListener {

    private RecyclerView mRecyclerView;
    private SearchView searchView;
    private NewsAdapter mNewsAdapter;
    private LoadMoreWrapper loadMoreWrapper;
    private List<NewsEntity.ListDataBean> mData = new ArrayList<>();
    private NewsPresenter newsPresenter;

    private int pageIndex = 1;
    private int totalCount = 0;
    private String searchStr = "";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        initView(view);

        newsPresenter = new NewsPresenter(this);
        newsPresenter.onCreate();
        newsPresenter.getSearchNewsList("1", searchStr, pageIndex++, 20);

        initEvent();

        return view;
    }

    private void initView(View view) {

        mRecyclerView = view.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

        searchView = view.findViewById(R.id.search);

    }

    private void initEvent() {

        searchView.setOnEditorActionListener(this);
        // 设置加载更多监听
        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    newsPresenter.getSearchNewsList("1", searchStr, pageIndex++, 20);
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_COMPLETE);
                } else {
                    // 显示加载到底的提示
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_END);
                }
            }
        });
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_SEARCH) {
            Utils.hideKeyboard(searchView);
            mData.clear();
            pageIndex = 1;
            searchStr = textView.getText().toString();
            newsPresenter.getSearchNewsList("1", searchStr, pageIndex++, 20);
        }
        return false;
    }


    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(getActivity(), NewsDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("seid", position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onSuccessDetails(ResultEntity<NewsDetailsEntity> newsDetailsEntity) {

    }

    @Override
    public void onSuccess(ResultEntity<NewsEntity> newsEntity) {

        mData.addAll(newsEntity.getResult().getListData());

        totalCount = newsEntity.getResult().getTotalCount();

        if (mData.equals("")) {
            Toast.makeText(getActivity(), "无数据", Toast.LENGTH_SHORT).show();
        }

        if (mNewsAdapter == null) {
            mNewsAdapter = new NewsAdapter(getContext(), mData);
            loadMoreWrapper = new LoadMoreWrapper(mNewsAdapter);
            mRecyclerView.setAdapter(loadMoreWrapper);
            mNewsAdapter.setmOnItemClickListener(this);
        }
        mNewsAdapter.setmData(mData);
    }

    @Override
    public void onError() {
        Toast.makeText(getActivity(), "请求失败", Toast.LENGTH_SHORT).show();
    }

}

