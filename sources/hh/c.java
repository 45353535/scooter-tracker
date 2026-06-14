package hh;

import androidx.collection.SieveCacheKt;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import hh.b0;
import hh.t;
import hh.z;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kh.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import rh.h;
import vh.h;
import vh.j0;
import vh.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f73537h = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kh.d f73538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73543g;

    private static final class a extends c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.C1064d f73544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f73545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f73546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final vh.g f73547e;

        /* JADX INFO: renamed from: hh.c$a$a, reason: collision with other inner class name */
        public static final class C0909a extends vh.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f73548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0909a(l0 l0Var, a aVar) {
                super(l0Var);
                this.f73548b = aVar;
            }

            @Override // vh.o, vh.l0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f73548b.n().close();
                super.close();
            }
        }

        public a(d.C1064d snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f73544b = snapshot;
            this.f73545c = str;
            this.f73546d = str2;
            this.f73547e = vh.x.d(new C0909a(snapshot.n(1), this));
        }

        @Override // hh.c0
        public long contentLength() {
            String str = this.f73546d;
            if (str != null) {
                return ih.d.V(str, -1L);
            }
            return -1L;
        }

        @Override // hh.c0
        public w contentType() {
            String str = this.f73545c;
            if (str != null) {
                return w.f73770e.b(str);
            }
            return null;
        }

        public final d.C1064d n() {
            return this.f73544b;
        }

        @Override // hh.c0
        public vh.g source() {
            return this.f73547e;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.N(HttpHeaders.VARY, tVar.e(i10), true)) {
                    String strI = tVar.i(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.P(a1.f93282a));
                    }
                    Iterator it = StringsKt.X0(strI, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.v1((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? SetsKt.emptySet() : treeSet;
        }

        private final t e(t tVar, t tVar2) {
            Set setD = d(tVar2);
            if (setD.isEmpty()) {
                return ih.d.f74837b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = tVar.e(i10);
                if (setD.contains(strE)) {
                    aVar.a(strE, tVar.i(i10));
                }
            }
            return aVar.e();
        }

        public final boolean a(b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            return d(b0Var.R()).contains(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        public final String b(u url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return vh.h.f106840e.d(url.toString()).D().r();
        }

        public final int c(vh.g source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= SieveCacheKt.NodeLinkMask && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            b0 b0VarW = b0Var.W();
            Intrinsics.checkNotNull(b0VarW);
            return e(b0VarW.r0().e(), b0Var.R());
        }

        public final boolean g(b0 cachedResponse, t cachedRequest, z newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.R());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!Intrinsics.areEqual(cachedRequest.j(str), newRequest.f(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    private final class d implements kh.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f73562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0 f73563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j0 f73564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f73566e;

        public static final class a extends vh.n {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f73567c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f73568d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, j0 j0Var) {
                super(j0Var);
                this.f73567c = cVar;
                this.f73568d = dVar;
            }

            @Override // vh.n, vh.j0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c cVar = this.f73567c;
                d dVar = this.f73568d;
                synchronized (cVar) {
                    if (dVar.b()) {
                        return;
                    }
                    dVar.c(true);
                    cVar.s(cVar.n() + 1);
                    super.close();
                    this.f73568d.f73562a.b();
                }
            }
        }

        public d(c cVar, d.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f73566e = cVar;
            this.f73562a = editor;
            j0 j0VarF = editor.f(1);
            this.f73563b = j0VarF;
            this.f73564c = new a(cVar, this, j0VarF);
        }

        @Override // kh.b
        public void abort() {
            c cVar = this.f73566e;
            synchronized (cVar) {
                if (this.f73565d) {
                    return;
                }
                this.f73565d = true;
                cVar.q(cVar.m() + 1);
                ih.d.m(this.f73563b);
                try {
                    this.f73562a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean b() {
            return this.f73565d;
        }

        @Override // kh.b
        public j0 body() {
            return this.f73564c;
        }

        public final void c(boolean z10) {
            this.f73565d = z10;
        }
    }

    public c(File directory, long j10, qh.a fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f73538b = new kh.d(fileSystem, directory, 201105, 2, j10, lh.e.f94307i);
    }

    private final void c(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f73538b.close();
    }

    public final b0 d(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            d.C1064d c1064dZ = this.f73538b.z(f73537h.b(request.l()));
            if (c1064dZ == null) {
                return null;
            }
            try {
                C0910c c0910c = new C0910c(c1064dZ.n(0));
                b0 b0VarD = c0910c.d(c1064dZ);
                if (c0910c.b(request, b0VarD)) {
                    return b0VarD;
                }
                c0 c0VarM = b0VarD.m();
                if (c0VarM != null) {
                    ih.d.m(c0VarM);
                }
                return null;
            } catch (IOException unused) {
                ih.d.m(c1064dZ);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f73538b.flush();
    }

    public final int m() {
        return this.f73540d;
    }

    public final int n() {
        return this.f73539c;
    }

    public final kh.b o(b0 response) {
        d.b bVarY;
        Intrinsics.checkNotNullParameter(response, "response");
        String strH = response.r0().h();
        if (nh.f.f96156a.a(response.r0().h())) {
            try {
                p(response.r0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strH, "GET")) {
            return null;
        }
        b bVar = f73537h;
        if (bVar.a(response)) {
            return null;
        }
        C0910c c0910c = new C0910c(response);
        try {
            bVarY = kh.d.y(this.f73538b, bVar.b(response.r0().l()), 0L, 2, null);
            if (bVarY == null) {
                return null;
            }
            try {
                c0910c.f(bVarY);
                return new d(this, bVarY);
            } catch (IOException unused2) {
                c(bVarY);
                return null;
            }
        } catch (IOException unused3) {
            bVarY = null;
        }
    }

    public final void p(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f73538b.t0(f73537h.b(request.l()));
    }

    public final void q(int i10) {
        this.f73540d = i10;
    }

    public final void s(int i10) {
        this.f73539c = i10;
    }

    public final synchronized void w() {
        this.f73542f++;
    }

    public final synchronized void y(kh.c cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f73543g++;
            if (cacheStrategy.b() != null) {
                this.f73541e++;
            } else if (cacheStrategy.a() != null) {
                this.f73542f++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void z(b0 cached, b0 network) {
        d.b bVarM;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C0910c c0910c = new C0910c(network);
        c0 c0VarM = cached.m();
        Intrinsics.checkNotNull(c0VarM, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarM = ((a) c0VarM).n().m();
            if (bVarM == null) {
                return;
            }
            try {
                c0910c.f(bVarM);
                bVarM.b();
            } catch (IOException unused) {
                c(bVarM);
            }
        } catch (IOException unused2) {
            bVarM = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File directory, long j10) {
        this(directory, j10, qh.a.f99128b);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: renamed from: hh.c$c, reason: collision with other inner class name */
    private static final class C0910c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f73549k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f73550l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f73551m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f73552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f73553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f73554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y f73555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f73556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f73557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t f73558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final s f73559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f73560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f73561j;

        /* JADX INFO: renamed from: hh.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            h.a aVar = rh.h.f99497a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f73550l = sb2.toString();
            f73551m = aVar.g().g() + "-Received-Millis";
        }

        public C0910c(l0 rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                vh.g gVarD = vh.x.d(rawSource);
                String utf8LineStrict = gVarD.readUtf8LineStrict();
                u uVarF = u.f73749k.f(utf8LineStrict);
                if (uVarF == null) {
                    IOException iOException = new IOException("Cache corruption for " + utf8LineStrict);
                    rh.h.f99497a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f73552a = uVarF;
                this.f73554c = gVarD.readUtf8LineStrict();
                t.a aVar = new t.a();
                int iC = c.f73537h.c(gVarD);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.b(gVarD.readUtf8LineStrict());
                }
                this.f73553b = aVar.e();
                nh.k kVarA = nh.k.f96172d.a(gVarD.readUtf8LineStrict());
                this.f73555d = kVarA.f96173a;
                this.f73556e = kVarA.f96174b;
                this.f73557f = kVarA.f96175c;
                t.a aVar2 = new t.a();
                int iC2 = c.f73537h.c(gVarD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.b(gVarD.readUtf8LineStrict());
                }
                String str = f73550l;
                String strF = aVar2.f(str);
                String str2 = f73551m;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.f73560i = strF != null ? Long.parseLong(strF) : 0L;
                this.f73561j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.f73558g = aVar2.e();
                if (a()) {
                    String utf8LineStrict2 = gVarD.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.f73559h = s.f73738e.a(!gVarD.exhausted() ? e0.f73603c.a(gVarD.readUtf8LineStrict()) : e0.SSL_3_0, i.f73623b.b(gVarD.readUtf8LineStrict()), c(gVarD), c(gVarD));
                } else {
                    this.f73559h = null;
                }
                Unit unit = Unit.f93236a;
                uf.c.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    uf.c.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        private final boolean a() {
            return Intrinsics.areEqual(this.f73552a.p(), "https");
        }

        private final List c(vh.g gVar) throws IOException {
            int iC = c.f73537h.c(gVar);
            if (iC == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String utf8LineStrict = gVar.readUtf8LineStrict();
                    vh.e eVar = new vh.e();
                    vh.h hVarA = vh.h.f106840e.a(utf8LineStrict);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    eVar.r(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(eVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(vh.f fVar, List list) throws IOException {
            try {
                fVar.writeDecimalLong(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    h.a aVar = vh.h.f106840e;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    fVar.writeUtf8(h.a.g(aVar, bytes, 0, 0, 3, null).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(z request, b0 response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.f73552a, request.l()) && Intrinsics.areEqual(this.f73554c, request.h()) && c.f73537h.g(response, this.f73553b, request);
        }

        public final b0 d(d.C1064d snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strA = this.f73558g.a("Content-Type");
            String strA2 = this.f73558g.a("Content-Length");
            return new b0.a().r(new z.a().m(this.f73552a).h(this.f73554c, null).g(this.f73553b).b()).p(this.f73555d).g(this.f73556e).m(this.f73557f).k(this.f73558g).b(new a(snapshot, strA, strA2)).i(this.f73559h).s(this.f73560i).q(this.f73561j).c();
        }

        public final void f(d.b editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            vh.f fVarC = vh.x.c(editor.f(0));
            try {
                fVarC.writeUtf8(this.f73552a.toString()).writeByte(10);
                fVarC.writeUtf8(this.f73554c).writeByte(10);
                fVarC.writeDecimalLong(this.f73553b.size()).writeByte(10);
                int size = this.f73553b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    fVarC.writeUtf8(this.f73553b.e(i10)).writeUtf8(": ").writeUtf8(this.f73553b.i(i10)).writeByte(10);
                }
                fVarC.writeUtf8(new nh.k(this.f73555d, this.f73556e, this.f73557f).toString()).writeByte(10);
                fVarC.writeDecimalLong(this.f73558g.size() + 2).writeByte(10);
                int size2 = this.f73558g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVarC.writeUtf8(this.f73558g.e(i11)).writeUtf8(": ").writeUtf8(this.f73558g.i(i11)).writeByte(10);
                }
                fVarC.writeUtf8(f73550l).writeUtf8(": ").writeDecimalLong(this.f73560i).writeByte(10);
                fVarC.writeUtf8(f73551m).writeUtf8(": ").writeDecimalLong(this.f73561j).writeByte(10);
                if (a()) {
                    fVarC.writeByte(10);
                    s sVar = this.f73559h;
                    Intrinsics.checkNotNull(sVar);
                    fVarC.writeUtf8(sVar.a().c()).writeByte(10);
                    e(fVarC, this.f73559h.d());
                    e(fVarC, this.f73559h.c());
                    fVarC.writeUtf8(this.f73559h.e().g()).writeByte(10);
                }
                Unit unit = Unit.f93236a;
                uf.c.a(fVarC, null);
            } finally {
            }
        }

        public C0910c(b0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f73552a = response.r0().l();
            this.f73553b = c.f73537h.f(response);
            this.f73554c = response.r0().h();
            this.f73555d = response.i0();
            this.f73556e = response.q();
            this.f73557f = response.V();
            this.f73558g = response.R();
            this.f73559h = response.w();
            this.f73560i = response.s0();
            this.f73561j = response.n0();
        }
    }
}
