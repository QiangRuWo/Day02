package com.example.day02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 科大-光华 on 2018/4/3.
 */

public class DrawView extends View {
    public float currentX=40;
    public float currentY=50;
    Paint p=new Paint();//画笔对象

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }


    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       currentX=event.getX();
        currentY=event.getY();
        invalidate();
        return true;
    }
}
