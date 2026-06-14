package com.applovin.shadow.okhttp3.internal.platform.android;

import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.internal.platform.BouncyCastlePlatform;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import com.taurusx.tax.f.y;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/platform/android/BouncyCastleSocketAdapter;", "Lcom/applovin/shadow/okhttp3/internal/platform/android/SocketAdapter;", "()V", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lcom/applovin/shadow/okhttp3/Protocol;", "getSelectedProtocol", "isSupported", "", "matchesSocket", y.f66058y, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DeferredSocketAdapter.Factory factory = new DeferredSocketAdapter.Factory() { // from class: com.applovin.shadow.okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        @NotNull
        public SocketAdapter create(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }

        @Override // com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public boolean matchesSocket(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            BouncyCastlePlatform.INSTANCE.isSupported();
            return false;
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/platform/android/BouncyCastleSocketAdapter$Companion;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "factory", "Lcom/applovin/shadow/okhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getFactory", "()Lsh/j$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeferredSocketAdapter.Factory getFactory() {
            return BouncyCastleSocketAdapter.factory;
        }

        private Companion() {
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return BouncyCastlePlatform.INSTANCE.isSupported();
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
