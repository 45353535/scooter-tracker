package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    /* JADX INFO: renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1037elevationixp7dh8(float f10, float f11, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-654132828);
        float fM3951constructorimpl = (i11 & 1) != 0 ? Dp.m3951constructorimpl(6) : f10;
        float fM3951constructorimpl2 = (i11 & 2) != 0 ? Dp.m3951constructorimpl(12) : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f12 = 8;
        FloatingActionButtonElevation floatingActionButtonElevationM1038elevationxZ9QkE = m1038elevationxZ9QkE(fM3951constructorimpl, fM3951constructorimpl2, Dp.m3951constructorimpl(f12), Dp.m3951constructorimpl(f12), composer, (i10 & 14) | 3456 | (i10 & 112) | ((i10 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevationM1038elevationxZ9QkE;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1038elevationxZ9QkE(float f10, float f11, float f12, float f13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(380403812);
        if ((i11 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(6);
        }
        float f14 = f10;
        float fM3951constructorimpl = (i11 & 2) != 0 ? Dp.m3951constructorimpl(12) : f11;
        float fM3951constructorimpl2 = (i11 & 4) != 0 ? Dp.m3951constructorimpl(8) : f12;
        float fM3951constructorimpl3 = (i11 & 8) != 0 ? Dp.m3951constructorimpl(8) : f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)");
        }
        Object[] objArr = {Dp.m3949boximpl(f14), Dp.m3949boximpl(fM3951constructorimpl), Dp.m3949boximpl(fM3951constructorimpl2), Dp.m3949boximpl(fM3951constructorimpl3)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = new DefaultFloatingActionButtonElevation(f14, fM3951constructorimpl, fM3951constructorimpl2, fM3951constructorimpl3, null);
            composer.updateRememberedValue(defaultFloatingActionButtonElevation);
            objRememberedValue = defaultFloatingActionButtonElevation;
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation2 = (DefaultFloatingActionButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation2;
    }
}
