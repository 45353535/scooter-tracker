package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f52061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f52062b;

    public static boolean a() {
        if (f52061a == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f52061a = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f52061a != null && f52061a.booleanValue();
    }

    public static boolean b() {
        if (f52062b == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                f52062b = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f52062b != null && f52062b.booleanValue();
    }
}
