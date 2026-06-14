package com.bytedance.adsdk.ud.lnr.ud;

import com.bytedance.adsdk.ud.qdl.qdl.jyq;

/* JADX INFO: loaded from: classes6.dex */
public class exc implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mml;
    private final boolean mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mzz;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final qdl f16023ud;

    public enum qdl {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static qdl qdl(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    public exc(String str, qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar3, boolean z10) {
        this.qdl = str;
        this.f16023ud = qdlVar;
        this.lnr = udVar;
        this.mml = udVar2;
        this.mzz = udVar3;
        this.mo = z10;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud lnr() {
        return this.mml;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mml() {
        return this.lnr;
    }

    public boolean mo() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "Trim Path: {start: " + this.lnr + ", end: " + this.mml + ", offset: " + this.mzz + "}";
    }

    public qdl ud() {
        return this.f16023ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new jyq(qdlVar, this);
    }
}
