package com.yeohe.myumsdemo;

import android.app.Application;
import android.support.multidex.MultiDexApplication;
import android.util.Config;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by Administrator on 2017/12/19.
 */

public class AppApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        //设置LOG开关，默认为false

        UMConfigure.setLogEnabled(true);
        //初始化组件化基础库, 统计SDK/推送SDK/分享SDK都必须调用此初始化接口
        UMConfigure.init(this, "5a30e6dab27b0a13fc00000e", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,null);

    }


}
