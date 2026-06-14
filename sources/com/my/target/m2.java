package com.my.target;

import android.content.Context;
import android.net.TrafficStats;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class m2 extends n2 {
    public static m2 a() {
        return new m2();
    }

    @Override // com.my.target.n2
    public o2 a(String str, String str2, Map map, Context context) {
        HttpURLConnection httpURLConnection;
        o2 o2Var = new o2();
        if (str2 == null) {
            gb.a("HttpLogRequest: Can't send log request - body is null");
            o2Var.f60448a = false;
            return o2Var;
        }
        gb.a("HttpLogRequest: Send log request");
        HttpURLConnection httpURLConnection2 = null;
        try {
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
            httpURLConnection.setRequestProperty("connection", "close");
            v1.a(httpURLConnection);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
            return o2Var;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                o2Var.f60448a = false;
                o2Var.f60452e = th.getMessage();
                gb.a("HttpLogRequest: Log request error - " + o2Var.f60452e);
                return o2Var;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }
}
