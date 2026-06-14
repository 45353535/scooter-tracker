package qa;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.collect.UnmodifiableIterator;
import io.bidmachine.media3.common.a;
import java.util.ArrayList;
import java.util.List;
import lb.t;
import n9.w;
import n9.x;
import oa.j0;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import q9.d0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f98901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f98902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f98903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f98904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private oa.t f98906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qa.c f98907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f98908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f98909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f98910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f98911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f98912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f98913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f98914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f98915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f98916p;

    /* JADX INFO: renamed from: qa.b$b, reason: collision with other inner class name */
    private class C1169b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f98917a;

        public C1169b(long j10) {
            this.f98917a = j10;
        }

        @Override // oa.m0
        public long getDurationUs() {
            return this.f98917a;
        }

        @Override // oa.m0
        public m0.a getSeekPoints(long j10) {
            m0.a aVarI = b.this.f98909i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f98909i.length; i10++) {
                m0.a aVarI2 = b.this.f98909i[i10].i(j10);
                if (aVarI2.f96607a.f96614b < aVarI.f96607a.f96614b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // oa.m0
        public boolean isSeekable() {
            return true;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f98921c;

        private c() {
        }

        public void a(d0 d0Var) {
            this.f98919a = d0Var.u();
            this.f98920b = d0Var.u();
            this.f98921c = 0;
        }

        public void b(d0 d0Var) throws x {
            a(d0Var);
            if (this.f98919a == 1414744396) {
                this.f98921c = d0Var.u();
                return;
            }
            throw x.a("LIST expected, found: " + this.f98919a, null);
        }
    }

    public b(int i10, t.a aVar) {
        this.f98904d = aVar;
        this.f98903c = (i10 & 1) == 0;
        this.f98901a = new d0(12);
        this.f98902b = new c();
        this.f98906f = new j0();
        this.f98909i = new e[0];
        this.f98913m = -1L;
        this.f98914n = -1L;
        this.f98912l = -1;
        this.f98908h = -9223372036854775807L;
    }

    private static void e(s sVar) {
        if ((sVar.getPosition() & 1) == 1) {
            sVar.skipFully(1);
        }
    }

    private e f(int i10) {
        for (e eVar : this.f98909i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void g(d0 d0Var) throws x {
        f fVarC = f.c(1819436136, d0Var);
        if (fVarC.getType() != 1819436136) {
            throw x.a("Unexpected header list type " + fVarC.getType(), null);
        }
        qa.c cVar = (qa.c) fVarC.b(qa.c.class);
        if (cVar == null) {
            throw x.a("AviHeader not found", null);
        }
        this.f98907g = cVar;
        this.f98908h = ((long) cVar.f98924c) * ((long) cVar.f98922a);
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it = fVarC.f98947a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            qa.a aVar = (qa.a) it.next();
            if (aVar.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarJ = j((f) aVar, i10);
                if (eVarJ != null) {
                    arrayList.add(eVarJ);
                }
                i10 = i11;
            }
        }
        this.f98909i = (e[]) arrayList.toArray(new e[0]);
        this.f98906f.endTracks();
    }

    private void h(d0 d0Var) {
        int i10;
        long jI = i(d0Var);
        while (true) {
            if (d0Var.a() < 16) {
                break;
            }
            int iU = d0Var.u();
            int iU2 = d0Var.u();
            long jU = ((long) d0Var.u()) + jI;
            d0Var.X(4);
            e eVarF = f(iU);
            if (eVarF != null) {
                eVarF.b(jU, (iU2 & 16) == 16);
            }
        }
        for (e eVar : this.f98909i) {
            eVar.c();
        }
        this.f98916p = true;
        if (this.f98909i.length == 0) {
            this.f98906f.e(new m0.b(this.f98908h));
        } else {
            this.f98906f.e(new C1169b(this.f98908h));
        }
    }

    private long i(d0 d0Var) {
        if (d0Var.a() < 16) {
            return 0L;
        }
        int iF = d0Var.f();
        d0Var.X(8);
        long jU = d0Var.u();
        long j10 = this.f98913m;
        long j11 = jU <= j10 ? 8 + j10 : 0L;
        d0Var.W(iF);
        return j11;
    }

    private e j(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            u.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            u.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        io.bidmachine.media3.common.a aVar = gVar.f98949a;
        a.b bVarB = aVar.b();
        bVarB.e0(i10);
        int i11 = dVar.f98931f;
        if (i11 != 0) {
            bVarB.k0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.h0(hVar.f98950a);
        }
        int iK = w.k(aVar.f80561o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        s0 s0VarTrack = this.f98906f.track(i10, iK);
        s0VarTrack.f(bVarB.N());
        s0VarTrack.d(jA);
        this.f98908h = Math.max(this.f98908h, jA);
        return new e(i10, dVar, s0VarTrack);
    }

    private int k(s sVar) {
        if (sVar.getPosition() >= this.f98914n) {
            return -1;
        }
        e eVar = this.f98911k;
        if (eVar == null) {
            e(sVar);
            sVar.peekFully(this.f98901a.e(), 0, 12);
            this.f98901a.W(0);
            int iU = this.f98901a.u();
            if (iU == 1414744396) {
                this.f98901a.W(8);
                sVar.skipFully(this.f98901a.u() != 1769369453 ? 8 : 12);
                sVar.resetPeekPosition();
                return 0;
            }
            int iU2 = this.f98901a.u();
            if (iU == 1263424842) {
                this.f98910j = sVar.getPosition() + ((long) iU2) + 8;
                return 0;
            }
            sVar.skipFully(8);
            sVar.resetPeekPosition();
            e eVarF = f(iU);
            if (eVarF == null) {
                this.f98910j = sVar.getPosition() + ((long) iU2);
                return 0;
            }
            eVarF.n(iU2);
            this.f98911k = eVarF;
        } else if (eVar.m(sVar)) {
            this.f98911k = null;
        }
        return 0;
    }

    private boolean l(s sVar, l0 l0Var) {
        boolean z10;
        if (this.f98910j != -1) {
            long position = sVar.getPosition();
            long j10 = this.f98910j;
            if (j10 < position || j10 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                l0Var.f96583a = j10;
                z10 = true;
            } else {
                sVar.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f98910j = -1L;
        return z10;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws x {
        if (l(sVar, l0Var)) {
            return 1;
        }
        switch (this.f98905e) {
            case 0:
                if (!c(sVar)) {
                    throw x.a("AVI Header List not found", null);
                }
                sVar.skipFully(12);
                this.f98905e = 1;
                return 0;
            case 1:
                sVar.readFully(this.f98901a.e(), 0, 12);
                this.f98901a.W(0);
                this.f98902b.b(this.f98901a);
                c cVar = this.f98902b;
                if (cVar.f98921c == 1819436136) {
                    this.f98912l = cVar.f98920b;
                    this.f98905e = 2;
                    return 0;
                }
                throw x.a("hdrl expected, found: " + this.f98902b.f98921c, null);
            case 2:
                int i10 = this.f98912l - 4;
                d0 d0Var = new d0(i10);
                sVar.readFully(d0Var.e(), 0, i10);
                g(d0Var);
                this.f98905e = 3;
                return 0;
            case 3:
                if (this.f98913m != -1) {
                    long position = sVar.getPosition();
                    long j10 = this.f98913m;
                    if (position != j10) {
                        this.f98910j = j10;
                        return 0;
                    }
                }
                sVar.peekFully(this.f98901a.e(), 0, 12);
                sVar.resetPeekPosition();
                this.f98901a.W(0);
                this.f98902b.a(this.f98901a);
                int iU = this.f98901a.u();
                int i11 = this.f98902b.f98919a;
                if (i11 == 1179011410) {
                    sVar.skipFully(12);
                    return 0;
                }
                if (i11 != 1414744396 || iU != 1769369453) {
                    this.f98910j = sVar.getPosition() + ((long) this.f98902b.f98920b) + 8;
                    return 0;
                }
                long position2 = sVar.getPosition();
                this.f98913m = position2;
                this.f98914n = position2 + ((long) this.f98902b.f98920b) + 8;
                if (!this.f98916p) {
                    if (((qa.c) q9.a.e(this.f98907g)).a()) {
                        this.f98905e = 4;
                        this.f98910j = this.f98914n;
                        return 0;
                    }
                    this.f98906f.e(new m0.b(this.f98908h));
                    this.f98916p = true;
                }
                this.f98910j = sVar.getPosition() + 12;
                this.f98905e = 6;
                return 0;
            case 4:
                sVar.readFully(this.f98901a.e(), 0, 8);
                this.f98901a.W(0);
                int iU2 = this.f98901a.u();
                int iU3 = this.f98901a.u();
                if (iU2 == 829973609) {
                    this.f98905e = 5;
                    this.f98915o = iU3;
                } else {
                    this.f98910j = sVar.getPosition() + ((long) iU3);
                }
                return 0;
            case 5:
                d0 d0Var2 = new d0(this.f98915o);
                sVar.readFully(d0Var2.e(), 0, this.f98915o);
                h(d0Var2);
                this.f98905e = 6;
                this.f98910j = this.f98913m;
                return 0;
            case 6:
                return k(sVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f98905e = 0;
        if (this.f98903c) {
            tVar = new lb.u(tVar, this.f98904d);
        }
        this.f98906f = tVar;
        this.f98910j = -1L;
    }

    @Override // oa.r
    public boolean c(s sVar) {
        sVar.peekFully(this.f98901a.e(), 0, 12);
        this.f98901a.W(0);
        if (this.f98901a.u() != 1179011410) {
            return false;
        }
        this.f98901a.X(4);
        return this.f98901a.u() == 541677121;
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f98910j = -1L;
        this.f98911k = null;
        for (e eVar : this.f98909i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f98905e = 6;
        } else if (this.f98909i.length == 0) {
            this.f98905e = 0;
        } else {
            this.f98905e = 3;
        }
    }

    @Override // oa.r
    public void release() {
    }
}
