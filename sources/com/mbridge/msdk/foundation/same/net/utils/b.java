package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48713a = "b";

    public static void a(e eVar, String str, String str2) {
        if (eVar != null) {
            try {
                if (!a1.a(str) && !a1.a(str2)) {
                    eVar.a(str, str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = c1.a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th2) {
            q0.b(f48713a, th2.getMessage());
        }
    }
}
