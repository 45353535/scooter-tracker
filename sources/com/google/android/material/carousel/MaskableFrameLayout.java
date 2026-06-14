package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

/* JADX INFO: loaded from: classes9.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f25893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f25894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnMaskChangedListener f25895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ShapeAppearanceModel f25896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ShapeableDelegate f25897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f25898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnHoverListener f25899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25900j;

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ CornerSize a(CornerSize cornerSize) {
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    private void c() {
        this.f25897g.onMaskChanged(this, this.f25893c);
        OnMaskChangedListener onMaskChangedListener = this.f25895e;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.f25893c);
        }
    }

    private void d() {
        if (this.f25892b != -1.0f) {
            float fLerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f25892b);
            setMaskRectF(new RectF(fLerp, 0.0f, getWidth() - fLerp, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f25897g.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.carousel.d
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                super/*android.widget.FrameLayout*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f25893c;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // com.google.android.material.carousel.Maskable
    @NonNull
    public RectF getMaskRectF() {
        return this.f25893c;
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public float getMaskXPercentage() {
        return this.f25892b;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f25896f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f25898h;
        if (bool != null) {
            this.f25897g.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f25898h = Boolean.valueOf(this.f25897g.isForceCompatClippingEnabled());
        this.f25897g.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f25893c.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.f25893c.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.f25900j && this.f25899i != null) {
                    motionEvent.setAction(10);
                    this.f25899i.onHover(this, motionEvent);
                }
                this.f25900j = false;
                return false;
            }
        }
        if (this.f25899i != null) {
            if (!this.f25900j && action == 7) {
                motionEvent.setAction(9);
                this.f25900j = true;
            }
            if (action == 7 || action == 9) {
                this.f25900j = true;
            }
            this.f25899i.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.f25894d);
        if (getX() > 0.0f) {
            this.f25894d.left = (int) (r0.left + this.f25893c.left);
        }
        if (getY() > 0.0f) {
            this.f25894d.top = (int) (r0.top + this.f25893c.top);
        }
        Rect rect = this.f25894d;
        rect.right = rect.left + Math.round(this.f25893c.width());
        Rect rect2 = this.f25894d;
        rect2.bottom = rect2.top + Math.round(this.f25893c.height());
        accessibilityNodeInfo.setBoundsInScreen(this.f25894d);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f25893c.isEmpty()) {
            if (!this.f25893c.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f25892b != -1.0f) {
            d();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25893c.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f25893c.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z10) {
        this.f25897g.setForceCompatClippingEnabled(this, z10);
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@NonNull RectF rectF) {
        this.f25893c.set(rectF);
        c();
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public void setMaskXPercentage(float f10) {
        float fClamp = MathUtils.clamp(f10, 0.0f, 1.0f);
        if (this.f25892b != fClamp) {
            this.f25892b = fClamp;
            d();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(@Nullable View.OnHoverListener onHoverListener) {
        this.f25899i = onHoverListener;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.f25895e = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelWithTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.carousel.c
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return MaskableFrameLayout.a(cornerSize);
            }
        });
        this.f25896f = shapeAppearanceModelWithTransformedCornerSizes;
        this.f25897g.onShapeAppearanceChanged(this, shapeAppearanceModelWithTransformedCornerSizes);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25892b = -1.0f;
        this.f25893c = new RectF();
        this.f25894d = new Rect();
        this.f25897g = ShapeableDelegate.create(this);
        this.f25898h = null;
        this.f25900j = false;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i10, 0, 0).build());
    }
}
