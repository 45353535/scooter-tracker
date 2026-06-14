package com.bytedance.adsdk.ud.qdl.ud;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fs extends wd<com.bytedance.adsdk.ud.wd.lnr> {
    private final com.bytedance.adsdk.ud.wd.lnr mml;

    public fs(List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.wd.lnr>> list) {
        super(list);
        this.mml = new com.bytedance.adsdk.ud.wd.lnr();
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.wd.lnr qdl(com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.wd.lnr> qdlVar, float f10) {
        com.bytedance.adsdk.ud.wd.lnr lnrVar;
        com.bytedance.adsdk.ud.wd.lnr lnrVar2 = qdlVar.qdl;
        if (lnrVar2 == null || (lnrVar = qdlVar.f16147ud) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.ud.wd.lnr lnrVar3 = lnrVar2;
        com.bytedance.adsdk.ud.wd.lnr lnrVar4 = lnrVar;
        if (this.lnr == null) {
            this.mml.qdl(com.bytedance.adsdk.ud.mo.mzz.qdl(lnrVar3.qdl(), lnrVar4.qdl(), f10), com.bytedance.adsdk.ud.mo.mzz.qdl(lnrVar3.ud(), lnrVar4.ud(), f10));
            return this.mml;
        }
        qdlVar.f16148wd.getClass();
        mml();
        jpc();
        throw null;
    }
}
