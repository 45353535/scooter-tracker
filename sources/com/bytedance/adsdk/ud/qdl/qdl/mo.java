package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ud.lnr.ud.exc;
import com.bytedance.adsdk.ud.qdl.ud.qdl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements exu, rq, qdl.InterfaceC0205qdl {
    private boolean jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mml;
    private final com.bytedance.adsdk.ud.lnr.ud.ud mo;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16092ud;
    private final Path qdl = new Path();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final ud f16093wd = new ud();

    public mo(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.ud udVar) {
        this.f16092ud = udVar.qdl();
        this.lnr = tvpVar;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl = udVar.lnr().qdl();
        this.mml = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = udVar.ud().qdl();
        this.mzz = qdlVarQdl2;
        this.mo = udVar;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
    }

    private void ud() {
        this.jpc = false;
        this.lnr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        if (this.jpc) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mo.mzz()) {
            this.jpc = true;
            return this.qdl;
        }
        PointF pointFWd = this.mml.wd();
        float f10 = pointFWd.x / 2.0f;
        float f11 = pointFWd.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.qdl.reset();
        if (this.mo.mml()) {
            float f14 = -f11;
            this.qdl.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.qdl.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.qdl.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.qdl.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.qdl.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.qdl.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.qdl.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.qdl.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.qdl.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.qdl.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFWd2 = this.mzz.wd();
        this.qdl.offset(pointFWd2.x, pointFWd2.y);
        this.qdl.close();
        this.f16093wd.qdl(this.qdl);
        this.jpc = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        ud();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lnr lnrVar = list.get(i10);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == exc.qdl.SIMULTANEOUSLY) {
                    this.f16093wd.qdl(jyqVar);
                    jyqVar.qdl(this);
                }
            }
        }
    }
}
