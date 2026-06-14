package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.g7;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f82603g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f82604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f82605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f82606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f82607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f82608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runtime f82609f;

    public u(Context context, w0 w0Var, ILogger iLogger) {
        this(context, w0Var, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        String strA = this.f82605b.a();
        return strA != null && strA.contains("test-keys");
    }

    private boolean b() {
        for (String str : this.f82607d) {
            try {
            } catch (RuntimeException e10) {
                this.f82606c.b(g7.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[DONT_GENERATE, PHI: r2
  0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c() {
        /*
            r6 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r6.f82609f     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.lang.Process r2 = r3.exec(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.InputStream r4 = r2.getInputStream()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.nio.charset.Charset r5 = io.sentry.android.core.internal.util.u.f82603g     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = r1
        L29:
            r0.close()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r2.destroy()
            return r3
        L30:
            r0 = move-exception
            goto L3c
        L32:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
        L3b:
            throw r3     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
        L3c:
            io.sentry.ILogger r3 = r6.f82606c     // Catch: java.lang.Throwable -> L4b
            io.sentry.g7 r4 = io.sentry.g7.DEBUG     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L5b
        L47:
            r2.destroy()
            goto L5b
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            io.sentry.ILogger r0 = r6.f82606c     // Catch: java.lang.Throwable -> L4b
            io.sentry.g7 r3 = io.sentry.g7.DEBUG     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4b
            r0.c(r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L5b
            goto L47
        L5b:
            return r1
        L5c:
            if (r2 == 0) goto L61
            r2.destroy()
        L61:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.u.c():boolean");
    }

    private boolean d(ILogger iLogger) {
        w0 w0Var = new w0(iLogger);
        PackageManager packageManager = this.f82604a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f82608e) {
                try {
                    if (w0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f82606c);
    }

    u(Context context, w0 w0Var, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f82604a = (Context) io.sentry.util.w.c(context, "The application context is required.");
        this.f82605b = (w0) io.sentry.util.w.c(w0Var, "The BuildInfoProvider is required.");
        this.f82606c = (ILogger) io.sentry.util.w.c(iLogger, "The Logger is required.");
        this.f82607d = (String[]) io.sentry.util.w.c(strArr, "The root Files are required.");
        this.f82608e = (String[]) io.sentry.util.w.c(strArr2, "The root packages are required.");
        this.f82609f = (Runtime) io.sentry.util.w.c(runtime, "The Runtime is required.");
    }
}
