package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class rdp extends qdl<PointF, PointF> {
    private final qdl<Float, Float> jpc;
    protected com.bytedance.adsdk.ud.wd.ud<Float> mml;
    private final PointF mo;
    protected com.bytedance.adsdk.ud.wd.ud<Float> mzz;
    private final qdl<Float, Float> tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final PointF f16112wd;

    public rdp(qdl<Float, Float> qdlVar, qdl<Float, Float> qdlVar2) {
        super(Collections.EMPTY_LIST);
        this.mo = new PointF();
        this.f16112wd = new PointF();
        this.jpc = qdlVar;
        this.tvp = qdlVar2;
        qdl(jpc());
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: tvp, reason: merged with bridge method [inline-methods] */
    public PointF wd() {
        return qdl(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f10) {
        if (this.mml != null && this.jpc.lnr() != null) {
            this.jpc.mzz();
            throw null;
        }
        if (this.mzz != null && this.tvp.lnr() != null) {
            this.tvp.mzz();
            throw null;
        }
        this.f16112wd.set(this.mo.x, 0.0f);
        PointF pointF = this.f16112wd;
        pointF.set(pointF.x, this.mo.y);
        return this.f16112wd;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    public void qdl(float f10) {
        this.jpc.qdl(f10);
        this.tvp.qdl(f10);
        this.mo.set(this.jpc.wd().floatValue(), this.tvp.wd().floatValue());
        for (int i10 = 0; i10 < this.qdl.size(); i10++) {
            this.qdl.get(i10).qdl();
        }
    }
}
