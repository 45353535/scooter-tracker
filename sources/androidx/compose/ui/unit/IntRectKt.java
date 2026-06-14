package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntRectKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m4100IntRectE1MhUcY(long j10, long j11) {
        return new IntRect(IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10), IntOffset.m4069getXimpl(j11), IntOffset.m4070getYimpl(j11));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m4101IntRectVbeCjmY(long j10, long j11) {
        return new IntRect(IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10), IntOffset.m4069getXimpl(j10) + IntSize.m4111getWidthimpl(j11), IntOffset.m4070getYimpl(j10) + IntSize.m4110getHeightimpl(j11));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m4102IntRectar5cAso(long j10, int i10) {
        return new IntRect(IntOffset.m4069getXimpl(j10) - i10, IntOffset.m4070getYimpl(j10) - i10, IntOffset.m4069getXimpl(j10) + i10, IntOffset.m4070getYimpl(j10) + i10);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect start, @NotNull IntRect stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new IntRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f10), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f10), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f10), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f10));
    }

    @Stable
    @NotNull
    public static final IntRect roundToIntRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new IntRect(zf.a.d(rect.getLeft()), zf.a.d(rect.getTop()), zf.a.d(rect.getRight()), zf.a.d(rect.getBottom()));
    }

    @Stable
    @NotNull
    public static final Rect toRect(@NotNull IntRect intRect) {
        Intrinsics.checkNotNullParameter(intRect, "<this>");
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
