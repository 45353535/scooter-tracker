package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class ol3 implements ml3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f114373a = lf.i.a(nl3.f113960b);

    public final boolean a(Context context, SslError sslError) {
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && hr2VarA.f111763y) {
            X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : wp2.a(sslError.getCertificate(), (CertificateFactory) this.f114373a.getValue());
            if (x509Certificate == null) {
                return false;
            }
            try {
                nd1.a(new gr2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
                return true;
            } catch (Exception unused) {
                boolean z10 = lb1.f113032a;
            }
        }
        return false;
    }
}
