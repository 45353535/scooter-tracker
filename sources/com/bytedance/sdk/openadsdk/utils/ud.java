package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.ljh> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static Boolean f17889ud;

    public static boolean qdl() {
        try {
            if (f17889ud == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("enable_get_ad_new", 0) != 1) {
                    z10 = false;
                }
                f17889ud = Boolean.valueOf(z10);
            }
            return f17889ud.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.ljh ud() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.ljh> softReference = qdl;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return;
        }
        qdl = new SoftReference<>(ljhVar);
    }
}
