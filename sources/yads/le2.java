package yads;

import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class le2 {
    public static final String[] a(SSLSocketFactory sSLSocketFactory) {
        int i10 = me2.f113450b;
        String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final String[] b(SSLSocketFactory sSLSocketFactory) {
        int i10 = me2.f113450b;
        String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
