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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable;", "Landroid/graphics/drawable/Drawable;", "params", "Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "(Lcom/yandex/div/internal/drawable/CircleDrawable$Params;)V", "mainPaint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "strokePaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Params", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CircleDrawable extends Drawable {

    @NotNull
    private final Paint mainPaint;

    @NotNull
    private final Params params;

    @NotNull
    private final RectF rect;

    @Nullable
    private final Paint strokePaint;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "", "", "radius", "", "color", "strokeColor", "strokeWidth", "<init>", "(FILjava/lang/Integer;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRadius", "()F", "I", "getColor", "Ljava/lang/Integer;", "getStrokeColor", "()Ljava/lang/Integer;", "Ljava/lang/Float;", "getStrokeWidth", "()Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params {
        private final int color;
        private final float radius;

        @Nullable
        private final Integer strokeColor;

        @Nullable
        private final Float strokeWidth;

        public Params(@Px float f10, int i10, @Nullable Integer num, @Nullable Float f11) {
            this.radius = f10;
            this.color = i10;
            this.strokeColor = num;
            this.strokeWidth = f11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && Intrinsics.areEqual(this.strokeColor, params.strokeColor) && Intrinsics.areEqual((Object) this.strokeWidth, (Object) params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
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

        public int hashCode() {
            int iFloatToIntBits = ((Float.floatToIntBits(this.radius) * 31) + this.color) * 31;
            Integer num = this.strokeColor;
            int iHashCode = (iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Params(radius=" + this.radius + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }
    }

    public CircleDrawable(@NotNull Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        }
        this.strokePaint = paint;
        float f10 = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.getRadius() * f10, params.getRadius() * f10);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
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
