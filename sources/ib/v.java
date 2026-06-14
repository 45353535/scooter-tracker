package ib;

import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f74149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f74150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f74151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f74152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74154f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74160l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f74162n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f74164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f74165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f74166r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f74155g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f74156h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f74157i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f74158j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f74159k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f74161m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f74163o = new d0();

    public void a(oa.s sVar) {
        sVar.readFully(this.f74163o.e(), 0, this.f74163o.g());
        this.f74163o.W(0);
        this.f74164p = false;
    }

    public void b(d0 d0Var) {
        d0Var.l(this.f74163o.e(), 0, this.f74163o.g());
        this.f74163o.W(0);
        this.f74164p = false;
    }

    public long c(int i10) {
        return this.f74158j[i10];
    }

    public void d(int i10) {
        this.f74163o.S(i10);
        this.f74160l = true;
        this.f74164p = true;
    }

    public void e(int i10, int i11) {
        this.f74153e = i10;
        this.f74154f = i11;
        if (this.f74156h.length < i10) {
            this.f74155g = new long[i10];
            this.f74156h = new int[i10];
        }
        if (this.f74157i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f74157i = new int[i12];
            this.f74158j = new long[i12];
            this.f74159k = new boolean[i12];
            this.f74161m = new boolean[i12];
        }
    }

    public void f() {
        this.f74153e = 0;
        this.f74165q = 0L;
        this.f74166r = false;
        this.f74160l = false;
        this.f74164p = false;
        this.f74162n = null;
    }

    public boolean g(int i10) {
        return this.f74160l && this.f74161m[i10];
    }
}
