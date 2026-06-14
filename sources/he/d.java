package he;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.lang.reflect.Field;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static boolean a(SslError sslError, TrustManagerFactory trustManagerFactory) {
        if (sslError.getPrimaryError() == 3) {
            SslCertificate certificate = sslError.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                declaredField.setAccessible(true);
                X509Certificate[] x509CertificateArr = {(X509Certificate) declaredField.get(certificate)};
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        try {
                            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "generic");
                            return true;
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }
}
