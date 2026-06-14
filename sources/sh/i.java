package sh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import sh.j;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f104718a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f104719b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // sh.j.a
        public k create(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new i();
        }

        @Override // sh.j.a
        public boolean matchesSocket(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return rh.d.f99479e.c() && Conscrypt.isConscrypt(sslSocket);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j.a a() {
            return i.f104719b;
        }

        private b() {
        }
    }

    @Override // sh.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) rh.h.f99497a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // sh.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (matchesSocket(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // sh.k
    public boolean isSupported() {
        return rh.d.f99479e.c();
    }

    @Override // sh.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }
}
