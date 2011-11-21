package com.mariuszlusiak.phonegap.plugin;

import org.json.JSONArray;
import android.util.Log;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import com.phonegap.api.PluginResult.Status;

public class StatusBarNotificationPlugin extends Plugin {
  public static final String ACTION = "publish";
  private static final int HELLO_ID = 1;

  @Override
  public PluginResult execute(String action, JSONArray data, String callbackId) {
    Log.d("StatusBarNotificationPlugin", "Plugin Called v2");
    String ns = Context.NOTIFICATION_SERVICE;
	NotificationManager mNotificationManager = (NotificationManager) this.ctx.getSystemService(ns);

	int icon = android.R.drawable.btn_star_big_on;
	CharSequence tickerText = "Hello";
	long when = System.currentTimeMillis();
	Notification notification = new Notification(icon, tickerText, when);

	CharSequence contentTitle = "My notification";
	CharSequence contentText = "Hello World!";
	Intent notificationIntent = new Intent(this.ctx, StatusBarNotificationPlugin.class);
	PendingIntent contentIntent = PendingIntent.getActivity(this.ctx, 0, notificationIntent, 0);

	notification.setLatestEventInfo(this.ctx, contentTitle, contentText, contentIntent);

	mNotificationManager.notify(HELLO_ID, notification);

    return new PluginResult(Status.OK);
  }
}