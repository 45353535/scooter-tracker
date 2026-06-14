package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a(\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\b8BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlaceholderExtensions_androidKt {
    /* JADX INFO: renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m3729getSpanUnitR2X_6o(long j10) {
        long jM4131getTypeUIouoOA = TextUnit.m4131getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m3730getSpanUnitR2X_6o$annotations(long j10) {
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m3731getSpanVerticalAligndo9XGg(int i10) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.INSTANCE;
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3435getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3441getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3436getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3437getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3440getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3438getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m3431equalsimpl0(i10, companion.m3439getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m3732getSpanVerticalAligndo9XGg$annotations(int i10) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i10, int i11, Density density) {
        Object[] spans = spannable.getSpans(i10, i11, EmojiSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m4132getValueimpl(placeholder.getWidth()), m3729getSpanUnitR2X_6o(placeholder.getWidth()), TextUnit.m4132getValueimpl(placeholder.getHeight()), m3729getSpanUnitR2X_6o(placeholder.getHeight()), density.getFontScale() * density.getDensity(), m3731getSpanVerticalAligndo9XGg(placeholder.getPlaceholderVerticalAlign())), i10, i11);
    }

    public static final void setPlaceholders(@NotNull Spannable spannable, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<Placeholder> range = placeholders.get(i10);
            setPlaceholder(spannable, range.component1(), range.getStart(), range.getEnd(), density);
        }
    }
}
