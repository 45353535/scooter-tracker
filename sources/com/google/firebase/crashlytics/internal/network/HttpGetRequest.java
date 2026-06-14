package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.ironsource.C4240b4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes9.dex */
public class HttpGetRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32652c = new HashMap();

    public HttpGetRequest(String str, Map<String, String> map) {
        this.f32650a = str;
        this.f32651b = map;
    }

    private String a(Map map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append(C4240b4.j.f42668b);
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append(C4240b4.j.f42670c);
            sb2.append((String) entry2.getKey());
            sb2.append(C4240b4.j.f42668b);
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        return sb2.toString();
    }

    private String b(String str, Map map) {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith(C4240b4.j.f42670c)) {
            strA = C4240b4.j.f42670c + strA;
        }
        return str + strA;
    }

    private String c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public HttpResponse execute() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.checkBlockingThread();
        InputStream inputStream = null;
        String strC = null;
        inputStream = null;
        try {
            String strB = b(this.f32650a, this.f32651b);
            Logger.getLogger().v("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f32652c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strC = c(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, strC);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest header(String str, String str2) {
        this.f32652c.put(str, str2);
        return this;
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
