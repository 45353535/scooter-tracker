package yads;

import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ff2 {
    public static LinkedHashMap a(df2 df2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(N6.G1, df2Var.f109906a);
        lf2 lf2Var = df2Var.f109907b;
        if (lf2Var != null) {
            linkedHashMap.put("winner_name", lf2Var.f113084a);
            linkedHashMap.put("winner_ad_unit", lf2Var.f113085b);
        }
        String lowerCase = df2Var.f109909d.f117004a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer num = df2Var.f109909d.f117006c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        String str = df2Var.f109909d.f117005b;
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
