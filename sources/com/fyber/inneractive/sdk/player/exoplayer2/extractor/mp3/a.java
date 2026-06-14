package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22067c;

    public a(int i10, long j10, long j11) {
        this.f22065a = j10;
        this.f22066b = i10;
        this.f22067c = j11 == -1 ? -9223372036854775807L : b(j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f22067c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f22065a) * 8000000) / ((long) this.f22066b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f22067c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        long j11 = this.f22067c;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        int i10 = z.f23162a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        return ((jMax * ((long) this.f22066b)) / 8000000) + this.f22065a;
    }
}
