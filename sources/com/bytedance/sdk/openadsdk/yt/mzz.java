package com.bytedance.sdk.openadsdk.yt;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.tvp;

/* JADX INFO: loaded from: classes6.dex */
class mzz implements mml {
    private int lnr;
    private int mml;
    private mml qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17899ud;

    public mzz(mml mmlVar, int i10, int i11, int i12) {
        this.qdl = mmlVar;
        this.f17899ud = i10;
        this.lnr = i11;
        this.mml = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.mml
    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarGeneratorModel = this.qdl.generatorModel();
        qdlVarGeneratorModel.qdl(BuildConfig.VERSION_NAME);
        qdlVarGeneratorModel.qdl(this.f17899ud);
        qdlVarGeneratorModel.ud(this.lnr);
        qdlVarGeneratorModel.lnr(this.mml);
        qdlVarGeneratorModel.mo(tvp.ud().wd());
        qdlVarGeneratorModel.mml(rdp.mml());
        return qdlVarGeneratorModel;
    }
}
