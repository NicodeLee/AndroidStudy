package com.nicodelee.daemonservice.service;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by NocodeLee on 16/11/1.
 * Email：lirizhilirizhi@163.com
 */

public class WhiteService extends Service{

  private final static String TAG = WhiteService.class.getSimpleName();

  private final static int FOREGROUND_ID = 1000;

  @Override public void onCreate() {
    Log.d(TAG,"WhiteService->onCreate");
    super.onCreate();
  }

  @Override public int onStartCommand(Intent intent, int flags, int startId) {
    Log.i(TAG,"WhiteService->onStartCommand");

    return super.onStartCommand(intent, flags, startId);  }


  @Nullable @Override public IBinder onBind(Intent intent) {
    // TODO: Return the communication channel to the service.
    //?
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public void onDestroy() {
    Log.i(TAG, "WhiteService->onDestroy");
    super.onDestroy();
  }

}
