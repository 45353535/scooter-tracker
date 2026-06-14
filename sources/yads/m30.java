package yads;

import com.taurusx.tax.y.z.w.s;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f113300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am2 f113301b;

    public m30(mr1 mr1Var, am2 am2Var) {
        this.f113300a = mr1Var;
        this.f113301b = am2Var;
    }

    public final void a(l30 l30Var) {
        this.f113301b.b(l30Var.f112938b, "log_type");
        xl2 xl2Var = xl2.f117866c;
        am2 am2Var = this.f113301b;
        Map map = am2Var.f108722a;
        this.f113300a.a(new zl2(s.z.f67719y, MapsKt.toMutableMap(map), am2Var.f108723b));
    }
}
