package com.bytedance.adsdk.qdl.ud.ud.qdl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yt implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    protected com.bytedance.adsdk.qdl.ud.mml.lnr lnr;
    protected com.bytedance.adsdk.qdl.ud.ud.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected com.bytedance.adsdk.qdl.ud.ud.qdl f15978ud;

    protected yt(com.bytedance.adsdk.qdl.ud.mml.lnr lnrVar) {
        this.lnr = lnrVar;
    }

    public void qdl(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.qdl = qdlVar;
    }

    public String toString() {
        return ud();
    }

    public void ud(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.f15978ud = qdlVar;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl.ud() + this.lnr.qdl() + this.f15978ud.ud();
    }
}
