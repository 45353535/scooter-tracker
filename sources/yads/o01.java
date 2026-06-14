package yads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class o01 extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f114144a;

    public o01(SSLSocketFactory sSLSocketFactory) {
        this.f114144a = sSLSocketFactory;
    }

    public static void a(HttpURLConnection httpURLConnection, km2 km2Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            km2Var.getClass();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new bz0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // yads.zn
    public final j01 a(km2 km2Var, Map map) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        String strG = km2Var.g();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(km2Var.d());
        URL url = new URL(strG);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i10 = km2Var.f112775o.f118624a;
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i10);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f114144a) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            a(km2Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (km2Var.f112763c != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new j01(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new n01(httpURLConnection));
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        if (!z10) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                j01 j01Var = new j01(responseCode, a(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return j01Var;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public static void a(km2 km2Var, HttpURLConnection httpURLConnection) throws IOException {
        switch (km2Var.f112763c) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrB = km2Var.b();
                if (bArrB != null) {
                    a(httpURLConnection, km2Var, bArrB);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] bArrB2 = km2Var.b();
                if (bArrB2 != null) {
                    a(httpURLConnection, km2Var, bArrB2);
                    return;
                }
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
                byte[] bArrB3 = km2Var.b();
                if (bArrB3 != null) {
                    a(httpURLConnection, km2Var, bArrB3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
