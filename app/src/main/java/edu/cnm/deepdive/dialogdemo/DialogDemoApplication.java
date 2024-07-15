package edu.cnm.deepdive.dialogdemo;

import android.app.Application;
import androidx.appcompat.app.AppCompatDelegate;

public class DialogDemoApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    // below is setting to have follow day/night mode based on what user has set on their device.
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
  }
}
