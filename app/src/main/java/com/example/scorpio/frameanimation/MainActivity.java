package com.example.scorpio.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        //把xml文件的动画资源设置为iv背景
        iv.setBackgroundResource(R.drawable.girl);
        //获取设置的动画资源，执行可能需要花费一定的时间
        mAnimationDrawable = (AnimationDrawable) iv.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            mAnimationDrawable.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}
