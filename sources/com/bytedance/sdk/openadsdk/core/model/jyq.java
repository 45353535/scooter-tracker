package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes6.dex */
public class jyq {
    private long qdl = 10000;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17360ud = 10000;
    private long lnr = 10;
    private long mml = 20;
    private String mzz = "";

    public long lnr() {
        return this.lnr;
    }

    public long mml() {
        return this.mml;
    }

    public String mzz() {
        return this.mzz;
    }

    public long qdl() {
        return this.qdl;
    }

    public long ud() {
        return this.f17360ud;
    }

    public void lnr(long j10) {
        if (j10 <= 0) {
            this.lnr = 10L;
        } else {
            this.lnr = j10;
        }
    }

    public void mml(long j10) {
        if (j10 < 0) {
            this.mml = 20L;
        } else {
            this.mml = j10;
        }
    }

    public void qdl(long j10) {
        if (j10 <= 0) {
            this.qdl = 10L;
        } else {
            this.qdl = j10;
        }
    }

    public void ud(long j10) {
        if (j10 < 0) {
            this.f17360ud = 20L;
        } else {
            this.f17360ud = j10;
        }
    }

    public void qdl(String str) {
        this.mzz = str;
    }
}
