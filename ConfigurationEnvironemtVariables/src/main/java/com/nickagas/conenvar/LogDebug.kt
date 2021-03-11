package com.nickagas.conenvar

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat

val myname = "NIKOS"
class LogDebug {

    private val TAG = "SUPER_AWESOME_APP"

    public fun d(message: String){
        Log.d(TAG, message)
    }


}

object AwesomeToast {
    private val TAG = "SUPER_AWESOME_APP"

    public fun d(message: String){
        Log.d(TAG, message)
    }

    fun start( context : Context){
        var builder = NotificationCompat.Builder(context, TAG)
//            .setSmallIcon(R.drawable.notification_icon)
            .setContentTitle("My Awesome Title")
            .setContentText("textContent")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }


    //createChannel must be called on init
    //    createChannel(
    //            getString(R.string.egg_notification_channel_id),
    //            getString(R.string.egg_notification_channel_name)
    //        )
    private fun createChannel(context : Context, channelId: String, channelName: String) {
        // TODO: Step 1.6 START create a channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(
                channelId,
                channelName,
                // TODO: Step 2.4 change importance
                NotificationManager.IMPORTANCE_HIGH
            )// TODO: Step 2.6 disable badges for this channel
                .apply {
                    setShowBadge(false)
                }

            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.enableVibration(true)
//            notificationChannel.description = getString(R.string.breakfast_notification_channel_description)
            notificationChannel.description = "This is a nice description"

            // val notificationManager = requireActivity().getSystemService(
            //                NotificationManager::class.java
            //            )
            val notificationManager = context.getSystemService(
                NotificationManager::class.java
            )
            notificationManager.createNotificationChannel(notificationChannel)

        }
        // TODO: Step 1.6 END create a channel
    }



}