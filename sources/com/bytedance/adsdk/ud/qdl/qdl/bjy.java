package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.ud.qdl.ud.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class bjy implements exu, rq, qdl.InterfaceC0205qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> jpc;
    private final String lnr;
    private final boolean mml;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mo;
    private final com.bytedance.adsdk.ud.tvp mzz;
    private boolean rq;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> f16080wd;
    private final Path qdl = new Path();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final RectF f16079ud = new RectF();
    private final ud tvp = new ud();
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> to = null;

    public bjy(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.rq rqVar) {
        this.lnr = rqVar.qdl();
        this.mml = rqVar.mzz();
        this.mzz = tvpVar;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl = rqVar.mml().qdl();
        this.mo = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = rqVar.lnr().qdl();
        this.f16080wd = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = rqVar.ud().qdl();
        this.jpc = qdlVarQdl3;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
    }

    private void ud() {
        this.rq = false;
        this.mzz.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar;
        if (this.rq) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mml) {
            this.rq = true;
            return this.qdl;
        }
        PointF pointFWd = this.f16080wd.wd();
        float f10 = pointFWd.x / 2.0f;
        float f11 = pointFWd.y / 2.0f;
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar2 = this.jpc;
        float fTvp = qdlVar2 == null ? 0.0f : ((com.bytedance.adsdk.ud.qdl.ud.mml) qdlVar2).tvp();
        if (fTvp == 0.0f && (qdlVar = this.to) != null) {
            fTvp = Math.min(qdlVar.wd().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fTvp > fMin) {
            fTvp = fMin;
        }
        PointF pointFWd2 = this.mo.wd();
        this.qdl.moveTo(pointFWd2.x + f10, (pointFWd2.y - f11) + fTvp);
        this.qdl.lineTo(pointFWd2.x + f10, (pointFWd2.y + f11) - fTvp);
        if (fTvp > 0.0f) {
            RectF rectF = this.f16079ud;
            float f12 = pointFWd2.x;
            float f13 = fTvp * 2.0f;
            float f14 = pointFWd2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.qdl.arcTo(this.f16079ud, 0.0f, 90.0f, false);
        }
        this.qdl.lineTo((pointFWd2.x - f10) + fTvp, pointFWd2.y + f11);
        if (fTvp > 0.0f) {
            RectF rectF2 = this.f16079ud;
            float f15 = pointFWd2.x;
            float f16 = pointFWd2.y;
            float f17 = fTvp * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.qdl.arcTo(this.f16079ud, 90.0f, 90.0f, false);
        }
        this.qdl.lineTo(pointFWd2.x - f10, (pointFWd2.y - f11) + fTvp);
        if (fTvp > 0.0f) {
            RectF rectF3 = this.f16079ud;
            float f18 = pointFWd2.x;
            float f19 = pointFWd2.y;
            float f20 = fTvp * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.qdl.arcTo(this.f16079ud, 180.0f, 90.0f, false);
        }
        this.qdl.lineTo((pointFWd2.x + f10) - fTvp, pointFWd2.y - f11);
        if (fTvp > 0.0f) {
            RectF rectF4 = this.f16079ud;
            float f21 = pointFWd2.x;
            float f22 = fTvp * 2.0f;
            float f23 = pointFWd2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.qdl.arcTo(this.f16079ud, 270.0f, 90.0f, false);
        }
        this.qdl.close();
        this.tvp.qdl(this.qdl);
        this.rq = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        ud();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(java.util.List<com.bytedance.adsdk.ud.qdl.qdl.lnr> r5, java.util.List<com.bytedance.adsdk.ud.qdl.qdl.lnr> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.ud.qdl.qdl.lnr r0 = (com.bytedance.adsdk.ud.qdl.qdl.lnr) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.ud.qdl.qdl.jyq
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.ud.qdl.qdl.jyq r1 = (com.bytedance.adsdk.ud.qdl.qdl.jyq) r1
            com.bytedance.adsdk.ud.lnr.ud.exc$qdl r2 = r1.ud()
            com.bytedance.adsdk.ud.lnr.ud.exc$qdl r3 = com.bytedance.adsdk.ud.lnr.ud.exc.qdl.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.bytedance.adsdk.ud.qdl.qdl.ud r0 = r4.tvp
            r0.qdl(r1)
            r1.qdl(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.ud.qdl.qdl.yt
            if (r1 == 0) goto L31
            com.bytedance.adsdk.ud.qdl.qdl.yt r0 = (com.bytedance.adsdk.ud.qdl.qdl.yt) r0
            com.bytedance.adsdk.ud.qdl.ud.qdl r0 = r0.ud()
            r4.to = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.qdl.qdl.bjy.qdl(java.util.List, java.util.List):void");
    }
}
