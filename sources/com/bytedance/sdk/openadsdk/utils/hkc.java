package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class hkc {
    private static final Map<String, hkc> qdl = new HashMap();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private SharedPreferences f17855ud;

    private hkc(String str, Context context) {
        if (context != null) {
            this.f17855ud = context.getSharedPreferences(str, 0);
        }
    }

    public static hkc qdl(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, hkc> map = qdl;
        hkc hkcVar = map.get(str);
        if (hkcVar != null) {
            return hkcVar;
        }
        synchronized (hkc.class) {
            if (hkcVar == null) {
                try {
                    hkcVar = new hkc(str, com.bytedance.sdk.openadsdk.core.yt.qdl());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map.put(str, hkcVar);
        }
        return hkcVar;
    }

    public String qdl(String str, String str2) {
        try {
            return this.f17855ud.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void qdl(String str) {
        try {
            this.f17855ud.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
