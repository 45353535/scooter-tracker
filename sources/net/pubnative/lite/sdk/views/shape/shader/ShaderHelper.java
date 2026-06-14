package net.pubnative.lite.sdk.views.shape.shader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import net.pubnative.lite.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShaderHelper {
    private static final int ALPHA_MAX = 255;
    protected final Paint borderPaint;
    protected Drawable drawable;
    protected final Paint imagePaint;
    protected BitmapShader shader;
    protected int viewHeight;
    protected int viewWidth;
    protected final Matrix matrix = new Matrix();
    protected int borderColor = ViewCompat.MEASURED_STATE_MASK;
    protected int borderWidth = 0;
    protected float borderAlpha = 1.0f;
    protected boolean square = false;

    public ShaderHelper() {
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.imagePaint = paint2;
        paint2.setAntiAlias(true);
    }

    public abstract void calculate(int i10, int i11, float f10, float f11, float f12, float f13, float f14);

    public Bitmap calculateDrawableSizes() {
        float fRound;
        float f10;
        float f11;
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                float fRound2 = Math.round(this.viewWidth - (this.borderWidth * 2.0f));
                float fRound3 = Math.round(this.viewHeight - (this.borderWidth * 2.0f));
                float f12 = width;
                float f13 = height;
                if (f12 * fRound3 > fRound2 * f13) {
                    float f14 = fRound3 / f13;
                    float fRound4 = Math.round(((fRound2 / f14) - f12) / 2.0f);
                    f10 = f14;
                    fRound = 0.0f;
                    f11 = fRound4;
                } else {
                    float f15 = fRound2 / f12;
                    fRound = Math.round(((fRound3 / f15) - f13) / 2.0f);
                    f10 = f15;
                    f11 = 0.0f;
                }
                this.matrix.setScale(f10, f10);
                this.matrix.preTranslate(f11, fRound);
                Matrix matrix = this.matrix;
                float f16 = this.borderWidth;
                matrix.postTranslate(f16, f16);
                calculate(width, height, fRound2, fRound3, f10, f11, fRound);
                return bitmap;
            }
        }
        reset();
        return null;
    }

    protected void createShader() {
        Bitmap bitmapCalculateDrawableSizes = calculateDrawableSizes();
        if (bitmapCalculateDrawableSizes == null || bitmapCalculateDrawableSizes.getWidth() <= 0 || bitmapCalculateDrawableSizes.getHeight() <= 0) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCalculateDrawableSizes, tileMode, tileMode);
        this.shader = bitmapShader;
        this.imagePaint.setShader(bitmapShader);
    }

    protected final int dpToPx(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 * (displayMetrics.xdpi / 160.0f));
    }

    public abstract void draw(Canvas canvas, Paint paint, Paint paint2);

    protected Bitmap getBitmap() {
        Drawable drawable = this.drawable;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    public final float getBorderAlpha() {
        return this.borderAlpha;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    public void init(Context context, AttributeSet attributeSet, int i10) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShaderImageView, i10, 0);
            this.borderColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ShaderImageView_siBorderColor, this.borderColor);
            this.borderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShaderImageView_siBorderWidth, this.borderWidth);
            this.borderAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShaderImageView_siBorderAlpha, this.borderAlpha);
            this.square = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ShaderImageView_siSquare, this.square);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.borderPaint.setColor(this.borderColor);
        this.borderPaint.setAlpha(Float.valueOf(this.borderAlpha * 255.0f).intValue());
        this.borderPaint.setStrokeWidth(this.borderWidth);
    }

    public final boolean isSquare() {
        return this.square;
    }

    public boolean onDraw(Canvas canvas) {
        if (this.shader == null) {
            createShader();
        }
        if (this.shader == null || this.viewWidth <= 0 || this.viewHeight <= 0) {
            return false;
        }
        draw(canvas, this.imagePaint, this.borderPaint);
        return true;
    }

    public final void onImageDrawableReset(Drawable drawable) {
        this.drawable = drawable;
        this.shader = null;
        this.imagePaint.setShader(null);
    }

    public void onSizeChanged(int i10, int i11) {
        if (this.viewWidth == i10 && this.viewHeight == i11) {
            return;
        }
        this.viewWidth = i10;
        this.viewHeight = i11;
        if (isSquare()) {
            int iMin = Math.min(i10, i11);
            this.viewHeight = iMin;
            this.viewWidth = iMin;
        }
        if (this.shader != null) {
            calculateDrawableSizes();
        }
    }

    public abstract void reset();

    public final void setBorderAlpha(float f10) {
        this.borderAlpha = f10;
        Paint paint = this.borderPaint;
        if (paint != null) {
            paint.setAlpha(Float.valueOf(f10 * 255.0f).intValue());
        }
    }

    public final void setBorderColor(int i10) {
        this.borderColor = i10;
        Paint paint = this.borderPaint;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    public final void setBorderWidth(int i10) {
        this.borderWidth = i10;
        Paint paint = this.borderPaint;
        if (paint != null) {
            paint.setStrokeWidth(i10);
        }
    }

    public final void setSquare(boolean z10) {
        this.square = z10;
    }
}
