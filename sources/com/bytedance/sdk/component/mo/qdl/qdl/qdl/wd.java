package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import com.bytedance.sdk.component.mo.qdl.jpc;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    public static String qdl = "com.bytedance.openadsdk";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static String f16548ud = "content://" + qdl + ".TTMultiProvider";

    static {
        qdl();
    }

    public static void qdl() {
        if (jpc.wd().mo() != null) {
            qdl = jpc.wd().mo().getPackageName();
            f16548ud = "content://" + qdl + ".TTMultiProvider";
        }
    }
}
