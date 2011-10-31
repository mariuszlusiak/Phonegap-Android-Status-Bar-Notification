package com.mariuszlusiak.phonegap.plugin;

import org.json.JSONArray;
import android.util.Log;
import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import com.phonegap.api.PluginResult.Status;

public class StatusBarNotificationPlugin extends Plugin {
  public static final String ACTION = "publish";

  @Override
  public PluginResult execute(String action, JSONArray data, String callbackId) {
    Log.d("StatusBarNotificationPlugin", "Plugin Called");
    return new PluginResult(Status.OK);
  }
}