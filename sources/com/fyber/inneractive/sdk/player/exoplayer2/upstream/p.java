package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f23061o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReference f23062p = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f23067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f23068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f23069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f23070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f23071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f23073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23076n;

    public p(String str, m mVar, int i10, int i11, boolean z10, w wVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f23066d = str;
        this.f23069g = mVar;
        this.f23068f = new w();
        this.f23064b = i10;
        this.f23065c = i11;
        this.f23063a = z10;
        this.f23067e = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f23070h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f23036a.toString());
        long j10 = kVar.f23038c;
        long j11 = kVar.f23039d;
        int i10 = 0;
        boolean z10 = (kVar.f23041f & 1) == 1;
        if (!this.f23063a) {
            return a(url, null, j10, j11, z10, true);
        }
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i11));
            }
            boolean z11 = z10;
            long j12 = j11;
            long j13 = j10;
            HttpURLConnection httpURLConnectionA = a(url, null, j13, j12, z11, false);
            j10 = j13;
            j11 = j12;
            z10 = z11;
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            httpURLConnectionA.disconnect();
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i10 = i11;
            url = url2;
        }
    }

    public final void c() throws IOException {
        if (this.f23075m == this.f23073k) {
            return;
        }
        byte[] bArr = (byte[]) f23062p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j10 = this.f23075m;
            long j11 = this.f23073k;
            if (j10 == j11) {
                f23062p.set(bArr);
                return;
            }
            int i10 = this.f23071i.read(bArr, 0, (int) Math.min(j11 - j10, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            long j12 = i10;
            this.f23075m += j12;
            m mVar = this.f23069g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f23050d += j12;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f23071i != null) {
                HttpURLConnection httpURLConnection = this.f23070h;
                long j10 = this.f23074l;
                if (j10 != -1) {
                    j10 -= this.f23076n;
                }
                a(httpURLConnection, j10);
                try {
                    this.f23071i.close();
                } catch (IOException e10) {
                    throw new u(e10);
                }
            }
        } finally {
            this.f23071i = null;
            b();
            if (this.f23072j) {
                this.f23072j = false;
                m mVar = this.f23069g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws u {
        try {
            c();
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw new u(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r15) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.u {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.p.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f23070h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f23070h = null;
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f23064b);
        httpURLConnection.setReadTimeout(this.f23065c);
        w wVar = this.f23067e;
        if (wVar != null) {
            synchronized (wVar) {
                try {
                    if (wVar.f23090b == null) {
                        wVar.f23090b = DesugarCollections.unmodifiableMap(new HashMap(wVar.f23089a));
                    }
                    map = wVar.f23090b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f23068f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + TokenBuilder.TOKEN_DELIMITER;
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f23066d);
        if (!z10) {
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
                return httpURLConnection;
            }
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23074l;
        if (j10 != -1) {
            long j11 = j10 - this.f23076n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f23071i.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f23074l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = i12;
        this.f23076n += j12;
        m mVar = this.f23069g;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f23050d += j12;
        }
        return i12;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
        if (i10 == 19 || i10 == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
