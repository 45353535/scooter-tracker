package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class dz {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, String> f1935 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m6421(String str) {
        String str2 = f1935.get(str);
        if (str2 != null) {
            return str2;
        }
        f1935.put(str, str);
        return str;
    }
}
