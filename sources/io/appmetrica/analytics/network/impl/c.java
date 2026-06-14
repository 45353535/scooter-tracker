package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClient f78803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f78804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f78805c;

    @VisibleForTesting
    public c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull d dVar) {
        this.f78803a = networkClient;
        this.f78804b = request;
        this.f78805c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f78804b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f78803a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f78803a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f78803a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f78803a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f78804b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f78803a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    @NotNull
    public final Response execute() {
        Map<String, List<String>> headerFields;
        int responseCode;
        Throwable th2;
        String string;
        boolean z10;
        try {
            d dVar = this.f78805c;
            String url = this.f78804b.getUrl();
            dVar.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f78804b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrA = new byte[0];
            byte[] bArrA2 = new byte[0];
            try {
                a(httpsURLConnection);
                if (Intrinsics.areEqual(this.f78804b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f78804b.getBody());
                            outputStream.flush();
                            Unit unit = Unit.f93236a;
                            uf.c.a(outputStream, null);
                        } finally {
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
                try {
                    headerFields = httpsURLConnection.getHeaderFields();
                } catch (Throwable th3) {
                    th = th3;
                    headerFields = null;
                }
                try {
                    bArrA = e.a(this.f78803a.getMaxResponseSize(), new a(httpsURLConnection));
                    bArrA2 = e.a(this.f78803a.getMaxResponseSize(), new b(httpsURLConnection));
                    string = httpsURLConnection.getURL().toString();
                    th2 = null;
                    z10 = true;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    string = null;
                    z10 = false;
                }
            } catch (Throwable th5) {
                th = th5;
                headerFields = null;
                responseCode = 0;
            }
            byte[] bArr = bArrA;
            byte[] bArr2 = bArrA2;
            int i10 = responseCode;
            Map<String, List<String>> map = headerFields;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z10, i10, bArr, bArr2, map, th2, string);
        } catch (Throwable th6) {
            return new Response(th6);
        }
    }

    public c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new d());
    }
}
