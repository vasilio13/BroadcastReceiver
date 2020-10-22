package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class PowerDisconnectedReceiver extends BroadcastReceiver {
    //private static final String TAG = "StartupReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
       // Log.i(TAG,"Received broadcast intent: " + intent.getAction());
        Toast.makeText(context, "Power Disconnected",
                Toast.LENGTH_LONG).show();
    }


}
