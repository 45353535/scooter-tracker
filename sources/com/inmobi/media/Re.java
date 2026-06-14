package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Re {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.EnumC3571a6 a(android.net.ConnectivityManager r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Re.a(android.net.ConnectivityManager):com.inmobi.media.a6");
    }

    public static boolean b() {
        Context context = Ji.f37157a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("Re", "TAG");
            e10.getMessage();
        }
        return false;
    }

    public static EnumC3571a6 a() {
        EnumC3571a6 enumC3571a6A;
        Context context = Ji.f37157a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC3571a6A = a((ConnectivityManager) systemService);
            } catch (Exception e10) {
                Intrinsics.checkNotNullExpressionValue("Re", "TAG");
                e10.getMessage();
                enumC3571a6A = EnumC3571a6.f38162l;
            }
            if (enumC3571a6A != null) {
                return enumC3571a6A;
            }
            if (b()) {
                return EnumC3571a6.f38159i;
            }
            return null;
        }
        return EnumC3571a6.f38158h;
    }
}
