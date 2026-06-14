package he;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f73163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CertificateFactory f73164b;

    public b(Context context, CertificateFactory certificateFactory) {
        this.f73163a = context;
        this.f73164b = certificateFactory;
    }

    private final InputStream a(String str) {
        return new ByteArrayInputStream(Base64.decode(str, 2));
    }

    private InputStream b(String str) {
        return a(f(str));
    }

    private final String c(int i10) {
        try {
            InputStream inputStreamOpenRawResource = this.f73163a.getResources().openRawResource(i10);
            StringBuilder sb2 = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        int i11 = bufferedReader.read();
                        if (i11 == -1) {
                            break;
                        }
                        sb2.append((char) i11);
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (IOException e10) {
                Log.e("CertLoader", "", e10);
            }
            return sb2.toString();
        } catch (Resources.NotFoundException e11) {
            Log.e("CertLoader", "resource not found, certResId=" + i10, e11);
            return null;
        }
    }

    private final String f(String str) {
        return str.replace("\\s+", "").replace(IOUtils.LINE_SEPARATOR_UNIX, "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace("-----BEGIN CERTIFICATE-----", "").replace("-----END CERTIFICATE-----", "");
    }

    private final InputStream g(int i10) {
        try {
            String strC = c(i10);
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            return b(strC);
        } catch (Exception e10) {
            Log.e("CertLoader", "unexpected error, certResId=" + i10, e10);
            return null;
        }
    }

    final Certificate d(int i10) {
        try {
            InputStream inputStreamG = g(i10);
            if (inputStreamG != null) {
                return this.f73164b.generateCertificate(inputStreamG);
            }
            return null;
        } catch (CertificateException e10) {
            Log.e("CertLoader", "", e10);
            return null;
        }
    }

    final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            if (keyStore != null) {
                keyStore.load(null, null);
                Enumeration<String> enumerationAliases = keyStore.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    try {
                        X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(enumerationAliases.nextElement());
                        if (x509Certificate != null) {
                            arrayList.add(x509Certificate);
                        }
                    } catch (Throwable th2) {
                        Log.e("CertLoader", "", th2);
                    }
                }
            }
        } catch (Throwable th3) {
            Log.e("CertLoader", "", th3);
        }
        return arrayList;
    }
}
