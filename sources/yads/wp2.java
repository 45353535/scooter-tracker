package yads;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wp2 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        if (!Intrinsics.areEqual(certificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            certificateFactory.getType();
            boolean z10 = lb1.f113032a;
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState != null && (byteArray = bundleSaveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    return (X509Certificate) certificateGenerateCertificate;
                }
                return null;
            } catch (CertificateException unused) {
                boolean z11 = lb1.f113032a;
            }
        }
        return null;
    }
}
