package mh;

import androidx.core.app.NotificationCompat;
import hh.b0;
import hh.p;
import hh.r;
import hh.u;
import hh.x;
import hh.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements hh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f94951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f94952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f94953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f94954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f94955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f94956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f94957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f94958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f94959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f94960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f94961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mh.c f94962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f94963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f94964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f94965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f94966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile mh.c f94967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile f f94968s;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final hh.f f94969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f94970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f94971d;

        public a(e eVar, hh.f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f94971d = eVar;
            this.f94969b = responseCallback;
            this.f94970c = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            p pVarU = this.f94971d.n().u();
            if (ih.d.f74843h && Thread.holdsLock(pVarU)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarU);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f94971d.w(interruptedIOException);
                    this.f94969b.onFailure(this.f94971d, interruptedIOException);
                    this.f94971d.n().u().f(this);
                }
            } catch (Throwable th2) {
                this.f94971d.n().u().f(this);
                throw th2;
            }
        }

        public final e b() {
            return this.f94971d;
        }

        public final AtomicInteger d() {
            return this.f94970c;
        }

        public final String e() {
            return this.f94971d.s().l().h();
        }

        public final void f(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f94970c = other.f94970c;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            p pVarU;
            String str = "OkHttp " + this.f94971d.x();
            e eVar = this.f94971d;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f94956g.v();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th3) {
                        z10 = false;
                        th2 = th3;
                    }
                    try {
                        this.f94969b.onResponse(eVar, eVar.t());
                        pVarU = eVar.n().u();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            rh.h.f99497a.g().k("Callback failure for " + eVar.D(), 4, e10);
                        } else {
                            this.f94969b.onFailure(eVar, e10);
                        }
                        pVarU = eVar.n().u();
                    } catch (Throwable th4) {
                        th2 = th4;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            lf.c.a(iOException, th2);
                            this.f94969b.onFailure(eVar, iOException);
                        }
                        throw th2;
                    }
                    pVarU.f(this);
                } catch (Throwable th5) {
                    eVar.n().u().f(this);
                    throw th5;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f94972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f94972a = obj;
        }

        public final Object a() {
            return this.f94972a;
        }
    }

    public static final class c extends vh.c {
        c() {
        }

        @Override // vh.c
        protected void B() {
            e.this.cancel();
        }
    }

    public e(x client, z originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f94951b = client;
        this.f94952c = originalRequest;
        this.f94953d = z10;
        this.f94954e = client.r().a();
        this.f94955f = client.w().a(this);
        c cVar = new c();
        cVar.g(client.n(), TimeUnit.MILLISECONDS);
        this.f94956g = cVar;
        this.f94957h = new AtomicBoolean();
        this.f94965p = true;
    }

    private final IOException C(IOException iOException) {
        if (this.f94961l || !this.f94956g.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f94953d ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
    }

    private final IOException d(IOException iOException) {
        Socket socketY;
        boolean z10 = ih.d.f74843h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f94960k;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketY = y();
            }
            if (this.f94960k == null) {
                if (socketY != null) {
                    ih.d.n(socketY);
                }
                this.f94955f.l(this, fVar);
            } else if (socketY != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionC = C(iOException);
        if (iOException == null) {
            this.f94955f.d(this);
            return iOExceptionC;
        }
        r rVar = this.f94955f;
        Intrinsics.checkNotNull(iOExceptionC);
        rVar.e(this, iOExceptionC);
        return iOExceptionC;
    }

    private final void e() {
        this.f94958i = rh.h.f99497a.g().i("response.body().close()");
        this.f94955f.f(this);
    }

    private final hh.a j(u uVar) {
        SSLSocketFactory sSLSocketFactoryN;
        HostnameVerifier hostnameVerifierA;
        hh.g gVarP;
        if (uVar.i()) {
            sSLSocketFactoryN = this.f94951b.N();
            hostnameVerifierA = this.f94951b.A();
            gVarP = this.f94951b.p();
        } else {
            sSLSocketFactoryN = null;
            hostnameVerifierA = null;
            gVarP = null;
        }
        return new hh.a(uVar.h(), uVar.l(), this.f94951b.v(), this.f94951b.M(), sSLSocketFactoryN, hostnameVerifierA, gVarP, this.f94951b.I(), this.f94951b.H(), this.f94951b.G(), this.f94951b.s(), this.f94951b.J());
    }

    public final void A(f fVar) {
        this.f94968s = fVar;
    }

    public final void B() {
        if (this.f94961l) {
            throw new IllegalStateException("Check failed.");
        }
        this.f94961l = true;
        this.f94956g.w();
    }

    public final void c(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!ih.d.f74843h || Thread.holdsLock(connection)) {
            if (this.f94960k != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f94960k = connection;
            connection.n().add(new b(this, this.f94958i));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // hh.e
    public void cancel() {
        if (this.f94966q) {
            return;
        }
        this.f94966q = true;
        mh.c cVar = this.f94967r;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f94968s;
        if (fVar != null) {
            fVar.d();
        }
        this.f94955f.g(this);
    }

    @Override // hh.e
    public b0 execute() {
        if (!this.f94957h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f94956g.v();
        e();
        try {
            this.f94951b.u().b(this);
            return t();
        } finally {
            this.f94951b.u().g(this);
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f94951b, this.f94952c, this.f94953d);
    }

    @Override // hh.e
    public boolean isCanceled() {
        return this.f94966q;
    }

    public final void k(z request, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f94962m != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f94964o) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f94963n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f93236a;
        }
        if (z10) {
            this.f94959j = new d(this.f94954e, j(request.l()), this, this.f94955f);
        }
    }

    public final void l(boolean z10) {
        mh.c cVar;
        synchronized (this) {
            if (!this.f94965p) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f93236a;
        }
        if (z10 && (cVar = this.f94967r) != null) {
            cVar.d();
        }
        this.f94962m = null;
    }

    @Override // hh.e
    public void m(hh.f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f94957h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        this.f94951b.u().a(new a(this, responseCallback));
    }

    public final x n() {
        return this.f94951b;
    }

    public final f o() {
        return this.f94960k;
    }

    public final r p() {
        return this.f94955f;
    }

    public final boolean q() {
        return this.f94953d;
    }

    public final mh.c r() {
        return this.f94962m;
    }

    public final z s() {
        return this.f94952c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hh.b0 t() {
        /*
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            hh.x r0 = r9.f94951b
            java.util.List r0 = r0.B()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            nh.j r0 = new nh.j
            hh.x r1 = r9.f94951b
            r0.<init>(r1)
            r2.add(r0)
            nh.a r0 = new nh.a
            hh.x r1 = r9.f94951b
            hh.n r1 = r1.t()
            r0.<init>(r1)
            r2.add(r0)
            kh.a r0 = new kh.a
            hh.x r1 = r9.f94951b
            hh.c r1 = r1.l()
            r0.<init>(r1)
            r2.add(r0)
            mh.a r0 = mh.a.f94918a
            r2.add(r0)
            boolean r0 = r9.f94953d
            if (r0 != 0) goto L4a
            hh.x r0 = r9.f94951b
            java.util.List r0 = r0.D()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L4a:
            nh.b r0 = new nh.b
            boolean r1 = r9.f94953d
            r0.<init>(r1)
            r2.add(r0)
            nh.g r0 = new nh.g
            hh.z r5 = r9.f94952c
            hh.x r1 = r9.f94951b
            int r6 = r1.q()
            hh.x r1 = r9.f94951b
            int r7 = r1.K()
            hh.x r1 = r9.f94951b
            int r8 = r1.P()
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r3 = 0
            hh.z r4 = r1.f94952c     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            hh.b0 r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            boolean r4 = r9.isCanceled()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            if (r4 != 0) goto L82
            r9.w(r2)
            return r0
        L82:
            ih.d.m(r0)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
        L8d:
            r0 = move-exception
            goto L9b
        L8f:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r9.w(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r4)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L9b:
            if (r3 != 0) goto La0
            r9.w(r2)
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.e.t():hh.b0");
    }

    public final mh.c u(nh.g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f94965p) {
                throw new IllegalStateException("released");
            }
            if (this.f94964o) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f94963n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f93236a;
        }
        d dVar = this.f94959j;
        Intrinsics.checkNotNull(dVar);
        mh.c cVar = new mh.c(this, this.f94955f, dVar, dVar.a(this.f94951b, chain));
        this.f94962m = cVar;
        this.f94967r = cVar;
        synchronized (this) {
            this.f94963n = true;
            this.f94964o = true;
        }
        if (this.f94966q) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    public final IOException v(mh.c exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f94967r)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f94963n) {
                            if (z11 || !this.f94964o) {
                                z13 = false;
                            }
                            Unit unit = Unit.f93236a;
                        }
                        if (z10) {
                            this.f94963n = false;
                        }
                        if (z11) {
                            this.f94964o = false;
                        }
                        boolean z14 = this.f94963n;
                        boolean z15 = (z14 || this.f94964o) ? false : true;
                        if (!z14 && !this.f94964o && !this.f94965p) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        Unit unit2 = Unit.f93236a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    Unit unit22 = Unit.f93236a;
                }
            }
            if (z12) {
                this.f94967r = null;
                f fVar = this.f94960k;
                if (fVar != null) {
                    fVar.s();
                }
            }
            if (z13) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException w(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f94965p) {
                    this.f94965p = false;
                    if (!this.f94963n && !this.f94964o) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? d(iOException) : iOException;
    }

    public final String x() {
        return this.f94952c.l().n();
    }

    public final Socket y() {
        f fVar = this.f94960k;
        Intrinsics.checkNotNull(fVar);
        if (ih.d.f74843h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        Iterator it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listN.remove(i10);
        this.f94960k = null;
        if (listN.isEmpty()) {
            fVar.B(System.nanoTime());
            if (this.f94954e.c(fVar)) {
                return fVar.D();
            }
        }
        return null;
    }

    public final boolean z() {
        d dVar = this.f94959j;
        Intrinsics.checkNotNull(dVar);
        return dVar.e();
    }
}
