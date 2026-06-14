package hh;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f73736a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f73737b = new a();

    public static final class a extends r {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        r a(e eVar);
    }

    public void A(e call, b0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void B(e call, s sVar) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void C(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void a(e call, b0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void b(e call, b0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void c(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void d(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void f(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void g(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(e call, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void i(e call, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void j(e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void k(e call, j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void l(e call, j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void m(e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void n(e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void o(e call, u url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void p(e call, u url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void q(e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void r(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void s(e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void t(e call, z request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void u(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void v(e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void w(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void x(e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void y(e call, b0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void z(e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
