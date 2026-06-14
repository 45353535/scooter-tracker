package com.taurusx.tax.y.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes11.dex */
public class z {
    public static int w(Context context) {
        PackageInfo packageInfoZ = z(context);
        if (packageInfoZ != null) {
            return packageInfoZ.versionCode;
        }
        return 0;
    }

    public static String y(Context context) {
        PackageInfo packageInfoZ = z(context);
        if (packageInfoZ != null) {
            return packageInfoZ.versionName;
        }
        return null;
    }

    public static PackageInfo z(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean z(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(str, 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return (packageInfo == null || packageManager.getApplicationEnabledSetting(str) == 2) ? false : true;
    }
}
