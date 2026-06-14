package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49665a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n nVarA = n.a(com.mbridge.msdk.foundation.db.g.a(context));
                if (TextUtils.isEmpty(str) || nVarA == null || nVarA.d() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> listA = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA2 = nVarA.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> listA3 = nVarA.a("m_download_end");
                o.e(listA2);
                o.a(listA);
                o.b(listA3);
            } catch (Exception e10) {
                q0.b(f49665a, e10.getMessage());
            }
        }
    }
}
