package hb;

import android.net.Uri;
import cb.h;
import cb.l;
import cb.n;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import hb.g;
import io.bidmachine.media3.common.a;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import lb.t;
import n9.v;
import oa.e0;
import oa.g0;
import oa.i0;
import oa.l0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.w;
import oa.x;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f73075v = new x() { // from class: hb.d
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return f.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final h.a f73076w = new h.a() { // from class: hb.e
        @Override // cb.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return f.e(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f73079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0.a f73080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f73081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0 f73082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s0 f73083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private oa.t f73084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s0 f73085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f73086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f73087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v f73088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f73091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f73092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f73093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f73094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f73095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f73096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f73097u;

    public f() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean e(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void f() {
        q9.a.i(this.f73085i);
        o0.i(this.f73084h);
    }

    private g g(s sVar) {
        long jL;
        long dataEndPosition;
        g gVarP = p(sVar);
        c cVarO = o(this.f73088l, sVar.getPosition());
        if (this.f73095s) {
            return new g.a();
        }
        if ((this.f73077a & 4) != 0) {
            if (cVarO != null) {
                jL = cVarO.getDurationUs();
                dataEndPosition = cVarO.getDataEndPosition();
            } else if (gVarP != null) {
                jL = gVarP.getDurationUs();
                dataEndPosition = gVarP.getDataEndPosition();
            } else {
                jL = l(this.f73088l);
                dataEndPosition = -1;
            }
            gVarP = new b(jL, sVar.getPosition(), dataEndPosition);
        } else if (cVarO != null) {
            gVarP = cVarO;
        } else if (gVarP == null) {
            gVarP = null;
        }
        if (gVarP == null || (!gVarP.isSeekable() && (this.f73077a & 1) != 0)) {
            gVarP = k(sVar, (this.f73077a & 2) != 0);
        }
        if (gVarP != null) {
            this.f73085i.d(gVarP.getDurationUs());
        }
        return gVarP;
    }

    private long h(long j10) {
        return this.f73089m + ((j10 * 1000000) / ((long) this.f73080d.f96572d));
    }

    private g j(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f73105c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f73103a.f96571c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f73103a.f96571c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + ((long) iVar.f73103a.f96571c), Ints.checkedCast(o0.e1(j16, 8000000L, jA, roundingMode)), Ints.checkedCast(LongMath.divide(j16, iVar.f73104b, roundingMode)), false);
    }

    private g k(s sVar, boolean z10) {
        sVar.peekFully(this.f73079c.e(), 0, 4);
        this.f73079c.W(0);
        this.f73080d.a(this.f73079c.q());
        return new a(sVar.getLength(), sVar.getPosition(), this.f73080d, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static long l(v vVar) {
        if (vVar == null) {
            return -9223372036854775807L;
        }
        int iE = vVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f6666a.equals("TLEN")) {
                    return o0.P0(Long.parseLong((String) nVar.f6680d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int m(d0 d0Var, int i10) {
        if (d0Var.g() >= i10 + 4) {
            d0Var.W(i10);
            int iQ = d0Var.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (d0Var.g() < 40) {
            return 0;
        }
        d0Var.W(36);
        return d0Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private static c o(v vVar, long j10) {
        if (vVar == null) {
            return null;
        }
        int iE = vVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, l(vVar));
            }
        }
        return null;
    }

    private g p(s sVar) {
        int i10;
        int i11;
        d0 d0Var = new d0(this.f73080d.f96571c);
        sVar.peekFully(d0Var.e(), 0, this.f73080d.f96571c);
        i0.a aVar = this.f73080d;
        int i12 = 21;
        if ((aVar.f96569a & 1) != 0) {
            if (aVar.f96573e != 1) {
                i12 = 36;
            }
        } else if (aVar.f96573e == 1) {
            i12 = 13;
        }
        int iM = m(d0Var, i12);
        if (iM != 1231971951) {
            if (iM == 1447187017) {
                h hVarA = h.a(sVar.getLength(), sVar.getPosition(), this.f73080d, d0Var);
                sVar.skipFully(this.f73080d.f96571c);
                return hVarA;
            }
            if (iM != 1483304551) {
                sVar.resetPeekPosition();
                return null;
            }
        }
        i iVarB = i.b(this.f73080d, d0Var);
        if (!this.f73081e.a() && (i10 = iVarB.f73106d) != -1 && (i11 = iVarB.f73107e) != -1) {
            e0 e0Var = this.f73081e;
            e0Var.f96528a = i10;
            e0Var.f96529b = i11;
        }
        long position = sVar.getPosition();
        if (sVar.getLength() != -1 && iVarB.f73105c != -1 && sVar.getLength() != iVarB.f73105c + position) {
            u.f("Mp3Extractor", "Data size mismatch between stream (" + sVar.getLength() + ") and Xing frame (" + (iVarB.f73105c + position) + "), using Xing value.");
        }
        sVar.skipFully(this.f73080d.f96571c);
        return iM == 1483304551 ? j.a(iVarB, position) : j(position, iVarB, sVar.getLength());
    }

    private void q() {
        g gVar = this.f73094r;
        if ((gVar instanceof a) && gVar.isSeekable()) {
            long j10 = this.f73092p;
            if (j10 == -1 || j10 == this.f73094r.getDataEndPosition()) {
                return;
            }
            this.f73094r = ((a) this.f73094r).d(this.f73092p);
            ((oa.t) q9.a.e(this.f73084h)).e(this.f73094r);
            ((s0) q9.a.e(this.f73085i)).d(this.f73094r.getDurationUs());
        }
    }

    private boolean r(s sVar) {
        g gVar = this.f73094r;
        if (gVar != null) {
            long dataEndPosition = gVar.getDataEndPosition();
            if (dataEndPosition != -1 && sVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !sVar.peekFully(this.f73079c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int s(s sVar) throws Throwable {
        if (this.f73087k == 0) {
            try {
                u(sVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f73094r == null) {
            g gVarG = g(sVar);
            this.f73094r = gVarG;
            this.f73084h.e(gVarG);
            a.b bVarN0 = new a.b().U("audio/mpeg").u0(this.f73080d.f96570b).k0(4096).R(this.f73080d.f96573e).v0(this.f73080d.f96572d).Z(this.f73081e.f96528a).a0(this.f73081e.f96529b).n0((this.f73077a & 8) != 0 ? null : this.f73088l);
            if (this.f73094r.getAverageBitrate() != -2147483647) {
                bVarN0.Q(this.f73094r.getAverageBitrate());
            }
            this.f73086j.f(bVarN0.N());
            this.f73091o = sVar.getPosition();
        } else if (this.f73091o != 0) {
            long position = sVar.getPosition();
            long j10 = this.f73091o;
            if (position < j10) {
                sVar.skipFully((int) (j10 - position));
            }
        }
        return t(sVar);
    }

    private int t(s sVar) {
        if (this.f73093q == 0) {
            sVar.resetPeekPosition();
            if (r(sVar)) {
                return -1;
            }
            this.f73079c.W(0);
            int iQ = this.f73079c.q();
            if (!n(iQ, this.f73087k) || i0.j(iQ) == -1) {
                sVar.skipFully(1);
                this.f73087k = 0;
                return 0;
            }
            this.f73080d.a(iQ);
            if (this.f73089m == -9223372036854775807L) {
                this.f73089m = this.f73094r.getTimeUs(sVar.getPosition());
                if (this.f73078b != -9223372036854775807L) {
                    this.f73089m += this.f73078b - this.f73094r.getTimeUs(0L);
                }
            }
            this.f73093q = this.f73080d.f96571c;
            long position = sVar.getPosition();
            i0.a aVar = this.f73080d;
            this.f73092p = position + ((long) aVar.f96571c);
            g gVar = this.f73094r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(h(this.f73090n + ((long) aVar.f96575g)), this.f73092p);
                if (this.f73096t && bVar.a(this.f73097u)) {
                    this.f73096t = false;
                    this.f73086j = this.f73085i;
                }
            }
        }
        int iB = this.f73086j.b(sVar, this.f73093q, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f73093q - iB;
        this.f73093q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f73086j.e(h(this.f73090n), 1, this.f73080d.f96571c, 0, null);
        this.f73090n += (long) this.f73080d.f96575g;
        this.f73093q = 0;
        return 0;
    }

    private boolean u(s sVar, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        sVar.resetPeekPosition();
        if (sVar.getPosition() == 0) {
            v vVarA = this.f73082f.a(sVar, (this.f73077a & 8) == 0 ? null : f73076w);
            this.f73088l = vVarA;
            if (vVarA != null) {
                this.f73081e.c(vVarA);
            }
            peekPosition = (int) sVar.getPeekPosition();
            if (!z10) {
                sVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!r(sVar)) {
                this.f73079c.W(0);
                int iQ = this.f73079c.q();
                if ((i10 == 0 || n(iQ, i10)) && (iJ = i0.j(iQ)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f73080d.a(iQ);
                        i10 = iQ;
                    }
                    sVar.advancePeekPosition(iJ - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        q();
                        throw new EOFException();
                    }
                    if (z10) {
                        sVar.resetPeekPosition();
                        sVar.advancePeekPosition(peekPosition + i14);
                    } else {
                        sVar.skipFully(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                q();
                throw new EOFException();
            }
        }
        if (z10) {
            sVar.skipFully(peekPosition + i13);
        } else {
            sVar.resetPeekPosition();
        }
        this.f73087k = i10;
        return true;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws Throwable {
        f();
        int iS = s(sVar);
        if (iS == -1 && (this.f73094r instanceof b)) {
            long jH = h(this.f73090n);
            if (this.f73094r.getDurationUs() != jH) {
                ((b) this.f73094r).c(jH);
                this.f73084h.e(this.f73094r);
                this.f73085i.d(this.f73094r.getDurationUs());
            }
        }
        return iS;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f73084h = tVar;
        s0 s0VarTrack = tVar.track(0, 1);
        this.f73085i = s0VarTrack;
        this.f73086j = s0VarTrack;
        this.f73084h.endTracks();
    }

    @Override // oa.r
    public boolean c(s sVar) {
        return u(sVar, true);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    public void i() {
        this.f73095s = true;
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f73087k = 0;
        this.f73089m = -9223372036854775807L;
        this.f73090n = 0L;
        this.f73093q = 0;
        this.f73097u = j11;
        g gVar = this.f73094r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f73096t = true;
        this.f73086j = this.f73083g;
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f73077a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f73078b = j10;
        this.f73079c = new d0(10);
        this.f73080d = new i0.a();
        this.f73081e = new e0();
        this.f73089m = -9223372036854775807L;
        this.f73082f = new g0();
        oa.n nVar = new oa.n();
        this.f73083g = nVar;
        this.f73086j = nVar;
        this.f73092p = -1L;
    }

    @Override // oa.r
    public void release() {
    }
}
