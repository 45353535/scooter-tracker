package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n63 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n63 f113742b = new n63();

    public n63() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            return null;
        }
    }
}
