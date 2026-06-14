package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f26576s = R.style.Widget_Design_FloatingActionButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f26577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f26578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f26579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f26580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f26581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f26587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Rect f26588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f26589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AppCompatImageHelper f26590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ExpandableWidgetHelper f26591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private FloatingActionButtonImpl f26592r;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Rect f26595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OnVisibilityChangedListener f26596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26597d;

        public BaseBehavior() {
            this.f26597d = true;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return (this.f26597d && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f26588n;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i10);
            }
            if (i11 != 0) {
                ViewCompat.offsetLeftAndRight(floatingActionButton, i11);
            }
        }

        private boolean d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f26595b == null) {
                this.f26595b = new Rect();
            }
            Rect rect = this.f26595b;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.e(this.f26596c, false);
                return true;
            }
            floatingActionButton.h(this.f26596c, false);
            return true;
        }

        private boolean e(View view, FloatingActionButton floatingActionButton) {
            if (a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.e(this.f26596c, false);
                return true;
            }
            floatingActionButton.h(this.f26596c, false);
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.f26597d;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f26597d = z10;
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f26596c = onVisibilityChangedListener;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f26588n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                d(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!b(view)) {
                return false;
            }
            e(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = dependencies.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && e(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (d(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i10);
            c(coordinatorLayout, floatingActionButton);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f26597d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z10) {
            super.setAutoHideEnabled(z10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @VisibleForTesting
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            super.setInternalAutoHideListener(onVisibilityChangedListener);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    private class ShadowDelegateImpl implements ShadowViewDelegate {
        ShadowDelegateImpl() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public float getRadius() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.f26587m;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setShadowPadding(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f26588n.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f26585k, i11 + FloatingActionButton.this.f26585k, i12 + FloatingActionButton.this.f26585k, i13 + FloatingActionButton.this.f26585k);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Size {
    }

    class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TransformationCallback f26599a;

        TransformationCallbackWrapper(TransformationCallback transformationCallback) {
            this.f26599a = transformationCallback;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).f26599a.equals(this.f26599a);
        }

        public int hashCode() {
            return this.f26599a.hashCode();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onScaleChanged() {
            this.f26599a.onScaleChanged(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onTranslationChanged() {
            this.f26599a.onTranslationChanged(FloatingActionButton.this);
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private int c(int i10) {
        int i11 = this.f26584j;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    private void d(Rect rect) {
        getMeasuredContentRect(rect);
        int i10 = -this.f26592r.w();
        rect.inset(i10, i10);
    }

    private void f(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f26588n;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void g() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f26579e;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f26580f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.f26592r == null) {
            this.f26592r = new FloatingActionButtonImpl(this, new ShadowDelegateImpl());
        }
        return this.f26592r;
    }

    private FloatingActionButtonImpl.InternalVisibilityChangedListener i(final OnVisibilityChangedListener onVisibilityChangedListener) {
        if (onVisibilityChangedListener == null) {
            return null;
        }
        return new FloatingActionButtonImpl.InternalVisibilityChangedListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onHidden() {
                onVisibilityChangedListener.onHidden(FloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onShown() {
                onVisibilityChangedListener.onShown(FloatingActionButton.this);
            }
        };
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void addTransformationCallback(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().f(new TransformationCallbackWrapper(transformationCallback));
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    void e(OnVisibilityChangedListener onVisibilityChangedListener, boolean z10) {
        getImpl().x(i(onVisibilityChangedListener), z10);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f26577c;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f26578d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().o();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().r();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().n();
    }

    @Deprecated
    public boolean getContentRect(@NonNull Rect rect) {
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        f(rect);
        return true;
    }

    @Px
    public int getCustomSize() {
        return this.f26584j;
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
        return this.f26591q.getExpandedComponentIdHint();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return getImpl().q();
    }

    public void getMeasuredContentRect(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        f(rect);
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f26581g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f26581g;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) Preconditions.checkNotNull(getImpl().u());
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f26583i;
    }

    int getSizeDimension() {
        return c(this.f26583i);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f26579e;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f26580f;
    }

    public boolean getUseCompatPadding() {
        return this.f26587m;
    }

    void h(OnVisibilityChangedListener onVisibilityChangedListener, boolean z10) {
        getImpl().b0(i(onVisibilityChangedListener), z10);
    }

    public void hide() {
        hide(null);
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
        return this.f26591q.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        return getImpl().A();
    }

    public boolean isOrWillBeShown() {
        return getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().E();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f26585k = (sizeDimension - this.f26586l) / 2;
        getImpl().d0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f26588n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f26591q.onRestoreInstanceState((Bundle) Preconditions.checkNotNull(extendableSavedState.extendableStates.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.extendableStates.put("expandableWidgetHelper", this.f26591q.onSaveInstanceState());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            d(this.f26589o);
            if (!this.f26589o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().removeOnHideAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().J(animatorListener);
    }

    public void removeTransformationCallback(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().K(new TransformationCallbackWrapper(transformationCallback));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f26577c != colorStateList) {
            this.f26577c = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f26578d != mode) {
            this.f26578d = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().N(f10);
    }

    public void setCompatElevationResource(@DimenRes int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f26584j) {
            this.f26584j = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().e0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().p()) {
            getImpl().O(z10);
            requestLayout();
        }
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z10) {
        return this.f26591q.setExpanded(z10);
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.f26591q.setExpandedComponentIdHint(i10);
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().P(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().c0();
            if (this.f26579e != null) {
                g();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        this.f26590p.setImageResource(i10);
        g();
    }

    public void setMaxImageSize(int i10) {
        this.f26586l = i10;
        getImpl().S(i10);
    }

    public void setRippleColor(@ColorInt int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().H();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().W(z10);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().X(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().Y(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f26584j = 0;
        if (i10 != this.f26583i) {
            this.f26583i = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f26579e != colorStateList) {
            this.f26579e = colorStateList;
            g();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f26580f != mode) {
            this.f26580f = mode;
            g();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().I();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f26587m != z10) {
            this.f26587m = z10;
            getImpl().D();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().p();
    }

    public void show() {
        show(null);
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void hide(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        e(onVisibilityChangedListener, true);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f26581g != colorStateList) {
            this.f26581g = colorStateList;
            getImpl().V(this.f26581g);
        }
    }

    public void show(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        h(onVisibilityChangedListener, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f26576s;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f26588n = new Rect();
        this.f26589o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.FloatingActionButton, i10, i11, new int[0]);
        this.f26577c = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_backgroundTint);
        this.f26578d = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f26581g = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_rippleColor);
        this.f26583i = typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.f26584j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.f26582h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f26587m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0));
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_hideMotionSpec);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11, ShapeAppearanceModel.PILL).build();
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f26590p = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i10);
        this.f26591q = new ExpandableWidgetHelper(this);
        getImpl().X(shapeAppearanceModelBuild);
        getImpl().z(this.f26577c, this.f26578d, this.f26581g, this.f26582h);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().Y(motionSpecCreateFromAttribute);
        getImpl().P(motionSpecCreateFromAttribute2);
        getImpl().O(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
