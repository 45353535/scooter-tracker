package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    private static final int B = R.style.Widget_MaterialComponents_BottomAppBar;
    private static final int C = R.attr.motionDurationLong2;
    private static final int D = R.attr.motionEasingEmphasizedInterpolator;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    TransformationCallback A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaterialShapeDrawable f25540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f25541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f25542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f25549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f25551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f25552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f25553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f25555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f25558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Behavior f25559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25562y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    AnimatorListenerAdapter f25563z;

    interface AnimationListener {
        void onAnimationEnd(BottomAppBar bottomAppBar);

        void onAnimationStart(BottomAppBar bottomAppBar);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Rect f25581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private WeakReference f25582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f25583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View.OnLayoutChangeListener f25584t;

        public Behavior() {
            this.f25584t = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f25582r.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.f25581q);
                        int iHeight = Behavior.this.f25581q.height();
                        bottomAppBar.c0(iHeight);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.f25581q)));
                        height = iHeight;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.f25583s == 0) {
                        if (bottomAppBar.f25545h == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += bottomAppBar.f25546i;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += bottomAppBar.f25546i;
                        }
                    }
                    bottomAppBar.b0();
                }
            };
            this.f25581q = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i10) {
            this.f25582r = new WeakReference(bottomAppBar);
            View viewT = bottomAppBar.T();
            if (viewT != null && !viewT.isLaidOut()) {
                BottomAppBar.f0(bottomAppBar, viewT);
                this.f25583s = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewT.getLayoutParams())).bottomMargin;
                if (viewT instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewT;
                    if (bottomAppBar.f25545h == 0 && bottomAppBar.f25549l) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.L(floatingActionButton);
                }
                viewT.addOnLayoutChangeListener(this.f25584t);
                bottomAppBar.b0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i10);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25584t = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f25582r.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.f25581q);
                        int iHeight = Behavior.this.f25581q.height();
                        bottomAppBar.c0(iHeight);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.f25581q)));
                        height = iHeight;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.f25583s == 0) {
                        if (bottomAppBar.f25545h == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += bottomAppBar.f25546i;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += bottomAppBar.f25546i;
                        }
                    }
                    bottomAppBar.b0();
                }
            };
            this.f25581q = new Rect();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MenuAlignmentMode {
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
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
        int f25586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25587c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25586b);
            parcel.writeInt(this.f25587c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25586b = parcel.readInt();
            this.f25587c = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.f25563z);
        floatingActionButton.addOnShowAnimationListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.f25563z.onAnimationStart(animator);
                FloatingActionButton floatingActionButtonS = BottomAppBar.this.S();
                if (floatingActionButtonS != null) {
                    floatingActionButtonS.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.addTransformationCallback(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        Animator animator = this.f25542e;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f25541d;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void O(int i10, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(S(), "translationX", V(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void P(final int i10, final boolean z10, List list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - U(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                public boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.cancelled) {
                        return;
                    }
                    boolean z11 = BottomAppBar.this.f25556s != 0;
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.replaceMenu(bottomAppBar.f25556s);
                    BottomAppBar.this.e0(actionMenuView, i10, z10, z11);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ArrayList arrayList;
        int i10 = this.f25554q - 1;
        this.f25554q = i10;
        if (i10 != 0 || (arrayList = this.f25555r) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimationListener) it.next()).onAnimationEnd(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        ArrayList arrayList;
        int i10 = this.f25554q;
        this.f25554q = i10 + 1;
        if (i10 != 0 || (arrayList = this.f25555r) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimationListener) it.next()).onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton S() {
        View viewT = T();
        if (viewT instanceof FloatingActionButton) {
            return (FloatingActionButton) viewT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View T() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float V(int i10) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (i10 != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((zIsLayoutRtl ? this.f25562y : this.f25561x) + ((this.f25547j == -1 || T() == null) ? this.f25546i : (r6.getMeasuredWidth() / 2) + this.f25547j))) * (zIsLayoutRtl ? -1 : 1);
    }

    private boolean W() {
        FloatingActionButton floatingActionButtonS = S();
        return floatingActionButtonS != null && floatingActionButtonS.isOrWillBeShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10, boolean z10) {
        if (!isLaidOut()) {
            this.f25557t = false;
            replaceMenu(this.f25556s);
            return;
        }
        Animator animator = this.f25542e;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!W()) {
            i10 = 0;
            z10 = false;
        }
        P(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f25542e = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.Q();
                BottomAppBar.this.f25557t = false;
                BottomAppBar.this.f25542e = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.R();
            }
        });
        this.f25542e.start();
    }

    private void Y(int i10) {
        if (this.f25543f == i10 || !isLaidOut()) {
            return;
        }
        Animator animator = this.f25541d;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f25544g == 1) {
            O(i10, arrayList);
        } else {
            N(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), D, AnimationUtils.LINEAR_INTERPOLATOR));
        this.f25541d = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.Q();
                BottomAppBar.this.f25541d = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.R();
            }
        });
        this.f25541d.start();
    }

    private Drawable Z(Drawable drawable) {
        if (drawable == null || this.f25539b == null) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        drawableWrap.setTint(this.f25539b.intValue());
        return drawableWrap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f25542e != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (W()) {
            d0(actionMenuView, this.f25543f, this.f25558u);
        } else {
            d0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        getTopEdgeTreatment().o(getFabTranslationX());
        this.f25540c.setInterpolation((this.f25558u && W() && this.f25545h == 1) ? 1.0f : 0.0f);
        View viewT = T();
        if (viewT != null) {
            viewT.setTranslationY(getFabTranslationY());
            viewT.setTranslationX(getFabTranslationX());
        }
    }

    private void d0(ActionMenuView actionMenuView, int i10, boolean z10) {
        e0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(final ActionMenuView actionMenuView, final int i10, final boolean z10, boolean z11) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public void run() {
                actionMenuView.setTranslationX(BottomAppBar.this.U(r0, i10, z10));
            }
        };
        if (z11) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i10 = bottomAppBar.f25545h;
        if (i10 == 1) {
            layoutParams.anchorGravity = 17 | 48;
        }
        if (i10 == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f25560w;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(getContext(), C, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return V(this.f25543f);
    }

    private float getFabTranslationY() {
        if (this.f25545h == 1) {
            return -getTopEdgeTreatment().e();
        }
        return T() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f25562y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f25561x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f25540c.getShapeAppearanceModel().getTopEdge();
    }

    protected void N(final int i10, List list) {
        FloatingActionButton floatingActionButtonS = S();
        if (floatingActionButtonS == null || floatingActionButtonS.isOrWillBeHidden()) {
            return;
        }
        R();
        floatingActionButtonS.hide(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onHidden(@NonNull FloatingActionButton floatingActionButton) {
                floatingActionButton.setTranslationX(BottomAppBar.this.V(i10));
                floatingActionButton.show(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                    public void onShown(FloatingActionButton floatingActionButton2) {
                        BottomAppBar.this.Q();
                    }
                });
            }
        });
    }

    protected int U(ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f25548k != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = zIsLayoutRtl ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zIsLayoutRtl ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zIsLayoutRtl ? this.f25561x : -this.f25562y;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zIsLayoutRtl) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    public void addOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    boolean c0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().getFabDiameter()) {
            return false;
        }
        getTopEdgeTreatment().setFabDiameter(f10);
        this.f25540c.invalidateSelf();
        return true;
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f25540c.getTintList();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.f25543f;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f25547j;
    }

    public int getFabAnchorMode() {
        return this.f25545h;
    }

    public int getFabAnimationMode() {
        return this.f25544g;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().i();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().j();
    }

    public boolean getHideOnScroll() {
        return this.f25550m;
    }

    public int getMenuAlignmentMode() {
        return this.f25548k;
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f25540c);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            M();
            b0();
            final View viewT = T();
            if (viewT != null && viewT.isLaidOut()) {
                viewT.post(new Runnable() { // from class: com.google.android.material.bottomappbar.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewT.requestLayout();
                    }
                });
            }
        }
        a0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f25543f = savedState.f25586b;
        this.f25558u = savedState.f25587c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25586b = this.f25543f;
        savedState.f25587c = this.f25558u;
        return savedState;
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    public void removeOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void replaceMenu(@MenuRes int i10) {
        if (i10 != 0) {
            this.f25556s = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        this.f25540c.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f10);
            this.f25540c.invalidateSelf();
            b0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f25540c.setElevation(f10);
        getBehavior().setAdditionalHiddenOffsetY(this, this.f25540c.getShadowRadius() - this.f25540c.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, @MenuRes int i11) {
        this.f25556s = i11;
        this.f25557t = true;
        X(i10, this.f25558u);
        Y(i10);
        this.f25543f = i10;
    }

    public void setFabAlignmentModeEndMargin(@Px int i10) {
        if (this.f25547j != i10) {
            this.f25547j = i10;
            b0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f25545h = i10;
        b0();
        View viewT = T();
        if (viewT != null) {
            f0(this, viewT);
            viewT.requestLayout();
            this.f25540c.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f25544g = i10;
    }

    void setFabCornerSize(@Dimension float f10) {
        if (f10 != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f10);
            this.f25540c.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().l(f10);
            this.f25540c.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.f25540c.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f25550m = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f25548k != i10) {
            this.f25548k = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                d0(actionMenuView, this.f25543f, W());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(Z(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.f25539b = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f25559v == null) {
            this.f25559v = new Behavior();
        }
        return this.f25559v;
    }

    public void performHide(boolean z10) {
        getBehavior().slideDown(this, z10);
    }

    public void performShow(boolean z10) {
        getBehavior().slideUp(this, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = B;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f25540c = materialShapeDrawable;
        this.f25554q = 0;
        this.f25556s = 0;
        this.f25557t = false;
        this.f25558u = true;
        this.f25563z = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (BottomAppBar.this.f25557t) {
                    return;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.X(bottomAppBar.f25543f, BottomAppBar.this.f25558u);
            }
        };
        this.A = new TransformationCallback<FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            @Override // com.google.android.material.animation.TransformationCallback
            public void onScaleChanged(@NonNull FloatingActionButton floatingActionButton) {
                BottomAppBar.this.f25540c.setInterpolation((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f25545h == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public void onTranslationChanged(@NonNull FloatingActionButton floatingActionButton) {
                if (BottomAppBar.this.f25545h != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().o(translationX);
                    BottomAppBar.this.f25540c.invalidateSelf();
                }
                float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (BottomAppBar.this.getTopEdgeTreatment().e() != fMax) {
                    BottomAppBar.this.getTopEdgeTreatment().k(fMax);
                    BottomAppBar.this.f25540c.invalidateSelf();
                }
                BottomAppBar.this.f25540c.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
            }
        };
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BottomAppBar, i10, i11, new int[0]);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.BottomAppBar_backgroundTint);
        int i12 = R.styleable.BottomAppBar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f25543f = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.f25544g = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.f25545h = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnchorMode, 1);
        this.f25549l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f25548k = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_menuAlignmentMode, 0);
        this.f25550m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_hideOnScroll, false);
        this.f25551n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f25552o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f25553p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f25547j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_addElevationShadow, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f25546i = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopEdge(new BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        if (z10) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setTintList(colorStateList);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        ViewUtils.doOnApplyWindowInsets(this, attributeSet, i10, i11, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                boolean z11;
                if (BottomAppBar.this.f25551n) {
                    BottomAppBar.this.f25560w = windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean z12 = false;
                if (BottomAppBar.this.f25552o) {
                    z11 = BottomAppBar.this.f25562y != windowInsetsCompat.getSystemWindowInsetLeft();
                    BottomAppBar.this.f25562y = windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    z11 = false;
                }
                if (BottomAppBar.this.f25553p) {
                    boolean z13 = BottomAppBar.this.f25561x != windowInsetsCompat.getSystemWindowInsetRight();
                    BottomAppBar.this.f25561x = windowInsetsCompat.getSystemWindowInsetRight();
                    z12 = z13;
                }
                if (!z11 && !z12) {
                    return windowInsetsCompat;
                }
                BottomAppBar.this.M();
                BottomAppBar.this.b0();
                BottomAppBar.this.a0();
                return windowInsetsCompat;
            }
        });
    }
}
