package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nl3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nl3 f113960b = new nl3();

    public nl3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
    }
}
