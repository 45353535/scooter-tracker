package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class h9 implements zm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f111519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9 f111520b = new l9();

    public h9(c4 c4Var) {
        this.f111519a = c4Var;
    }

    @Override // yads.zm2
    public final Map a() {
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("ad_type", this.f111519a.f109194a.f115230b));
        String str = this.f111519a.f109196c.f110681a;
        if (str != null) {
            mapMutableMapOf.put("ad_unit_id", str);
        }
        mapMutableMapOf.putAll(this.f111520b.a(this.f111519a.f109198e).f108722a);
        return mapMutableMapOf;
    }
}
