package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class ds2 extends ed0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SSLSocketFactory f110048s;

    public ds2(String str, int i10, int i11, boolean z10, e01 e01Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i10, i11, z10, e01Var);
        this.f110048s = sSLSocketFactory;
    }

    @Override // yads.ed0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f110048s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
