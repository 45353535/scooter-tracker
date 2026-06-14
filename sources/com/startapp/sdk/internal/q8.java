package com.startapp.sdk.internal;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;
import com.startapp.sdk.common.SDKException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f65144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3 f65145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f65147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f65148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb f65149f;

    public q8(lb lbVar, u3 u3Var, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5) {
        this.f65144a = lbVar;
        this.f65145b = u3Var;
        this.f65146c = lbVar2;
        this.f65147d = lbVar3;
        this.f65148e = lbVar4;
        this.f65149f = lbVar5;
    }

    public final boolean a(int i10) {
        ComponentInfoEventConfig componentInfoEventConfigB = ((HttpClientConfig) this.f65149f.a()).b();
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i10);
    }

    public final String b(p8 p8Var) throws Throwable {
        HashMap mapA = a();
        try {
            TimeoutConfig timeoutConfigC = p8Var.f65093d;
            if (timeoutConfigC == null && (timeoutConfigC = ((HttpClientConfig) this.f65149f.a()).c()) == null) {
                timeoutConfigC = TimeoutConfig.f64160a;
            }
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64713r);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f65148e.a()).schedule(a(atomicReference), timeoutConfigC.c(), TimeUnit.MILLISECONDS);
            String strA = a(p8Var.f65091b, mapA, p8Var.f65092c, atomicReference, timeoutConfigC);
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64714s);
            ((z6) ((y6) this.f65147d.a())).a(p8Var, r8.a(200, null, (HttpClientConfig) this.f65149f.a()));
            return strA != null ? strA : "";
        } catch (SDKException e10) {
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64715t);
            ((z6) ((y6) this.f65147d.a())).a(p8Var, r8.a(e10.a(), null, (HttpClientConfig) this.f65149f.a()));
            i7 i7Var = p8Var.f65094e;
            if (i7Var != null) {
                try {
                    i7Var.a(e10);
                } catch (Throwable th2) {
                    if (a(32)) {
                        g9.a(th2);
                    }
                }
            }
            return null;
        }
    }

    public final t8 a(p8 p8Var) throws Throwable {
        HashMap mapA = a();
        System.currentTimeMillis();
        vi.b();
        try {
            TimeoutConfig timeoutConfigC = p8Var.f65093d;
            if (timeoutConfigC == null && (timeoutConfigC = ((HttpClientConfig) this.f65149f.a()).c()) == null) {
                timeoutConfigC = TimeoutConfig.f64160a;
            }
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64710o);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f65148e.a()).schedule(a(atomicReference), timeoutConfigC.c(), TimeUnit.MILLISECONDS);
            t8 t8VarA = a(p8Var.f65091b, mapA, atomicReference, timeoutConfigC);
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64711p);
            ((z6) ((y6) this.f65147d.a())).a(p8Var, r8.a(200, t8VarA.f65301d, (HttpClientConfig) this.f65149f.a()));
            vi.b();
            return t8VarA;
        } catch (SDKException e10) {
            ((z6) ((y6) this.f65147d.a())).c(p8Var, ii.f64712q);
            ((z6) ((y6) this.f65147d.a())).a(p8Var, r8.a(e10.a(), null, (HttpClientConfig) this.f65149f.a()));
            i7 i7Var = p8Var.f65094e;
            if (i7Var != null) {
                try {
                    i7Var.a(e10);
                } catch (Throwable th2) {
                    if (a(32)) {
                        g9.a(th2);
                    }
                }
            }
            return null;
        }
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        if (!((HttpClientConfig) this.f65149f.a()).f()) {
            String strEncode = null;
            try {
                strEncode = URLEncoder.encode(((com.startapp.sdk.common.advertisingid.b) this.f65144a.a()).a().f64842a, "UTF-8");
            } catch (Throwable th2) {
                if (a(64)) {
                    g9.a(th2);
                }
            }
            map.put("device-id", strEncode);
        }
        try {
            map.put(HttpHeaders.ACCEPT_LANGUAGE, ((cc) ((dc) this.f65146c.a()).b()).f64367c);
        } catch (Throwable th3) {
            if (a(128)) {
                g9.a(th3);
            }
        }
        try {
            String str = (String) this.f65145b.a();
            if (str != null) {
                map.put("User-Agent", str);
            }
        } catch (Throwable th4) {
            if (a(256)) {
                g9.a(th4);
            }
        }
        return map;
    }

    public static HttpURLConnection a(String str, HashMap map, s8 s8Var, TimeoutConfig timeoutConfig) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        j6.a(httpURLConnection, str);
        httpURLConnection.setReadTimeout((int) timeoutConfig.b());
        httpURLConnection.setConnectTimeout((int) timeoutConfig.a());
        if (s8Var == null) {
            httpURLConnection.setRequestMethod("GET");
        } else {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(s8Var.f65248a.length);
            httpURLConnection.setRequestProperty("Content-Type", s8Var.f65249b);
            String str2 = s8Var.f65250c;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", str2);
            }
        }
        httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null && str4 != null) {
                httpURLConnection.setRequestProperty(str3, str4);
            }
        }
        return httpURLConnection;
    }

    public static t8 a(String str, HashMap map, AtomicReference atomicReference, TimeoutConfig timeoutConfig) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnectionA;
        IOException iOException;
        int i10;
        try {
            httpURLConnectionA = a(str, map, (s8) null, timeoutConfig);
        } catch (IOException e10) {
            iOException = e10;
        } catch (Throwable th3) {
            th2 = th3;
            httpURLConnectionA = null;
        }
        try {
            try {
                atomicReference.set(new xm(httpURLConnectionA));
                int responseCode = httpURLConnectionA.getResponseCode();
                try {
                    if (responseCode == 200) {
                        CookieManager cookieManager = j6.f64749a;
                        if (cookieManager != null) {
                            cookieManager.put(URI.create(str), httpURLConnectionA.getHeaderFields());
                        }
                        t8 t8Var = new t8();
                        t8Var.f65298a = str;
                        t8Var.f65300c = httpURLConnectionA.getContentType();
                        t8Var.f65301d = httpURLConnectionA.getHeaderFields();
                        t8Var.f65299b = a(httpURLConnectionA);
                        httpURLConnectionA.disconnect();
                        atomicReference.set(null);
                        return t8Var;
                    }
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), responseCode, true, null);
                } catch (IOException e11) {
                    iOException = e11;
                    i10 = responseCode;
                    throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i10, false, iOException);
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                    atomicReference.set(null);
                    throw th2;
                }
                throw th2;
            }
        } catch (IOException e12) {
            iOException = e12;
            i10 = 0;
            throw new SDKException("GET", Uri.parse(str).buildUpon().query(null).build(), i10, false, iOException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r9, java.util.HashMap r10, com.startapp.sdk.internal.s8 r11, java.util.concurrent.atomic.AtomicReference r12, com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig r13) throws java.lang.Throwable {
        /*
            r1 = 0
            r2 = 0
            java.net.HttpURLConnection r10 = a(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L72
            com.startapp.sdk.internal.xm r13 = new com.startapp.sdk.internal.xm     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            r13.<init>(r10)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            r12.set(r13)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            byte[] r13 = r11.f65248a     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            int r13 = r13.length     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            if (r13 <= 0) goto L3c
            java.io.OutputStream r13 = r10.getOutputStream()     // Catch: java.lang.Throwable -> L31
            byte[] r11 = r11.f65248a     // Catch: java.lang.Throwable -> L2e
            r13.write(r11)     // Catch: java.lang.Throwable -> L2e
            r13.flush()     // Catch: java.lang.Throwable -> L2e
            int r11 = com.startapp.sdk.internal.q0.f65128a     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            r13.close()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L3c
            goto L3c
        L25:
            r0 = move-exception
            r9 = r0
            goto L90
        L29:
            r0 = move-exception
            r11 = r0
            r7 = r11
        L2c:
            r5 = r2
            goto L77
        L2e:
            r0 = move-exception
            r11 = r0
            goto L34
        L31:
            r0 = move-exception
            r11 = r0
            r13 = r1
        L34:
            int r0 = com.startapp.sdk.internal.q0.f65128a     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            if (r13 == 0) goto L3b
            r13.close()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L3b
        L3b:
            throw r11     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
        L3c:
            int r6 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            r11 = 200(0xc8, float:2.8E-43)
            if (r6 != r11) goto L54
            java.lang.String r9 = a(r10)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            r10.disconnect()
            r12.set(r1)
            return r9
        L4f:
            r0 = move-exception
            r11 = r0
            r7 = r11
            r5 = r6
            goto L77
        L54:
            android.net.Uri r11 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            android.net.Uri$Builder r11 = r11.query(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            android.net.Uri r5 = r11.build()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            com.startapp.sdk.common.SDKException r3 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            java.lang.String r4 = "POST"
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
            throw r3     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4f
        L6e:
            r0 = move-exception
            r9 = r0
            r10 = r1
            goto L90
        L72:
            r0 = move-exception
            r11 = r0
            r7 = r11
            r10 = r1
            goto L2c
        L77:
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L25
            android.net.Uri$Builder r9 = r9.buildUpon()     // Catch: java.lang.Throwable -> L25
            android.net.Uri$Builder r9 = r9.query(r1)     // Catch: java.lang.Throwable -> L25
            android.net.Uri r4 = r9.build()     // Catch: java.lang.Throwable -> L25
            com.startapp.sdk.common.SDKException r2 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "POST"
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
            throw r2     // Catch: java.lang.Throwable -> L25
        L90:
            if (r10 == 0) goto L98
            r10.disconnect()
            r12.set(r1)
        L98:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.q8.a(java.lang.String, java.util.HashMap, com.startapp.sdk.internal.s8, java.util.concurrent.atomic.AtomicReference, com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig):java.lang.String");
    }

    public static String a(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = httpURLConnection.getInputStream();
            if (inputStream2 != null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[1024];
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream2) : inputStream2, "UTF-8"));
                    while (true) {
                        int i10 = bufferedReader.read(cArr);
                        if (i10 == -1) {
                            break;
                        }
                        stringWriter.write(cArr, 0, i10);
                    }
                    String string = stringWriter.toString();
                    int i11 = q0.f65128a;
                    try {
                        inputStream2.close();
                    } catch (Exception unused) {
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    int i12 = q0.f65128a;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            int i13 = q0.f65128a;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused3) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Runnable a(final AtomicReference atomicReference) {
        final String str = null;
        return new Runnable() { // from class: com.startapp.sdk.internal.ym
            @Override // java.lang.Runnable
            public final void run() {
                q8.a(atomicReference, str);
            }
        };
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, String str) {
        try {
            Runnable runnable = (Runnable) atomicReference.get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable unused) {
        }
    }
}
