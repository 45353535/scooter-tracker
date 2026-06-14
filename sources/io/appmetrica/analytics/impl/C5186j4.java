package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5186j4 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile C5186j4 f77464u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5564y6 f77465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L7 f77466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z3 f77467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f77468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5308o f77469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4997bl f77470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L5 f77471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5258m f77472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5357pn f77473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Cd f77474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5383r0 f77475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C5109g4 f77476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Zc f77477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C4965af f77478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C5124gj f77479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C5533x0 f77480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U1 f77481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C5192ja f77482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile C4976b0 f77483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile T9 f77484t;

    public C5186j4(C5564y6 c5564y6, C5308o c5308o, Z3 z32) {
        this(c5564y6, c5308o, z32, new C5258m(c5308o));
    }

    public static C5186j4 l() {
        if (f77464u == null) {
            synchronized (C5186j4.class) {
                try {
                    if (f77464u == null) {
                        f77464u = new C5186j4(new C5564y6(), new C5308o(), new Z3());
                    }
                } finally {
                }
            }
        }
        return f77464u;
    }

    public final C5308o a() {
        return this.f77469e;
    }

    public final C4965af b(Context context) {
        C4965af c4965af;
        C4965af c4965af2 = this.f77478n;
        if (c4965af2 != null) {
            return c4965af2;
        }
        synchronized (this) {
            try {
                c4965af = this.f77478n;
                if (c4965af == null) {
                    c4965af = new C4965af(C5112g7.a(context).a());
                    this.f77478n = c4965af;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4965af;
    }

    public final C5383r0 c() {
        return this.f77475k;
    }

    public final C5533x0 d() {
        return this.f77480p;
    }

    public final Q1 e() {
        return this.f77468d;
    }

    public final U1 f() {
        return this.f77481q;
    }

    public final Z3 g() {
        return this.f77467c;
    }

    public final L5 h() {
        return this.f77471g;
    }

    public final C5564y6 i() {
        return this.f77465a;
    }

    public final L7 j() {
        return this.f77466b;
    }

    public final C5192ja k() {
        return this.f77482r;
    }

    public final C5109g4 m() {
        C5109g4 c5109g4;
        C5109g4 c5109g42 = this.f77476l;
        if (c5109g42 != null) {
            return c5109g42;
        }
        synchronized (this) {
            try {
                c5109g4 = this.f77476l;
                if (c5109g4 == null) {
                    c5109g4 = new C5109g4();
                    this.f77476l = c5109g4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5109g4;
    }

    public final C5564y6 n() {
        return this.f77465a;
    }

    public final C4997bl o() {
        return this.f77470f;
    }

    public C5186j4(C5564y6 c5564y6, C5308o c5308o, Z3 z32, C5258m c5258m) {
        this(c5564y6, new L7(), z32, c5258m, new Q1(), c5308o, new C4997bl(c5308o, c5258m), new L5(c5308o), new C5357pn(), new C5383r0());
    }

    public final synchronized Cd a(Context context) {
        try {
            if (this.f77474j == null) {
                this.f77474j = new Cd(context, new oo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77474j;
    }

    public C5186j4(C5564y6 c5564y6, L7 l72, Z3 z32, C5258m c5258m, Q1 q12, C5308o c5308o, C4997bl c4997bl, L5 l52, C5357pn c5357pn, C5383r0 c5383r0) {
        this.f77477m = new Zc();
        this.f77480p = new C5533x0();
        this.f77481q = new U1();
        this.f77482r = new C5192ja();
        new K7();
        this.f77465a = c5564y6;
        this.f77466b = l72;
        this.f77467c = z32;
        this.f77472h = c5258m;
        this.f77468d = q12;
        this.f77469e = c5308o;
        this.f77470f = c4997bl;
        this.f77471g = l52;
        this.f77473i = c5357pn;
        this.f77475k = c5383r0;
    }

    public final C4976b0 b() {
        C4976b0 c4976b0;
        C4976b0 c4976b02 = this.f77483s;
        if (c4976b02 != null) {
            return c4976b02;
        }
        synchronized (this) {
            try {
                c4976b0 = this.f77483s;
                if (c4976b0 == null) {
                    c4976b0 = new C4976b0(this.f77480p, this.f77470f, this.f77467c);
                    this.f77483s = c4976b0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4976b0;
    }
}
