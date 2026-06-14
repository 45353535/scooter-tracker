package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/ConnectionSpecSelector;", "", "connectionSpecs", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "(Ljava/util/List;)V", "isFallback", "", "isFallbackPossible", "nextModeIndex", "", "configureSecureSocket", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionFailed", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/io/IOException;", "socket", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionSpecSelector {

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    private final boolean isFallbackPossible(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i10 = this.nextModeIndex; i10 < size; i10++) {
            if (this.connectionSpecs.get(i10).isCompatible(socket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sslSocket) throws IOException {
        ConnectionSpec connectionSpec;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i10);
            if (connectionSpec.isCompatible(sslSocket)) {
                this.nextModeIndex = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sslSocket);
            connectionSpec.apply$okhttp(sslSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isFallback);
        sb2.append(", modes=");
        sb2.append(this.connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean connectionFailed(@NotNull IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.isFallback = true;
        if (!this.isFallbackPossible || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
