package wa;

import ib.n;
import io.bidmachine.media3.common.a;
import java.util.List;
import lb.t;
import n9.v;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.t;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class b implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f107813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107816e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private db.a f107818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f107819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f107820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f107821j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f107812a = new d0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f107817f = -1;

    private void d(s sVar) {
        this.f107812a.S(2);
        sVar.peekFully(this.f107812a.e(), 0, 2);
        sVar.advancePeekPosition(this.f107812a.P() - 2);
    }

    private void e() {
        ((t) q9.a.e(this.f107813b)).endTracks();
        this.f107813b.e(new m0.b(-9223372036854775807L));
        this.f107814c = 6;
    }

    private static db.a f(String str, long j10) {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void g(db.a aVar) {
        ((t) q9.a.e(this.f107813b)).track(1024, 4).f(new a.b().U("image/jpeg").n0(new v(aVar)).N());
    }

    private int h(s sVar) {
        this.f107812a.S(2);
        sVar.peekFully(this.f107812a.e(), 0, 2);
        return this.f107812a.P();
    }

    private void i(s sVar) {
        this.f107812a.S(2);
        sVar.readFully(this.f107812a.e(), 0, 2);
        int iP = this.f107812a.P();
        this.f107815d = iP;
        if (iP == 65498) {
            if (this.f107817f != -1) {
                this.f107814c = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((iP < 65488 || iP > 65497) && iP != 65281) {
            this.f107814c = 1;
        }
    }

    private void j(s sVar) {
        String strB;
        if (this.f107815d == 65505) {
            d0 d0Var = new d0(this.f107816e);
            sVar.readFully(d0Var.e(), 0, this.f107816e);
            if (this.f107818g == null && "http://ns.adobe.com/xap/1.0/".equals(d0Var.B()) && (strB = d0Var.B()) != null) {
                db.a aVarF = f(strB, sVar.getLength());
                this.f107818g = aVarF;
                if (aVarF != null) {
                    this.f107817f = aVarF.f68606d;
                }
            }
        } else {
            sVar.skipFully(this.f107816e);
        }
        this.f107814c = 0;
    }

    private void k(s sVar) {
        this.f107812a.S(2);
        sVar.readFully(this.f107812a.e(), 0, 2);
        this.f107816e = this.f107812a.P() - 2;
        this.f107814c = 2;
    }

    private void l(s sVar) {
        if (!sVar.peekFully(this.f107812a.e(), 0, 1, true)) {
            e();
            return;
        }
        sVar.resetPeekPosition();
        if (this.f107821j == null) {
            this.f107821j = new n(t.a.f94119a, 8);
        }
        d dVar = new d(sVar, this.f107817f);
        this.f107820i = dVar;
        if (!this.f107821j.c(dVar)) {
            e();
        } else {
            this.f107821j.b(new e(this.f107817f, (oa.t) q9.a.e(this.f107813b)));
            m();
        }
    }

    private void m() {
        g((db.a) q9.a.e(this.f107818g));
        this.f107814c = 5;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        int i10 = this.f107814c;
        if (i10 == 0) {
            i(sVar);
            return 0;
        }
        if (i10 == 1) {
            k(sVar);
            return 0;
        }
        if (i10 == 2) {
            j(sVar);
            return 0;
        }
        if (i10 == 4) {
            long position = sVar.getPosition();
            long j10 = this.f107817f;
            if (position != j10) {
                l0Var.f96583a = j10;
                return 1;
            }
            l(sVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f107820i == null || sVar != this.f107819h) {
            this.f107819h = sVar;
            this.f107820i = new d(sVar, this.f107817f);
        }
        int iA = ((n) q9.a.e(this.f107821j)).a(this.f107820i, l0Var);
        if (iA == 1) {
            l0Var.f96583a += this.f107817f;
        }
        return iA;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f107813b = tVar;
    }

    @Override // oa.r
    public boolean c(s sVar) {
        if (h(sVar) != 65496) {
            return false;
        }
        int iH = h(sVar);
        this.f107815d = iH;
        if (iH == 65504) {
            d(sVar);
            this.f107815d = h(sVar);
        }
        if (this.f107815d != 65505) {
            return false;
        }
        sVar.advancePeekPosition(2);
        this.f107812a.S(6);
        sVar.peekFully(this.f107812a.e(), 0, 6);
        return this.f107812a.J() == 1165519206 && this.f107812a.P() == 0;
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
    public void release() {
        n nVar = this.f107821j;
        if (nVar != null) {
            nVar.release();
        }
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f107814c = 0;
            this.f107821j = null;
        } else if (this.f107814c == 5) {
            ((n) q9.a.e(this.f107821j)).seek(j10, j11);
        }
    }
}
