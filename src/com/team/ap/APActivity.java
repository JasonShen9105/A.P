package com.team.ap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
public class APActivity extends Activity {
	//private UMSocialService mController = UMServiceFactory.getUMSocialService("com.open.share");
    /** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
		// ���ڼ���ʱ����ʾtitle
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
    }
}