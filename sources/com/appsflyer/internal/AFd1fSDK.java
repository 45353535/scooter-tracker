package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1fSDK {
    private final int AFAdRevenueData;

    public AFd1fSDK(int i10) {
        this.AFAdRevenueData = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getCurrencyIso4217Code(java.net.HttpURLConnection r11) throws java.lang.Throwable {
        /*
            java.lang.String r1 = ""
            r2 = 0
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> Ld
            goto L2b
        L8:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L6a
        Ld:
            r0 = move-exception
            r6 = r0
            java.io.InputStream r11 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L8
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.HTTP_CLIENT     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L23
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            r5 = r0
            goto L24
        L23:
            r5 = r1
        L24:
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            r3.e(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8
        L2b:
            if (r11 != 0) goto L2e
            return r1
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L8
            r1.<init>(r11, r3)     // Catch: java.lang.Throwable -> L8
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 1
        L42:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L5b
            if (r2 != 0) goto L56
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L50
            goto L56
        L50:
            r0 = move-exception
            r2 = r0
            r0 = r11
            r11 = r2
        L54:
            r2 = r1
            goto L6a
        L56:
            r0.append(r3)     // Catch: java.lang.Throwable -> L50
            r2 = 0
            goto L42
        L5b:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L50
            r1.close()
            r11.close()
            return r0
        L66:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L54
        L6a:
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            if (r0 == 0) goto L74
            r0.close()
        L74:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1fSDK.getCurrencyIso4217Code(java.net.HttpURLConnection):java.lang.String");
    }

    public final AFe1xSDK<String> AFAdRevenueData(AFd1dSDK aFd1dSDK) throws IOException {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        byte[] mediationNetwork;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            mediationNetwork = aFd1dSDK.getMediationNetwork();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1dSDK.getMonetizationNetwork);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(aFd1dSDK.getRevenue);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] mediationNetwork2 = aFd1dSDK.getMediationNetwork();
            if (aFd1dSDK.AFAdRevenueData() && mediationNetwork2 != null) {
                try {
                    String str = aFd1dSDK.getRevenue() ? "<encrypted>" : new String(mediationNetwork2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th3) {
                    httpURLConnection = null;
                    th2 = th3;
                    try {
                        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th2);
                        sb4.append("\n took ");
                        sb4.append(aFd1aSDK.getRevenue);
                        sb4.append("ms");
                        String string = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder(C4240b4.j.f42672d);
                        sb5.append(aFd1dSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(string);
                        aFLogger.e(aFg1cSDK, sb5.toString(), th2, false, false, false);
                        throw new HttpException(th2, aFd1aSDK);
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th4;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1dSDK.AFAdRevenueData.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder(C4240b4.j.f42672d);
            sb6.append(aFd1dSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb6.toString());
            httpURLConnection2 = (HttpURLConnection) new URL(aFd1dSDK.getRevenue).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1dSDK.getMonetizationNetwork);
                if (aFd1dSDK.getCurrencyIso4217Code()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1dSDK.component2()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th2 = th6;
            httpURLConnection = null;
        }
        try {
            int i10 = this.AFAdRevenueData;
            int i11 = aFd1dSDK.component3;
            if (i11 != -1) {
                i10 = i11;
            }
            httpURLConnection2.setConnectTimeout(i10);
            httpURLConnection2.setReadTimeout(i10);
            httpURLConnection2.addRequestProperty("Content-Type", aFd1dSDK.getRevenue() ? "application/octet-stream" : D5.L);
            for (Map.Entry<String, String> entry2 : aFd1dSDK.AFAdRevenueData.entrySet()) {
                httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (mediationNetwork != null) {
                httpURLConnection2.setDoOutput(true);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(mediationNetwork.length);
                httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                } catch (Throwable th7) {
                    th = th7;
                    bufferedOutputStream = null;
                }
                try {
                    bufferedOutputStream2.write(mediationNetwork);
                    bufferedOutputStream2.close();
                } catch (Throwable th8) {
                    th = th8;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            }
            boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
            String currencyIso4217Code = aFd1dSDK.getMonetizationNetwork() ? getCurrencyIso4217Code(httpURLConnection2) : "";
            AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
            StringBuilder sb8 = new StringBuilder("response code:");
            sb8.append(httpURLConnection2.getResponseCode());
            sb8.append(" ");
            sb8.append(httpURLConnection2.getResponseMessage());
            sb8.append("\n body:");
            sb8.append(currencyIso4217Code);
            sb8.append("\n took ");
            sb8.append(aFd1aSDK2.getRevenue);
            sb8.append("ms");
            String string2 = sb8.toString();
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
            StringBuilder sb9 = new StringBuilder(C4240b4.j.f42672d);
            sb9.append(aFd1dSDK.hashCode());
            sb9.append("] ");
            sb9.append(string2);
            aFLogger2.d(aFg1cSDK2, sb9.toString());
            HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
            map.remove(null);
            AFe1xSDK<String> aFe1xSDK = new AFe1xSDK<>(currencyIso4217Code, httpURLConnection2.getResponseCode(), z10, map, aFd1aSDK2);
            httpURLConnection2.disconnect();
            return aFe1xSDK;
        } catch (Throwable th9) {
            th = th9;
            th2 = th;
            httpURLConnection = httpURLConnection2;
            AFd1aSDK aFd1aSDK3 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
            StringBuilder sb42 = new StringBuilder("error: ");
            sb42.append(th2);
            sb42.append("\n took ");
            sb42.append(aFd1aSDK3.getRevenue);
            sb42.append("ms");
            String string3 = sb42.toString();
            AFLogger aFLogger3 = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
            StringBuilder sb52 = new StringBuilder(C4240b4.j.f42672d);
            sb52.append(aFd1dSDK.hashCode());
            sb52.append("] ");
            sb52.append(string3);
            aFLogger3.e(aFg1cSDK3, sb52.toString(), th2, false, false, false);
            throw new HttpException(th2, aFd1aSDK3);
        }
    }
}
