package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "()V", "DisabledActiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledTickAlpha", "InactiveTrackAlpha", "TickAlpha", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;

    @NotNull
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1099colorsq0g_0yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable Composer composer, int i10, int i11, int i12) {
        long jM1649compositeOverOWjLjI;
        composer.startReplaceableGroup(436017687);
        long jM962getPrimary0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j10;
        if ((i12 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1649compositeOverOWjLjI = ColorKt.m1649compositeOverOWjLjI(Color.m1603copywmQWz5c$default(materialTheme.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m966getSurface0d7_KjU());
        } else {
            jM1649compositeOverOWjLjI = j11;
        }
        long jM962getPrimary0d7_KjU2 = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j12;
        long jM1603copywmQWz5c$default = (i12 & 8) != 0 ? Color.m1603copywmQWz5c$default(jM962getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM1603copywmQWz5c$default2 = (i12 & 16) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM1603copywmQWz5c$default3 = (i12 & 32) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1603copywmQWz5c$default4 = (i12 & 64) != 0 ? Color.m1603copywmQWz5c$default(ColorsKt.m980contentColorForek8zF_U(jM962getPrimary0d7_KjU2, composer, (i10 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1603copywmQWz5c$default5 = (i12 & 128) != 0 ? Color.m1603copywmQWz5c$default(jM962getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM1603copywmQWz5c$default6 = (i12 & 256) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM1603copywmQWz5c$default7 = (i12 & 512) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, i10, i11, "androidx.compose.material.SliderDefaults.colors (Slider.kt:478)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(jM962getPrimary0d7_KjU, jM1649compositeOverOWjLjI, jM962getPrimary0d7_KjU2, jM1603copywmQWz5c$default, jM1603copywmQWz5c$default2, jM1603copywmQWz5c$default3, jM1603copywmQWz5c$default4, jM1603copywmQWz5c$default5, jM1603copywmQWz5c$default6, jM1603copywmQWz5c$default7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
