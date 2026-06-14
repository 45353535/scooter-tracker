package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawDelegate;", "", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "textStyle", "<init>", "(Lcom/yandex/div/internal/widget/slider/SliderTextStyle;)V", "Landroid/graphics/Canvas;", "canvas", "", "centerX", "centerY", "", "draw", "(Landroid/graphics/Canvas;FF)V", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "", "value", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "halfTextWidth", "F", "halfTextHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextDrawDelegate {
    private float halfTextHeight;
    private float halfTextWidth;

    @Nullable
    private String text;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private final Rect textRect = new Rect();

    @NotNull
    private final SliderTextStyle textStyle;

    public TextDrawDelegate(@NotNull SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        Paint paint = new Paint(1);
        paint.setTextSize(sliderTextStyle.getFontSize());
        paint.setLetterSpacing(sliderTextStyle.getSpacing());
        paint.setColor(sliderTextStyle.getTextColor());
        paint.setTypeface(sliderTextStyle.getFontWeight());
        paint.setStyle(Paint.Style.FILL);
        if (TextViewExtensionsKt.getSupportFontVariations()) {
            paint.setFontVariationSettings(sliderTextStyle.getFontVariations());
        }
        this.textPaint = paint;
    }

    public final void draw(@NotNull Canvas canvas, float centerX, float centerY) {
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, (centerX - this.halfTextWidth) + this.textStyle.getOffsetX(), centerY + this.halfTextHeight + this.textStyle.getOffsetY(), this.textPaint);
        }
    }

    public final void setText(@Nullable String str) {
        this.text = str;
        this.textPaint.getTextBounds(str, 0, str != null ? str.length() : 0, this.textRect);
        this.halfTextWidth = this.textPaint.measureText(this.text) / 2.0f;
        this.halfTextHeight = this.textRect.height() / 2.0f;
    }
}
