package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f51039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f51040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final SocketFactory f51041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f51042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<w> f51043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<j> f51044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ProxySelector f51045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Proxy f51046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f51047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HostnameVerifier f51048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final f f51049k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f51039a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f51040b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f51041c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f51042d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f51043e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f51044f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f51045g = proxySelector;
        this.f51046h = proxy;
        this.f51047i = sSLSocketFactory;
        this.f51048j = hostnameVerifier;
        this.f51049k = fVar;
    }

    public f a() {
        return this.f51049k;
    }

    public List<j> b() {
        return this.f51044f;
    }

    public n c() {
        return this.f51040b;
    }

    public HostnameVerifier d() {
        return this.f51048j;
    }

    public List<w> e() {
        return this.f51043e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f51039a.equals(aVar.f51039a) && a(aVar);
    }

    public Proxy f() {
        return this.f51046h;
    }

    public b g() {
        return this.f51042d;
    }

    public ProxySelector h() {
        return this.f51045g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f51039a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f51040b.hashCode()) * 31) + this.f51042d.hashCode()) * 31) + this.f51043e.hashCode()) * 31) + this.f51044f.hashCode()) * 31) + this.f51045g.hashCode()) * 31;
        Proxy proxy = this.f51046h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f51047i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f51048j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f51049k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f51041c;
    }

    public SSLSocketFactory j() {
        return this.f51047i;
    }

    public s k() {
        return this.f51039a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f51039a.g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f51039a.j());
        if (this.f51046h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f51046h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f51045g);
        }
        sb2.append("}");
        return sb2.toString();
    }

    boolean a(a aVar) {
        return this.f51040b.equals(aVar.f51040b) && this.f51042d.equals(aVar.f51042d) && this.f51043e.equals(aVar.f51043e) && this.f51044f.equals(aVar.f51044f) && this.f51045g.equals(aVar.f51045g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51046h, aVar.f51046h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51047i, aVar.f51047i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51048j, aVar.f51048j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51049k, aVar.f51049k) && k().j() == aVar.k().j();
    }
}
