package s9;

import android.net.Uri;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import q9.o0;
import s9.g;
import s9.m;

/* JADX INFO: loaded from: classes12.dex */
public class m extends s9.b implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f99854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f99855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f99856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f99857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f99858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f99859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f99860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Predicate f99861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f99862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f99863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HttpURLConnection f99864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InputStream f99865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f99866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f99867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f99868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f99869t;

    public static final class b implements g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y f99871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Predicate f99872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f99873d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f99876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f99877h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f99878i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f99870a = new u();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f99874e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f99875f = 8000;

        @Override // s9.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createDataSource() {
            m mVar = new m(this.f99873d, this.f99874e, this.f99875f, this.f99876g, this.f99877h, this.f99870a, this.f99872c, this.f99878i);
            y yVar = this.f99871b;
            if (yVar != null) {
                mVar.a(yVar);
            }
            return mVar;
        }

        public b b(String str) {
            this.f99873d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends ForwardingMap {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f99879b;

        public c(Map map) {
            this.f99879b = map;
        }

        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        public static /* synthetic */ boolean g(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set entrySet() {
            return Sets.filter(super.entrySet(), new Predicate() { // from class: s9.n
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return m.c.g((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set keySet() {
            return Sets.filter(super.keySet(), new Predicate() { // from class: s9.o
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return m.c.a((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public Map n() {
            return this.f99879b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f99864o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                q9.u.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL h(URL url, String str, k kVar) throws r {
        if (str == null) {
            throw new r("Null location redirect", kVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new r("Unsupported protocol redirect: " + protocol, kVar, 2001, 1);
            }
            if (this.f99854e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f99855f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new r(e10, kVar, 2001, 1);
                }
            }
            throw new r("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", kVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new r(e11, kVar, 2001, 1);
        }
    }

    private static boolean i(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection j(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionL = l(url);
        httpURLConnectionL.setConnectTimeout(this.f99856g);
        httpURLConnectionL.setReadTimeout(this.f99857h);
        HashMap map2 = new HashMap();
        u uVar = this.f99859j;
        if (uVar != null) {
            map2.putAll(uVar.a());
        }
        map2.putAll(this.f99860k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionL.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = v.a(j10, j11);
        if (strA != null) {
            httpURLConnectionL.setRequestProperty("Range", strA);
        }
        String str = this.f99858i;
        if (str != null) {
            httpURLConnectionL.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionL.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z10 ? "gzip" : "identity");
        httpURLConnectionL.setInstanceFollowRedirects(z11);
        httpURLConnectionL.setDoOutput(bArr != null);
        httpURLConnectionL.setRequestMethod(k.c(i10));
        if (bArr == null) {
            httpURLConnectionL.connect();
            return httpURLConnectionL;
        }
        httpURLConnectionL.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionL.connect();
        OutputStream outputStream = httpURLConnectionL.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionL;
    }

    private HttpURLConnection k(k kVar) throws IOException {
        HttpURLConnection httpURLConnectionJ;
        URL url = new URL(kVar.f99819a.toString());
        int i10 = kVar.f99821c;
        byte[] bArr = kVar.f99822d;
        long j10 = kVar.f99825g;
        long j11 = kVar.f99826h;
        int i11 = 1;
        boolean zD = kVar.d(1);
        if (!this.f99854e && !this.f99855f && !this.f99862m) {
            return j(url, i10, bArr, j10, j11, zD, true, kVar.f99823e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new r(new NoRouteToHostException("Too many redirects: " + i13), kVar, 2001, 1);
            }
            httpURLConnectionJ = j(url, i10, bArr, j10, j11, zD, false, kVar.f99823e);
            int responseCode = httpURLConnectionJ.getResponseCode();
            String headerField = httpURLConnectionJ.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionJ.disconnect();
                url = h(url, headerField, kVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionJ.disconnect();
                if (!this.f99862m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = h(url, headerField, kVar);
            }
            i12 = i13;
            i11 = 1;
        }
        return httpURLConnectionJ;
    }

    private int m(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f99868s;
        if (j10 != -1) {
            long j11 = j10 - this.f99869t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) o0.i(this.f99865p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f99869t += (long) i12;
        c(i12);
        return i12;
    }

    private void n(long j10, k kVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) o0.i(this.f99865p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new r(new InterruptedIOException(), kVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new r(kVar, 2008, 1);
            }
            j10 -= (long) i10;
            c(i10);
        }
    }

    @Override // s9.g
    public long b(k kVar) throws r {
        byte[] byteArray;
        this.f99863n = kVar;
        long j10 = 0;
        this.f99869t = 0L;
        this.f99868s = 0L;
        e(kVar);
        try {
            HttpURLConnection httpURLConnectionK = k(kVar);
            this.f99864o = httpURLConnectionK;
            this.f99867r = httpURLConnectionK.getResponseCode();
            String responseMessage = httpURLConnectionK.getResponseMessage();
            int i10 = this.f99867r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionK.getHeaderFields();
                if (this.f99867r == 416) {
                    if (kVar.f99825g == v.c(httpURLConnectionK.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                        this.f99866q = true;
                        f(kVar);
                        long j11 = kVar.f99826h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionK.getErrorStream();
                try {
                    byteArray = errorStream != null ? ByteStreams.toByteArray(errorStream) : o0.f98842f;
                } catch (IOException unused) {
                    byteArray = o0.f98842f;
                }
                byte[] bArr = byteArray;
                g();
                throw new t(this.f99867r, responseMessage, this.f99867r == 416 ? new h(2008) : null, headerFields, kVar, bArr);
            }
            String contentType = httpURLConnectionK.getContentType();
            Predicate predicate = this.f99861l;
            if (predicate != null && !predicate.apply(contentType)) {
                g();
                throw new s(contentType, kVar);
            }
            if (this.f99867r == 200) {
                long j12 = kVar.f99825g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zI = i(httpURLConnectionK);
            if (zI) {
                this.f99868s = kVar.f99826h;
            } else {
                long j13 = kVar.f99826h;
                if (j13 != -1) {
                    this.f99868s = j13;
                } else {
                    long jB = v.b(httpURLConnectionK.getHeaderField("Content-Length"), httpURLConnectionK.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    this.f99868s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f99865p = httpURLConnectionK.getInputStream();
                if (zI) {
                    this.f99865p = new GZIPInputStream(this.f99865p);
                }
                this.f99866q = true;
                f(kVar);
                try {
                    n(j10, kVar);
                    return this.f99868s;
                } catch (IOException e10) {
                    g();
                    if (e10 instanceof r) {
                        throw ((r) e10);
                    }
                    throw new r(e10, kVar, 2000, 1);
                }
            } catch (IOException e11) {
                g();
                throw new r(e11, kVar, 2000, 1);
            }
        } catch (IOException e12) {
            g();
            throw r.c(e12, kVar, 1);
        }
    }

    @Override // s9.g
    public void close() {
        try {
            InputStream inputStream = this.f99865p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new r(e10, (k) o0.i(this.f99863n), 2000, 3);
                }
            }
        } finally {
            this.f99865p = null;
            g();
            if (this.f99866q) {
                this.f99866q = false;
                d();
            }
            this.f99864o = null;
            this.f99863n = null;
        }
    }

    @Override // s9.b, s9.g
    public Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f99864o;
        return httpURLConnection == null ? ImmutableMap.of() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // s9.g
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f99864o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.f99863n;
        if (kVar != null) {
            return kVar.f99819a;
        }
        return null;
    }

    HttpURLConnection l(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws r {
        try {
            return m(bArr, i10, i11);
        } catch (IOException e10) {
            throw r.c(e10, (k) o0.i(this.f99863n), 2);
        }
    }

    private m(String str, int i10, int i11, boolean z10, boolean z11, u uVar, Predicate predicate, boolean z12) {
        super(true);
        this.f99858i = str;
        this.f99856g = i10;
        this.f99857h = i11;
        this.f99854e = z10;
        this.f99855f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f99859j = uVar;
        this.f99861l = predicate;
        this.f99860k = new u();
        this.f99862m = z12;
    }
}
