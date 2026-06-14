package io.sentry;

import io.sentry.h4;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o8 f83568b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1 f83570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83571e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile TimerTask f83573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile TimerTask f83574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Timer f83575i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.h0 f83580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q1 f83581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.protocol.c f83582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f83583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g9 f83584r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f83567a = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f83569c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f83572f = c.f83587c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.util.a f83576j = new io.sentry.util.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f83577k = new io.sentry.util.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f83578l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f83579m = new AtomicBoolean(false);

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            h8.this.Q();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            h8.this.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f83587c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f83588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w8 f83589b;

        private c(boolean z10, w8 w8Var) {
            this.f83588a = z10;
            this.f83589b = w8Var;
        }

        static c c(w8 w8Var) {
            return new c(true, w8Var);
        }

        private static c d() {
            return new c(false, null);
        }
    }

    h8(e9 e9Var, b1 b1Var, g9 g9Var, i iVar) {
        this.f83575i = null;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f83582p = cVar;
        io.sentry.util.w.c(e9Var, "context is required");
        io.sentry.util.w.c(b1Var, "scopes are required");
        o8 o8Var = new o8(e9Var, this, b1Var, g9Var);
        this.f83568b = o8Var;
        this.f83571e = e9Var.y();
        this.f83581o = e9Var.e();
        this.f83570d = b1Var;
        Boolean bool = Boolean.TRUE;
        iVar = bool.equals(b()) ? iVar : null;
        this.f83583q = iVar;
        this.f83580n = e9Var.A();
        this.f83584r = g9Var;
        S(o8Var);
        io.sentry.protocol.x xVarI = I();
        if (!xVarI.equals(io.sentry.protocol.x.f84062c) && bool.equals(b())) {
            cVar.v(new v3(xVarI));
        }
        if (iVar != null) {
            iVar.d(this);
        }
        if (g9Var.l() == null && g9Var.k() == null) {
            return;
        }
        this.f83575i = new Timer(true);
        R();
        d();
    }

    private void A() {
        g1 g1VarD = this.f83576j.d();
        try {
            if (this.f83574h != null) {
                this.f83574h.cancel();
                this.f83579m.set(false);
                this.f83574h = null;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void B() {
        g1 g1VarD = this.f83576j.d();
        try {
            if (this.f83573g != null) {
                this.f83573g.cancel();
                this.f83578l.set(false);
                this.f83573g = null;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private j1 C(p8 p8Var, v8 v8Var) {
        if (this.f83568b.g()) {
            return f3.s();
        }
        if (!this.f83581o.equals(p8Var.e())) {
            return f3.s();
        }
        if (io.sentry.util.c0.b(this.f83570d.getOptions().getIgnoredSpanOrigins(), v8Var.a())) {
            return f3.s();
        }
        u8 u8VarH = p8Var.h();
        String strF = p8Var.f();
        String strC = p8Var.c();
        if (this.f83569c.size() >= this.f83570d.getOptions().getMaxSpans()) {
            this.f83570d.getOptions().getLogger().c(g7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strF, strC);
            return f3.s();
        }
        io.sentry.util.w.c(u8VarH, "parentSpanId is required");
        io.sentry.util.w.c(strF, "operation is required");
        B();
        o8 o8Var = new o8(this, this.f83570d, p8Var, v8Var, new r8() { // from class: io.sentry.d8
            @Override // io.sentry.r8
            public final void a(o8 o8Var2) {
                h8.w(this.f83411a, o8Var2);
            }
        });
        S(o8Var);
        this.f83569c.add(o8Var);
        i iVar = this.f83583q;
        if (iVar != null) {
            iVar.b(o8Var);
        }
        return o8Var;
    }

    private j1 D(String str, String str2, s5 s5Var, q1 q1Var, v8 v8Var) {
        if (this.f83568b.g()) {
            return f3.s();
        }
        if (!this.f83581o.equals(q1Var)) {
            return f3.s();
        }
        if (this.f83569c.size() < this.f83570d.getOptions().getMaxSpans()) {
            return this.f83568b.p(str, str2, s5Var, q1Var, v8Var);
        }
        this.f83570d.getOptions().getLogger().c(g7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return f3.s();
    }

    private io.sentry.protocol.x I() {
        return !this.f83568b.e().j().equals(io.sentry.protocol.x.f84062c) ? this.f83568b.e().j() : this.f83570d.getOptions().getContinuousProfiler().f();
    }

    private boolean N() {
        ListIterator listIterator = this.f83569c.listIterator();
        while (listIterator.hasNext()) {
            o8 o8Var = (o8) listIterator.next();
            if (!o8Var.g() && o8Var.q() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        w8 status = getStatus();
        if (status == null) {
            status = w8.DEADLINE_EXCEEDED;
        }
        a(status, this.f83584r.l() != null, null);
        this.f83579m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        w8 status = getStatus();
        if (status == null) {
            status = w8.OK;
        }
        l(status);
        this.f83578l.set(false);
    }

    private void R() {
        Long lK = this.f83584r.k();
        if (lK != null) {
            g1 g1VarD = this.f83576j.d();
            try {
                if (this.f83575i != null) {
                    A();
                    this.f83579m.set(true);
                    this.f83574h = new b();
                    try {
                        this.f83575i.schedule(this.f83574h, lK.longValue());
                    } catch (Throwable th2) {
                        this.f83570d.getOptions().getLogger().a(g7.WARNING, "Failed to schedule finish timer", th2);
                        P();
                    }
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th3) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private void S(j1 j1Var) {
        io.sentry.util.thread.a threadChecker = this.f83570d.getOptions().getThreadChecker();
        io.sentry.protocol.x xVarI = I();
        if (!xVarI.equals(io.sentry.protocol.x.f84062c) && Boolean.TRUE.equals(j1Var.b())) {
            j1Var.k("profiler_id", xVarI.toString());
        }
        j1Var.k("thread.id", String.valueOf(threadChecker.c()));
        j1Var.k("thread.name", threadChecker.b());
    }

    private void W(d dVar) {
        g1 g1VarD = this.f83577k.d();
        try {
            if (dVar.q()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f83570d.x(new j4() { // from class: io.sentry.e8
                    @Override // io.sentry.j4
                    public final void a(y0 y0Var) {
                        atomicReference.set(y0Var.p());
                    }
                });
                dVar.I(e().p(), (io.sentry.protocol.x) atomicReference.get(), this.f83570d.getOptions(), K(), getName(), M());
                dVar.b();
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD == null) {
                throw th2;
            }
            try {
                g1VarD.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void t(h8 h8Var, y0 y0Var, l1 l1Var) {
        h8Var.getClass();
        if (l1Var == h8Var) {
            y0Var.m();
        }
    }

    public static /* synthetic */ void u(final h8 h8Var, final y0 y0Var) {
        h8Var.getClass();
        y0Var.E(new h4.c() { // from class: io.sentry.g8
            @Override // io.sentry.h4.c
            public final void a(l1 l1Var) {
                h8.t(this.f83517a, y0Var, l1Var);
            }
        });
    }

    public static /* synthetic */ void v(h8 h8Var, y0 y0Var) {
        h8Var.getClass();
        y0Var.l(h8Var);
    }

    public static /* synthetic */ void w(h8 h8Var, o8 o8Var) {
        i iVar = h8Var.f83583q;
        if (iVar != null) {
            iVar.a(o8Var);
        }
        c cVar = h8Var.f83572f;
        if (h8Var.f83584r.l() == null) {
            if (cVar.f83588a) {
                h8Var.l(cVar.f83589b);
            }
        } else if (!h8Var.f83584r.q() || h8Var.N()) {
            h8Var.d();
        }
    }

    public static /* synthetic */ void x(h8 h8Var, r8 r8Var, AtomicReference atomicReference, o8 o8Var) {
        if (r8Var != null) {
            h8Var.getClass();
            r8Var.a(o8Var);
        }
        f9 f9VarN = h8Var.f83584r.n();
        if (f9VarN != null) {
            f9VarN.a(h8Var);
        }
        i iVar = h8Var.f83583q;
        if (iVar != null) {
            atomicReference.set(iVar.c(h8Var));
        }
    }

    public void E(w8 w8Var, s5 s5Var, boolean z10, i0 i0Var) {
        s5 s5VarQ = this.f83568b.q();
        if (s5Var == null) {
            s5Var = s5VarQ;
        }
        if (s5Var == null) {
            s5Var = this.f83570d.getOptions().getDateProvider().a();
        }
        for (o8 o8Var : this.f83569c) {
            if (o8Var.w().d()) {
                o8Var.f(w8Var != null ? w8Var : e().f83809h, s5Var);
            }
        }
        this.f83572f = c.c(w8Var);
        if (this.f83568b.g()) {
            return;
        }
        if (!this.f83584r.q() || N()) {
            final AtomicReference atomicReference = new AtomicReference();
            final r8 r8VarZ = this.f83568b.z();
            this.f83568b.E(new r8() { // from class: io.sentry.b8
                @Override // io.sentry.r8
                public final void a(o8 o8Var2) {
                    h8.x(this.f83283a, r8VarZ, atomicReference, o8Var2);
                }
            });
            this.f83568b.f(this.f83572f.f83589b, s5Var);
            Boolean bool = Boolean.TRUE;
            y3 y3VarB = (bool.equals(b()) && bool.equals(O())) ? this.f83570d.getOptions().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f83570d.getOptions()) : null;
            if (this.f83570d.getOptions().isContinuousProfilingEnabled()) {
                w3 profileLifecycle = this.f83570d.getOptions().getProfileLifecycle();
                w3 w3Var = w3.TRACE;
                if (profileLifecycle == w3Var && this.f83568b.e().j().equals(io.sentry.protocol.x.f84062c)) {
                    this.f83570d.getOptions().getContinuousProfiler().g(w3Var);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f83570d.x(new j4() { // from class: io.sentry.c8
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    h8.u(this.f83310a, y0Var);
                }
            });
            io.sentry.protocol.e0 e0Var = new io.sentry.protocol.e0(this);
            if (this.f83575i != null) {
                g1 g1VarD = this.f83576j.d();
                try {
                    if (this.f83575i != null) {
                        B();
                        A();
                        this.f83575i.cancel();
                        this.f83575i = null;
                    }
                    if (g1VarD != null) {
                        g1VarD.close();
                    }
                } catch (Throwable th2) {
                    if (g1VarD != null) {
                        try {
                            g1VarD.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (z10 && this.f83569c.isEmpty() && this.f83584r.l() != null) {
                this.f83570d.getOptions().getLogger().c(g7.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f83571e);
            } else {
                e0Var.o0().putAll(this.f83568b.u());
                this.f83570d.C(e0Var, j(), i0Var, y3VarB);
            }
        }
    }

    public List F() {
        return this.f83569c;
    }

    public io.sentry.protocol.c G() {
        return this.f83582p;
    }

    public Map H() {
        return this.f83568b.s();
    }

    o8 J() {
        return this.f83568b;
    }

    public d9 K() {
        return this.f83568b.y();
    }

    public List L() {
        return this.f83569c;
    }

    public io.sentry.protocol.h0 M() {
        return this.f83580n;
    }

    public Boolean O() {
        return this.f83568b.D();
    }

    public void T(String str, Number number) {
        if (this.f83568b.u().containsKey(str)) {
            return;
        }
        i(str, number);
    }

    public void U(String str, Number number, h2 h2Var) {
        if (this.f83568b.u().containsKey(str)) {
            return;
        }
        m(str, number, h2Var);
    }

    j1 V(u8 u8Var, String str, String str2, s5 s5Var, q1 q1Var, v8 v8Var) {
        p8 p8VarA = e().a(str, u8Var, null);
        p8VarA.r(str2);
        p8VarA.s(q1Var);
        v8Var.h(s5Var);
        return C(p8VarA, v8Var);
    }

    @Override // io.sentry.l1
    public void a(w8 w8Var, boolean z10, i0 i0Var) {
        if (g()) {
            return;
        }
        s5 s5VarA = this.f83570d.getOptions().getDateProvider().a();
        ListIterator listIteratorD = io.sentry.util.c.d((CopyOnWriteArrayList) this.f83569c);
        while (listIteratorD.hasPrevious()) {
            o8 o8Var = (o8) listIteratorD.previous();
            o8Var.E(null);
            o8Var.f(w8Var, s5VarA);
        }
        E(w8Var, s5VarA, z10, i0Var);
    }

    @Override // io.sentry.j1
    public Boolean b() {
        return this.f83568b.b();
    }

    @Override // io.sentry.j1
    public j1 c(String str, String str2, s5 s5Var, q1 q1Var) {
        return p(str, str2, s5Var, q1Var, new v8());
    }

    @Override // io.sentry.l1
    public void d() {
        Long l10;
        g1 g1VarD = this.f83576j.d();
        try {
            if (this.f83575i != null && (l10 = this.f83584r.l()) != null) {
                B();
                this.f83578l.set(true);
                this.f83573g = new a();
                try {
                    this.f83575i.schedule(this.f83573g, l10.longValue());
                } catch (Throwable th2) {
                    this.f83570d.getOptions().getLogger().a(g7.WARNING, "Failed to schedule finish timer", th2);
                    Q();
                }
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th3) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.j1
    public p8 e() {
        return this.f83568b.e();
    }

    @Override // io.sentry.j1
    public void f(w8 w8Var, s5 s5Var) {
        E(w8Var, s5Var, true, null);
    }

    @Override // io.sentry.j1
    public void finish() {
        l(getStatus());
    }

    @Override // io.sentry.j1
    public boolean g() {
        return this.f83568b.g();
    }

    @Override // io.sentry.j1
    public String getDescription() {
        return this.f83568b.getDescription();
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.x getEventId() {
        return this.f83567a;
    }

    @Override // io.sentry.l1
    public String getName() {
        return this.f83571e;
    }

    @Override // io.sentry.j1
    public w8 getStatus() {
        return this.f83568b.getStatus();
    }

    @Override // io.sentry.j1
    public void h(String str) {
        if (this.f83568b.g()) {
            this.f83570d.getOptions().getLogger().c(g7.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f83568b.h(str);
        }
    }

    @Override // io.sentry.j1
    public void i(String str, Number number) {
        this.f83568b.i(str, number);
    }

    @Override // io.sentry.j1
    public b9 j() {
        d dVarB;
        if (!this.f83570d.getOptions().isTraceSampling() || (dVarB = e().b()) == null) {
            return null;
        }
        W(dVarB);
        return dVarB.J();
    }

    @Override // io.sentry.j1
    public void k(String str, Object obj) {
        if (this.f83568b.g()) {
            this.f83570d.getOptions().getLogger().c(g7.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f83568b.k(str, obj);
        }
    }

    @Override // io.sentry.j1
    public void l(w8 w8Var) {
        f(w8Var, null);
    }

    @Override // io.sentry.j1
    public void m(String str, Number number, h2 h2Var) {
        this.f83568b.m(str, number, h2Var);
    }

    @Override // io.sentry.j1
    public g1 n() {
        this.f83570d.x(new j4() { // from class: io.sentry.f8
            @Override // io.sentry.j4
            public final void a(y0 y0Var) {
                h8.v(this.f83496a, y0Var);
            }
        });
        return x2.m();
    }

    @Override // io.sentry.l1
    public j1 o() {
        ListIterator listIteratorD = io.sentry.util.c.d((CopyOnWriteArrayList) this.f83569c);
        while (listIteratorD.hasPrevious()) {
            o8 o8Var = (o8) listIteratorD.previous();
            if (!o8Var.g()) {
                return o8Var;
            }
        }
        return null;
    }

    @Override // io.sentry.j1
    public j1 p(String str, String str2, s5 s5Var, q1 q1Var, v8 v8Var) {
        return D(str, str2, s5Var, q1Var, v8Var);
    }

    @Override // io.sentry.j1
    public s5 q() {
        return this.f83568b.q();
    }

    @Override // io.sentry.j1
    public s5 r() {
        return this.f83568b.r();
    }
}
