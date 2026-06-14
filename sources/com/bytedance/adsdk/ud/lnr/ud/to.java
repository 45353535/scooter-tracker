package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class to implements lnr {
    private final com.bytedance.adsdk.ud.lnr.qdl.ud jpc;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mzz;
    private final String qdl;
    private final boolean rq;
    private final boolean to;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final qdl f16042ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.lnr.qdl.ud f16043wd;

    public enum qdl {
        STAR(1),
        POLYGON(2);

        private final int lnr;

        qdl(int i10) {
            this.lnr = i10;
        }

        public static qdl qdl(int i10) {
            for (qdl qdlVar : values()) {
                if (qdlVar.lnr == i10) {
                    return qdlVar;
                }
            }
            return null;
        }
    }

    public to(String str, qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> exuVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, com.bytedance.adsdk.ud.lnr.qdl.ud udVar3, com.bytedance.adsdk.ud.lnr.qdl.ud udVar4, com.bytedance.adsdk.ud.lnr.qdl.ud udVar5, com.bytedance.adsdk.ud.lnr.qdl.ud udVar6, boolean z10, boolean z11) {
        this.qdl = str;
        this.f16042ud = qdlVar;
        this.lnr = udVar;
        this.mml = exuVar;
        this.mzz = udVar2;
        this.mo = udVar3;
        this.f16043wd = udVar4;
        this.jpc = udVar5;
        this.tvp = udVar6;
        this.to = z10;
        this.rq = z11;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud jpc() {
        return this.jpc;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud lnr() {
        return this.lnr;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<PointF, PointF> mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mo() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public boolean rq() {
        return this.rq;
    }

    public boolean to() {
        return this.to;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud tvp() {
        return this.tvp;
    }

    public qdl ud() {
        return this.f16042ud;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud wd() {
        return this.f16043wd;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.rdp(tvpVar, qdlVar, this);
    }
}
