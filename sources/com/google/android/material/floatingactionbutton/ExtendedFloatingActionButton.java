package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f26546d0 = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final Property f26547e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final Property f26548f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final Property f26549g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final Property f26550h0;
    private int I;
    private boolean J;
    private final AnimatorTracker K;
    private final MotionStrategy L;
    private final MotionStrategy M;
    private final MotionStrategy N;
    private final MotionStrategy O;
    private final int P;
    private int Q;
    private int R;
    private final CoordinatorLayout.Behavior S;
    private boolean T;
    private boolean U;
    private boolean V;
    protected ColorStateList W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f26551a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f26552b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int f26553c0;

    class ChangeSizeStrategy extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Size f26565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f26566h;

        ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z10) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.f26565g = size;
            this.f26566h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @NonNull
        public AnimatorSet createAnimator() {
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f26565g.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f26565g.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.f26565g.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.f26565g.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z10 = this.f26566h;
                propertyValues5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.b(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return this.f26566h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.U = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f26565g.getLayoutParams().width;
            layoutParams.height = this.f26565g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.T = this.f26566h;
            ExtendedFloatingActionButton.this.U = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.f26566h) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.T = this.f26566h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f26566h) {
                ExtendedFloatingActionButton.this.f26551a0 = layoutParams.width;
                ExtendedFloatingActionButton.this.f26552b0 = layoutParams.height;
            }
            layoutParams.width = this.f26565g.getLayoutParams().width;
            layoutParams.height = this.f26565g.getLayoutParams().height;
            if (this.f26566h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.L(extendedFloatingActionButton.W);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.L(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.f26565g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f26565g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.f26566h == ExtendedFloatingActionButton.this.T || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Rect f26568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OnChangedCallback f26569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private OnChangedCallback f26570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26572f;

        public ExtendedFloatingActionButtonBehavior() {
            this.f26571e = false;
            this.f26572f = true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean c(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f26571e || this.f26572f) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        private boolean e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!c(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f26568b == null) {
                this.f26568b = new Rect();
            }
            Rect rect = this.f26568b;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                d(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!c(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                d(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        protected void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f26572f;
            extendedFloatingActionButton.I(z10 ? 3 : 0, z10 ? this.f26570d : this.f26569c);
        }

        protected void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f26572f;
            extendedFloatingActionButton.I(z10 ? 2 : 1, z10 ? this.f26570d : this.f26569c);
        }

        public boolean isAutoHideEnabled() {
            return this.f26571e;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f26572f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f26571e = z10;
        }

        public void setAutoShrinkEnabled(boolean z10) {
            this.f26572f = z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!b(view)) {
                return false;
            }
            f(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = dependencies.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && f(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i10);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f26571e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f26572f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class HideStrategy extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f26573g;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.f26573g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.I = 0;
            if (this.f26573g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f26573g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.I = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.G();
        }
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.I = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.I = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.H();
        }
    }

    interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f26547e0 = new Property<View, Float>(cls, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f10) {
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
            }
        };
        f26548f0 = new Property<View, Float>(cls, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f10) {
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
            }
        };
        f26549g0 = new Property<View, Float>(cls, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getPaddingStart());
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f10) {
                view.setPaddingRelative(f10.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            }
        };
        f26550h0 = new Property<View, Float>(cls, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getPaddingEnd());
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f10) {
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
            }
        };
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private Size F(int i10) {
        final Size size = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-2, -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.R;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.Q;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ((ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getPaddingStart()) - ExtendedFloatingActionButton.this.getPaddingEnd()) + ExtendedFloatingActionButton.this.Q + ExtendedFloatingActionButton.this.R;
            }
        };
        final Size size2 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (ExtendedFloatingActionButton.this.f26552b0 != -1) {
                    return (ExtendedFloatingActionButton.this.f26552b0 == 0 || ExtendedFloatingActionButton.this.f26552b0 == -2) ? size.getHeight() : ExtendedFloatingActionButton.this.f26552b0;
                }
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || layoutParams.height != -2) {
                    return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
                }
                return size.getHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.f26552b0 == 0 ? -2 : ExtendedFloatingActionButton.this.f26552b0);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.R;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.Q;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getWidth();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || layoutParams.width != -2) {
                    return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
                }
                return size.getWidth();
            }
        };
        return i10 != 1 ? i10 != 2 ? new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.f26552b0 == -1 ? size2.getHeight() : (ExtendedFloatingActionButton.this.f26552b0 == 0 || ExtendedFloatingActionButton.this.f26552b0 == -2) ? size.getHeight() : ExtendedFloatingActionButton.this.f26552b0;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.f26551a0 == 0 ? -2 : ExtendedFloatingActionButton.this.f26551a0, ExtendedFloatingActionButton.this.f26552b0 != 0 ? ExtendedFloatingActionButton.this.f26552b0 : -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.R;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.Q;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.f26551a0 == -1 ? size2.getWidth() : (ExtendedFloatingActionButton.this.f26551a0 == 0 || ExtendedFloatingActionButton.this.f26551a0 == -2) ? size.getWidth() : ExtendedFloatingActionButton.this.f26551a0;
            }
        } : size2 : size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        return getVisibility() == 0 ? this.I == 1 : this.I != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H() {
        return getVisibility() != 0 ? this.I == 2 : this.I != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i10, final OnChangedCallback onChangedCallback) {
        final MotionStrategy motionStrategy;
        if (i10 == 0) {
            motionStrategy = this.N;
        } else if (i10 == 1) {
            motionStrategy = this.O;
        } else if (i10 == 2) {
            motionStrategy = this.L;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i10);
            }
            motionStrategy = this.M;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!K()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        if (i10 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f26551a0 = layoutParams.width;
                this.f26552b0 = layoutParams.height;
            } else {
                this.f26551a0 = getWidth();
                this.f26552b0 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = motionStrategy.createAnimator();
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f26561b;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.f26561b = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                motionStrategy.onAnimationEnd();
                if (this.f26561b) {
                    return;
                }
                motionStrategy.onChange(onChangedCallback);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.f26561b = false;
            }
        });
        Iterator<Animator.AnimatorListener> it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            animatorSetCreateAnimator.addListener(it.next());
        }
        animatorSetCreateAnimator.start();
    }

    private void J() {
        this.W = getTextColors();
    }

    private boolean K() {
        if (this.J) {
            return (isLaidOut() || (!H() && this.V)) && !isInEditMode();
        }
        return false;
    }

    protected void L(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.M.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.O.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.N.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.L.addAnimationListener(animatorListener);
    }

    public void extend() {
        I(3, null);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.S;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    int getCollapsedSize() {
        int i10 = this.P;
        return i10 < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i10;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.M.getMotionSpec();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.O.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.N.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.L.getMotionSpec();
    }

    public void hide() {
        I(1, null);
    }

    public boolean isAnimationEnabled() {
        return this.J;
    }

    public final boolean isExtended() {
        return this.T;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.T && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.T = false;
            this.L.performNow();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.M.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.O.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.N.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.L.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.V = z10;
    }

    public void setAnimationEnabled(boolean z10) {
        this.J = z10;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.M.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i10) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.T == z10) {
            return;
        }
        MotionStrategy motionStrategy = z10 ? this.M : this.L;
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.O.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.T || this.U) {
            return;
        }
        this.Q = getPaddingStart();
        this.R = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.T || this.U) {
            return;
        }
        this.Q = i10;
        this.R = i12;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.N.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.L.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i10) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        J();
    }

    public void show() {
        I(0, null);
    }

    public void shrink() {
        I(2, null);
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
        I(3, onChangedCallback);
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
        I(1, onChangedCallback);
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
        I(0, onChangedCallback);
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
        I(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f26546d0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.I = 0;
        this.J = true;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.K = animatorTracker;
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.N = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.O = hideStrategy;
        this.T = true;
        this.U = false;
        this.V = false;
        Context context2 = getContext();
        this.S = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.ExtendedFloatingActionButton, i10, i11, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.f26553c0 = i12;
        this.Q = getPaddingStart();
        this.R = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, F(i12), true);
        this.M = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(getWidth(), getHeight());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
        }, false);
        this.L = changeSizeStrategy2;
        showStrategy.setMotionSpec(motionSpecCreateFromAttribute);
        hideStrategy.setMotionSpec(motionSpecCreateFromAttribute2);
        changeSizeStrategy.setMotionSpec(motionSpecCreateFromAttribute3);
        changeSizeStrategy2.setMotionSpec(motionSpecCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i10, i11, ShapeAppearanceModel.PILL).build());
        J();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        J();
    }
}
