package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"!\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OffsetKt {
    @Stable
    public static final long Offset(float f10, float f11) {
        return Offset.m1363constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m1388isFinitek4lQ0M(long j10) {
        float fM1371getXimpl = Offset.m1371getXimpl(j10);
        if (Float.isInfinite(fM1371getXimpl) || Float.isNaN(fM1371getXimpl)) {
            return false;
        }
        float fM1372getYimpl = Offset.m1372getYimpl(j10);
        return (Float.isInfinite(fM1372getYimpl) || Float.isNaN(fM1372getYimpl)) ? false : true;
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1389isFinitek4lQ0M$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1390isSpecifiedk4lQ0M(long j10) {
        return j10 != Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1391isSpecifiedk4lQ0M$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m1392isUnspecifiedk4lQ0M(long j10) {
        return j10 == Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m1393isUnspecifiedk4lQ0M$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m1394lerpWko1d7g(long j10, long j11, float f10) {
        return Offset(MathHelpersKt.lerp(Offset.m1371getXimpl(j10), Offset.m1371getXimpl(j11), f10), MathHelpersKt.lerp(Offset.m1372getYimpl(j10), Offset.m1372getYimpl(j11), f10));
    }

    /* JADX INFO: renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m1395takeOrElse3MmeM6k(long j10, @NotNull Function0<Offset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m1390isSpecifiedk4lQ0M(j10) ? j10 : block.invoke().getPackedValue();
    }
}
