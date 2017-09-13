package com.jiyun.vae.pandaapp.model;


import com.jiyun.vae.pandaapp.contants.Urls;
import com.jiyun.vae.pandaapp.model.bean.LiveChinaBean;
import com.jiyun.vae.pandaapp.network.HttpFactory;
import com.jiyun.vae.pandaapp.network.MyCallBack;

import java.util.HashMap;
import java.util.Map;



public class PandaChannelModelImp implements PandaChannelModel {

//    @Override
//    public void getHomeData(MyCallBack<HomeDataBean> callBack) {
//        HttpFactory.create().get(Urls.HOMEURLALL, null, callBack);
//    }
//
//    @Override
//    public void getRollVideoData(MyCallBack<RollRollVideoBean> callBack) {
//        HttpFactory.create().get(Urls.ROLLVIDEO, null, callBack);
//
//    }
//
//    @Override
//    public void getLiveData(MyCallBack<LiveChinaBean> callBack) {
//        HttpFactory.create().get(Urls.LIVECHINAURL, null, callBack);
//    }
//
//
//    @Override
//    public void getPandaBroadData(String path, String primaryId, String serviceId, MyCallBack<PandaBroadBean> callBack) {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("path", path);
//        params.put("primaryId", primaryId);
//        params.put("serviceId", serviceId);
//        HttpFactory.create().get(Urls.PANDAREPORT, params, callBack);
//    }
//
//    @Override
//    public void getPandaBraodData(MyCallBack<PandaBroadTwoBean> callBack) {
//        HttpFactory.create().get(Urls.PANDAREPORTTWO, null, callBack);
//    }
//
//
//    @Override
//    public void getMultiData(MyCallBack<MultiBean> callBack) {
//        HttpFactory.create().get(Urls.MULITANGLE, null, callBack);
//    }
//
//    @Override
//    public void getHomeVideoData(MyCallBack<HomeVideoBean> callBack) {
//        HttpFactory.create().get(Urls.HOMEVIDEOURL, null, callBack);
//    }
//
//    @Override
//    public void getOriginalData(MyCallBack<OriginalBean> callback) {
//        HttpFactory.create().get(Urls.ORIGINAL, null, callback);
//    }
//
//    @Override
//    public void getBaDaLingData(MyCallBack<BaDaLingBean> callBack) {
//        HttpFactory.create().get(Urls.BADALING, null, callBack);
//    }
//
//
//    //TODO  可能有参数
//    @Override
//    public void getWinderfulData(MyCallBack<WinderfulBean> callBack) {
//        Map<String, String> pamrams = new HashMap<String, String>();
//        pamrams.put("", "");
//        pamrams.put("", "");
//        pamrams.put("", "");
//        HttpFactory.create().get(Urls.ORIGINALNEWS, pamrams, callBack);
//    }

}
