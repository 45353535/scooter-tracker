package he;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f73160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLContext f73161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrustManagerFactory f73162c;

    public a(X509TrustManager x509TrustManager, SSLContext sSLContext, TrustManagerFactory trustManagerFactory) {
        this.f73160a = x509TrustManager;
        this.f73161b = sSLContext;
        this.f73162c = trustManagerFactory;
    }
}
