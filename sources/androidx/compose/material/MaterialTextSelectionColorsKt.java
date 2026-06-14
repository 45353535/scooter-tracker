package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", H2.f75840g, "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* JADX INFO: renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1048binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j10, long j11, long j12) {
        int i10 = 0;
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        while (i10 < 7) {
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float fM1050calculateContrastRationb2GgbA = (m1050calculateContrastRationb2GgbA(j13, f11, j14, j15) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= fM1050calculateContrastRationb2GgbA && fM1050calculateContrastRationb2GgbA <= 0.01f) {
                return f11;
            }
            if (fM1050calculateContrastRationb2GgbA < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
            i10++;
            j10 = j13;
            j11 = j14;
            j12 = j15;
        }
        return f11;
    }

    /* JADX INFO: renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1049calculateContrastRatioOWjLjI(long j10, long j11) {
        float fM1656luminance8_81llA = ColorKt.m1656luminance8_81llA(j10) + 0.05f;
        float fM1656luminance8_81llA2 = ColorKt.m1656luminance8_81llA(j11) + 0.05f;
        return Math.max(fM1656luminance8_81llA, fM1656luminance8_81llA2) / Math.min(fM1656luminance8_81llA, fM1656luminance8_81llA2);
    }

    /* JADX INFO: renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1050calculateContrastRationb2GgbA(long j10, float f10, long j11, long j12) {
        long jM1649compositeOverOWjLjI = ColorKt.m1649compositeOverOWjLjI(Color.m1603copywmQWz5c$default(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return m1049calculateContrastRatioOWjLjI(ColorKt.m1649compositeOverOWjLjI(j11, jM1649compositeOverOWjLjI), jM1649compositeOverOWjLjI);
    }

    /* JADX INFO: renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1051calculateSelectionBackgroundColorysEtTa8(long j10, long j11, long j12) {
        return Color.m1603copywmQWz5c$default(j10, m1050calculateContrastRationb2GgbA(j10, DefaultSelectionBackgroundAlpha, j11, j12) >= DesiredContrastRatio ? DefaultSelectionBackgroundAlpha : m1050calculateContrastRationb2GgbA(j10, 0.2f, j11, j12) < DesiredContrastRatio ? 0.2f : m1048binarySearchForAccessibleSelectionColorAlphaysEtTa8(j10, j11, j12), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final SelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jM962getPrimary0d7_KjU = colors.m962getPrimary0d7_KjU();
        long jM955getBackground0d7_KjU = colors.m955getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long jM979contentColorFor4WTKRHQ = ColorsKt.m979contentColorFor4WTKRHQ(colors, jM955getBackground0d7_KjU);
        if (jM979contentColorFor4WTKRHQ == Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            jM979contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl();
        }
        long j10 = jM979contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color colorM1594boximpl = Color.m1594boximpl(jM962getPrimary0d7_KjU);
        Color colorM1594boximpl2 = Color.m1594boximpl(jM955getBackground0d7_KjU);
        Color colorM1594boximpl3 = Color.m1594boximpl(jM1603copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(colorM1594boximpl) | composer.changed(colorM1594boximpl2) | composer.changed(colorM1594boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            SelectionColors selectionColors = new SelectionColors(colors.m962getPrimary0d7_KjU(), m1051calculateSelectionBackgroundColorysEtTa8(jM962getPrimary0d7_KjU, jM1603copywmQWz5c$default, jM955getBackground0d7_KjU), null);
            composer.updateRememberedValue(selectionColors);
            objRememberedValue = selectionColors;
        }
        composer.endReplaceableGroup();
        SelectionColors selectionColors2 = (SelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectionColors2;
    }
}
