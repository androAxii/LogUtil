package logutilexample.com.logutil;

import android.util.Log;

/**
 * Created by Cosmic-i on 04-12-2017.
 */

public class LogDebug {

    private static final String TAG = "AWESOME APP";

    public static void d(String msg) {

        Log.d(TAG, "d msg: " + msg);
    }
}
