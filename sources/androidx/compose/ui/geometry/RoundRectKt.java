package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f14, f15);
        return new RoundRect(f10, f11, f12, f13, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m1423RoundRectZAM2FJo(@NotNull Rect rect, long j10, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m1425RoundRectgG7oq9Y(float f10, float f11, float f12, float f13, long j10) {
        return RoundRect(f10, f11, f12, f13, CornerRadius.m1346getXimpl(j10), CornerRadius.m1347getYimpl(j10));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m1426RoundRectsniSvfs(@NotNull Rect rect, long j10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m1346getXimpl(j10), CornerRadius.m1347getYimpl(j10));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m1346getXimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m1347getYimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m1347getYimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m1346getXimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()), CornerRadius.m1346getXimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m1347getYimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m1347getYimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1347getYimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1347getYimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m1347getYimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m1347getYimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if (Float.isInfinite(left) || Float.isNaN(left)) {
            return false;
        }
        float top = roundRect.getTop();
        if (Float.isInfinite(top) || Float.isNaN(top)) {
            return false;
        }
        float right = roundRect.getRight();
        if (Float.isInfinite(right) || Float.isNaN(right)) {
            return false;
        }
        float bottom = roundRect.getBottom();
        return (Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true;
    }

    public static final boolean isRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) != 0.0f && CornerRadius.m1347getYimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (CornerRadius.m1346getXimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) != 0.0f && CornerRadius.m1347getYimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (CornerRadius.m1346getXimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m1347getYimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
            return CornerRadius.m1346getXimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m1347getYimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) == 0.0f;
        }
        return false;
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1422getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1420getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1346getXimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m1346getXimpl(roundRect.m1421getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1347getYimpl(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs());
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f10), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f10), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f10), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f10), CornerRadiusKt.m1357lerp3Ry4LBc(start.m1421getTopLeftCornerRadiuskKHJgLs(), stop.m1421getTopLeftCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1357lerp3Ry4LBc(start.m1422getTopRightCornerRadiuskKHJgLs(), stop.m1422getTopRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1357lerp3Ry4LBc(start.m1420getBottomRightCornerRadiuskKHJgLs(), stop.m1420getBottomRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m1357lerp3Ry4LBc(start.m1419getBottomLeftCornerRadiuskKHJgLs(), stop.m1419getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    @NotNull
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m1427translateUv8p0NA(@NotNull RoundRect translate, long j10) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(Offset.m1371getXimpl(j10) + translate.getLeft(), Offset.m1372getYimpl(j10) + translate.getTop(), Offset.m1371getXimpl(j10) + translate.getRight(), Offset.m1372getYimpl(j10) + translate.getBottom(), translate.m1421getTopLeftCornerRadiuskKHJgLs(), translate.m1422getTopRightCornerRadiuskKHJgLs(), translate.m1420getBottomRightCornerRadiuskKHJgLs(), translate.m1419getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f10, float f11) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11);
    }
}
