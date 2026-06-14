package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getRevenue", "()Z", "Ljava/net/HttpURLConnection;", "AFAdRevenueData", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "getMediationNetwork", "[B", "Lcom/appsflyer/internal/AFd1gSDK;", "()Lcom/appsflyer/internal/AFd1gSDK;", "Ljava/util/Map;", "getMonetizationNetwork", "Z", "I", "()Ljava/lang/String;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFc1aSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public int AFAdRevenueData;

    @NotNull
    public byte[] getMediationNetwork;
    private final boolean getMonetizationNetwork;

    public AFc1aSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = i10;
        this.getMonetizationNetwork = true;
    }

    private static String AFAdRevenueData(HttpURLConnection p02) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p02.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th2.getMessage();
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = p02.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJoinToString$default = CollectionsKt.joinToString$default(uf.r.g(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strJoinToString$default == null ? "" : strJoinToString$default;
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrencyIso4217Code */
    public abstract AFd1gSDK getGetCurrencyIso4217Code();

    @NotNull
    public abstract String getCurrencyIso4217Code(@NotNull String str);

    @NotNull
    public abstract String getMediationNetwork();

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from getter */
    public boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    @WorkerThread
    public final boolean getRevenue() {
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        try {
            String mediationNetwork = getMediationNetwork();
            Intrinsics.checkNotNullParameter(mediationNetwork, "");
            URLConnection uRLConnectionOpenConnection = new URL(mediationNetwork).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean revenue = getRevenue(httpURLConnection, jCurrentTimeMillis);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return revenue;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + (httpURLConnection2 != null ? httpURLConnection2.hashCode() : 0) + "] " + str);
                if (getGetMonetizationNetwork()) {
                    AFLogger.afRDLog(currencyIso4217Code);
                } else {
                    AFLogger.afVerboseLog(currencyIso4217Code);
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable th4) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th4;
            }
        }
    }

    private final boolean getRevenue(HttpURLConnection httpURLConnection, long j10) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + StringUtils.PROCESS_POSTFIX_DELIMITER + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getMediationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(currencyIso4217Code);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getGetCurrencyIso4217Code().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMediationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMediationNetwork);
        bufferedOutputStream.close();
        String strAFAdRevenueData = AFAdRevenueData(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + strAFAdRevenueData + "\n\ttook " + jCurrentTimeMillis + "ms";
        String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(currencyIso4217Code2);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code2);
        }
        return AFd1tSDK.getMediationNetwork(httpURLConnection);
    }
}
