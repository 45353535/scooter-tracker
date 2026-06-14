package com.my.target;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class p2 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f60504a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60505b;

    public static p2 a() {
        return new p2();
    }

    @Override // com.my.target.n2
    public o2 a(String str, String str2, Map map, Context context) {
        this.f60505b = 0;
        a(str, context);
        return this.f60504a;
    }

    public final void a(String str, Context context) {
        HttpURLConnection httpURLConnection;
        this.f60504a.f60451d = str;
        gb.a("HttpStatRequest: Send stat request - " + str);
        u6 u6VarA = u6.a(context);
        String strA = null;
        try {
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("connection", "close");
                v1.a(httpURLConnection);
                u6VarA.b(httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                this.f60504a.f60450c = responseCode;
                InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (responseCode == 200 || responseCode == 204 || responseCode == 404 || responseCode == 403) {
                    u6VarA.a(httpURLConnection);
                } else if (responseCode == 302 || responseCode == 301 || responseCode == 303) {
                    this.f60505b++;
                    strA = a(httpURLConnection);
                }
            } catch (Throwable th2) {
                th = th2;
                o2 o2Var = this.f60504a;
                o2Var.f60448a = false;
                o2Var.f60452e = th.getMessage();
                gb.a("HttpStatRequest: Stat request error - " + this.f60504a.f60452e);
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (strA != null) {
            gb.a("HttpStatRequest: Redirected to - " + strA);
            a(strA, context);
        }
    }

    public final String a(HttpURLConnection httpURLConnection) {
        if (this.f60505b <= 10) {
            try {
                String string = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField("Location"))).toString();
                boolean z10 = Build.VERSION.SDK_INT < 28 || lb.c(string);
                if (!lb.d(string) && z10) {
                    return string;
                }
                this.f60504a.f60451d = string;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
