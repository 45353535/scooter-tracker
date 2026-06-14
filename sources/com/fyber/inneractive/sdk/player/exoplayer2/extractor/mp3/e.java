package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f22089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22091f;

    public e(long j10, long j11, long j12, long[] jArr, long j13, int i10) {
        this.f22086a = j10;
        this.f22087b = j11;
        this.f22088c = j12;
        this.f22089d = jArr;
        this.f22090e = j13;
        this.f22091f = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f22089d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        if (!a()) {
            return 0L;
        }
        if (j10 < this.f22086a) {
            return 0L;
        }
        double d10 = ((j10 - r4) * 256.0d) / this.f22090e;
        int iA = z.a(this.f22089d, (long) d10, false);
        int i10 = iA + 1;
        long j11 = (((long) i10) * this.f22087b) / 100;
        long j12 = i10 == 0 ? 0L : this.f22089d[iA];
        return j11 + ((i10 == 99 ? 256L : this.f22089d[i10]) == j12 ? 0L : (long) (((d10 - j12) * (((r7 * ((long) (iA + 2))) / 100) - j11)) / (r16 - j12)));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f22087b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (!a()) {
            return this.f22086a;
        }
        float f10 = (j10 * 100.0f) / this.f22087b;
        if (f10 > 0.0f) {
            if (f10 >= 100.0f) {
                f = 256.0f;
            } else {
                int i10 = (int) f10;
                f = i10 != 0 ? this.f22089d[i10 - 1] : 0.0f;
                f += (f10 - i10) * ((i10 < 99 ? this.f22089d[i10] : 256.0f) - f);
            }
        }
        long jRound = Math.round(((double) f) * 0.00390625d * this.f22090e);
        long j11 = this.f22086a;
        long j12 = jRound + j11;
        long j13 = this.f22088c;
        return Math.min(j12, j13 != -1 ? j13 - 1 : ((j11 - ((long) this.f22091f)) + this.f22090e) - 1);
    }
}
