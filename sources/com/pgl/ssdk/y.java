package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f62187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f62188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f62189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f62190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f62191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f62192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f62193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f62194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f62195i;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f62197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f62198c;

        a(String str, Context context, int i10) {
            this.f62196a = str;
            this.f62197b = context;
            this.f62198c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.f62193g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f62196a);
            }
            InputManager inputManagerB = y.b(this.f62197b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f62198c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    static /* synthetic */ int b() {
        int i10 = f62189c;
        f62189c = i10 + 1;
        return i10;
    }

    static /* synthetic */ int c() {
        int i10 = f62192f;
        f62192f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int d() {
        int i10 = f62187a;
        f62187a = i10 + 1;
        return i10;
    }

    static /* synthetic */ int e() {
        int i10 = f62190d;
        f62190d = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f() {
        int i10 = f62188b;
        f62188b = i10 + 1;
        return i10;
    }

    static /* synthetic */ int g() {
        int i10 = f62191e;
        f62191e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f62194h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f62192f = sharedPreferencesA.getInt("nihc", 0);
                f62191e = sharedPreferencesA.getInt("eihc", 0);
                f62190d = sharedPreferencesA.getInt("vihc", 0);
                f62194h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.getClass();
        switch (str) {
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.view.MotionEvent r2, android.content.Context r3) {
        /*
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L4f
            boolean r0 = com.pgl.ssdk.y.f62193g
            if (r0 == 0) goto L42
            r0 = 0
            int r0 = r2.getToolType(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            r1 = 2
            if (r0 != r1) goto L42
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "android.view.InputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$WindowInputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$InputStage"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            int r2 = r2.getDeviceId()
            com.pgl.ssdk.y$a r1 = new com.pgl.ssdk.y$a
            r1.<init>(r0, r3, r2)
            com.pgl.ssdk.ar.b(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.a(android.view.MotionEvent, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f62195i == null) {
            f62195i = (InputManager) context.getSystemService("input");
        }
        return f62195i;
    }
}
