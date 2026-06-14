package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f82415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f82416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f82417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f82418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f82419e;

    public void a(long j10, long j11, boolean z10, boolean z11) {
        this.f82419e += j10;
        if (z11) {
            this.f82418d += j11;
            this.f82416b++;
        } else if (z10) {
            this.f82417c += j11;
            this.f82415a++;
        }
    }

    public int b() {
        return this.f82416b;
    }

    public long c() {
        return this.f82418d;
    }

    public int d() {
        return this.f82415a;
    }

    public long e() {
        return this.f82417c;
    }

    public int f() {
        return this.f82415a + this.f82416b;
    }

    public long g() {
        return this.f82419e;
    }
}
