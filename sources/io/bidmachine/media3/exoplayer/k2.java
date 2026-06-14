package io.bidmachine.media3.exoplayer;

import ga.f0;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2 f81176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2 f81178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81179d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f81180e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f81181f = false;

    public k2(i2 i2Var, i2 i2Var2, int i10) {
        this.f81176a = i2Var;
        this.f81177b = i10;
        this.f81178c = i2Var2;
    }

    private boolean A() {
        return this.f81179d == 3;
    }

    private void C(i2 i2Var, ga.c1 c1Var, k kVar, long j10, boolean z10) {
        if (y(i2Var)) {
            if (c1Var != i2Var.getStream()) {
                d(i2Var, kVar);
            } else if (z10) {
                i2Var.resetPosition(j10);
            }
        }
    }

    private void E(boolean z10) {
        if (z10) {
            if (this.f81180e) {
                this.f81176a.reset();
                this.f81180e = false;
                return;
            }
            return;
        }
        if (this.f81181f) {
            ((i2) q9.a.e(this.f81178c)).reset();
            this.f81181f = false;
        }
    }

    private int K(i2 i2Var, m1 m1Var, ja.x xVar, k kVar) {
        if (i2Var == null || !y(i2Var) || ((i2Var == this.f81176a && v()) || (i2Var == this.f81178c && A()))) {
            return 1;
        }
        ga.c1 stream = i2Var.getStream();
        ga.c1[] c1VarArr = m1Var.f81206c;
        int i10 = this.f81177b;
        boolean z10 = stream != c1VarArr[i10];
        boolean zC = xVar.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!i2Var.isCurrentStreamFinal()) {
            i2Var.f(i(xVar.f85697c[this.f81177b]), (ga.c1) q9.a.e(m1Var.f81206c[this.f81177b]), m1Var.n(), m1Var.m(), m1Var.f81211h.f81227a);
            return 3;
        }
        if (!i2Var.isEnded()) {
            return 0;
        }
        d(i2Var, kVar);
        if (!zC || u()) {
            E(i2Var == this.f81176a);
        }
        return 1;
    }

    private void P(i2 i2Var, long j10) {
        i2Var.setCurrentStreamFinal();
        if (i2Var instanceof ia.i) {
            ((ia.i) i2Var).X(j10);
        }
    }

    private void X(boolean z10) {
        if (z10) {
            ((i2) q9.a.e(this.f81178c)).handleMessage(17, this.f81176a);
        } else {
            this.f81176a.handleMessage(17, q9.a.e(this.f81178c));
        }
    }

    private void d(i2 i2Var, k kVar) {
        q9.a.g(this.f81176a == i2Var || this.f81178c == i2Var);
        if (y(i2Var)) {
            kVar.a(i2Var);
            g(i2Var);
            i2Var.disable();
        }
    }

    private void g(i2 i2Var) {
        if (i2Var.getState() == 2) {
            i2Var.stop();
        }
    }

    private static io.bidmachine.media3.common.a[] i(ja.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = ((ja.r) q9.a.e(rVar)).getFormat(i10);
        }
        return aVarArr;
    }

    private i2 l(m1 m1Var) {
        if (m1Var != null && m1Var.f81206c[this.f81177b] != null) {
            if (this.f81176a.getStream() == m1Var.f81206c[this.f81177b]) {
                return this.f81176a;
            }
            i2 i2Var = this.f81178c;
            if (i2Var != null && i2Var.getStream() == m1Var.f81206c[this.f81177b]) {
                return this.f81178c;
            }
        }
        return null;
    }

    private boolean p(m1 m1Var, i2 i2Var) {
        if (i2Var == null) {
            return true;
        }
        ga.c1 c1Var = m1Var.f81206c[this.f81177b];
        if (i2Var.getStream() == null || (i2Var.getStream() == c1Var && (c1Var == null || i2Var.hasReadStreamToEnd() || q(i2Var, m1Var)))) {
            return true;
        }
        m1 m1VarK = m1Var.k();
        return m1VarK != null && m1VarK.f81206c[this.f81177b] == i2Var.getStream();
    }

    private boolean q(i2 i2Var, m1 m1Var) {
        m1 m1VarK = m1Var.k();
        if (m1Var.f81211h.f81233g && m1VarK != null && m1VarK.f81209f) {
            return (i2Var instanceof ia.i) || (i2Var instanceof ea.c) || i2Var.getReadingPositionUs() >= m1VarK.n();
        }
        return false;
    }

    private boolean v() {
        int i10 = this.f81179d;
        return i10 == 2 || i10 == 4;
    }

    private static boolean y(i2 i2Var) {
        return i2Var.getState() != 0;
    }

    public void B(ga.c1 c1Var, k kVar, long j10, boolean z10) {
        C(this.f81176a, c1Var, kVar, j10, z10);
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            C(i2Var, c1Var, kVar, j10, z10);
        }
    }

    public void D() {
        int i10 = this.f81179d;
        if (i10 == 3 || i10 == 4) {
            X(i10 == 4);
            this.f81179d = this.f81179d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f81179d = 0;
        }
    }

    public void F(ja.x xVar, ja.x xVar2, long j10) {
        int i10;
        boolean zC = xVar.c(this.f81177b);
        boolean zC2 = xVar2.c(this.f81177b);
        i2 i2Var = (this.f81178c == null || (i10 = this.f81179d) == 3 || (i10 == 0 && y(this.f81176a))) ? this.f81176a : (i2) q9.a.e(this.f81178c);
        if (!zC || i2Var.isCurrentStreamFinal()) {
            return;
        }
        boolean z10 = m() == -2;
        u9.k0[] k0VarArr = xVar.f85696b;
        int i11 = this.f81177b;
        u9.k0 k0Var = k0VarArr[i11];
        u9.k0 k0Var2 = xVar2.f85696b[i11];
        if (!zC2 || !Objects.equals(k0Var2, k0Var) || z10 || u()) {
            P(i2Var, j10);
        }
    }

    public void G(m1 m1Var) {
        ((i2) q9.a.e(l(m1Var))).maybeThrowStreamError();
    }

    public void H() {
        this.f81176a.release();
        this.f81180e = false;
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            i2Var.release();
            this.f81181f = false;
        }
    }

    public void I(long j10, long j11) {
        if (y(this.f81176a)) {
            this.f81176a.render(j10, j11);
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || !y(i2Var)) {
            return;
        }
        this.f81178c.render(j10, j11);
    }

    public int J(m1 m1Var, ja.x xVar, k kVar) {
        int iK = K(this.f81176a, m1Var, xVar, kVar);
        return iK == 1 ? K(this.f81178c, m1Var, xVar, kVar) : iK;
    }

    public void L() {
        if (!y(this.f81176a)) {
            E(true);
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || y(i2Var)) {
            return;
        }
        E(false);
    }

    public void M(m1 m1Var, long j10) {
        i2 i2VarL = l(m1Var);
        if (i2VarL != null) {
            i2VarL.resetPosition(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (y(this.f81176a) && (i10 = this.f81179d) != 4 && i10 != 2) {
            P(this.f81176a, j10);
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || !y(i2Var) || this.f81179d == 3) {
            return;
        }
        P(this.f81178c, j10);
    }

    public void O(m1 m1Var, long j10) {
        P((i2) q9.a.e(l(m1Var)), j10);
    }

    public void Q(float f10, float f11) {
        this.f81176a.setPlaybackSpeed(f10, f11);
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            i2Var.setPlaybackSpeed(f10, f11);
        }
    }

    public void R(n9.e0 e0Var) {
        this.f81176a.c(e0Var);
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            i2Var.c(e0Var);
        }
    }

    public void S(Object obj) {
        if (m() != 2) {
            return;
        }
        int i10 = this.f81179d;
        if (i10 == 4 || i10 == 1) {
            ((i2) q9.a.e(this.f81178c)).handleMessage(1, obj);
        } else {
            this.f81176a.handleMessage(1, obj);
        }
    }

    public void T(float f10) {
        if (m() != 1) {
            return;
        }
        this.f81176a.handleMessage(2, Float.valueOf(f10));
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            i2Var.handleMessage(2, Float.valueOf(f10));
        }
    }

    public void U() {
        if (this.f81176a.getState() == 1 && this.f81179d != 4) {
            this.f81176a.start();
            return;
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || i2Var.getState() != 1 || this.f81179d == 3) {
            return;
        }
        this.f81178c.start();
    }

    public void V() {
        int i10;
        q9.a.g(!u());
        if (y(this.f81176a)) {
            i10 = 3;
        } else {
            i2 i2Var = this.f81178c;
            i10 = (i2Var == null || !y(i2Var)) ? 2 : 4;
        }
        this.f81179d = i10;
    }

    public void W() {
        if (y(this.f81176a)) {
            g(this.f81176a);
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || !y(i2Var)) {
            return;
        }
        g(this.f81178c);
    }

    public boolean a(m1 m1Var) {
        i2 i2VarL = l(m1Var);
        return i2VarL == null || i2VarL.hasReadStreamToEnd() || i2VarL.isReady() || i2VarL.isEnded();
    }

    public void b(k kVar) {
        d(this.f81176a, kVar);
        i2 i2Var = this.f81178c;
        if (i2Var != null) {
            boolean z10 = y(i2Var) && this.f81179d != 3;
            d(this.f81178c, kVar);
            E(false);
            if (z10) {
                X(true);
            }
        }
        this.f81179d = 0;
    }

    public void c(k kVar) {
        if (u()) {
            int i10 = this.f81179d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            d(z10 ? this.f81176a : (i2) q9.a.e(this.f81178c), kVar);
            E(z10);
            this.f81179d = i11;
        }
    }

    public void e(u9.k0 k0Var, ja.r rVar, ga.c1 c1Var, long j10, boolean z10, boolean z11, long j11, long j12, f0.b bVar, k kVar) throws s {
        io.bidmachine.media3.common.a[] aVarArrI = i(rVar);
        int i10 = this.f81179d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f81180e = true;
            this.f81176a.d(k0Var, aVarArrI, c1Var, j10, z10, z11, j11, j12, bVar);
            kVar.c(this.f81176a);
        } else {
            this.f81181f = true;
            ((i2) q9.a.e(this.f81178c)).d(k0Var, aVarArrI, c1Var, j10, z10, z11, j11, j12, bVar);
            kVar.c(this.f81178c);
        }
    }

    public void f() {
        if (y(this.f81176a)) {
            this.f81176a.enableMayRenderStartOfStream();
            return;
        }
        i2 i2Var = this.f81178c;
        if (i2Var == null || !y(i2Var)) {
            return;
        }
        this.f81178c.enableMayRenderStartOfStream();
    }

    public int h() {
        boolean zY = y(this.f81176a);
        i2 i2Var = this.f81178c;
        return (zY ? 1 : 0) + ((i2Var == null || !y(i2Var)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long durationToProgressUs = y(this.f81176a) ? this.f81176a.getDurationToProgressUs(j10, j11) : Long.MAX_VALUE;
        i2 i2Var = this.f81178c;
        return (i2Var == null || !y(i2Var)) ? durationToProgressUs : Math.min(durationToProgressUs, this.f81178c.getDurationToProgressUs(j10, j11));
    }

    public long k(m1 m1Var) {
        i2 i2VarL = l(m1Var);
        Objects.requireNonNull(i2VarL);
        return i2VarL.getReadingPositionUs();
    }

    public int m() {
        return this.f81176a.getTrackType();
    }

    public void n(int i10, Object obj, m1 m1Var) {
        ((i2) q9.a.e(l(m1Var))).handleMessage(i10, obj);
    }

    public boolean o(m1 m1Var) {
        return p(m1Var, this.f81176a) && p(m1Var, this.f81178c);
    }

    public boolean r(m1 m1Var) {
        return ((i2) q9.a.e(l(m1Var))).hasReadStreamToEnd();
    }

    public boolean s() {
        return this.f81178c != null;
    }

    public boolean t() {
        boolean zIsEnded = y(this.f81176a) ? this.f81176a.isEnded() : true;
        i2 i2Var = this.f81178c;
        return (i2Var == null || !y(i2Var)) ? zIsEnded : zIsEnded & this.f81178c.isEnded();
    }

    public boolean u() {
        return v() || A();
    }

    public boolean w(m1 m1Var) {
        return l(m1Var) != null;
    }

    public boolean x() {
        int i10 = this.f81179d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? y(this.f81176a) : y((i2) q9.a.e(this.f81178c));
    }

    public boolean z(int i10) {
        return (v() && i10 == this.f81177b) || (A() && i10 != this.f81177b);
    }
}
