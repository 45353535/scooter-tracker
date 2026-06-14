package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f25779g = {R.attr.state_checkable};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f25780h = {R.attr.state_checked};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f25781i = {com.google.android.material.R.attr.state_dragged};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f25782j = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialCardViewHelper f25783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnCheckedChangeListener f25787f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void b() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f25783b.h();
        }
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f25783b.i().getBounds());
        return rectF;
    }

    void c(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f25783b.j();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f25783b.k();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f25783b.l();
    }

    public int getCheckedIconGravity() {
        return this.f25783b.m();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f25783b.n();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f25783b.o();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f25783b.p();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f25783b.z().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f25783b.z().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f25783b.z().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f25783b.z().top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f25783b.t();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f25783b.r();
    }

    public ColorStateList getRippleColor() {
        return this.f25783b.u();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f25783b.v();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.f25783b.w();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f25783b.x();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f25783b.y();
    }

    public boolean isCheckable() {
        MaterialCardViewHelper materialCardViewHelper = this.f25783b;
        return materialCardViewHelper != null && materialCardViewHelper.C();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25785d;
    }

    public boolean isDragged() {
        return this.f25786e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25783b.a0();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f25783b.i());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25779g);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25780h);
        }
        if (isDragged()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25781i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f25783b.G(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f25784c) {
            if (!this.f25783b.B()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f25783b.H(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i10) {
        this.f25783b.I(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f25783b.c0();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.f25783b.J(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f25783b.K(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f25785d != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f25783b.L(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f25783b.m() != i10) {
            this.f25783b.M(i10);
        }
    }

    public void setCheckedIconMargin(@Dimension int i10) {
        this.f25783b.N(i10);
    }

    public void setCheckedIconMarginResource(@DimenRes int i10) {
        if (i10 != -1) {
            this.f25783b.N(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        this.f25783b.L(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setCheckedIconSize(@Dimension int i10) {
        this.f25783b.O(i10);
    }

    public void setCheckedIconSizeResource(@DimenRes int i10) {
        if (i10 != 0) {
            this.f25783b.O(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.f25783b.P(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        MaterialCardViewHelper materialCardViewHelper = this.f25783b;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.a0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f25783b.W(i10, i11, i12, i13);
    }

    public void setDragged(boolean z10) {
        if (this.f25786e != z10) {
            this.f25786e = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f25783b.e0();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.f25787f = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f25783b.e0();
        this.f25783b.b0();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f25783b.R(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f25783b.Q(f10);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.f25783b.S(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i10) {
        this.f25783b.S(AppCompatResources.getColorStateList(getContext(), i10));
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        this.f25783b.T(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(@Dimension int i10) {
        this.f25783b.V(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f25783b.e0();
        this.f25783b.b0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.f25785d = !this.f25785d;
            refreshDrawableState();
            b();
            this.f25783b.setChecked(this.f25785d, true);
            OnCheckedChangeListener onCheckedChangeListener = this.f25787f;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.f25785d);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f25783b.I(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f25783b.U(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f25782j;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25785d = false;
        this.f25786e = false;
        this.f25784c = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i10, i11, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet, i10, i11);
        this.f25783b = materialCardViewHelper;
        materialCardViewHelper.I(super.getCardBackgroundColor());
        materialCardViewHelper.W(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.F(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
