package com.mingrisoft.toolbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class AboutActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);//加载关于布局

}

	public void onBack(View v) {
		AboutActivity.this.finish();//关闭关于页面
	}
}
