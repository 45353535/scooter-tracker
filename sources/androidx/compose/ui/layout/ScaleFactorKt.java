package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a+\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f10, float f11) {
        return ScaleFactor.m3059constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m3073divUQTWf7w(long j10, long j11) {
        return SizeKt.Size(Size.m1440getWidthimpl(j10) / ScaleFactor.m3065getScaleXimpl(j11), Size.m1437getHeightimpl(j10) / ScaleFactor.m3066getScaleYimpl(j11));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3074isSpecifiedFK8aYYs(long j10) {
        return j10 != ScaleFactor.Companion.m3072getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3075isSpecifiedFK8aYYs$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3076isUnspecifiedFK8aYYs(long j10) {
        return j10 == ScaleFactor.Companion.m3072getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3077isUnspecifiedFK8aYYs$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m3078lerpbDIf60(long j10, long j11, float f10) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m3065getScaleXimpl(j10), ScaleFactor.m3065getScaleXimpl(j11), f10), MathHelpersKt.lerp(ScaleFactor.m3066getScaleYimpl(j10), ScaleFactor.m3066getScaleYimpl(j11), f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f10) {
        float f11 = 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f11;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m3079takeOrElseoyDd2qo(long j10, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != ScaleFactor.Companion.m3072getUnspecified_hLwfpc() ? j10 : block.invoke().m3070unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m3080timesUQTWf7w(long j10, long j11) {
        return SizeKt.Size(Size.m1440getWidthimpl(j10) * ScaleFactor.m3065getScaleXimpl(j11), Size.m1437getHeightimpl(j10) * ScaleFactor.m3066getScaleYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m3081timesmw2e94(long j10, long j11) {
        return m3080timesUQTWf7w(j11, j10);
    }
}
