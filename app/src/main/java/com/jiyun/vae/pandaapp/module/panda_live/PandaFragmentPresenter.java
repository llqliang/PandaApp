package com.jiyun.vae.pandaapp.module.panda_live;


import com.jiyun.vae.pandaapp.model.PandaChannelModelImp;
import com.jiyun.vae.pandaapp.model.bean.LiveChinaBean;
import com.jiyun.vae.pandaapp.network.MyCallBack;

 // 熊猫直播 P层  获取Model层的数据，并将数据交给View层更新UI


public class PandaFragmentPresenter implements PandaLiveContract.PandaLivePresenter {
    private PandaLiveContract.PandaLiveView mPandaLiveView;
    private PandaChannelModelImp mPandaChannelModelImp;

    public PandaFragmentPresenter(PandaLiveContract.PandaLiveView pandaLiveView) {
        this.mPandaLiveView = pandaLiveView;
        mPandaChannelModelImp = new PandaChannelModelImp();
        //实例化PandaLiveContract中的Presenter的
        mPandaLiveView.setPresenter(this);
    }




    @Override
    public void start() {
        mPandaChannelModelImp.getLiveData(new MyCallBack<LiveChinaBean>() {
            @Override
            public void onSuccess(LiveChinaBean liveChinaBean) {
            //TODO 交给View层更新UI

            }


            @Override
            public void onFaile(String msg) {

            }
        });

    }
}
