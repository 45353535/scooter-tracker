package com.bytedance.sdk.component.adexpress.qdl.qdl;

import com.bytedance.sdk.component.mzz.bjy;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static qdl mzz = new qdl();
    private volatile lnr lnr;
    private volatile bjy mml;
    private volatile mzz mo;
    private volatile ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private volatile mml f16462ud;

    private qdl() {
    }

    public static qdl qdl() {
        return mzz;
    }

    public lnr lnr() {
        return this.lnr;
    }

    public mml mml() {
        return this.f16462ud;
    }

    public mzz mo() {
        return this.mo;
    }

    public bjy mzz() {
        return this.mml;
    }

    public ud ud() {
        return this.qdl;
    }

    public void qdl(ud udVar) {
        this.qdl = udVar;
    }

    public void qdl(lnr lnrVar) {
        this.lnr = lnrVar;
    }

    public void qdl(mml mmlVar) {
        this.f16462ud = mmlVar;
    }

    public void qdl(bjy bjyVar) {
        this.mml = bjyVar;
    }
}
