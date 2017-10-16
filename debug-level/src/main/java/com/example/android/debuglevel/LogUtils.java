package com.example.android.debuglevel;

import android.util.Log;

/**
 * This class logs debug level messages.
 */

public class LogUtils {

    private static final String LOG_TAG = "Debug-Level";

    public static final void d(String message) {
        Log.d(LOG_TAG, message);
    }

}
