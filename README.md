# Android Status Bar Notifications Plugin for Phonegap

## Compilation:

javac -d . -classpath <path_to_your>/android.jar:<path_to_your>phonegap.jar com/mariuszlusiak/phonegap/plugin/StatusBarNotificationPlugin.java

jar -cvf phonegap-status-bar-notification.jar com/mariuszlusiak/phonegap/plugin/*.class

## Installation:

copy the jar to the project

copy the js files to the project
<script type="text/javascript" charset="utf-8" src="phonegap-status-bar-notification.js"></script>

<plugins>
<plugin name="StatusBarNotificationPlugin" value="com.mariuszlusiak.phonegap.plugin.StatusBarNotificationPlugin" />
</plugins>