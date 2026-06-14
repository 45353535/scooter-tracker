package yads;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sm3 implements an2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td3 f115878a;

    public sm3(td3 td3Var) {
        this.f115878a = td3Var;
    }

    @Override // yads.an2
    public final zl2 a(Object obj) {
        Map mapA = this.f115878a.a();
        xl2 xl2Var = xl2.f117866c;
        return new zl2("vast_wrapper_request", MapsKt.toMutableMap(mapA), null);
    }

    @Override // yads.an2
    public final zl2 a(qn2 qn2Var, int i10, Object obj) {
        yl2 yl2Var;
        List list = qn2Var != null ? (List) qn2Var.f115100a : null;
        if (204 == i10) {
            yl2Var = yl2.f118287e;
        } else if (list != null && i10 == 200) {
            yl2Var = list.isEmpty() ? yl2.f118287e : yl2.f118285c;
        } else {
            yl2Var = yl2.f118286d;
        }
        Map mapPlus = MapsKt.plus(this.f115878a.a(), MapsKt.mapOf(TuplesKt.to("status", yl2Var.f118289b)));
        xl2 xl2Var = xl2.f117866c;
        return new zl2("vast_wrapper_response", MapsKt.toMutableMap(mapPlus), null);
    }
}
