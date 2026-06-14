package mh;

import hh.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f94919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f94920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94922d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f94919a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f94919a.size();
        for (int i10 = this.f94920b; i10 < size; i10++) {
            if (((l) this.f94919a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f94920b;
        int size = this.f94919a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f94919a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f94920b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f94921c = c(sslSocket);
            lVar.c(sslSocket, this.f94922d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f94922d);
        sb2.append(", modes=");
        sb2.append(this.f94919a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f94922d = true;
        if (!this.f94921c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
