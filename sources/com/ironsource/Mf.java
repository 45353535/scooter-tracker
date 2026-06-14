package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public class Mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f41332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f41333c;

    public long a() {
        return Math.max(0L, this.f41331a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f41333c = j10;
        this.f41331a += j10 - this.f41332b;
    }

    public void c(long j10) {
        this.f41332b = j10;
        this.f41333c = 0L;
    }

    public void a(long j10) {
        this.f41331a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f41331a = 0L;
        this.f41332b = 0L;
        this.f41333c = 0L;
    }
}
