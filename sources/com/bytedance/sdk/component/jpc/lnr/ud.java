package com.bytedance.sdk.component.jpc.lnr;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ud implements Comparable<ud>, Runnable {
    private Runnable lnr;
    private long mml;
    private long mo;
    private long mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16494ud;

    public ud(String str) {
        this.qdl = 5;
        this.f16494ud = str;
    }

    public long lnr() {
        return this.mml;
    }

    public long mml() {
        return this.mzz;
    }

    public Runnable mo() {
        return this.lnr;
    }

    public long mzz() {
        return this.mo;
    }

    public void qdl(int i10) {
        this.qdl = i10;
    }

    public String ud() {
        return this.f16494ud;
    }

    public void lnr(long j10) {
        this.mo = j10;
    }

    public int qdl() {
        return this.qdl;
    }

    public void ud(long j10) {
        this.mzz = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(ud udVar) {
        if (qdl() < udVar.qdl()) {
            return 1;
        }
        return qdl() >= udVar.qdl() ? -1 : 0;
    }

    public ud(int i10, String str) {
        this.qdl = i10;
        this.f16494ud = str;
    }

    public void qdl(long j10) {
        this.mml = j10;
    }

    public ud(String str, Runnable runnable) {
        this.qdl = 5;
        this.f16494ud = str;
        this.lnr = runnable;
    }
}
