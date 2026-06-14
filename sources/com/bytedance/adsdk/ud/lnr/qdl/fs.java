package com.bytedance.adsdk.ud.lnr.qdl;

import android.graphics.PointF;
import com.bytedance.adsdk.ud.qdl.ud.jtx;

/* JADX INFO: loaded from: classes6.dex */
public class fs implements com.bytedance.adsdk.ud.lnr.ud.lnr {
    private final ud jpc;
    private final wd lnr;
    private final ud mml;
    private final ud mo;
    private final mml mzz;
    private final mzz qdl;
    private final ud tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final exu<PointF, PointF> f16015ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final ud f16016wd;

    public fs() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ud jpc() {
        return this.mo;
    }

    public wd lnr() {
        return this.lnr;
    }

    public ud mml() {
        return this.mml;
    }

    public ud mo() {
        return this.jpc;
    }

    public mml mzz() {
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return null;
    }

    public jtx to() {
        return new jtx(this);
    }

    public ud tvp() {
        return this.f16016wd;
    }

    public exu<PointF, PointF> ud() {
        return this.f16015ud;
    }

    public ud wd() {
        return this.tvp;
    }

    public fs(mzz mzzVar, exu<PointF, PointF> exuVar, wd wdVar, ud udVar, mml mmlVar, ud udVar2, ud udVar3, ud udVar4, ud udVar5) {
        this.qdl = mzzVar;
        this.f16015ud = exuVar;
        this.lnr = wdVar;
        this.mml = udVar;
        this.mzz = mmlVar;
        this.jpc = udVar2;
        this.tvp = udVar3;
        this.mo = udVar4;
        this.f16016wd = udVar5;
    }

    public mzz qdl() {
        return this.qdl;
    }
}
