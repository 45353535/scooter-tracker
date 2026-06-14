package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class SearchBarAnimationHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f27326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f27327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27329g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f27323a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f27324b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f27325c = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27330h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator f27331i = null;

    /* JADX INFO: Access modifiers changed from: private */
    interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    SearchBarAnimationHelper() {
    }

    public static /* synthetic */ void b(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        searchBarAnimationHelper.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(searchBarAnimationHelper.t(searchBar, view), searchBarAnimationHelper.o(searchBar, view, appBarLayout));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.f27331i = null;
            }
        });
        Iterator it = searchBarAnimationHelper.f27324b.iterator();
        while (it.hasNext()) {
            animatorSet.addListener((AnimatorListenerAdapter) it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        searchBarAnimationHelper.f27331i = animatorSet;
    }

    public static /* synthetic */ void c(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        view.setBackground(materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(OnLoadAnimationInvocation onLoadAnimationInvocation) {
        Iterator it = this.f27323a.iterator();
        while (it.hasNext()) {
            onLoadAnimationInvocation.invoke((SearchBar.OnLoadAnimationCallback) it.next());
        }
    }

    private Animator l(final SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).setDuration(250L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                searchBar.setVisibility(0);
                SearchBarAnimationHelper.this.f27329g = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.stopOnLoadAnimation();
            }
        }).getCollapseAnimator();
    }

    private Animator m(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f27330h ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.f27330h ? 500L : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    private List n(View view) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zIsLayoutRtl && (childAt instanceof ActionMenuView)) || (zIsLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private Animator o(final SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).setDuration(300L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.f27328f = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.setVisibility(4);
            }
        }).getExpandAnimator();
    }

    private ExpandCollapseAnimationHelper p(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(q(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(n(view));
    }

    private ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        materialShapeDrawableCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        materialShapeDrawableCreateWithElevationOverlay.setElevation(searchBar.getElevation());
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchBarAnimationHelper.c(materialShapeDrawableCreateWithElevationOverlay, view, valueAnimator);
            }
        };
    }

    private List r(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    private Animator s(SearchBar searchBar) {
        List listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(listR));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    private Animator t(SearchBar searchBar, final View view) {
        List listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(listR));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    private Animator u(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    private Animator v(TextView textView, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    private Animator w(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    boolean A(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f27325c.remove(animatorListenerAdapter);
    }

    boolean B(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f27324b.remove(animatorListenerAdapter);
    }

    boolean C(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f27323a.remove(onLoadAnimationCallback);
    }

    void D(boolean z10) {
        this.f27330h = z10;
    }

    void E(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        Animator animator;
        if (y() && (animator = this.f27331i) != null) {
            animator.cancel();
        }
        this.f27329g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                SearchBarAnimationHelper.this.f27331i = null;
            }
        });
        Iterator it = this.f27325c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener((AnimatorListenerAdapter) it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f27331i = animatorSet;
    }

    void F(final SearchBar searchBar, final View view, final AppBarLayout appBarLayout, final boolean z10) {
        Animator animator;
        if (x() && (animator = this.f27331i) != null) {
            animator.cancel();
        }
        this.f27328f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.c
            @Override // java.lang.Runnable
            public final void run() {
                SearchBarAnimationHelper.b(this.f27396b, searchBar, view, appBarLayout, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void G(SearchBar searchBar) {
        k(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.f
            @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
            public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        final View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator animatorV = v(textView, secondaryActionMenuItemView);
        animatorV.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.k(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.h
                    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                        onLoadAnimationCallback.onAnimationEnd();
                    }
                });
            }
        });
        this.f27326d = animatorV;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: com.google.android.material.search.g
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    animatorV.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            animatorV.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator animatorM = m(centerView);
        this.f27327e = animatorM;
        animatorM.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                centerView.setVisibility(8);
                animatorV.start();
            }
        });
        animatorM.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void H(SearchBar searchBar) {
        Animator animator = this.f27326d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f27327e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    void h(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f27325c.add(animatorListenerAdapter);
    }

    void i(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f27324b.add(animatorListenerAdapter);
    }

    void j(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f27323a.add(onLoadAnimationCallback);
    }

    boolean x() {
        return this.f27329g;
    }

    boolean y() {
        return this.f27328f;
    }

    boolean z() {
        return this.f27330h;
    }
}
