package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gs1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f111327f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile gs1 f111328g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr1 f111329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds1 f111330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms2 f111331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es2 f111332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fs1 f111333e;

    public gs1(zr1 zr1Var, ds1 ds1Var, ms2 ms2Var, es2 es2Var, fs1 fs1Var) {
        this.f111329a = zr1Var;
        this.f111330b = ds1Var;
        this.f111331c = ms2Var;
        this.f111332d = es2Var;
        this.f111333e = fs1Var;
    }

    public static final void a(gs1 gs1Var) {
        ArrayList<b51> arrayList;
        ds1 ds1Var = gs1Var.f111330b;
        synchronized (ds1Var.f110046a) {
            arrayList = new ArrayList(ds1Var.f110047b);
            ds1Var.f110047b.clear();
            Unit unit = Unit.f93236a;
        }
        for (b51 b51Var : arrayList) {
            if (b51Var != null) {
                b51Var.a();
            }
        }
    }

    public final void b(Context context, final xz xzVar) {
        boolean z10;
        boolean z11;
        synchronized (f111327f) {
            try {
                b51 b51Var = new b51(this.f111329a, xzVar);
                z10 = false;
                if (this.f111333e == fs1.f110846d) {
                    z11 = false;
                    z10 = true;
                } else {
                    this.f111330b.a(b51Var);
                    if (this.f111333e == fs1.f110844b) {
                        this.f111333e = fs1.f110845c;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f111329a.f118779a.f108767a.execute(new Runnable() { // from class: yads.n7
                @Override // java.lang.Runnable
                public final void run() {
                    gs1.a(xzVar);
                }
            });
        }
        if (z11) {
            ms2 ms2Var = this.f111331c;
            es2 es2Var = this.f111332d;
            ms2Var.getClass();
            pr3 pr3Var = (pr3) es2Var;
            this.f111329a.f118779a.f108768b.execute(new ls2(context, pr3Var, kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(pr3Var.a()))), es1.a(pr3Var)));
        }
    }

    public final void a(js2 js2Var) {
        if (js2Var instanceof is2) {
            synchronized (f111327f) {
                this.f111333e = fs1.f110846d;
                Unit unit = Unit.f93236a;
            }
        } else if (js2Var instanceof hs2) {
            synchronized (f111327f) {
                this.f111333e = fs1.f110844b;
                Unit unit2 = Unit.f93236a;
            }
        }
        zr1 zr1Var = this.f111329a;
        zr1Var.f118779a.f108767a.execute(new Runnable() { // from class: yads.o7
            @Override // java.lang.Runnable
            public final void run() {
                gs1.a(this.f114210b);
            }
        });
    }

    public final void a(final Context context, final xz xzVar) {
        j1.a(context);
        zr1 zr1Var = this.f111329a;
        zr1Var.f118779a.f108768b.execute(new Runnable() { // from class: yads.k7
            @Override // java.lang.Runnable
            public final void run() {
                gs1.a(this.f112617b, context, xzVar);
            }
        });
    }

    public static final void a(gs1 gs1Var, Context context, xz xzVar) {
        gs1Var.b(context, xzVar);
    }

    public static final void a(xz xzVar) {
        xzVar.onInitializationCompleted();
    }
}
