package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public class i0 {
    public static boolean a(int i10) {
        return (i10 == -1 || ((-16777216) & i10) == 0 || (i10 & 16711680) == 0) ? false : true;
    }

    public static int a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = com.mbridge.msdk.foundation.controller.c.n().i();
            } catch (Exception unused) {
                q0.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (a1.a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (a1.a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            q0.b("ResourceUtil", "Resource not found resName:" + str);
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e10) {
                q0.b("ResourceUtil", "Resource error:" + e10.getMessage());
            }
        }
        return null;
    }
}
