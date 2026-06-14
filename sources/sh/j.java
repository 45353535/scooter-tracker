package sh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f104720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f104721b;

    public interface a {
        k create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f104720a = socketAdapterFactory;
    }

    private final synchronized k a(SSLSocket sSLSocket) {
        try {
            if (this.f104721b == null && this.f104720a.matchesSocket(sSLSocket)) {
                this.f104721b = this.f104720a.create(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f104721b;
    }

    @Override // sh.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        k kVarA = a(sslSocket);
        if (kVarA != null) {
            kVarA.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // sh.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        k kVarA = a(sslSocket);
        if (kVarA != null) {
            return kVarA.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // sh.k
    public boolean isSupported() {
        return true;
    }

    @Override // sh.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f104720a.matchesSocket(sslSocket);
    }
}
