package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f51258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f51259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f51260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f51261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f51262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f51264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f51265h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f51266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51267b = 0;

        a(List<c0> list) {
            this.f51266a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f51266a);
        }

        public boolean b() {
            return this.f51267b < this.f51266a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f51266a;
            int i10 = this.f51267b;
            this.f51267b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.f51262e = list;
        this.f51264g = list;
        this.f51265h = new ArrayList();
        this.f51258a = aVar;
        this.f51259b = dVar;
        this.f51260c = dVar2;
        this.f51261d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f51263f < this.f51262e.size();
    }

    private Proxy d() throws IOException {
        if (b()) {
            List<Proxy> list = this.f51262e;
            int i10 = this.f51263f;
            this.f51263f = i10 + 1;
            Proxy proxy = list.get(i10);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f51258a.k().g() + "; exhausted proxy configurations: " + this.f51262e);
    }

    public boolean a() {
        return b() || !this.f51265h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f51264g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f51258a, proxyD, this.f51264g.get(i10));
                if (this.f51259b.c(c0Var)) {
                    this.f51265h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f51265h);
            this.f51265h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f51258a.h() != null) {
            this.f51258a.h().connectFailed(this.f51258a.k().n(), c0Var.b().address(), iOException);
        }
        this.f51259b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f51262e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f51258a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f51262e = listA;
        }
        this.f51263f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f51264g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f51258a.k().g();
            iJ = this.f51258a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f51264g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f51261d.dnsStart(this.f51260c, strG);
            List<InetAddress> listA = this.f51258a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f51261d.dnsEnd(this.f51260c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f51264g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f51258a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + StringUtils.PROCESS_POSTFIX_DELIMITER + iJ + "; port is out of range");
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
