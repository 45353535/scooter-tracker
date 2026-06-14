package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.taurusx.tax.y.z.w.s;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Wc {
    public static final List a(Sg sg2) {
        Intrinsics.checkNotNullParameter(sg2, "<this>");
        return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(sg2.f37730b, (short) 0), TuplesKt.to(sg2.f37729a.getTitleView(), (short) 3), TuplesKt.to(sg2.f37729a.getDescriptionView(), (short) 4), TuplesKt.to(sg2.f37729a.getIconView(), (short) 5), TuplesKt.to(sg2.f37729a.getCtaView(), (short) 6), TuplesKt.to(sg2.f37731c, (short) 7), TuplesKt.to(sg2.f37729a.getRatingView(), (short) 8), TuplesKt.to(sg2.f37729a.getAdvertiserView(), (short) 9)});
    }

    public static final void a(Sg sg2, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(sg2, "<this>");
        Intrinsics.checkNotNullParameter("NativeRenderedState", s.z.f67720z);
        if (interfaceC3878m9 == null) {
            return;
        }
        List<Pair> listA = a(sg2);
        ViewGroup parentView = sg2.f37729a.getParentView();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : listA) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null) {
                boolean z10 = view.getVisibility() == 0;
                jSONArray.put(((int) sShortValue) + " - " + z10 + " " + AbstractC4116vn.a(view, parentView));
            }
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ((C3903n9) interfaceC3878m9).a("NativeRenderedState", string);
    }
}
