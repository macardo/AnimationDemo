package com.macardo.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button translateBtn;
    private Button scaleBTn;
    private Button rotateBtn;
    private Button alphaBtn;
    private Button allBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        //1.创建需要动画效果的视图View
        translateBtn = findViewById(R.id.translateBtn);
        //2.创建 平移动画对象 传入动画效果xml文件
        Animation translateAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animation);
        //3.在视图View中播放动画
        translateBtn.setAnimation(translateAnimation);*/

/*        //缩放
        scaleBTn = findViewById(R.id.scaleBtn);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        scaleBTn.setAnimation(scaleAnimation);*/

/*        //旋转
        rotateBtn = findViewById(R.id.rotateBtn);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        rotateBtn.setAnimation(rotateAnimation);*/

/*        //透明度
        alphaBtn = findViewById(R.id.alphaBtn);
        Animation alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        alphaBtn.setAnimation(alphaAnimation);*/

/*        allBtn = findViewById(R.id.allBtn);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.all_animation);
        allBtn.setAnimation(animation);*/

/*        Button mButton = (Button) findViewById(R.id.allBtn);
        // 创建 需要设置动画的 视图View

        // 组合动画设置
        AnimationSet setAnimation = new AnimationSet(true);
        // 步骤1:创建组合动画对象(设置为true)


        // 步骤2:设置组合动画的属性
        // 特别说明以下情况
        // 因为在下面的旋转动画设置了无限循环(RepeatCount = INFINITE)
        // 所以动画不会结束，而是无限循环
        // 所以组合动画的下面两行设置是无效的
        setAnimation.setRepeatMode(Animation.RESTART);
        setAnimation.setRepeatCount(1);// 设置了循环一次,但无效

        // 步骤3:逐个创建子动画(方式同单个动画创建方式,此处不作过多描述)

        // 子动画1:旋转动画
        Animation rotate = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotate.setDuration(1000);
        rotate.setRepeatMode(Animation.RESTART);
        rotate.setRepeatCount(Animation.INFINITE);

        // 子动画2:平移动画
        Animation translate = new TranslateAnimation(TranslateAnimation.RELATIVE_TO_PARENT,-0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.5f,
                TranslateAnimation.RELATIVE_TO_SELF,0
                ,TranslateAnimation.RELATIVE_TO_SELF,0);
        translate.setDuration(10000);

        // 子动画3:透明度动画
        Animation alpha = new AlphaAnimation(1,0);
        alpha.setDuration(3000);
        alpha.setStartOffset(7000);

        // 子动画4:缩放动画
        Animation scale1 = new ScaleAnimation(1,0.5f,1,0.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scale1.setDuration(1000);
        scale1.setStartOffset(4000);

        // 步骤4:将创建的子动画添加到组合动画里
        setAnimation.addAnimation(alpha);
        setAnimation.addAnimation(rotate);
        setAnimation.addAnimation(translate);
        setAnimation.addAnimation(scale1);

        mButton.startAnimation(setAnimation);
        // 步骤5:播放动画*/
    }

    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

}
