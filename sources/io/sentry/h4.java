package io.sentry;

import io.sentry.v7;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile io.sentry.protocol.x f83532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g7 f83533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1 f83534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f83535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.sentry.protocol.i0 f83537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.sentry.protocol.o f83539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f83540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Queue f83541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f83542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f83543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f83544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile v7 f83545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile k8 f83546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f83547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final io.sentry.util.a f83548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.sentry.util.a f83549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.c f83550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f83551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a4 f83552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.sentry.protocol.x f83553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e1 f83554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map f83555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.sentry.featureflags.b f83556y;

    public interface a {
        void a(a4 a4Var);
    }

    interface b {
        void a(k8 k8Var);
    }

    public interface c {
        void a(l1 l1Var);
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8 f83557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k8 f83558b;

        public d(k8 k8Var, k8 k8Var2) {
            this.f83558b = k8Var;
            this.f83557a = k8Var2;
        }

        public k8 a() {
            return this.f83558b;
        }

        public k8 b() {
            return this.f83557a;
        }
    }

    public h4(v7 v7Var) {
        this.f83535d = new WeakReference(null);
        this.f83540i = new ArrayList();
        this.f83542k = new ConcurrentHashMap();
        this.f83543l = new ConcurrentHashMap();
        this.f83544m = new CopyOnWriteArrayList();
        this.f83547p = new io.sentry.util.a();
        this.f83548q = new io.sentry.util.a();
        this.f83549r = new io.sentry.util.a();
        this.f83550s = new io.sentry.protocol.c();
        this.f83551t = new CopyOnWriteArrayList();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        this.f83553v = xVar;
        this.f83554w = z2.h();
        this.f83555x = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f83545n = (v7) io.sentry.util.w.c(v7Var, "SentryOptions is required.");
        this.f83541j = H(this.f83545n.getMaxBreadcrumbs());
        this.f83556y = io.sentry.featureflags.a.a(v7Var);
        this.f83552u = new a4();
        this.f83532a = xVar;
    }

    static Queue H(int i10) {
        return i10 > 0 ? z8.j(new f(i10)) : new u();
    }

    private e I(v7.a aVar, e eVar, i0 i0Var) {
        try {
            return aVar.a(eVar, i0Var);
        } catch (Throwable th2) {
            this.f83545n.getLogger().a(g7.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                eVar.v("sentry:message", th2.getMessage());
            }
            return eVar;
        }
    }

    @Override // io.sentry.y0
    public String A() {
        l1 l1Var = this.f83534c;
        return l1Var != null ? l1Var.getName() : this.f83536e;
    }

    @Override // io.sentry.y0
    public a4 B() {
        return this.f83552u;
    }

    @Override // io.sentry.y0
    public List C() {
        return new CopyOnWriteArrayList(this.f83551t);
    }

    @Override // io.sentry.y0
    public a4 D(a aVar) {
        g1 g1VarD = this.f83549r.d();
        try {
            aVar.a(this.f83552u);
            a4 a4Var = new a4(this.f83552u);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return a4Var;
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

    @Override // io.sentry.y0
    public void E(c cVar) {
        g1 g1VarD = this.f83548q.d();
        try {
            cVar.a(this.f83534c);
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

    @Override // io.sentry.y0
    public void F(io.sentry.protocol.x xVar) {
        this.f83532a = xVar;
    }

    public void G() {
        this.f83541j.clear();
        Iterator<z0> it = this.f83545n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().f(this.f83541j);
        }
    }

    public io.sentry.protocol.x J() {
        return this.f83532a;
    }

    @Override // io.sentry.y0
    public void a(e eVar, i0 i0Var) {
        if (eVar == null || (this.f83541j instanceof u)) {
            return;
        }
        if (i0Var == null) {
            i0Var = new i0();
        }
        v7.a beforeBreadcrumb = this.f83545n.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            eVar = I(beforeBreadcrumb, eVar, i0Var);
        }
        if (eVar == null) {
            this.f83545n.getLogger().c(g7.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f83541j.add(eVar);
        for (z0 z0Var : this.f83545n.getScopeObservers()) {
            z0Var.e(eVar);
            z0Var.f(this.f83541j);
        }
    }

    public void b(e eVar) {
        a(eVar, null);
    }

    @Override // io.sentry.y0
    public void c(Throwable th2, j1 j1Var, String str) {
        io.sentry.util.w.c(th2, "throwable is required");
        io.sentry.util.w.c(j1Var, "span is required");
        io.sentry.util.w.c(str, "transactionName is required");
        Throwable thA = io.sentry.util.g.a(th2);
        if (this.f83555x.containsKey(thA)) {
            return;
        }
        this.f83555x.put(thA, new io.sentry.util.x(new WeakReference(j1Var), str));
    }

    @Override // io.sentry.y0
    public void clear() {
        this.f83533b = null;
        this.f83537f = null;
        this.f83539h = null;
        this.f83538g = null;
        this.f83540i.clear();
        G();
        this.f83542k.clear();
        this.f83543l.clear();
        this.f83544m.clear();
        m();
        e();
    }

    @Override // io.sentry.y0
    public d d() {
        g1 g1VarD = this.f83547p.d();
        try {
            if (this.f83546o != null) {
                this.f83546o.c();
                this.f83545n.getContinuousProfiler().d();
            }
            k8 k8Var = this.f83546o;
            d dVar = null;
            if (this.f83545n.getRelease() != null) {
                this.f83546o = new k8(this.f83545n.getDistinctId(), this.f83537f, this.f83545n.getEnvironment(), this.f83545n.getRelease());
                dVar = new d(this.f83546o.clone(), k8Var != null ? k8Var.clone() : null);
            } else {
                this.f83545n.getLogger().c(g7.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            return dVar;
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

    public void e() {
        this.f83551t.clear();
    }

    @Override // io.sentry.y0
    public k8 f() {
        g1 g1VarD = this.f83547p.d();
        try {
            k8 k8Var = null;
            if (this.f83546o != null) {
                this.f83546o.c();
                this.f83545n.getContinuousProfiler().d();
                k8 k8VarClone = this.f83546o.clone();
                this.f83546o = null;
                k8Var = k8VarClone;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            return k8Var;
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

    @Override // io.sentry.y0
    public void g(io.sentry.protocol.x xVar) {
        this.f83553v = xVar;
        Iterator<z0> it = this.f83545n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(xVar);
        }
    }

    @Override // io.sentry.y0
    public Map getExtras() {
        return this.f83543l;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.g getFeatureFlags() {
        return this.f83556y.getFeatureFlags();
    }

    @Override // io.sentry.y0
    public g7 getLevel() {
        return this.f83533b;
    }

    @Override // io.sentry.y0
    public v7 getOptions() {
        return this.f83545n;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.o getRequest() {
        return this.f83539h;
    }

    @Override // io.sentry.y0
    public k8 getSession() {
        return this.f83546o;
    }

    @Override // io.sentry.y0
    public l1 getTransaction() {
        return this.f83534c;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.i0 getUser() {
        return this.f83537f;
    }

    @Override // io.sentry.y0
    public Queue h() {
        return this.f83541j;
    }

    @Override // io.sentry.y0
    public k8 i(b bVar) {
        g1 g1VarD = this.f83547p.d();
        try {
            bVar.a(this.f83546o);
            k8 k8VarClone = this.f83546o != null ? this.f83546o.clone() : null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            return k8VarClone;
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

    @Override // io.sentry.y0
    public Map j() {
        return io.sentry.util.c.b(this.f83542k);
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.c k() {
        return this.f83550s;
    }

    @Override // io.sentry.y0
    public void l(l1 l1Var) {
        g1 g1VarD = this.f83548q.d();
        try {
            this.f83534c = l1Var;
            for (z0 z0Var : this.f83545n.getScopeObservers()) {
                if (l1Var != null) {
                    z0Var.j(l1Var.getName());
                    z0Var.i(l1Var.e(), this);
                } else {
                    z0Var.j(null);
                    z0Var.i(null, this);
                }
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

    @Override // io.sentry.y0
    public void m() {
        g1 g1VarD = this.f83548q.d();
        try {
            this.f83534c = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            this.f83536e = null;
            for (z0 z0Var : this.f83545n.getScopeObservers()) {
                z0Var.j(null);
                z0Var.i(null, this);
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

    @Override // io.sentry.y0
    public io.sentry.featureflags.b n() {
        return this.f83556y;
    }

    @Override // io.sentry.y0
    public void o(e1 e1Var) {
        this.f83554w = e1Var;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.x p() {
        return this.f83553v;
    }

    @Override // io.sentry.y0
    public void q(String str) {
        this.f83538g = str;
        io.sentry.protocol.c cVarK = k();
        io.sentry.protocol.a aVarD = cVarK.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVarK.o(aVarD);
        }
        if (str == null) {
            aVarD.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.x(arrayList);
        }
        Iterator<z0> it = this.f83545n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(cVarK);
        }
    }

    @Override // io.sentry.y0
    public e1 r() {
        return this.f83554w;
    }

    @Override // io.sentry.y0
    public void s(w6 w6Var) {
        io.sentry.util.x xVar;
        j1 j1Var;
        if (!this.f83545n.isTracingEnabled() || w6Var.O() == null || (xVar = (io.sentry.util.x) this.f83555x.get(io.sentry.util.g.a(w6Var.O()))) == null) {
            return;
        }
        WeakReference weakReference = (WeakReference) xVar.a();
        if (w6Var.C().j() == null && weakReference != null && (j1Var = (j1) weakReference.get()) != null) {
            w6Var.C().z(j1Var.e());
        }
        String str = (String) xVar.b();
        if (w6Var.y0() != null || str == null) {
            return;
        }
        w6Var.J0(str);
    }

    @Override // io.sentry.y0
    public List t() {
        return io.sentry.util.f.a(this.f83544m);
    }

    @Override // io.sentry.y0
    public void u(a4 a4Var) {
        this.f83552u = a4Var;
        p8 p8VarG = a4Var.g();
        Iterator<z0> it = this.f83545n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(p8VarG, this);
        }
    }

    @Override // io.sentry.y0
    public void v(v7 v7Var) {
        this.f83545n = v7Var;
        Queue queue = this.f83541j;
        this.f83541j = H(v7Var.getMaxBreadcrumbs());
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            b((e) it.next());
        }
    }

    @Override // io.sentry.y0
    public j1 w() {
        j1 j1VarO;
        j1 j1Var = (j1) this.f83535d.get();
        if (j1Var != null) {
            return j1Var;
        }
        l1 l1Var = this.f83534c;
        return (l1Var == null || (j1VarO = l1Var.o()) == null) ? l1Var : j1VarO;
    }

    @Override // io.sentry.y0
    public List x() {
        return this.f83544m;
    }

    @Override // io.sentry.y0
    public String y() {
        return this.f83538g;
    }

    @Override // io.sentry.y0
    public List z() {
        return this.f83540i;
    }

    @Override // io.sentry.y0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public y0 m7813clone() {
        return new h4(this);
    }

    private h4(h4 h4Var) {
        this.f83535d = new WeakReference(null);
        this.f83540i = new ArrayList();
        this.f83542k = new ConcurrentHashMap();
        this.f83543l = new ConcurrentHashMap();
        this.f83544m = new CopyOnWriteArrayList();
        this.f83547p = new io.sentry.util.a();
        this.f83548q = new io.sentry.util.a();
        this.f83549r = new io.sentry.util.a();
        this.f83550s = new io.sentry.protocol.c();
        this.f83551t = new CopyOnWriteArrayList();
        this.f83553v = io.sentry.protocol.x.f84062c;
        this.f83554w = z2.h();
        this.f83555x = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f83534c = h4Var.f83534c;
        this.f83536e = h4Var.f83536e;
        this.f83535d = h4Var.f83535d;
        this.f83546o = h4Var.f83546o;
        this.f83545n = h4Var.f83545n;
        this.f83533b = h4Var.f83533b;
        this.f83554w = h4Var.f83554w;
        this.f83532a = h4Var.J();
        io.sentry.protocol.i0 i0Var = h4Var.f83537f;
        this.f83537f = i0Var != null ? new io.sentry.protocol.i0(i0Var) : null;
        this.f83538g = h4Var.f83538g;
        this.f83553v = h4Var.f83553v;
        io.sentry.protocol.o oVar = h4Var.f83539h;
        this.f83539h = oVar != null ? new io.sentry.protocol.o(oVar) : null;
        this.f83540i = new ArrayList(h4Var.f83540i);
        this.f83544m = new CopyOnWriteArrayList(h4Var.f83544m);
        e[] eVarArr = (e[]) h4Var.f83541j.toArray(new e[0]);
        Queue queueH = H(h4Var.f83545n.getMaxBreadcrumbs());
        for (e eVar : eVarArr) {
            queueH.add(new e(eVar));
        }
        this.f83541j = queueH;
        Map map = h4Var.f83542k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f83542k = concurrentHashMap;
        Map map2 = h4Var.f83543l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f83543l = concurrentHashMap2;
        this.f83550s = new io.sentry.protocol.c(h4Var.f83550s);
        this.f83551t = new CopyOnWriteArrayList(h4Var.f83551t);
        this.f83556y = h4Var.f83556y.m7809clone();
        this.f83552u = new a4(h4Var.f83552u);
    }
}
