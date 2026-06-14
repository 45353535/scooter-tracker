package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes6.dex */
public class bch {
    public static String qdl(Context context) {
        int iQdl = com.bytedance.sdk.component.utils.bqt.qdl(context, 0L);
        return iQdl != 2 ? iQdl != 3 ? iQdl != 4 ? iQdl != 5 ? iQdl != 6 ? DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY : "5g" : "4g" : X3.f42018b : X3.f42017a : "2g";
    }
}
