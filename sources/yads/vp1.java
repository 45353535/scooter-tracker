package yads;

import com.ironsource.N6;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vp1 {
    public static am2 a(cp1 cp1Var) {
        am2 am2Var = new am2(new LinkedHashMap(), 2);
        am2Var.b(cp1Var.f109504b, N6.G1);
        am2Var.b(cp1Var.f109505c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) cp1Var.f109505c.get("bidding_data");
        am2Var.b(Boolean.valueOf(!(charSequence == null || StringsKt.y0(charSequence))), "mediation_bidder");
        return am2Var;
    }
}
