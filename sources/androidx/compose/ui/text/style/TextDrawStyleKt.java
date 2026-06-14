package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a!\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextDrawStyleKt {
    @NotNull
    public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle start, @NotNull TextForegroundStyle stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        boolean z10 = start instanceof BrushStyle;
        return (z10 || (stop instanceof BrushStyle)) ? (z10 && (stop instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) start).getBrush(), ((BrushStyle) stop).getBrush(), f10), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), f10)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(start, stop, f10) : TextForegroundStyle.INSTANCE.m3876from8_81llA(ColorKt.m1655lerpjxsXWHM(start.mo3760getColor0d7_KjU(), stop.mo3760getColor0d7_KjU(), f10));
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m3875modulateDxMtmZc(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : Color.m1603copywmQWz5c$default(j10, Color.m1606getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f10, Function0<Float> function0) {
        return Float.isNaN(f10) ? function0.invoke().floatValue() : f10;
    }
}
