package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static String a(String str) {
        String strB = b(str);
        return TextUtils.isEmpty(strB) ? "" : c1.a(strB);
    }

    public static String b(String str) {
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, TextUtils.isEmpty(str) ? gVarB.q0() : gVarB.B());
    }
}
