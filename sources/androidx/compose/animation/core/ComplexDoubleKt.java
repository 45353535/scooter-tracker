package androidx.compose.animation.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n¨\u0006\r"}, d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "a", "", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d10, double d11, double d12) {
        double d13 = -d11;
        double d14 = (d11 * d11) - ((4.0d * d10) * d12);
        ComplexDouble complexDoubleComplexSqrt = complexSqrt(d14);
        complexDoubleComplexSqrt._real += d13;
        double d15 = d10 * 2.0d;
        complexDoubleComplexSqrt._real /= d15;
        complexDoubleComplexSqrt._imaginary /= d15;
        ComplexDouble complexDoubleComplexSqrt2 = complexSqrt(d14);
        double d16 = -1;
        complexDoubleComplexSqrt2._real *= d16;
        complexDoubleComplexSqrt2._imaginary *= d16;
        complexDoubleComplexSqrt2._real += d13;
        complexDoubleComplexSqrt2._real /= d15;
        complexDoubleComplexSqrt2._imaginary /= d15;
        return TuplesKt.to(complexDoubleComplexSqrt, complexDoubleComplexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d10) {
        return d10 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d10))) : new ComplexDouble(Math.sqrt(d10), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d10, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d11 = -1;
        other._real *= d11;
        other._imaginary *= d11;
        other._real += d10;
        return other;
    }

    @NotNull
    public static final ComplexDouble plus(double d10, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real += d10;
        return other;
    }

    @NotNull
    public static final ComplexDouble times(double d10, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real *= d10;
        other._imaginary *= d10;
        return other;
    }
}
