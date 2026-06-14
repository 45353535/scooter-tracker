package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class BorderDrawable extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f26530b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f26536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26541m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ShapeAppearanceModel f26543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f26544p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ShapeAppearancePathProvider f26529a = ShapeAppearancePathProvider.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f26531c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f26532d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f26533e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f26534f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BorderState f26535g = new BorderState();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26542n = true;

    private class BorderState extends Drawable.ConstantState {
        private BorderState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f26543o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f26530b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f26532d);
        float fHeight = this.f26536h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{ColorUtils.compositeColors(this.f26537i, this.f26541m), ColorUtils.compositeColors(this.f26538j, this.f26541m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f26538j, 0), this.f26541m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f26540l, 0), this.f26541m), ColorUtils.compositeColors(this.f26540l, this.f26541m), ColorUtils.compositeColors(this.f26539k, this.f26541m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f26534f.set(getBounds());
        return this.f26534f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f26541m = colorStateList.getColorForState(getState(), this.f26541m);
        }
        this.f26544p = colorStateList;
        this.f26542n = true;
        invalidateSelf();
    }

    void d(int i10, int i11, int i12, int i13) {
        this.f26537i = i10;
        this.f26538j = i11;
        this.f26539k = i12;
        this.f26540l = i13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f26542n) {
            this.f26530b.setShader(a());
            this.f26542n = false;
        }
        float strokeWidth = this.f26530b.getStrokeWidth() / 2.0f;
        copyBounds(this.f26532d);
        this.f26533e.set(this.f26532d);
        float fMin = Math.min(this.f26543o.getTopLeftCornerSize().getCornerSize(b()), this.f26533e.width() / 2.0f);
        if (this.f26543o.isRoundRect(b())) {
            this.f26533e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f26533e, fMin, fMin, this.f26530b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f26535g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26536h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (this.f26543o.isRoundRect(b())) {
            outline.setRoundRect(getBounds(), this.f26543o.getTopLeftCornerSize().getCornerSize(b()));
        } else {
            copyBounds(this.f26532d);
            this.f26533e.set(this.f26532d);
            this.f26529a.calculatePath(this.f26543o, 1.0f, this.f26533e, this.f26531c);
            DrawableUtils.setOutlineToPath(outline, this.f26531c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f26543o.isRoundRect(b())) {
            return true;
        }
        int iRound = Math.round(this.f26536h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f26543o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f26544p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f26542n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f26544p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f26541m)) != this.f26541m) {
            this.f26542n = true;
            this.f26541m = colorForState;
        }
        if (this.f26542n) {
            invalidateSelf();
        }
        return this.f26542n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        this.f26530b.setAlpha(i10);
        invalidateSelf();
    }

    public void setBorderWidth(@Dimension float f10) {
        if (this.f26536h != f10) {
            this.f26536h = f10;
            this.f26530b.setStrokeWidth(f10 * 1.3333f);
            this.f26542n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f26530b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.f26543o = shapeAppearanceModel;
        invalidateSelf();
    }
}
