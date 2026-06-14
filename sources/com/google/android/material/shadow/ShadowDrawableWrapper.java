package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ShadowDrawableWrapper extends DrawableWrapperCompat {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final double f27429r = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Paint f27430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Paint f27431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RectF f27432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f27433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Path f27434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f27435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f27436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f27437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f27438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f27440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f27441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f27442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f27443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f27444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27445q;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f10, float f11, float f12) {
        super(drawable);
        this.f27439k = true;
        this.f27443o = true;
        this.f27445q = false;
        this.f27440l = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.f27441m = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f27442n = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f27430b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f27433e = Math.round(f10);
        this.f27432d = new RectF();
        Paint paint2 = new Paint(paint);
        this.f27431c = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f27436h;
        float f11 = 1.5f * f10;
        this.f27432d.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        Drawable drawable = getDrawable();
        RectF rectF = this.f27432d;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b();
    }

    private void b() {
        float f10 = this.f27433e;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f27437i;
        rectF2.inset(-f11, -f11);
        Path path = this.f27434f;
        if (path == null) {
            this.f27434f = new Path();
        } else {
            path.reset();
        }
        this.f27434f.setFillType(Path.FillType.EVEN_ODD);
        this.f27434f.moveTo(-this.f27433e, 0.0f);
        this.f27434f.rLineTo(-this.f27437i, 0.0f);
        this.f27434f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f27434f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f27434f.close();
        float f12 = -rectF2.top;
        if (f12 > 0.0f) {
            float f13 = this.f27433e / f12;
            this.f27430b.setShader(new RadialGradient(0.0f, 0.0f, f12, new int[]{0, this.f27440l, this.f27441m, this.f27442n}, new float[]{0.0f, f13, ((1.0f - f13) / 2.0f) + f13, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f27431c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f27440l, this.f27441m, this.f27442n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f27431c.setAntiAlias(false);
    }

    private void c(Canvas canvas) {
        float f10;
        int i10;
        int iSave = canvas.save();
        canvas.rotate(this.f27444p, this.f27432d.centerX(), this.f27432d.centerY());
        float f11 = this.f27433e;
        float f12 = (-f11) - this.f27437i;
        float f13 = f11 * 2.0f;
        boolean z10 = this.f27432d.width() - f13 > 0.0f;
        boolean z11 = this.f27432d.height() - f13 > 0.0f;
        float f14 = this.f27438j;
        float f15 = f11 / ((f14 - (0.5f * f14)) + f11);
        float f16 = f11 / ((f14 - (0.25f * f14)) + f11);
        float f17 = f11 / ((f14 - (f14 * 1.0f)) + f11);
        int iSave2 = canvas.save();
        RectF rectF = this.f27432d;
        canvas.translate(rectF.left + f11, rectF.top + f11);
        canvas.scale(f15, f16);
        canvas.drawPath(this.f27434f, this.f27430b);
        if (z10) {
            canvas.scale(1.0f / f15, 1.0f);
            f10 = 1.0f;
            i10 = iSave2;
            canvas.drawRect(0.0f, f12, this.f27432d.width() - f13, -this.f27433e, this.f27431c);
        } else {
            f10 = 1.0f;
            i10 = iSave2;
        }
        canvas.restoreToCount(i10);
        int iSave3 = canvas.save();
        RectF rectF2 = this.f27432d;
        canvas.translate(rectF2.right - f11, rectF2.bottom - f11);
        canvas.scale(f15, f17);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f27434f, this.f27430b);
        if (z10) {
            canvas.scale(f10 / f15, f10);
            canvas.drawRect(0.0f, f12, this.f27432d.width() - f13, this.f27437i + (-this.f27433e), this.f27431c);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.f27432d;
        canvas.translate(rectF3.left + f11, rectF3.bottom - f11);
        canvas.scale(f15, f17);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f27434f, this.f27430b);
        if (z11) {
            canvas.scale(1.0f / f17, 1.0f);
            canvas.drawRect(0.0f, f12, this.f27432d.height() - f13, -this.f27433e, this.f27431c);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.f27432d;
        canvas.translate(rectF4.right - f11, rectF4.top + f11);
        canvas.scale(f15, f16);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f27434f, this.f27430b);
        if (z11) {
            canvas.scale(1.0f / f16, 1.0f);
            canvas.drawRect(0.0f, f12, this.f27432d.height() - f13, -this.f27433e, this.f27431c);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    public static float calculateHorizontalPadding(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f27429r) * ((double) f11))) : f10;
    }

    public static float calculateVerticalPadding(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f27429r) * ((double) f11))) : f10 * 1.5f;
    }

    private static int d(float f10) {
        int iRound = Math.round(f10);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f27439k) {
            a(getBounds());
            this.f27439k = false;
        }
        c(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f27433e;
    }

    public float getMaxShadowSize() {
        return this.f27436h;
    }

    public float getMinHeight() {
        float f10 = this.f27436h;
        return (Math.max(f10, this.f27433e + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (this.f27436h * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f10 = this.f27436h;
        return (Math.max(f10, this.f27433e + (f10 / 2.0f)) * 2.0f) + (this.f27436h * 2.0f);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.f27436h, this.f27433e, this.f27443o));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.f27436h, this.f27433e, this.f27443o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float getShadowSize() {
        return this.f27438j;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f27439k = true;
    }

    public void setAddPaddingForCorners(boolean z10) {
        this.f27443o = z10;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f27430b.setAlpha(i10);
        this.f27431c.setAlpha(i10);
    }

    public void setCornerRadius(float f10) {
        float fRound = Math.round(f10);
        if (this.f27433e == fRound) {
            return;
        }
        this.f27433e = fRound;
        this.f27439k = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f10) {
        setShadowSize(this.f27438j, f10);
    }

    public final void setRotation(float f10) {
        if (this.f27444p != f10) {
            this.f27444p = f10;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fD = d(f10);
        float fD2 = d(f11);
        if (fD > fD2) {
            if (!this.f27445q) {
                this.f27445q = true;
            }
            fD = fD2;
        }
        if (this.f27438j == fD && this.f27436h == fD2) {
            return;
        }
        this.f27438j = fD;
        this.f27436h = fD2;
        this.f27437i = Math.round(fD * 1.5f);
        this.f27435g = fD2;
        this.f27439k = true;
        invalidateSelf();
    }

    public void setShadowSize(float f10) {
        setShadowSize(f10, this.f27436h);
    }
}
