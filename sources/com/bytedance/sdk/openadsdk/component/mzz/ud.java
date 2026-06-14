package com.bytedance.sdk.openadsdk.component.mzz;

import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private ljh lnr;
    private com.bytedance.sdk.openadsdk.core.model.qdl mml;
    private String mo;
    private int mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17015ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17016wd;

    public ud(int i10, int i11, ljh ljhVar, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.qdl = i10;
        this.f17015ud = i11;
        this.lnr = ljhVar;
        this.mml = qdlVar;
    }

    public int lnr() {
        return this.f17015ud;
    }

    public ljh mml() {
        return this.lnr;
    }

    public String mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl qdl() {
        return this.mml;
    }

    public int ud() {
        return this.qdl;
    }

    public void qdl(boolean z10) {
        this.f17016wd = z10;
    }

    public ud(int i10, int i11, int i12, String str) {
        this.qdl = i10;
        this.f17015ud = i11;
        this.mzz = i12;
        this.mo = str;
    }
}
