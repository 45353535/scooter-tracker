package com.yandex.div.internal.widget;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.ChecksSdkIntAtLeast;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\b\u0010\t\u001a\u00020\nH\u0001\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0007\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"fontHeight", "", "Landroid/widget/TextView;", "getFontHeight", "(Landroid/widget/TextView;)F", "fontHeightInt", "", "getFontHeightInt", "(Landroid/widget/TextView;)I", "checkHyphenationSupported", "", "isHyphenationEnabled", "lineAt", "vertical", "textHeight", "lines", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TextViewsKt {
    @ChecksSdkIntAtLeast(api = 26)
    public static final boolean checkHyphenationSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final float getFontHeight(@NotNull TextView textView) {
        return textView.getPaint().getFontMetrics(null);
    }

    public static final int getFontHeightInt(@NotNull TextView textView) {
        return textView.getPaint().getFontMetricsInt(null);
    }

    public static final boolean isHyphenationEnabled(@NotNull TextView textView) {
        return checkHyphenationSupported() && textView.getHyphenationFrequency() != 0;
    }

    public static final int lineAt(@NotNull TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i10);
    }

    public static final int textHeight(@NotNull TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return i10 <= 0 ? textView.getLayout().getHeight() : i10 > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i10) - textView.getLayout().getLineTop(0);
    }
}
