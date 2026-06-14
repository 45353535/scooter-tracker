package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class l42 implements td3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f112966a;

    public l42(c4 c4Var) {
        this.f112966a = c4Var;
    }

    @Override // yads.td3
    public final Map a() {
        String str = this.f112966a.f109196c.f110681a;
        if (str == null || StringsKt.y0(str)) {
            str = "undefined";
        }
        return MapsKt.mapOf(TuplesKt.to("ad_unit_id", str), TuplesKt.to("ad_type", this.f112966a.f109194a.f115230b));
    }
}
