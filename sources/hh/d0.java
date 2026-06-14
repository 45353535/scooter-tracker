package hh;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f73600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f73601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f73602c;

    public d0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f73600a = address;
        this.f73601b = proxy;
        this.f73602c = socketAddress;
    }

    public final a a() {
        return this.f73600a;
    }

    public final Proxy b() {
        return this.f73601b;
    }

    public final boolean c() {
        return this.f73600a.k() != null && this.f73601b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f73602c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(d0Var.f73600a, this.f73600a) && Intrinsics.areEqual(d0Var.f73601b, this.f73601b) && Intrinsics.areEqual(d0Var.f73602c, this.f73602c);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f73600a.hashCode()) * 31) + this.f73601b.hashCode()) * 31) + this.f73602c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f73602c + '}';
    }
}
