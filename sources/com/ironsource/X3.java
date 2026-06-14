package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes8.dex */
public class X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42017a = "3g";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42018b = "wifi";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42019c = "none";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42020d = "bluetooth";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42021e = "ethernet";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f42022f = "vpn";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f42023g = "cellular";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f42024h = "wifiAware";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f42025i = "lowpan";

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        StringBuilder sb2 = new StringBuilder();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        sb2.append(f42017a);
                    } else if (type == 1) {
                        sb2.append(f42018b);
                    } else {
                        sb2.append(typeName);
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return sb2.toString();
    }

    public static int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mcc;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public static int c(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mnc;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static int e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT < 24) {
                return -1;
            }
            if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_BASIC_PHONE_STATE", context.getPackageName()) == 0) {
                return telephonyManager.getDataNetworkType();
            }
            return -1;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public static String g(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getSimOperator() : "";
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnected()) ? false : true;
    }

    public static boolean j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
    }
}
