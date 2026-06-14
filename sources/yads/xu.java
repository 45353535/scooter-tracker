package yads;

import android.content.Context;
import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f117966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f117967b;

    public xu(c4 c4Var, es2 es2Var) {
        this.f117966a = c4Var;
        this.f117967b = es2Var;
    }

    public final void a(Context context, qz qzVar, df2 df2Var, Long l10) {
        Map mapEmptyMap = MapsKt.emptyMap();
        if (!kotlin.jvm.internal.b1.q(mapEmptyMap)) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = new LinkedHashMap();
        }
        String str = "undefined";
        if (qzVar == null) {
            mapEmptyMap.put("ad_type", "undefined");
        } else {
            mapEmptyMap.put("ad_type", qzVar);
        }
        if (l10 == null) {
            mapEmptyMap.put("duration", "undefined");
        } else {
            mapEmptyMap.put("duration", l10);
        }
        LinkedHashMap linkedHashMapA = ff2.a(df2Var);
        mapEmptyMap.putAll(linkedHashMapA);
        String str2 = (String) linkedHashMapA.get(N6.G1);
        vn2 vn2Var = new vn2();
        l9 l9Var = new l9();
        c4 c4Var = this.f117966a;
        am2 am2VarB = vn2Var.b(null, c4Var);
        am2 am2VarA = l9Var.a(c4Var.f109198e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i10 = c4Var.f109208o;
        if (i10 == 1) {
            str = "portrait";
        } else if (i10 == 2) {
            str = "landscape";
        }
        linkedHashMap.put("orientation", str);
        am2 am2VarA2 = bm2.a(am2VarB, am2VarA);
        c cVar = am2VarA2.f108723b;
        if (cVar == null) {
            cVar = null;
        }
        am2 am2Var = new am2(MapsKt.plus(am2VarA2.f108722a, linkedHashMap), cVar);
        c cVar2 = am2Var.f108723b;
        Map mapPlus = MapsKt.plus(mapEmptyMap, am2Var.f108722a);
        if (!kotlin.jvm.internal.b1.q(mapPlus)) {
            mapPlus = null;
        }
        if (mapPlus == null) {
            mapPlus = new LinkedHashMap();
        }
        xl2 xl2Var = xl2.H;
        Map mutableMap = MapsKt.toMutableMap(mapPlus);
        zl2 zl2Var = new zl2("client_bidding_loading_result", mutableMap, cVar2);
        ((pr3) this.f117967b).getClass();
        wr3 wr3Var = wr3.f117545a;
        ((pr3) this.f117967b).getClass();
        ve.a(context, new in3()).a(zl2Var);
        new pe(context).a(xl2Var, mutableMap, str2, null);
    }
}
