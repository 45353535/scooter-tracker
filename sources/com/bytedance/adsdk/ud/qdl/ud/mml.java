package com.bytedance.adsdk.ud.qdl.ud;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends wd<Float> {
    public mml(List<com.bytedance.adsdk.ud.wd.qdl<Float>> list) {
        super(list);
    }

    float lnr(com.bytedance.adsdk.ud.wd.qdl<Float> qdlVar, float f10) {
        if (qdlVar.qdl == null || qdlVar.f16147ud == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.lnr == null) {
            return com.bytedance.adsdk.ud.mo.mzz.qdl(qdlVar.mo(), qdlVar.wd(), f10);
        }
        qdlVar.f16148wd.getClass();
        mml();
        jpc();
        throw null;
    }

    public float tvp() {
        return lnr(lnr(), mzz());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Float qdl(com.bytedance.adsdk.ud.wd.qdl<Float> qdlVar, float f10) {
        return Float.valueOf(lnr(qdlVar, f10));
    }
}
