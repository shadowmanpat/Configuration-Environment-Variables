package com.nickagas.conenvar

import android.content.Context
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
}