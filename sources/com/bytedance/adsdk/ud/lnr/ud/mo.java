package com.bytedance.adsdk.ud.lnr.ud;

import com.bytedance.adsdk.ud.lnr.ud.jl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements lnr {
    private final boolean exu;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud fs;
    private final jl.qdl jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.lnr lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mo mzz;
    private final String qdl;
    private final List<com.bytedance.adsdk.ud.lnr.qdl.ud> rq;
    private final float to;
    private final jl.ud tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final wd f16036ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.lnr.qdl.ud f16037wd;

    public mo(String str, wd wdVar, com.bytedance.adsdk.ud.lnr.qdl.lnr lnrVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar, com.bytedance.adsdk.ud.lnr.qdl.mo moVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, jl.qdl qdlVar, jl.ud udVar2, float f10, List<com.bytedance.adsdk.ud.lnr.qdl.ud> list, com.bytedance.adsdk.ud.lnr.qdl.ud udVar3, boolean z10) {
        this.qdl = str;
        this.f16036ud = wdVar;
        this.lnr = lnrVar;
        this.mml = mmlVar;
        this.mzz = moVar;
        this.mo = moVar2;
        this.f16037wd = udVar;
        this.jpc = qdlVar;
        this.tvp = udVar2;
        this.to = f10;
        this.rq = list;
        this.fs = udVar3;
        this.exu = z10;
    }

    public boolean exu() {
        return this.exu;
    }

    public float fs() {
        return this.to;
    }

    public jl.qdl jpc() {
        return this.jpc;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.lnr lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mo() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mo mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud rq() {
        return this.fs;
    }

    public List<com.bytedance.adsdk.ud.lnr.qdl.ud> to() {
        return this.rq;
    }

    public jl.ud tvp() {
        return this.tvp;
    }

    public wd ud() {
        return this.f16036ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud wd() {
        return this.f16037wd;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.tvp(tvpVar, qdlVar, this);
    }
}
