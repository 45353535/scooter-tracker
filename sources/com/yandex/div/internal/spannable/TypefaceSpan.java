package com.yandex.div.internal.spannable;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/internal/spannable/TypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "paint", "", "apply", "(Landroid/text/TextPaint;)V", ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, "updateDrawState", "updateMeasureState", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypefaceSpan extends MetricAffectingSpan {

    @NotNull
    private final Typeface typeface;

    public TypefaceSpan(@NotNull Typeface typeface) {
        this.typeface = typeface;
    }

    private final void apply(TextPaint paint) {
        paint.setTypeface(this.typeface);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        apply(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        apply(paint);
    }
}
