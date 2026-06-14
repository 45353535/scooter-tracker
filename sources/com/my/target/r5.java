package com.my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Integer f60716a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f60717b;

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            gb.b("LoggingUtils: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            gb.b("LoggingUtils: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            gb.b("LoggingUtils: case 2 failure");
            return false;
        }
    }

    public static boolean b(Context context) {
        if (String.valueOf(f60716a).equals(eb.a(String.format("%s_mytarget_debug", context.getPackageName())))) {
            gb.a("LoggingUtils: debug data in SystemProperties has been found");
            return true;
        }
        gb.a("LoggingUtils: no debug data in SystemProperties");
        return false;
    }

    public static void c(Context context) {
        if (gb.f59768a || f60717b) {
            return;
        }
        f60717b = true;
        try {
            if (a(context)) {
                gb.f59768a = true;
                gb.a("LoggingUtils: debug mode is enabled by device name");
                return;
            }
            if (f60716a.equals((Integer) eb.a(context, "com.my.target.debugMode", Integer.class))) {
                gb.f59768a = true;
                gb.a("LoggingUtils: debug mode is enabled by manifest metadata");
            } else if (b(context)) {
                gb.f59768a = true;
                gb.a("LoggingUtils: debug mode is enabled by system properties");
            }
        } catch (Throwable unused) {
        }
    }
}
