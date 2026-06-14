package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f62060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f62061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f62062h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f62060f = (int) displayMetrics.density;
            f62059e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f62061g = (int) displayMetrics.xdpi;
            f62062h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f62055a = displayMetrics.widthPixels;
            f62056b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f62057c = mode.getPhysicalWidth();
            f62058d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f62059e + "[<!>]" + f62055a + StringUtils.COMMA + f62056b + "[<!>]" + f62057c + "x" + f62058d + "[<!>]";
    }
}
