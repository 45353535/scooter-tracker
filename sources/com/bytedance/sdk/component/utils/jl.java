package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes6.dex */
public class jl {
    public static boolean jpc(Context context) {
        if (context == null) {
            return false;
        }
        int iLnr = lnr(context);
        return iLnr == 2 || iLnr == 3 || iLnr == 4 || iLnr == 5 || iLnr == 6;
    }

    public static int lnr(Context context) {
        return bqt.qdl(context, 60000L);
    }

    public static boolean mml(Context context) {
        return lnr(context) == 4;
    }

    public static boolean mo(Context context) {
        return lnr(context) == 6;
    }

    public static boolean mzz(Context context) {
        return lnr(context) == 5;
    }

    public static boolean qdl(Context context) {
        return lnr(context) != 0;
    }

    public static int ud(Context context) {
        int iLnr = lnr(context);
        if (iLnr == 1) {
            return 0;
        }
        if (iLnr == 4) {
            return 1;
        }
        if (iLnr == 5) {
            return 4;
        }
        if (iLnr != 6) {
            return iLnr;
        }
        return 6;
    }

    public static String wd(Context context) {
        int iLnr = lnr(context);
        return iLnr != 2 ? iLnr != 3 ? iLnr != 4 ? iLnr != 5 ? iLnr != 6 ? DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY : "5g" : "4g" : X3.f42018b : X3.f42017a : "2g";
    }

    public static boolean qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
    }
}
