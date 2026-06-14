package com.pgl.ssdk.ces;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static native Object meta(int i10, Context context, Object obj);

    public static Object njss(int i10, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i10, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
