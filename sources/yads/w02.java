package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w02 {
    public static Float a(String str) {
        if (str != null) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
                Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
                boolean z10 = lb1.f113032a;
            }
        }
        return null;
    }
}
