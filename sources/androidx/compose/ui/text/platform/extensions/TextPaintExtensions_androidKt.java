package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0001\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", H2.f75840g, "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextPaintExtensions_androidKt {
    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle style, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, @NotNull Density density, boolean z10) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(style.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo307toPxR2X_6o(style.getFontSize()));
        } else if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m4132getValueimpl(style.getFontSize()));
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = style.getFontStyle();
            FontStyle fontStyleM3585boximpl = FontStyle.m3585boximpl(fontStyle != null ? fontStyle.m3591unboximpl() : FontStyle.INSTANCE.m3593getNormal_LCdwA());
            FontSynthesis fontSynthesis = style.getFontSynthesis();
            androidTextPaint.setTypeface(resolveTypeface.invoke(fontFamily, fontWeight, fontStyleM3585boximpl, FontSynthesis.m3594boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3603getAllGVVA2EU())));
        }
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
            } else {
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(style.getLocaleList().isEmpty() ? Locale.INSTANCE.getCurrent() : style.getLocaleList().get(0)));
            }
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m3727setColor8_81llA(style.m3463getColor0d7_KjU());
        androidTextPaint.m3726setBrush12SF9DM(style.getBrush(), Size.INSTANCE.m1448getUnspecifiedNHjbRc(), style.getAlpha());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        androidTextPaint.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(style.getLetterSpacing()), companion.m4165getSpUIouoOA()) && TextUnit.m4132getValueimpl(style.getLetterSpacing()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo307toPxR2X_6o = density.mo307toPxR2X_6o(style.getLetterSpacing());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo307toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(style.getLetterSpacing()), companion.m4164getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m4132getValueimpl(style.getLetterSpacing()));
        }
        return m3741generateFallbackSpanStyle62GTOB8(style.getLetterSpacing(), z10, style.getBackground(), style.getBaselineShift());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z10);
    }

    public static final float correctBlurRadius(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m3741generateFallbackSpanStyle62GTOB8(long j10, boolean z10, long j11, BaselineShift baselineShift) {
        long jM1640getUnspecified0d7_KjU = j11;
        boolean z11 = false;
        boolean z12 = z10 && TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4165getSpUIouoOA()) && TextUnit.m4132getValueimpl(j10) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z13 = (Color.m1605equalsimpl0(jM1640getUnspecified0d7_KjU, companion.m1640getUnspecified0d7_KjU()) || Color.m1605equalsimpl0(jM1640getUnspecified0d7_KjU, companion.m1639getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m3749equalsimpl0(baselineShift.m3752unboximpl(), BaselineShift.INSTANCE.m3756getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jM4143getUnspecifiedXSAIIZE = z12 ? j10 : TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        if (!z13) {
            jM1640getUnspecified0d7_KjU = companion.m1640getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM4143getUnspecifiedXSAIIZE, z11 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM1640getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, 13951, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint, @Nullable TextMotion textMotion) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int linearity = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m3887equalsimpl0(linearity, companion.m3892getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m3887equalsimpl0(linearity, companion.m3891getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m3887equalsimpl0(linearity, companion.m3893getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
