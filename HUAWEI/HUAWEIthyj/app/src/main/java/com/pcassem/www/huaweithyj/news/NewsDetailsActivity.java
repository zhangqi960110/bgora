package com.pcassem.www.huaweithyj.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.presenter.NewsPresenter;
import com.pcassem.www.huaweithyj.news.view.NewsView;

public class NewsDetailsActivity extends AppCompatActivity implements NewsView {

    private Toolbar mToolbar;

    private NewsPresenter newsPresenter;
    private NewsDetailsEntity newsDetailsEntity;

    private int seid;
    private TextView company1;
    private TextView company2;
    private TextView name;
    private TextView number;
    private TextView phone;
    private TextView expect_time;
    private TextView position;
    private TextView equipment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        initView();
    }

    private void initView(){
        mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        seid = getIntent().getIntExtra("seid",-1);

        newsPresenter = new NewsPresenter(this);
        newsPresenter.onCreate();
        newsPresenter.getNewsDetails(seid+"");

        company1 = findViewById(R.id.company_1);
        company2 = findViewById(R.id.company_2);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        phone = findViewById(R.id.phone);
        expect_time = findViewById(R.id.expect_time);
        position = findViewById(R.id.position);
        equipment = findViewById(R.id.equipment);
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
    public void onSuccessDetails(ResultEntity<NewsDetailsEntity> newsDetails) {
        newsDetailsEntity = newsDetails.getResult();
        if (newsDetailsEntity.equals("")){
            company1.setText("无数据");
            company2.setText("无数据");
            name.setText("无数据");
            number.setText("无数据");
            phone.setText("无数据");
            expect_time.setText("无数据");
            position.setText("无数据");
            equipment.setText("无数据");
        }else{
            company1.setText(newsDetailsEntity.getCompany());
            company2.setText(newsDetailsEntity.getCompany());
            name.setText(newsDetailsEntity.getName());
            number.setText(newsDetailsEntity.getNumber());
            phone.setText(newsDetailsEntity.getPhone());
            expect_time.setText(newsDetailsEntity.getExpect_time());
            position.setText(newsDetailsEntity.getPosition());
            String equipmentStr = "";
            for (int i = 0; i < newsDetailsEntity.getEquipment().size(); i++) {
                equipmentStr += newsDetailsEntity.getEquipment().get(i).getCategories()+"\n";
            }
            equipment.setText(equipmentStr);
        }
    }

    @Override
    public void onSuccess(ResultEntity<NewsEntity> newsEntity) {

    }

    @Override
    public void onError() {
        Toast.makeText(this, "网络出错", Toast.LENGTH_SHORT).show();
    }
}
