package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f48294j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f48294j == null) {
            synchronized (c.class) {
                try {
                    if (f48294j == null) {
                        f48294j = new c();
                    }
                } finally {
                }
            }
        }
        return f48294j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.u0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.t0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.v0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iI0 = gVarD.i0();
        boolean z11 = iI0 != 0 ? iI0 == 1 && a(gVarD, str) == 1 : a(str) == 1 && a(gVarD, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        return (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) ? (gVarD.F0() || z10 || a(str) != 1) ? false : true : z11;
    }
}
