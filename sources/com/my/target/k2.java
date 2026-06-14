package com.my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TrafficStats;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f59981b = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f59982a;

    public k2(o oVar) {
        this.f59982a = oVar;
    }

    public static k2 a() {
        return new k2(o.f60433i);
    }

    public static k2 a(o oVar) {
        return new k2(oVar);
    }

    public static boolean a(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                    if (networkCapabilities.hasTransport(3)) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            gb.a("HttpAdRequest: can't check network state " + th2.getMessage());
            return false;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.my.target.n2
    public o2 a(String str, String str2, Map map, Context context) {
        HttpURLConnection httpURLConnection;
        String str3;
        int responseCode;
        o2 o2Var = new o2();
        HttpURLConnection httpURLConnection2 = null;
        try {
            gb.a("HttpAdRequest: Send ad request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("connection", "close");
                v1.a(httpURLConnection);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (str2 != null) {
                    str3 = "body - " + str2;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-mtrgdata-v1");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(str2.getBytes());
                        outputStream.close();
                    } finally {
                    }
                } else {
                    str3 = "url - " + str;
                    httpURLConnection.connect();
                }
                gb.a("HttpAdRequest: Send ad request, " + str3);
                responseCode = httpURLConnection.getResponseCode();
                o2Var.f60450c = responseCode;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), f59981b));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    this.f59982a.b(0, 2001, eb.a(th));
                    if (th instanceof SocketTimeoutException) {
                        o2Var.f60450c = 408;
                    }
                    o2Var.f60448a = false;
                    o2Var.f60452e = th.getMessage();
                    gb.a("HttpAdRequest: Ad request error - " + o2Var.f60452e);
                    httpURLConnection = httpURLConnection2;
                }
                o2Var.f60451d = sb2.toString();
                bufferedReader.close();
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } else if (responseCode != 204) {
            this.f59982a.c(0, 2001, "code=" + httpURLConnection.getResponseCode());
            o2Var.f60448a = false;
            o2Var.f60452e = "Ad request error - response code " + responseCode;
            gb.a("HttpAdRequest: " + o2Var.f60452e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return o2Var;
    }
}
