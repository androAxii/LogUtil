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

    public static void e(String msg) {

        Log.d(TAG, "e msg: " + msg);
    }

    public static void v(String msg) {

        Log.v(TAG, "d msg: " + msg);
    }

    public static void i(String msg) {

        Log.i(TAG, "d msg: " + msg);
    }

    public static void w(String msg) {

        Log.w(TAG, "d msg: " + msg);
    }

}
