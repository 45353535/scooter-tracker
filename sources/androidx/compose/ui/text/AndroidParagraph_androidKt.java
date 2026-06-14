package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i10) {
        int lineCount = textLayout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (textLayout.getLineBottom(i11) > i10) {
                return i11;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z10) {
        if (z10 && !TextUnit.m4129equalsimpl0(textStyle.m3528getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m4129equalsimpl0(textStyle.m3528getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE()) && textStyle.m3531getTextAlignbuA522U() != null) {
            TextAlign textAlignM3531getTextAlignbuA522U = textStyle.m3531getTextAlignbuA522U();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            if (!(textAlignM3531getTextAlignbuA522U == null ? false : TextAlign.m3853equalsimpl0(textAlignM3531getTextAlignbuA522U.getValue(), companion.m3862getStarte0LSkKk()))) {
                TextAlign textAlignM3531getTextAlignbuA522U2 = textStyle.m3531getTextAlignbuA522U();
                if (!(textAlignM3531getTextAlignbuA522U2 == null ? false : TextAlign.m3853equalsimpl0(textAlignM3531getTextAlignbuA522U2.getValue(), companion.m3859getJustifye0LSkKk()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m3378toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlign == null ? false : TextAlign.m3853equalsimpl0(textAlign.getValue(), companion.m3860getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m3853equalsimpl0(textAlign.getValue(), companion.m3861getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m3853equalsimpl0(textAlign.getValue(), companion.m3857getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m3853equalsimpl0(textAlign.getValue(), companion.m3862getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m3853equalsimpl0(textAlign.getValue(), companion.m3858getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m3379toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (strategy == null ? false : LineBreak.Strategy.m3793equalsimpl0(strategy.getValue(), companion.m3799getSimplefcGXIks())) {
            return 0;
        }
        if (strategy == null ? false : LineBreak.Strategy.m3793equalsimpl0(strategy.getValue(), companion.m3798getHighQualityfcGXIks())) {
            return 1;
        }
        return strategy == null ? false : LineBreak.Strategy.m3793equalsimpl0(strategy.getValue(), companion.m3797getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m3380toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (hyphens == null ? false : Hyphens.m3768equalsimpl0(hyphens.getValue(), companion.m3772getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 1 : 3;
        }
        int iM3773getNonevmbZdU8 = companion.m3773getNonevmbZdU8();
        if (hyphens != null) {
            Hyphens.m3768equalsimpl0(hyphens.getValue(), iM3773getNonevmbZdU8);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m3381toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (strictness == null ? false : LineBreak.Strictness.m3803equalsimpl0(strictness.getValue(), companion.m3807getDefaultusljTpc())) {
            return 0;
        }
        if (strictness == null ? false : LineBreak.Strictness.m3803equalsimpl0(strictness.getValue(), companion.m3808getLooseusljTpc())) {
            return 1;
        }
        if (strictness == null ? false : LineBreak.Strictness.m3803equalsimpl0(strictness.getValue(), companion.m3809getNormalusljTpc())) {
            return 2;
        }
        return strictness == null ? false : LineBreak.Strictness.m3803equalsimpl0(strictness.getValue(), companion.m3810getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m3382toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        if (wordBreak == null ? false : LineBreak.WordBreak.m3814equalsimpl0(wordBreak.getValue(), companion.m3818getDefaultjp8hJ3c())) {
            return 0;
        }
        return wordBreak == null ? false : LineBreak.WordBreak.m3814equalsimpl0(wordBreak.getValue(), companion.m3819getPhrasejp8hJ3c()) ? 1 : 0;
    }
}
