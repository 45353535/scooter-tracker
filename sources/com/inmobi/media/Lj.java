package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f37297a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Kj f37298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f37299c;

    public static void a(String str) {
        Context context = Ji.f37157a;
        if (context != null) {
            C4148x5.f39893a.getClass();
            if (!C4148x5.p() || !Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = f37297a;
                if (concurrentHashMap.get(str) == null) {
                    Jj jj = new Jj();
                    concurrentHashMap.put(str, jj);
                    F3.a(context, jj, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Kj kj = new Kj();
                f37298b = kj;
                connectivityManager.registerDefaultNetworkCallback(kj);
            }
        }
    }

    public static void b() {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        C4148x5.f39893a.getClass();
        if (C4148x5.w()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (C4148x5.p()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = Ji.f37157a;
        if (context != null) {
            C4148x5.f39893a.getClass();
            if (C4148x5.p() && Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str) && f37298b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Kj kj = f37298b;
                    Intrinsics.checkNotNull(kj);
                    connectivityManager.unregisterNetworkCallback(kj);
                    f37298b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f37297a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        C4148x5.f39893a.getClass();
        if (C4148x5.w()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (C4148x5.p()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f37297a.clear();
    }

    public static void a(Context context, Intent intent) {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f37299c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f37299c = zIsDeviceIdleMode;
                        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                        ((C4155xc) Ji.f37161e.getValue()).b(new I2(10, 4, f37299c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (StringsKt.N("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    C4148x5.f39893a.getClass();
                    if (C4148x5.w()) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                }
                if (zIsDeviceIdleMode != f37299c) {
                    C4148x5.f39893a.getClass();
                    if (C4148x5.w()) {
                        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                        ((C4155xc) Ji.f37161e.getValue()).b(new I2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C4155xc) Ji.f37161e.getValue()).b(new I2(100, 6, (String) null));
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C4155xc) Ji.f37161e.getValue()).b(new I2(1, 6, (String) null));
                Iterator it = f37297a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f37297a.clear();
                f37298b = null;
                return;
            }
            if (Intrinsics.areEqual("android.intent.action.REBOOT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C4155xc) Ji.f37161e.getValue()).b(new I2(2, 6, (String) null));
                Iterator it2 = f37297a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f37297a.clear();
                f37298b = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
            ((C4155xc) Ji.f37161e.getValue()).b(new I2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
