package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.mo lnr;
    private final boolean mml;
    private final boolean mzz;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> f16047ud;

    public ud(String str, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, boolean z10, boolean z11) {
        this.qdl = str;
        this.f16047ud = exuVar;
        this.lnr = moVar;
        this.mml = z10;
        this.mzz = z11;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo lnr() {
        return this.lnr;
    }

    public boolean mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.mo(tvpVar, qdlVar, this);
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> ud() {
        return this.f16047ud;
    }

    public String qdl() {
        return this.qdl;
    }
}
