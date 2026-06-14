package com.bytedance.sdk.openadsdk.component.jpc;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl {
    private boolean lnr;
    private long mml;
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f16988ud;

    public long lnr() {
        return this.f16988ud;
    }

    public void qdl(boolean z10) {
        this.lnr = z10;
    }

    public float ud() {
        return this.qdl;
    }

    public long qdl() {
        return this.mml;
    }

    public void ud(long j10) {
        this.f16988ud = j10;
    }

    public void qdl(long j10) {
        this.mml = j10;
    }

    public void qdl(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append(C4240b4.j.f42674e);
        this.qdl = f10;
    }
}
