package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "textStyle", "<init>", "(Lcom/yandex/div/internal/widget/slider/SliderTextStyle;)V", "", "text", "", "setText", "(Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawDelegate;", "textDrawDelegate", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawDelegate;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextDrawable extends Drawable {

    @NotNull
    private final RectF rect = new RectF();

    @NotNull
    private TextDrawDelegate textDrawDelegate;

    @NotNull
    private final SliderTextStyle textStyle;

    public TextDrawable(@NotNull SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        this.textDrawDelegate = new TextDrawDelegate(sliderTextStyle);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        this.rect.set(getBounds());
        this.textDrawDelegate.draw(canvas, this.rect.centerX(), this.rect.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.textStyle.getFontSize() + Math.abs(this.textStyle.getOffsetY()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.rect.width() + Math.abs(this.textStyle.getOffsetX()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setText(@NotNull String text) {
        this.textDrawDelegate.setText(text);
        invalidateSelf();
    }
}
