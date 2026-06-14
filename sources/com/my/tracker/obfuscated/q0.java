package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.my.tracker.obfuscated.s0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends s0 {
    q0() {
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        s0.b bVarD = s0.b.d();
        BufferedReader bufferedReader = null;
        try {
            x2.a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                x2.a("HttpGetRequest: response received with response code: " + responseCode);
                bVarD.f61818a = responseCode == 200;
                try {
                    x2.a("HttpGetRequest: processing server response");
                    BufferedReader bufferedReader2 = bVarD.f61818a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    }
                    if (sb2.length() > 0) {
                        bVarD.f61819b = sb2.toString();
                    } else {
                        x2.a("HttpGetRequest: response data is empty");
                    }
                    bufferedReader2.close();
                    httpURLConnection.disconnect();
                    return bVarD;
                } catch (Throwable th3) {
                    if (0 != 0) {
                        bufferedReader.close();
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    x2.a("HttpGetRequest: error", th2);
                    bVarD.f61818a = false;
                    bVarD.f61820c = "HttpGetRequest: error while sending data";
                    return bVarD;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnection = null;
        }
    }
}
