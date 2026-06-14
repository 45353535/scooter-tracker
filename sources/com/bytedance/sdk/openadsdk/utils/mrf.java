package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class mrf {
    public long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17880ud;

    private mrf(boolean z10) {
        if (z10) {
            mzz();
        }
    }

    public static mrf lnr() {
        return new mrf(false);
    }

    public static mrf ud() {
        return new mrf(true);
    }

    public long mml() {
        return SystemClock.elapsedRealtime() - this.f17880ud;
    }

    public boolean mo() {
        return this.f17880ud > 0;
    }

    public void mzz() {
        this.qdl = System.currentTimeMillis();
        this.f17880ud = SystemClock.elapsedRealtime();
    }

    public long qdl() {
        return this.f17880ud;
    }

    public String toString() {
        return String.valueOf(this.qdl);
    }

    public long qdl(mrf mrfVar) {
        return Math.abs(mrfVar.f17880ud - this.f17880ud);
    }
}
