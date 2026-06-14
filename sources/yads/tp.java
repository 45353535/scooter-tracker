package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f116313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f116314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aj f116315c;

    public /* synthetic */ tp(n5 n5Var, qz qzVar, t9 t9Var, String str, mr1 mr1Var) {
        this(t9Var, mr1Var, new aj(n5Var, qzVar, str));
    }

    public final void a(String str) {
        am2 am2VarA = this.f116315c.a();
        am2VarA.b("no_view_for_asset", "reason");
        am2VarA.b(str, "asset_name");
        Map map = this.f116313a.f116128u;
        if (map != null) {
            am2VarA.f108722a.putAll(map);
        }
        c cVar = this.f116313a.f116116i;
        am2VarA.f108723b = cVar;
        this.f116314b.a(new zl2(xl2.f117889z.a(), MapsKt.toMutableMap(am2VarA.f108722a), cVar));
    }

    public tp(t9 t9Var, mr1 mr1Var, aj ajVar) {
        this.f116313a = t9Var;
        this.f116314b = mr1Var;
        this.f116315c = ajVar;
    }
}
