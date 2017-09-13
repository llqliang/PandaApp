package com.jiyun.vae.pandaapp.module.panda_live;

import android.view.View;

import com.jiyun.vae.pandaapp.base.BaseFragment;


 // 熊猫直播模块的View层  需要通过P层处理逻辑并且获取数据


public class PandaLiveFragment extends BaseFragment implements PandaLiveContract.PandaLiveView {
  private PandaLiveContract.PandaLivePresenter  mPandaLivPresenter;


    @Override
    public void setPresenter(PandaLiveContract.PandaLivePresenter pandaLivePresenter) {
        mPandaLivPresenter=pandaLivePresenter;
    }

    @Override
    protected void initData() {
        mPandaLivPresenter.start();
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getFragmentLayoutId() {
        return 0;
    }
}
