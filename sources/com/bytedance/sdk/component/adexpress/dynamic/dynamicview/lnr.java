package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mo {
    private int aaj;
    private boolean jyq;
    private Runnable oth;
    ObjectAnimator qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    ObjectAnimator f16315ud;

    public lnr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.aaj = 0;
        this.jyq = false;
        this.oth = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                lnr.this.qdl();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.jpc - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.oth, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv
    public void ud() {
        removeCallbacks(this.oth);
        ObjectAnimator objectAnimator = this.qdl;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.qdl.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f16315ud;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f16315ud.cancel();
        }
        super.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl() {
        final View childAt;
        final View childAt2 = getChildAt(this.aaj);
        if (childAt2 == null) {
            return;
        }
        int i10 = this.aaj;
        if (i10 == 0) {
            this.jyq = false;
        }
        if (i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.aaj + 1)).getChildCount() <= 0) {
            this.jyq = true;
            childAt = getChildAt(this.aaj - 1);
            this.qdl = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.f16328wd + getChildAt(this.aaj).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.aaj + 1);
            this.qdl = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.f16328wd + getChildAt(this.aaj).getWidth())) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.qdl.setInterpolator(new LinearInterpolator());
        this.qdl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lnr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.jyq) {
            this.f16315ud = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.f16328wd + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.f16315ud = ObjectAnimator.ofFloat(childAt, "translationX", (this.f16328wd + childAt.getWidth()) / 2, 0.0f);
        }
        this.f16315ud.setInterpolator(new LinearInterpolator());
        this.f16315ud.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lnr.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
            }
        });
        this.qdl.setDuration(500L);
        this.f16315ud.setDuration(500L);
        this.qdl.start();
        this.f16315ud.start();
        if (this.jyq) {
            this.aaj--;
        } else {
            this.aaj++;
        }
        postDelayed(this.oth, 2000L);
    }
}
