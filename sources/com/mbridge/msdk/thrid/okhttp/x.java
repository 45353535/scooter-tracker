package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f51693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f51694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f51695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f51696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y f51697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f51698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51699g;

    class a extends com.mbridge.msdk.thrid.okio.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            x.this.cancel();
        }
    }

    final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f51701d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f51702b;

        b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f51702b = eVar;
        }

        void a(ExecutorService executorService) {
            if (!f51701d && Thread.holdsLock(x.this.f51693a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f51696d.callFailed(x.this, interruptedIOException);
                    this.f51702b.a(x.this, interruptedIOException);
                    x.this.f51693a.j().b(this);
                }
            } catch (Throwable th2) {
                x.this.f51693a.j().b(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        protected void b() {
            x.this.f51695c.h();
            boolean z10 = false;
            try {
                try {
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.f51702b.a(x.this, x.this.c());
                    x.this.f51693a.j().b(this);
                } catch (IOException e11) {
                    e = e11;
                    z10 = true;
                    IOException iOExceptionA = x.this.a(e);
                    if (z10) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                    } else {
                        x.this.f51696d.callFailed(x.this, iOExceptionA);
                        this.f51702b.a(x.this, iOExceptionA);
                    }
                    x.this.f51693a.j().b(this);
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    x.this.cancel();
                    if (!z10) {
                        this.f51702b.a(x.this, new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                x.this.f51693a.j().b(this);
                throw th4;
            }
        }

        x c() {
            return x.this;
        }

        String d() {
            return x.this.f51697e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f51693a = vVar;
        this.f51697e = yVar;
        this.f51698f = z10;
        this.f51694b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f51695c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f51693a, this.f51697e, this.f51698f);
    }

    a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f51693a.p());
        arrayList.add(this.f51694b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f51693a.i()));
        this.f51693a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f51693a));
        if (!this.f51698f) {
            arrayList.addAll(this.f51693a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f51698f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f51697e, this, this.f51696d, this.f51693a.e(), this.f51693a.y(), this.f51693a.C()).a(this.f51697e);
        if (!this.f51694b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f51694b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f51699g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f51699g = true;
        }
        a();
        this.f51695c.h();
        this.f51696d.callStart(this);
        try {
            try {
                this.f51693a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC != null) {
                    return a0VarC;
                }
                throw new IOException("Canceled");
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f51696d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } finally {
            this.f51693a.j().b(this);
        }
        this.f51693a.j().b(this);
    }

    String e() {
        return this.f51697e.g().l();
    }

    String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f51698f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f51694b.b();
    }

    static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f51696d = vVar.l().a(xVar);
        return xVar;
    }

    IOException a(IOException iOException) {
        if (!this.f51695c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f51694b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f51699g) {
                this.f51699g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f51696d.callStart(this);
        this.f51693a.j().a(new b(eVar));
    }
}
