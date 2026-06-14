package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f22083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22085c;

    public d(long[] jArr, long[] jArr2, long j10) {
        this.f22083a = jArr;
        this.f22084b = jArr2;
        this.f22085c = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return this.f22083a[z.a(this.f22084b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f22085c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f22084b[z.a(this.f22083a, j10, true)];
    }
}
