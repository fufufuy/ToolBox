package com.mingrisoft.toolbox;


import com.mingrisoft.toolbox.view.RulerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class RuleActivity extends Activity {
	private DisplayMetrics dm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//保持屏幕不变黑  
		setContentView(R.layout.activity_rule);
		//获取屏幕信息
        dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		//初始化尺子
		RulerView rulerView1 = new RulerView(this, dm);
		//获取布局
		RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.main_layout);
		//相对布局中添加尺子布局
		relativeLayout.addView(rulerView1);	
	}
}
