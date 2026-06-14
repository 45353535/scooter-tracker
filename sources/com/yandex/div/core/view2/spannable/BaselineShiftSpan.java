package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/spannable/BaselineShiftSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/ParagraphStyle;", "", "baselineShift", "lineHeight", "<init>", "(II)V", "Landroid/text/TextPaint;", "paint", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", "I", "getLineHeight", "()I", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BaselineShiftSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int baselineShift;
    private final int lineHeight;

    public BaselineShiftSpan(@Px int i10, @IntRange(from = 0) @Px int i11) {
        this.baselineShift = i10;
        this.lineHeight = i11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        paint.baselineShift -= this.baselineShift;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        if (this.lineHeight == 0) {
            paint.baselineShift -= this.baselineShift;
        }
    }
}
