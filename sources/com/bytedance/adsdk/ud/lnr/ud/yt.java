package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes6.dex */
public class yt implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.jpc lnr;
    private final boolean mml;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16049ud;

    public yt(String str, int i10, com.bytedance.adsdk.ud.lnr.qdl.jpc jpcVar, boolean z10) {
        this.qdl = str;
        this.f16049ud = i10;
        this.lnr = jpcVar;
        this.mml = z10;
    }

    public boolean lnr() {
        return this.mml;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "ShapePath{name=" + this.qdl + ", index=" + this.f16049ud + '}';
    }

    public com.bytedance.adsdk.ud.lnr.qdl.jpc ud() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.jl(tvpVar, qdlVar, this);
    }
}
