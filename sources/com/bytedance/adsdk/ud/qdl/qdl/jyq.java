package com.bytedance.adsdk.ud.qdl.qdl;

import com.bytedance.adsdk.ud.lnr.ud.exc;
import com.bytedance.adsdk.ud.qdl.ud.qdl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jyq implements lnr, qdl.InterfaceC0205qdl {
    private final List<qdl.InterfaceC0205qdl> lnr = new ArrayList();
    private final exc.qdl mml;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mo;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mzz;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f16088ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> f16089wd;

    public jyq(com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.exc excVar) {
        this.qdl = excVar.qdl();
        this.f16088ud = excVar.mo();
        this.mml = excVar.ud();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = excVar.mml().qdl();
        this.mzz = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl2 = excVar.lnr().qdl();
        this.mo = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = excVar.mzz().qdl();
        this.f16089wd = qdlVarQdl3;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> lnr() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mml() {
        return this.mo;
    }

    public boolean mo() {
        return this.f16088ud;
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mzz() {
        return this.f16089wd;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
    }

    exc.qdl ud() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        for (int i10 = 0; i10 < this.lnr.size(); i10++) {
            this.lnr.get(i10).qdl();
        }
    }

    void qdl(qdl.InterfaceC0205qdl interfaceC0205qdl) {
        this.lnr.add(interfaceC0205qdl);
    }
}
