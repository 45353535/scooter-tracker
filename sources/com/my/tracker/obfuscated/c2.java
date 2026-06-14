package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c2 {
    public static Object a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th2) {
            x2.a("SystemUtils: exception when access to application info with key - " + str, th2);
            return null;
        }
    }

    public static String a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            x2.a("SystemUtils: value in system properties is null for " + str);
        } catch (Throwable th2) {
            x2.a("SystemUtils: error occurred when getting value for property - " + str, th2);
        }
        return null;
    }
}
