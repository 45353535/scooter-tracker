package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class d53 implements oq {
    public static final d53 B = new d53(new c53());
    public final d41 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f109777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f109778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f109780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f109781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y31 f109782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f109783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y31 f109784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f109785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f109786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f109787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y31 f109788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y31 f109789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f109790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f109791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f109792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f109793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f109794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b41 f109795z;

    static {
        new nq() { // from class: yads.o5
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return d53.a(bundle);
            }
        };
    }

    public d53(c53 c53Var) {
        this.f109771b = c53Var.f109226a;
        this.f109772c = c53Var.f109227b;
        this.f109773d = c53Var.f109228c;
        this.f109774e = c53Var.f109229d;
        this.f109775f = c53Var.f109230e;
        this.f109776g = c53Var.f109231f;
        this.f109777h = c53Var.f109232g;
        this.f109778i = c53Var.f109233h;
        this.f109779j = c53Var.f109234i;
        this.f109780k = c53Var.f109235j;
        this.f109781l = c53Var.f109236k;
        this.f109782m = c53Var.f109237l;
        this.f109783n = c53Var.f109238m;
        this.f109784o = c53Var.f109239n;
        this.f109785p = c53Var.f109240o;
        this.f109786q = c53Var.f109241p;
        this.f109787r = c53Var.f109242q;
        this.f109788s = c53Var.f109243r;
        this.f109789t = c53Var.f109244s;
        this.f109790u = c53Var.f109245t;
        this.f109791v = c53Var.f109246u;
        this.f109792w = c53Var.f109247v;
        this.f109793x = c53Var.f109248w;
        this.f109794y = c53Var.f109249x;
        this.f109795z = b41.a(c53Var.f109250y);
        this.A = d41.a(c53Var.f109251z);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.d53.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.A.hashCode() + ((((((((((((((this.f109789t.hashCode() + ((this.f109788s.hashCode() + ((((((((this.f109784o.hashCode() + ((((this.f109782m.hashCode() + ((((((((((((((((((((((this.f109771b + 31) * 31) + this.f109772c) * 31) + this.f109773d) * 31) + this.f109774e) * 31) + this.f109775f) * 31) + this.f109776g) * 31) + this.f109777h) * 31) + this.f109778i) * 31) + (this.f109781l ? 1 : 0)) * 31) + this.f109779j) * 31) + this.f109780k) * 31)) * 31) + this.f109783n) * 31)) * 31) + this.f109785p) * 31) + this.f109786q) * 31) + this.f109787r) * 31)) * 31)) * 31) + this.f109790u) * 31) + this.f109791v) * 31) + (this.f109792w ? 1 : 0)) * 31) + (this.f109793x ? 1 : 0)) * 31) + (this.f109794y ? 1 : 0)) * 31) + yv2.a(this.f109795z.entrySet())) * 31);
    }

    public static d53 a(Bundle bundle) {
        return new d53(new c53(bundle));
    }
}
