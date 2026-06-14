package com.my.target;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f60019a = new o2();

    public static l2 a() {
        return new l2();
    }

    @Override // com.my.target.n2
    public o2 a(String str, String str2, Map map, Context context) {
        w1 w1VarB = w1.b(context);
        if (w1VarB != null) {
            this.f60019a.f60451d = w1VarB.a(str);
            o2 o2Var = this.f60019a;
            if (o2Var.f60451d != null) {
                o2Var.f60449b = true;
                return o2Var;
            }
        } else {
            gb.a("HttpImageRequest: Unable to open disk cache and get image - " + str);
        }
        a(w1VarB, str);
        return this.f60019a;
    }

    public final void a(w1 w1Var, String str) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            gb.a("HttpImageRequest: Send image request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("connection", "close");
            v1.a(httpURLConnection);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            o2 o2Var = this.f60019a;
            o2Var.f60450c = responseCode;
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (w1Var != null) {
                    a(w1Var, inputStream, str);
                } else {
                    a(inputStream);
                }
            } else {
                o2Var.f60448a = false;
                o2Var.f60452e = "Image request error - response code " + responseCode;
                gb.a("HttpImageRequest: " + this.f60019a.f60452e);
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            o2 o2Var2 = this.f60019a;
            o2Var2.f60448a = false;
            o2Var2.f60452e = th.getMessage();
            gb.a("HttpImageRequest: Image request error - " + this.f60019a.f60452e);
            httpURLConnection = httpURLConnection2;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final void a(w1 w1Var, InputStream inputStream, String str) {
        File fileA = w1Var.a(inputStream, str);
        if (fileA != null) {
            this.f60019a.f60451d = BitmapFactory.decodeFile(fileA.getAbsolutePath());
            return;
        }
        o2 o2Var = this.f60019a;
        o2Var.f60448a = false;
        o2Var.f60452e = "Image request error - can't save image to disk cache";
        gb.a("HttpImageRequest: Load in cache error - " + this.f60019a.f60452e);
    }

    public final void a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        this.f60019a.f60451d = BitmapFactory.decodeStream(bufferedInputStream);
        try {
            bufferedInputStream.close();
        } catch (Throwable th2) {
            gb.a("HttpImageRequest: Load in memory error - " + th2.getMessage());
        }
    }
}
