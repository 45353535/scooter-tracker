package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM, "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DpKt {
    @Stable
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m3972DpOffsetYgX7TsA(float f10, float f11) {
        return DpOffset.m4007constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m3973DpSizeYgX7TsA(float f10, float f11) {
        return DpSize.m4040constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m3974coerceAtLeastYgX7TsA(float f10, float f11) {
        return Dp.m3951constructorimpl(g.d(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m3975coerceAtMostYgX7TsA(float f10, float f11) {
        return Dp.m3951constructorimpl(g.i(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m3976coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return Dp.m3951constructorimpl(g.m(f10, f11, f12));
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m3977getCenterEaSLcWc(long j10) {
        return m3972DpOffsetYgX7TsA(Dp.m3951constructorimpl(DpSize.m4049getWidthD9Ej5fM(j10) / 2.0f), Dp.m3951constructorimpl(DpSize.m4047getHeightD9Ej5fM(j10) / 2.0f));
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3978getCenterEaSLcWc$annotations(long j10) {
    }

    public static final float getDp(int i10) {
        return Dp.m3951constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m3951constructorimpl(dpRect.m4033getBottomD9Ej5fM() - dpRect.m4036getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m3973DpSizeYgX7TsA(Dp.m3951constructorimpl(dpRect.m4035getRightD9Ej5fM() - dpRect.m4034getLeftD9Ej5fM()), Dp.m3951constructorimpl(dpRect.m4033getBottomD9Ej5fM() - dpRect.m4036getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m3951constructorimpl(dpRect.m4035getRightD9Ej5fM() - dpRect.m4034getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m3979isFinite0680j_4(float f10) {
        return !(f10 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3980isFinite0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m3981isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3982isSpecified0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3983isSpecifiedEaSLcWc(long j10) {
        return j10 != DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3984isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3985isSpecifiedjoFl9I(long j10) {
        return j10 != DpOffset.INSTANCE.m4021getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3986isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m3987isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3988isUnspecified0680j_4$annotations(float f10) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3989isUnspecifiedEaSLcWc(long j10) {
        return j10 == DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3990isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3991isUnspecifiedjoFl9I(long j10) {
        return j10 == DpOffset.INSTANCE.m4021getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3992isUnspecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m3993lerpIDex15A(long j10, long j11, float f10) {
        return m3973DpSizeYgX7TsA(m3994lerpMdfbLM(DpSize.m4049getWidthD9Ej5fM(j10), DpSize.m4049getWidthD9Ej5fM(j11), f10), m3994lerpMdfbLM(DpSize.m4047getHeightD9Ej5fM(j10), DpSize.m4047getHeightD9Ej5fM(j11), f10));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m3994lerpMdfbLM(float f10, float f11, float f12) {
        return Dp.m3951constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m3995lerpxhh869w(long j10, long j11, float f10) {
        return m3972DpOffsetYgX7TsA(m3994lerpMdfbLM(DpOffset.m4012getXD9Ej5fM(j10), DpOffset.m4012getXD9Ej5fM(j11), f10), m3994lerpMdfbLM(DpOffset.m4014getYD9Ej5fM(j10), DpOffset.m4014getYD9Ej5fM(j11), f10));
    }

    @Stable
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m3996maxYgX7TsA(float f10, float f11) {
        return Dp.m3951constructorimpl(Math.max(f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m3997minYgX7TsA(float f10, float f11) {
        return Dp.m3951constructorimpl(Math.min(f10, f11));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m3998takeOrElseD5KLDUw(float f10, @NotNull Function0<Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return !Float.isNaN(f10) ? f10 : block.invoke().m3965unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m3999takeOrElsegVKV90s(long j10, @NotNull Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != DpOffset.INSTANCE.m4021getUnspecifiedRKDOV3M() ? j10 : block.invoke().getPackedValue();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m4000takeOrElseitqla9I(long j10, @NotNull Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ() ? j10 : block.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4002times3ABfNKs(float f10, float f11) {
        return Dp.m3951constructorimpl(f10 * f11);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4005times6HolHcs(int i10, long j10) {
        return DpSize.m4055timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d10) {
        return Dp.m3951constructorimpl((float) d10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4001times3ABfNKs(double d10, float f10) {
        return Dp.m3951constructorimpl(((float) d10) * f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4004times6HolHcs(float f10, long j10) {
        return DpSize.m4054timesGh9hcWk(j10, f10);
    }

    public static final float getDp(float f10) {
        return Dp.m3951constructorimpl(f10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4003times3ABfNKs(int i10, float f10) {
        return Dp.m3951constructorimpl(i10 * f10);
    }
}
