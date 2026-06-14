package yads;

import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f117199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f117200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx1 f117201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm2 f117202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cx f117203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pe f117204f;

    public vu(t9 t9Var, c4 c4Var, mx1 mx1Var, dm2 dm2Var, cx cxVar, pe peVar) {
        this.f117199a = t9Var;
        this.f117200b = c4Var;
        this.f117201c = mx1Var;
        this.f117202d = dm2Var;
        this.f117203e = cxVar;
        this.f117204f = peVar;
    }

    public final zl2 a(xl2 xl2Var, Map map) {
        if (!kotlin.jvm.internal.b1.q(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = wl2.f117511a;
        if (str == null) {
            map.put(N6.G1, "undefined");
        } else {
            map.put(N6.G1, str);
        }
        am2 am2VarA = this.f117203e.a(this.f117199a, this.f117200b);
        c cVar = am2VarA.f108723b;
        Map mapPlus = MapsKt.plus(map, am2VarA.f108722a);
        Map linkedHashMap = kotlin.jvm.internal.b1.q(mapPlus) ? mapPlus : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        mx2 mx2Var = this.f117200b.f109197d.f114071a;
        if (mx2Var != null) {
            String str2 = mx2Var.a().f113267b;
            if (str2 == null) {
                linkedHashMap.put("size_type", "undefined");
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(mx2Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(mx2Var.getHeight()));
        }
        mx1 mx1Var = this.f117201c;
        if (mx1Var != null) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("asset_name", mx1Var.f113642a);
            mapCreateMapBuilder.put("action_type", mx1Var.f113643b);
            v02 v02Var = mx1Var.f113644c;
            if (v02Var != null) {
                mapCreateMapBuilder.putAll(v02Var.a().f108722a);
            }
            linkedHashMap.putAll(MapsKt.build(mapCreateMapBuilder));
        }
        return new zl2(xl2Var.f117890b, MapsKt.toMutableMap(linkedHashMap), cVar);
    }
}
