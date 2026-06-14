package yads;

import android.util.Log;
import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g20 f109115a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f109117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X509TrustManager f109118d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f109116b = lf.i.a(au2.f108828b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f109119e = new Object();

    public bu2(g20 g20Var) {
        this.f109115a = g20Var;
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        Unit unit;
        try {
            ((X509TrustManager) this.f109116b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            synchronized (this.f109119e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f109118d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
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

    public final void b() {
        if (!Thread.holdsLock(this.f109119e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.f109117c == null) {
            Lazy lazy = o63.f114209a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                gr2 gr2Var = (gr2) this.f109115a;
                gr2Var.getClass();
                try {
                    InputStream inputStreamOpenRawResource = gr2Var.f111316b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] bArrC = uf.b.c(inputStreamOpenRawResource);
                        uf.c.a(inputStreamOpenRawResource, null);
                        try {
                            inputStreamOpenRawResource = gr2Var.f115895a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] bArrC2 = uf.b.c(inputStreamOpenRawResource);
                                uf.c.a(inputStreamOpenRawResource, null);
                                byte[][] bArr = (byte[][]) ArraysKt.plus((Object[]) new byte[][]{bArrC2}, (Object[]) new byte[][]{bArrC});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    Lazy lazy2 = o63.f114209a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) o63.f114209a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } finally {
                            }
                        } catch (IOException e10) {
                            throw new IllegalStateException("Failed to create cert", e10);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException("Failed to create cert", e11);
                }
            }
            this.f109117c = keyStore2;
        }
        b();
        if (this.f109118d == null) {
            b();
            if (this.f109117c != null) {
                b();
                this.f109118d = o63.a(this.f109117c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e10) {
            Log.w("SdkTrustManager", "Failed to store certificate", e10);
        }
    }
}
