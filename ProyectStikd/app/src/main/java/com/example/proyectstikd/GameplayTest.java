package com.example.proyectstikd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

public class GameplayTest extends SurfaceView implements SurfaceHolder.Callback{
    private SurfaceHolder surfaceHolder;
    private Context context;
    private firstThread physics;
    private int screenWidth = 1;
    private int screenHeight = 1;



    public GameplayTest(Context context) {
        super(context);

        this.surfaceHolder = getHolder();
        this.surfaceHolder.addCallback(this);
        this.context = context;
        physics = new firstThread();
        setFocusable(true);
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getRealMetrics(dm);
        screenWidth = dm.widthPixels;
        screenHeight = dm.heightPixels;
    }

    public void updatePhysics(){

    }

    public void drawIt(Canvas c) {
        try{
            c.drawRect(new Rect(),null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder){
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        //screenWidth = width;
        //screenHeight = height;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
