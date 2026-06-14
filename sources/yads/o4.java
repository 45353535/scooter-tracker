package yads;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o4 {
    public static final void a(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String str2 = String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, CollectionsKt.joinToString$default(arrayList, "\n - ", "\n - ", null, 0, null, null, 60, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        wa1.a(str2, new Object[0]);
    }

    public static final void a(String str) {
        String str2 = String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        wa1.b(str2, new Object[0]);
    }
}
