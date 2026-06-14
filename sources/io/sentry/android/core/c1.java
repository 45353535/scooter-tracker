package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.android.core.util.a;
import io.sentry.g7;
import io.sentry.v7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f82380a = new io.sentry.android.core.util.a(new a.InterfaceC0992a() { // from class: io.sentry.android.core.x0
        @Override // io.sentry.android.core.util.a.InterfaceC0992a
        public final Object a(Context context) {
            return c1.d(context);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f82381b = new io.sentry.android.core.util.a(new a.InterfaceC0992a() { // from class: io.sentry.android.core.y0
        @Override // io.sentry.android.core.util.a.InterfaceC0992a
        public final Object a(Context context) {
            return c1.b(context);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f82382c = new io.sentry.android.core.util.a(new a.InterfaceC0992a() { // from class: io.sentry.android.core.z0
        @Override // io.sentry.android.core.util.a.InterfaceC0992a
        public final Object a(Context context) {
            return c1.a(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f82383d = new io.sentry.android.core.util.a(new a.InterfaceC0992a() { // from class: io.sentry.android.core.a1
        @Override // io.sentry.android.core.util.a.InterfaceC0992a
        public final Object a(Context context) {
            return c1.c(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f82384e = new io.sentry.android.core.util.a(new a.InterfaceC0992a() { // from class: io.sentry.android.core.b1
        @Override // io.sentry.android.core.util.a.InterfaceC0992a
        public final Object a(Context context) {
            return c1.e(context);
        }
    });

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f82385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f82386b;

        public a(boolean z10, String str) {
            this.f82385a = z10;
            this.f82386b = str;
        }

        public Map a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f82385a));
            String str = this.f82386b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f82387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f82388b;

        public b(boolean z10, String[] strArr) {
            this.f82387a = z10;
            this.f82388b = strArr;
        }

        public String[] a() {
            return this.f82388b;
        }

        public boolean b() {
            return this.f82387a;
        }
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    static ApplicationInfo g(Context context, w0 w0Var) {
        return w0Var.d() >= 33 ? (ApplicationInfo) f82383d.a(context) : (ApplicationInfo) f82384e.a(context);
    }

    static String h(Context context) {
        return (String) f82382c.a(context);
    }

    static String[] i() {
        return Build.SUPPORTED_ABIS;
    }

    static DisplayMetrics j(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    static String k(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    static String l(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e10) {
            iLogger.a(g7.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    static ActivityManager.MemoryInfo m(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(g7.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    static PackageInfo n(Context context, int i10, ILogger iLogger, w0 w0Var) {
        try {
            return w0Var.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i10)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    static PackageInfo o(Context context, w0 w0Var) {
        return w0Var.d() >= 33 ? (PackageInfo) f82380a.a(context) : (PackageInfo) f82381b.a(context);
    }

    static String p(PackageInfo packageInfo, w0 w0Var) {
        return w0Var.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : q(packageInfo);
    }

    private static String q(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean r() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Intent s(Context context, v7 v7Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return t(context, new w0(v7Var.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    static Intent t(Context context, w0 w0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return w0Var.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    static a u(Context context, ILogger iLogger, w0 w0Var) {
        String str;
        try {
            PackageInfo packageInfoO = o(context, w0Var);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoO != null && packageManager != null) {
                str = packageInfoO.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(g7.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static b v(Context context, w0 w0Var) {
        Bundle bundle;
        ApplicationInfo applicationInfoG = g(context, w0Var);
        PackageInfo packageInfoO = o(context, w0Var);
        if (packageInfoO == null) {
            return null;
        }
        return new b((applicationInfoG == null || (bundle = applicationInfoG.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoO.splitNames);
    }

    static void w(PackageInfo packageInfo, w0 w0Var, l1 l1Var, io.sentry.protocol.a aVar) {
        aVar.n(packageInfo.packageName);
        aVar.q(packageInfo.versionName);
        aVar.m(p(packageInfo, w0Var));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        aVar.s(map);
        if (l1Var != null) {
            try {
                b bVarO = l1Var.o();
                if (bVarO != null) {
                    aVar.t(Boolean.valueOf(bVarO.b()));
                    if (bVarO.a() != null) {
                        aVar.u(Arrays.asList(bVarO.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
