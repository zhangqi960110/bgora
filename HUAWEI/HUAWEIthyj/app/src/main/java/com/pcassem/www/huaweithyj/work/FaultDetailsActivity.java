package com.pcassem.www.huaweithyj.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.work.presenter.FaultPresenter;
import com.pcassem.www.huaweithyj.work.view.FaultView;

public class FaultDetailsActivity extends AppCompatActivity implements FaultView {

    private Toolbar mToolbar;
    private TextView categories1;
    private TextView model1;
    private TextView categories2;
    private TextView model2;
    private TextView manufacturer;
    private TextView time;
    private TextView fault_type;
    private TextView fault_des;
    private TextView solution;

    private FaultPresenter faultPresenter;
    private FaultDetailsEntity faultDetailsEntity;

    private int fid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fault_details);
        initView();

        fid = getIntent().getIntExtra("fid",-1);
        faultPresenter = new FaultPresenter(this);
        faultPresenter.onCreate();
        faultPresenter.getFaultDetails(fid+"");
    }

    private void initView() {
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        categories1 = findViewById(R.id.categories1);
        model1 = findViewById(R.id.model1);
        categories2 = findViewById(R.id.categories2);
        model2 = findViewById(R.id.model2);
        manufacturer = findViewById(R.id.manufacturer);
        time = findViewById(R.id.time);
        fault_type = findViewById(R.id.fault_type);
        fault_des = findViewById(R.id.fault_des);
        solution = findViewById(R.id.solution);
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

    }

    @Override
    public void onFault(ResultEntity<FaultEntity> faultEntity) {

    }

    @Override
    public void onFaultDetails(ResultEntity<FaultDetailsEntity> faultDetails) {
        faultDetailsEntity = faultDetails.getResult();
        if (faultDetailsEntity.equals("")){
            categories1.setText("无数据");
            model1.setText("无数据");
            categories2.setText("无数据");
            model2.setText("无数据");
            manufacturer.setText("无数据");
            time.setText("无数据");
            fault_type.setText("无数据");
            fault_des.setText("无数据");
            solution.setText("无数据");
        } else {
            categories1.setText(faultDetailsEntity.getCategories());
            model1.setText(faultDetailsEntity.getModel());
            categories2.setText(faultDetailsEntity.getCategories());
            model2.setText(faultDetailsEntity.getModel());
            manufacturer.setText(faultDetailsEntity.getManufacturer());
            time.setText(faultDetailsEntity.getTime());
            fault_type.setText(faultDetailsEntity.getFault_type()+"");
            fault_des.setText(faultDetailsEntity.getFault_des());
            solution.setText(faultDetailsEntity.getSolution());
        }
    }

    @Override
    public void onError() {
        Toast.makeText(this, "获取数据失败", Toast.LENGTH_SHORT).show();
    }
}
