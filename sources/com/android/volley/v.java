package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f7588a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7589b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7590c = v.class.getName();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f7591c = v.f7589b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f7592a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7593b = false;

        /* JADX INFO: renamed from: com.android.volley.v$a$a, reason: collision with other inner class name */
        private static class C0160a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f7594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f7595b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f7596c;

            public C0160a(String str, long j10, long j11) {
                this.f7594a = str;
                this.f7595b = j10;
                this.f7596c = j11;
            }
        }

        a() {
        }

        private long c() {
            if (this.f7592a.size() == 0) {
                return 0L;
            }
            return ((C0160a) this.f7592a.get(r2.size() - 1)).f7596c - ((C0160a) this.f7592a.get(0)).f7596c;
        }

        public synchronized void a(String str, long j10) {
            if (this.f7593b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f7592a.add(new C0160a(str, j10, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f7593b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j10 = ((C0160a) this.f7592a.get(0)).f7596c;
            v.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0160a c0160a : this.f7592a) {
                long j11 = c0160a.f7596c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0160a.f7595b), c0160a.f7594a);
                j10 = j11;
            }
        }

        protected void finalize() {
            if (this.f7593b) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f7590c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f7588a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f7588a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f7588a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f7589b) {
            Log.v(f7588a, a(str, objArr));
        }
    }
}
