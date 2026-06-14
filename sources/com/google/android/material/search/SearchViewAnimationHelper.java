package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
class SearchViewAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SearchView f27371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f27372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClippableRoundedCornerLayout f27373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f27374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f27375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Toolbar f27376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Toolbar f27377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LinearLayout f27378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f27379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EditText f27380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ImageButton f27381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View f27382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TouchObserverFrameLayout f27383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MaterialMainContainerBackHelper f27384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AnimatorSet f27385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SearchBar f27386p;

    SearchViewAnimationHelper(SearchView searchView) {
        this.f27371a = searchView;
        this.f27372b = searchView.f27342b;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f27343c;
        this.f27373c = clippableRoundedCornerLayout;
        this.f27374d = searchView.f27346f;
        this.f27375e = searchView.f27347g;
        this.f27376f = searchView.f27348h;
        this.f27377g = searchView.f27349i;
        this.f27379i = searchView.f27350j;
        this.f27380j = searchView.f27352l;
        this.f27381k = searchView.f27353m;
        this.f27382l = searchView.f27354n;
        this.f27383m = searchView.f27355o;
        this.f27378h = searchView.f27351k;
        this.f27384n = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    private Animator A(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f27381k));
        return valueAnimatorOfFloat;
    }

    private Animator B(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f27382l, this.f27383m));
        return valueAnimatorOfFloat;
    }

    private Animator C(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(B(z10), E(z10), D(z10));
        return animatorSet;
    }

    private Animator D(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.f27383m));
        return valueAnimatorOfFloat;
    }

    private Animator E(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f27383m.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f27382l));
        return valueAnimatorOfFloat;
    }

    private Animator F(boolean z10) {
        Toolbar toolbar = this.f27377g;
        return Q(z10, toolbar, I(toolbar), J());
    }

    private Animator G(boolean z10) {
        return R(z10, this.f27380j);
    }

    private AnimatorSet H(final boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f27385o == null) {
            animatorSet.playTogether(y(z10), z(z10));
        }
        animatorSet.playTogether(M(z10), L(z10), A(z10), C(z10), K(z10), F(z10), w(z10), G(z10), N(z10), O(z10));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.a0(z10 ? 1.0f : 0.0f);
                SearchViewAnimationHelper.this.f27380j.setAlpha(1.0f);
                if (SearchViewAnimationHelper.this.f27386p != null) {
                    SearchViewAnimationHelper.this.f27386p.getTextView().setAlpha(1.0f);
                }
                SearchViewAnimationHelper.this.f27380j.setClipBounds(null);
                SearchViewAnimationHelper.this.f27373c.resetClipBoundsAndCornerRadii();
                if (z10) {
                    return;
                }
                SearchViewAnimationHelper.this.f27384n.clearExpandedCornerRadii();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.a0(z10 ? 0.0f : 1.0f);
            }
        });
        return animatorSet;
    }

    private int I(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iU = U(this.f27386p);
        return ViewUtils.isLayoutRtl(this.f27386p) ? iU - marginEnd : ((iU + this.f27386p.getWidth()) + marginEnd) - this.f27371a.getWidth();
    }

    private int J() {
        return (V(this.f27386p) + (this.f27386p.getHeight() / 2)) - (this.f27375e.getTop() + (this.f27375e.getHeight() / 2));
    }

    private Animator K(boolean z10) {
        FrameLayout frameLayout = this.f27374d;
        return Q(z10, frameLayout, I(frameLayout), J());
    }

    private Animator L(boolean z10) {
        Rect initialHideToClipBounds = this.f27384n.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.f27384n.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.f27371a);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.f27373c, this.f27386p);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.f27386p.getCornerSize();
        final float[] fArrY = Y(this.f27373c.getCornerRadii(), this.f27384n.getExpandedCornerRadii());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper.g(this.f27405b, cornerSize, fArrY, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    private Animator M(boolean z10) {
        TimeInterpolator timeInterpolator = z10 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f27372b));
        return valueAnimatorOfFloat;
    }

    private Animator N(boolean z10) {
        return R(z10, this.f27379i);
    }

    private AnimatorSet O(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        v(animatorSet);
        t(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet P(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(T());
        q(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    private Animator Q(boolean z10, View view, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i10, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i11, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator R(boolean z10, View view) {
        TextView placeholderTextView = this.f27386p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
            placeholderTextView = this.f27386p.getTextView();
        }
        return Q(z10, view, U(placeholderTextView) - (view.getLeft() + this.f27378h.getLeft()), J());
    }

    private int S(View view, View view2) {
        if (view != null) {
            return U(view) - U(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f27386p.getPaddingStart();
        int iU = U(this.f27386p);
        return ViewUtils.isLayoutRtl(this.f27386p) ? (((iU + this.f27386p.getWidth()) + marginStart) - paddingStart) - this.f27371a.getRight() : (iU - marginStart) + paddingStart;
    }

    private Animator T() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27373c.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f27373c));
        return valueAnimatorOfFloat;
    }

    private int U(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f27371a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    private int V(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f27371a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    private static float[] X(float f10, float[] fArr, float f11) {
        return new float[]{AnimationUtils.lerp(f10, fArr[0], f11), AnimationUtils.lerp(f10, fArr[1], f11), AnimationUtils.lerp(f10, fArr[2], f11), AnimationUtils.lerp(f10, fArr[3], f11), AnimationUtils.lerp(f10, fArr[4], f11), AnimationUtils.lerp(f10, fArr[5], f11), AnimationUtils.lerp(f10, fArr[6], f11), AnimationUtils.lerp(f10, fArr[7], f11)};
    }

    private static float[] Y(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    private void Z(float f10) {
        ActionMenuView actionMenuView;
        if (!this.f27371a.isMenuItemsAnimated() || (actionMenuView = ToolbarUtils.getActionMenuView(this.f27376f)) == null) {
            return;
        }
        actionMenuView.setAlpha(f10);
    }

    public static /* synthetic */ void a(SearchViewAnimationHelper searchViewAnimationHelper) {
        searchViewAnimationHelper.f27373c.setTranslationY(r0.getHeight());
        AnimatorSet animatorSetP = searchViewAnimationHelper.P(true);
        animatorSetP.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.f27371a.k()) {
                    SearchViewAnimationHelper.this.f27371a.n();
                }
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f27373c.setVisibility(0);
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.SHOWING);
            }
        });
        animatorSetP.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(float f10) {
        this.f27381k.setAlpha(f10);
        this.f27382l.setAlpha(f10);
        this.f27383m.setAlpha(f10);
        Z(f10);
    }

    public static /* synthetic */ void b(SearchViewAnimationHelper searchViewAnimationHelper, ValueAnimator valueAnimator) {
        searchViewAnimationHelper.f27380j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        searchViewAnimationHelper.f27386p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void b0(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    public static /* synthetic */ void c(SearchViewAnimationHelper searchViewAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
        searchViewAnimationHelper.getClass();
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        searchViewAnimationHelper.f27380j.setClipBounds(rect);
    }

    private void c0(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i10 = 0; i10 < actionMenuView.getChildCount(); i10++) {
                View childAt = actionMenuView.getChildAt(i10);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public static /* synthetic */ void d(SearchViewAnimationHelper searchViewAnimationHelper) {
        AnimatorSet animatorSetH = searchViewAnimationHelper.H(true);
        animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.f27371a.k()) {
                    SearchViewAnimationHelper.this.f27371a.n();
                }
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f27373c.setVisibility(0);
                SearchViewAnimationHelper.this.f27386p.stopOnLoadAnimation();
            }
        });
        animatorSetH.start();
    }

    private void e0() {
        Menu menu = this.f27377g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f27386p.getMenuResId() == -1 || !this.f27371a.isMenuItemsAnimated()) {
            this.f27377g.setVisibility(8);
            return;
        }
        this.f27377g.inflateMenu(this.f27386p.getMenuResId());
        c0(this.f27377g);
        this.f27377g.setVisibility(0);
    }

    public static /* synthetic */ void g(SearchViewAnimationHelper searchViewAnimationHelper, float f10, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        searchViewAnimationHelper.getClass();
        searchViewAnimationHelper.f27373c.updateClipBoundsAndCornerRadii(rect, X(f10, fArr, valueAnimator.getAnimatedFraction()));
    }

    private AnimatorSet h0() {
        if (this.f27371a.k()) {
            this.f27371a.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetH = H(false);
        animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.f27373c.setVisibility(8);
                if (!SearchViewAnimationHelper.this.f27371a.k()) {
                    SearchViewAnimationHelper.this.f27371a.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        animatorSetH.start();
        return animatorSetH;
    }

    private AnimatorSet i0() {
        if (this.f27371a.k()) {
            this.f27371a.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetP = P(false);
        animatorSetP.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.f27373c.setVisibility(8);
                if (!SearchViewAnimationHelper.this.f27371a.k()) {
                    SearchViewAnimationHelper.this.f27371a.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f27371a.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        animatorSetP.start();
        return animatorSetP;
    }

    private void j0() {
        if (this.f27371a.k()) {
            this.f27371a.n();
        }
        this.f27371a.setTransitionState(SearchView.TransitionState.SHOWING);
        e0();
        this.f27380j.setText(this.f27386p.getText());
        EditText editText = this.f27380j;
        editText.setSelection(editText.getText().length());
        this.f27373c.setVisibility(4);
        this.f27373c.post(new Runnable() { // from class: com.google.android.material.search.z
            @Override // java.lang.Runnable
            public final void run() {
                SearchViewAnimationHelper.d(this.f27428b);
            }
        });
    }

    private void k0() {
        if (this.f27371a.k()) {
            final SearchView searchView = this.f27371a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.a0
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.n();
                }
            }, 150L);
        }
        this.f27373c.setVisibility(4);
        this.f27373c.post(new Runnable() { // from class: com.google.android.material.search.b0
            @Override // java.lang.Runnable
            public final void run() {
                SearchViewAnimationHelper.a(this.f27395b);
            }
        });
    }

    private void o(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.f27376f);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(S(ToolbarUtils.getActionMenuView(this.f27386p), actionMenuView), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(J(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void p(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.f27386p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    private void q(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f27376f);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (!this.f27371a.isAnimatedNavigationIcon()) {
            b0(drawableUnwrap);
            return;
        }
        s(animatorSet, drawableUnwrap);
        u(animatorSet, drawableUnwrap);
        p(animatorSet, navigationIconButton);
    }

    private void r(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f27376f);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(S(ToolbarUtils.getNavigationIconButton(this.f27386p), navigationIconButton), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(J(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void s(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.e0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    drawerArrowDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void t(AnimatorSet animatorSet) {
        if (this.f27386p == null || !TextUtils.equals(this.f27380j.getText(), this.f27386p.getText())) {
            return;
        }
        final Rect rect = new Rect(0, 0, this.f27380j.getWidth(), this.f27380j.getHeight());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f27386p.getTextView().getWidth(), this.f27380j.getWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper.c(this.f27401b, rect, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfInt);
    }

    private void u(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            final FadeThroughDrawable fadeThroughDrawable = (FadeThroughDrawable) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void v(AnimatorSet animatorSet) {
        if (this.f27386p == null || TextUtils.equals(this.f27380j.getText(), this.f27386p.getText())) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper.b(this.f27413b, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    private Animator w(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.f27371a.isMenuItemsAnimated()) {
            valueAnimatorOfFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.f27377g), ToolbarUtils.getActionMenuView(this.f27376f)));
        }
        return valueAnimatorOfFloat;
    }

    private AnimatorSet y(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        q(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet z(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        r(animatorSet);
        o(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    AnimatorSet W() {
        return this.f27386p != null ? h0() : i0();
    }

    @RequiresApi(34)
    public void cancelBackProgress() {
        this.f27384n.cancelBackProgress(this.f27386p);
        AnimatorSet animatorSet = this.f27385o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f27385o = null;
    }

    void d0(SearchBar searchBar) {
        this.f27386p = searchBar;
    }

    void f0() {
        if (this.f27386p != null) {
            j0();
        } else {
            k0();
        }
    }

    @RequiresApi(34)
    public void finishBackProgress() {
        this.f27384n.finishBackProgress(W().getTotalDuration(), this.f27386p);
        if (this.f27385o != null) {
            z(false).start();
            this.f27385o.resume();
        }
        this.f27385o = null;
    }

    void g0(BackEventCompat backEventCompat) {
        this.f27384n.startBackProgress(backEventCompat, this.f27386p);
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        return this.f27384n.onHandleBackInvoked();
    }

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
    @RequiresApi(34)
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (backEventCompat.getProgress() <= 0.0f) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.f27384n;
        SearchBar searchBar = this.f27386p;
        materialMainContainerBackHelper.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f27385o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (backEventCompat.getProgress() * this.f27385o.getDuration()));
            return;
        }
        if (this.f27371a.k()) {
            this.f27371a.clearFocusAndHideKeyboard();
        }
        if (this.f27371a.isAnimatedNavigationIcon()) {
            AnimatorSet animatorSetY = y(false);
            this.f27385o = animatorSetY;
            animatorSetY.start();
            this.f27385o.pause();
        }
    }

    MaterialMainContainerBackHelper x() {
        return this.f27384n;
    }
}
