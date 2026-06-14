package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import ga.f0;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.m1;
import java.util.ArrayList;
import java.util.List;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
final class p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v9.a f81247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.q f81248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m1.a f81249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f81250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f81251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f81252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f81253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m1 f81254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m1 f81255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m1 f81256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m1 f81257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private m1 f81258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f81259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f81260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f81261q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0.b f81245a = new e0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0.c f81246b = new e0.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f81262r = new ArrayList();

    public p1(v9.a aVar, q9.q qVar, m1.a aVar2, ExoPlayer.c cVar) {
        this.f81247c = aVar;
        this.f81248d = qVar;
        this.f81249e = aVar2;
        this.f81253i = cVar;
    }

    private boolean A(Object obj, n9.e0 e0Var) {
        int iC = e0Var.h(obj, this.f81245a).c();
        int iO = this.f81245a.o();
        if (iC <= 0 || !this.f81245a.r(iO)) {
            return false;
        }
        return iC > 1 || this.f81245a.f(iO) != Long.MIN_VALUE;
    }

    private boolean C(f0.b bVar) {
        return !bVar.b() && bVar.f72274e == -1;
    }

    private boolean D(n9.e0 e0Var, f0.b bVar, boolean z10) {
        int iB = e0Var.b(bVar.f72270a);
        return !e0Var.n(e0Var.f(iB, this.f81245a).f95256c, this.f81246b).f95279i && e0Var.r(iB, this.f81245a, this.f81246b, this.f81251g, this.f81252h) && z10;
    }

    private boolean E(n9.e0 e0Var, f0.b bVar) {
        if (C(bVar)) {
            return e0Var.n(e0Var.h(bVar.f72270a, this.f81245a).f95256c, this.f81246b).f95285o == e0Var.b(bVar.f72270a);
        }
        return false;
    }

    private static boolean H(e0.b bVar) {
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.q(0)) && bVar.r(bVar.o()))) {
            long jI = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f95257d == 0) {
                    return true;
                }
                int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jI += bVar.i(i11);
                }
                if (bVar.f95257d <= jI) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (m1 m1VarK = this.f81254j; m1VarK != null; m1VarK = m1VarK.k()) {
            builder.add(m1VarK.f81211h.f81227a);
        }
        m1 m1Var = this.f81255k;
        final f0.b bVar = m1Var == null ? null : m1Var.f81211h.f81227a;
        this.f81248d.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.o1
            @Override // java.lang.Runnable
            public final void run() {
                this.f81239b.f81247c.o(builder.build(), bVar);
            }
        });
    }

    private void L(List list) {
        for (int i10 = 0; i10 < this.f81262r.size(); i10++) {
            ((m1) this.f81262r.get(i10)).x();
        }
        this.f81262r = list;
        this.f81258n = null;
        I();
    }

    private m1 O(n1 n1Var) {
        for (int i10 = 0; i10 < this.f81262r.size(); i10++) {
            if (((m1) this.f81262r.get(i10)).d(n1Var)) {
                return (m1) this.f81262r.remove(i10);
            }
        }
        return null;
    }

    private static f0.b P(n9.e0 e0Var, Object obj, long j10, long j11, e0.c cVar, e0.b bVar) {
        e0Var.h(obj, bVar);
        e0Var.n(bVar.f95256c, cVar);
        for (int iB = e0Var.b(obj); H(bVar) && iB <= cVar.f95285o; iB++) {
            e0Var.g(iB, bVar, true);
            obj = q9.a.e(bVar.f95255b);
        }
        e0Var.h(obj, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new f0.b(obj, j11, bVar.d(j10)) : new f0.b(obj, iE, bVar.k(iE), j11);
    }

    private long R(n9.e0 e0Var, Object obj) {
        int iB;
        int i10 = e0Var.h(obj, this.f81245a).f95256c;
        Object obj2 = this.f81260p;
        if (obj2 != null && (iB = e0Var.b(obj2)) != -1 && e0Var.f(iB, this.f81245a).f95256c == i10) {
            return this.f81261q;
        }
        for (m1 m1VarK = this.f81254j; m1VarK != null; m1VarK = m1VarK.k()) {
            if (m1VarK.f81205b.equals(obj)) {
                return m1VarK.f81211h.f81227a.f72273d;
            }
        }
        for (m1 m1VarK2 = this.f81254j; m1VarK2 != null; m1VarK2 = m1VarK2.k()) {
            int iB2 = e0Var.b(m1VarK2.f81205b);
            if (iB2 != -1 && e0Var.f(iB2, this.f81245a).f95256c == i10) {
                return m1VarK2.f81211h.f81227a.f72273d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f81250f;
        this.f81250f = 1 + j10;
        if (this.f81254j == null) {
            this.f81260p = obj;
            this.f81261q = j10;
        }
        return j10;
    }

    private long S(Object obj) {
        for (int i10 = 0; i10 < this.f81262r.size(); i10++) {
            m1 m1Var = (m1) this.f81262r.get(i10);
            if (m1Var.f81205b.equals(obj)) {
                return m1Var.f81211h.f81227a.f72273d;
            }
        }
        return -1L;
    }

    private int U(n9.e0 e0Var) {
        n9.e0 e0Var2;
        m1 m1VarK = this.f81254j;
        if (m1VarK == null) {
            return 0;
        }
        int iB = e0Var.b(m1VarK.f81205b);
        while (true) {
            e0Var2 = e0Var;
            iB = e0Var2.d(iB, this.f81245a, this.f81246b, this.f81251g, this.f81252h);
            while (((m1) q9.a.e(m1VarK)).k() != null && !m1VarK.f81211h.f81234h) {
                m1VarK = m1VarK.k();
            }
            m1 m1VarK2 = m1VarK.k();
            if (iB == -1 || m1VarK2 == null || e0Var2.b(m1VarK2.f81205b) != iB) {
                break;
            }
            m1VarK = m1VarK2;
            e0Var = e0Var2;
        }
        int iN = N(m1VarK);
        m1VarK.f81211h = z(e0Var2, m1VarK.f81211h);
        return iN;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean f(n1 n1Var, n1 n1Var2) {
        return n1Var.f81228b == n1Var2.f81228b && n1Var.f81227a.equals(n1Var2.f81227a);
    }

    private Pair i(n9.e0 e0Var, Object obj, long j10) {
        int iE = e0Var.e(e0Var.h(obj, this.f81245a).f95256c, this.f81251g, this.f81252h);
        if (iE != -1) {
            return e0Var.k(this.f81246b, this.f81245a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private n1 j(f2 f2Var) {
        return o(f2Var.f80828a, f2Var.f80829b, f2Var.f80830c, f2Var.f80846s);
    }

    private n1 k(n9.e0 e0Var, m1 m1Var, long j10) {
        Object obj;
        long j11;
        n1 n1Var = m1Var.f81211h;
        int iD = e0Var.d(e0Var.b(n1Var.f81227a.f72270a), this.f81245a, this.f81246b, this.f81251g, this.f81252h);
        if (iD == -1) {
            return null;
        }
        int i10 = e0Var.g(iD, this.f81245a, true).f95256c;
        Object objE = q9.a.e(this.f81245a.f95255b);
        long j12 = n1Var.f81227a.f72273d;
        long j13 = 0;
        if (e0Var.n(i10, this.f81246b).f95284n == iD) {
            Pair pairK = e0Var.k(this.f81246b, this.f81245a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            m1 m1VarK = m1Var.k();
            if (m1VarK == null || !m1VarK.f81205b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f81250f;
                    this.f81250f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = m1VarK.f81211h.f81227a.f72273d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        f0.b bVarP = P(e0Var, obj, j11, j12, this.f81246b, this.f81245a);
        if (j13 != -9223372036854775807L && n1Var.f81229c != -9223372036854775807L) {
            boolean zA = A(n1Var.f81227a.f72270a, e0Var);
            if (bVarP.b() && zA) {
                j13 = n1Var.f81229c;
            } else if (zA) {
                j11 = n1Var.f81229c;
            }
        }
        return o(e0Var, bVarP, j13, j11);
    }

    private n1 l(n9.e0 e0Var, m1 m1Var, long j10) {
        n1 n1Var = m1Var.f81211h;
        long jM = (m1Var.m() + n1Var.f81231e) - j10;
        return n1Var.f81234h ? k(e0Var, m1Var, jM) : m(e0Var, m1Var, jM);
    }

    private n1 m(n9.e0 e0Var, m1 m1Var, long j10) {
        n1 n1Var = m1Var.f81211h;
        f0.b bVar = n1Var.f81227a;
        e0Var.h(bVar.f72270a, this.f81245a);
        boolean z10 = n1Var.f81233g;
        if (!bVar.b()) {
            int i10 = bVar.f72274e;
            if (i10 != -1 && this.f81245a.q(i10)) {
                return k(e0Var, m1Var, j10);
            }
            int iK = this.f81245a.k(bVar.f72274e);
            boolean z11 = this.f81245a.r(bVar.f72274e) && this.f81245a.h(bVar.f72274e, iK) == 3;
            if (iK == this.f81245a.a(bVar.f72274e) || z11) {
                return q(e0Var, bVar.f72270a, s(e0Var, bVar.f72270a, bVar.f72274e), n1Var.f81231e, bVar.f72273d, false);
            }
            return p(e0Var, bVar.f72270a, bVar.f72274e, iK, n1Var.f81231e, bVar.f72273d, z10);
        }
        int i11 = bVar.f72271b;
        int iA = this.f81245a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f81245a.l(i11, bVar.f72272c);
        if (iL < iA) {
            return p(e0Var, bVar.f72270a, i11, iL, n1Var.f81229c, bVar.f72273d, z10);
        }
        long jLongValue = n1Var.f81229c;
        if (jLongValue == -9223372036854775807L) {
            e0.c cVar = this.f81246b;
            e0.b bVar2 = this.f81245a;
            Pair pairK = e0Var.k(cVar, bVar2, bVar2.f95256c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(e0Var, bVar.f72270a, Math.max(s(e0Var, bVar.f72270a, bVar.f72271b), jLongValue), n1Var.f81229c, bVar.f72273d, z10);
    }

    private n1 o(n9.e0 e0Var, f0.b bVar, long j10, long j11) {
        e0Var.h(bVar.f72270a, this.f81245a);
        return bVar.b() ? p(e0Var, bVar.f72270a, bVar.f72271b, bVar.f72272c, j10, bVar.f72273d, false) : q(e0Var, bVar.f72270a, j11, j10, bVar.f72273d, false);
    }

    private n1 p(n9.e0 e0Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        f0.b bVar = new f0.b(obj, i10, i11, j11);
        long jB = e0Var.h(bVar.f72270a, this.f81245a).b(bVar.f72271b, bVar.f72272c);
        long jG = i11 == this.f81245a.k(i10) ? this.f81245a.g() : 0L;
        boolean zR = this.f81245a.r(bVar.f72271b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new n1(bVar, jG, j10, -9223372036854775807L, jB, z10, zR, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private io.bidmachine.media3.exoplayer.n1 q(n9.e0 r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.p1.q(n9.e0, java.lang.Object, long, long, long, boolean):io.bidmachine.media3.exoplayer.n1");
    }

    private n1 r(n9.e0 e0Var, Object obj, long j10, long j11) {
        f0.b bVarP = P(e0Var, obj, j10, j11, this.f81246b, this.f81245a);
        return bVarP.b() ? p(e0Var, bVarP.f72270a, bVarP.f72271b, bVarP.f72272c, j10, bVarP.f72273d, false) : q(e0Var, bVarP.f72270a, j10, -9223372036854775807L, bVarP.f72273d, false);
    }

    private long s(n9.e0 e0Var, Object obj, int i10) {
        e0Var.h(obj, this.f81245a);
        long jF = this.f81245a.f(i10);
        return jF == Long.MIN_VALUE ? this.f81245a.f95257d : jF + this.f81245a.i(i10);
    }

    public void B(n9.e0 e0Var) {
        m1 m1Var;
        if (this.f81253i.f80626a == -9223372036854775807L || (m1Var = this.f81257m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairI = i(e0Var, m1Var.f81211h.f81227a.f72270a, 0L);
        if (pairI != null && !e0Var.n(e0Var.h(pairI.first, this.f81245a).f95256c, this.f81246b).f()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f81250f;
                this.f81250f = 1 + jS;
            }
            n1 n1VarR = r(e0Var, pairI.first, ((Long) pairI.second).longValue(), jS);
            m1 m1VarO = O(n1VarR);
            if (m1VarO == null) {
                m1VarO = this.f81249e.a(n1VarR, (m1Var.m() + m1Var.f81211h.f81231e) - n1VarR.f81228b);
            }
            arrayList.add(m1VarO);
        }
        L(arrayList);
    }

    public boolean F(ga.c0 c0Var) {
        m1 m1Var = this.f81257m;
        return m1Var != null && m1Var.f81204a == c0Var;
    }

    public boolean G(ga.c0 c0Var) {
        m1 m1Var = this.f81258n;
        return m1Var != null && m1Var.f81204a == c0Var;
    }

    public void I() {
        m1 m1Var = this.f81258n;
        if (m1Var == null || m1Var.t()) {
            this.f81258n = null;
            for (int i10 = 0; i10 < this.f81262r.size(); i10++) {
                m1 m1Var2 = (m1) this.f81262r.get(i10);
                if (!m1Var2.t()) {
                    this.f81258n = m1Var2;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        m1 m1Var = this.f81257m;
        if (m1Var != null) {
            m1Var.w(j10);
        }
    }

    public void M() {
        if (this.f81262r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(m1 m1Var) {
        q9.a.i(m1Var);
        int i10 = 0;
        if (m1Var.equals(this.f81257m)) {
            return 0;
        }
        this.f81257m = m1Var;
        while (m1Var.k() != null) {
            m1Var = (m1) q9.a.e(m1Var.k());
            if (m1Var == this.f81255k) {
                m1 m1Var2 = this.f81254j;
                this.f81255k = m1Var2;
                this.f81256l = m1Var2;
                i10 = 3;
            }
            if (m1Var == this.f81256l) {
                this.f81256l = this.f81255k;
                i10 |= 2;
            }
            m1Var.x();
            this.f81259o--;
        }
        ((m1) q9.a.e(this.f81257m)).A(null);
        J();
        return i10;
    }

    public f0.b Q(n9.e0 e0Var, Object obj, long j10) {
        long jR = R(e0Var, obj);
        e0Var.h(obj, this.f81245a);
        e0Var.n(this.f81245a.f95256c, this.f81246b);
        boolean z10 = false;
        for (int iB = e0Var.b(obj); iB >= this.f81246b.f95284n; iB--) {
            e0Var.g(iB, this.f81245a, true);
            boolean z11 = this.f81245a.c() > 0;
            z10 |= z11;
            e0.b bVar = this.f81245a;
            if (bVar.e(bVar.f95257d) != -1) {
                obj = q9.a.e(this.f81245a.f95255b);
            }
            if (z10 && (!z11 || this.f81245a.f95257d != 0)) {
                break;
            }
        }
        return P(e0Var, obj, j10, jR, this.f81246b, this.f81245a);
    }

    public boolean T() {
        m1 m1Var = this.f81257m;
        if (m1Var != null) {
            return !m1Var.f81211h.f81236j && m1Var.s() && this.f81257m.f81211h.f81231e != -9223372036854775807L && this.f81259o < 100;
        }
        return true;
    }

    public void V(n9.e0 e0Var, ExoPlayer.c cVar) {
        this.f81253i = cVar;
        B(e0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        return N(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int W(n9.e0 r9, long r10, long r12, long r14) {
        /*
            r8 = this;
            io.bidmachine.media3.exoplayer.m1 r0 = r8.f81254j
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L87
            io.bidmachine.media3.exoplayer.n1 r3 = r0.f81211h
            if (r1 != 0) goto Lf
            io.bidmachine.media3.exoplayer.n1 r1 = r8.z(r9, r3)
            goto L1e
        Lf:
            io.bidmachine.media3.exoplayer.n1 r4 = r8.l(r9, r1, r10)
            if (r4 == 0) goto L82
            boolean r5 = r8.f(r3, r4)
            if (r5 != 0) goto L1d
            goto L82
        L1d:
            r1 = r4
        L1e:
            long r4 = r3.f81229c
            io.bidmachine.media3.exoplayer.n1 r4 = r1.a(r4)
            r0.f81211h = r4
            long r3 = r3.f81231e
            long r5 = r1.f81231e
            boolean r3 = e(r3, r5)
            if (r3 != 0) goto L7a
            r0.E()
            long r9 = r1.f81231e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L44
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L48
        L44:
            long r9 = r0.D(r9)
        L48:
            io.bidmachine.media3.exoplayer.m1 r11 = r8.f81255k
            r1 = 1
            r3 = -9223372036854775808
            if (r0 != r11) goto L5f
            io.bidmachine.media3.exoplayer.n1 r11 = r0.f81211h
            boolean r11 = r11.f81233g
            if (r11 != 0) goto L5f
            int r11 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r11 < 0) goto L5f
        L5d:
            r11 = r1
            goto L60
        L5f:
            r11 = r2
        L60:
            io.bidmachine.media3.exoplayer.m1 r12 = r8.f81256l
            if (r0 != r12) goto L6d
            int r12 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r12 == 0) goto L6c
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 < 0) goto L6d
        L6c:
            r2 = r1
        L6d:
            int r9 = r8.N(r0)
            if (r9 == 0) goto L74
            return r9
        L74:
            if (r2 == 0) goto L79
            r9 = r11 | 2
            return r9
        L79:
            return r11
        L7a:
            io.bidmachine.media3.exoplayer.m1 r1 = r0.k()
            r7 = r1
            r1 = r0
            r0 = r7
            goto L3
        L82:
            int r9 = r8.N(r1)
            return r9
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.p1.W(n9.e0, long, long, long):int");
    }

    public int X(n9.e0 e0Var, int i10) {
        this.f81251g = i10;
        return U(e0Var);
    }

    public int Y(n9.e0 e0Var, boolean z10) {
        this.f81252h = z10;
        return U(e0Var);
    }

    public m1 b() {
        m1 m1Var = this.f81254j;
        if (m1Var == null) {
            return null;
        }
        if (m1Var == this.f81255k) {
            this.f81255k = m1Var.k();
        }
        m1 m1Var2 = this.f81254j;
        if (m1Var2 == this.f81256l) {
            this.f81256l = m1Var2.k();
        }
        this.f81254j.x();
        int i10 = this.f81259o - 1;
        this.f81259o = i10;
        if (i10 == 0) {
            this.f81257m = null;
            m1 m1Var3 = this.f81254j;
            this.f81260p = m1Var3.f81205b;
            this.f81261q = m1Var3.f81211h.f81227a.f72273d;
        }
        this.f81254j = this.f81254j.k();
        J();
        return this.f81254j;
    }

    public m1 c() {
        this.f81256l = ((m1) q9.a.i(this.f81256l)).k();
        J();
        return (m1) q9.a.i(this.f81256l);
    }

    public m1 d() {
        m1 m1Var = this.f81256l;
        m1 m1Var2 = this.f81255k;
        if (m1Var == m1Var2) {
            this.f81256l = ((m1) q9.a.i(m1Var2)).k();
        }
        this.f81255k = ((m1) q9.a.i(this.f81255k)).k();
        J();
        return (m1) q9.a.i(this.f81255k);
    }

    public void g() {
        if (this.f81259o == 0) {
            return;
        }
        m1 m1VarK = (m1) q9.a.i(this.f81254j);
        this.f81260p = m1VarK.f81205b;
        this.f81261q = m1VarK.f81211h.f81227a.f72273d;
        while (m1VarK != null) {
            m1VarK.x();
            m1VarK = m1VarK.k();
        }
        this.f81254j = null;
        this.f81257m = null;
        this.f81255k = null;
        this.f81256l = null;
        this.f81259o = 0;
        J();
    }

    public m1 h(n1 n1Var) {
        m1 m1Var = this.f81257m;
        long jM = m1Var == null ? 1000000000000L : (m1Var.m() + this.f81257m.f81211h.f81231e) - n1Var.f81228b;
        m1 m1VarO = O(n1Var);
        if (m1VarO == null) {
            m1VarO = this.f81249e.a(n1Var, jM);
        } else {
            m1VarO.f81211h = n1Var;
            m1VarO.B(jM);
        }
        m1 m1Var2 = this.f81257m;
        if (m1Var2 != null) {
            m1Var2.A(m1VarO);
        } else {
            this.f81254j = m1VarO;
            this.f81255k = m1VarO;
            this.f81256l = m1VarO;
        }
        this.f81260p = null;
        this.f81257m = m1VarO;
        this.f81259o++;
        J();
        return m1VarO;
    }

    public m1 n() {
        return this.f81257m;
    }

    public n1 t(long j10, f2 f2Var) {
        m1 m1Var = this.f81257m;
        return m1Var == null ? j(f2Var) : l(f2Var.f80828a, m1Var, j10);
    }

    public m1 u() {
        return this.f81254j;
    }

    public m1 v(ga.c0 c0Var) {
        for (int i10 = 0; i10 < this.f81262r.size(); i10++) {
            m1 m1Var = (m1) this.f81262r.get(i10);
            if (m1Var.f81204a == c0Var) {
                return m1Var;
            }
        }
        return null;
    }

    public m1 w() {
        return this.f81258n;
    }

    public m1 x() {
        return this.f81256l;
    }

    public m1 y() {
        return this.f81255k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.bidmachine.media3.exoplayer.n1 z(n9.e0 r18, io.bidmachine.media3.exoplayer.n1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            ga.f0$b r3 = r2.f81227a
            boolean r13 = r0.C(r3)
            boolean r14 = r0.E(r1, r3)
            boolean r15 = r0.D(r1, r3, r13)
            ga.f0$b r4 = r2.f81227a
            java.lang.Object r4 = r4.f72270a
            n9.e0$b r5 = r0.f81245a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f72274e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            n9.e0$b r7 = r0.f81245a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            n9.e0$b r1 = r0.f81245a
            int r4 = r3.f72271b
            int r5 = r3.f72272c
            long r4 = r1.b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            n9.e0$b r1 = r0.f81245a
            long r4 = r1.j()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            n9.e0$b r1 = r0.f81245a
            int r4 = r3.f72271b
            boolean r1 = r1.r(r4)
        L6a:
            r12 = r1
            goto L7c
        L6c:
            int r1 = r3.f72274e
            if (r1 == r6) goto L7a
            n9.e0$b r4 = r0.f81245a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            io.bidmachine.media3.exoplayer.n1 r1 = new io.bidmachine.media3.exoplayer.n1
            r5 = r3
            long r3 = r2.f81228b
            r11 = r5
            long r5 = r2.f81229c
            boolean r2 = r2.f81232f
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.p1.z(n9.e0, io.bidmachine.media3.exoplayer.n1):io.bidmachine.media3.exoplayer.n1");
    }
}
