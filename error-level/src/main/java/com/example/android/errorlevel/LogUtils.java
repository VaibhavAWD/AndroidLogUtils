package com.example.android.errorlevel;

import android.util.Log;

/**
 * This class is used to error level log messages
 */

public class LogUtils {

    private static final String LOG_TAG = "Error-Level";

    public static final void e(String message) {
        Log.e(LOG_TAG, message);
    }
}
