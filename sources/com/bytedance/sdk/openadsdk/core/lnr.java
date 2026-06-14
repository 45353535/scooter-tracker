package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static volatile lnr qdl;

    private lnr() {
    }

    public static lnr qdl() {
        if (qdl == null) {
            synchronized (lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new lnr();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public String ud(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("ttopenadsdk", str, str2);
    }

    public int ud(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", str, i10);
    }

    public Long ud(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", str, j10));
    }

    public void qdl(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", str, str2);
    }

    public void qdl(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void qdl(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("ttopenadsdk", str, Long.valueOf(j10));
    }
}
