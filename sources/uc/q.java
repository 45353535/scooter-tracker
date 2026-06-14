package uc;

import android.content.Context;
import fd.l;
import id.u0;
import id.z0;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public class q implements uc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jd.f f105594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f105595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.c f105596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f105597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tc.d f105598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ed.a f105599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Queue f105600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f105601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f105602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f105603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f105604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    fd.l f105605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile t f105606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile t f105607n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f105608a;

        static {
            int[] iArr = new int[id.u.values().length];
            f105608a = iArr;
            try {
                iArr[id.u.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105608a[id.u.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105608a[id.u.StreamLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class b implements u {
        b() {
        }

        @Override // uc.u
        public void c(t tVar, id.a0 a0Var) {
            ic.v.b(q.this.f105594a, "onAdPhaseFailToLoad (%s) - %s", tVar, a0Var);
            q.this.y(tVar);
            if (!q.this.K()) {
                q.this.p(a0Var);
                return;
            }
            if (!q.this.f105599f.d()) {
                q.this.N();
                return;
            }
            q.this.u(tVar, new id.a0("Fail to load after show (CacheType - " + q.this.F() + ") - " + a0Var));
        }

        @Override // uc.u
        public void d(t tVar) {
            ic.v.g(q.this.f105594a, "onAdPhaseLoaded (%s)", tVar);
            if (q.this.J()) {
                q.this.V();
                q.this.O();
            }
        }
    }

    private class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f105610a;

        public c(r rVar) {
            this.f105610a = rVar;
        }

        @Override // uc.v
        public void a(id.t tVar) {
            q.this.l(tVar);
        }

        @Override // uc.v
        public void b(z0 z0Var) {
            this.f105610a.b(z0Var);
        }

        @Override // uc.v
        public void c() {
            q.this.R();
        }

        @Override // uc.v
        public void d() {
            this.f105610a.d();
        }

        @Override // uc.v
        public void e() {
            if (!q.this.I()) {
                b();
            } else {
                q.this.V();
                q.this.W();
            }
        }

        @Override // uc.v
        public void f() {
            this.f105610a.f();
        }

        @Override // uc.v
        public void g() {
            this.f105610a.onAdClicked();
        }

        @Override // uc.v
        public void a() {
            q.this.Q();
        }

        @Override // uc.v
        public void b() {
            q.this.D();
        }
    }

    private class d implements l.d {
        private d() {
        }

        @Override // fd.l.d
        public void a() {
            q.this.P();
        }

        @Override // fd.l.d
        public void b() {
            q.this.T();
        }

        /* synthetic */ d(q qVar, a aVar) {
            this();
        }

        @Override // fd.l.d
        public void a(id.t tVar) {
            q.this.l(tVar);
        }
    }

    public q(Context context, id.c cVar, r rVar, tc.d dVar) {
        jd.f fVar = new jd.f("AdController");
        this.f105594a = fVar;
        this.f105599f = new ed.d(fVar.toString());
        this.f105595b = context.getApplicationContext();
        this.f105596c = cVar;
        this.f105597d = rVar;
        this.f105598e = dVar;
        this.f105600g = new ConcurrentLinkedQueue();
        this.f105601h = new AtomicBoolean(false);
        this.f105602i = new AtomicBoolean(false);
        this.f105603j = new AtomicBoolean(false);
        this.f105604k = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(t tVar) {
        o(tVar, this.f105607n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(t tVar) {
        tVar.d();
        tVar.onShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        final r rVar = this.f105597d;
        Objects.requireNonNull(rVar);
        ic.u uVar = new ic.u() { // from class: uc.c
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                rVar.b();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        };
        t tVar = this.f105606m;
        if (tVar == null) {
            uVar.run();
        } else {
            tVar.a(true);
            this.f105598e.e(tVar.f(), id.f.Disappear, false, null, uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        f0.p(this.f105606m, new pd.h() { // from class: uc.m
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105592a.B((t) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(id.d dVar) {
        if (this.f105605l != null) {
            return;
        }
        fd.l lVar = new fd.l(this.f105595b, dVar, this.f105598e);
        this.f105605l = lVar;
        lVar.setListener(new d(this, null));
        this.f105605l.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Function0 function0) {
        ((qd.a) function0.invoke()).J(this.f105594a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(t tVar, id.a0 a0Var) {
        this.f105597d.c(tVar, a0Var);
    }

    private void o(final t tVar, t tVar2) {
        f0.p(tVar2, new pd.h() { // from class: uc.e
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105583a.w((t) obj);
            }
        });
        this.f105598e.e(tVar.f(), id.f.Appear, false, null, new ic.u() { // from class: uc.f
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                q.C(tVar);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final t tVar) {
        ic.u uVar = new ic.u() { // from class: uc.g
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                this.f105585b.y(tVar);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        };
        tVar.a(true);
        this.f105598e.e(tVar.f(), id.f.Disappear, false, null, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(t tVar) {
        if (this.f105599f.i()) {
            W();
            this.f105597d.j(this);
        }
    }

    boolean E(t tVar) {
        return this.f105600g.remove(tVar);
    }

    id.u F() {
        return this.f105596c.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void y(t tVar) {
        ic.v.g(this.f105594a, "removeAndDestroyAdPhaseController (%s)", tVar);
        f0.p(tVar, new pd.h() { // from class: uc.b
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105420a.E((t) obj);
            }
        });
        t(tVar);
    }

    t H() {
        return (t) this.f105600g.peek();
    }

    boolean I() {
        return H() != null;
    }

    boolean J() {
        Iterator it = this.f105600g.iterator();
        while (it.hasNext()) {
            if (!((t) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public boolean K() {
        return this.f105599f.b();
    }

    void L() {
        if (this.f105601h.compareAndSet(false, true)) {
            for (t tVar : this.f105600g) {
                ic.v.g(this.f105594a, "loadAdPhase (%s)", tVar);
                tVar.c();
            }
        }
    }

    void M() {
        final id.d dVarE = this.f105596c.e();
        jd.h.d(new ic.u() { // from class: uc.l
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                this.f105590b.k(dVarE);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    void N() {
        if (this.f105599f.k()) {
            this.f105597d.h(this);
        }
    }

    boolean O() {
        if (!this.f105599f.a(true)) {
            return false;
        }
        this.f105597d.i(this);
        return true;
    }

    void P() {
        this.f105597d.h();
    }

    void Q() {
        if (this.f105604k.compareAndSet(true, false)) {
            this.f105597d.a();
        }
    }

    void R() {
        if (this.f105604k.compareAndSet(false, true)) {
            this.f105597d.c();
        }
    }

    void S() {
        fd.l lVar = this.f105605l;
        if (lVar != null && this.f105603j.compareAndSet(true, false)) {
            lVar.q();
            this.f105597d.f(lVar);
        }
    }

    void T() {
        O();
    }

    void U() {
        fd.l lVar = this.f105605l;
        if (lVar != null && this.f105603j.compareAndSet(false, true)) {
            this.f105597d.g(lVar);
            lVar.r();
        }
    }

    void V() {
        if (this.f105602i.compareAndSet(false, true)) {
            this.f105597d.g();
            this.f105607n = this.f105606m;
            t tVarH = H();
            if (tVarH == null) {
                u(this.f105607n, this.f105607n == null ? new id.a0("No ad phase to show") : null);
            } else {
                if (this.f105607n != tVarH) {
                    E(tVarH);
                    tVarH.a(new c(this.f105597d));
                    this.f105606m = tVarH;
                    this.f105598e.d(tVarH.f(), id.f.Appear);
                }
                this.f105597d.d(tVarH);
                S();
            }
            this.f105602i.set(false);
        }
    }

    void l(id.t tVar) {
        if (this.f105599f.h()) {
            return;
        }
        this.f105597d.a(tVar);
    }

    @Override // uc.a
    public void onShown() {
        ic.v.g(this.f105594a, "onShown", new Object[0]);
        f0.p(this.f105606m, new pd.h() { // from class: uc.j
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105587a.z((t) obj);
            }
        });
    }

    boolean p(id.a0 a0Var) {
        if (!this.f105599f.a(false)) {
            return false;
        }
        this.f105597d.e(this, a0Var);
        return true;
    }

    boolean q(t tVar) {
        return this.f105600g.add(tVar);
    }

    void s() {
        this.f105600g.clear();
    }

    void t(t tVar) {
        ic.v.g(this.f105594a, "destroyAdPhaseController (%s)", tVar);
        f0.p(tVar, new pd.h() { // from class: uc.d
            @Override // pd.h
            public final void execute(Object obj) {
                ((t) obj).a();
            }
        });
        if (this.f105606m == tVar) {
            this.f105606m = null;
        }
        if (this.f105607n == tVar) {
            this.f105607n = null;
        }
    }

    public String toString() {
        return this.f105594a.toString();
    }

    void u(final t tVar, id.a0 a0Var) {
        f0.p(a0Var, new pd.h() { // from class: uc.k
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105588a.n(tVar, (id.a0) obj);
            }
        });
        D();
    }

    @Override // uc.a
    public void a() {
        ic.v.g(this.f105594a, "destroy", new Object[0]);
        this.f105598e.a();
        t(this.f105606m);
        Iterator it = this.f105600g.iterator();
        while (it.hasNext()) {
            t((t) it.next());
        }
        s();
        f0.p(this.f105605l, new pd.h() { // from class: uc.o
            @Override // pd.h
            public final void execute(Object obj) {
                ((fd.l) obj).i();
            }
        });
        this.f105605l = null;
        f0.p(ec.a.b(), new pd.h() { // from class: uc.p
            @Override // pd.h
            public final void execute(Object obj) {
                this.f105593a.m((Function0) obj);
            }
        });
        this.f105599f.a();
    }

    @Override // uc.a
    public void c() {
        ic.v.g(this.f105594a, "load (cacheType - %s)", F());
        Queue<id.d> queueA = this.f105596c.a();
        if (queueA.isEmpty()) {
            this.f105597d.e(this, new id.a0("Ad phase queue is empty"));
            return;
        }
        if (K()) {
            this.f105597d.i(this);
            return;
        }
        if (this.f105599f.c()) {
            for (id.d dVar : queueA) {
                jd.f fVar = new jd.f("AdPhaseController");
                q(new b0(this.f105595b, dVar, this.f105594a, fVar, new ed.c(fVar.toString(), ic.j.j()), new b(), this.f105598e));
            }
            int i10 = a.f105608a[F().ordinal()];
            if (i10 == 1) {
                L();
                return;
            }
            if (i10 == 2) {
                M();
                L();
            } else {
                if (i10 != 3) {
                    return;
                }
                M();
            }
        }
    }

    @Override // uc.a
    public boolean d() {
        ic.v.g(this.f105594a, "performShow", new Object[0]);
        this.f105599f.l();
        t tVar = this.f105606m;
        if (tVar == null) {
            U();
            L();
            return false;
        }
        if (!this.f105599f.m()) {
            return true;
        }
        tVar.d();
        return true;
    }

    @Override // uc.a
    public void e() {
        ic.v.g(this.f105594a, "onCollapsed", new Object[0]);
        f0.p(this.f105606m, new pd.h() { // from class: uc.n
            @Override // pd.h
            public final void execute(Object obj) {
                ((t) obj).e();
            }
        });
    }

    @Override // uc.a
    public void f() {
        ic.v.g(this.f105594a, "performHide", new Object[0]);
        f0.p(this.f105606m, new pd.h() { // from class: uc.h
            @Override // pd.h
            public final void execute(Object obj) {
                ((t) obj).a(false);
            }
        });
        S();
    }

    @Override // uc.a
    public void g() {
        ic.v.g(this.f105594a, "onExpanded", new Object[0]);
        f0.p(this.f105606m, new pd.h() { // from class: uc.i
            @Override // pd.h
            public final void execute(Object obj) {
                ((t) obj).g();
            }
        });
    }

    @Override // uc.a
    public u0 h() {
        return this.f105596c.d();
    }
}
