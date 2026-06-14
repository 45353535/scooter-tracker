package com.bytedance.adsdk.ugeno.tvp.mml;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends Drawable {
    private ImageView.ScaleType aaj;
    private float bjy;
    private ColorStateList exc;
    private Shader.TileMode exu;
    private Shader.TileMode fs;
    private float jl;
    private final RectF jpc;
    private final boolean[] jtx;
    private final RectF lnr;
    private final Bitmap mml;
    private final int mo;
    private final Paint mzz;
    private boolean rdp;
    private final RectF rq;
    private final Matrix to;
    private final Paint tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final int f16236wd;
    private boolean yt;
    private final RectF qdl = new RectF();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final RectF f16235ud = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.tvp.mml.ud$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ud(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.lnr = rectF;
        this.jpc = new RectF();
        this.to = new Matrix();
        this.rq = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.fs = tileMode;
        this.exu = tileMode;
        this.rdp = true;
        this.bjy = 0.0f;
        this.jtx = new boolean[]{true, true, true, true};
        this.yt = false;
        this.jl = 0.0f;
        this.exc = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.aaj = ImageView.ScaleType.FIT_CENTER;
        this.mml = bitmap;
        int width = bitmap.getWidth();
        this.mo = width;
        int height = bitmap.getHeight();
        this.f16236wd = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.mzz = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.tvp = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.exc.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.jl);
    }

    public static ud qdl(Bitmap bitmap) {
        if (bitmap != null) {
            return new ud(bitmap);
        }
        return null;
    }

    public static Bitmap ud(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.rdp) {
            BitmapShader bitmapShader = new BitmapShader(this.mml, this.fs, this.exu);
            Shader.TileMode tileMode = this.fs;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.exu == tileMode2) {
                bitmapShader.setLocalMatrix(this.to);
            }
            this.mzz.setShader(bitmapShader);
            this.rdp = false;
        }
        if (this.yt) {
            if (this.jl <= 0.0f) {
                canvas.drawOval(this.f16235ud, this.mzz);
                return;
            } else {
                canvas.drawOval(this.f16235ud, this.mzz);
                canvas.drawOval(this.jpc, this.tvp);
                return;
            }
        }
        if (!qdl(this.jtx)) {
            canvas.drawRect(this.f16235ud, this.mzz);
            if (this.jl > 0.0f) {
                canvas.drawRect(this.jpc, this.tvp);
                return;
            }
            return;
        }
        float f10 = this.bjy;
        if (this.jl <= 0.0f) {
            canvas.drawRoundRect(this.f16235ud, f10, f10, this.mzz);
            qdl(canvas);
        } else {
            canvas.drawRoundRect(this.f16235ud, f10, f10, this.mzz);
            canvas.drawRoundRect(this.jpc, f10, f10, this.tvp);
            qdl(canvas);
            ud(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mzz.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mzz.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16236wd;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.exc.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.qdl.set(rect);
        qdl();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.exc.getColorForState(iArr, 0);
        if (this.tvp.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.tvp.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.mzz.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mzz.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.mzz.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.mzz.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable qdl(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof ud) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), qdl(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapUd = ud(drawable);
        return bitmapUd != null ? new ud(bitmapUd) : drawable;
    }

    private void ud(Canvas canvas) {
        float f10;
        float f11;
        if (ud(this.jtx) || this.bjy == 0.0f) {
            return;
        }
        RectF rectF = this.f16235ud;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.f16235ud.height();
        float f14 = this.bjy;
        float f15 = this.jl / 2.0f;
        if (this.jtx[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.tvp);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.tvp);
        }
        if (!this.jtx[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.tvp);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.tvp);
            fWidth = fWidth;
        }
        if (this.jtx[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.tvp);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.tvp);
            f11 = fHeight;
        }
        if (this.jtx[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.tvp);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.tvp);
    }

    private void qdl() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.qdl[this.aaj.ordinal()];
        if (i10 == 1) {
            this.jpc.set(this.qdl);
            RectF rectF = this.jpc;
            float f10 = this.jl;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.to.reset();
            this.to.setTranslate((int) (((this.jpc.width() - this.mo) * 0.5f) + 0.5f), (int) (((this.jpc.height() - this.f16236wd) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.jpc.set(this.qdl);
            RectF rectF2 = this.jpc;
            float f11 = this.jl;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.to.reset();
            float fWidth2 = 0.0f;
            if (this.mo * this.jpc.height() > this.jpc.width() * this.f16236wd) {
                fWidth = this.jpc.height() / this.f16236wd;
                fHeight = 0.0f;
                fWidth2 = (this.jpc.width() - (this.mo * fWidth)) * 0.5f;
            } else {
                fWidth = this.jpc.width() / this.mo;
                fHeight = (this.jpc.height() - (this.f16236wd * fWidth)) * 0.5f;
            }
            this.to.setScale(fWidth, fWidth);
            Matrix matrix = this.to;
            float f12 = this.jl;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.to.reset();
            float fMin = (((float) this.mo) > this.qdl.width() || ((float) this.f16236wd) > this.qdl.height()) ? Math.min(this.qdl.width() / this.mo, this.qdl.height() / this.f16236wd) : 1.0f;
            float fWidth3 = (int) (((this.qdl.width() - (this.mo * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.qdl.height() - (this.f16236wd * fMin)) * 0.5f) + 0.5f);
            this.to.setScale(fMin, fMin);
            this.to.postTranslate(fWidth3, fHeight2);
            this.jpc.set(this.lnr);
            this.to.mapRect(this.jpc);
            RectF rectF3 = this.jpc;
            float f13 = this.jl;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.END);
            this.to.mapRect(this.jpc);
            RectF rectF4 = this.jpc;
            float f14 = this.jl;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.START);
            this.to.mapRect(this.jpc);
            RectF rectF5 = this.jpc;
            float f15 = this.jl;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.CENTER);
            this.to.mapRect(this.jpc);
            RectF rectF6 = this.jpc;
            float f16 = this.jl;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else {
            this.jpc.set(this.qdl);
            RectF rectF7 = this.jpc;
            float f17 = this.jl;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.to.reset();
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        }
        this.f16235ud.set(this.jpc);
        this.rdp = true;
    }

    public ud ud(Shader.TileMode tileMode) {
        if (this.exu != tileMode) {
            this.exu = tileMode;
            this.rdp = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ud(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void qdl(Canvas canvas) {
        if (ud(this.jtx) || this.bjy == 0.0f) {
            return;
        }
        RectF rectF = this.f16235ud;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f16235ud.height() + f11;
        float f12 = this.bjy;
        if (!this.jtx[0]) {
            this.rq.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (!this.jtx[1]) {
            this.rq.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (!this.jtx[2]) {
            this.rq.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (this.jtx[3]) {
            return;
        }
        this.rq.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.rq, this.mzz);
    }

    public ud qdl(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.bjy = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.bjy = 0.0f;
            }
            boolean[] zArr = this.jtx;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public ud qdl(float f10) {
        this.jl = f10;
        this.tvp.setStrokeWidth(f10);
        return this;
    }

    public ud qdl(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.exc = colorStateList;
        this.tvp.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public ud qdl(boolean z10) {
        this.yt = z10;
        return this;
    }

    public ud qdl(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.aaj != scaleType) {
            this.aaj = scaleType;
            qdl();
        }
        return this;
    }

    public ud qdl(Shader.TileMode tileMode) {
        if (this.fs != tileMode) {
            this.fs = tileMode;
            this.rdp = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean qdl(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
