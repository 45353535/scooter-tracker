package hb;

import android.util.Pair;
import cb.l;
import oa.m0;
import oa.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f73072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f73073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73074c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f73072a = jArr;
        this.f73073b = jArr2;
        this.f73074c = j10 == -9223372036854775807L ? o0.P0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f6674e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f6672c + lVar.f6674e[i12]);
            j12 += (long) (lVar.f6673d + lVar.f6675f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair b(long j10, long[] jArr, long[] jArr2) {
        int iH = o0.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // hb.g
    public int getAverageBitrate() {
        return -2147483647;
    }

    @Override // hb.g
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f73074c;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        Pair pairB = b(o0.q1(o0.q(j10, 0L, this.f73074c)), this.f73073b, this.f73072a);
        return new m0.a(new n0(o0.P0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // hb.g
    public long getTimeUs(long j10) {
        return o0.P0(((Long) b(j10, this.f73072a, this.f73073b).second).longValue());
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }
}
