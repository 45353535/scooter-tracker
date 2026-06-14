package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0019\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\"\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SizeKt {
    @Stable
    public static final long Size(float f10, float f11) {
        return Size.m1431constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m1450getCenteruvyYCjk(long j10) {
        return OffsetKt.Offset(Size.m1440getWidthimpl(j10) / 2.0f, Size.m1437getHeightimpl(j10) / 2.0f);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1451getCenteruvyYCjk$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1452isSpecifieduvyYCjk(long j10) {
        return j10 != Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1453isSpecifieduvyYCjk$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1454isUnspecifieduvyYCjk(long j10) {
        return j10 == Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1455isUnspecifieduvyYCjk$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m1456lerpVgWVRYQ(long j10, long j11, float f10) {
        return Size(MathHelpersKt.lerp(Size.m1440getWidthimpl(j10), Size.m1440getWidthimpl(j11), f10), MathHelpersKt.lerp(Size.m1437getHeightimpl(j10), Size.m1437getHeightimpl(j11), f10));
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m1457takeOrElseTmRCtEA(long j10, @NotNull Function0<Size> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != Size.INSTANCE.m1448getUnspecifiedNHjbRc() ? j10 : block.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1460timesd16Qtg0(int i10, long j10) {
        return Size.m1443times7Ah8Wj8(j10, i10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m1461toRectuvyYCjk(long j10) {
        return RectKt.m1411Recttz77jQw(Offset.INSTANCE.m1387getZeroF1C5BW0(), j10);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1458timesd16Qtg0(double d10, long j10) {
        return Size.m1443times7Ah8Wj8(j10, (float) d10);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1459timesd16Qtg0(float f10, long j10) {
        return Size.m1443times7Ah8Wj8(j10, f10);
    }
}
