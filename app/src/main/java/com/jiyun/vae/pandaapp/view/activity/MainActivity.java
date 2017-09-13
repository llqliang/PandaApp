package com.jiyun.vae.pandaapp.view.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jiyun.vae.pandaapp.R;

public class MainActivity extends AppCompatActivity {

    private ImageView start_loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        start_loading = (ImageView) findViewById(R.id.start_loading);

	}
}
