package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q9 {
    public static String a(String str, String str2) {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str3 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }
}
