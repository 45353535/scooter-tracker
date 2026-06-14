package yads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l01 extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn f112900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t83 f112901b;

    public l01(cs1 cs1Var, t83 t83Var) {
        this.f112900a = cs1Var;
        this.f112901b = t83Var;
    }

    @Override // yads.zn
    public final j01 a(km2 km2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        f01 f01Var = f01.f110544c;
        map2.put("User-Agent", ((x23) this.f112901b.f116107a).a());
        return this.f112900a.a(km2Var, map2);
    }
}
