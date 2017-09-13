package com.jiyun.vae.pandaapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jiyun.vae.pandaapp.global.MyApp;

import butterknife.ButterKnife;



public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLayoutId());
        MyApp.mContext=this;
        ButterKnife.bind(this);
        initView();
    }

    /**
     * Activity初始化View控件
     */
    protected abstract void initView();

    /**
     *   加载Activity的布局
     * @return Activity的布局ID
     */
    public abstract int getActivityLayoutId();


}
