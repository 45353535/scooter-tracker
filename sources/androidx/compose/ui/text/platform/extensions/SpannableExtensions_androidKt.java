package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H\u0000\u001a-\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\f\u0010\u001c\u001a\u00020\u0001*\u00020\u001dH\u0002\u001a\u0016\u0010\u001e\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a1\u0010 \u001a\u00020\u000e*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a1\u0010(\u001a\u00020\u000e*\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b+\u001a.\u0010,\u001a\u00020\u000e*\u00020!2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a1\u00100\u001a\u00020\u000e*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010'\u001a&\u00102\u001a\u00020\u000e*\u00020!2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001aS\u00105\u001a\u00020\u000e*\u00020!2\u0006\u00106\u001a\u00020\u001d2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112&\u00107\u001a\"\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=08H\u0002ø\u0001\u0001\u001a&\u0010>\u001a\u00020\u000e*\u00020!2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a9\u0010A\u001a\u00020\u000e*\u00020!2\u0006\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a&\u0010E\u001a\u00020\u000e*\u00020!2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a1\u0010H\u001a\u00020\u000e*\u00020!2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010J\u001a9\u0010H\u001a\u00020\u000e*\u00020!2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010K\u001a\u00020LH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001a&\u0010O\u001a\u00020\u000e*\u00020!2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a&\u0010R\u001a\u00020\u000e*\u00020!2\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a$\u0010U\u001a\u00020\u000e*\u00020!2\u0006\u0010V\u001a\u00020W2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a\"\u0010X\u001a\u00020\u000e*\u00020!2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002\u001a[\u0010Z\u001a\u00020\u000e*\u00020!2\u0006\u00106\u001a\u00020\u001d2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\n2&\u00107\u001a\"\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=08H\u0000ø\u0001\u0001\u001a&\u0010[\u001a\u00020\u000e*\u00020!2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a&\u0010^\u001a\u00020\u000e*\u00020!2\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006a"}, d2 = {"needsLetterSpacingSpan", "", "Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "resolveLineHeightInPx", "", "lineHeight", "contextFontSize", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "hasFontAttributes", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "setColor", "setColor-RPmYEkk", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setFontAttributes", "contextTextStyle", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SpannableExtensions_androidKt {
    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m3733createLetterSpacingSpaneAf_CNQ(long j10, Density density) {
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo307toPxR2X_6o(j10));
        }
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m4132getValueimpl(j10));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (spanStyles.isEmpty()) {
                return;
            }
            block.invoke(merge(spanStyle, spanStyles.get(0).getItem()), Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
            return;
        }
        int size = spanStyles.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = spanStyles.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i12);
            numArr[i12] = Integer.valueOf(range.getStart());
            numArr[i12 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt.sort((Object[]) numArr);
        int iIntValue = ((Number) ArraysKt.first(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            Integer num = numArr[i13];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i14);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    block.invoke(spanStyleMerge, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        return TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA()) || TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m4164getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m3526getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m3734resolveLineHeightInPxo2QH7mI(long j10, float f10, Density density) {
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            return density.mo307toPxR2X_6o(j10);
        }
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA())) {
            return TextUnit.m4132getValueimpl(j10) * f10;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m3735setBackgroundRPmYEkk(@NotNull Spannable setBackground, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m1658toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m3736setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i10, int i11) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m3752unboximpl()), i10, i11);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f10, int i10, int i11) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m3737setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i10, i11);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f10), i10, i11);
            }
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m3737setColorRPmYEkk(@NotNull Spannable setColor, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m1658toArgb8_81llA(j10)), i10, i11);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i10, int i11) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i10, i11);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m3525getFontStyle4Lr2A7w(), textStyle.m3526getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16323, (DefaultConstructorMarker) null) : null, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull SpanStyle spanStyle, int i11, int i12) {
                Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM3585boximpl = FontStyle.m3585boximpl(fontStyle != null ? fontStyle.m3591unboximpl() : FontStyle.INSTANCE.m3593getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan(function42.invoke(fontFamily, fontWeight, fontStyleM3585boximpl, FontSynthesis.m3594boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3603getAllGVVA2EU()))), i11, i12, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m3738setFontSizeKmRG4DE(@NotNull Spannable setFontSize, long j10, @NotNull Density density, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(zf.a.d(density.mo307toPxR2X_6o(j10)), false), i10, i11);
        } else if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m4132getValueimpl(j10)), i10, i11);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m3739setLineHeightKmRG4DE(@NotNull Spannable setLineHeight, long j10, float f10, @NotNull Density density, @NotNull LineHeightStyle lineHeightStyle) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float fM3734resolveLineHeightInPxo2QH7mI = m3734resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM3734resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightStyleSpan(fM3734resolveLineHeightInPxo2QH7mI, 0, (setLineHeight.length() == 0 || StringsKt.E1(setLineHeight) == '\n') ? setLineHeight.length() + 1 : setLineHeight.length(), LineHeightStyle.Trim.m3842isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m3843isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, setLineHeight.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m3740setLineHeightr9BaKPg(@NotNull Spannable setLineHeight, long j10, float f10, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float fM3734resolveLineHeightInPxo2QH7mI = m3734resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM3734resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightSpan(fM3734resolveLineHeightInPxo2QH7mI), 0, setLineHeight.length());
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i10, int i11) {
        Object localeSpan;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0)));
            }
            setSpan(spannable, localeSpan, i10, i11);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m1658toArgb8_81llA(shadow.getColor()), Offset.m1371getXimpl(shadow.getOffset()), Offset.m1372getYimpl(shadow.getOffset()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object span, int i10, int i11) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i10, i11, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m3736setBaselineShift0ocSgnM(spannable, item.getBaselineShift(), start, end);
        m3737setColorRPmYEkk(spannable, item.m3463getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m3738setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m3735setBackgroundRPmYEkk(spannable, item.getBackground(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Density density, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface) {
        MetricAffectingSpan metricAffectingSpanM3733createLetterSpacingSpaneAf_CNQ;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        setFontAttributes(spannable, contextTextStyle, spanStyles, resolveTypeface);
        int size = spanStyles.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i10);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = spanStyles.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i11);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM3733createLetterSpacingSpaneAf_CNQ = m3733createLetterSpacingSpaneAf_CNQ(item.getLetterSpacing(), density)) != null) {
                    setSpan(spannable, metricAffectingSpanM3733createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i10, int i11) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i10, i11);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f10, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m4129equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m4129equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m4150isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m4150isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM4132getValueimpl = 0.0f;
            float fMo307toPxR2X_6o = TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA()) ? density.mo307toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA()) ? TextUnit.m4132getValueimpl(textIndent.getFirstLine()) * f10 : 0.0f;
            long jM4131getTypeUIouoOA2 = TextUnit.m4131getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA2, companion.m4165getSpUIouoOA())) {
                fM4132getValueimpl = density.mo307toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA2, companion.m4164getEmUIouoOA())) {
                fM4132getValueimpl = TextUnit.m4132getValueimpl(textIndent.getRestLine()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo307toPxR2X_6o), (int) Math.ceil(fM4132getValueimpl)), 0, spannable.length());
        }
    }
}
