package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes6.dex */
public class fs implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.fs mml;
    private final boolean mzz;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.lnr.qdl.ud f16026ud;

    public fs(String str, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, com.bytedance.adsdk.ud.lnr.qdl.fs fsVar, boolean z10) {
        this.qdl = str;
        this.f16026ud = udVar;
        this.lnr = udVar2;
        this.mml = fsVar;
        this.mzz = z10;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.fs mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud ud() {
        return this.f16026ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.jtx(tvpVar, qdlVar, this);
    }
}
