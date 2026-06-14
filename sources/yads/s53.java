package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class s53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f115705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f115706b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s53(Context context, c4 c4Var, es2 es2Var) {
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this(c4Var, ve.a(context, pr3Var.b()));
    }

    public final void a(Map map, hr2 hr2Var) {
        xl2 xl2Var = xl2.f117866c;
        if (hr2Var == null || !hr2Var.f111760w0) {
            return;
        }
        c4 c4Var = this.f115705a;
        Pair pair = TuplesKt.to("ad_type", c4Var.f109194a.f115230b);
        String str = c4Var.f109196c.f110681a;
        if (str == null) {
            str = "";
        }
        this.f115706b.a(new zl2("tracking_event", MapsKt.toMutableMap(MapsKt.plus(MapsKt.mapOf(pair, TuplesKt.to("ad_unit_id", str)), map)), null));
    }

    public s53(c4 c4Var, dm2 dm2Var) {
        this.f115705a = c4Var;
        this.f115706b = dm2Var;
    }
}
