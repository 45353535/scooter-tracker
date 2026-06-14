package io.bidmachine.media3.exoplayer.hls;

import android.os.Looper;
import ba.f;
import ba.k;
import ga.c0;
import ga.f0;
import ga.f1;
import ga.n0;
import java.util.List;
import ka.m;
import lb.t;
import n9.r;
import n9.s;
import q9.o0;
import s9.g;
import s9.y;
import z9.w;
import z9.z;

/* JADX INFO: loaded from: classes12.dex */
public final class HlsMediaSource extends ga.a implements k.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aa.e f80904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aa.d f80905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ga.j f80906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f80907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f80908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f80909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f80910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f80911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ba.k f80912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f80913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f80914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private r.g f80915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y f80916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private r f80917u;

    public static final class Factory implements f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final aa.d f80918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private aa.e f80919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f80920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f80921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f80922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ba.j f80923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k.a f80924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ga.j f80925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private z f80926i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private m f80927j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f80928k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f80929l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f80930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f80931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f80932o;

        public Factory(g.a aVar) {
            this(new aa.b(aVar));
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource e(r rVar) {
            q9.a.e(rVar.f95455b);
            if (this.f80919b == null) {
                this.f80919b = new aa.c();
            }
            t.a aVar = this.f80920c;
            if (aVar != null) {
                this.f80919b.a(aVar);
            }
            this.f80919b.experimentalParseSubtitlesDuringExtraction(this.f80921d);
            this.f80919b.b(this.f80922e);
            aa.e eVar = this.f80919b;
            ba.j eVar2 = this.f80923f;
            List list = rVar.f95455b.f95550d;
            if (!list.isEmpty()) {
                eVar2 = new ba.e(eVar2, list);
            }
            aa.d dVar = this.f80918a;
            ga.j jVar = this.f80925h;
            w wVarA = this.f80926i.a(rVar);
            m mVar = this.f80927j;
            return new HlsMediaSource(rVar, dVar, eVar, jVar, null, wVarA, mVar, this.f80924g.a(this.f80918a, mVar, eVar2, null), this.f80931n, this.f80928k, this.f80929l, this.f80930m, this.f80932o);
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f80921d = z10;
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f80922e = i10;
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory d(z zVar) {
            this.f80926i = (z) q9.a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(m mVar) {
            this.f80927j = (m) q9.a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory a(t.a aVar) {
            this.f80920c = aVar;
            return this;
        }

        public Factory(aa.d dVar) {
            this.f80918a = (aa.d) q9.a.e(dVar);
            this.f80926i = new z9.l();
            this.f80923f = new ba.a();
            this.f80924g = ba.c.f5970q;
            this.f80927j = new ka.k();
            this.f80925h = new ga.k();
            this.f80929l = 1;
            this.f80931n = -9223372036854775807L;
            this.f80928k = true;
            experimentalParseSubtitlesDuringExtraction(true);
        }
    }

    static {
        s.a("media3.exoplayer.hls");
    }

    private static f.d A(List list, long j10) {
        f.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f.d dVar2 = (f.d) list.get(i10);
            long j11 = dVar2.f6052f;
            if (j11 > j10 || !dVar2.f6041m) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private static f.C0130f B(List list, long j10) {
        return (f.C0130f) list.get(o0.e(list, Long.valueOf(j10), true, true));
    }

    private long C(ba.f fVar) {
        if (fVar.f6015p) {
            return o0.P0(o0.h0(this.f80913q)) - fVar.d();
        }
        return 0L;
    }

    private long D(ba.f fVar, long j10) {
        long jP0 = fVar.f6004e;
        if (jP0 == -9223372036854775807L) {
            jP0 = (fVar.f6020u + j10) - o0.P0(this.f80915s.f95529a);
        }
        if (fVar.f6006g) {
            return jP0;
        }
        f.d dVarA = A(fVar.f6018s, jP0);
        if (dVarA != null) {
            return dVarA.f6052f;
        }
        if (fVar.f6017r.isEmpty()) {
            return 0L;
        }
        f.C0130f c0130fB = B(fVar.f6017r, jP0);
        f.d dVarA2 = A(c0130fB.f6047n, jP0);
        return dVarA2 != null ? dVarA2.f6052f : c0130fB.f6052f;
    }

    private static long E(ba.f fVar, long j10) {
        long j11;
        f.h hVar = fVar.f6021v;
        long j12 = fVar.f6004e;
        if (j12 != -9223372036854775807L) {
            j11 = fVar.f6020u - j12;
        } else {
            long j13 = hVar.f6062d;
            if (j13 == -9223372036854775807L || fVar.f6013n == -9223372036854775807L) {
                long j14 = hVar.f6061c;
                j11 = j14 != -9223372036854775807L ? j14 : fVar.f6012m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(ba.f r5, long r6) {
        /*
            r4 = this;
            n9.r r0 = r4.getMediaItem()
            n9.r$g r0 = r0.f95457d
            float r1 = r0.f95532d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f95533e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            ba.f$h r5 = r5.f6021v
            long r0 = r5.f6061c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f6062d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            n9.r$g$a r0 = new n9.r$g$a
            r0.<init>()
            long r6 = q9.o0.q1(r6)
            n9.r$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            n9.r$g r0 = r4.f80915s
            float r0 = r0.f95532d
        L42:
            n9.r$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            n9.r$g r5 = r4.f80915s
            float r7 = r5.f95533e
        L4d:
            n9.r$g$a r5 = r6.h(r7)
            n9.r$g r5 = r5.f()
            r4.f80915s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.hls.HlsMediaSource.F(ba.f, long):void");
    }

    private f1 y(ba.f fVar, long j10, long j11, d dVar) {
        long initialStartTimeUs = fVar.f6007h - this.f80912p.getInitialStartTimeUs();
        long j12 = fVar.f6014o ? initialStartTimeUs + fVar.f6020u : -9223372036854775807L;
        long jC = C(fVar);
        long j13 = this.f80915s.f95529a;
        F(fVar, o0.q(j13 != -9223372036854775807L ? o0.P0(j13) : E(fVar, jC), jC, fVar.f6020u + jC));
        return new f1(j10, j11, -9223372036854775807L, j12, fVar.f6020u, initialStartTimeUs, D(fVar, jC), true, !fVar.f6014o, fVar.f6003d == 2 && fVar.f6005f, dVar, getMediaItem(), this.f80915s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private ga.f1 z(ba.f r25, long r26, long r28, io.bidmachine.media3.exoplayer.hls.d r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f6004e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            java.util.List r1 = r0.f6017r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.f6006g
            if (r1 != 0) goto L2e
            long r1 = r0.f6004e
            long r3 = r0.f6020u
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L23
            goto L2e
        L23:
            java.util.List r3 = r0.f6017r
            ba.f$f r1 = B(r3, r1)
            long r1 = r1.f6052f
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.f6004e
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            ga.f1 r3 = new ga.f1
            long r10 = r0.f6020u
            n9.r r22 = r24.getMediaItem()
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r12 = r10
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.hls.HlsMediaSource.z(ba.f, long, long, io.bidmachine.media3.exoplayer.hls.d):ga.f1");
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        ((g) c0Var).s();
    }

    @Override // ba.k.e
    public void d(ba.f fVar) {
        long jQ1 = fVar.f6015p ? o0.q1(fVar.f6007h) : -9223372036854775807L;
        int i10 = fVar.f6003d;
        long j10 = (i10 == 2 || i10 == 1) ? jQ1 : -9223372036854775807L;
        d dVar = new d((ba.g) q9.a.e(this.f80912p.getMultivariantPlaylist()), fVar);
        w(this.f80912p.isLive() ? y(fVar, j10, jQ1, dVar) : z(fVar, j10, jQ1, dVar));
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        n0.a aVarQ = q(bVar);
        return new g(this.f80904h, this.f80912p, this.f80905i, this.f80916t, null, this.f80907k, o(bVar), this.f80908l, aVarQ, bVar2, this.f80906j, this.f80909m, this.f80910n, this.f80911o, t(), this.f80914r);
    }

    @Override // ga.f0
    public synchronized r getMediaItem() {
        return this.f80917u;
    }

    @Override // ga.a, ga.f0
    public synchronized void h(r rVar) {
        this.f80917u = rVar;
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
        this.f80912p.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // ga.a
    protected void v(y yVar) {
        this.f80916t = yVar;
        this.f80907k.c((Looper) q9.a.e(Looper.myLooper()), t());
        this.f80907k.prepare();
        this.f80912p.b(((r.h) q9.a.e(getMediaItem().f95455b)).f95547a, q(null), this);
    }

    @Override // ga.a
    protected void x() {
        this.f80912p.stop();
        this.f80907k.release();
    }

    private HlsMediaSource(r rVar, aa.d dVar, aa.e eVar, ga.j jVar, ka.f fVar, w wVar, m mVar, ba.k kVar, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f80917u = rVar;
        this.f80915s = rVar.f95457d;
        this.f80905i = dVar;
        this.f80904h = eVar;
        this.f80906j = jVar;
        this.f80907k = wVar;
        this.f80908l = mVar;
        this.f80912p = kVar;
        this.f80913q = j10;
        this.f80909m = z10;
        this.f80910n = i10;
        this.f80911o = z11;
        this.f80914r = j11;
    }
}
