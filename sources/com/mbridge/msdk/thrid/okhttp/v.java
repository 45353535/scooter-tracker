package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.r;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public class v implements Cloneable {
    static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f51562h, j.f51564j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f51633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f51634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<w> f51635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<j> f51636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<t> f51637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<t> f51638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o.c f51639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ProxySelector f51640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final l f51641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final SocketFactory f51642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final SSLSocketFactory f51643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c f51644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final HostnameVerifier f51645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f51646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f51647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f51648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final i f51649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final n f51650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f51651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f51652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final boolean f51653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f51654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f51655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f51656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final int f51657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final int f51658z;

    static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f51196e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f51065c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m f51659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Proxy f51660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<w> f51661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<j> f51662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<t> f51663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<t> f51664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        o.c f51665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ProxySelector f51666h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        l f51667i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        SocketFactory f51668j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        SSLSocketFactory f51669k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.tls.c f51670l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HostnameVerifier f51671m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        f f51672n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f51673o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f51674p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i f51675q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        n f51676r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f51677s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f51678t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f51679u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f51680v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f51681w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f51682x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f51683y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f51684z;

        public b() {
            this.f51663e = new ArrayList();
            this.f51664f = new ArrayList();
            this.f51659a = new m();
            this.f51661c = v.A;
            this.f51662d = v.B;
            this.f51665g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f51666h = proxySelector;
            if (proxySelector == null) {
                this.f51666h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f51667i = l.f51586a;
            this.f51668j = SocketFactory.getDefault();
            this.f51671m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f51558a;
            this.f51672n = f.f51112c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f51075a;
            this.f51673o = bVar;
            this.f51674p = bVar;
            this.f51675q = new i();
            this.f51676r = n.f51595a;
            this.f51677s = true;
            this.f51678t = true;
            this.f51679u = true;
            this.f51680v = 0;
            this.f51681w = 10000;
            this.f51682x = 10000;
            this.f51683y = 10000;
            this.f51684z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f51680v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f51681w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f51684z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f51682x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f51683y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f51676r = nVar;
            return this;
        }

        public b b(boolean z10) {
            this.f51679u = z10;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f51671m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.f51675q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f51678t = z10;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f51659a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.f51661c = DesugarCollections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.f51665g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f51663e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f51664f = arrayList2;
            this.f51659a = vVar.f51633a;
            this.f51660b = vVar.f51634b;
            this.f51661c = vVar.f51635c;
            this.f51662d = vVar.f51636d;
            arrayList.addAll(vVar.f51637e);
            arrayList2.addAll(vVar.f51638f);
            this.f51665g = vVar.f51639g;
            this.f51666h = vVar.f51640h;
            this.f51667i = vVar.f51641i;
            this.f51668j = vVar.f51642j;
            this.f51669k = vVar.f51643k;
            this.f51670l = vVar.f51644l;
            this.f51671m = vVar.f51645m;
            this.f51672n = vVar.f51646n;
            this.f51673o = vVar.f51647o;
            this.f51674p = vVar.f51648p;
            this.f51675q = vVar.f51649q;
            this.f51676r = vVar.f51650r;
            this.f51677s = vVar.f51651s;
            this.f51678t = vVar.f51652t;
            this.f51679u = vVar.f51653u;
            this.f51680v = vVar.f51654v;
            this.f51681w = vVar.f51655w;
            this.f51682x = vVar.f51656x;
            this.f51683y = vVar.f51657y;
            this.f51684z = vVar.f51658z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f51199a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f51642j;
    }

    public SSLSocketFactory B() {
        return this.f51643k;
    }

    public int C() {
        return this.f51657y;
    }

    public int b() {
        return this.f51654v;
    }

    public f c() {
        return this.f51646n;
    }

    public int e() {
        return this.f51655w;
    }

    public i f() {
        return this.f51649q;
    }

    public List<j> g() {
        return this.f51636d;
    }

    public l i() {
        return this.f51641i;
    }

    public m j() {
        return this.f51633a;
    }

    public n k() {
        return this.f51650r;
    }

    public o.c l() {
        return this.f51639g;
    }

    public boolean m() {
        return this.f51652t;
    }

    public boolean n() {
        return this.f51651s;
    }

    public HostnameVerifier o() {
        return this.f51645m;
    }

    public List<t> p() {
        return this.f51637e;
    }

    com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f51638f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f51658z;
    }

    public List<w> u() {
        return this.f51635c;
    }

    public Proxy v() {
        return this.f51634b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f51647o;
    }

    public ProxySelector x() {
        return this.f51640h;
    }

    public int y() {
        return this.f51656x;
    }

    public boolean z() {
        return this.f51653u;
    }

    v(b bVar) {
        boolean z10;
        this.f51633a = bVar.f51659a;
        this.f51634b = bVar.f51660b;
        this.f51635c = bVar.f51661c;
        List<j> list = bVar.f51662d;
        this.f51636d = list;
        this.f51637e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f51663e);
        this.f51638f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f51664f);
        this.f51639g = bVar.f51665g;
        this.f51640h = bVar.f51666h;
        this.f51641i = bVar.f51667i;
        this.f51642j = bVar.f51668j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().b()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f51669k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f51643k = a(x509TrustManagerA);
            this.f51644l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f51643k = sSLSocketFactory;
            this.f51644l = bVar.f51670l;
        }
        if (this.f51643k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f51643k);
        }
        this.f51645m = bVar.f51671m;
        this.f51646n = bVar.f51672n.a(this.f51644l);
        this.f51647o = bVar.f51673o;
        this.f51648p = bVar.f51674p;
        this.f51649q = bVar.f51675q;
        this.f51650r = bVar.f51676r;
        this.f51651s = bVar.f51677s;
        this.f51652t = bVar.f51678t;
        this.f51653u = bVar.f51679u;
        this.f51654v = bVar.f51680v;
        this.f51655w = bVar.f51681w;
        this.f51656x = bVar.f51682x;
        this.f51657y = bVar.f51683y;
        this.f51658z = bVar.f51684z;
        if (this.f51637e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f51637e);
        }
        if (this.f51638f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f51638f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f51648p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
