package oh;

import com.google.common.net.HttpHeaders;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import hh.b0;
import hh.n;
import hh.t;
import hh.u;
import hh.x;
import hh.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nh.i;
import nh.k;
import vh.j0;
import vh.l0;
import vh.m0;
import vh.p;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements nh.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f96978h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f96979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mh.f f96980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.g f96981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.f f96982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oh.a f96984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f96985g;

    private abstract class a implements l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f96986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96987c;

        public a() {
            this.f96986b = new p(b.this.f96981c.timeout());
        }

        protected final boolean m() {
            return this.f96987c;
        }

        public final void n() {
            if (b.this.f96983e == 6) {
                return;
            }
            if (b.this.f96983e == 5) {
                b.this.n(this.f96986b);
                b.this.f96983e = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f96983e);
            }
        }

        protected final void o(boolean z10) {
            this.f96987c = z10;
        }

        @Override // vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return b.this.f96981c.read(sink, j10);
            } catch (IOException e10) {
                b.this.getConnection().y();
                n();
                throw e10;
            }
        }

        @Override // vh.l0
        public m0 timeout() {
            return this.f96986b;
        }
    }

    /* JADX INFO: renamed from: oh.b$b, reason: collision with other inner class name */
    private final class C1119b implements j0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f96989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96990c;

        public C1119b() {
            this.f96989b = new p(b.this.f96982d.timeout());
        }

        @Override // vh.j0
        public void H(vh.e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f96990c) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            b.this.f96982d.writeHexadecimalUnsignedLong(j10);
            b.this.f96982d.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            b.this.f96982d.H(source, j10);
            b.this.f96982d.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        }

        @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f96990c) {
                return;
            }
            this.f96990c = true;
            b.this.f96982d.writeUtf8("0\r\n\r\n");
            b.this.n(this.f96989b);
            b.this.f96983e = 3;
        }

        @Override // vh.j0, java.io.Flushable
        public synchronized void flush() {
            if (this.f96990c) {
                return;
            }
            b.this.f96982d.flush();
        }

        @Override // vh.j0
        public m0 timeout() {
            return this.f96989b;
        }
    }

    private final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final u f96992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f96993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f96994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f96995h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f96995h = bVar;
            this.f96992e = url;
            this.f96993f = -1L;
            this.f96994g = true;
        }

        private final void p() throws ProtocolException {
            if (this.f96993f != -1) {
                this.f96995h.f96981c.readUtf8LineStrict();
            }
            try {
                this.f96993f = this.f96995h.f96981c.readHexadecimalUnsignedLong();
                String string = StringsKt.v1(this.f96995h.f96981c.readUtf8LineStrict()).toString();
                if (this.f96993f < 0 || (string.length() > 0 && !StringsKt.a0(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f96993f + string + '\"');
                }
                if (this.f96993f == 0) {
                    this.f96994g = false;
                    b bVar = this.f96995h;
                    bVar.f96985g = bVar.f96984f.a();
                    x xVar = this.f96995h.f96979a;
                    Intrinsics.checkNotNull(xVar);
                    n nVarT = xVar.t();
                    u uVar = this.f96992e;
                    t tVar = this.f96995h.f96985g;
                    Intrinsics.checkNotNull(tVar);
                    nh.e.f(nVarT, uVar, tVar);
                    n();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (this.f96994g && !ih.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f96995h.getConnection().y();
                n();
            }
            o(true);
        }

        @Override // oh.b.a, vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f96994g) {
                return -1L;
            }
            long j11 = this.f96993f;
            if (j11 == 0 || j11 == -1) {
                p();
                if (!this.f96994g) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f96993f));
            if (j12 != -1) {
                this.f96993f -= j12;
                return j12;
            }
            this.f96995h.getConnection().y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            n();
            throw protocolException;
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f96996e;

        public e(long j10) {
            super();
            this.f96996e = j10;
            if (j10 == 0) {
                n();
            }
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (this.f96996e != 0 && !ih.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.getConnection().y();
                n();
            }
            o(true);
        }

        @Override // oh.b.a, vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f96996e;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                b.this.getConnection().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                n();
                throw protocolException;
            }
            long j13 = this.f96996e - j12;
            this.f96996e = j13;
            if (j13 == 0) {
                n();
            }
            return j12;
        }
    }

    private final class f implements j0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f96998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96999c;

        public f() {
            this.f96998b = new p(b.this.f96982d.timeout());
        }

        @Override // vh.j0
        public void H(vh.e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f96999c) {
                throw new IllegalStateException("closed");
            }
            ih.d.l(source.e0(), 0L, j10);
            b.this.f96982d.H(source, j10);
        }

        @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f96999c) {
                return;
            }
            this.f96999c = true;
            b.this.n(this.f96998b);
            b.this.f96983e = 3;
        }

        @Override // vh.j0, java.io.Flushable
        public void flush() {
            if (this.f96999c) {
                return;
            }
            b.this.f96982d.flush();
        }

        @Override // vh.j0
        public m0 timeout() {
            return this.f96998b;
        }
    }

    private final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f97001e;

        public g() {
            super();
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (!this.f97001e) {
                n();
            }
            o(true);
        }

        @Override // oh.b.a, vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            if (this.f97001e) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f97001e = true;
            n();
            return -1L;
        }
    }

    public b(x xVar, mh.f connection, vh.g source, vh.f sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f96979a = xVar;
        this.f96980b = connection;
        this.f96981c = source;
        this.f96982d = sink;
        this.f96984f = new oh.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(p pVar) {
        m0 m0VarI = pVar.i();
        pVar.j(m0.f106880e);
        m0VarI.a();
        m0VarI.b();
    }

    private final boolean o(z zVar) {
        return StringsKt.N("chunked", zVar.d(HttpHeaders.TRANSFER_ENCODING), true);
    }

    private final boolean p(b0 b0Var) {
        return StringsKt.N("chunked", b0.M(b0Var, HttpHeaders.TRANSFER_ENCODING, null, 2, null), true);
    }

    private final j0 q() {
        if (this.f96983e == 1) {
            this.f96983e = 2;
            return new C1119b();
        }
        throw new IllegalStateException(("state: " + this.f96983e).toString());
    }

    private final l0 r(u uVar) {
        if (this.f96983e == 4) {
            this.f96983e = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f96983e).toString());
    }

    private final l0 s(long j10) {
        if (this.f96983e == 4) {
            this.f96983e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f96983e).toString());
    }

    private final j0 t() {
        if (this.f96983e == 1) {
            this.f96983e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f96983e).toString());
    }

    private final l0 u() {
        if (this.f96983e == 4) {
            this.f96983e = 5;
            getConnection().y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f96983e).toString());
    }

    @Override // nh.d
    public void a(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = i.f96169a;
        Proxy.Type type = getConnection().z().b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        w(request.e(), iVar.a(request, type));
    }

    @Override // nh.d
    public l0 b(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!nh.e.b(response)) {
            return s(0L);
        }
        if (p(response)) {
            return r(response.r0().l());
        }
        long jV = ih.d.v(response);
        return jV != -1 ? s(jV) : u();
    }

    @Override // nh.d
    public long c(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!nh.e.b(response)) {
            return 0L;
        }
        if (p(response)) {
            return -1L;
        }
        return ih.d.v(response);
    }

    @Override // nh.d
    public void cancel() {
        getConnection().d();
    }

    @Override // nh.d
    public j0 d(z request, long j10) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a() != null && request.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (o(request)) {
            return q();
        }
        if (j10 != -1) {
            return t();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // nh.d
    public void finishRequest() {
        this.f96982d.flush();
    }

    @Override // nh.d
    public void flushRequest() {
        this.f96982d.flush();
    }

    @Override // nh.d
    public mh.f getConnection() {
        return this.f96980b;
    }

    @Override // nh.d
    public b0.a readResponseHeaders(boolean z10) {
        int i10 = this.f96983e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f96983e).toString());
        }
        try {
            k kVarA = k.f96172d.a(this.f96984f.b());
            b0.a aVarK = new b0.a().p(kVarA.f96173a).g(kVarA.f96174b).m(kVarA.f96175c).k(this.f96984f.a());
            if (z10 && kVarA.f96174b == 100) {
                return null;
            }
            int i11 = kVarA.f96174b;
            if (i11 == 100) {
                this.f96983e = 3;
                return aVarK;
            }
            if (102 > i11 || i11 >= 200) {
                this.f96983e = 4;
                return aVarK;
            }
            this.f96983e = 3;
            return aVarK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getConnection().z().a().l().n(), e10);
        }
    }

    public final void v(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jV = ih.d.v(response);
        if (jV == -1) {
            return;
        }
        l0 l0VarS = s(jV);
        ih.d.M(l0VarS, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        l0VarS.close();
    }

    public final void w(t headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f96983e != 0) {
            throw new IllegalStateException(("state: " + this.f96983e).toString());
        }
        this.f96982d.writeUtf8(requestLine).writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f96982d.writeUtf8(headers.e(i10)).writeUtf8(": ").writeUtf8(headers.i(i10)).writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        this.f96982d.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f96983e = 1;
    }
}
