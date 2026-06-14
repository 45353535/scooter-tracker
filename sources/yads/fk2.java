package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f110750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f110751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aj f110752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110753d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fk2(Context context, es2 es2Var, n5 n5Var, qz qzVar, t9 t9Var, String str) {
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this(n5Var, qzVar, t9Var, str, ve.a(context, pr3Var.b()));
    }

    public final void a() {
        if (this.f110753d) {
            this.f110753d = false;
            return;
        }
        am2 am2VarA = this.f110752c.a();
        Map map = this.f110750a.f116128u;
        if (map != null) {
            am2VarA.f108722a.putAll(map);
        }
        c cVar = this.f110750a.f116116i;
        am2VarA.f108723b = cVar;
        this.f110751b.a(new zl2(xl2.f117888y.a(), MapsKt.toMutableMap(am2VarA.f108722a), cVar));
    }

    public fk2(n5 n5Var, qz qzVar, t9 t9Var, String str, dm2 dm2Var) {
        this.f110750a = t9Var;
        this.f110751b = dm2Var;
        this.f110752c = new aj(n5Var, qzVar, str);
        this.f110753d = true;
    }
}
