package com.bytedance.adsdk.ud.lnr.ud;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jtx implements lnr {
    private final boolean lnr;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final List<lnr> f16034ud;

    public jtx(String str, List<lnr> list, boolean z10) {
        this.qdl = str;
        this.f16034ud = list;
        this.lnr = z10;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.qdl + "' Shapes: " + Arrays.toString(this.f16034ud.toArray()) + '}';
    }

    public List<lnr> ud() {
        return this.f16034ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.mml(tvpVar, qdlVar, this, wdVar);
    }
}
