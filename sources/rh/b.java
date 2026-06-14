package rh;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sh.i;
import sh.j;
import sh.k;
import sh.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f99470f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f99471g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f99472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sh.h f99473e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f99471g;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: rh.b$b, reason: collision with other inner class name */
    public static final class C1186b implements uh.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f99474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f99475b;

        public C1186b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f99474a = trustManager;
            this.f99475b = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1186b)) {
                return false;
            }
            C1186b c1186b = (C1186b) obj;
            return Intrinsics.areEqual(this.f99474a, c1186b.f99474a) && Intrinsics.areEqual(this.f99475b, c1186b.f99475b);
        }

        @Override // uh.e
        public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f99475b.invoke(this.f99474a, cert);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.f99474a.hashCode() * 31) + this.f99475b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f99474a + ", findByIssuerAndSignatureMethod=" + this.f99475b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.f99497a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f99471g = z10;
    }

    public b() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new k[]{l.a.b(l.f104722j, null, 1, null), new j(sh.f.f104704f.d()), new j(i.f104718a.a()), new j(sh.g.f104712a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((k) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f99472d = arrayList;
        this.f99473e = sh.h.f104714d.a();
    }

    @Override // rh.h
    public uh.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        sh.b bVarA = sh.b.f104697d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // rh.h
    public uh.e d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new C1186b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // rh.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f99472d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((k) next).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            kVar.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // rh.h
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // rh.h
    public String h(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f99472d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((k) next).matchesSocket(sslSocket)) {
                break;
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // rh.h
    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f99473e.a(closer);
    }

    @Override // rh.h
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // rh.h
    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f99473e.b(obj)) {
            return;
        }
        h.l(this, message, 5, null, 4, null);
    }
}
