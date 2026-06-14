package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultBackgroundColor = companion.m1639getTransparent0d7_KjU();
        DefaultColor = companion.m1630getBlack0d7_KjU();
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f10);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f10);
        long jM3468lerpTextUnitInheritableC3pnCVY = m3468lerpTextUnitInheritableC3pnCVY(start.getFontSize(), stop.getFontSize(), f10);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f10);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.getFontStyle(), stop.getFontStyle(), f10);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.getFontSynthesis(), stop.getFontSynthesis(), f10);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f10);
        long jM3468lerpTextUnitInheritableC3pnCVY2 = m3468lerpTextUnitInheritableC3pnCVY(start.getLetterSpacing(), stop.getLetterSpacing(), f10);
        BaselineShift baselineShift = start.getBaselineShift();
        float fM3752unboximpl = baselineShift != null ? baselineShift.m3752unboximpl() : BaselineShift.m3747constructorimpl(0.0f);
        BaselineShift baselineShift2 = stop.getBaselineShift();
        float fM3759lerpjWV1Mfo = BaselineShiftKt.m3759lerpjWV1Mfo(fM3752unboximpl, baselineShift2 != null ? baselineShift2.m3752unboximpl() : BaselineShift.m3747constructorimpl(0.0f), f10);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f10);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f10);
        long jM1655lerpjxsXWHM = ColorKt.m1655lerpjxsXWHM(start.getBackground(), stop.getBackground(), f10);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f10);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM3468lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM3468lerpTextUnitInheritableC3pnCVY2, BaselineShift.m3746boximpl(fM3759lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM1655lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f10), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f10), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f10), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f10) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f10);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3468lerpTextUnitInheritableC3pnCVY(long j10, long j11, float f10) {
        return (TextUnitKt.m4150isUnspecifiedR2X_6o(j10) || TextUnitKt.m4150isUnspecifiedR2X_6o(j11)) ? ((TextUnit) lerpDiscrete(TextUnit.m4122boximpl(j10), TextUnit.m4122boximpl(j11), f10)).getPackedValue() : TextUnitKt.m4152lerpC3pnCVY(j10, j11, f10);
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle textForegroundStyleTakeOrElse = style.getTextForegroundStyle().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.INSTANCE.m3876from8_81llA(SpanStyleKt.DefaultColor);
            }
        });
        long fontSize = TextUnitKt.m4150isUnspecifiedR2X_6o(style.getFontSize()) ? DefaultFontSize : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = style.getFontStyle();
        FontStyle fontStyleM3585boximpl = FontStyle.m3585boximpl(fontStyle != null ? fontStyle.m3591unboximpl() : FontStyle.INSTANCE.m3593getNormal_LCdwA());
        FontSynthesis fontSynthesis = style.getFontSynthesis();
        FontSynthesis fontSynthesisM3594boximpl = FontSynthesis.m3594boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3603getAllGVVA2EU());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m4150isUnspecifiedR2X_6o(style.getLetterSpacing()) ? DefaultLetterSpacing : style.getLetterSpacing();
        BaselineShift baselineShift = style.getBaselineShift();
        BaselineShift baselineShiftM3746boximpl = BaselineShift.m3746boximpl(baselineShift != null ? baselineShift.m3752unboximpl() : BaselineShift.INSTANCE.m3756getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (background == Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            background = DefaultBackgroundColor;
        }
        long j10 = background;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, fontSize, fontWeight2, fontStyleM3585boximpl, fontSynthesisM3594boximpl, fontFamily2, str, letterSpacing, baselineShiftM3746boximpl, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
