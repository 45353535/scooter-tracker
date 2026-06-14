package yads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ib {
    public static List a(l90 l90Var) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(i90.f111920a);
        listCreateListBuilder.add(new j90(LogConstants.EVENT_INFO));
        if (l90Var.f() == p40.f114547c && l90Var.a() != null) {
            String strD = l90Var.d();
            listCreateListBuilder.add(new k90((strD == null || StringsKt.y0(strD)) ? "ID" : l90Var.d(), l90Var.a()));
        }
        listCreateListBuilder.add(new k90("Type", l90Var.f().a()));
        List<q70> listE = l90Var.e();
        if (listE != null) {
            for (q70 q70Var : listE) {
                listCreateListBuilder.add(new k90(q70Var.a(), q70Var.b()));
            }
        }
        List listB = l90Var.b();
        if (listB != null && !listB.isEmpty()) {
            listCreateListBuilder.add(i90.f111920a);
            listCreateListBuilder.add(new j90("CPM floors"));
            String strD2 = l90Var.d();
            String str = (strD2 == null || StringsKt.y0(strD2)) ? "" : l90Var.d() + ": ";
            for (u90 u90Var : l90Var.b()) {
                listCreateListBuilder.add(new k90(str + u90Var.b(), "cpm: " + u90Var.a()));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
