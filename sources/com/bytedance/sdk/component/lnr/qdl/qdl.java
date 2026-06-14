package com.bytedance.sdk.component.lnr.qdl;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    long jpc;
    long lnr;
    long mml;
    long mo;
    long mzz;
    long qdl = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    long f16511ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    long f16512wd;

    public void bjy() {
        this.f16511ud = SystemClock.elapsedRealtime();
    }

    public void exu() {
        this.jpc = SystemClock.elapsedRealtime();
    }

    public long fs() {
        return this.jpc;
    }

    public long jpc() {
        return this.mml;
    }

    public void lnr() {
        this.mzz = SystemClock.elapsedRealtime();
    }

    public long mml() {
        return this.qdl;
    }

    public long mo() {
        return this.mo;
    }

    public void mzz() {
        this.mo = SystemClock.elapsedRealtime();
    }

    public void qdl() {
        this.lnr = SystemClock.elapsedRealtime();
    }

    public long rdp() {
        return this.f16511ud;
    }

    public void rq() {
        this.f16512wd = SystemClock.elapsedRealtime();
    }

    public long to() {
        return this.f16512wd;
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.qdl + ", asyncCallExecTs=" + this.f16511ud + ", requestStartExecTs=" + this.lnr + ", requestConnectStartTs=" + this.mml + ", requestConnectFinishTs=" + this.mzz + ", reqCallServerStartTs=" + this.f16512wd + ", reqCallServerFinishTs=" + this.jpc + '}';
    }

    public long tvp() {
        return this.mzz;
    }

    public void ud() {
        this.mml = SystemClock.elapsedRealtime();
    }

    public long wd() {
        return this.lnr;
    }
}
