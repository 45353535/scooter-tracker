package yads;

import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f118716a = MapsKt.mapOf(TuplesKt.to(d93.f109845c, "No ad view"), TuplesKt.to(d93.f109846d, "No valid ads in ad unit"), TuplesKt.to(d93.f109847e, "Ad is not visible for percent"), TuplesKt.to(d93.f109848f, "Required asset %s is not visible in ad view"), TuplesKt.to(d93.f109849g, "Ad view is null"), TuplesKt.to(d93.f109850h, "Ad view is hidden"), TuplesKt.to(d93.f109851i, "Visible area of an ad view is too small"));

    public static String a(h93 h93Var) {
        if (!(h93Var instanceof e93)) {
            return "Unknown error, that shouldn't happen";
        }
        e93 e93Var = (e93) h93Var;
        String str = e93Var.f110268b;
        String str2 = (String) f118716a.get(e93Var.f110267a);
        if (str2 == null) {
            return "Visibility error";
        }
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }
}
