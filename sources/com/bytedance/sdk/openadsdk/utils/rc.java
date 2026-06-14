package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4424m2;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rc {
    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, Double d10) {
        if (ljhVar == null || ljhVar.dsy() == null) {
            return;
        }
        Map<String, Object> mapDsy = ljhVar.dsy();
        try {
            Object obj = ljhVar.dsy().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapDsy.get(C4424m2.A);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.yt.lnr().qdl(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.aaj.lnr("report Win error", new Object[0]);
        }
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, Double d10, String str, String str2) {
        if (ljhVar == null || ljhVar.dsy() == null) {
            return;
        }
        Map<String, Object> mapDsy = ljhVar.dsy();
        try {
            Object obj = ljhVar.dsy().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapDsy.get(C4424m2.f43627z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d10));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.yt.lnr().qdl(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.aaj.lnr("report Loss error", new Object[0]);
        }
    }
}
