package com.bytedance.sdk.component.qdl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
class exc {
    private static boolean qdl;

    static String qdl(Throwable th2) {
        StringBuilder sb2 = new StringBuilder("{\"code\":");
        sb2.append(th2 instanceof jtx ? ((jtx) th2).qdl : 0);
        sb2.append("}");
        return sb2.toString();
    }

    static String qdl(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!qdl || z10) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + StringUtils.COMMA + strSubstring + "}";
    }

    static String qdl() {
        return "";
    }

    static void qdl(boolean z10) {
        qdl = z10;
    }
}
