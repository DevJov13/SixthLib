package dev.joven.sixthlib;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SixthNotif extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String title = intent.getStringExtra("title");
        String message = intent.getStringExtra("message");

        //Log.i("mgdNotification", "Received Notification: " + title + " - " + message);

        Toast.makeText(context, "Received Notification: " + title + " - " + message, Toast.LENGTH_SHORT).show();
    }
}