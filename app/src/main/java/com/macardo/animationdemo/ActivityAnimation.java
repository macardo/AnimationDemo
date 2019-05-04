package com.macardo.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAnimation.this,MainActivity.class);
                startActivity(intent);
                //淡入淡出效果
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
/*                //滑动效果
                overridePendingTransition(R.anim.out_to_left,R.anim.in_from_right);*/
            }
        });
    }

}
