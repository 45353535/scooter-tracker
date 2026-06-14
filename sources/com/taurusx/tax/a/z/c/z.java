package com.taurusx.tax.a.z.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65716a = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65717c = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f65718o = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f65719s = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f65720w = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f65721y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f65722z = 0;

    public static int z(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 2;
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == 18) {
                    return 6;
                }
                switch (subtype) {
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
                        return 6;
                    default:
                        return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? 5 : 0;
                }
            }
        }
        return 0;
    }
}
