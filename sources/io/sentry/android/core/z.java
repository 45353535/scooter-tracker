package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.g7;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f82814a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82815a;

        static {
            int[] iArr = new int[g7.values().length];
            f82815a = iArr;
            try {
                iArr[g7.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82815a[g7.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82815a[g7.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82815a[g7.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82815a[g7.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public z() {
        this("Sentry");
    }

    private int e(g7 g7Var) {
        int i10 = a.f82815a[g7Var.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public void a(g7 g7Var, String str, Throwable th2) {
        int i10 = a.f82815a[g7Var.ordinal()];
        if (i10 == 1) {
            Log.i(this.f82814a, str, th2);
            return;
        }
        if (i10 == 2) {
            Log.w(this.f82814a, str, th2);
            return;
        }
        if (i10 == 3) {
            Log.e(this.f82814a, str, th2);
        } else if (i10 != 4) {
            Log.d(this.f82814a, str, th2);
        } else {
            Log.wtf(this.f82814a, str, th2);
        }
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
            Log.println(e(g7Var), this.f82814a, str);
        } else {
            Log.println(e(g7Var), this.f82814a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(g7 g7Var) {
        return true;
    }

    public z(String str) {
        this.f82814a = str;
    }
}
