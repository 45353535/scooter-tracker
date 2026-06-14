package yads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo2 f117132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tz1 f117133b;

    public /* synthetic */ vn2() {
        this(new bo2(), new tz1());
    }

    public final am2 a(t9 t9Var, c4 c4Var) {
        String str;
        String str2;
        String str3;
        Map map;
        qz qzVar;
        am2 am2Var = new am2(new LinkedHashMap(), 2);
        if (t9Var == null || !t9Var.f116132y) {
            am2Var.b(t9Var != null ? t9Var.f116109b : null, "ad_type_format");
            am2Var.b(t9Var != null ? t9Var.f116111d : null, "product_type");
        }
        if (t9Var == null || (str = t9Var.f116112e) == null) {
            str = c4Var.f109196c.f110681a;
        }
        am2Var.b(str, "ad_unit_id");
        am2Var.b(t9Var != null ? t9Var.f116119l : null, FirebaseAnalytics.Param.AD_SOURCE);
        if (t9Var == null || (qzVar = t9Var.f116108a) == null || (str2 = qzVar.f115230b) == null) {
            str2 = c4Var.f109194a.f115230b;
        }
        am2Var.b(str2, "ad_type");
        am2Var.a(t9Var != null ? t9Var.f116118k : null, "design");
        List list = t9Var != null ? t9Var.f116115h : null;
        if (list != null && (!list.isEmpty())) {
            am2Var.f108722a.put("active_experiments", list);
        }
        am2Var.a(t9Var != null ? t9Var.f116122o : null, "server_log_id");
        this.f117132a.getClass();
        if ((t9Var != null ? t9Var.f116124q : null) != null) {
            str3 = "mediation";
        } else {
            str3 = (t9Var != null ? t9Var.f116127t : null) != null ? "ad" : "empty";
        }
        am2Var.b(str3, "response_type");
        if (t9Var != null && (map = t9Var.f116128u) != null) {
            am2Var.f108722a.putAll(map);
        }
        am2Var.f108723b = t9Var != null ? t9Var.f116116i : null;
        return am2Var;
    }

    public final am2 b(t9 t9Var, c4 c4Var) {
        List listEmptyList;
        am2 am2VarA = a(t9Var, c4Var);
        qz1 qz1Var = t9Var != null ? (qz1) t9Var.f116127t : null;
        if (qz1Var != null) {
            this.f117133b.getClass();
            listEmptyList = tz1.b(qz1Var);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        am2VarA.b(CollectionsKt.firstOrNull(listEmptyList), "ad_id");
        am2VarA.b(listEmptyList.isEmpty() ? null : listEmptyList, "ad_ids");
        return am2VarA;
    }

    public vn2(bo2 bo2Var, tz1 tz1Var) {
        this.f117132a = bo2Var;
        this.f117133b = tz1Var;
    }
}
