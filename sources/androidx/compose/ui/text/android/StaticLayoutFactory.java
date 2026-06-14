package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JØ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0003\u0010\u0016\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "()V", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "create", "Landroid/text/StaticLayout;", "text", "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "leftIndents", "", "rightIndents", "isFallbackLineSpacingEnabled", "layout", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StaticLayoutFactory {

    @NotNull
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();

    @NotNull
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, Object obj) {
        int[] iArr3;
        StaticLayoutFactory staticLayoutFactory2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i21;
        int i22 = (i20 & 2) != 0 ? 0 : i10;
        int length = (i20 & 4) != 0 ? charSequence.length() : i11;
        TextDirectionHeuristic dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release = (i20 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic;
        Layout.Alignment dEFAULT_LAYOUT_ALIGNMENT$ui_text_release = (i20 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : alignment;
        int i23 = (i20 & 128) != 0 ? Integer.MAX_VALUE : i13;
        TextUtils.TruncateAt truncateAt2 = (i20 & 256) != 0 ? null : truncateAt;
        int i24 = (i20 & 512) != 0 ? i12 : i14;
        float f12 = (i20 & 1024) != 0 ? 1.0f : f10;
        float f13 = (i20 & 2048) != 0 ? 0.0f : f11;
        int i25 = (i20 & 4096) != 0 ? 0 : i15;
        boolean z12 = (i20 & 8192) != 0 ? false : z10;
        boolean z13 = (i20 & 16384) != 0 ? true : z11;
        int i26 = (32768 & i20) != 0 ? 0 : i16;
        int i27 = (65536 & i20) != 0 ? 0 : i17;
        int i28 = (131072 & i20) != 0 ? 0 : i18;
        int i29 = (262144 & i20) != 0 ? 0 : i19;
        int[] iArr4 = (524288 & i20) != 0 ? null : iArr;
        if ((i20 & 1048576) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i12;
            staticLayoutFactory2 = staticLayoutFactory;
        } else {
            iArr3 = iArr2;
            staticLayoutFactory2 = staticLayoutFactory;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i12;
        }
        return staticLayoutFactory2.create(charSequence2, i22, length, textPaint2, i21, dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release, dEFAULT_LAYOUT_ALIGNMENT$ui_text_release, i23, truncateAt2, i24, f12, f13, i25, z12, z13, i26, i27, i28, i29, iArr4, iArr3);
    }

    @NotNull
    public final StaticLayout create(@NotNull CharSequence text, int start, int end, @NotNull TextPaint paint, int width, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, @IntRange(from = 0) int maxLines, @Nullable TextUtils.TruncateAt ellipsize, @IntRange(from = 0) int ellipsizedWidth, @FloatRange(from = 0.0d) float lineSpacingMultiplier, float lineSpacingExtra, int justificationMode, boolean includePadding, boolean useFallbackLineSpacing, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, int hyphenationFrequency, @Nullable int[] leftIndents, @Nullable int[] rightIndents) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return delegate.create(new StaticLayoutParams(text, start, end, paint, width, textDir, alignment, maxLines, ellipsize, ellipsizedWidth, lineSpacingMultiplier, lineSpacingExtra, justificationMode, includePadding, useFallbackLineSpacing, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphenationFrequency, leftIndents, rightIndents));
    }

    public final boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout layout, boolean useFallbackLineSpacing) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return delegate.isFallbackLineSpacingEnabled(layout, useFallbackLineSpacing);
    }
}
