package ha;

import oa.s0;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f73060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f73061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f73062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f73063r;

    public o(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, int i11, io.bidmachine.media3.common.a aVar2) {
        super(gVar, kVar, aVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f73060o = i11;
        this.f73061p = aVar2;
    }

    @Override // ha.m
    public boolean f() {
        return this.f73063r;
    }

    @Override // ka.o.e
    public void load() {
        c cVarH = h();
        cVarH.b(0L);
        s0 s0VarTrack = cVarH.track(0, this.f73060o);
        s0VarTrack.f(this.f73061p);
        try {
            long jB = this.f73012i.b(this.f73005b.e(this.f73062q));
            if (jB != -1) {
                jB += this.f73062q;
            }
            oa.j jVar = new oa.j(this.f73012i, this.f73062q, jB);
            for (int iB = 0; iB != -1; iB = s0VarTrack.b(jVar, Integer.MAX_VALUE, true)) {
                this.f73062q += (long) iB;
            }
            s0VarTrack.e(this.f73010g, 1, (int) this.f73062q, 0, null);
            s9.j.a(this.f73012i);
            this.f73063r = true;
        } catch (Throwable th2) {
            s9.j.a(this.f73012i);
            throw th2;
        }
    }

    @Override // ka.o.e
    public void cancelLoad() {
    }
}
