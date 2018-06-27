package com.example.day02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Day2Activity extends AppCompatActivity {
    int[] images=new int[]{R.drawable.kongxin,R.drawable.sangang,R.drawable.shixin};
    int currentImg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        LinearLayout linearLayout= (LinearLayout) findViewById(R.id.root);
        final ImageView imageView=new ImageView(this);
        linearLayout.addView(imageView);
        imageView.setImageResource(images[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[++currentImg % images.length]);//设置轮播--%的作用是等三张图片轮完后长度到四取模等于0则又回到第一张
            }
        });
    }
}
