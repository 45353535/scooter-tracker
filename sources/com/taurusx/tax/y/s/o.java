package com.taurusx.tax.y.s;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67651a = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67652c = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f67653n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f67654o = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67655s = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67656w = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f67657y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f67658z = 0;

    public static int w(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 2;
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 4;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 5;
                    case 13:
                    case 18:
                    case 19:
                        return 6;
                    case 16:
                    case 17:
                    default:
                        if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA")) {
                            return 5;
                        }
                        return subtypeName.equalsIgnoreCase("CDMA2000") ? 5 : 0;
                    case 20:
                        return 7;
                }
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public static boolean y(Context context) {
        NetworkInfo networkInfoZ = z(context);
        return networkInfoZ != null && networkInfoZ.isConnected();
    }

    public static NetworkInfo z(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
