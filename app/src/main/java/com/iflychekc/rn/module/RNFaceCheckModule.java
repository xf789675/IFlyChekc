package com.iflychekc.rn.module;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.iflychekc.rn.OnlineFaceDemo;

/**
 * Created by xufeng on 25/08/2017.
 */

public class RNFaceCheckModule extends ReactContextBaseJavaModule {
  public RNFaceCheckModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "FaceCheck";
  }

  @ReactMethod
  public void start() {
    final Activity currentActivity = this.getCurrentActivity();
    Intent intent = new Intent(currentActivity, OnlineFaceDemo.class);
    currentActivity.startActivity(intent);
  }
}
