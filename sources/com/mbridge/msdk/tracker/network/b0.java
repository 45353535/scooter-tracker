package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f51861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51864d;

    public b0() {
        this.f51863c = 0;
        this.f51864d = "";
        this.f51861a = null;
    }

    void a(long j10) {
        this.f51862b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f51863c;
    }

    public void a(int i10) {
        this.f51863c = i10;
    }

    public b0(q qVar) {
        this.f51863c = 0;
        this.f51864d = "";
        this.f51861a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f51863c = 0;
        this.f51864d = "";
        this.f51861a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f51863c = 0;
        this.f51864d = "";
        this.f51861a = null;
    }
}
