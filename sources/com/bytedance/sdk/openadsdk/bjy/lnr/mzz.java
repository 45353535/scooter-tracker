package com.bytedance.sdk.openadsdk.bjy.lnr;

/* JADX INFO: loaded from: classes6.dex */
class mzz implements lnr {
    private static volatile mzz qdl;

    private mzz() {
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.bjy.ud udVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.bjy.ud udVar, boolean z10) {
    }

    public static mzz qdl() {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }
}
