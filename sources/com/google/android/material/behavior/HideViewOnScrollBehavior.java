package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f25498p = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f25499q = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f25500r = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HideViewOnScrollDelegate f25501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager f25502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f25503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f25505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f25508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TimeInterpolator f25509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewPropertyAnimator f25513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25514o;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideViewOnScrollBehavior() {
        this.f25504e = true;
        this.f25505f = new LinkedHashSet();
        this.f25510k = 0;
        this.f25511l = 2;
        this.f25512m = 0;
        this.f25514o = false;
    }

    public static /* synthetic */ void a(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f25504e && z10 && hideViewOnScrollBehavior.isScrolledOut()) {
            hideViewOnScrollBehavior.slideIn(view);
        }
    }

    private void f(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f25513n = this.f25501b.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.this.f25513n = null;
            }
        });
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof HideViewOnScrollBehavior) {
            return (HideViewOnScrollBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
    }

    private void g(final View view) {
        if (this.f25502c == null) {
            this.f25502c = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f25502c == null || this.f25503d != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.behavior.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.a(this.f25537a, view, z10);
            }
        };
        this.f25503d = touchExplorationStateChangeListener;
        this.f25502c.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view2) {
                if (HideViewOnScrollBehavior.this.f25503d == null || HideViewOnScrollBehavior.this.f25502c == null) {
                    return;
                }
                HideViewOnScrollBehavior.this.f25502c.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f25503d);
                HideViewOnScrollBehavior.this.f25503d = null;
            }
        });
    }

    private boolean h(int i10) {
        return i10 == 80 || i10 == 81;
    }

    private boolean i(int i10) {
        return i10 == 3 || i10 == 19;
    }

    private void j(View view, int i10) {
        if (this.f25514o) {
            return;
        }
        int i11 = ((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity;
        if (h(i11)) {
            k(1);
        } else {
            k(i(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    private void k(int i10) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.f25501b;
        if (hideViewOnScrollDelegate == null || hideViewOnScrollDelegate.c() != i10) {
            if (i10 == 0) {
                this.f25501b = new HideRightViewOnScrollDelegate();
                return;
            }
            if (i10 == 1) {
                this.f25501b = new HideBottomViewOnScrollDelegate();
                return;
            }
            if (i10 == 2) {
                this.f25501b = new HideLeftViewOnScrollDelegate();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    private void l(View view, int i10) {
        this.f25511l = i10;
        Iterator it = this.f25505f.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).onStateChanged(view, this.f25511l);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f25505f.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f25505f.clear();
    }

    public void disableOnTouchExploration(boolean z10) {
        this.f25504e = z10;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.f25504e;
    }

    public boolean isScrolledIn() {
        return this.f25511l == 2;
    }

    public boolean isScrolledOut() {
        return this.f25511l == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        g(v10);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        j(v10, i10);
        this.f25510k = this.f25501b.a(v10, marginLayoutParams);
        this.f25506g = MotionUtils.resolveThemeDuration(v10.getContext(), f25498p, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f25507h = MotionUtils.resolveThemeDuration(v10.getContext(), f25499q, 175);
        Context context = v10.getContext();
        int i11 = f25500r;
        this.f25508i = MotionUtils.resolveThemeInterpolator(context, i11, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.f25509j = MotionUtils.resolveThemeInterpolator(v10.getContext(), i11, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            slideOut(v10);
        } else if (i11 < 0) {
            slideIn(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f25505f.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffset(@NonNull V v10, @Dimension int i10) {
        this.f25512m = i10;
        if (this.f25511l == 1) {
            this.f25501b.e(v10, this.f25510k, i10);
        }
    }

    public void setViewEdge(int i10) {
        this.f25514o = true;
        k(i10);
    }

    public void slideIn(@NonNull V v10) {
        slideIn(v10, true);
    }

    public void slideOut(@NonNull V v10) {
        slideOut(v10, true);
    }

    public void slideIn(@NonNull V v10, boolean z10) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f25513n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        l(v10, 2);
        int iB = this.f25501b.b();
        if (z10) {
            f(v10, iB, this.f25506g, this.f25508i);
        } else {
            this.f25501b.f(v10, iB);
        }
    }

    public void slideOut(@NonNull V v10, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut()) {
            return;
        }
        if (this.f25504e && (accessibilityManager = this.f25502c) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f25513n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        l(v10, 1);
        int i10 = this.f25510k + this.f25512m;
        if (z10) {
            f(v10, i10, this.f25507h, this.f25509j);
        } else {
            this.f25501b.f(v10, i10);
        }
    }

    public HideViewOnScrollBehavior(int i10) {
        this();
        setViewEdge(i10);
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25504e = true;
        this.f25505f = new LinkedHashSet();
        this.f25510k = 0;
        this.f25511l = 2;
        this.f25512m = 0;
        this.f25514o = false;
    }
}
