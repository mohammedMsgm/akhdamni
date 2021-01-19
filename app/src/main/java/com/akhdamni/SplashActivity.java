package com.akhdamni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;


import java.util.Locale;

import gr.net.maroulis.library.EasySplashScreen;


public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()

                .withBackgroundResource(R.color.white)
                .withLogo(R.drawable.icon).withTargetActivity(MainActivity.class);
        config.getLogo().setPadding(20,20,20,20);
        config.withSplashTimeOut(3000);


        //config.getFooterTextView().setCompoundDrawablePadding(15);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }

}

