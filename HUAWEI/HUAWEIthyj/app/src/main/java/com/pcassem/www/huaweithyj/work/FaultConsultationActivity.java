package com.pcassem.www.huaweithyj.work;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.utils.Utils;
import com.pcassem.www.huaweithyj.utils.WrapContentLinearLayoutManager;
import com.pcassem.www.huaweithyj.view.EndlessRecyclerOnScrollListener;
import com.pcassem.www.huaweithyj.view.LoadMoreWrapper;
import com.pcassem.www.huaweithyj.view.SearchView;
import com.pcassem.www.huaweithyj.work.adapter.CompletedAdapter;
import com.pcassem.www.huaweithyj.work.adapter.DeviceListAdapter;
import com.pcassem.www.huaweithyj.work.adapter.FaultListAdapter;
import com.pcassem.www.huaweithyj.work.presenter.FaultPresenter;
import com.pcassem.www.huaweithyj.work.view.FaultView;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;
import com.yzq.zxinglibrary.android.CaptureActivity;
import com.yzq.zxinglibrary.common.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FaultConsultationActivity extends AppCompatActivity implements FaultView, DeviceListAdapter.OnItemClickListener,View.OnClickListener,SearchView.OnEditorActionListener {

    private Toolbar mToolbar;
    private ImageView saoma;
    private SearchView searchView;
    private RecyclerView mRecyclerView;
    private DeviceListAdapter mDeviceListAdapter;
    private int REQUEST_CODE_SCAN = 111;

    private FaultPresenter faultPresenter;
    private LoadMoreWrapper loadMoreWrapper;
    private List<DeviceEntity.ListDataBean> mData = new ArrayList<>();

    private int pageIndex = 1;
    private int totalCount = 0;
    private String searchStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fault_consultation);
        initView();

        faultPresenter = new FaultPresenter(this);
        faultPresenter.onCreate();
        faultPresenter.getSearchDevice(searchStr,pageIndex++,20);

        initEvent();

    }

    private void initView(){
        saoma = findViewById(R.id.saoma);
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        searchView = findViewById(R.id.search);

    }

    private void initEvent(){
        saoma.setOnClickListener(this);
        searchView.setOnEditorActionListener(this);

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING);

                if (mData.size() < totalCount) {
                    // 模拟获取网络数据，延时1s
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    faultPresenter.getSearchDevice(searchStr, pageIndex++,20);
                                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_COMPLETE);
                                }
                            });
                        }
                    }, 1000);
                } else {
                    // 显示加载到底的提示
                    loadMoreWrapper.setLoadState(loadMoreWrapper.LOADING_END);
                }
            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this,FaultListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("eid",position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

        if (i == EditorInfo.IME_ACTION_SEARCH) {
            Utils.hideKeyboard(searchView);
            mData.clear();
            pageIndex = 1;
            searchStr = textView.getText().toString();
            faultPresenter.getSearchDevice(searchStr, pageIndex++, 20);
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.saoma:
                AndPermission.with(this)
                        .permission(Permission.CAMERA, Permission.READ_EXTERNAL_STORAGE)
                        .onGranted(new Action() {
                            @Override
                            public void onAction(List<String> permissions) {
                                Intent intent = new Intent(FaultConsultationActivity.this, CaptureActivity.class);
                                /*ZxingConfig是配置类
                                 *可以设置是否显示底部布局，闪光灯，相册，
                                 * 是否播放提示音  震动
                                 * 设置扫描框颜色等
                                 * 也可以不传这个参数
                                 * */
//                                ZxingConfig config = new ZxingConfig();
//                                config.setPlayBeep(false);//是否播放扫描声音 默认为true
//                                config.setShake(false);//是否震动  默认为true
//                                config.setDecodeBarCode(false);//是否扫描条形码 默认为true
//                                config.setReactColor(R.color.colorAccent);//设置扫描框四个角的颜色 默认为白色
//                                config.setFrameLineColor(R.color.colorAccent);//设置扫描框边框颜色 默认无色
//                                config.setScanLineColor(R.color.colorAccent);//设置扫描线的颜色 默认白色
//                                config.setFullScreenScan(false);//是否全屏扫描  默认为true  设为false则只会在扫描框中扫描
//                                intent.putExtra(Constant.INTENT_ZXING_CONFIG, config);
                                startActivityForResult(intent, REQUEST_CODE_SCAN);
                            }
                        })
                        .onDenied(new Action() {
                            @Override
                            public void onAction(List<String> permissions) {
                                Uri packageURI = Uri.parse("package:" + getPackageName());
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, packageURI);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                                startActivity(intent);

                                Toast.makeText(FaultConsultationActivity.this, "没有权限无法扫描呦", Toast.LENGTH_LONG).show();
                            }
                        }).start();

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // 扫描二维码/条码回传
        if (requestCode == REQUEST_CODE_SCAN && resultCode == RESULT_OK) {
            if (data != null) {
                String content = data.getStringExtra(Constant.CODED_CONTENT);
                searchView.setText(content);
            }
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
    public void onDevice(ResultEntity<DeviceEntity> productEntity) {
        mData.addAll(productEntity.getResult().getListData());

        totalCount = productEntity.getResult().getTotalCount();

        if (mData.equals("")) {
            Toast.makeText(this, "无数据", Toast.LENGTH_SHORT).show();
        } else {
            if (mDeviceListAdapter == null) {
                mDeviceListAdapter = new DeviceListAdapter(this, mData);
                loadMoreWrapper = new LoadMoreWrapper(mDeviceListAdapter);
                mRecyclerView.setAdapter(loadMoreWrapper);
                mDeviceListAdapter.setmOnItemClickListener(this);
            }

            mDeviceListAdapter.setmData(mData);
        }
    }

    @Override
    public void onFault(ResultEntity<FaultEntity> faultEntity) {
    }

    @Override
    public void onFaultDetails(ResultEntity<FaultDetailsEntity> faultDetails) {

    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
