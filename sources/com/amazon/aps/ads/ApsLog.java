package com.amazon.aps.ads;

import android.util.Log;
import com.amazon.aps.ads.model.ApsLogLevel;

/* JADX INFO: loaded from: classes5.dex */
public class ApsLog {
    private static String DEFAULT_TAG = "APSAndroidShared";
    static boolean isLoggable;
    private static ApsLogLevel logLevel = ApsLogLevel.Warn;

    static {
        initIsLoggable();
    }

    private ApsLog() {
    }

    public static void d(String str, String str2) {
        if (isOkToLog(ApsLogLevel.Debug)) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (isOkToLog(ApsLogLevel.Error)) {
            Log.e(str, str2);
        }
    }

    public static ApsLogLevel getLogLevel() {
        return logLevel;
    }

    public static void i(String str, String str2) {
        if (isOkToLog(ApsLogLevel.Info)) {
            Log.i(str, str2);
        }
    }

    static void initIsLoggable() {
        try {
            isLoggable = Log.isLoggable("test", 7);
        } catch (Throwable unused) {
            isLoggable = false;
        }
    }

    static boolean isOkToLog(ApsLogLevel apsLogLevel) {
        return isLoggable && (logLevel.getValue() <= apsLogLevel.getValue() && logLevel != ApsLogLevel.Off);
    }

    public static void setLogLevel(ApsLogLevel apsLogLevel) {
        logLevel = apsLogLevel;
    }

    public static void d(String str) {
        d(DEFAULT_TAG, str);
    }

    public static void e(String str) {
        e(DEFAULT_TAG, str);
    }

    public static void i(String str) {
        i(DEFAULT_TAG, str);
    }
}
