package yads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f114209a = lf.i.a(n63.f113742b);

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull((List) arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
