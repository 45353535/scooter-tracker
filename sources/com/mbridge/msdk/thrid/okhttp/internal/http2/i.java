package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f51477l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f51478a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f51479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f51480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g f51481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<r> f51482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f51484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a f51485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final c f51486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final c f51487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    com.mbridge.msdk.thrid.okhttp.internal.http2.b f51488k;

    class c extends com.mbridge.msdk.thrid.okio.a {
        c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f51481d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f51482e = arrayDeque;
        this.f51486i = new c();
        this.f51487j = new c();
        this.f51488k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f51480c = i10;
        this.f51481d = gVar;
        this.f51479b = gVar.f51417u.c();
        b bVar = new b(gVar.f51416t.c());
        this.f51484g = bVar;
        a aVar = new a();
        this.f51485h = aVar;
        bVar.f51499e = z11;
        aVar.f51492c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f51480c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            try {
                if (!this.f51483f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f51485h;
    }

    public s e() {
        return this.f51484g;
    }

    public boolean f() {
        return this.f51481d.f51397a == ((this.f51480c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.f51488k != null) {
                return false;
            }
            b bVar = this.f51484g;
            if (bVar.f51499e || bVar.f51498d) {
                a aVar = this.f51485h;
                if (aVar.f51492c || aVar.f51491b) {
                    if (this.f51483f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t h() {
        return this.f51486i;
    }

    void i() {
        boolean zG;
        if (!f51477l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f51484g.f51499e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f51481d.c(this.f51480c);
    }

    public synchronized r j() throws IOException {
        this.f51486i.h();
        while (this.f51482e.isEmpty() && this.f51488k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f51486i.k();
                throw th2;
            }
        }
        this.f51486i.k();
        if (this.f51482e.isEmpty()) {
            throw new n(this.f51488k);
        }
        return this.f51482e.removeFirst();
    }

    void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f51487j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f51477l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f51488k != null) {
                    return false;
                }
                if (this.f51484g.f51499e && this.f51485h.f51492c) {
                    return false;
                }
                this.f51488k = bVar;
                notifyAll();
                this.f51481d.c(this.f51480c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f51481d.b(this.f51480c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f51481d.c(this.f51480c, bVar);
        }
    }

    final class a implements com.mbridge.msdk.thrid.okio.r, AutoCloseable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f51489e = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f51490a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f51492c;

        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f51489e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f51490a.a(cVar, j10);
            while (this.f51490a.size() >= 16384) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f51487j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f51489e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.f51491b) {
                        return;
                    }
                    if (!i.this.f51485h.f51492c) {
                        if (this.f51490a.size() > 0) {
                            while (this.f51490a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f51481d.a(iVar.f51480c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f51491b = true;
                    }
                    i.this.f51481d.flush();
                    i.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f51489e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f51490a.size() > 0) {
                a(false);
                i.this.f51481d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f51487j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f51479b > 0 || this.f51492c || this.f51491b || iVar.f51488k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                        i.this.f51487j.k();
                    }
                }
                iVar.f51487j.k();
                i.this.b();
                jMin = Math.min(i.this.f51479b, this.f51490a.size());
                iVar2 = i.this;
                iVar2.f51479b -= jMin;
            }
            iVar2.f51487j.h();
            try {
                i iVar3 = i.this;
                iVar3.f51481d.a(iVar3.f51480c, z10 && jMin == this.f51490a.size(), this.f51490a, jMin);
                i.this.f51487j.k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f51477l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f51483f = true;
            this.f51482e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f51481d.c(this.f51480c);
    }

    synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f51488k == null) {
            this.f51488k = bVar;
            notifyAll();
        }
    }

    void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!f51477l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f51484g.a(eVar, i10);
    }

    void b() throws IOException {
        a aVar = this.f51485h;
        if (!aVar.f51491b) {
            if (!aVar.f51492c) {
                if (this.f51488k != null) {
                    throw new n(this.f51488k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.f51477l
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$b r0 = r2.f51484g     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f51499e     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2b
            boolean r0 = r0.f51498d     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$a r0 = r2.f51485h     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f51492c     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            boolean r0 = r0.f51491b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            goto L29
        L27:
            r0 = move-exception
            goto L43
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L39
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL
            r2.a(r0)
            return
        L39:
            if (r1 != 0) goto L42
            com.mbridge.msdk.thrid.okhttp.internal.http2.g r0 = r2.f51481d
            int r1 = r2.f51480c
            r0.c(r1)
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.a():void");
    }

    private final class b implements s, AutoCloseable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f51494g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f51495a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f51496b = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f51497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f51498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f51499e;

        b(long j10) {
            this.f51497c = j10;
        }

        private void f(long j10) {
            if (!f51494g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f51481d.g(j10);
        }

        void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            long size;
            if (!f51494g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f51499e;
                    z11 = this.f51496b.size() + j10 > this.f51497c;
                }
                if (z11) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f51495a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    try {
                        if (this.f51498d) {
                            size = this.f51495a.size();
                            this.f51495a.k();
                        } else {
                            boolean z12 = this.f51496b.size() == 0;
                            this.f51496b.a(this.f51495a);
                            if (z12) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } finally {
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
        @Override // com.mbridge.msdk.thrid.okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long b(com.mbridge.msdk.thrid.okio.c r12, long r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.b.b(com.mbridge.msdk.thrid.okio.c, long):long");
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                try {
                    this.f51498d = true;
                    size = this.f51496b.size();
                    this.f51496b.k();
                    if (!i.this.f51482e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f51486i;
        }
    }

    void a(long j10) {
        this.f51479b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }
}
