package com.team.ap.app.commons;

import com.umeng.socialize.PlatformConfig;

import android.app.Application;

/**
 * Created by CHIN on 16/04/08.
 */
public class AppConfig extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
	}

	// ����ƽ̨�����ã��������ȫ��Application���߳������
	{
		// ΢�� wx12342956d1cab4f9,a5ae111de7d9ea137e88a5e02c07c94d
		PlatformConfig.setWeixin("wx967daebe835fbeac","5bb696d9ccd75a38c8a0bfe0675559b3");
		// ����΢��
		PlatformConfig.setSinaWeibo("3921700954","04b48b094faeb16683c32669824ebdad");
		// QQ�ռ�
		PlatformConfig.setQQZone("100424468","c7394704798a158208a74ab60104f0ba");
	}
}
