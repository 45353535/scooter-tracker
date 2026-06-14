package rb;

import android.text.Layout;

/* JADX INFO: loaded from: classes12.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f99390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99394e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f99400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f99401l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f99404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f99405p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f99407r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f99409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f99410u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f99395f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99396g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f99397h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f99398i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f99399j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f99402m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99403n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f99406q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f99408s = Float.MAX_VALUE;

    private g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f99392c && gVar.f99392c) {
                z(gVar.f99391b);
            }
            if (this.f99397h == -1) {
                this.f99397h = gVar.f99397h;
            }
            if (this.f99398i == -1) {
                this.f99398i = gVar.f99398i;
            }
            if (this.f99390a == null && (str = gVar.f99390a) != null) {
                this.f99390a = str;
            }
            if (this.f99395f == -1) {
                this.f99395f = gVar.f99395f;
            }
            if (this.f99396g == -1) {
                this.f99396g = gVar.f99396g;
            }
            if (this.f99403n == -1) {
                this.f99403n = gVar.f99403n;
            }
            if (this.f99404o == null && (alignment2 = gVar.f99404o) != null) {
                this.f99404o = alignment2;
            }
            if (this.f99405p == null && (alignment = gVar.f99405p) != null) {
                this.f99405p = alignment;
            }
            if (this.f99406q == -1) {
                this.f99406q = gVar.f99406q;
            }
            if (this.f99399j == -1) {
                this.f99399j = gVar.f99399j;
                this.f99400k = gVar.f99400k;
            }
            if (this.f99407r == null) {
                this.f99407r = gVar.f99407r;
            }
            if (this.f99408s == Float.MAX_VALUE) {
                this.f99408s = gVar.f99408s;
            }
            if (this.f99409t == null) {
                this.f99409t = gVar.f99409t;
            }
            if (this.f99410u == null) {
                this.f99410u = gVar.f99410u;
            }
            if (z10 && !this.f99394e && gVar.f99394e) {
                w(gVar.f99393d);
            }
            if (z10 && this.f99402m == -1 && (i10 = gVar.f99402m) != -1) {
                this.f99402m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f99390a = str;
        return this;
    }

    public g B(float f10) {
        this.f99400k = f10;
        return this;
    }

    public g C(int i10) {
        this.f99399j = i10;
        return this;
    }

    public g D(String str) {
        this.f99401l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f99398i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f99395f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f99405p = alignment;
        return this;
    }

    public g H(String str) {
        this.f99409t = str;
        return this;
    }

    public g I(int i10) {
        this.f99403n = i10;
        return this;
    }

    public g J(int i10) {
        this.f99402m = i10;
        return this;
    }

    public g K(float f10) {
        this.f99408s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f99404o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f99406q = z10 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f99407r = bVar;
        return this;
    }

    public g O(boolean z10) {
        this.f99396g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f99394e) {
            return this.f99393d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f99410u;
    }

    public int d() {
        if (this.f99392c) {
            return this.f99391b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f99390a;
    }

    public float f() {
        return this.f99400k;
    }

    public int g() {
        return this.f99399j;
    }

    public String h() {
        return this.f99401l;
    }

    public Layout.Alignment i() {
        return this.f99405p;
    }

    public String j() {
        return this.f99409t;
    }

    public int k() {
        return this.f99403n;
    }

    public int l() {
        return this.f99402m;
    }

    public float m() {
        return this.f99408s;
    }

    public int n() {
        int i10 = this.f99397h;
        if (i10 == -1 && this.f99398i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f99398i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f99404o;
    }

    public boolean p() {
        return this.f99406q == 1;
    }

    public b q() {
        return this.f99407r;
    }

    public boolean r() {
        return this.f99394e;
    }

    public boolean s() {
        return this.f99392c;
    }

    public boolean u() {
        return this.f99395f == 1;
    }

    public boolean v() {
        return this.f99396g == 1;
    }

    public g w(int i10) {
        this.f99393d = i10;
        this.f99394e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f99397h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f99410u = str;
        return this;
    }

    public g z(int i10) {
        this.f99391b = i10;
        this.f99392c = true;
        return this;
    }
}
