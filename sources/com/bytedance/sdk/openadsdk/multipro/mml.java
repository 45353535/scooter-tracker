package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public static String qdl = "com.bytedance.openadsdk";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static String f17770ud = "content://" + qdl + ".TTMultiProvider";

    static {
        qdl();
    }

    public static void qdl() {
        if (yt.qdl() != null) {
            qdl = yt.qdl().getPackageName();
            f17770ud = "content://" + qdl + ".TTMultiProvider";
        }
    }
}
