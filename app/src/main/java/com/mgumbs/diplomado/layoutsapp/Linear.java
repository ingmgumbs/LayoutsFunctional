package com.mgumbs.diplomado.layoutsapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Linear extends AppCompatActivity {

    public static final String NOTIFICATION_CHANNEL_ID = "2828";
    public static final String NOTIFICATION_CHANNEL_NAME = "ANotification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    public void doNotify(View view) {


        CharSequence channelname = NOTIFICATION_CHANNEL_NAME;
        int importance = NotificationManager.IMPORTANCE_LOW;
        NotificationChannel nChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, importance);
        nChannel.enableLights(true);
        nChannel.setLightColor(Color.RED);
        nChannel.enableVibration(true);


        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this,NOTIFICATION_CHANNEL_ID);
        nBuilder.setSmallIcon(R.drawable.android);
        nBuilder.setContentTitle("Notification Allert!!");
        nBuilder.setContentText("Notification From Linear Vertical Layout");

        NotificationManager nManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nManager.createNotificationChannel(nChannel);
        nManager.notify(0,nBuilder.build());

    }
}
