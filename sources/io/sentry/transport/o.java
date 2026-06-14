package io.sentry.transport;

import com.ironsource.D5;
import io.sentry.ILogger;
import io.sentry.e4;
import io.sentry.g7;
import io.sentry.u5;
import io.sentry.v7;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f84240e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f84241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4 f84242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f84243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f84244d;

    public o(v7 v7Var, e4 e4Var, b0 b0Var) {
        this(v7Var, e4Var, m.a(), b0Var);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry entry : this.f84242b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", D5.L);
        httpURLConnectionE.setRequestProperty("Connection", "close");
        httpURLConnectionE.setConnectTimeout(this.f84243c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.f84243c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f84243c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(java.net.HttpURLConnection r5) {
        /*
            r4 = this;
            java.io.InputStream r5 = r5.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r2 = io.sentry.transport.o.f84240e     // Catch: java.lang.Throwable -> L38
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r2 = 1
        L16:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L26
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3a
        L26:
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            goto L16
        L2b:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L37
            r5.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r1     // Catch: java.lang.Throwable -> L38
        L43:
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r5 = move-exception
            r0.addSuppressed(r5)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r0     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r5 = "Failed to obtain error message while analyzing send failure."
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.o.c(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean d(int i10) {
        return i10 == 200;
    }

    private d0 f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                i(httpURLConnection, responseCode);
                if (d(responseCode)) {
                    this.f84243c.getLogger().c(g7.DEBUG, "Envelope sent successfully.", new Object[0]);
                    d0 d0VarE = d0.e();
                    a(httpURLConnection);
                    return d0VarE;
                }
                ILogger logger = this.f84243c.getLogger();
                g7 g7Var = g7.ERROR;
                logger.c(g7Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.f84243c.isDebug()) {
                    this.f84243c.getLogger().c(g7Var, "%s", c(httpURLConnection));
                }
                d0 d0VarB = d0.b(responseCode);
                a(httpURLConnection);
                return d0VarB;
            } catch (IOException e10) {
                this.f84243c.getLogger().b(g7.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return d0.a();
            }
        } catch (Throwable th2) {
            a(httpURLConnection);
            throw th2;
        }
    }

    private Proxy g(v7.k kVar) {
        if (kVar == null) {
            return null;
        }
        String strC = kVar.c();
        String strA = kVar.a();
        if (strC == null || strA == null) {
            return null;
        }
        try {
            return new Proxy(kVar.d() != null ? kVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
        } catch (NumberFormatException e10) {
            this.f84243c.getLogger().b(g7.ERROR, e10, "Failed to parse Sentry Proxy port: " + kVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    HttpURLConnection e() {
        return (HttpURLConnection) (this.f84241a == null ? this.f84242b.b().openConnection() : this.f84242b.b().openConnection(this.f84241a));
    }

    public d0 h(u5 u5Var) throws IOException {
        d0 d0VarF;
        d0 d0VarF2;
        this.f84243c.getSocketTagger().b();
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f84243c.getSerializer().b(u5Var, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    return d0VarF2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f84243c.getLogger().b(g7.ERROR, th2, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                return d0VarF;
            } finally {
                f(httpURLConnectionB);
                this.f84243c.getSocketTagger().a();
            }
        }
    }

    public void i(HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f84244d.R(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    o(v7 v7Var, e4 e4Var, m mVar, b0 b0Var) {
        this.f84242b = e4Var;
        this.f84243c = v7Var;
        this.f84244d = b0Var;
        Proxy proxyG = g(v7Var.getProxy());
        this.f84241a = proxyG;
        if (proxyG == null || v7Var.getProxy() == null) {
            return;
        }
        String strE = v7Var.getProxy().e();
        String strB = v7Var.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        mVar.b(new w(strE, strB));
    }
}
