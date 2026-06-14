package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/internal/spannable/LetterSpacingSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "letterSpacing", "<init>", "(F)V", "Landroid/text/TextPaint;", "paint", "", "apply", "(Landroid/text/TextPaint;)V", "updateDrawState", "updateMeasureState", "F", "getLetterSpacing", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LetterSpacingSpan extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpan(float f10) {
        this.letterSpacing = f10;
    }

    private final void apply(TextPaint paint) {
        paint.setLetterSpacing(this.letterSpacing);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        apply(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        apply(paint);
    }
}
