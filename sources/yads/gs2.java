package yads;

import android.util.Log;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gs2 extends X509ExtendedTrustManager implements zt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu2 f111334a;

    public gs2(g20 g20Var) {
        this.f111334a = new bu2(g20Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f111334a.f109116b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f111334a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.f111334a.f109116b.getValue()).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Unit unit;
        bu2 bu2Var = this.f111334a;
        bu2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) bu2Var.f109116b.getValue();
            if (o63.a()) {
                rf.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (bu2Var.f109119e) {
                try {
                    bu2Var.a();
                    bu2Var.b();
                    X509TrustManager x509TrustManager2 = bu2Var.f109118d;
                    if (x509TrustManager2 != null) {
                        if (o63.a()) {
                            rf.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f93236a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f93236a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        bu2 bu2Var = this.f111334a;
        bu2Var.getClass();
        if (o63.a()) {
            rf.a((X509TrustManager) bu2Var.f109116b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) bu2Var.f109116b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        bu2 bu2Var = this.f111334a;
        bu2Var.getClass();
        if (o63.a()) {
            rf.a((X509TrustManager) bu2Var.f109116b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) bu2Var.f109116b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Unit unit;
        bu2 bu2Var = this.f111334a;
        bu2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) bu2Var.f109116b.getValue();
            if (o63.a()) {
                rf.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (bu2Var.f109119e) {
                try {
                    bu2Var.a();
                    bu2Var.b();
                    X509TrustManager x509TrustManager2 = bu2Var.f109118d;
                    if (x509TrustManager2 != null) {
                        if (o63.a()) {
                            rf.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f93236a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f93236a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
