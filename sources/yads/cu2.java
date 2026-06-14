package yads;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class cu2 implements zt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu2 f109598a;

    public cu2(gr2 gr2Var) {
        this.f109598a = new bu2(gr2Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f109598a.f109116b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f109598a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.f109598a.f109116b.getValue()).getAcceptedIssuers();
    }
}
