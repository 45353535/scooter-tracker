package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f22325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22326c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22327d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f22328e;

    public c(d dVar) {
        this.f22328e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        long j11 = (((long) this.f22328e.f22358i) * j10) / 1000000;
        this.f22327d = this.f22324a[z.a(this.f22324a, j11, true)];
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j10 = this.f22327d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f22327d = -1L;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f22326c + this.f22325b[z.a(this.f22324a, (((long) this.f22328e.f22358i) * j10) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f22328e.f22329n;
        return (fVar.f23111d * 1000000) / ((long) fVar.f23108a);
    }
}
