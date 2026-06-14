package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class oi2 implements sw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb1 f114333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f114334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f114335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i00 f114336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s5 f114337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f114338f;

    public /* synthetic */ oi2(Context context, c4 c4Var, es2 es2Var, v5 v5Var, vb1 vb1Var) {
        this(vb1Var, new Handler(Looper.getMainLooper()), new x5(context, c4Var, es2Var, v5Var));
    }

    @Override // yads.sw0
    public final void a(k4 k4Var) {
        this.f114335c.a(k4Var.f112579b);
        final k4 k4Var2 = new k4(k4Var.f112578a, k4Var.f112579b, k4Var.f112580c, this.f114338f);
        this.f114334b.post(new Runnable() { // from class: yads.sz
            @Override // java.lang.Runnable
            public final void run() {
                oi2.a(this.f115995b, k4Var2);
            }
        });
    }

    public oi2(vb1 vb1Var, Handler handler, x5 x5Var) {
        this.f114333a = vb1Var;
        this.f114334b = handler;
        this.f114335c = x5Var;
    }

    public static final void a(oi2 oi2Var, k4 k4Var) {
        i00 i00Var = oi2Var.f114336d;
        if (i00Var != null) {
            i00Var.a(k4Var);
        }
        s5 s5Var = oi2Var.f114337e;
        if (s5Var != null) {
            s5Var.a();
        }
    }

    @Override // yads.sw0
    public final void a(nb1 nb1Var) {
        this.f114335c.a();
        vb1 vb1Var = this.f114333a;
        final ub1 ub1Var = new ub1(nb1Var, vb1Var.f116952a, new fg1(vb1Var.f116953b), new ag1());
        this.f114334b.post(new Runnable() { // from class: yads.yz
            @Override // java.lang.Runnable
            public final void run() {
                oi2.a(this.f118465b, ub1Var);
            }
        });
    }

    public static final void a(oi2 oi2Var, ub1 ub1Var) {
        i00 i00Var = oi2Var.f114336d;
        if (i00Var != null) {
            i00Var.a(ub1Var);
        }
        s5 s5Var = oi2Var.f114337e;
        if (s5Var != null) {
            s5Var.a();
        }
    }

    public final void a(c4 c4Var) {
        this.f114335c.f117706e = new h9(c4Var);
    }

    public final void a(s5 s5Var) {
        this.f114337e = s5Var;
    }

    public final void a(ao2 ao2Var) {
        this.f114335c.f117707f = ao2Var;
    }
}
