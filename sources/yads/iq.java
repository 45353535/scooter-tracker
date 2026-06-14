package yads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class iq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f112082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f112083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hq f112084c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iq(es2 es2Var) {
        pr3 pr3Var = (pr3) es2Var;
        this(es2Var, pr3Var.a(), new hq(pr3Var.c()));
    }

    public final boolean a(Context context, t9 t9Var, x9 x9Var, c4 c4Var, String str) {
        Object obj = z1.f118487b;
        z1 z1VarA = y1.a();
        long jA = j11.a();
        Intent intentA = this.f112084c.a(context, str, jA);
        z1VarA.a(jA, new x1(t9Var, c4Var, x9Var, this.f112082a, null, 0, null, 112));
        try {
            context.startActivity(intentA);
            return true;
        } catch (Exception e10) {
            z1VarA.a(jA);
            e10.toString();
            boolean z10 = lb1.f113032a;
            this.f112083b.reportError("Failed to show Browser", e10);
            return false;
        }
    }

    public iq(es2 es2Var, dm2 dm2Var, hq hqVar) {
        this.f112082a = es2Var;
        this.f112083b = dm2Var;
        this.f112084c = hqVar;
    }
}
