package net.pubnative.lite.sdk.utils;

import android.util.Log;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    private static final String TAG = "HyBid";
    private static Level sLogLevel = Level.info;

    public enum Level {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);

        private final int mValue;

        Level(int i10) {
            this.mValue = i10;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void setLogLevel(Level level) {
        sLogLevel = level;
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th2) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.debug.getValue()) {
            return;
        }
        Log.d("HyBid", C4240b4.j.f42672d + str + "] " + str2, th2);
    }

    public static void e(String str, String str2, Throwable th2) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.error.getValue()) {
            return;
        }
        Log.e("HyBid", C4240b4.j.f42672d + str + "] " + str2, th2);
    }

    public static void w(String str, String str2, Throwable th2) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.warning.getValue()) {
            return;
        }
        Log.w("HyBid", C4240b4.j.f42672d + str + "] " + str2, th2);
    }
}
