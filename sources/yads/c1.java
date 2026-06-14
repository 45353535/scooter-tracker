package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f109171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f109172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9 f109173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cx f109174d;

    public /* synthetic */ c1(mr1 mr1Var, c4 c4Var, t9 t9Var) {
        this(mr1Var, c4Var, t9Var, new cx());
    }

    public final void a(String str) {
        Object obj;
        am2 am2VarA = this.f109174d.a(this.f109173c, this.f109172b);
        td2 td2Var = (td2) vd2.f116977a.getValue();
        if (td2Var != null) {
            int iOrdinal = td2Var.ordinal();
            if (iOrdinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (iOrdinal == 1) {
                obj = "react-native";
            } else {
                if (iOrdinal != 2) {
                    throw new lf.m();
                }
                obj = "unity";
            }
        } else {
            obj = am2VarA.f108722a.get("plugin_type");
        }
        xl2 xl2Var = xl2.f117866c;
        this.f109171a.a(new zl2("activity_action", MapsKt.toMutableMap(MapsKt.plus(am2VarA.f108722a, MapsKt.mapOf(TuplesKt.to("activity_event", str), TuplesKt.to("plugin_type", obj)))), am2VarA.f108723b));
    }

    public final void b() {
        a("on_resume");
    }

    public c1(mr1 mr1Var, c4 c4Var, t9 t9Var, cx cxVar) {
        this.f109171a = mr1Var;
        this.f109172b = c4Var;
        this.f109173c = t9Var;
        this.f109174d = cxVar;
    }

    public final void a() {
        a("on_pause");
    }
}
