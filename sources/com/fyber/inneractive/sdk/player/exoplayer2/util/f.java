package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23111d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(136);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.f23108a = mVar.a(20);
        this.f23109b = mVar.a(3) + 1;
        this.f23110c = mVar.a(5) + 1;
        this.f23111d = ((((long) mVar.a(4)) & 15) << 32) | (((long) mVar.a(32)) & 4294967295L);
    }
}
