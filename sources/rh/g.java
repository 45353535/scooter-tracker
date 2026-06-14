package rh;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f99494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f99495f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f99496d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new g(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return g.f99495f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f99494e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f99495f = z10;
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // rh.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // rh.h
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return super.h(sslSocket);
    }

    @Override // rh.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f99496d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // rh.h
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f99496d);
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

    private g() {
        this.f99496d = new OpenJSSE();
    }
}
