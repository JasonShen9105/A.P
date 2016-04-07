package com.team.ap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class APActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 初期加载时不显示title
		requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}