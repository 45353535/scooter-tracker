package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f25481n = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f25482o = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f25483p = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f25484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f25487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TimeInterpolator f25488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager f25490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f25491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f25495m;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f25484b = new LinkedHashSet();
        this.f25489g = 0;
        this.f25492j = true;
        this.f25493k = 2;
        this.f25494l = 0;
    }

    public static /* synthetic */ void a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.isScrolledDown()) {
            hideBottomViewOnScrollBehavior.slideUp(view);
        }
    }

    private void f(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f25495m = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f25495m = null;
            }
        });
    }

    private void g(final View view) {
        if (this.f25490h == null) {
            this.f25490h = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f25490h == null || this.f25491i != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.behavior.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.a(this.f25535a, view, z10);
            }
        };
        this.f25491i = touchExplorationStateChangeListener;
        this.f25490h.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view2) {
                if (HideBottomViewOnScrollBehavior.this.f25491i == null || HideBottomViewOnScrollBehavior.this.f25490h == null) {
                    return;
                }
                HideBottomViewOnScrollBehavior.this.f25490h.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f25491i);
                HideBottomViewOnScrollBehavior.this.f25491i = null;
            }
        });
    }

    private void h(View view, int i10) {
        this.f25493k = i10;
        Iterator it = this.f25484b.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).onStateChanged(view, this.f25493k);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f25484b.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f25484b.clear();
    }

    public void disableOnTouchExploration(boolean z10) {
        this.f25492j = z10;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.f25492j;
    }

    public boolean isScrolledDown() {
        return this.f25493k == 1;
    }

    public boolean isScrolledUp() {
        return this.f25493k == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        this.f25489g = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f25485c = MotionUtils.resolveThemeDuration(v10.getContext(), f25481n, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f25486d = MotionUtils.resolveThemeDuration(v10.getContext(), f25482o, 175);
        Context context = v10.getContext();
        int i11 = f25483p;
        this.f25487e = MotionUtils.resolveThemeInterpolator(context, i11, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.f25488f = MotionUtils.resolveThemeInterpolator(v10.getContext(), i11, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        g(v10);
        return super.onLayoutChild(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            slideDown(v10);
        } else if (i11 < 0) {
            slideUp(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f25484b.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v10, @Dimension int i10) {
        this.f25494l = i10;
        if (this.f25493k == 1) {
            v10.setTranslationY(this.f25489g + i10);
        }
    }

    public void slideDown(@NonNull V v10) {
        slideDown(v10, true);
    }

    public void slideUp(@NonNull V v10) {
        slideUp(v10, true);
    }

    public void slideDown(@NonNull V v10, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (isScrolledDown()) {
            return;
        }
        if (this.f25492j && (accessibilityManager = this.f25490h) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f25495m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        h(v10, 1);
        int i10 = this.f25489g + this.f25494l;
        if (z10) {
            f(v10, i10, this.f25486d, this.f25488f);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void slideUp(@NonNull V v10, boolean z10) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f25495m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        h(v10, 2);
        if (z10) {
            f(v10, 0, this.f25485c, this.f25487e);
        } else {
            v10.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25484b = new LinkedHashSet();
        this.f25489g = 0;
        this.f25492j = true;
        this.f25493k = 2;
        this.f25494l = 0;
    }
}
