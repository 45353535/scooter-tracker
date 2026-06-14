package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer f61277a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f61278b = new AtomicBoolean();

    static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            x2.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            x2.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            x2.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    static boolean b(Context context) {
        if (String.valueOf(f61277a).equals(c2.a(String.format("%s_mytracker_debug", context.getPackageName())))) {
            x2.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        x2.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(final Context context) {
        if (!f61278b.compareAndSet(false, true)) {
            x2.a("LoggingHandler: instance has already been initialized");
        } else if (x2.a()) {
            x2.a("LoggingHandler: tracing has already been enabled");
        } else {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.i3
                @Override // java.lang.Runnable
                public final void run() {
                    b1.d(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        if (a(context)) {
            x2.a(true);
            x2.a("LoggingHandler: debug mode is enabled by device name");
            return;
        }
        if (f61277a.equals((Integer) c2.a(context, "com.my.tracker.debugMode", Integer.class))) {
            x2.a(true);
            x2.a("LoggingHandler: debug mode is enabled by manifest metadata");
        } else if (b(context)) {
            x2.a(true);
            x2.a("LoggingHandler: debug mode is enabled by system properties");
        }
    }
}
