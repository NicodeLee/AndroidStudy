package com.nicodelee.daemonservice.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import com.nicodelee.daemonservice.MainActivity;
import com.nicodelee.daemonservice.R;

/**
 * Created by NocodeLee on 16/11/1.
 * Email：lirizhilirizhi@163.com
 */

public class WhiteService extends Service {

  private final static String TAG = WhiteService.class.getSimpleName();

  private final static int FOREGROUND_ID = 1000;

  @Override public void onCreate() {
    Log.d(TAG, "WhiteService->onCreate");
    super.onCreate();
  }

  @Override public int onStartCommand(Intent intent, int flags, int startId) {
    Log.i(TAG, "WhiteService->onStartCommand");
    showNotifica();
    return super.onStartCommand(intent, flags, startId);
  }

  private void showNotifica() {
    NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
    builder.setSmallIcon(R.mipmap.logo)
        .setContentTitle("Forground Im Running")
        .setContentText("Don't Close me")
        .setContentInfo("I'm fun")
        .setWhen(System.currentTimeMillis())
        .setContentIntent(PendingIntent.getActivity(this, 1, new Intent(this, MainActivity.class),
            PendingIntent.FLAG_UPDATE_CURRENT))
        .build();
    startForeground(FOREGROUND_ID, builder.build());
  }

  @Nullable @Override public IBinder onBind(Intent intent) {
    // TODO: Return the communication channel to the service.
    //?
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override public void onDestroy() {
    Log.i(TAG, "WhiteService->onDestroy");
    super.onDestroy();
  }
}
