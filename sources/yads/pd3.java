package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f114634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mr1 f114635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd3 f114636c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public od3 f114637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f114638f;

    public pd3(Context context, es2 es2Var, t9 t9Var, v5 v5Var) {
        this.f114634a = t9Var;
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this.f114635b = ve.a(context, pr3Var.b());
        this.f114636c = new nd3(v5Var);
    }

    public final void a(Map map) {
        Map mapEmptyMap = this.f114638f;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        map.putAll(mapEmptyMap);
        map.putAll(MapsKt.emptyMap());
        od3 od3Var = this.f114637e;
        Map mapEmptyMap2 = od3Var != null ? od3Var.a().f108722a : null;
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        map.putAll(mapEmptyMap2);
        xl2 xl2Var = xl2.f117866c;
        t9 t9Var = this.f114634a;
        this.f114635b.a(new zl2("video_ad_rendering_result", MapsKt.toMutableMap(map), t9Var != null ? t9Var.f116116i : null));
    }
}
