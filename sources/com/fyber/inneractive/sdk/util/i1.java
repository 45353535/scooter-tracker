package com.fyber.inneractive.sdk.util;

import com.amazon.aps.shared.util.APSSharedUtil;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i1 {
    public static String a(String str, int i10) {
        if (i10 <= 0 || str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10 - 3) + APSSharedUtil.TRUNCATE_SEPARATOR;
    }
}
