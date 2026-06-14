package ph;

import hh.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.j0;
import vh.l0;
import vh.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f98500o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f98502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f98506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f98507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f98509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f98510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f98511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f98512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ph.b f98513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f98514n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements j0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f98515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.e f98516c = new vh.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t f98517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f98518e;

        public b(boolean z10) {
            this.f98515b = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void c(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f98515b && !this.f98518e && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (Throwable th2) {
                            iVar.s().C();
                            throw th2;
                        }
                    }
                    iVar.s().C();
                    iVar.c();
                    jMin = Math.min(iVar.q() - iVar.r(), this.f98516c.e0());
                    iVar.B(iVar.r() + jMin);
                    z11 = z10 && jMin == this.f98516c.e0();
                    Unit unit = Unit.f93236a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            i.this.s().v();
            try {
                i.this.g().T0(i.this.j(), z11, this.f98516c, jMin);
            } finally {
                i.this.s().C();
            }
        }

        @Override // vh.j0
        public void H(vh.e source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            i iVar = i.this;
            if (!ih.d.f74843h || !Thread.holdsLock(iVar)) {
                this.f98516c.H(source, j10);
                while (this.f98516c.e0() >= 16384) {
                    c(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }

        @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (ih.d.f74843h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                if (this.f98518e) {
                    return;
                }
                boolean z10 = iVar2.h() == null;
                Unit unit = Unit.f93236a;
                if (!i.this.o().f98515b) {
                    boolean z11 = this.f98516c.e0() > 0;
                    if (this.f98517d != null) {
                        while (this.f98516c.e0() > 0) {
                            c(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        t tVar = this.f98517d;
                        Intrinsics.checkNotNull(tVar);
                        fVarG.U0(iJ, z10, ih.d.P(tVar));
                    } else if (z11) {
                        while (this.f98516c.e0() > 0) {
                            c(true);
                        }
                    } else if (z10) {
                        i.this.g().T0(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f98518e = true;
                    Unit unit2 = Unit.f93236a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        @Override // vh.j0, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (ih.d.f74843h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                iVar2.c();
                Unit unit = Unit.f93236a;
            }
            while (this.f98516c.e0() > 0) {
                c(false);
                i.this.g().flush();
            }
        }

        public final boolean m() {
            return this.f98518e;
        }

        public final boolean n() {
            return this.f98515b;
        }

        @Override // vh.j0
        public m0 timeout() {
            return i.this.s();
        }
    }

    public final class c implements l0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f98520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f98521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vh.e f98522d = new vh.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final vh.e f98523e = new vh.e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t f98524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f98525g;

        public c(long j10, boolean z10) {
            this.f98520b = j10;
            this.f98521c = z10;
        }

        private final void s(long j10) {
            i iVar = i.this;
            if (!ih.d.f74843h || !Thread.holdsLock(iVar)) {
                i.this.g().S0(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jE0;
            i iVar = i.this;
            synchronized (iVar) {
                this.f98525g = true;
                jE0 = this.f98523e.e0();
                this.f98523e.n();
                Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                Unit unit = Unit.f93236a;
            }
            if (jE0 > 0) {
                s(jE0);
            }
            i.this.b();
        }

        public final boolean m() {
            return this.f98525g;
        }

        public final boolean n() {
            return this.f98521c;
        }

        public final void o(vh.g source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            Intrinsics.checkNotNullParameter(source, "source");
            i iVar = i.this;
            if (ih.d.f74843h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (i.this) {
                    z10 = this.f98521c;
                    z11 = this.f98523e.e0() + j11 > this.f98520b;
                    Unit unit = Unit.f93236a;
                }
                if (z11) {
                    source.skip(j11);
                    i.this.f(ph.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f98522d, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f98525g) {
                            this.f98522d.n();
                        } else {
                            boolean z12 = this.f98523e.e0() == 0;
                            this.f98523e.i(this.f98522d);
                            if (z12) {
                                Intrinsics.checkNotNull(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            s(j10);
        }

        public final void p(boolean z10) {
            this.f98521c = z10;
        }

        public final void q(t tVar) {
            this.f98524f = tVar;
        }

        @Override // vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            IOException iOExceptionI;
            boolean z10;
            long j11;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.m().v();
                    try {
                        if (iVar.h() == null || this.f98521c) {
                            iOExceptionI = null;
                        } else {
                            iOExceptionI = iVar.i();
                            if (iOExceptionI == null) {
                                ph.b bVarH = iVar.h();
                                Intrinsics.checkNotNull(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        }
                        if (this.f98525g) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f98523e.e0() > j12) {
                            vh.e eVar = this.f98523e;
                            j11 = eVar.read(sink, Math.min(j10, eVar.e0()));
                            iVar.A(iVar.l() + j11);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().x0().c() / 2) {
                                iVar.g().Y0(iVar.j(), jL);
                                iVar.z(iVar.l());
                            }
                        } else {
                            if (!this.f98521c && iOExceptionI == null) {
                                iVar.D();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        iVar.m().C();
                        Unit unit = Unit.f93236a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j12 = 0;
            }
        }

        @Override // vh.l0
        public m0 timeout() {
            return i.this.m();
        }
    }

    public final class d extends vh.c {
        public d() {
        }

        @Override // vh.c
        protected void B() {
            i.this.f(ph.b.CANCEL);
            i.this.g().M0();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // vh.c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i10, f connection, boolean z10, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f98501a = i10;
        this.f98502b = connection;
        this.f98506f = connection.y0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f98507g = arrayDeque;
        this.f98509i = new c(connection.x0().c(), z11);
        this.f98510j = new b(z10);
        this.f98511k = new d();
        this.f98512l = new d();
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(ph.b bVar, IOException iOException) {
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f98513m != null) {
                return false;
            }
            this.f98513m = bVar;
            this.f98514n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f98509i.n() && this.f98510j.n()) {
                return false;
            }
            Unit unit = Unit.f93236a;
            this.f98502b.L0(this.f98501a);
            return true;
        }
    }

    public final void A(long j10) {
        this.f98503c = j10;
    }

    public final void B(long j10) {
        this.f98505e = j10;
    }

    public final synchronized t C() {
        Object objRemoveFirst;
        this.f98511k.v();
        while (this.f98507g.isEmpty() && this.f98513m == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.f98511k.C();
                throw th2;
            }
        }
        this.f98511k.C();
        if (this.f98507g.isEmpty()) {
            IOException iOException = this.f98514n;
            if (iOException != null) {
                throw iOException;
            }
            ph.b bVar = this.f98513m;
            Intrinsics.checkNotNull(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f98507g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
        return (t) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final m0 E() {
        return this.f98512l;
    }

    public final void a(long j10) {
        this.f98506f += j10;
        if (j10 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.f98509i.n() && this.f98509i.m() && (this.f98510j.n() || this.f98510j.m());
                zU = u();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            d(ph.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f98502b.L0(this.f98501a);
        }
    }

    public final void c() throws IOException {
        if (this.f98510j.m()) {
            throw new IOException("stream closed");
        }
        if (this.f98510j.n()) {
            throw new IOException("stream finished");
        }
        if (this.f98513m != null) {
            IOException iOException = this.f98514n;
            if (iOException != null) {
                throw iOException;
            }
            ph.b bVar = this.f98513m;
            Intrinsics.checkNotNull(bVar);
            throw new n(bVar);
        }
    }

    public final void d(ph.b rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f98502b.W0(this.f98501a, rstStatusCode);
        }
    }

    public final void f(ph.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f98502b.X0(this.f98501a, errorCode);
        }
    }

    public final f g() {
        return this.f98502b;
    }

    public final synchronized ph.b h() {
        return this.f98513m;
    }

    public final IOException i() {
        return this.f98514n;
    }

    public final int j() {
        return this.f98501a;
    }

    public final long k() {
        return this.f98504d;
    }

    public final long l() {
        return this.f98503c;
    }

    public final d m() {
        return this.f98511k;
    }

    public final j0 n() {
        synchronized (this) {
            try {
                if (!this.f98508h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f98510j;
    }

    public final b o() {
        return this.f98510j;
    }

    public final c p() {
        return this.f98509i;
    }

    public final long q() {
        return this.f98506f;
    }

    public final long r() {
        return this.f98505e;
    }

    public final d s() {
        return this.f98512l;
    }

    public final boolean t() {
        return this.f98502b.n0() == ((this.f98501a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f98513m != null) {
                return false;
            }
            if (this.f98509i.n() || this.f98509i.m()) {
                if (this.f98510j.n() || this.f98510j.m()) {
                    if (this.f98508h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final m0 v() {
        return this.f98511k;
    }

    public final void w(vh.g source, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!ih.d.f74843h || !Thread.holdsLock(this)) {
            this.f98509i.o(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(t headers, boolean z10) {
        boolean zU;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f98508h && z10) {
                    this.f98509i.q(headers);
                } else {
                    this.f98508h = true;
                    this.f98507g.add(headers);
                }
                if (z10) {
                    this.f98509i.p(true);
                }
                zU = u();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            return;
        }
        this.f98502b.L0(this.f98501a);
    }

    public final synchronized void y(ph.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f98513m == null) {
            this.f98513m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f98504d = j10;
    }
}
