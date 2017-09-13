package com.jiyun.vae.pandaapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;




public abstract class BaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentLayoutId(), null);
        initView(view);
        initData();
        return view;
    }



    /**
     * Fragment初始化数据
     */
    protected abstract void initData();

    /**
     * Fragment初始化View控件
     *
     * @param view
     */
    protected abstract void initView(View view);

    /**
     * 加载的Fragment的布局
     *
     * @return
     */
    public abstract int getFragmentLayoutId();


}
