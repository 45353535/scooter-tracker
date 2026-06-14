package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.primitives.Longs;
import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements u9.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f81063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f81064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f81066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f81067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f81068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f81069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f81070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f81071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f81072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f81074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f81075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f81076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f81077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f81078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f81079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f81080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f81081s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f81082a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f81083b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f81084c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f81085d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f81086e = q9.o0.P0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f81087f = q9.o0.P0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f81088g = 0.999f;

        public i a() {
            return new i(this.f81082a, this.f81083b, this.f81084c, this.f81085d, this.f81086e, this.f81087f, this.f81088g);
        }
    }

    private void b(long j10) {
        long j11 = this.f81080r + (this.f81081s * 3);
        if (this.f81075m > j11) {
            float fP0 = q9.o0.P0(this.f81065c);
            this.f81075m = Longs.max(j11, this.f81072j, this.f81075m - (((long) ((this.f81078p - 1.0f) * fP0)) + ((long) ((this.f81076n - 1.0f) * fP0))));
            return;
        }
        long jQ = q9.o0.q(j10 - ((long) (Math.max(0.0f, this.f81078p - 1.0f) / this.f81066d)), this.f81075m, j11);
        this.f81075m = jQ;
        long j12 = this.f81074l;
        if (j12 == -9223372036854775807L || jQ <= j12) {
            return;
        }
        this.f81075m = j12;
    }

    private void c() {
        long j10;
        long j11 = this.f81070h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f81071i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f81073k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f81074l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f81072j == j10) {
            return;
        }
        this.f81072j = j10;
        this.f81075m = j10;
        this.f81080r = -9223372036854775807L;
        this.f81081s = -9223372036854775807L;
        this.f81079q = -9223372036854775807L;
    }

    private static long d(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void e(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f81080r;
        if (j13 == -9223372036854775807L) {
            this.f81080r = j12;
            this.f81081s = 0L;
        } else {
            long jMax = Math.max(j12, d(j13, j12, this.f81069g));
            this.f81080r = jMax;
            this.f81081s = d(this.f81081s, Math.abs(j12 - jMax), this.f81069g);
        }
    }

    @Override // u9.e0
    public void a(r.g gVar) {
        this.f81070h = q9.o0.P0(gVar.f95529a);
        this.f81073k = q9.o0.P0(gVar.f95530b);
        this.f81074l = q9.o0.P0(gVar.f95531c);
        float f10 = gVar.f95532d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f81063a;
        }
        this.f81077o = f10;
        float f11 = gVar.f95533e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f81064b;
        }
        this.f81076n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f81070h = -9223372036854775807L;
        }
        c();
    }

    @Override // u9.e0
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.f81070h == -9223372036854775807L) {
            return 1.0f;
        }
        e(j10, j11);
        if (this.f81079q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f81079q < this.f81065c) {
            return this.f81078p;
        }
        this.f81079q = SystemClock.elapsedRealtime();
        b(j10);
        long j12 = j10 - this.f81075m;
        if (Math.abs(j12) < this.f81067e) {
            this.f81078p = 1.0f;
        } else {
            this.f81078p = q9.o0.o((this.f81066d * j12) + 1.0f, this.f81077o, this.f81076n);
        }
        return this.f81078p;
    }

    @Override // u9.e0
    public long getTargetLiveOffsetUs() {
        return this.f81075m;
    }

    @Override // u9.e0
    public void notifyRebuffer() {
        long j10 = this.f81075m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f81068f;
        this.f81075m = j11;
        long j12 = this.f81074l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f81075m = j12;
        }
        this.f81079q = -9223372036854775807L;
    }

    @Override // u9.e0
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.f81071i = j10;
        c();
    }

    private i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f81063a = f10;
        this.f81064b = f11;
        this.f81065c = j10;
        this.f81066d = f12;
        this.f81067e = j11;
        this.f81068f = j12;
        this.f81069g = f13;
        this.f81070h = -9223372036854775807L;
        this.f81071i = -9223372036854775807L;
        this.f81073k = -9223372036854775807L;
        this.f81074l = -9223372036854775807L;
        this.f81077o = f10;
        this.f81076n = f11;
        this.f81078p = 1.0f;
        this.f81079q = -9223372036854775807L;
        this.f81072j = -9223372036854775807L;
        this.f81075m = -9223372036854775807L;
        this.f81080r = -9223372036854775807L;
        this.f81081s = -9223372036854775807L;
    }
}
