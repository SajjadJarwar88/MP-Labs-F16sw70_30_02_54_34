package com.example.sajja.lab5_task2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements SensorEventListener
{
    ImageView imageView;
    Sensor sensor;
    SensorManager sensorManager;
    float x;
    int [] images={R.drawable.nature,R.drawable.sample1,R.drawable.sample2,R.drawable.sample3,
            R.drawable.sample4,R.drawable.sample5,R.drawable.sample6,R.drawable.sample9,R.drawable.sample10};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.image);
        sensorManager= (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor=sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if(sensor == null)
            finish();
    }

    public void onResume()
    {
        super.onResume();
        sensorManager.registerListener( this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
    public void onPause()
    {
        super.onPause();
        sensorManager.unregisterListener( this);
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.sensor.getType()==Sensor.TYPE_GYROSCOPE)
        {

            x = event.values[0];

            if(x>0.5f)
            {
                onRotate0();
            }
            if(x>-0.5f)
            {
                onRotate1();
            }
            if(x>0f)
            {
                onRotate2();
            }
        }
    }

    public void onRotate0()
    {
        imageView.setImageResource(images[0]);
    }
    public void onRotate1()
    {
        imageView.setImageResource(images[1]);
    }
    public void onRotate2()
    {
        imageView.setImageResource(images[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {

    }


}


