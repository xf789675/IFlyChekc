package com.iflychekc.rn;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.iflychekc.rn.module.RNFaceCheckModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by melody on 26/08/2017.
 */

public class IFlyCheckPackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> list = new ArrayList<>();
    list.add(new RNFaceCheckModule(reactContext));
    return list;
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
