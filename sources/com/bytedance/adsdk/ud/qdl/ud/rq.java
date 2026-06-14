package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends wd<PointF> {
    private final PointF mml;

    public rq(List<com.bytedance.adsdk.ud.wd.qdl<PointF>> list) {
        super(list);
        this.mml = new PointF();
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f10) {
        return qdl(qdlVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = qdlVar.qdl;
        if (pointF2 == null || (pointF = qdlVar.f16147ud) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.lnr != null) {
            qdlVar.f16148wd.getClass();
            mml();
            jpc();
            throw null;
        }
        PointF pointF5 = this.mml;
        float f13 = pointF3.x;
        float f14 = f13 + (f11 * (pointF4.x - f13));
        float f15 = pointF3.y;
        pointF5.set(f14, f15 + (f12 * (pointF4.y - f15)));
        return this.mml;
    }
}
