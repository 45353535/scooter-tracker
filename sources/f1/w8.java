package f1;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w8 {
    public static final String a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return (str == null || str.length() == 0) ? (str2 == null || str2.length() == 0) ? "" : str2 : str;
        }
        return str + " " + str2;
    }

    public static final Map b(e8 e8Var) {
        Intrinsics.checkNotNullParameter(e8Var, "<this>");
        b1.e mediation = e8Var.getMediation();
        String str = mediation != null ? mediation.f5794a : null;
        if (str == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("CB_MEDIATOR_NAME", str);
        b1.e mediation2 = e8Var.getMediation();
        String str2 = mediation2 != null ? mediation2.f5795b : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = TuplesKt.to("CB_MEDIATOR_SDK_VERSION", str2);
        b1.e mediation3 = e8Var.getMediation();
        String str3 = mediation3 != null ? mediation3.f5796c : null;
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_MEDIATOR_ADAPTER_VERSION", str3 != null ? str3 : ""));
    }
}
