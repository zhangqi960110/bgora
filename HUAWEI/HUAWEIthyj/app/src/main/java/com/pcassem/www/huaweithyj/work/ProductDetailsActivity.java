package com.pcassem.www.huaweithyj.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.work.presenter.ProductPresenter;
import com.pcassem.www.huaweithyj.work.view.ProductView;

public class ProductDetailsActivity extends AppCompatActivity implements ProductView {

    private Toolbar mToolbar;

    private TextView categories1;
    private TextView model1;

    private TextView categories2;
    private TextView model2;
    private TextView manufacturer;
    private TextView instruction;

    private ProductPresenter productPresenter;
    private ProductDetailsEntity mProductDetailsEntity;

    private int pid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        initView();

        pid = getIntent().getIntExtra("pid",-1);

        productPresenter = new ProductPresenter(this);
        productPresenter.onCreate();
        productPresenter.getProductDetails(pid+"");
    }

    private void initView(){
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        categories1 = findViewById(R.id.categories1);
        model1 = findViewById(R.id.model1);
        categories2 =findViewById(R.id.categories2);
        model2 = findViewById(R.id.model2);
        manufacturer = findViewById(R.id.manufacturer);
        instruction = findViewById(R.id.instruction);
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
    public void onSuccessDetails(ResultEntity<ProductDetailsEntity> productDetailsEntity) {
        mProductDetailsEntity = productDetailsEntity.getResult();
        if (mProductDetailsEntity.equals("")){
            categories1.setText("无数据");
            model1.setText("无数据");
            categories2.setText("无数据");
            model2.setText("无数据");
            manufacturer.setText("无数据");
            instruction.setText("无数据");
        }else{
            categories1.setText(mProductDetailsEntity.getCategories());
            model1.setText(mProductDetailsEntity.getModel());
            categories2.setText(mProductDetailsEntity.getCategories());
            model2.setText(mProductDetailsEntity.getModel());
            manufacturer.setText(mProductDetailsEntity.getManufacturer());
            instruction.setText(mProductDetailsEntity.getInstruction());

        }
    }

    @Override
    public void onSuccess(ResultEntity<ProductEntity> productEntity) {

    }

    @Override
    public void onError() {
        Toast.makeText(this, "网络出错", Toast.LENGTH_SHORT).show();
    }
}
