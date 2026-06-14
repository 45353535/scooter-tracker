package sh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import sh.j;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f104712a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f104713b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // sh.j.a
        public k create(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new g();
        }

        @Override // sh.j.a
        public boolean matchesSocket(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            rh.c.f99476e.b();
            return false;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j.a a() {
            return g.f104713b;
        }

        private b() {
        }
    }

    @Override // sh.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) rh.h.f99497a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // sh.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // sh.k
    public boolean isSupported() {
        return rh.c.f99476e.b();
    }

    @Override // sh.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }
}
