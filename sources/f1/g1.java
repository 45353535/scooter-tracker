package f1;

import android.os.Build;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69890a = new a(null);

    public static final class a {
        public a() {
        }

        public final SSLSocketFactory a() throws KeyManagementException {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (h1.b.c()) {
                sSLContext.init(null, new X509TrustManager[]{h8.e()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final SSLSocketFactory a() {
        return f69890a.a();
    }
}
