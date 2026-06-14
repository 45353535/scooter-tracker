package sh;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends uh.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f104697d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManager f104698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f104699c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f104698b = trustManager;
        this.f104699c = x509TrustManagerExtensions;
    }

    @Override // uh.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f104699c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f104698b == this.f104698b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f104698b);
    }
}
