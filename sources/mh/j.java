package mh;

import hh.d0;
import hh.r;
import hh.u;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f95006i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hh.a f95007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f95008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hh.e f95009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f95010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f95011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f95013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f95014h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f95015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f95016b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f95015a = routes;
        }

        public final List a() {
            return this.f95015a;
        }

        public final boolean b() {
            return this.f95016b < this.f95015a.size();
        }

        public final d0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f95015a;
            int i10 = this.f95016b;
            this.f95016b = i10 + 1;
            return (d0) list.get(i10);
        }
    }

    public j(hh.a address, h routeDatabase, hh.e call, r eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f95007a = address;
        this.f95008b = routeDatabase;
        this.f95009c = call;
        this.f95010d = eventListener;
        this.f95011e = CollectionsKt.emptyList();
        this.f95013g = CollectionsKt.emptyList();
        this.f95014h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f95012f < this.f95011e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f95011e;
            int i10 = this.f95012f;
            this.f95012f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f95007a.l().h() + "; exhausted proxy configurations: " + this.f95011e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iL;
        List listLookup;
        ArrayList arrayList = new ArrayList();
        this.f95013g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f95007a.l().h();
            iL = this.f95007a.l().l();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f95006i;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strH = aVar.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || iL >= 65536) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        if (ih.d.i(strH)) {
            listLookup = CollectionsKt.listOf(InetAddress.getByName(strH));
        } else {
            this.f95010d.n(this.f95009c, strH);
            listLookup = this.f95007a.c().lookup(strH);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.f95007a.c() + " returned no addresses for " + strH);
            }
            this.f95010d.m(this.f95009c, strH, listLookup);
        }
        Iterator it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iL));
        }
    }

    private final void f(u uVar, Proxy proxy) {
        this.f95010d.p(this.f95009c, uVar);
        List listG = g(proxy, uVar, this);
        this.f95011e = listG;
        this.f95012f = 0;
        this.f95010d.o(this.f95009c, uVar, listG);
    }

    private static final List g(Proxy proxy, u uVar, j jVar) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriQ = uVar.q();
        if (uriQ.getHost() == null) {
            return ih.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f95007a.i().select(uriQ);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return ih.d.w(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return ih.d.T(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f95014h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f95013g.iterator();
            while (it.hasNext()) {
                d0 d0Var = new d0(this.f95007a, proxyD, (InetSocketAddress) it.next());
                if (this.f95008b.c(d0Var)) {
                    this.f95014h.add(d0Var);
                } else {
                    arrayList.add(d0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f95014h);
            this.f95014h.clear();
        }
        return new b(arrayList);
    }
}
