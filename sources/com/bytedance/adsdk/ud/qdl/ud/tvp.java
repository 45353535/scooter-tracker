package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class tvp extends com.bytedance.adsdk.ud.wd.qdl<PointF> {
    private final com.bytedance.adsdk.ud.wd.qdl<PointF> rq;
    private Path to;

    public tvp(com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar) {
        super(wdVar, qdlVar.qdl, qdlVar.f16147ud, qdlVar.lnr, qdlVar.mml, qdlVar.mzz, qdlVar.mo, qdlVar.f16148wd);
        this.rq = qdlVar;
        qdl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void qdl() {
        T t10;
        T t11;
        T t12 = this.f16147ud;
        boolean z10 = (t12 == 0 || (t11 = this.qdl) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.qdl;
        if (t13 == 0 || (t10 = this.f16147ud) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar = this.rq;
        this.to = com.bytedance.adsdk.ud.mo.mo.qdl((PointF) t13, (PointF) t10, qdlVar.jpc, qdlVar.tvp);
    }

    Path ud() {
        return this.to;
    }
}
