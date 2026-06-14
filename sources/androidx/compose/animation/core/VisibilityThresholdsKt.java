package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\".\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u0013*\u00020\u00128Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014\"\u0015\u0010\u0011\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017\"\u0018\u0010\u0011\u001a\u00020\u0019*\u00020\u00188Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001a\"\u0018\u0010\u0011\u001a\u00020\u001c*\u00020\u001b8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001d\"\u0018\u0010\u0011\u001a\u00020\u001f*\u00020\u001e8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010 \"\u0018\u0010\u0011\u001a\u00020\"*\u00020!8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010#\"\u0015\u0010\u0011\u001a\u00020\u0004*\u00020$8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"", "DpVisibilityThreshold", "F", "PxVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "rectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/a0;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;

    @NotNull
    private static final Rect rectVisibilityThreshold;

    @NotNull
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a0.f93281a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = TuplesKt.to(vectorConverter, fValueOf2);
        Pair pair2 = TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf2);
        Pair pair3 = TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf2);
        Pair pair4 = TuplesKt.to(VectorConvertersKt.getVectorConverter(u.f93332a), Float.valueOf(0.01f));
        Pair pair5 = TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf);
        Pair pair6 = TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf);
        Pair pair7 = TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        visibilityThresholdMap = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to(vectorConverter2, fValueOf3), TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.INSTANCE), fValueOf3));
    }

    public static final int getVisibilityThreshold(@NotNull a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return 1;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Dp.Companion companion2 = Dp.INSTANCE;
        return DpKt.m3972DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntSizeKt.IntSize(1, 1);
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return rectVisibilityThreshold;
    }

    public static final float getVisibilityThreshold(@NotNull Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return Dp.m3951constructorimpl(0.1f);
    }
}
