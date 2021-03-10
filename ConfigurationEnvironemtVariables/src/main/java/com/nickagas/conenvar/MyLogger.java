package com.nickagas.conenvar;

import android.util.Log;

public class MyLogger {

    private  static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
