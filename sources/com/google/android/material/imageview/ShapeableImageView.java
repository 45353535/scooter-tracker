package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f26658t = R.style.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ShapeAppearancePathProvider f26659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f26660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f26661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f26662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f26663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f26664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f26665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaterialShapeDrawable f26666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ShapeAppearanceModel f26667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f26668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f26669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f26676s;

    class OutlineProvider extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f26677a = new Rect();

        OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f26667j == null) {
                return;
            }
            if (ShapeableImageView.this.f26666i == null) {
                ShapeableImageView.this.f26666i = new MaterialShapeDrawable(ShapeableImageView.this.f26667j);
            }
            ShapeableImageView.this.f26660c.round(this.f26677a);
            ShapeableImageView.this.f26666i.setBounds(this.f26677a);
            ShapeableImageView.this.f26666i.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void e(Canvas canvas) {
        if (this.f26665h == null) {
            return;
        }
        this.f26662e.setStrokeWidth(this.f26668k);
        int colorForState = this.f26665h.getColorForState(getDrawableState(), this.f26665h.getDefaultColor());
        if (this.f26668k <= 0.0f || colorForState == 0) {
            return;
        }
        this.f26662e.setColor(colorForState);
        canvas.drawPath(this.f26664g, this.f26662e);
    }

    private boolean f() {
        return (this.f26674q == Integer.MIN_VALUE && this.f26675r == Integer.MIN_VALUE) ? false : true;
    }

    private boolean g() {
        return getLayoutDirection() == 1;
    }

    private void h(int i10, int i11) {
        this.f26660c.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f26659b.calculatePath(this.f26667j, 1.0f, this.f26660c, this.f26664g);
        this.f26669l.rewind();
        this.f26669l.addPath(this.f26664g);
        this.f26661d.set(0.0f, 0.0f, i10, i11);
        this.f26669l.addRect(this.f26661d, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f26673p;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i10 = this.f26675r;
        return i10 != Integer.MIN_VALUE ? i10 : g() ? this.f26670m : this.f26672o;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (f()) {
            if (g() && (i11 = this.f26675r) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!g() && (i10 = this.f26674q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f26670m;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (f()) {
            if (g() && (i11 = this.f26674q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!g() && (i10 = this.f26675r) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f26672o;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i10 = this.f26674q;
        return i10 != Integer.MIN_VALUE ? i10 : g() ? this.f26672o : this.f26670m;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f26671n;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f26667j;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f26665h;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f26668k;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f26669l, this.f26663f);
        e(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f26676s && isLayoutDirectionResolved()) {
            this.f26676s = true;
            if (isPaddingRelative() || f()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h(i10, i11);
    }

    public void setContentPadding(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        this.f26674q = Integer.MIN_VALUE;
        this.f26675r = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f26670m) + i10, (super.getPaddingTop() - this.f26671n) + i11, (super.getPaddingRight() - this.f26672o) + i12, (super.getPaddingBottom() - this.f26673p) + i13);
        this.f26670m = i10;
        this.f26671n = i11;
        this.f26672o = i12;
        this.f26673p = i13;
    }

    public void setContentPaddingRelative(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f26671n) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f26673p) + i13);
        this.f26670m = g() ? i12 : i10;
        this.f26671n = i11;
        if (!g()) {
            i10 = i12;
        }
        this.f26672o = i10;
        this.f26673p = i13;
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f26667j = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f26666i;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        h(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f26665h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(@Dimension float f10) {
        if (this.f26668k != f10) {
            this.f26668k = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f26658t;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f26659b = ShapeAppearancePathProvider.getInstance();
        this.f26664g = new Path();
        this.f26676s = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f26663f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f26660c = new RectF();
        this.f26661d = new RectF();
        this.f26669l = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableImageView, i10, i11);
        setLayerType(2, null);
        this.f26665h = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.ShapeableImageView_strokeColor);
        this.f26668k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPadding, 0);
        this.f26670m = dimensionPixelSize;
        this.f26671n = dimensionPixelSize;
        this.f26672o = dimensionPixelSize;
        this.f26673p = dimensionPixelSize;
        this.f26670m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f26671n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f26672o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f26673p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f26674q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f26675r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f26662e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f26667j = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        setOutlineProvider(new OutlineProvider());
    }
}
