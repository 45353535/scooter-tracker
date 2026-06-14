package yads;

import androidx.annotation.DoNotInline;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rf {
    @DoNotInline
    public static final void a(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (kn0.a(x509TrustManager)) {
            ln0.a(x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void b(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (kn0.a(x509TrustManager)) {
            ln0.a(x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void a(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (kn0.a(x509TrustManager)) {
            ln0.a(x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void b(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (kn0.a(x509TrustManager)) {
            ln0.a(x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    @NotNull
    public static final zt2 a(@NotNull g20 g20Var) throws CertificateException {
        return new gs2(g20Var);
    }
}
