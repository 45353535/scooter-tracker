package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class qi2 implements sw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo2 f115013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f115014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f115015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f115016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c10 f115017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s5 f115018f;

    public /* synthetic */ qi2(Context context, c4 c4Var, es2 es2Var, v5 v5Var, zo2 zo2Var) {
        this(zo2Var, new Handler(Looper.getMainLooper()), new x5(context, c4Var, es2Var, v5Var));
    }

    @Override // yads.sw0
    public final void a(final k4 k4Var) {
        this.f115015c.a(k4Var.f112579b);
        this.f115014b.post(new Runnable() { // from class: yads.fg0
            @Override // java.lang.Runnable
            public final void run() {
                qi2.a(k4Var, this);
            }
        });
    }

    public qi2(zo2 zo2Var, Handler handler, x5 x5Var) {
        this.f115013a = zo2Var;
        this.f115014b = handler;
        this.f115015c = x5Var;
    }

    public static final void a(k4 k4Var, qi2 qi2Var) {
        k4 k4Var2 = new k4(k4Var.f112578a, k4Var.f112579b, k4Var.f112580c, qi2Var.f115016d);
        c10 c10Var = qi2Var.f115017e;
        if (c10Var != null) {
            c10Var.a(k4Var2);
        }
        s5 s5Var = qi2Var.f115018f;
        if (s5Var != null) {
            s5Var.a();
        }
    }

    @Override // yads.sw0
    public final void a(ro2 ro2Var) {
        this.f115015c.a();
        zo2 zo2Var = this.f115013a;
        final yo2 yo2Var = new yo2(ro2Var, zo2Var.f118748a, new fg1(zo2Var.f118749b), new ag1());
        this.f115014b.post(new Runnable() { // from class: yads.tg0
            @Override // java.lang.Runnable
            public final void run() {
                qi2.a(this.f116234b, yo2Var);
            }
        });
    }

    public static final void a(qi2 qi2Var, yo2 yo2Var) {
        c10 c10Var = qi2Var.f115017e;
        if (c10Var != null) {
            c10Var.a(yo2Var);
        }
        s5 s5Var = qi2Var.f115018f;
        if (s5Var != null) {
            s5Var.a();
        }
    }

    public final void a(c4 c4Var) {
        this.f115015c.f117706e = new h9(c4Var);
    }

    public final void a(s5 s5Var) {
        this.f115018f = s5Var;
    }

    public final void a(ao2 ao2Var) {
        this.f115015c.f117707f = ao2Var;
    }
}
