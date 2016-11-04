package com.nicodelee.daemonservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.nicodelee.daemonservice.service.WhiteService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView(){
    findViewById(R.id.btn_white).setOnClickListener(this);
    findViewById(R.id.btn_gray).setOnClickListener(this);
    findViewById(R.id.btn_black).setOnClickListener(this);
    findViewById(R.id.btn_background_service).setOnClickListener(this);
  }

  @Override public void onClick(View view) {
    switch (view.getId()){
      case R.id.btn_white:
        Intent whiteInten = new Intent(this,WhiteService.class);
        startService(whiteInten);
        break;
      case R.id.btn_gray:

        break;
      case R.id.btn_black:

        break;
      case R.id.btn_background_service:

        break;
    }
  }
}
