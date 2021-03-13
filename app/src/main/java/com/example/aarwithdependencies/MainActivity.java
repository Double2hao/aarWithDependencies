package com.example.aarwithdependencies;

import android.app.Activity;
import android.os.Bundle;

import com.example.mavenproject.MavenProjectTestClass;
import com.squareup.okhttp.OkHttpClient;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MavenProjectTestClass.test();
    OkHttpClient okHttpClient;//build.gradle中没有okhttp，但是实际上依赖了
  }
}