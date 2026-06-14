package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.JG\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl(16);
        ButtonHorizontalPadding = fM3951constructorimpl;
        float f10 = 8;
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(f10);
        ButtonVerticalPadding = fM3951constructorimpl2;
        PaddingValues paddingValuesM414PaddingValuesa9UjIt4 = PaddingKt.m414PaddingValuesa9UjIt4(fM3951constructorimpl, fM3951constructorimpl2, fM3951constructorimpl, fM3951constructorimpl2);
        ContentPadding = paddingValuesM414PaddingValuesa9UjIt4;
        MinWidth = Dp.m3951constructorimpl(64);
        MinHeight = Dp.m3951constructorimpl(36);
        IconSize = Dp.m3951constructorimpl(18);
        IconSpacing = Dp.m3951constructorimpl(f10);
        OutlinedBorderSize = Dp.m3951constructorimpl(1);
        float fM3951constructorimpl3 = Dp.m3951constructorimpl(f10);
        TextButtonHorizontalPadding = fM3951constructorimpl3;
        TextButtonContentPadding = PaddingKt.m414PaddingValuesa9UjIt4(fM3951constructorimpl3, paddingValuesM414PaddingValuesa9UjIt4.getTop(), fM3951constructorimpl3, paddingValuesM414PaddingValuesa9UjIt4.getBottom());
    }

    private ButtonDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m927buttonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        long jM1649compositeOverOWjLjI;
        composer.startReplaceableGroup(1870371134);
        long jM962getPrimary0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j10;
        long jM980contentColorForek8zF_U = (i11 & 2) != 0 ? ColorsKt.m980contentColorForek8zF_U(jM962getPrimary0d7_KjU, composer, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1649compositeOverOWjLjI = ColorKt.m1649compositeOverOWjLjI(Color.m1603copywmQWz5c$default(materialTheme.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m966getSurface0d7_KjU());
        } else {
            jM1649compositeOverOWjLjI = j12;
        }
        long jM1603copywmQWz5c$default = (i11 & 8) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM962getPrimary0d7_KjU, jM980contentColorForek8zF_U, jM1649compositeOverOWjLjI, jM1603copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m928elevationR_JCAzs(float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-737170518);
        float fM3951constructorimpl = (i11 & 1) != 0 ? Dp.m3951constructorimpl(2) : f10;
        float fM3951constructorimpl2 = (i11 & 2) != 0 ? Dp.m3951constructorimpl(8) : f11;
        float fM3951constructorimpl3 = (i11 & 4) != 0 ? Dp.m3951constructorimpl(0) : f12;
        float fM3951constructorimpl4 = (i11 & 8) != 0 ? Dp.m3951constructorimpl(4) : f13;
        float fM3951constructorimpl5 = (i11 & 16) != 0 ? Dp.m3951constructorimpl(4) : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        boolean zChanged = false;
        Object[] objArr = {Dp.m3949boximpl(fM3951constructorimpl), Dp.m3949boximpl(fM3951constructorimpl2), Dp.m3949boximpl(fM3951constructorimpl3), Dp.m3949boximpl(fM3951constructorimpl4), Dp.m3949boximpl(fM3951constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        for (int i12 = 0; i12 < 5; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(fM3951constructorimpl, fM3951constructorimpl2, fM3951constructorimpl3, fM3951constructorimpl4, fM3951constructorimpl5, null);
            composer.updateRememberedValue(defaultButtonElevation);
            objRememberedValue = defaultButtonElevation;
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation2;
    }

    @Composable
    /* JADX INFO: renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m929elevationyajeYGU(float f10, float f11, float f12, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1428576874);
        if ((i11 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(2);
        }
        float f13 = f10;
        if ((i11 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(8);
        }
        float f14 = f11;
        if ((i11 & 4) != 0) {
            f12 = Dp.m3951constructorimpl(0);
        }
        float f15 = f12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f16 = 4;
        ButtonElevation buttonElevationM928elevationR_JCAzs = m928elevationR_JCAzs(f13, f14, f15, Dp.m3951constructorimpl(f16), Dp.m3951constructorimpl(f16), composer, (i10 & 14) | 27648 | (i10 & 112) | (i10 & 896) | ((i10 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevationM928elevationR_JCAzs;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m930getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m931getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m932getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m933getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i10, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke borderStrokeM189BorderStrokecXLIe8U = BorderStrokeKt.m189BorderStrokecXLIe8U(OutlinedBorderSize, Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM189BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m934getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m935outlinedButtonColorsRGew2ao(long j10, long j11, long j12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-2124406093);
        long jM966getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU() : j10;
        long jM962getPrimary0d7_KjU = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j11;
        long jM1603copywmQWz5c$default = (i11 & 4) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM966getSurface0d7_KjU, jM962getPrimary0d7_KjU, jM966getSurface0d7_KjU, jM1603copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m936textButtonColorsRGew2ao(long j10, long j11, long j12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(182742216);
        long jM1639getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m1639getTransparent0d7_KjU() : j10;
        long jM962getPrimary0d7_KjU = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j11;
        long jM1603copywmQWz5c$default = (i11 & 4) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM1639getTransparent0d7_KjU, jM962getPrimary0d7_KjU, jM1639getTransparent0d7_KjU, jM1603copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
