package jb;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import n9.x;
import oa.m0;
import oa.n0;
import oa.s;
import oa.u;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f85700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f85701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f85702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f85703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f85704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f85705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f85706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f85707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f85708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f85709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f85710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f85711l;

    private final class b implements m0 {
        private b() {
        }

        @Override // oa.m0
        public long getDurationUs() {
            return a.this.f85703d.b(a.this.f85705f);
        }

        @Override // oa.m0
        public m0.a getSeekPoints(long j10) {
            return new m0.a(new n0(j10, o0.q((a.this.f85701b + BigInteger.valueOf(a.this.f85703d.c(j10)).multiply(BigInteger.valueOf(a.this.f85702c - a.this.f85701b)).divide(BigInteger.valueOf(a.this.f85705f)).longValue()) - 30000, a.this.f85701b, a.this.f85702c - 1)));
        }

        @Override // oa.m0
        public boolean isSeekable() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        q9.a.a(j10 >= 0 && j11 > j10);
        this.f85703d = iVar;
        this.f85701b = j10;
        this.f85702c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f85705f = j13;
            this.f85704e = 4;
        } else {
            this.f85704e = 0;
        }
        this.f85700a = new f();
    }

    private long g(s sVar) throws IOException {
        if (this.f85708i == this.f85709j) {
            return -1L;
        }
        long position = sVar.getPosition();
        if (!this.f85700a.d(sVar, this.f85709j)) {
            long j10 = this.f85708i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f85700a.a(sVar, false);
        sVar.resetPeekPosition();
        long j11 = this.f85707h;
        f fVar = this.f85700a;
        long j12 = fVar.f85730c;
        long j13 = j11 - j12;
        int i10 = fVar.f85735h + fVar.f85736i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f85709j = position;
            this.f85711l = j12;
        } else {
            this.f85708i = sVar.getPosition() + ((long) i10);
            this.f85710k = this.f85700a.f85730c;
        }
        long j14 = this.f85709j;
        long j15 = this.f85708i;
        if (j14 - j15 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.f85709j = j15;
            return j15;
        }
        long position2 = sVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f85709j;
        long j17 = this.f85708i;
        return o0.q(position2 + ((j13 * (j16 - j17)) / (this.f85711l - this.f85710k)), j17, j16 - 1);
    }

    private void i(s sVar) throws x {
        while (true) {
            this.f85700a.c(sVar);
            this.f85700a.a(sVar, false);
            f fVar = this.f85700a;
            if (fVar.f85730c > this.f85707h) {
                sVar.resetPeekPosition();
                return;
            } else {
                sVar.skipFully(fVar.f85735h + fVar.f85736i);
                this.f85708i = sVar.getPosition();
                this.f85710k = this.f85700a.f85730c;
            }
        }
    }

    @Override // jb.g
    public long a(s sVar) throws IOException {
        int i10 = this.f85704e;
        if (i10 == 0) {
            long position = sVar.getPosition();
            this.f85706g = position;
            this.f85704e = 1;
            long j10 = this.f85702c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(sVar);
                if (jG != -1) {
                    return jG;
                }
                this.f85704e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            i(sVar);
            this.f85704e = 4;
            return -(this.f85710k + 2);
        }
        this.f85705f = h(sVar);
        this.f85704e = 4;
        return this.f85706g;
    }

    @Override // jb.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f85705f != 0) {
            return new b();
        }
        return null;
    }

    long h(s sVar) throws x, EOFException {
        this.f85700a.b();
        if (!this.f85700a.c(sVar)) {
            throw new EOFException();
        }
        this.f85700a.a(sVar, false);
        f fVar = this.f85700a;
        sVar.skipFully(fVar.f85735h + fVar.f85736i);
        long j10 = this.f85700a.f85730c;
        while (true) {
            f fVar2 = this.f85700a;
            if ((fVar2.f85729b & 4) == 4 || !fVar2.c(sVar) || sVar.getPosition() >= this.f85702c || !this.f85700a.a(sVar, true)) {
                break;
            }
            f fVar3 = this.f85700a;
            if (!u.e(sVar, fVar3.f85735h + fVar3.f85736i)) {
                break;
            }
            j10 = this.f85700a.f85730c;
        }
        return j10;
    }

    @Override // jb.g
    public void startSeek(long j10) {
        this.f85707h = o0.q(j10, 0L, this.f85705f - 1);
        this.f85704e = 2;
        this.f85708i = this.f85701b;
        this.f85709j = this.f85702c;
        this.f85710k = 0L;
        this.f85711l = this.f85705f;
    }
}
