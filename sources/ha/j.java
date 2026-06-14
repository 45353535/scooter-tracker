package ha;

import ha.f;
import n9.w;
import oa.s0;
import q9.d0;
import s9.x;

/* JADX INFO: loaded from: classes12.dex */
public class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f73045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f73046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f73047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f73048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f73049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f73050t;

    public j(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(gVar, kVar, aVar, i10, obj, j10, j11, j12, j13, j14);
        this.f73045o = i11;
        this.f73046p = j15;
        this.f73047q = fVar;
    }

    private void k(c cVar) {
        if (w.q(this.f73007d.f80560n)) {
            io.bidmachine.media3.common.a aVar = this.f73007d;
            int i10 = aVar.L;
            if ((i10 <= 1 && aVar.M <= 1) || i10 == -1 || aVar.M == -1) {
                return;
            }
            s0 s0VarTrack = cVar.track(0, 4);
            io.bidmachine.media3.common.a aVar2 = this.f73007d;
            int i11 = aVar2.L * aVar2.M;
            long j10 = (this.f73011h - this.f73010g) / ((long) i11);
            for (int i12 = 1; i12 < i11; i12++) {
                s0VarTrack.c(new d0(), 0);
                s0VarTrack.e(((long) i12) * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // ka.o.e
    public final void cancelLoad() {
        this.f73049s = true;
    }

    @Override // ha.m
    public long e() {
        return this.f73058j + ((long) this.f73045o);
    }

    @Override // ha.m
    public boolean f() {
        return this.f73050t;
    }

    @Override // ka.o.e
    public final void load() {
        c cVarH = h();
        if (this.f73048r == 0) {
            cVarH.b(this.f73046p);
            f fVar = this.f73047q;
            f.b bVarJ = j(cVarH);
            long j10 = this.f72974k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f73046p;
            long j12 = this.f72975l;
            fVar.b(bVarJ, j11, j12 != -9223372036854775807L ? j12 - this.f73046p : -9223372036854775807L);
        }
        try {
            s9.k kVarE = this.f73005b.e(this.f73048r);
            x xVar = this.f73012i;
            oa.j jVar = new oa.j(xVar, kVarE.f99825g, xVar.b(kVarE));
            do {
                try {
                    if (this.f73049s) {
                        break;
                    }
                } finally {
                    this.f73048r = jVar.getPosition() - this.f73005b.f99825g;
                }
            } while (this.f73047q.a(jVar));
            k(cVarH);
            this.f73048r = jVar.getPosition() - this.f73005b.f99825g;
            l();
            s9.j.a(this.f73012i);
            this.f73050t = !this.f73049s;
        } catch (Throwable th2) {
            l();
            s9.j.a(this.f73012i);
            throw th2;
        }
    }

    protected void l() {
    }

    protected f.b j(c cVar) {
        return cVar;
    }
}
