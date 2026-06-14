package yads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ed0 extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f110331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f110332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f110333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e01 f110335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01 f110336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f110337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final je2 f110338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f110339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f110340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f110341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f110342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f110343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f110344r;

    public ed0(String str, int i10, int i11, boolean z10, e01 e01Var) {
        super(true);
        this.f110334h = str;
        this.f110332f = i10;
        this.f110333g = i11;
        this.f110331e = z10;
        this.f110335i = e01Var;
        this.f110338l = null;
        this.f110336j = new e01();
        this.f110337k = false;
    }

    public final URL a(URL url, String str) throws b01 {
        if (str == null) {
            throw new b01("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new b01("Unsupported protocol redirect: " + protocol, 2001);
            }
            if (this.f110331e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new b01("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new b01(e10, 2001, 1);
        }
    }

    @Override // yads.wn, yads.c30
    public final Map c() {
        HttpURLConnection httpURLConnection = this.f110339m;
        return httpURLConnection == null ? sk2.f115840h : new dd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.c30
    public final void close() {
        try {
            InputStream inputStream = this.f110340n;
            if (inputStream != null) {
                long j10 = this.f110343q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f110344r;
                }
                a(this.f110339m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = w83.f117341a;
                    throw new b01(e10, 2000, 3);
                }
            }
        } finally {
            this.f110340n = null;
            i();
            if (this.f110341o) {
                this.f110341o = false;
                g();
            }
        }
    }

    @Override // yads.c30
    public final Uri e() {
        HttpURLConnection httpURLConnection = this.f110339m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f110339m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                uf1.b("DefaultHttpDataSource", uf1.a("Unexpected error while disconnecting", e10));
            }
            this.f110339m = null;
        }
    }

    public final HttpURLConnection c(h30 h30Var) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(h30Var.f111452a.toString());
        int i10 = h30Var.f111454c;
        byte[] bArr = h30Var.f111455d;
        long j10 = h30Var.f111457f;
        long j11 = h30Var.f111458g;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (h30Var.f111460i & 1) == 1;
        if (!this.f110331e && !this.f110337k) {
            return a(url, i10, bArr, j10, j11, z10, true, h30Var.f111456e);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                httpURLConnectionA = a(url, i10, bArr, j10, j11, z10, false, h30Var.f111456e);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Location");
                if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    url = a(url, headerField);
                } else {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionA.disconnect();
                    if (!this.f110337k || responseCode != 302) {
                        bArr = null;
                        i10 = 1;
                    }
                    url = a(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new b01(new NoRouteToHostException(he2.a("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return httpURLConnectionA;
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        Map map2;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f110332f);
        httpURLConnectionA.setReadTimeout(this.f110333g);
        HashMap map3 = new HashMap();
        e01 e01Var = this.f110335i;
        if (e01Var != null) {
            synchronized (e01Var) {
                try {
                    if (e01Var.f110130b == null) {
                        e01Var.f110130b = DesugarCollections.unmodifiableMap(new HashMap(e01Var.f110129a));
                    }
                    map2 = e01Var.f110130b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map3.putAll(map2);
        }
        map3.putAll(this.f110336j.a());
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = m01.f113285a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j10);
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str2 = this.f110334h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i11 = h30.f111451k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else if (i10 == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionA;
        }
        httpURLConnectionA.connect();
        return httpURLConnectionA;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // yads.y20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(byte[] r7, int r8, int r9) throws yads.b01 {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f110343q     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f110344r     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L35
        L20:
            java.io.InputStream r0 = r6.f110340n     // Catch: java.io.IOException -> L1e
            int r1 = yads.w83.f117341a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f110344r     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f110344r = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            int r8 = yads.w83.f117341a
            r8 = 2
            yads.b01 r7 = yads.b01.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ed0.c(byte[], int, int):int");
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = w83.f117341a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    @Override // yads.c30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.h30 r27) throws yads.b01 {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ed0.a(yads.h30):long");
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f110340n;
            int i10 = w83.f117341a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new b01(new InterruptedIOException(), 2000, 1);
            }
            if (i11 != -1) {
                j10 -= (long) i11;
                c(i11);
            } else {
                throw new b01();
            }
        }
    }
}
