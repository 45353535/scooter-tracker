package he;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.github.mytargetsdk.R$raw;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f73165a;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f73165a = arrayList;
        arrayList.add(Integer.valueOf(R$raw.f82036a));
        arrayList.add(Integer.valueOf(R$raw.f82037b));
    }

    private final CertificateFactory b() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException e10) {
            Log.e("CertManager", "", e10);
            return null;
        }
    }

    private final KeyStore c() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            return keyStore;
        } catch (Throwable th2) {
            Log.e("CertManager", "", th2);
            return null;
        }
    }

    private final SSLContext d(TrustManagerFactory trustManagerFactory) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            return sSLContext;
        } catch (Throwable th2) {
            Log.e("CertManager", "", th2);
            return null;
        }
    }

    private final TrustManagerFactory e(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory;
        } catch (Throwable th2) {
            Log.e("CertManager", "", th2);
            return null;
        }
    }

    private final X509TrustManager f(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public final a a(Context context) {
        String str;
        if (context == null) {
            Log.e("CertManager", "Error make certData – context is null");
            return null;
        }
        CertificateFactory certificateFactoryB = b();
        if (certificateFactoryB == null) {
            Log.e("CertManager", "Error make certData – certificateFactory is null");
            return null;
        }
        KeyStore keyStoreC = c();
        if (keyStoreC == null) {
            Log.e("CertManager", "Error make certData – keyStore is null");
            return null;
        }
        b bVar = new b(context, certificateFactoryB);
        Iterator it = this.f73165a.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            Certificate certificateD = bVar.d(iIntValue);
            if (certificateD != null) {
                try {
                    if (iIntValue == R$raw.f82036a) {
                        str = "root_ca";
                    } else if (iIntValue == R$raw.f82037b) {
                        str = "sub_ca";
                    } else {
                        str = "resid_" + iIntValue;
                    }
                    keyStoreC.setCertificateEntry("russian_trusted_" + str, certificateD);
                } catch (KeyStoreException e10) {
                    Log.e("CertManager", "", e10);
                }
            }
        }
        for (X509Certificate x509Certificate : bVar.e()) {
            try {
                keyStoreC.setCertificateEntry(x509Certificate.getIssuerDN().getName(), x509Certificate);
            } catch (KeyStoreException e11) {
                Log.e("CertManager", "", e11);
            }
        }
        TrustManagerFactory trustManagerFactoryE = e(keyStoreC);
        if (trustManagerFactoryE == null) {
            Log.e("CertManager", "Error make certData – trustManagerFactory is null");
            return null;
        }
        X509TrustManager x509TrustManagerF = f(trustManagerFactoryE);
        if (x509TrustManagerF == null) {
            Log.e("CertManager", "Error make certData – x509TrustManager is null");
            return null;
        }
        SSLContext sSLContextD = d(trustManagerFactoryE);
        if (sSLContextD != null) {
            return new a(x509TrustManagerF, sSLContextD, trustManagerFactoryE);
        }
        Log.e("CertManager", "Error make certData – sslContext is null");
        return null;
    }
}
