package com.taurusx.tax.g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class w {
    public static String c(Context context) {
        try {
            return j0.w(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
        } catch (Exception e10) {
            LogUtil.v("taurusx", "get signature sha1 error : " + e10);
            return "";
        }
    }

    public static int o(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String s(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String w(Context context) {
        return context.getPackageName();
    }

    public static String y(Context context) {
        if (context == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static String z(Context context) {
        Exception e10;
        String string;
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString();
            try {
                return string.replace(" ", "");
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return string;
            }
        } catch (Exception e12) {
            e10 = e12;
            string = "";
        }
    }

    public static boolean z(Context context, String str) {
        Intent launchIntentForPackage;
        try {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            launchIntentForPackage = null;
        }
        return launchIntentForPackage != null;
    }
}
