package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/spannable/FontVariationSpan;", "Landroid/text/style/MetricAffectingSpan;", "settings", "", "(Ljava/lang/String;)V", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "updateMeasureState", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontVariationSpan extends MetricAffectingSpan {

    @Nullable
    private final String settings;

    public FontVariationSpan(@Nullable String str) {
        this.settings = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }
}
