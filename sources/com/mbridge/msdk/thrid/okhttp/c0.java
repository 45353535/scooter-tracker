package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f51102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f51103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InetSocketAddress f51104c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f51102a = aVar;
        this.f51103b = proxy;
        this.f51104c = inetSocketAddress;
    }

    public a a() {
        return this.f51102a;
    }

    public Proxy b() {
        return this.f51103b;
    }

    public boolean c() {
        return this.f51102a.f51047i != null && this.f51103b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f51104c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f51102a.equals(this.f51102a) && c0Var.f51103b.equals(this.f51103b) && c0Var.f51104c.equals(this.f51104c);
    }

    public int hashCode() {
        return ((((this.f51102a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f51103b.hashCode()) * 31) + this.f51104c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f51104c + "}";
    }
}
