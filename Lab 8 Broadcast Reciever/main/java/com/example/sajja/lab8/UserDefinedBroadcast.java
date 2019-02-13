package com.example.sajja.lab8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class UserDefinedBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction()=="com.example.sajja.broadcast_receivers.custominent")
        {
            Toast.makeText(context, "custom intent received", Toast.LENGTH_LONG).show();
        }

    }
}