package com.my.target;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e0 {
    public static String a(String[] strArr) {
        return strArr == null ? "" : TextUtils.join(StringUtils.COMMA, strArr);
    }

    public static String a(List list) {
        return TextUtils.join(StringUtils.COMMA, list);
    }

    public static int[] a(int... iArr) {
        Arrays.sort(iArr);
        return iArr;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
