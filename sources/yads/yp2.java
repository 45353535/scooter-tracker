package yads;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class yp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt2 f118323a;

    public yp2(vt2 vt2Var) {
        this.f118323a = vt2Var;
    }

    public final SSLSocketFactory a(Context context) {
        hr2 hr2VarA = this.f118323a.a(context);
        gr2 gr2Var = new gr2(context);
        if (hr2VarA != null && hr2VarA.f111763y) {
            zt2 zt2VarA = nd1.a(gr2Var);
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{zt2VarA}, null);
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException e10) {
                throw new IllegalStateException("Failed to initialize SSLContext", e10);
            } catch (NoSuchAlgorithmException e11) {
                throw new IllegalStateException("No system TLS", e11);
            }
        }
        if (!sb.a(21)) {
            return null;
        }
        int i10 = me2.f113450b;
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
            try {
                sSLContext2.init(null, null, null);
            } catch (KeyManagementException unused) {
                boolean z10 = lb1.f113032a;
            }
            return new me2(sSLContext2.getSocketFactory());
        } catch (NoSuchAlgorithmException unused2) {
            boolean z11 = lb1.f113032a;
            return null;
        }
    }
}
