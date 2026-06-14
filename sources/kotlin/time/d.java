package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class d {
    public static final double a(double d10, cg.b sourceUnit, cg.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.g().convert(1L, sourceUnit.g());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.g().convert(1L, targetUnit.g());
    }

    public static final long b(long j10, cg.b sourceUnit, cg.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.g().convert(j10, sourceUnit.g());
    }

    public static final long c(long j10, cg.b sourceUnit, cg.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.g().convert(j10, sourceUnit.g());
    }
}
