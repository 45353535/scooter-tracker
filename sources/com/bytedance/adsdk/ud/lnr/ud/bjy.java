package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.Path;

/* JADX INFO: loaded from: classes6.dex */
public class bjy implements lnr {
    private final String lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.qdl mml;
    private final boolean mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mzz;
    private final boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Path.FillType f16022ud;

    public bjy(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, boolean z11) {
        this.lnr = str;
        this.qdl = z10;
        this.f16022ud = fillType;
        this.mml = qdlVar;
        this.mzz = mmlVar;
        this.mo = z11;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml lnr() {
        return this.mzz;
    }

    public Path.FillType mml() {
        return this.f16022ud;
    }

    public boolean mzz() {
        return this.mo;
    }

    public String qdl() {
        return this.lnr;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.qdl + '}';
    }

    public com.bytedance.adsdk.ud.lnr.qdl.qdl ud() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.wd(tvpVar, qdlVar, this);
    }
}
