package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0004J2\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\f\u0010\u0019\u001a\u00020\u0004*\u00020\u000eH\u0002J\f\u0010\u001a\u001a\u00020\u0004*\u00020\u000eH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderDrawDelegate;", "", "()V", "centerY", "", "getCenterY", "()I", "viewportHeight", "viewportWidth", "drawInactiveTrack", "", "canvas", "Landroid/graphics/Canvas;", "drawable", "Landroid/graphics/drawable/Drawable;", "drawOnPosition", C4240b4.i.L, "drawThumb", "value", "textDrawable", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "drawTrackPart", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "onMeasure", "calculateBottom", "calculateTop", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderDrawDelegate {
    private int viewportHeight;
    private int viewportWidth;

    private final int calculateBottom(Drawable drawable) {
        return getCenterY() + (drawable.getIntrinsicHeight() / 2);
    }

    private final int calculateTop(Drawable drawable) {
        return getCenterY() - (drawable.getIntrinsicHeight() / 2);
    }

    private final int getCenterY() {
        return this.viewportHeight / 2;
    }

    public final void drawInactiveTrack(@NotNull Canvas canvas, @Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, calculateTop(drawable), this.viewportWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawOnPosition(@NotNull Canvas canvas, @Nullable Drawable drawable, int position) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(position - intrinsicWidth, calculateTop(drawable), position + intrinsicWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawThumb(@NotNull Canvas canvas, int position, @Nullable Drawable drawable, int value, @Nullable TextDrawable textDrawable) {
        drawOnPosition(canvas, drawable, position);
        if (textDrawable != null) {
            textDrawable.setText(String.valueOf(value));
            drawOnPosition(canvas, textDrawable, position);
        }
    }

    public final void drawTrackPart(@NotNull Canvas canvas, @Nullable Drawable drawable, @Px int from, @Px int to) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(from, calculateTop(drawable), to, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void onMeasure(int viewportWidth, int viewportHeight) {
        this.viewportWidth = viewportWidth;
        this.viewportHeight = viewportHeight;
    }
}
