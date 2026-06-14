package qc;

import android.net.Uri;
import ic.t;
import ic.u;
import id.a0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jd.h;
import pd.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f98961g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f98964j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f98966l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f98962h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f98963i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f98965k = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1170a f98956b = new C1170a(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f98957c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f98958d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f98959e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f98960f = new AtomicLong(-1);

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    private class C1170a implements u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f98967b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f98968c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f98969d;

        public C1170a(int i10) {
            this.f98969d = i10;
        }

        private void a() {
            if (a.this.c0() == null) {
                return;
            }
            long jG = a.this.g();
            if (jG <= 0) {
                return;
            }
            float fLongValue = (r0.longValue() * 100.0f) / jG;
            int i10 = this.f98968c.get();
            if (fLongValue > (i10 * 25.0f) - 1.0f) {
                if (i10 == 0) {
                    a.this.t();
                } else if (i10 == 1) {
                    a.this.r();
                } else if (i10 == 2) {
                    a.this.s();
                } else if (i10 == 3) {
                    a.this.u();
                } else if (i10 == 4) {
                    a.this.q();
                }
                this.f98968c.incrementAndGet();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f98968c.set(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            h();
            this.f98967b.set(true);
            h.d(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f98967b.set(false);
            h.c(this);
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            t.a(this, th2);
        }

        @Override // pd.w
        public void onRun() {
            if (this.f98967b.get()) {
                if (a.this.i()) {
                    a();
                }
                a aVar = a.this;
                aVar.J(aVar.c0());
                h.e(this, this.f98969d);
            }
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            v.b(this);
        }
    }

    private void A(Long l10) {
        this.f98958d.set(true);
        D(j(), l10);
    }

    private void D(boolean z10, Long l10) {
        if (l10 != null) {
            try {
                this.f98966l = l10.longValue();
            } catch (Exception e10) {
                B(e10);
                return;
            }
        }
        if (z10) {
            if (l10 != null) {
                N(l10.longValue());
            }
            c();
        } else {
            h();
            Uri uri = this.f98964j;
            if (uri != null) {
                O(uri);
            }
            f();
        }
    }

    private d d0() {
        return this.f98961g;
    }

    private void w() {
        try {
            this.f98965k = i0();
        } catch (Exception unused) {
        }
    }

    protected void B(Throwable th2) {
        z(a0.a(th2));
    }

    protected void C(boolean z10) {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.a(this, z10);
    }

    protected abstract long E();

    protected void F(float f10) {
        U(f10);
        S(f10);
    }

    protected void G(long j10) {
        y(j10);
    }

    protected abstract void H(Uri uri);

    protected void I(a0 a0Var) {
        if (this.f98959e.get()) {
            return;
        }
        d dVarD0 = d0();
        if (dVarD0 != null) {
            dVarD0.n(this, a0Var);
        }
        q();
    }

    protected void J(Long l10) {
        d dVarD0;
        if (l10 == null || this.f98960f.getAndSet(l10.longValue()) == l10.longValue() || this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.f(this, l10.longValue());
    }

    protected void K(Throwable th2) {
        I(a0.a(th2));
    }

    protected abstract long L();

    protected void M(float f10) {
        x(f10);
    }

    public void N(long j10) {
        try {
            G(j10);
        } catch (Exception unused) {
        }
    }

    protected void O(Uri uri) {
        H(uri);
    }

    protected void P(a0 a0Var) {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.m(this, a0Var);
    }

    protected void Q(Throwable th2) {
        P(a0.a(th2));
    }

    protected abstract float R();

    protected void S(float f10) {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.e(this, f10);
    }

    public void T(float f10) {
        try {
            M(f10);
        } catch (Exception unused) {
        }
    }

    protected void U(float f10) {
        if (f10 == 0.0f && !this.f98962h) {
            this.f98962h = true;
            C(true);
        } else if (this.f98962h) {
            this.f98962h = false;
            C(false);
        }
    }

    protected abstract boolean V();

    protected abstract boolean W();

    protected abstract void X();

    protected abstract void Y();

    protected abstract void Z();

    @Override // qc.b
    public void a(Uri uri) {
        try {
            O(uri);
            this.f98964j = uri;
        } catch (Exception unused) {
        }
    }

    protected abstract void a0();

    @Override // ic.x
    public void b(Integer num) {
        T(0.0f);
    }

    protected void b0() {
        this.f98956b.h();
    }

    protected void c() {
        Y();
    }

    public Long c0() {
        try {
            return Long.valueOf(h0());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // qc.b
    public void d(d dVar) {
        this.f98961g = dVar;
    }

    @Override // ic.d0
    public void e() {
        if (!this.f98963i || this.f98959e.get()) {
            return;
        }
        pause();
        N(g());
        m();
    }

    protected void e0() {
        l();
        b0();
    }

    protected void f() {
        Z();
    }

    protected void f0() {
        o();
        v();
    }

    @Override // qc.b
    public long g() {
        return this.f98965k;
    }

    protected void g0() {
        w();
        if (this.f98958d.compareAndSet(true, false)) {
            D(true, Long.valueOf(this.f98966l));
        }
        p();
    }

    @Override // qc.b
    public float getVolume() {
        try {
            return j0();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    protected void h() {
        a0();
    }

    protected long h0() {
        return E();
    }

    public boolean i() {
        try {
            return k0();
        } catch (Exception unused) {
            return false;
        }
    }

    protected long i0() {
        return L();
    }

    public boolean j() {
        try {
            return l0();
        } catch (Exception unused) {
            return false;
        }
    }

    protected float j0() {
        return R();
    }

    @Override // ic.a0
    public void k() {
        try {
            this.f98959e.set(false);
            this.f98956b.d();
            A(0L);
        } catch (Exception e10) {
            K(e10);
        }
    }

    protected boolean k0() {
        return V();
    }

    protected void l() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.j(this);
    }

    protected boolean l0() {
        return W();
    }

    protected void m() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.k(this);
    }

    protected void m0() {
        X();
    }

    protected void o() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.i(this);
    }

    protected void p() {
        d dVarD0;
        if (this.f98957c.compareAndSet(false, true) && (dVarD0 = d0()) != null) {
            dVarD0.b(this);
        }
    }

    @Override // qc.b
    public void pause() {
        try {
            this.f98958d.set(false);
            m0();
            this.f98966l = h0();
        } catch (Exception unused) {
        }
    }

    @Override // qc.b
    public void play() {
        try {
            this.f98963i = true;
            A(this.f98959e.get() ? Long.valueOf(g()) : null);
        } catch (Exception e10) {
            K(e10);
        }
    }

    @Override // qc.b
    public void prepare() {
        try {
            f();
        } catch (Exception e10) {
            Q(e10);
        }
    }

    protected void q() {
        d dVarD0;
        if (this.f98959e.compareAndSet(false, true) && (dVarD0 = d0()) != null) {
            dVarD0.g(this);
        }
    }

    protected void r() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.h(this);
    }

    protected void s() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.d(this);
    }

    protected void t() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.c(this);
    }

    protected void u() {
        d dVarD0;
        if (this.f98959e.get() || (dVarD0 = d0()) == null) {
            return;
        }
        dVarD0.l(this);
    }

    protected void v() {
        if (this.f98959e.get()) {
            return;
        }
        this.f98956b.f();
    }

    protected abstract void x(float f10);

    protected abstract void y(long j10);

    protected void z(a0 a0Var) {
        if (this.f98963i) {
            I(a0Var);
        } else {
            P(a0Var);
        }
    }

    @Override // ic.x
    public void a(Integer num) {
        T(1.0f);
    }

    @Override // qc.b
    public void a() {
        this.f98961g = null;
        b0();
    }
}
