package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "()V", "apply", "Landroidx/compose/ui/graphics/Color;", "color", "elevation", "Landroidx/compose/ui/unit/Dp;", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultElevationOverlay implements ElevationOverlay {

    @NotNull
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo996apply7g2Lkgo(long j10, float f10, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(0)) > 0 && !colors.isLight()) {
            j10 = ColorKt.m1649compositeOverOWjLjI(ElevationOverlayKt.m1021calculateForegroundColorCLU3JFs(j10, f10, composer, i10 & 126), j10);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j10;
    }
}
