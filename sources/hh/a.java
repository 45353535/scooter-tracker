package hh;

import com.ironsource.mediationsdk.logger.IronSourceError;
import hh.u;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f73487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f73488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f73489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f73490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f73491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f73492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f73493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f73494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f73495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f73496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f73497k;

    public a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f73487a = dns;
        this.f73488b = socketFactory;
        this.f73489c = sSLSocketFactory;
        this.f73490d = hostnameVerifier;
        this.f73491e = gVar;
        this.f73492f = proxyAuthenticator;
        this.f73493g = proxy;
        this.f73494h = proxySelector;
        this.f73495i = new u.a().o(sSLSocketFactory != null ? "https" : "http").e(uriHost).k(i10).a();
        this.f73496j = ih.d.T(protocols);
        this.f73497k = ih.d.T(connectionSpecs);
    }

    public final g a() {
        return this.f73491e;
    }

    public final List b() {
        return this.f73497k;
    }

    public final q c() {
        return this.f73487a;
    }

    public final boolean d(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f73487a, that.f73487a) && Intrinsics.areEqual(this.f73492f, that.f73492f) && Intrinsics.areEqual(this.f73496j, that.f73496j) && Intrinsics.areEqual(this.f73497k, that.f73497k) && Intrinsics.areEqual(this.f73494h, that.f73494h) && Intrinsics.areEqual(this.f73493g, that.f73493g) && Intrinsics.areEqual(this.f73489c, that.f73489c) && Intrinsics.areEqual(this.f73490d, that.f73490d) && Intrinsics.areEqual(this.f73491e, that.f73491e) && this.f73495i.l() == that.f73495i.l();
    }

    public final HostnameVerifier e() {
        return this.f73490d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f73495i, aVar.f73495i) && d(aVar);
    }

    public final List f() {
        return this.f73496j;
    }

    public final Proxy g() {
        return this.f73493g;
    }

    public final b h() {
        return this.f73492f;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f73495i.hashCode()) * 31) + this.f73487a.hashCode()) * 31) + this.f73492f.hashCode()) * 31) + this.f73496j.hashCode()) * 31) + this.f73497k.hashCode()) * 31) + this.f73494h.hashCode()) * 31) + Objects.hashCode(this.f73493g)) * 31) + Objects.hashCode(this.f73489c)) * 31) + Objects.hashCode(this.f73490d)) * 31) + Objects.hashCode(this.f73491e);
    }

    public final ProxySelector i() {
        return this.f73494h;
    }

    public final SocketFactory j() {
        return this.f73488b;
    }

    public final SSLSocketFactory k() {
        return this.f73489c;
    }

    public final u l() {
        return this.f73495i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f73495i.h());
        sb3.append(':');
        sb3.append(this.f73495i.l());
        sb3.append(", ");
        if (this.f73493g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f73493g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f73494h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
