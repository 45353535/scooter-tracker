package io.sentry;

import io.sentry.h4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f83525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f83526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0 f83527c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83528a;

        static {
            int[] iArr = new int[l4.values().length];
            f83528a = iArr;
            try {
                iArr[l4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83528a[l4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83528a[l4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83528a[l4.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        this.f83525a = y0Var;
        this.f83526b = y0Var2;
        this.f83527c = y0Var3;
    }

    private y0 b() {
        return e(null);
    }

    @Override // io.sentry.y0
    public String A() {
        String strA = this.f83527c.A();
        if (strA != null) {
            return strA;
        }
        String strA2 = this.f83526b.A();
        return strA2 != null ? strA2 : this.f83525a.A();
    }

    @Override // io.sentry.y0
    public a4 B() {
        return b().B();
    }

    @Override // io.sentry.y0
    public List C() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f83525a.C());
        copyOnWriteArrayList.addAll(this.f83526b.C());
        copyOnWriteArrayList.addAll(this.f83527c.C());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.y0
    public a4 D(h4.a aVar) {
        return b().D(aVar);
    }

    @Override // io.sentry.y0
    public void E(h4.c cVar) {
        b().E(cVar);
    }

    @Override // io.sentry.y0
    public void F(io.sentry.protocol.x xVar) {
        this.f83525a.F(xVar);
        this.f83526b.F(xVar);
        this.f83527c.F(xVar);
    }

    @Override // io.sentry.y0
    public void a(e eVar, i0 i0Var) {
        b().a(eVar, i0Var);
    }

    @Override // io.sentry.y0
    public void c(Throwable th2, j1 j1Var, String str) {
        this.f83525a.c(th2, j1Var, str);
    }

    @Override // io.sentry.y0
    public void clear() {
        b().clear();
    }

    @Override // io.sentry.y0
    public h4.d d() {
        return b().d();
    }

    y0 e(l4 l4Var) {
        if (l4Var != null) {
            int i10 = a.f83528a[l4Var.ordinal()];
            if (i10 == 1) {
                return this.f83527c;
            }
            if (i10 == 2) {
                return this.f83526b;
            }
            if (i10 == 3) {
                return this.f83525a;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = a.f83528a[getOptions().getDefaultScopeType().ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? this.f83527c : this.f83525a : this.f83526b : this.f83527c;
    }

    @Override // io.sentry.y0
    public k8 f() {
        return b().f();
    }

    @Override // io.sentry.y0
    public void g(io.sentry.protocol.x xVar) {
        b().g(xVar);
    }

    @Override // io.sentry.y0
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f83525a.getExtras());
        concurrentHashMap.putAll(this.f83526b.getExtras());
        concurrentHashMap.putAll(this.f83527c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.g getFeatureFlags() {
        return n().getFeatureFlags();
    }

    @Override // io.sentry.y0
    public g7 getLevel() {
        g7 level = this.f83527c.getLevel();
        if (level != null) {
            return level;
        }
        g7 level2 = this.f83526b.getLevel();
        return level2 != null ? level2 : this.f83525a.getLevel();
    }

    @Override // io.sentry.y0
    public v7 getOptions() {
        return this.f83525a.getOptions();
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.o getRequest() {
        io.sentry.protocol.o request = this.f83527c.getRequest();
        if (request != null) {
            return request;
        }
        io.sentry.protocol.o request2 = this.f83526b.getRequest();
        return request2 != null ? request2 : this.f83525a.getRequest();
    }

    @Override // io.sentry.y0
    public k8 getSession() {
        k8 session = this.f83527c.getSession();
        if (session != null) {
            return session;
        }
        k8 session2 = this.f83526b.getSession();
        return session2 != null ? session2 : this.f83525a.getSession();
    }

    @Override // io.sentry.y0
    public l1 getTransaction() {
        l1 transaction = this.f83527c.getTransaction();
        if (transaction != null) {
            return transaction;
        }
        l1 transaction2 = this.f83526b.getTransaction();
        return transaction2 != null ? transaction2 : this.f83525a.getTransaction();
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.i0 getUser() {
        io.sentry.protocol.i0 user = this.f83527c.getUser();
        if (user != null) {
            return user;
        }
        io.sentry.protocol.i0 user2 = this.f83526b.getUser();
        return user2 != null ? user2 : this.f83525a.getUser();
    }

    @Override // io.sentry.y0
    public Queue h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f83525a.h());
        arrayList.addAll(this.f83526b.h());
        arrayList.addAll(this.f83527c.h());
        Collections.sort(arrayList);
        Queue queueH = h4.H(this.f83527c.getOptions().getMaxBreadcrumbs());
        queueH.addAll(arrayList);
        return queueH;
    }

    @Override // io.sentry.y0
    public k8 i(h4.b bVar) {
        return b().i(bVar);
    }

    @Override // io.sentry.y0
    public Map j() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f83525a.j());
        concurrentHashMap.putAll(this.f83526b.j());
        concurrentHashMap.putAll(this.f83527c.j());
        return concurrentHashMap;
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.c k() {
        return new g(this.f83525a.k(), this.f83526b.k(), this.f83527c.k(), getOptions().getDefaultScopeType());
    }

    @Override // io.sentry.y0
    public void l(l1 l1Var) {
        b().l(l1Var);
    }

    @Override // io.sentry.y0
    public void m() {
        b().m();
    }

    @Override // io.sentry.y0
    public io.sentry.featureflags.b n() {
        return io.sentry.featureflags.a.c(getOptions(), this.f83525a.n(), this.f83526b.n(), this.f83527c.n());
    }

    @Override // io.sentry.y0
    public void o(e1 e1Var) {
        b().o(e1Var);
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.x p() {
        io.sentry.protocol.x xVarP = this.f83527c.p();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        if (!xVar.equals(xVarP)) {
            return xVarP;
        }
        io.sentry.protocol.x xVarP2 = this.f83526b.p();
        return !xVar.equals(xVarP2) ? xVarP2 : this.f83525a.p();
    }

    @Override // io.sentry.y0
    public void q(String str) {
        b().q(str);
    }

    @Override // io.sentry.y0
    public e1 r() {
        e1 e1VarR = this.f83527c.r();
        if (!(e1VarR instanceof z2)) {
            return e1VarR;
        }
        e1 e1VarR2 = this.f83526b.r();
        return !(e1VarR2 instanceof z2) ? e1VarR2 : this.f83525a.r();
    }

    @Override // io.sentry.y0
    public void s(w6 w6Var) {
        this.f83525a.s(w6Var);
    }

    @Override // io.sentry.y0
    public List t() {
        return io.sentry.util.f.a(x());
    }

    @Override // io.sentry.y0
    public void u(a4 a4Var) {
        b().u(a4Var);
    }

    @Override // io.sentry.y0
    public void v(v7 v7Var) {
        this.f83525a.v(v7Var);
    }

    @Override // io.sentry.y0
    public j1 w() {
        j1 j1VarW = this.f83527c.w();
        if (j1VarW != null) {
            return j1VarW;
        }
        j1 j1VarW2 = this.f83526b.w();
        return j1VarW2 != null ? j1VarW2 : this.f83525a.w();
    }

    @Override // io.sentry.y0
    public List x() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f83525a.x());
        copyOnWriteArrayList.addAll(this.f83526b.x());
        copyOnWriteArrayList.addAll(this.f83527c.x());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.y0
    public String y() {
        String strY = this.f83527c.y();
        if (strY != null) {
            return strY;
        }
        String strY2 = this.f83526b.y();
        return strY2 != null ? strY2 : this.f83525a.y();
    }

    @Override // io.sentry.y0
    public List z() {
        List listZ = this.f83527c.z();
        if (!listZ.isEmpty()) {
            return listZ;
        }
        List listZ2 = this.f83526b.z();
        return !listZ2.isEmpty() ? listZ2 : this.f83525a.z();
    }

    @Override // io.sentry.y0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public y0 m7812clone() {
        return new h(this.f83525a, this.f83526b.m7813clone(), this.f83527c.m7813clone());
    }
}
