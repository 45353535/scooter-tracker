package f1;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class hd {
    public HttpsURLConnection a(bd request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        URLConnection uRLConnectionOpenConnection = new URL(request.j()).openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}
