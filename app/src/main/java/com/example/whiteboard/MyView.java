package com.example.whiteboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {


    Paint paint;
    Path path;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        path = new Path();

        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4f);
        
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       canvas.drawPath(path,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float xPosition = event.getX();
        float yPosition = event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(xPosition, yPosition);
                return true;

                case MotionEvent.ACTION_MOVE:
                    path.lineTo(xPosition, yPosition);
                    break;

                    case MotionEvent.ACTION_UP:
                        break;

            default:
                return false;
        }
        invalidate();
        return true;




        //return super.onTouchEvent(event);
    }
}

