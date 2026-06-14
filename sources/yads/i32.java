package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et2 f111850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yx1 f111851b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i32(Context context, es2 es2Var, c4 c4Var, v5 v5Var) {
        CoroutineScope coroutineScopeA = l10.a((nl0) ((pr3) es2Var).a());
        this(c4Var, new et2(es2Var), new yx1(context.getApplicationContext(), es2Var, c4Var, v5Var, coroutineScopeA));
    }

    public final void a(t9 t9Var, h32 h32Var, un2 un2Var) {
        qz1 qz1Var = (qz1) t9Var.f116127t;
        if (qz1Var == null) {
            h32Var.a(f9.f110642c);
            un2Var.a();
            return;
        }
        un2Var.a(qz1Var);
        jy1 jy1VarA = this.f111850a.a(t9Var);
        l12 l12Var = new l12(h32Var);
        yx1 yx1Var = this.f111851b;
        eg.i.d(yx1Var.f118430d, null, null, new xx1(yx1Var, t9Var, qz1Var, jy1VarA, l12Var, null), 3, null);
    }

    public i32(c4 c4Var, et2 et2Var, yx1 yx1Var) {
        this.f111850a = et2Var;
        this.f111851b = yx1Var;
        k32 k32Var = k32.f112571c;
        c4Var.e();
    }
}
