package com.nicodelee.animgo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button btnGo;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView(){

    //动画监听
    btnGo = (Button) findViewById(R.id.btn_go);
    btnGo.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(btnGo,"alpha",0f,1f);
        animator.setDuration(1000);
        //animator.addListener(new Animator.AnimatorListener() {
        //  @Override public void onAnimationStart(Animator animator) {
        //
        //  }
        //
        //  @Override public void onAnimationEnd(Animator animator) {
        //    Toast.makeText(MainActivity.this, "anim End", Toast.LENGTH_SHORT).show();
        //  }
        //
        //  @Override public void onAnimationCancel(Animator animator) {
        //
        //  }
        //
        //  @Override public void onAnimationRepeat(Animator animator) {
        //
        //  }
        //});

        animator.addListener(new AnimatorListenerAdapter() {
          @Override public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            Toast.makeText(MainActivity.this, "anim End", Toast.LENGTH_SHORT).show();
          }
        });
        animator.start();
      }
    });
  }
}
