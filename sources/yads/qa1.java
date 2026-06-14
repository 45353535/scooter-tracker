package yads;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qa1 implements xj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yn2 f114900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.json.b f114901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj3 f114902c;

    public qa1(u13 u13Var, kotlinx.serialization.json.b bVar, sj3 sj3Var) {
        this.f114900a = u13Var;
        this.f114901b = bVar;
        this.f114902c = sj3Var;
    }

    @Override // yads.xj3
    public final Object a(r62 r62Var) {
        this.f114902c.getClass();
        int i10 = r62Var.f115340a;
        sn2 sn2Var = new sn2(r62Var.f115341b);
        Map mapEmptyMap = r62Var.f115342c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        String str = (String) this.f114900a.a(new rn2(i10, sn2Var, mapEmptyMap));
        if (str == null || StringsKt.y0(str)) {
            return null;
        }
        kotlinx.serialization.json.b bVar = this.f114901b;
        bVar.a();
        return (w70) bVar.c(w70.Companion.serializer(), str);
    }
}
