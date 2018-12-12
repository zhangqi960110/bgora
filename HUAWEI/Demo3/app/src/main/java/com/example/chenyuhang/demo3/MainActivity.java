package com.example.chenyuhang.demo3;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.Poi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private LocationService locationService;
	private Button startSign;
	//此处设置签到地经度纬度，可从数据库提取
	private double lat = 28.144549;
	private double lon = 112.99555;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location);
		startSign = (Button) findViewById(R.id.sign);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		// -----------location config ------------
		locationService = ((LocationApplication) getApplication()).locationService;
		//获取locationservice实例，建议应用中只初始化1个location实例，然后使用，可以参考其他示例的activity，都是通过此种方式获取locationservice实例的
		locationService.registerListener(mListener);
		//注册监听
		int type = getIntent().getIntExtra("from", 0);
		if (type == 0) {
			locationService.setLocationOption(locationService.getDefaultLocationClientOption());
		} else if (type == 1) {
			locationService.setLocationOption(locationService.getOption());
		}
		startSign.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				locationService.start();// 定位SDK
			}
		});
	}

	/*****
	 *
	 * 定位结果回调，重写onReceiveLocation方法，可以直接拷贝如下代码到自己工程中修改
	 *
	 */
	private BDAbstractLocationListener mListener = new BDAbstractLocationListener() {

		@Override
		public void onReceiveLocation(BDLocation location) {
			// TODO Auto-generated method stub
			if (null != location && location.getLocType() != BDLocation.TypeServerError) {
				//可通过修改0.002修改精度
				if(Math.abs(location.getLatitude()-lat)<0.002&&Math.abs(location.getLongitude()-lon)<0.002){
					Toast.makeText(getApplicationContext(),"签到成功",Toast.LENGTH_LONG).show();
				}else{
					Toast.makeText(getApplicationContext(),"未到指定地点，签到失败",Toast.LENGTH_LONG).show();
				}
				locationService.stop();
			}
		}

	};



}
