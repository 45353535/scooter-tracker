package com.my.tracker.obfuscated;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f61866b;

    public v1(int i10, long j10) {
        this.f61865a = i10;
        this.f61866b = j10;
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.f61865a;
    }

    @Override // com.my.tracker.obfuscated.u1
    public void b(long j10) {
        this.f61866b = j10;
    }

    @Override // com.my.tracker.obfuscated.u1
    public long e() {
        return this.f61866b;
    }
}
