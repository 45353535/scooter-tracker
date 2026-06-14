package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i10, int i11) {
        return IntOffset.m4063constructorimpl((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m4080lerp81ZRxRo(long j10, long j11, float f10) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m4069getXimpl(j10), IntOffset.m4069getXimpl(j11), f10), MathHelpersKt.lerp(IntOffset.m4070getYimpl(j10), IntOffset.m4070getYimpl(j11), f10));
    }

    @Stable
    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m4081minusNvtHpc(long j10, long j11) {
        return OffsetKt.Offset(Offset.m1371getXimpl(j10) - IntOffset.m4069getXimpl(j11), Offset.m1372getYimpl(j10) - IntOffset.m4070getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m4082minusoCl6YwE(long j10, long j11) {
        return OffsetKt.Offset(IntOffset.m4069getXimpl(j10) - Offset.m1371getXimpl(j11), IntOffset.m4070getYimpl(j10) - Offset.m1372getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m4083plusNvtHpc(long j10, long j11) {
        return OffsetKt.Offset(Offset.m1371getXimpl(j10) + IntOffset.m4069getXimpl(j11), Offset.m1372getYimpl(j10) + IntOffset.m4070getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m4084plusoCl6YwE(long j10, long j11) {
        return OffsetKt.Offset(IntOffset.m4069getXimpl(j10) + Offset.m1371getXimpl(j11), IntOffset.m4070getYimpl(j10) + Offset.m1372getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m4085roundk4lQ0M(long j10) {
        return IntOffset(zf.a.d(Offset.m1371getXimpl(j10)), zf.a.d(Offset.m1372getYimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m4086toOffsetgyyYBs(long j10) {
        return OffsetKt.Offset(IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10));
    }
}
