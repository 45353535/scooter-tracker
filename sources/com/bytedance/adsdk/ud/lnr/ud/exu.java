package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes6.dex */
public class exu implements lnr {
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> f16025ud;

    public exu(String str, com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> exuVar) {
        this.qdl = str;
        this.f16025ud = exuVar;
    }

    public String qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> ud() {
        return this.f16025ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.yt(tvpVar, qdlVar, this);
    }
}
