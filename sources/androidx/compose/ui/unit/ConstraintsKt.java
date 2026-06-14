package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {androidx.constraintlayout.widget.Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i10, int i11, int i12, int i13) {
        if (i11 < i10) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 >= 0 && i12 >= 0) {
            return Constraints.INSTANCE.m3926createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Constraints(i10, i11, i12, i13);
    }

    private static final int addMaxWithMinimum(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : g.e(i10 + i11, 0);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m3930constrain4WqzIAM(long j10, long j11) {
        return IntSizeKt.IntSize(g.n(IntSize.m4111getWidthimpl(j11), Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10)), g.n(IntSize.m4110getHeightimpl(j11), Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m3931constrainN9IONVI(long j10, long j11) {
        return Constraints(g.n(Constraints.m3921getMinWidthimpl(j11), Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10)), g.n(Constraints.m3919getMaxWidthimpl(j11), Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10)), g.n(Constraints.m3920getMinHeightimpl(j11), Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10)), g.n(Constraints.m3918getMaxHeightimpl(j11), Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m3932constrainHeightK40F9xA(long j10, int i10) {
        return g.n(i10, Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m3933constrainWidthK40F9xA(long j10, int i10) {
        return g.n(i10, Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m3934isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM3921getMinWidthimpl = Constraints.m3921getMinWidthimpl(j10);
        int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
        int iM4111getWidthimpl = IntSize.m4111getWidthimpl(j11);
        if (iM3921getMinWidthimpl > iM4111getWidthimpl || iM4111getWidthimpl > iM3919getMaxWidthimpl) {
            return false;
        }
        int iM3920getMinHeightimpl = Constraints.m3920getMinHeightimpl(j10);
        int iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
        int iM4110getHeightimpl = IntSize.m4110getHeightimpl(j11);
        return iM3920getMinHeightimpl <= iM4110getHeightimpl && iM4110getHeightimpl <= iM3918getMaxHeightimpl;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m3935offsetNN6EwU(long j10, int i10, int i11) {
        return Constraints(g.e(Constraints.m3921getMinWidthimpl(j10) + i10, 0), addMaxWithMinimum(Constraints.m3919getMaxWidthimpl(j10), i10), g.e(Constraints.m3920getMinHeightimpl(j10) + i11, 0), addMaxWithMinimum(Constraints.m3918getMaxHeightimpl(j10), i11));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m3936offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m3935offsetNN6EwU(j10, i10, i11);
    }
}
