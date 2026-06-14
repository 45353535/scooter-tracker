package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes9.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Logger f31955c = new Logger(TAG);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31957b = 4;

    public Logger(String str) {
        this.f31956a = str;
    }

    private boolean a(int i10) {
        return this.f31957b <= i10 || Log.isLoggable(this.f31956a, i10);
    }

    public static Logger getLogger() {
        return f31955c;
    }

    public void d(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f31956a, str, th2);
        }
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f31956a, str, th2);
        }
    }

    public void i(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f31956a, str, th2);
        }
    }

    public void log(int i10, String str) {
        log(i10, str, false);
    }

    public void v(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f31956a, str, th2);
        }
    }

    public void w(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f31956a, str, th2);
        }
    }

    public void log(int i10, String str, boolean z10) {
        if (z10 || a(i10)) {
            Log.println(i10, this.f31956a, str);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }
}
