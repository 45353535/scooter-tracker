package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.Path;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.lnr lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mzz;
    private final wd qdl;
    private final boolean to;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Path.FillType f16038ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f16039wd;

    public mzz(String str, wd wdVar, Path.FillType fillType, com.bytedance.adsdk.ud.lnr.qdl.lnr lnrVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, boolean z10) {
        this.qdl = wdVar;
        this.f16038ud = fillType;
        this.lnr = lnrVar;
        this.mml = mmlVar;
        this.mzz = moVar;
        this.mo = moVar2;
        this.f16039wd = str;
        this.jpc = udVar;
        this.tvp = udVar2;
        this.to = z10;
    }

    public boolean jpc() {
        return this.to;
    }

    public Path.FillType lnr() {
        return this.f16038ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.lnr mml() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mo() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml mzz() {
        return this.mml;
    }

    public String qdl() {
        return this.f16039wd;
    }

    public wd ud() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo wd() {
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.jpc(tvpVar, wdVar, qdlVar, this);
    }
}
