package hb;

import oa.i0;
import oa.m0;
import oa.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f73113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f73114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f73115g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f73105c;
        if (j11 == -1 || (jArr = iVar.f73108f) == null) {
            i0.a aVar = iVar.f73103a;
            return new j(j10, aVar.f96571c, jA, aVar.f96574f);
        }
        i0.a aVar2 = iVar.f73103a;
        return new j(j10, aVar2.f96571c, jA, aVar2.f96574f, j11, jArr);
    }

    private long b(int i10) {
        return (this.f73111c * ((long) i10)) / 100;
    }

    @Override // hb.g
    public int getAverageBitrate() {
        return this.f73112d;
    }

    @Override // hb.g
    public long getDataEndPosition() {
        return this.f73114f;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f73111c;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new m0.a(new n0(0L, this.f73109a + ((long) this.f73110b)));
        }
        long jQ = o0.q(j10, 0L, this.f73111c);
        double d10 = (jQ * 100.0d) / this.f73111c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) q9.a.i(this.f73115g))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new m0.a(new n0(jQ, this.f73109a + o0.q(Math.round((d11 / 256.0d) * this.f73113e), this.f73110b, this.f73113e - 1)));
    }

    @Override // hb.g
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f73109a;
        if (!isSeekable() || j11 <= this.f73110b) {
            return 0L;
        }
        long[] jArr = (long[]) q9.a.i(this.f73115g);
        double d10 = (j11 * 256.0d) / this.f73113e;
        int iH = o0.h(jArr, (long) d10, true, true);
        long jB = b(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jB2 = b(i10);
        return jB + Math.round((j12 == (iH == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return this.f73115g != null;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f73109a = j10;
        this.f73110b = i10;
        this.f73111c = j11;
        this.f73112d = i11;
        this.f73113e = j12;
        this.f73115g = jArr;
        this.f73114f = j12 != -1 ? j10 + j12 : -1L;
    }
}
