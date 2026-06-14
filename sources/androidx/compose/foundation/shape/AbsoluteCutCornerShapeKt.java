package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"AbsoluteCutCornerShape", "Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "AbsoluteCutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteCutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "", "percent", "", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AbsoluteCutCornerShapeKt {
    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new AbsoluteCutCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return AbsoluteCutCornerShape(f10, f11, f12, f13);
    }

    @NotNull
    /* JADX INFO: renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m674AbsoluteCutCornerShape0680j_4(float f10) {
        return AbsoluteCutCornerShape(CornerSizeKt.m682CornerSize0680j_4(f10));
    }

    @NotNull
    /* JADX INFO: renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m675AbsoluteCutCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m682CornerSize0680j_4(f10), CornerSizeKt.m682CornerSize0680j_4(f11), CornerSizeKt.m682CornerSize0680j_4(f12), CornerSizeKt.m682CornerSize0680j_4(f13));
    }

    /* JADX INFO: renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m676AbsoluteCutCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.m3951constructorimpl(0);
        }
        return m675AbsoluteCutCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f10) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f10));
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return AbsoluteCutCornerShape(i10, i11, i12, i13);
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i10) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i10));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f10, float f11, float f12, float f13) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i10, int i11, int i12, int i13) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
