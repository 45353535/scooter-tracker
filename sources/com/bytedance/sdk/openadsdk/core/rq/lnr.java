package com.bytedance.sdk.openadsdk.core.rq;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.core.settings.rq;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    public static String qdl(String str) {
        return TextUtils.isEmpty(str) ? str : qdl(rq.lnr().oth(), str);
    }

    public static String qdl(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith(DtbConstants.HTTPS)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
