package com.taurusx.tax.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes11.dex */
public class u {
    public static boolean w(Context context) {
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
