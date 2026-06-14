package net.pubnative.lite.sdk.mraid.internal;

import android.util.Log;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes3.dex */
public class MRAIDLog {
    private static LOG_LEVEL LEVEL = LOG_LEVEL.warning;
    private static final String TAG = "HyBid-MRAID";

    public enum LOG_LEVEL {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);

        private final int value;

        LOG_LEVEL(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void d(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue()) {
            Log.d(TAG, str);
        }
    }

    public static void e(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue()) {
            Log.e(TAG, str);
        }
    }

    public static LOG_LEVEL getLoggingLevel() {
        return LEVEL;
    }

    public static void i(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue()) {
            Log.i(TAG, str);
        }
    }

    public static void setLoggingLevel(LOG_LEVEL log_level) {
        Log.i(TAG, "Changing logging level from :" + LEVEL + ". To:" + log_level);
        LEVEL = log_level;
    }

    public static void v(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.verbose.getValue()) {
            Log.v(TAG, str);
        }
    }

    public static void w(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue()) {
            Log.w(TAG, str);
        }
    }

    public static void d(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue()) {
            Log.d(TAG, C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void e(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue()) {
            Log.e(TAG, C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void i(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue()) {
            Log.i(TAG, C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void v(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.verbose.getValue()) {
            Log.v(TAG, C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void w(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue()) {
            Log.w(TAG, C4240b4.j.f42672d + str + "] " + str2);
        }
    }
}
