package com.taurusx.tax.g.q0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static y f66308z;

    public static boolean c(Context context) {
        y yVarZ = z(context);
        if (yVarZ == null || TextUtils.isEmpty(yVarZ.f66310z)) {
            return false;
        }
        return yVarZ.f66309w;
    }

    public static y w(Context context) {
        z zVar;
        String strW = w();
        LogUtil.d("taurusx", "get OAID with manufacturer : " + strW);
        if ("HUAWEI".equals(strW)) {
            zVar = new com.taurusx.tax.g.q0.c.z(context);
        } else if ("XIAOMI".equals(strW)) {
            zVar = new com.taurusx.tax.g.q0.t.z(context);
        } else if ("OPPO".equals(strW)) {
            zVar = new com.taurusx.tax.g.q0.s.z(context);
        } else if ("VIVO".equals(strW)) {
            zVar = new com.taurusx.tax.g.q0.n.z(context);
        } else if ("SAMSUNG".equals(strW)) {
            zVar = new com.taurusx.tax.g.q0.a.z(context);
        } else {
            com.taurusx.tax.g.q0.o.z zVar2 = new com.taurusx.tax.g.q0.o.z(context);
            LogUtil.d("taurusx", "get OAID with a not supported manufacturer : " + strW);
            zVar = zVar2;
        }
        y yVarZ = zVar.z();
        if (yVarZ != null) {
            LogUtil.d("taurusx", "get OAID result : " + yVarZ.f66310z + " limit: " + yVarZ.f66309w);
        }
        return yVarZ;
    }

    public static String y(Context context) {
        y yVarZ = z(context);
        return (yVarZ == null || TextUtils.isEmpty(yVarZ.f66310z)) ? "" : yVarZ.f66310z;
    }

    public static y z(Context context) {
        if (f66308z == null) {
            f66308z = w(context);
        }
        return f66308z;
    }

    public static String z() {
        return Build.BRAND.toUpperCase();
    }

    public static String w() {
        return Build.MANUFACTURER.toUpperCase();
    }
}
