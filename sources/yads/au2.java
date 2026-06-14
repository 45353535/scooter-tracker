package yads;

import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class au2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final au2 f108828b = new au2();

    public au2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X509TrustManager x509TrustManagerA = o63.a(null);
        if (x509TrustManagerA != null) {
            return x509TrustManagerA;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
