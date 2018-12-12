package com.pcassem.www.huaweithyj.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.CustomListener;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.CardBean;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.work.presenter.PunchInPresenter;
import com.pcassem.www.huaweithyj.work.presenter.ServicePresenter;
import com.pcassem.www.huaweithyj.work.service.LocationApplication;
import com.pcassem.www.huaweithyj.work.service.LocationService;
import com.pcassem.www.huaweithyj.work.view.PunchInView;
import com.pcassem.www.huaweithyj.work.view.ServiceView;

import java.util.ArrayList;

public class PunchInActivity extends AppCompatActivity implements ServiceView, PunchInView, View.OnClickListener {

    private Toolbar mToolbar;
    private LinearLayout select;
    private TextView work;
    private OptionsPickerView pvCustomOptions;
    private ArrayList<String> data = new ArrayList<>();

    private int pageIndex = 1;

    private ServicePresenter servicePresenter;
    private PunchInPresenter punchInPresenter;

    //    定位
    private LocationService locationService;
    private Button startSign;
    //此处设置签到地经度纬度，可从数据库提取
//    private double lat = 28.144549;
//    private double lon = 112.99555;

    private String userid;
    private int type = 1;
    private String timestart;
    private String position = "湖南省长沙市天心区铁道学院";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punch_in);

        initView();
        initEvent();

        servicePresenter = new ServicePresenter(this);
        servicePresenter.onCreate();
        servicePresenter.getCompletingList("1", pageIndex++, 20);

        punchInPresenter = new PunchInPresenter(this);
        punchInPresenter.onCreate();


        initCustomOptionPicker();

    }

    private void initView() {


        startSign = findViewById(R.id.signin);
        mToolbar = findViewById(R.id.my_toolbar);
        select = findViewById(R.id.select);
        work = findViewById(R.id.work);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initEvent() {
        select.setOnClickListener(this);
        startSign.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.select:
                pvCustomOptions.show();
                break;
            case R.id.signin:
                timestart = System.currentTimeMillis() + "";
                punchInPresenter.addSignIn("1", 1, timestart, position);
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

//    @Override
//    public void onStart() {
//        // TODO Auto-generated method stub
//        super.onStart();
//        // -----------location config ------------
//        locationService = ((LocationApplication) getApplication()).locationService;
//        //获取locationservice实例，建议应用中只初始化1个location实例，然后使用，可以参考其他示例的activity，都是通过此种方式获取locationservice实例的
//        locationService.registerListener(mListener);
//        //注册监听
//        int type = getIntent().getIntExtra("from", 0);
//        if (type == 0) {
//            locationService.setLocationOption(locationService.getDefaultLocationClientOption());
//        } else if (type == 1) {
//            locationService.setLocationOption(locationService.getOption());
//        }
//        startSign.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                locationService.start();// 定位SDK
//            }
//        });
//    }

    /*****
     *
     * 定位结果回调，重写onReceiveLocation方法，可以直接拷贝如下代码到自己工程中修改
     *
     */
//    private BDAbstractLocationListener mListener = new BDAbstractLocationListener() {
//
//        @Override
//        public void onReceiveLocation(BDLocation location) {
//            // TODO Auto-generated method stub
//            if (null != location && location.getLocType() != BDLocation.TypeServerError) {
//                //可通过修改0.002修改精度
//                if(Math.abs(location.getLatitude()-lat)<0.02&&Math.abs(location.getLongitude()-lon)<0.02){
//                    Toast.makeText(PunchInActivity.this,"签到成功",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(PunchInActivity.this,"未到指定地点，签到失败",Toast.LENGTH_LONG).show();
//                }
//                locationService.stop();
//            }
//        }
//
//    };
    private void initCustomOptionPicker() {//条件选择器初始化，自定义布局
        /**
         * @description
         *
         * 注意事项：
         * 自定义布局中，id为 optionspicker 或者 timepicker 的布局以及其子控件必须要有，否则会报空指针。
         * 具体可参考demo 里面的两个自定义layout布局。
         */
        pvCustomOptions = new OptionsPickerBuilder(this, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3, View v) {
                //返回的分别是三个级别的选中位置
                String tx = data.get(options1);
                work.setText(tx);
            }
        })
                .setLayoutRes(R.layout.pickerview_custom_options, new CustomListener() {
                    @Override
                    public void customLayout(View v) {
                        final TextView tvSubmit = (TextView) v.findViewById(R.id.tv_finish);
                        ImageView ivCancel = (ImageView) v.findViewById(R.id.iv_cancel);
                        tvSubmit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                pvCustomOptions.returnData();
                                pvCustomOptions.dismiss();
                            }
                        });

                        ivCancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                pvCustomOptions.dismiss();
                            }
                        });

                    }
                })
                .isDialog(true)
                .build();

        pvCustomOptions.setPicker(data);//添加数据

    }

    @Override
    public void onSuccess(ResultEntity<ServiceEntity> serviceEntity) {
        if (serviceEntity.getResult().getListData() != null) {
            for (int i = 0; i < serviceEntity.getResult().getListData().size(); i++) {
                data.add(serviceEntity.getResult().getListData().get(i).getCompany());
            }
        }
    }

    @Override
    public void onSign(ResultEntity serviceEntity) {
        if (serviceEntity.getStatus().equals("success")){
            Toast.makeText(this, "签到成功", Toast.LENGTH_SHORT).show();
            this.finish();
        } else {
            Toast.makeText(this, "签到失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
