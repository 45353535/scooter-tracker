package yads;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.N6;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class uq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f116740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f116741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9 f116742c;

    public uq2(c4 c4Var, es2 es2Var) {
        l9 l9Var = new l9();
        new vn2();
        new l9();
        new iy();
        this(c4Var, es2Var, l9Var);
    }

    public final void a(Context context, t9 t9Var, xl2 xl2Var, am2 am2Var) {
        rw1 rw1Var;
        xn2 xn2Var;
        am2 am2VarA = this.f116742c.a(this.f116740a.f109198e);
        am2VarA.b(t9Var.f116112e, "ad_unit_id");
        String str = wl2.f117511a;
        am2VarA.b(str, N6.G1);
        qz qzVar = t9Var.f116108a;
        am2VarA.b(qzVar != null ? qzVar.f115230b : null, "ad_type");
        qz1 qz1Var = (qz1) t9Var.f116127t;
        if (qz1Var != null) {
            List list = qz1Var.f115232a;
            String str2 = (list == null || (rw1Var = (rw1) CollectionsKt.firstOrNull(list)) == null || (xn2Var = rw1Var.f115623a) == null) ? null : xn2Var.f117917b;
            if (str2 == null) {
                str2 = "";
            }
            am2VarA.b(str2, "native_ad_type");
        }
        am2VarA.b(t9Var.f116119l, FirebaseAnalytics.Param.AD_SOURCE);
        am2 am2VarA2 = bm2.a(am2VarA, am2Var);
        Map map = am2VarA2.f108722a;
        c cVar = am2VarA2.f108723b;
        String str3 = xl2Var.f117890b;
        Map mutableMap = MapsKt.toMutableMap(map);
        zl2 zl2Var = new zl2(str3, mutableMap, cVar);
        ((pr3) this.f116741b).getClass();
        wr3 wr3Var = wr3.f117545a;
        ((pr3) this.f116741b).getClass();
        ve.a(context, new in3()).a(zl2Var);
        new pe(context).a(xl2Var, mutableMap, str, null);
    }

    public uq2(c4 c4Var, es2 es2Var, l9 l9Var) {
        this.f116740a = c4Var;
        this.f116741b = es2Var;
        this.f116742c = l9Var;
    }

    public final void a(Context context, t9 t9Var, q02 q02Var) {
        Map mapEmptyMap;
        am2 am2Var = new am2((Map) null, 3);
        if (q02Var != null) {
            List list = q02Var.f114840a.f109195b.f108852c;
            List list2 = list.isEmpty() ? null : list;
            if (list2 == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("image_sizes", CollectionsKt.toList(list2)))) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            am2Var.f108722a.putAll(mapEmptyMap);
        }
        a(context, t9Var, xl2.f117870g, am2Var);
    }

    public final void a(Context context, t9 t9Var, r02 r02Var) {
        am2 am2Var = new am2((Map) null, 3);
        yl2 yl2Var = yl2.f118285c;
        am2Var.b("success", "status");
        a(context, t9Var, xl2.f117871h, am2Var);
    }
}
