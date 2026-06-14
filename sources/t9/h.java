package t9;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f104999a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f105003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g[] f105004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f105007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f105008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f105009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f105010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105011m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f105000b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f105012n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f105001c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f105002d = new ArrayDeque();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.q();
        }
    }

    protected h(f[] fVarArr, g[] gVarArr) {
        this.f105003e = fVarArr;
        this.f105005g = fVarArr.length;
        for (int i10 = 0; i10 < this.f105005g; i10++) {
            this.f105003e[i10] = d();
        }
        this.f105004f = gVarArr;
        this.f105006h = gVarArr.length;
        for (int i11 = 0; i11 < this.f105006h; i11++) {
            this.f105004f[i11] = e();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f104999a = aVar;
        aVar.start();
    }

    private boolean c() {
        return !this.f105001c.isEmpty() && this.f105006h > 0;
    }

    private boolean h() {
        e eVarF;
        synchronized (this.f105000b) {
            while (!this.f105010l && !c()) {
                try {
                    this.f105000b.wait();
                } finally {
                }
            }
            if (this.f105010l) {
                return false;
            }
            f fVar = (f) this.f105001c.removeFirst();
            g[] gVarArr = this.f105004f;
            int i10 = this.f105006h - 1;
            this.f105006h = i10;
            g gVar = gVarArr[i10];
            boolean z10 = this.f105009k;
            this.f105009k = false;
            if (fVar.f()) {
                gVar.a(4);
            } else {
                gVar.f104996c = fVar.f104990g;
                if (fVar.g()) {
                    gVar.a(134217728);
                }
                if (!k(fVar.f104990g)) {
                    gVar.f104998e = true;
                }
                try {
                    eVarF = g(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    eVarF = f(e10);
                } catch (RuntimeException e11) {
                    eVarF = f(e11);
                }
                if (eVarF != null) {
                    synchronized (this.f105000b) {
                        this.f105008j = eVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f105000b) {
                try {
                    if (this.f105009k) {
                        gVar.l();
                    } else if (gVar.f104998e) {
                        this.f105011m++;
                        gVar.l();
                    } else {
                        gVar.f104997d = this.f105011m;
                        this.f105011m = 0;
                        this.f105002d.addLast(gVar);
                    }
                    n(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    private void l() {
        if (c()) {
            this.f105000b.notify();
        }
    }

    private void m() throws e {
        e eVar = this.f105008j;
        if (eVar != null) {
            throw eVar;
        }
    }

    private void n(f fVar) {
        fVar.c();
        f[] fVarArr = this.f105003e;
        int i10 = this.f105005g;
        this.f105005g = i10 + 1;
        fVarArr[i10] = fVar;
    }

    private void p(g gVar) {
        gVar.c();
        g[] gVarArr = this.f105004f;
        int i10 = this.f105006h;
        this.f105006h = i10 + 1;
        gVarArr[i10] = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (h());
    }

    @Override // t9.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(f fVar) {
        synchronized (this.f105000b) {
            m();
            q9.a.a(fVar == this.f105007i);
            this.f105001c.addLast(fVar);
            l();
            this.f105007i = null;
        }
    }

    protected abstract f d();

    protected abstract g e();

    protected abstract e f(Throwable th2);

    @Override // t9.d
    public final void flush() {
        synchronized (this.f105000b) {
            try {
                this.f105009k = true;
                this.f105011m = 0;
                f fVar = this.f105007i;
                if (fVar != null) {
                    n(fVar);
                    this.f105007i = null;
                }
                while (!this.f105001c.isEmpty()) {
                    n((f) this.f105001c.removeFirst());
                }
                while (!this.f105002d.isEmpty()) {
                    ((g) this.f105002d.removeFirst()).l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract e g(f fVar, g gVar, boolean z10);

    @Override // t9.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final f dequeueInputBuffer() {
        f fVar;
        synchronized (this.f105000b) {
            m();
            q9.a.g(this.f105007i == null);
            int i10 = this.f105005g;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f105003e;
                int i11 = i10 - 1;
                this.f105005g = i11;
                fVar = fVarArr[i11];
            }
            this.f105007i = fVar;
        }
        return fVar;
    }

    @Override // t9.d, ca.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final g dequeueOutputBuffer() {
        synchronized (this.f105000b) {
            try {
                m();
                if (this.f105002d.isEmpty()) {
                    return null;
                }
                return (g) this.f105002d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean k(long j10) {
        boolean z10;
        synchronized (this.f105000b) {
            long j11 = this.f105012n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    protected void o(g gVar) {
        synchronized (this.f105000b) {
            p(gVar);
            l();
        }
    }

    protected final void r(int i10) {
        q9.a.g(this.f105005g == this.f105003e.length);
        for (f fVar : this.f105003e) {
            fVar.m(i10);
        }
    }

    @Override // t9.d
    public void release() {
        synchronized (this.f105000b) {
            this.f105010l = true;
            this.f105000b.notify();
        }
        try {
            this.f104999a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // t9.d
    public final void setOutputStartTimeUs(long j10) {
        synchronized (this.f105000b) {
            try {
                q9.a.g(this.f105005g == this.f105003e.length || this.f105009k);
                this.f105012n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
