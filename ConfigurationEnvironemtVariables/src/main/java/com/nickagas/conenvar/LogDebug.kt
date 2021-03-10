package com.nickagas.conenvar

import android.util.Log

val myname = "NIKOS"
class LogDebug {

    private val TAG = "SUPER_AWESOME_APP"

    public fun d(message: String){
        Log.d(TAG, message)
    }


}