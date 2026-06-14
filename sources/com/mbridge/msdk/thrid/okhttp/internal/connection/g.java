package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.f;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f51268o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f51269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.a f51270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f51271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f51272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f51273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f51274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f51275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f51276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f51278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f51281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f51282n;

    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f51283a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f51283a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f51272d = iVar;
        this.f51269a = aVar;
        this.f51273e = dVar;
        this.f51274f = oVar;
        this.f51276h = new f(aVar, i(), dVar, oVar);
        this.f51275g = obj;
    }

    private Socket g() {
        if (!f51268o && !Thread.holdsLock(this.f51272d)) {
            throw new AssertionError();
        }
        c cVar = this.f51278j;
        if (cVar == null || !cVar.f51250k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51272d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f51272d) {
                this.f51282n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f51272d) {
            cVar = this.f51282n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f51278j;
    }

    public boolean d() {
        if (this.f51271c != null) {
            return true;
        }
        f.a aVar = this.f51270b;
        return (aVar != null && aVar.b()) || this.f51276h.a();
    }

    public void e() {
        c cVar;
        Socket socketA;
        synchronized (this.f51272d) {
            cVar = this.f51278j;
            socketA = a(true, false, false);
            if (this.f51278j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f51274f.connectionReleased(this.f51273e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket socketA;
        synchronized (this.f51272d) {
            cVar = this.f51278j;
            socketA = a(false, true, false);
            if (this.f51278j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51273e, (IOException) null);
            this.f51274f.connectionReleased(this.f51273e, cVar);
            this.f51274f.callEnd(this.f51273e);
        }
    }

    public c0 h() {
        return this.f51271c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f51269a.toString();
    }

    public Socket b(c cVar) {
        if (!f51268o && !Thread.holdsLock(this.f51272d)) {
            throw new AssertionError();
        }
        if (this.f51282n == null && this.f51278j.f51253n.size() == 1) {
            Reference<g> reference = this.f51278j.f51253n.get(0);
            Socket socketA = a(true, false, false);
            this.f51278j = cVar;
            cVar.f51253n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            synchronized (this.f51272d) {
                try {
                    if (cVarA.f51251l == 0 && !cVarA.f()) {
                        return cVarA;
                    }
                    if (cVarA.a(z11)) {
                        return cVarA;
                    }
                    e();
                    i10 = i17;
                    i11 = i16;
                    i12 = i15;
                    i13 = i14;
                    z10 = z12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        c cVar3;
        f.a aVar;
        synchronized (this.f51272d) {
            try {
                if (!this.f51280l) {
                    if (this.f51282n == null) {
                        if (!this.f51281m) {
                            cVar = this.f51278j;
                            socketG = g();
                            cVar2 = this.f51278j;
                            socketA = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f51279k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51272d, this.f51269a, this, null);
                                c cVar4 = this.f51278j;
                                if (cVar4 != null) {
                                    z11 = true;
                                    cVar2 = cVar4;
                                    c0VarC = null;
                                } else {
                                    c0VarC = this.f51271c;
                                }
                            } else {
                                c0VarC = null;
                            }
                            z11 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f51274f.connectionReleased(this.f51273e, cVar);
        }
        if (z11) {
            this.f51274f.connectionAcquired(this.f51273e, cVar2);
        }
        if (cVar2 != null) {
            this.f51271c = this.f51278j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f51270b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f51270b = this.f51276h.c();
            z12 = true;
        }
        synchronized (this.f51272d) {
            try {
                if (this.f51281m) {
                    throw new IOException("Canceled");
                }
                if (z12) {
                    List<c0> listA = this.f51270b.a();
                    int size = listA.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        c0 c0Var = listA.get(i14);
                        com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51272d, this.f51269a, this, c0Var);
                        c cVar5 = this.f51278j;
                        if (cVar5 != null) {
                            this.f51271c = c0Var;
                            z11 = true;
                            cVar2 = cVar5;
                            break;
                        }
                        i14++;
                    }
                }
                if (!z11) {
                    if (c0VarC == null) {
                        c0VarC = this.f51270b.c();
                    }
                    this.f51271c = c0VarC;
                    this.f51277i = 0;
                    cVar2 = new c(this.f51272d, c0VarC);
                    a(cVar2, false);
                }
                cVar3 = cVar2;
            } finally {
            }
        }
        if (z11) {
            this.f51274f.connectionAcquired(this.f51273e, cVar3);
            return cVar3;
        }
        cVar3.a(i10, i11, i12, i13, z10, this.f51273e, this.f51274f);
        i().a(cVar3.c());
        synchronized (this.f51272d) {
            try {
                this.f51279k = true;
                com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.b(this.f51272d, cVar3);
                if (cVar3.f()) {
                    socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51272d, this.f51269a, this);
                    cVar3 = this.f51278j;
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f51274f.connectionAcquired(this.f51273e, cVar3);
        return cVar3;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f51274f.responseBodyEnd(this.f51273e, j10);
        synchronized (this.f51272d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f51282n) {
                        if (!z10) {
                            this.f51278j.f51251l++;
                        }
                        cVar2 = this.f51278j;
                        socketA = a(z10, false, true);
                        if (this.f51278j != null) {
                            cVar2 = null;
                        }
                        z11 = this.f51280l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new IllegalStateException("expected " + this.f51282n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f51274f.connectionReleased(this.f51273e, cVar2);
        }
        if (iOException != null) {
            this.f51274f.callFailed(this.f51273e, com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51273e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51273e, (IOException) null);
            this.f51274f.callEnd(this.f51273e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket a(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.connection.g.f51268o
            if (r0 != 0) goto L13
            com.mbridge.msdk.thrid.okhttp.i r0 = r1.f51272d
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            r0 = 0
            if (r4 == 0) goto L18
            r1.f51282n = r0
        L18:
            r4 = 1
            if (r3 == 0) goto L1d
            r1.f51280l = r4
        L1d:
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r3 = r1.f51278j
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L25
            r3.f51250k = r4
        L25:
            com.mbridge.msdk.thrid.okhttp.internal.http.c r2 = r1.f51282n
            if (r2 != 0) goto L5d
            boolean r2 = r1.f51280l
            if (r2 != 0) goto L31
            boolean r2 = r3.f51250k
            if (r2 == 0) goto L5d
        L31:
            r1.a(r3)
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f51278j
            java.util.List<java.lang.ref.Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> r2 = r2.f51253n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f51278j
            long r3 = java.lang.System.nanoTime()
            r2.f51254o = r3
            com.mbridge.msdk.thrid.okhttp.internal.a r2 = com.mbridge.msdk.thrid.okhttp.internal.a.f51199a
            com.mbridge.msdk.thrid.okhttp.i r3 = r1.f51272d
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r4 = r1.f51278j
            boolean r2 = r2.a(r3, r4)
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f51278j
            java.net.Socket r2 = r2.g()
            goto L5a
        L59:
            r2 = r0
        L5a:
            r1.f51278j = r0
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.g.a(boolean, boolean, boolean):java.net.Socket");
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f51272d) {
            this.f51281m = true;
            cVar = this.f51282n;
            cVar2 = this.f51278j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public void a(IOException iOException) {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f51272d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f51519a;
                    if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                        int i10 = this.f51277i + 1;
                        this.f51277i = i10;
                        if (i10 > 1) {
                            this.f51271c = null;
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                            this.f51271c = null;
                            z10 = true;
                        }
                        z10 = false;
                    }
                } else {
                    c cVar2 = this.f51278j;
                    if (cVar2 != null && (!cVar2.f() || (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                        if (this.f51278j.f51251l == 0) {
                            c0 c0Var = this.f51271c;
                            if (c0Var != null && iOException != null) {
                                this.f51276h.a(c0Var, iOException);
                            }
                            this.f51271c = null;
                        }
                        z10 = true;
                    }
                    z10 = false;
                }
                c cVar3 = this.f51278j;
                socketA = a(z10, false, true);
                if (this.f51278j == null && this.f51279k) {
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f51274f.connectionReleased(this.f51273e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f51268o && !Thread.holdsLock(this.f51272d)) {
            throw new AssertionError();
        }
        if (this.f51278j == null) {
            this.f51278j = cVar;
            this.f51279k = z10;
            cVar.f51253n.add(new a(this, this.f51275g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f51253n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f51253n.get(i10).get() == this) {
                cVar.f51253n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
