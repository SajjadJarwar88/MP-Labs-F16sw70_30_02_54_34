package com.example.sajja.lab5;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
     ViewPager viewPager;
     CustomSwipeAdapter adapter;
    private ImageView imageView;
    private float scale=1.0f;
    private ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.Img1);
        viewPager=findViewById(R.id.viewpager);
        adapter=new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

    }
    public boolean onTouchEvent(MotionEvent ev)
    {
        scaleGestureDetector.onTouchEvent(ev);
        return true;
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener
    {
        public boolean onScale(ScaleGestureDetector detector)
        {
            scale *=scaleGestureDetector.getScaleFactor();
            scale=Math.max(0.1f,Math.min(scale, 10.0f));
            imageView.setScaleX(scale);
            imageView.setScaleY(scale);

            return true;
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) 
        {
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector detector) 
        {

        }
    }
}
