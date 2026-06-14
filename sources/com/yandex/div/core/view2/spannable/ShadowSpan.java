package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ShadowSpan;", "Landroid/text/style/CharacterStyle;", "shadow", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "(Lcom/yandex/div/core/view2/spannable/ShadowData;)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShadowSpan extends CharacterStyle {

    @NotNull
    private final ShadowData shadow;

    public ShadowSpan(@NotNull ShadowData shadowData) {
        this.shadow = shadowData;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint tp) {
        ShadowData shadowData = this.shadow;
        if (tp != null) {
            tp.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
        }
    }
}
