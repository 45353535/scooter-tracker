package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0007¢\u0006\u0004\b)\u0010(J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b*\u0010+J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b,\u0010-J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b.\u0010/J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b0\u00101J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u0002052\u0006\u0010:\u001a\u00020\u0000H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\b\u0007\u0010AR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\b\t\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\b\u000b\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\b\r\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\b\u000f\u0010FR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\b\u0011\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010-R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\b\u001a\u0010+R\u0017\u0010 \u001a\u00020\u001d8G¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\b \u0010LR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\b\u0016\u0010(R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\b\u0018\u0010(¨\u0006N"}, d2 = {"Lcom/applovin/shadow/okhttp3/Address;", "", "", "uriHost", "", "uriPort", "Lcom/applovin/shadow/okhttp3/Dns;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "certificatePinner", "Lcom/applovin/shadow/okhttp3/Authenticator;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocols", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILhh/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lhh/g;Lhh/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "-deprecated_url", "()Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "-deprecated_dns", "()Lcom/applovin/shadow/okhttp3/Dns;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "-deprecated_proxyAuthenticator", "()Lcom/applovin/shadow/okhttp3/Authenticator;", "-deprecated_protocols", "()Ljava/util/List;", "-deprecated_connectionSpecs", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "-deprecated_certificatePinner", "()Lcom/applovin/shadow/okhttp3/CertificatePinner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "equalsNonHost$okhttp", "(Lcom/applovin/shadow/okhttp3/Address;)Z", "equalsNonHost", "toString", "()Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/Dns;", "()Lhh/q;", "Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "()Lhh/g;", "Lcom/applovin/shadow/okhttp3/Authenticator;", "()Lhh/b;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "()Lhh/u;", "Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Address {

    @Nullable
    private final CertificatePinner certificatePinner;

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;

    @NotNull
    private final Dns dns;

    @Nullable
    private final HostnameVerifier hostnameVerifier;

    @NotNull
    private final List<Protocol> protocols;

    @Nullable
    private final Proxy proxy;

    @NotNull
    private final Authenticator proxyAuthenticator;

    @NotNull
    private final ProxySelector proxySelector;

    @NotNull
    private final SocketFactory socketFactory;

    @Nullable
    private final SSLSocketFactory sslSocketFactory;

    @NotNull
    private final HttpUrl url;

    public Address(@NotNull String uriHost, int i10, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<ConnectionSpec> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(uriHost).port(i10).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m4268deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m4271deprecated_protocols() {
        return this.protocols;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name and from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.dns, that.dns) && Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, that.protocols) && Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, that.proxySelector) && Intrinsics.areEqual(this.proxy, that.proxy) && Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.url.host());
        sb3.append(':');
        sb3.append(this.url.port());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
