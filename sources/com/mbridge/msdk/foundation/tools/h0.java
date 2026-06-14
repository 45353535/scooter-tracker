package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes10.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f49009a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        if (f49009a != null || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
        } else {
            f49009a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        return f49009a;
    }
}
