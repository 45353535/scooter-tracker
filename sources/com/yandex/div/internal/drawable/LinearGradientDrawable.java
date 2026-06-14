package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.graphics.Colormap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/internal/drawable/LinearGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "angle", "", "colormap", "Lcom/yandex/div/internal/graphics/Colormap;", "(FLcom/yandex/div/internal/graphics/Colormap;)V", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LinearGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float angle;

    @NotNull
    private final Colormap colormap;

    @NotNull
    private final Paint paint = new Paint();

    @NotNull
    private RectF rect = new RectF();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000e\u001a\u00020\u0006*\u00020\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/internal/drawable/LinearGradientDrawable$Companion;", "", "()V", "createLinearGradient", "Landroid/graphics/LinearGradient;", "angle", "", "colors", "", "positions", "", "width", "", "height", "toRadian", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float toRadian(float f10) {
            return (float) ((((double) f10) * 3.141592653589793d) / ((double) 180.0f));
        }

        @NotNull
        public final LinearGradient createLinearGradient(float angle, @NotNull int[] colors, @Nullable float[] positions, int width, int height) {
            float f10 = width;
            float f11 = f10 / 2.0f;
            float f12 = height;
            float f13 = f12 / 2.0f;
            double radian = toRadian(angle);
            float fAbs = Math.abs(f10 * ((float) Math.cos(radian))) + Math.abs(f12 * ((float) Math.sin(radian)));
            float fSnap$default = LinearGradientDrawableKt.snap$default((((float) Math.cos(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            float fSnap$default2 = LinearGradientDrawableKt.snap$default((((float) Math.sin(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            return new LinearGradient(f11 - fSnap$default, f13 + fSnap$default2, f11 + fSnap$default, f13 - fSnap$default2, colors, positions, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    public LinearGradientDrawable(float f10, @NotNull Colormap colormap) {
        this.angle = f10;
        this.colormap = colormap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        super.onBoundsChange(bounds);
        this.paint.setShader(INSTANCE.createLinearGradient(this.angle, this.colormap.getColors(), this.colormap.getPositions(), bounds.width(), bounds.height()));
        this.rect.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
