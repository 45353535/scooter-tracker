package com.applovin.shadow.okhttp3.internal.tls;

import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.taurusx.tax.f.y;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "", "()V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", y.f66058y, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CertificateChainCleaner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "get", "(Ljavax/net/ssl/X509TrustManager;)Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "", "Ljava/security/cert/X509Certificate;", "caCerts", "([Ljava/security/cert/X509Certificate;)Luh/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CertificateChainCleaner get(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return Platform.INSTANCE.get().buildCertificateChainCleaner(trustManager);
        }

        private Companion() {
        }

        @NotNull
        public final CertificateChainCleaner get(@NotNull X509Certificate... caCerts) {
            Intrinsics.checkNotNullParameter(caCerts, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }
    }

    @NotNull
    public abstract List<Certificate> clean(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException;
}
