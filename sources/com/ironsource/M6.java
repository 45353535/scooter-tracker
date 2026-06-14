package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes8.dex */
public class M6 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
