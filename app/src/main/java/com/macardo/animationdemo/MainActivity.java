package com.macardo.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button translateBtn;
    private Button scaleBTn;
    private Button rotateBtn;
    private Button alphaBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.创建需要动画效果的视图View
        translateBtn = findViewById(R.id.translateBtn);
        //2.创建 平移动画对象 传入动画效果xml文件
        Animation translateAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animation);
        //3.在视图View中播放动画
        translateBtn.setAnimation(translateAnimation);
        translateBtn.setOnClickListener(this);

/*        //缩放
        scaleBTn = findViewById(R.id.scaleBtn);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        scaleBTn.setAnimation(scaleAnimation);*/

/*        //旋转
        rotateBtn = findViewById(R.id.rotateBtn);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        rotateBtn.setAnimation(rotateAnimation);*/

        //透明度
        alphaBtn = findViewById(R.id.alphaBtn);
        Animation alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        alphaBtn.setAnimation(alphaAnimation);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.translateBtn:
                Animation translateAnimation = new TranslateAnimation(0,500,0,500);
                translateAnimation.setDuration(3000);
                translateAnimation.setFillAfter(true);
                translateAnimation.setFillEnabled(true);
                translateAnimation.setFillBefore(true);
                translateAnimation.setRepeatMode(Animation.REVERSE);
                translateAnimation.setRepeatCount(3);
                translateBtn.startAnimation(translateAnimation);
                break;
            default:
                break;
        }
    }
}
