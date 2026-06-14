package hh;

import hh.e;
import hh.r;
import j$.util.DesugarCollections;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh.h;
import uh.c;

/* JADX INFO: loaded from: classes10.dex */
public class x implements Cloneable, e.a {
    public static final b F = new b(null);
    private static final List G = ih.d.w(y.HTTP_2, y.HTTP_1_1);
    private static final List H = ih.d.w(l.f73697i, l.f73699k);
    private final int A;
    private final int B;
    private final int C;
    private final long D;
    private final mh.h E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f73777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f73778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f73779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f73780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.c f73781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f73782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final hh.b f73783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f73784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f73785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n f73786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f73787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final q f73788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Proxy f73789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ProxySelector f73790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final hh.b f73791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SocketFactory f73792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SSLSocketFactory f73793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final X509TrustManager f73794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f73796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final HostnameVerifier f73797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final g f73798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final uh.c f73799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f73800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f73801z;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return x.H;
        }

        public final List b() {
            return x.G;
        }

        private b() {
        }
    }

    public x(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorE;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f73777b = builder.r();
        this.f73778c = builder.o();
        this.f73779d = ih.d.T(builder.x());
        this.f73780e = ih.d.T(builder.z());
        this.f73781f = builder.t();
        this.f73782g = builder.G();
        this.f73783h = builder.i();
        this.f73784i = builder.u();
        this.f73785j = builder.v();
        this.f73786k = builder.q();
        this.f73787l = builder.j();
        this.f73788m = builder.s();
        this.f73789n = builder.C();
        if (builder.C() != null) {
            proxySelectorE = th.a.f105176a;
        } else {
            proxySelectorE = builder.E();
            proxySelectorE = proxySelectorE == null ? ProxySelector.getDefault() : proxySelectorE;
            if (proxySelectorE == null) {
                proxySelectorE = th.a.f105176a;
            }
        }
        this.f73790o = proxySelectorE;
        this.f73791p = builder.D();
        this.f73792q = builder.I();
        List listP = builder.p();
        this.f73795t = listP;
        this.f73796u = builder.B();
        this.f73797v = builder.w();
        this.f73800y = builder.k();
        this.f73801z = builder.n();
        this.A = builder.F();
        this.B = builder.K();
        this.C = builder.A();
        this.D = builder.y();
        mh.h hVarH = builder.H();
        this.E = hVarH == null ? new mh.h() : hVarH;
        List list = listP;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f73793r = null;
            this.f73799x = null;
            this.f73794s = null;
            this.f73798w = g.f73612d;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.J() != null) {
                        this.f73793r = builder.J();
                        uh.c cVarL = builder.l();
                        Intrinsics.checkNotNull(cVarL);
                        this.f73799x = cVarL;
                        X509TrustManager x509TrustManagerL = builder.L();
                        Intrinsics.checkNotNull(x509TrustManagerL);
                        this.f73794s = x509TrustManagerL;
                        g gVarM = builder.m();
                        Intrinsics.checkNotNull(cVarL);
                        this.f73798w = gVarM.e(cVarL);
                    } else {
                        h.a aVar = rh.h.f99497a;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f73794s = x509TrustManagerP;
                        rh.h hVarG = aVar.g();
                        Intrinsics.checkNotNull(x509TrustManagerP);
                        this.f73793r = hVarG.o(x509TrustManagerP);
                        c.a aVar2 = uh.c.f105671a;
                        Intrinsics.checkNotNull(x509TrustManagerP);
                        uh.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f73799x = cVarA;
                        g gVarM2 = builder.m();
                        Intrinsics.checkNotNull(cVarA);
                        this.f73798w = gVarM2.e(cVarA);
                    }
                }
            }
            this.f73793r = null;
            this.f73799x = null;
            this.f73794s = null;
            this.f73798w = g.f73612d;
        }
        O();
    }

    private final void O() {
        List list = this.f73779d;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f73779d).toString());
        }
        List list2 = this.f73780e;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f73780e).toString());
        }
        List list3 = this.f73795t;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f73793r == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f73799x == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f73794s == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f73793r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f73799x != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f73794s != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f73798w, g.f73612d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final HostnameVerifier A() {
        return this.f73797v;
    }

    public final List B() {
        return this.f73779d;
    }

    public final long C() {
        return this.D;
    }

    public final List D() {
        return this.f73780e;
    }

    public a E() {
        return new a(this);
    }

    public final int F() {
        return this.C;
    }

    public final List G() {
        return this.f73796u;
    }

    public final Proxy H() {
        return this.f73789n;
    }

    public final hh.b I() {
        return this.f73791p;
    }

    public final ProxySelector J() {
        return this.f73790o;
    }

    public final int K() {
        return this.A;
    }

    public final boolean L() {
        return this.f73782g;
    }

    public final SocketFactory M() {
        return this.f73792q;
    }

    public final SSLSocketFactory N() {
        SSLSocketFactory sSLSocketFactory = this.f73793r;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int P() {
        return this.B;
    }

    public final X509TrustManager Q() {
        return this.f73794s;
    }

    @Override // hh.e.a
    public e a(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new mh.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final hh.b k() {
        return this.f73783h;
    }

    public final c l() {
        return this.f73787l;
    }

    public final int n() {
        return this.f73800y;
    }

    public final uh.c o() {
        return this.f73799x;
    }

    public final g p() {
        return this.f73798w;
    }

    public final int q() {
        return this.f73801z;
    }

    public final k r() {
        return this.f73778c;
    }

    public final List s() {
        return this.f73795t;
    }

    public final n t() {
        return this.f73786k;
    }

    public final p u() {
        return this.f73777b;
    }

    public final q v() {
        return this.f73788m;
    }

    public final r.c w() {
        return this.f73781f;
    }

    public final boolean x() {
        return this.f73784i;
    }

    public final boolean y() {
        return this.f73785j;
    }

    public final mh.h z() {
        return this.E;
    }

    public static final class a {
        private int A;
        private int B;
        private long C;
        private mh.h D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f73802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f73803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f73804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f73805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f73806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f73807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private hh.b f73808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f73809h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f73810i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f73811j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f73812k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f73813l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f73814m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f73815n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private hh.b f73816o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f73817p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f73818q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f73819r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f73820s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f73821t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f73822u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private g f73823v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private uh.c f73824w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f73825x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f73826y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f73827z;

        public a() {
            this.f73802a = new p();
            this.f73803b = new k();
            this.f73804c = new ArrayList();
            this.f73805d = new ArrayList();
            this.f73806e = ih.d.g(r.f73737b);
            this.f73807f = true;
            hh.b bVar = hh.b.f73507b;
            this.f73808g = bVar;
            this.f73809h = true;
            this.f73810i = true;
            this.f73811j = n.f73723b;
            this.f73813l = q.f73734b;
            this.f73816o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f73817p = socketFactory;
            b bVar2 = x.F;
            this.f73820s = bVar2.a();
            this.f73821t = bVar2.b();
            this.f73822u = uh.d.f105672b;
            this.f73823v = g.f73612d;
            this.f73826y = 10000;
            this.f73827z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final int A() {
            return this.B;
        }

        public final List B() {
            return this.f73821t;
        }

        public final Proxy C() {
            return this.f73814m;
        }

        public final hh.b D() {
            return this.f73816o;
        }

        public final ProxySelector E() {
            return this.f73815n;
        }

        public final int F() {
            return this.f73827z;
        }

        public final boolean G() {
            return this.f73807f;
        }

        public final mh.h H() {
            return this.D;
        }

        public final SocketFactory I() {
            return this.f73817p;
        }

        public final SSLSocketFactory J() {
            return this.f73818q;
        }

        public final int K() {
            return this.A;
        }

        public final X509TrustManager L() {
            return this.f73819r;
        }

        public final a M(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            y yVar = y.H2_PRIOR_KNOWLEDGE;
            if (!mutableList.contains(yVar) && !mutableList.contains(y.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(yVar) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(y.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            Intrinsics.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            mutableList.remove(y.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.f73821t)) {
                this.D = null;
            }
            List listUnmodifiableList = DesugarCollections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f73821t = listUnmodifiableList;
            return this;
        }

        public final a N(ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.areEqual(proxySelector, this.f73815n)) {
                this.D = null;
            }
            this.f73815n = proxySelector;
            return this;
        }

        public final a O(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f73827z = ih.d.k("timeout", j10, unit);
            return this;
        }

        public final a P(boolean z10) {
            this.f73807f = z10;
            return this;
        }

        public final a Q(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.A = ih.d.k("timeout", j10, unit);
            return this;
        }

        public final a a(v interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f73804c.add(interceptor);
            return this;
        }

        public final a b(v interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f73805d.add(interceptor);
            return this;
        }

        public final x c() {
            return new x(this);
        }

        public final a d(c cVar) {
            this.f73812k = cVar;
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f73826y = ih.d.k("timeout", j10, unit);
            return this;
        }

        public final a f(p dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f73802a = dispatcher;
            return this;
        }

        public final a g(boolean z10) {
            this.f73809h = z10;
            return this;
        }

        public final a h(boolean z10) {
            this.f73810i = z10;
            return this;
        }

        public final hh.b i() {
            return this.f73808g;
        }

        public final c j() {
            return this.f73812k;
        }

        public final int k() {
            return this.f73825x;
        }

        public final uh.c l() {
            return this.f73824w;
        }

        public final g m() {
            return this.f73823v;
        }

        public final int n() {
            return this.f73826y;
        }

        public final k o() {
            return this.f73803b;
        }

        public final List p() {
            return this.f73820s;
        }

        public final n q() {
            return this.f73811j;
        }

        public final p r() {
            return this.f73802a;
        }

        public final q s() {
            return this.f73813l;
        }

        public final r.c t() {
            return this.f73806e;
        }

        public final boolean u() {
            return this.f73809h;
        }

        public final boolean v() {
            return this.f73810i;
        }

        public final HostnameVerifier w() {
            return this.f73822u;
        }

        public final List x() {
            return this.f73804c;
        }

        public final long y() {
            return this.C;
        }

        public final List z() {
            return this.f73805d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(x okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f73802a = okHttpClient.u();
            this.f73803b = okHttpClient.r();
            CollectionsKt.addAll(this.f73804c, okHttpClient.B());
            CollectionsKt.addAll(this.f73805d, okHttpClient.D());
            this.f73806e = okHttpClient.w();
            this.f73807f = okHttpClient.L();
            this.f73808g = okHttpClient.k();
            this.f73809h = okHttpClient.x();
            this.f73810i = okHttpClient.y();
            this.f73811j = okHttpClient.t();
            this.f73812k = okHttpClient.l();
            this.f73813l = okHttpClient.v();
            this.f73814m = okHttpClient.H();
            this.f73815n = okHttpClient.J();
            this.f73816o = okHttpClient.I();
            this.f73817p = okHttpClient.M();
            this.f73818q = okHttpClient.f73793r;
            this.f73819r = okHttpClient.Q();
            this.f73820s = okHttpClient.s();
            this.f73821t = okHttpClient.G();
            this.f73822u = okHttpClient.A();
            this.f73823v = okHttpClient.p();
            this.f73824w = okHttpClient.o();
            this.f73825x = okHttpClient.n();
            this.f73826y = okHttpClient.q();
            this.f73827z = okHttpClient.K();
            this.A = okHttpClient.P();
            this.B = okHttpClient.F();
            this.C = okHttpClient.C();
            this.D = okHttpClient.z();
        }
    }

    public x() {
        this(new a());
    }
}
