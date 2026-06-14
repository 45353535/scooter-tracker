package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m940colorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(469524104);
        long jM964getSecondary0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m964getSecondary0d7_KjU() : j10;
        long jM1603copywmQWz5c$default = (i11 & 2) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM966getSurface0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU() : j12;
        long jM1603copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM1603copywmQWz5c$default3 = (i11 & 16) != 0 ? Color.m1603copywmQWz5c$default(jM964getSecondary0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i10, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)");
        }
        Object[] objArr = {Color.m1594boximpl(jM964getSecondary0d7_KjU), Color.m1594boximpl(jM1603copywmQWz5c$default), Color.m1594boximpl(jM966getSurface0d7_KjU), Color.m1594boximpl(jM1603copywmQWz5c$default2), Color.m1594boximpl(jM1603copywmQWz5c$default3)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 5; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(jM966getSurface0d7_KjU, Color.m1603copywmQWz5c$default(jM966getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM964getSecondary0d7_KjU, Color.m1603copywmQWz5c$default(jM964getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM1603copywmQWz5c$default2, Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM1603copywmQWz5c$default3, jM964getSecondary0d7_KjU, jM1603copywmQWz5c$default, jM1603copywmQWz5c$default2, jM1603copywmQWz5c$default3, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            objRememberedValue = defaultCheckboxColors;
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors2;
    }
}
