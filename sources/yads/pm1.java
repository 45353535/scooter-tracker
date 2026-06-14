package yads;

import android.content.Context;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class pm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f114711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f114712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f114713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xm1 f114714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jn1 f114715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qm1 f114716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fa2 f114717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final en1 f114718h;

    public /* synthetic */ pm1(c4 c4Var, es2 es2Var, v5 v5Var, xm1 xm1Var, jn1 jn1Var, qm1 qm1Var, fa2 fa2Var) {
        this(c4Var, es2Var, v5Var, xm1Var, jn1Var, qm1Var, fa2Var, new en1());
    }

    public final void a(Context context) {
    }

    public final void a(Context context, Object obj) {
        this.f114716f.a(context);
        fa2 fa2Var = this.f114717g;
        gk2 gk2Var = fa2Var.f110680b;
        KProperty kProperty = fa2.f110678c[0];
        rn rnVar = (rn) gk2Var.f111244a.get();
        if (rnVar == null || rnVar.f115522r == y5.f118084b) {
            return;
        }
        ga2 ga2Var = fa2Var.f110679a;
        rnVar.a(y5.f118086d);
        synchronized (rnVar) {
            eg.i.d(rnVar.f115509e, null, null, new in(rnVar, ga2Var, null), 3, null);
        }
    }

    public pm1(c4 c4Var, es2 es2Var, v5 v5Var, xm1 xm1Var, jn1 jn1Var, qm1 qm1Var, fa2 fa2Var, en1 en1Var) {
        this.f114711a = c4Var;
        this.f114712b = es2Var;
        this.f114713c = v5Var;
        this.f114714d = xm1Var;
        this.f114715e = jn1Var;
        this.f114716f = qm1Var;
        this.f114717g = fa2Var;
        this.f114718h = en1Var;
    }
}
