package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.g7;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f82809a;

    public y() {
        this("Sentry");
    }

    private int e(g7 g7Var) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public void a(g7 g7Var, String str, Throwable th2) {
        Log.wtf(this.f82809a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(g7 g7Var, Throwable th2, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            a(g7Var, str, th2);
        } else {
            a(g7Var, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void c(g7 g7Var, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(g7Var), this.f82809a, str);
        } else {
            Log.println(e(g7Var), this.f82809a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(g7 g7Var) {
        return true;
    }

    public y(String str) {
        this.f82809a = str;
    }
}
