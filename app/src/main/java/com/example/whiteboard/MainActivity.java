package com.example.whiteboard;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

public class MainActivity extends AppCompatActivity {

    MyView myCanvas;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        myCanvas = new MyView(this, null);
        setContentView(myCanvas);

        //setContentView(R.layout.activity_main);



    }
}