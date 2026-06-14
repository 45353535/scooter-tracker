package mh;

import hh.a0;
import hh.b0;
import hh.c0;
import hh.r;
import hh.z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import vh.j0;
import vh.l0;
import vh.n;
import vh.o;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f94923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f94924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f94925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nh.d f94926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f94927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f94929g;

    private final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f94930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f94931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f94932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f94934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, j0 delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f94934g = cVar;
            this.f94930c = j10;
        }

        private final IOException c(IOException iOException) {
            if (this.f94931d) {
                return iOException;
            }
            this.f94931d = true;
            return this.f94934g.a(this.f94932e, false, true, iOException);
        }

        @Override // vh.n, vh.j0
        public void H(vh.e source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f94933f) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f94930c;
            if (j11 == -1 || this.f94932e + j10 <= j11) {
                try {
                    super.H(source, j10);
                    this.f94932e += j10;
                    return;
                } catch (IOException e10) {
                    throw c(e10);
                }
            }
            throw new ProtocolException("expected " + this.f94930c + " bytes but received " + (this.f94932e + j10));
        }

        @Override // vh.n, vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f94933f) {
                return;
            }
            this.f94933f = true;
            long j10 = this.f94930c;
            if (j10 != -1 && this.f94932e != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                c(null);
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        @Override // vh.n, vh.j0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw c(e10);
            }
        }
    }

    public final class b extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f94935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f94936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f94937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f94938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f94940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, l0 delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f94940g = cVar;
            this.f94935b = j10;
            this.f94937d = true;
            if (j10 == 0) {
                c(null);
            }
        }

        public final IOException c(IOException iOException) {
            if (this.f94938e) {
                return iOException;
            }
            this.f94938e = true;
            if (iOException == null && this.f94937d) {
                this.f94937d = false;
                this.f94940g.i().w(this.f94940g.g());
            }
            return this.f94940g.a(this.f94936c, true, false, iOException);
        }

        @Override // vh.o, vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f94939f) {
                return;
            }
            this.f94939f = true;
            try {
                super.close();
                c(null);
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        @Override // vh.o, vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f94939f) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f94937d) {
                    this.f94937d = false;
                    this.f94940g.i().w(this.f94940g.g());
                }
                if (j11 == -1) {
                    c(null);
                    return -1L;
                }
                long j12 = this.f94936c + j11;
                long j13 = this.f94935b;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f94935b + " bytes but received " + j12);
                }
                this.f94936c = j12;
                if (j12 == j13) {
                    c(null);
                }
                return j11;
            } catch (IOException e10) {
                throw c(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, nh.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f94923a = call;
        this.f94924b = eventListener;
        this.f94925c = finder;
        this.f94926d = codec;
        this.f94929g = codec.getConnection();
    }

    private final void t(IOException iOException) {
        this.f94928f = true;
        this.f94925c.h(iOException);
        this.f94926d.getConnection().G(this.f94923a, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f94924b.s(this.f94923a, iOException);
            } else {
                this.f94924b.q(this.f94923a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f94924b.x(this.f94923a, iOException);
            } else {
                this.f94924b.v(this.f94923a, j10);
            }
        }
        return this.f94923a.v(this, z11, z10, iOException);
    }

    public final void b() {
        this.f94926d.cancel();
    }

    public final j0 c(z request, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f94927e = z10;
        a0 a0VarA = request.a();
        Intrinsics.checkNotNull(a0VarA);
        long jContentLength = a0VarA.contentLength();
        this.f94924b.r(this.f94923a);
        return new a(this, this.f94926d.d(request, jContentLength), jContentLength);
    }

    public final void d() {
        this.f94926d.cancel();
        this.f94923a.v(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f94926d.finishRequest();
        } catch (IOException e10) {
            this.f94924b.s(this.f94923a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f94926d.flushRequest();
        } catch (IOException e10) {
            this.f94924b.s(this.f94923a, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f94923a;
    }

    public final f h() {
        return this.f94929g;
    }

    public final r i() {
        return this.f94924b;
    }

    public final d j() {
        return this.f94925c;
    }

    public final boolean k() {
        return this.f94928f;
    }

    public final boolean l() {
        return !Intrinsics.areEqual(this.f94925c.d().l().h(), this.f94929g.z().a().l().h());
    }

    public final boolean m() {
        return this.f94927e;
    }

    public final void n() {
        this.f94926d.getConnection().y();
    }

    public final void o() {
        this.f94923a.v(this, true, false, null);
    }

    public final c0 p(b0 response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strM = b0.M(response, "Content-Type", null, 2, null);
            long jC = this.f94926d.c(response);
            return new nh.h(strM, jC, x.d(new b(this, this.f94926d.b(response), jC)));
        } catch (IOException e10) {
            this.f94924b.x(this.f94923a, e10);
            t(e10);
            throw e10;
        }
    }

    public final b0.a q(boolean z10) throws IOException {
        try {
            b0.a responseHeaders = this.f94926d.readResponseHeaders(z10);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.l(this);
            return responseHeaders;
        } catch (IOException e10) {
            this.f94924b.x(this.f94923a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f94924b.y(this.f94923a, response);
    }

    public final void s() {
        this.f94924b.z(this.f94923a);
    }

    public final void u(z request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f94924b.u(this.f94923a);
            this.f94926d.a(request);
            this.f94924b.t(this.f94923a, request);
        } catch (IOException e10) {
            this.f94924b.s(this.f94923a, e10);
            t(e10);
            throw e10;
        }
    }
}
