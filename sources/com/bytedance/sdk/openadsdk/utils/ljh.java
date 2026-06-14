package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class ljh {
    public static boolean qdl() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return i10 >= 32 && qdl("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean qdl(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
