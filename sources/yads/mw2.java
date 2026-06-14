package yads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mw2 implements ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2 f113630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113631b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f113632c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f113633d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa0[] f113634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ha0[] f113635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f113637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fa0 f113638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f23 f113639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113641l;

    public mw2(fa0[] fa0VarArr, ha0[] ha0VarArr) {
        this.f113634e = fa0VarArr;
        this.f113636g = fa0VarArr.length;
        for (int i10 = 0; i10 < this.f113636g; i10++) {
            this.f113634e[i10] = c();
        }
        this.f113635f = ha0VarArr;
        this.f113637h = ha0VarArr.length;
        for (int i11 = 0; i11 < this.f113637h; i11++) {
            this.f113635f[i11] = d();
        }
        lw2 lw2Var = new lw2((rw2) this);
        this.f113630a = lw2Var;
        lw2Var.start();
    }

    @Override // yads.ba0
    public final Object a() {
        synchronized (this.f113631b) {
            try {
                f23 f23Var = this.f113639j;
                if (f23Var != null) {
                    throw f23Var;
                }
                if (this.f113633d.isEmpty()) {
                    return null;
                }
                return (ha0) this.f113633d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract f23 a(fa0 fa0Var, ha0 ha0Var, boolean z10);

    @Override // yads.ba0
    public final Object b() {
        fa0 fa0Var;
        synchronized (this.f113631b) {
            try {
                f23 f23Var = this.f113639j;
                if (f23Var != null) {
                    throw f23Var;
                }
                if (this.f113638i != null) {
                    throw new IllegalStateException();
                }
                int i10 = this.f113636g;
                if (i10 == 0) {
                    fa0Var = null;
                } else {
                    fa0[] fa0VarArr = this.f113634e;
                    int i11 = i10 - 1;
                    this.f113636g = i11;
                    fa0Var = fa0VarArr[i11];
                }
                this.f113638i = fa0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fa0Var;
    }

    public abstract i23 c();

    public abstract qw2 d();

    public final boolean e() {
        f23 f23Var;
        f23 f23VarA;
        synchronized (this.f113631b) {
            while (!this.f113641l && (this.f113632c.isEmpty() || this.f113637h <= 0)) {
                try {
                    this.f113631b.wait();
                } finally {
                }
            }
            if (this.f113641l) {
                return false;
            }
            fa0 fa0Var = (fa0) this.f113632c.removeFirst();
            ha0[] ha0VarArr = this.f113635f;
            int i10 = this.f113637h - 1;
            this.f113637h = i10;
            ha0 ha0Var = ha0VarArr[i10];
            boolean z10 = this.f113640k;
            this.f113640k = false;
            if (fa0Var.b(4)) {
                ha0Var.f112430b = 4 | ha0Var.f112430b;
            } else {
                if (fa0Var.b(Integer.MIN_VALUE)) {
                    ha0Var.f112430b |= Integer.MIN_VALUE;
                }
                if (fa0Var.b(134217728)) {
                    ha0Var.f112430b = 134217728 | ha0Var.f112430b;
                }
                try {
                    f23VarA = a(fa0Var, ha0Var, z10);
                } catch (OutOfMemoryError e10) {
                    f23Var = new f23("Unexpected decode error", e10);
                    f23VarA = f23Var;
                } catch (RuntimeException e11) {
                    f23Var = new f23("Unexpected decode error", e11);
                    f23VarA = f23Var;
                }
                if (f23VarA != null) {
                    synchronized (this.f113631b) {
                        this.f113639j = f23VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f113631b) {
                try {
                    if (this.f113640k || ha0Var.b(Integer.MIN_VALUE)) {
                        ha0Var.b();
                    } else {
                        this.f113633d.addLast(ha0Var);
                    }
                    fa0Var.b();
                    fa0[] fa0VarArr = this.f113634e;
                    int i11 = this.f113636g;
                    this.f113636g = i11 + 1;
                    fa0VarArr[i11] = fa0Var;
                } finally {
                }
            }
            return true;
        }
    }

    public final void f() {
        if (this.f113632c.isEmpty() || this.f113637h <= 0) {
            return;
        }
        this.f113631b.notify();
    }

    @Override // yads.ba0
    public final void flush() {
        synchronized (this.f113631b) {
            try {
                this.f113640k = true;
                fa0 fa0Var = this.f113638i;
                if (fa0Var != null) {
                    fa0Var.b();
                    fa0[] fa0VarArr = this.f113634e;
                    int i10 = this.f113636g;
                    this.f113636g = i10 + 1;
                    fa0VarArr[i10] = fa0Var;
                    this.f113638i = null;
                }
                while (!this.f113632c.isEmpty()) {
                    fa0 fa0Var2 = (fa0) this.f113632c.removeFirst();
                    fa0Var2.b();
                    fa0[] fa0VarArr2 = this.f113634e;
                    int i11 = this.f113636g;
                    this.f113636g = i11 + 1;
                    fa0VarArr2[i11] = fa0Var2;
                }
                while (!this.f113633d.isEmpty()) {
                    ((ha0) this.f113633d.removeFirst()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        int i10 = this.f113636g;
        fa0[] fa0VarArr = this.f113634e;
        if (i10 != fa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (fa0 fa0Var : fa0VarArr) {
            fa0Var.c(1024);
        }
    }

    @Override // yads.ba0
    public final void release() {
        synchronized (this.f113631b) {
            this.f113641l = true;
            this.f113631b.notify();
        }
        try {
            this.f113630a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // yads.ba0
    public final void a(i23 i23Var) {
        synchronized (this.f113631b) {
            try {
                f23 f23Var = this.f113639j;
                if (f23Var == null) {
                    if (i23Var == this.f113638i) {
                        this.f113632c.addLast(i23Var);
                        if (!this.f113632c.isEmpty() && this.f113637h > 0) {
                            this.f113631b.notify();
                        }
                        this.f113638i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw f23Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
