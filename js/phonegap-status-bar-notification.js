var StatusBarNotification = function() { };

StatusBarNotification.prototype.publish = function() {
  return PhoneGap.exec(
    function() { },
    function() { },
    "StatusBarNotificationPlugin",
    "publish",
    []
  );
};

PhoneGap.addConstructor(function() {
  PhoneGap.addPlugin("StatusBarNotification", new StatusBarNotification());
});