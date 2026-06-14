package yads;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ms1 {
    public static ls1 a(Context context) {
        yr1 yr1Var = new yr1(new db3());
        e2 e2Var = new e2();
        sg sgVar = new sg();
        fa1 e10 = null;
        try {
            yr1Var.a(hs1.f111772b);
            e = null;
        } catch (fa1 e11) {
            e = e11;
        }
        try {
            e2Var.a(context);
            e = null;
        } catch (fa1 e12) {
            e = e12;
        }
        try {
            ua2.a(context);
            e = null;
        } catch (fa1 e13) {
            e = e13;
        }
        try {
            sgVar.a();
        } catch (fa1 e14) {
            e10 = e14;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new fa1[]{e, e, e, e10});
        return !listListOfNotNull.isEmpty() ? new ks1(listListOfNotNull) : js1.f112447a;
    }
}
