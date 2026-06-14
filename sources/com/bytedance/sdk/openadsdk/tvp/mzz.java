package com.bytedance.sdk.openadsdk.tvp;

import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.mzz.tvp;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements exc {
    private static int qdl;
    private long lnr;
    private boolean mml;
    private final String mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17827ud = 0;

    public mzz() {
        qdl++;
        this.mzz = "image_request_" + qdl;
    }

    private String lnr(String str, tvp tvpVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.mzz.exc
    public void qdl(String str, tvp tvpVar) {
        if (!this.mml) {
            tvpVar.qdl();
            tvpVar.ud();
            tvpVar.lnr();
            this.mml = true;
        }
        this.f17827ud = System.currentTimeMillis();
        lnr(str, tvpVar);
    }

    @Override // com.bytedance.sdk.component.mzz.exc
    public void ud(String str, tvp tvpVar) {
        this.lnr += System.currentTimeMillis() - this.f17827ud;
        lnr(str, tvpVar);
    }
}
