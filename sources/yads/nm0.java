package yads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f113961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r23 f113962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k23 f113963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k23 f113964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k23 f113965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k23 f113966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k23 f113967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ix0 f113968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f113969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hk f113970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f113971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f113972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ou2 f113973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jd0 f113974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f113975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f113976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f113977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113978r;

    public nm0(final Context context) {
        this(context, new k23() { // from class: yads.qs
            @Override // yads.k23
            public final Object get() {
                return nm0.a(context);
            }
        }, new k23() { // from class: yads.eu
            @Override // yads.k23
            public final Object get() {
                return nm0.b(context);
            }
        });
    }

    public static /* synthetic */ yd0 a(Context context) {
        return new yd0(context);
    }

    public static /* synthetic */ yd0 b(yd0 yd0Var) {
        return yd0Var;
    }

    public static am d(Context context) {
        qb0 qb0Var;
        synchronized (qb0.class) {
            try {
                if (qb0.f114915t == null) {
                    qb0.f114915t = new qb0(context == null ? null : context.getApplicationContext(), pb0.a(w83.b(context)), 2000, hv.f111778a, true);
                }
                qb0Var = qb0.f114915t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qb0Var;
    }

    public final void c(final yd0 yd0Var) {
        if (this.f113978r) {
            throw new IllegalStateException();
        }
        this.f113963c = new k23() { // from class: yads.ps
            @Override // yads.k23
            public final Object get() {
                return nm0.b(yd0Var);
            }
        };
    }

    public nm0(final Context context, k23 k23Var, k23 k23Var2) {
        this(context, k23Var, k23Var2, new k23() { // from class: yads.iu
            @Override // yads.k23
            public final Object get() {
                return nm0.c(context);
            }
        }, new k23() { // from class: yads.ju
            @Override // yads.k23
            public final Object get() {
                return new kd0();
            }
        }, new k23() { // from class: yads.nv
            @Override // yads.k23
            public final Object get() {
                return nm0.d(context);
            }
        }, new ix0() { // from class: yads.dw
            @Override // yads.ix0
            public final Object apply(Object obj) {
                return new xa0((hv) obj);
            }
        });
    }

    public static jl1 b(Context context) {
        return new qd0(new bc0(context, new cd0()), new bd0());
    }

    public nm0(Context context, k23 k23Var, k23 k23Var2, k23 k23Var3, k23 k23Var4, k23 k23Var5, ix0 ix0Var) {
        this.f113961a = context;
        this.f113963c = k23Var;
        this.f113964d = k23Var2;
        this.f113965e = k23Var3;
        this.f113966f = k23Var4;
        this.f113967g = k23Var5;
        this.f113968h = ix0Var;
        this.f113969i = w83.c();
        this.f113970j = hk.f111607h;
        this.f113971k = 1;
        this.f113972l = true;
        this.f113973m = ou2.f114419c;
        this.f113974n = new id0().a();
        this.f113962b = hv.f111778a;
        this.f113975o = 500L;
        this.f113976p = 2000L;
        this.f113977q = true;
    }

    public static f53 c(Context context) {
        return new re0(context, je0.a(context), new bc(0));
    }
}
