package com.jiyun.vae.pandaapp.network;


public interface MyCallBack<T> {
    void onSuccess(T t);
    void onFaile(String msg);
}
