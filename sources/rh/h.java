package rh;

import hh.x;
import hh.y;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f99497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h f99498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f99499c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h d() {
            sh.c.f104700a.b();
            h hVarA = rh.a.f99467e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f99470f.a();
            Intrinsics.checkNotNull(hVarA2);
            return hVarA2;
        }

        private final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f99479e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f99476e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f99494e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f99492d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f99483i.a();
            return hVarA != null ? hVarA : new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((y) obj) != y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            vh.e eVar = new vh.e();
            for (String str : b(protocols)) {
                eVar.writeByte(str.length());
                eVar.writeUtf8(str);
            }
            return eVar.readByteArray();
        }

        public final h g() {
            return h.f99498b;
        }

        public final boolean h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f99497a = aVar;
        f99498b = aVar.f();
        f99499c = Logger.getLogger(x.class.getName());
    }

    public static /* synthetic */ void l(h hVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        hVar.k(str, i10, th2);
    }

    public void b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public uh.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new uh.a(d(trustManager));
    }

    public uh.e d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new uh.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f99499c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        f99499c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
