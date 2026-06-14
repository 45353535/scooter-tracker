package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jh2 {
    public static String a(long j10) {
        long jCeil = (long) Math.ceil(j10 / 1000);
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
