package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\u001d\u001a\u00020\b*\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/drawable/RoundedRectDrawable;", "Landroid/graphics/drawable/Drawable;", "params", "Lcom/yandex/div/internal/drawable/RoundedRectDrawable$Params;", "(Lcom/yandex/div/internal/drawable/RoundedRectDrawable$Params;)V", "mainPaint", "Landroid/graphics/Paint;", "offset", "", "radiusX", "radiusY", "rect", "Landroid/graphics/RectF;", "strokeOffset", "strokePaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setRectWithOffset", "considerSize", "size", "Params", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoundedRectDrawable extends Drawable {

    @NotNull
    private final Paint mainPaint;
    private final float offset;

    @NotNull
    private final Params params;
    private final float radiusX;
    private final float radiusY;

    @NotNull
    private final RectF rect;
    private final float strokeOffset;

    @Nullable
    private final Paint strokePaint;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/internal/drawable/RoundedRectDrawable$Params;", "", "", "width", "height", "", "color", "radius", "strokeColor", "strokeWidth", "<init>", "(FFIFLjava/lang/Integer;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidth", "()F", "getHeight", "I", "getColor", "getRadius", "Ljava/lang/Integer;", "getStrokeColor", "()Ljava/lang/Integer;", "Ljava/lang/Float;", "getStrokeWidth", "()Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params {
        private final int color;
        private final float height;
        private final float radius;

        @Nullable
        private final Integer strokeColor;

        @Nullable
        private final Float strokeWidth;
        private final float width;

        public Params(@Px float f10, @Px float f11, int i10, @Px float f12, @Nullable Integer num, @Px @Nullable Float f13) {
            this.width = f10;
            this.height = f11;
            this.color = i10;
            this.radius = f12;
            this.strokeColor = num;
            this.strokeWidth = f13;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Float.compare(this.width, params.width) == 0 && Float.compare(this.height, params.height) == 0 && this.color == params.color && Float.compare(this.radius, params.radius) == 0 && Intrinsics.areEqual(this.strokeColor, params.strokeColor) && Intrinsics.areEqual((Object) this.strokeWidth, (Object) params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getRadius() {
            return this.radius;
        }

        @Nullable
        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public final float getWidth() {
            return this.width;
        }

        public int hashCode() {
            int iFloatToIntBits = ((((((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height)) * 31) + this.color) * 31) + Float.floatToIntBits(this.radius)) * 31;
            Integer num = this.strokeColor;
            int iHashCode = (iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Params(width=" + this.width + ", height=" + this.height + ", color=" + this.color + ", radius=" + this.radius + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }
    }

    public RoundedRectDrawable(@NotNull Params params) {
        this.params = params;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(params.getColor());
        this.mainPaint = paint;
        this.radiusX = considerSize(params.getRadius(), params.getHeight());
        this.radiusY = considerSize(params.getRadius(), params.getWidth());
        RectF rectF = new RectF(0.0f, 0.0f, params.getWidth(), params.getHeight());
        this.rect = rectF;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            this.strokePaint = null;
            this.strokeOffset = 0.0f;
            this.offset = 0.0f;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(params.getStrokeColor().intValue());
            paint2.setStrokeWidth(params.getStrokeWidth().floatValue());
            this.strokePaint = paint2;
            this.strokeOffset = params.getStrokeWidth().floatValue() / 2;
            this.offset = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    private final float considerSize(float f10, float f11) {
        return f10 - (f10 >= f11 / ((float) 2) ? this.strokeOffset : 0.0f);
    }

    private final void setRectWithOffset(float offset) {
        Rect bounds = getBounds();
        this.rect.set(bounds.left + offset, bounds.top + offset, bounds.right - offset, bounds.bottom - offset);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        setRectWithOffset(this.offset);
        canvas.drawRoundRect(this.rect, this.radiusX, this.radiusY, this.mainPaint);
        Paint paint = this.strokePaint;
        if (paint != null) {
            setRectWithOffset(this.strokeOffset);
            canvas.drawRoundRect(this.rect, this.params.getRadius(), this.params.getRadius(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.params.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.params.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }
}
