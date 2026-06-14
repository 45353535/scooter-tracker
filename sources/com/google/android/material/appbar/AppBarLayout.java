package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int C = R.style.Widget_Design_AppBarLayout;
    private final float A;
    private Behavior B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WindowInsetsCompat f25310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f25311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f25316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WeakReference f25318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f25319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f25320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f25321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LinkedHashSet f25322t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f25323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f25324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f25325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f25327y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Integer f25328z;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f25330l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f25331m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ValueAnimator f25332n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private SavedState f25333o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private WeakReference f25334p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private BaseDragCallback f25335q;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t10);
        }

        public BaseBehavior() {
        }

        private int C(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f10 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
            int size = dependents.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i10).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iG = g() - topInset;
            int iY = y(appBarLayout, iG);
            if (iY >= 0) {
                View childAt = appBarLayout.getChildAt(iY);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iY == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (u(scrollFlags, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (u(scrollFlags, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iG < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (u(scrollFlags, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    p(coordinatorLayout, appBarLayout, MathUtils.clamp(r(iG, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewX = x(appBarLayout, i10);
            boolean zY = false;
            if (viewX != null) {
                int scrollFlags = ((LayoutParams) viewX.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = viewX.getMinimumHeight();
                    if (i11 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i10) < (viewX.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (viewX.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zY = true;
                    }
                }
            }
            if (appBarLayout.isLiftOnScroll()) {
                zY = appBarLayout.y(w(coordinatorLayout));
            }
            boolean zV = appBarLayout.v(zY);
            if (z10 || (zV && H(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void o(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout) {
            if (ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    View viewZ;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                    if (appBarLayout.getTotalScrollRange() == 0 || (viewZ = BaseBehavior.this.z(coordinatorLayout)) == null || !BaseBehavior.this.v(appBarLayout)) {
                        return;
                    }
                    if (BaseBehavior.this.g() != (-appBarLayout.getTotalScrollRange())) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                    }
                    if (BaseBehavior.this.g() != 0) {
                        if (!viewZ.canScrollVertically(-1)) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        } else if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                    if (i10 == 4096) {
                        appBarLayout.setExpanded(false);
                        return true;
                    }
                    if (i10 != 8192) {
                        return super.performAccessibilityAction(view, i10, bundle);
                    }
                    if (BaseBehavior.this.g() != 0) {
                        View viewZ = BaseBehavior.this.z(coordinatorLayout);
                        if (!viewZ.canScrollVertically(-1)) {
                            appBarLayout.setExpanded(true);
                            return true;
                        }
                        int i11 = -appBarLayout.getDownNestedPreScrollRange();
                        if (i11 != 0) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, appBarLayout, viewZ, 0, i11, new int[]{0, 0}, 1);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }

        private void p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(g() - i10);
            float fAbs = Math.abs(f10);
            q(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void q(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i10, int i11) {
            int iG = g();
            if (iG == i10) {
                ValueAnimator valueAnimator = this.f25332n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f25332n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f25332n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f25332n = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.f25332n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator4) {
                        BaseBehavior.this.j(coordinatorLayout, appBarLayout, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f25332n.setDuration(Math.min(i11, 600));
            this.f25332n.setIntValues(iG, i10);
            this.f25332n.start();
        }

        private int r(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean u(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((LayoutParams) appBarLayout.getChildAt(i10).getLayoutParams()).f25349a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View w(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View x(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int y(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (u(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public int e(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public int f(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            I(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.v(appBarLayout.y(w(coordinatorLayout)));
            }
        }

        void E(SavedState savedState, boolean z10) {
            if (this.f25333o == null || z10) {
                this.f25333o = savedState;
            }
        }

        SavedState F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = topAndBottomOffset == 0;
                    savedState.f25343c = z10;
                    savedState.f25342b = !z10 && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange();
                    savedState.f25344d = i10;
                    savedState.f25346f = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f25345e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public int k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iG = g();
            int i13 = 0;
            if (i11 == 0 || iG < i11 || iG > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f25330l = 0;
            } else {
                int iClamp = MathUtils.clamp(i10, i11, i12);
                if (iG != iClamp) {
                    int iC = appBarLayout.h() ? C(appBarLayout, iClamp) : iClamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iC);
                    int i14 = iG - iClamp;
                    this.f25330l = iClamp - iC;
                    if (topAndBottomOffset) {
                        while (i13 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) appBarLayout.getChildAt(i13).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(appBarLayout, appBarLayout.getChildAt(i13), getTopAndBottomOffset());
                            }
                            i13++;
                        }
                    }
                    if (!topAndBottomOffset && appBarLayout.h()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.q(getTopAndBottomOffset());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    J(coordinatorLayout2, appBarLayout2, iClamp, iClamp < iG ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            o(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int g() {
            return getTopAndBottomOffset() + this.f25330l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean b(AppBarLayout appBarLayout) {
            BaseDragCallback baseDragCallback = this.f25335q;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(appBarLayout);
            }
            WeakReference weakReference = this.f25334p;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.f25335q = baseDragCallback;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10) {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f25333o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            p(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            j(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            p(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            j(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f25342b) {
                j(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f25343c) {
                j(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f25344d);
                j(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f25333o.f25346f ? childAt.getMinimumHeight() + t10.getTopInset() : Math.round(childAt.getHeight() * this.f25333o.f25345e)));
            }
            t10.s();
            this.f25333o = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t10.getTotalScrollRange(), 0));
            J(coordinatorLayout, t10, getTopAndBottomOffset(), 0, true);
            t10.q(getTopAndBottomOffset());
            o(coordinatorLayout, t10);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t10.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.onMeasureChild(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.i(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.isLiftOnScroll()
                if (r7 == 0) goto L34
                boolean r7 = r2.y(r9)
                r2.v(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t11;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
                iArr[1] = i(coordinatorLayout2, t11, i15, -t10.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
            }
            if (i15 == 0) {
                o(coordinatorLayout2, t11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                E((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t10, this.f25333o.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t10, parcelable);
                this.f25333o = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t10);
            SavedState savedStateF = F(parcelableOnSaveInstanceState, t10);
            return savedStateF == null ? parcelableOnSaveInstanceState : savedStateF;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.isLiftOnScroll() || t10.isLifted() || t(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f25332n) != null) {
                valueAnimator.cancel();
            }
            this.f25334p = null;
            this.f25331m = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10) {
            if (this.f25331m == 0 || i10 == 1) {
                I(coordinatorLayout, t10);
                if (t10.isLiftOnScroll()) {
                    t10.v(t10.y(view));
                }
            }
            this.f25334p = new WeakReference(view);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                @NonNull
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f25342b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f25343c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f25344d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float f25345e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            boolean f25346f;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f25342b = parcel.readByte() != 0;
                this.f25343c = parcel.readByte() != 0;
                this.f25344d = parcel.readInt();
                this.f25345e = parcel.readFloat();
                this.f25346f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f25342b ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f25343c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f25344d);
                parcel.writeFloat(this.f25345e);
                parcel.writeByte(this.f25346f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t10, int i10);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f25347a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f25348b = new Rect();

        private static void a(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10) {
            a(this.f25347a, appBarLayout, view);
            float fAbs = this.f25347a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fClamp = 1.0f - MathUtils.clamp(Math.abs(fAbs / this.f25347a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f25347a.height() * 0.3f) * (1.0f - (fClamp * fClamp)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f25348b);
            this.f25348b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f25348b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f25348b);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ChildScrollEffect f25350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f25351c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25349a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.f25349a = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i10 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f25351c = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private ChildScrollEffect a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        boolean b() {
            int i10 = this.f25349a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.f25350b;
        }

        public int getScrollFlags() {
            return this.f25349a;
        }

        public Interpolator getScrollInterpolator() {
            return this.f25351c;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.f25350b = childScrollEffect;
        }

        public void setScrollFlags(int i10) {
            this.f25349a = i10;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.f25351c = interpolator;
        }

        public void setScrollEffect(int i10) {
            this.f25350b = a(i10);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f25349a = 1;
        }

        public LayoutParams(int i10, int i11, float f10) {
            super(i10, i11, f10);
            this.f25349a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25349a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f25349a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25349a = 1;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f25349a = 1;
            this.f25349a = layoutParams.f25349a;
            this.f25350b = layoutParams.f25350b;
            this.f25351c = layoutParams.f25351c;
        }
    }

    @Deprecated
    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f10, @ColorInt int i10);
    }

    public static abstract class LiftOnScrollProgressListener {
        public abstract void onUpdate(@Dimension float f10, @ColorInt int i10, @FloatRange(from = 0.0d, to = 1.0d) float f11);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i10);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int j(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).g();
            }
            return 0;
        }

        private void k(View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f25330l) + f()) - c(view2));
            }
        }

        private void l(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.v(appBarLayout.y(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float d(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iJ = j(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iJ > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iJ / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int e(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.e(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public AppBarLayout b(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            k(view, view2);
            l(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.onLayoutChild(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout appBarLayoutB = b(coordinatorLayout.getDependencies(view));
            if (appBarLayoutB != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f25392e;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutB.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(float f10, float f11) {
        ValueAnimator valueAnimator = this.f25319q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f25319q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f25323u);
        this.f25319q.setInterpolator(this.f25324v);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f25320r;
        if (animatorUpdateListener != null) {
            this.f25319q.addUpdateListener(animatorUpdateListener);
        }
        this.f25319q.start();
    }

    private void B() {
        setWillNotDraw(!x());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(fFloatValue);
        Drawable drawable = appBarLayout.f25327y;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
        }
        Iterator it = appBarLayout.f25321s.iterator();
        while (it.hasNext()) {
            ((LiftOnScrollListener) it.next()).onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor());
        }
        Iterator it2 = appBarLayout.f25322t.iterator();
        while (it2.hasNext()) {
            ((LiftOnScrollProgressListener) it2.next()).onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor(), fFloatValue / appBarLayout.A);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int iLayer = MaterialColors.layer(appBarLayout.f25326x, colorStateList.getDefaultColor(), fFloatValue);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
        if (appBarLayout.f25327y != null && (num2 = appBarLayout.f25328z) != null && num2.equals(num)) {
            appBarLayout.f25327y.setTint(iLayer);
        }
        if (!appBarLayout.f25321s.isEmpty()) {
            for (LiftOnScrollListener liftOnScrollListener : appBarLayout.f25321s) {
                if (materialShapeDrawable.getFillColor() != null) {
                    liftOnScrollListener.onUpdate(0.0f, iLayer);
                }
            }
        }
        if (appBarLayout.f25322t.isEmpty()) {
            return;
        }
        Iterator it = appBarLayout.f25322t.iterator();
        while (it.hasNext()) {
            ((LiftOnScrollProgressListener) it.next()).onUpdate(0.0f, iLayer, fFloatValue);
        }
    }

    private void c() {
        WeakReference weakReference = this.f25318p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f25318p = null;
    }

    private Integer d() {
        Drawable drawable = this.f25327y;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f25318p == null && (i10 = this.f25317o) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f25317o);
            }
            if (viewFindViewById != null) {
                this.f25318p = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f25318p;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).b()) {
                return true;
            }
        }
        return false;
    }

    private void k(final MaterialShapeDrawable materialShapeDrawable, final ColorStateList colorStateList) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
        this.f25320r = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f25414b, colorStateList, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
    }

    private void l(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.f25320r = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f25418b, materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void m() {
        Behavior behavior = this.B;
        BaseBehavior.SavedState savedStateF = (behavior == null || this.f25305c == -1 || this.f25309g != 0) ? null : behavior.F(AbsSavedState.EMPTY_STATE, this);
        this.f25305c = -1;
        this.f25306d = -1;
        this.f25307e = -1;
        if (savedStateF != null) {
            this.B.E(savedStateF, false);
        }
    }

    private boolean n() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    private MaterialShapeDrawable o(Drawable drawable) {
        if (drawable instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) drawable;
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.setFillColor(colorStateListOrNull);
        return materialShapeDrawable;
    }

    private Drawable p(Context context, Drawable drawable) {
        MaterialShapeDrawable materialShapeDrawableO = o(drawable);
        if (materialShapeDrawableO == null || materialShapeDrawableO.getFillColor() == null) {
            return drawable;
        }
        this.f25326x = materialShapeDrawableO.getFillColor().getDefaultColor();
        ColorStateList colorStateList = this.f25316n;
        if (colorStateList != null) {
            k(materialShapeDrawableO, colorStateList);
            return materialShapeDrawableO;
        }
        l(context, materialShapeDrawableO);
        return materialShapeDrawableO;
    }

    private void t(boolean z10, boolean z11, boolean z12) {
        this.f25309g = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean u(boolean z10) {
        if (this.f25313k == z10) {
            return false;
        }
        this.f25313k = z10;
        refreshDrawableState();
        return true;
    }

    private boolean x() {
        return this.f25327y != null && getTopInset() > 0;
    }

    private boolean z() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.f25321s.add(liftOnScrollListener);
    }

    public void addLiftOnScrollProgressListener(@NonNull LiftOnScrollProgressListener liftOnScrollProgressListener) {
        this.f25322t.add(liftOnScrollProgressListener);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.f25311i == null) {
            this.f25311i = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.f25311i.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.f25311i.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Deprecated
    public void clearLiftOnScrollListener() {
        this.f25321s.clear();
    }

    public void clearLiftOnScrollProgressListener() {
        this.f25322t.clear();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (x()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f25304b);
            this.f25327y.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f25327y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.B = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f25306d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f25349a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f25306d = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f25307e;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i12 = layoutParams.f25349a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f25307e = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f25317o;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f25309g;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f25327y;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f25310h;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f25305c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f25349a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f25305c = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f25308f;
    }

    public boolean isLiftOnScroll() {
        return this.f25315m;
    }

    public boolean isLifted() {
        return this.f25314l;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f25325w == null) {
            this.f25325w = new int[4];
        }
        int[] iArr = this.f25325w;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f25313k;
        int i11 = R.attr.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f25314l) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i12 = R.attr.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f25314l) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && z()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        m();
        this.f25308f = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i14).getLayoutParams()).getScrollInterpolator() != null) {
                this.f25308f = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f25327y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f25312j) {
            return;
        }
        if (!this.f25315m && !i()) {
            z11 = false;
        }
        u(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && z()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m();
    }

    void q(int i10) {
        this.f25304b = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f25311i;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.f25311i.get(i11);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i10);
                }
            }
        }
    }

    WindowInsetsCompat r(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = getFitsSystemWindows() ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.f25310h, windowInsetsCompat2)) {
            this.f25310h = windowInsetsCompat2;
            B();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.f25321s.remove(liftOnScrollListener);
    }

    @CanIgnoreReturnValue
    public boolean removeLiftOnScrollProgressListener(@NonNull LiftOnScrollProgressListener liftOnScrollProgressListener) {
        return this.f25322t.remove(liftOnScrollProgressListener);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List list = this.f25311i;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    void s() {
        this.f25309g = 0;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(p(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setExpanded(boolean z10) {
        setExpanded(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f25315m = z10;
    }

    public void setLiftOnScrollColor(@Nullable ColorStateList colorStateList) {
        if (this.f25316n != colorStateList) {
            this.f25316n = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f25317o = -1;
        if (view == null) {
            c();
        } else {
            this.f25318p = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i10) {
        this.f25317o = i10;
        c();
    }

    public boolean setLiftable(boolean z10) {
        this.f25312j = true;
        return u(z10);
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f25312j = z10;
    }

    public boolean setLifted(boolean z10) {
        return w(z10, true);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    void setPendingAction(int i10) {
        this.f25309g = i10;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f25327y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f25327y = drawable != null ? drawable.mutate() : null;
            this.f25328z = d();
            Drawable drawable3 = this.f25327y;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f25327y.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f25327y, getLayoutDirection());
                this.f25327y.setVisible(getVisibility() == 0, false);
                this.f25327y.setCallback(this);
            }
            B();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i10) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        ViewUtilsLollipop.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f25327y;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    boolean v(boolean z10) {
        return w(z10, !this.f25312j);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25327y;
    }

    boolean w(boolean z10, boolean z11) {
        if (!z11 || this.f25314l == z10) {
            return false;
        }
        this.f25314l = z10;
        refreshDrawableState();
        if (!n()) {
            return true;
        }
        if (this.f25316n != null) {
            A(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f25315m) {
            return true;
        }
        A(z10 ? 0.0f : this.A, z10 ? this.A : 0.0f);
        return true;
    }

    boolean y(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z10, boolean z11) {
        t(z10, z11, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = C;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25305c = -1;
        this.f25306d = -1;
        this.f25307e = -1;
        this.f25309g = 0;
        this.f25321s = new ArrayList();
        this.f25322t = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.a(this);
        }
        ViewUtilsLollipop.c(this, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.AppBarLayout, i10, i11, new int[0]);
        this.f25316n = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.AppBarLayout_liftOnScrollColor);
        this.f25323u = MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.f25324v = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        int i12 = R.styleable.AppBarLayout_expanded;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            t(typedArrayObtainStyledAttributes.getBoolean(i12, false), false, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.AppBarLayout_elevation)) {
            ViewUtilsLollipop.b(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r10, 0));
        }
        setBackground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_android_background));
        if (Build.VERSION.SDK_INT >= 26) {
            int i13 = R.styleable.AppBarLayout_android_keyboardNavigationCluster;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(i13, false));
            }
            int i14 = R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(i14, false));
            }
        }
        this.A = getResources().getDimension(R.dimen.design_appbar_elevation);
        this.f25315m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.f25317o = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AppBarLayout.this.r(windowInsetsCompat);
            }
        });
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
