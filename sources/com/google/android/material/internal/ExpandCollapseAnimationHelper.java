package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ExpandCollapseAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f26748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f26749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f26750c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f26751d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f26752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26755h;

    public ExpandCollapseAnimationHelper(@NonNull View view, @NonNull View view2) {
        this.f26748a = view;
        this.f26749b = view2;
    }

    private void c(Animator animator, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            animator.addListener((AnimatorListenerAdapter) it.next());
        }
    }

    private AnimatorSet d(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(f(z10), g(z10), e(z10));
        return animatorSet;
    }

    private Animator e(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f26749b.getLeft() - this.f26748a.getLeft()) + (this.f26748a.getRight() - this.f26749b.getRight()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.f26751d));
        valueAnimatorOfFloat.setDuration(this.f26753f);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    private Animator f(boolean z10) {
        Rect rectCalculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.f26748a, this.f26754g);
        Rect rectCalculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.f26749b, this.f26755h);
        final Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewUtils.setBoundsFromRect(this.f26882b.f26749b, rect);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f26752e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f26753f);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    private Animator g(boolean z10) {
        List<View> children = ViewUtils.getChildren(this.f26749b);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.f26753f);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull View... viewArr) {
        Collections.addAll(this.f26751d, viewArr);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f26750c.add(animatorListenerAdapter);
        return this;
    }

    @NonNull
    public Animator getCollapseAnimator() {
        AnimatorSet animatorSetD = d(false);
        animatorSetD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandCollapseAnimationHelper.this.f26749b.setVisibility(8);
            }
        });
        c(animatorSetD, this.f26750c);
        return animatorSetD;
    }

    @NonNull
    public Animator getExpandAnimator() {
        AnimatorSet animatorSetD = d(true);
        animatorSetD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandCollapseAnimationHelper.this.f26749b.setVisibility(0);
            }
        });
        c(animatorSetD, this.f26750c);
        return animatorSetD;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f26752e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i10) {
        this.f26754g = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j10) {
        this.f26753f = j10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i10) {
        this.f26755h = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull Collection<View> collection) {
        this.f26751d.addAll(collection);
        return this;
    }
}
