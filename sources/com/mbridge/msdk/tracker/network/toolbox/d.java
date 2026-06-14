package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] bArrB = tVar.b();
        if (bArrB == null || bArrB.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str + new String(bArrB);
        }
        return str + "?" + new String(bArrB);
    }
}
