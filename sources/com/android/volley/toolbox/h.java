package com.android.volley.toolbox;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public class h extends com.android.volley.toolbox.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f7574a;

    static class a extends FilterInputStream implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HttpURLConnection f7575b;

        a(HttpURLConnection httpURLConnection) {
            super(h.j(httpURLConnection));
            this.f7575b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f7575b.disconnect();
        }
    }

    public interface b {
    }

    public h() {
        this(null);
    }

    private void c(HttpURLConnection httpURLConnection, com.android.volley.n nVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(h(nVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void d(HttpURLConnection httpURLConnection, com.android.volley.n nVar) throws com.android.volley.a, IOException {
        byte[] body = nVar.getBody();
        if (body != null) {
            c(httpURLConnection, nVar, body);
        }
    }

    static List e(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.g((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    private static boolean i(int i10, int i11) {
        if (i10 != 4) {
            return ((100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection k(URL url, com.android.volley.n nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionF = f(url);
        int timeoutMs = nVar.getTimeoutMs();
        httpURLConnectionF.setConnectTimeout(timeoutMs);
        httpURLConnectionF.setReadTimeout(timeoutMs);
        httpURLConnectionF.setUseCaches(false);
        httpURLConnectionF.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f7574a) != null) {
            ((HttpsURLConnection) httpURLConnectionF).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionF;
    }

    @Override // com.android.volley.toolbox.a
    public f a(com.android.volley.n nVar, Map map) {
        String url = nVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(nVar.getHeaders());
        HttpURLConnection httpURLConnectionK = k(new URL(url), nVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionK.setRequestProperty(str, (String) map2.get(str));
            }
            l(httpURLConnectionK, nVar);
            int responseCode = httpURLConnectionK.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (i(nVar.getMethod(), responseCode)) {
                return new f(responseCode, e(httpURLConnectionK.getHeaderFields()), httpURLConnectionK.getContentLength(), g(nVar, httpURLConnectionK));
            }
            f fVar = new f(responseCode, e(httpURLConnectionK.getHeaderFields()));
            httpURLConnectionK.disconnect();
            return fVar;
        } catch (Throwable th2) {
            if (0 == 0) {
                httpURLConnectionK.disconnect();
            }
            throw th2;
        }
    }

    protected HttpURLConnection f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream g(com.android.volley.n nVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream h(com.android.volley.n nVar, HttpURLConnection httpURLConnection, int i10) {
        return httpURLConnection.getOutputStream();
    }

    void l(HttpURLConnection httpURLConnection, com.android.volley.n nVar) throws com.android.volley.a, IOException {
        switch (nVar.getMethod()) {
            case -1:
                byte[] postBody = nVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    c(httpURLConnection, nVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                d(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                d(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                d(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f7574a = sSLSocketFactory;
    }
}
