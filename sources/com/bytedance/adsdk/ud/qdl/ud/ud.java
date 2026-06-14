package com.bytedance.adsdk.ud.qdl.ud;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends wd<Integer> {
    public ud(List<com.bytedance.adsdk.ud.wd.qdl<Integer>> list) {
        super(list);
    }

    public int lnr(com.bytedance.adsdk.ud.wd.qdl<Integer> qdlVar, float f10) {
        if (qdlVar.qdl == null || qdlVar.f16147ud == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.lnr == null) {
            return com.bytedance.adsdk.ud.mo.ud.qdl(com.bytedance.adsdk.ud.mo.mzz.ud(f10, 0.0f, 1.0f), qdlVar.qdl.intValue(), qdlVar.f16147ud.intValue());
        }
        qdlVar.f16148wd.getClass();
        mml();
        jpc();
        throw null;
    }

    public int tvp() {
        return lnr(lnr(), mzz());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Integer qdl(com.bytedance.adsdk.ud.wd.qdl<Integer> qdlVar, float f10) {
        return Integer.valueOf(lnr(qdlVar, f10));
    }
}
