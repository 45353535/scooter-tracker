package com.adjust.sdk.purchase;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPLogger {
    private static String formatErrorMessage = "Error formatting log message: %s, with params: %s";
    private static ADJPLogger instance;
    private ADJPLogLevel logLevel;

    private ADJPLogger() {
        setLogLevel(ADJPLogLevel.INFO);
    }

    public static ADJPLogger getInstance() {
        if (instance == null) {
            instance = new ADJPLogger();
        }
        return instance;
    }

    public void Assert(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 7) {
            return;
        }
        try {
            Log.println(7, ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 3) {
            return;
        }
        try {
            Log.d(ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }

    public void error(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 6) {
            return;
        }
        try {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }

    public void info(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 4) {
            return;
        }
        try {
            Log.i(ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }

    public void setLogLevel(ADJPLogLevel aDJPLogLevel) {
        this.logLevel = aDJPLogLevel;
    }

    public void setLogLevelString(String str) {
        if (str == null) {
            return;
        }
        try {
            setLogLevel(ADJPLogLevel.valueOf(str.toUpperCase(Locale.US)));
        } catch (IllegalArgumentException unused) {
            error("Malformed logLevel '%s', falling back to 'info'", str);
        }
    }

    public void verbose(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 2) {
            return;
        }
        try {
            Log.v(ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.logLevel.getAndroidLogLevel() > 5) {
            return;
        }
        try {
            Log.w(ADJPConstants.TAG, String.format(Locale.US, str, objArr));
        } catch (Exception unused) {
            Log.e(ADJPConstants.TAG, String.format(Locale.US, formatErrorMessage, str, Arrays.toString(objArr)));
        }
    }
}
