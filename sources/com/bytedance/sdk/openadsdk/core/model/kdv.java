package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.mrf;

/* JADX INFO: loaded from: classes6.dex */
public class kdv {
    private int exu;
    private long fs;
    private long jpc;
    private mrf lnr = mrf.lnr();
    private mrf mml = mrf.lnr();
    private long mo;
    private long mzz;
    public boolean qdl;
    private int rq;
    private long to;
    private long tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public long f17361ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private long f17362wd;

    public int jpc() {
        return this.rq;
    }

    public long lnr() {
        return this.mo;
    }

    public long mml() {
        return this.f17362wd;
    }

    public long mo() {
        return this.tvp;
    }

    public long mzz() {
        return this.jpc;
    }

    public void qdl(mrf mrfVar, mrf mrfVar2, int i10, mrf mrfVar3) {
        this.mzz = mrfVar.qdl(this.lnr);
        this.mo = mrfVar2.qdl(mrfVar);
        this.f17362wd = i10;
        this.jpc = mrfVar3.qdl(mrfVar2);
    }

    public synchronized long to() {
        return this.exu;
    }

    public long tvp() {
        return this.fs;
    }

    public void ud(mrf mrfVar) {
        this.mml = mrfVar;
        this.tvp = mrfVar.qdl(this.lnr);
    }

    public long wd() {
        return this.to;
    }

    public long ud() {
        return this.mzz;
    }

    public void ud(long j10) {
        this.fs = j10;
    }

    public void qdl(mrf mrfVar) {
        this.lnr = mrfVar;
    }

    public synchronized void ud(int i10) {
        this.exu = i10;
    }

    public mrf qdl() {
        return this.lnr;
    }

    public void qdl(long j10) {
        this.to = j10;
    }

    public void qdl(int i10) {
        this.rq = i10;
    }
}
