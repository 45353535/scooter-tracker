package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class kdv extends mo {
    private int aaj;
    private boolean jyq;
    private Runnable oth;
    ObjectAnimator qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    ObjectAnimator f16312ud;

    public kdv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.aaj = 0;
        this.jyq = false;
        this.oth = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kdv.1
            @Override // java.lang.Runnable
            public void run() {
                kdv.this.qdl();
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
        ObjectAnimator objectAnimator2 = this.f16312ud;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f16312ud.cancel();
        }
        super.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl() {
        final View childAt;
        final View childAt2 = getChildAt(this.aaj);
        int i10 = this.aaj;
        if (i10 == 0) {
            this.jyq = false;
        }
        boolean z10 = i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.aaj + 1)).getChildCount() <= 0;
        if (this.exu.to().mzz().qdl() || !z10) {
            View childAt3 = z10 ? getChildAt((this.aaj + 2) % getChildCount()) : getChildAt((this.aaj + 1) % getChildCount());
            this.qdl = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(this.jpc + getChildAt(this.aaj).getHeight())) / 2);
            if (z10) {
                this.aaj++;
            }
            childAt = childAt3;
        } else {
            this.jyq = true;
            childAt = getChildAt(this.aaj - 1);
            this.qdl = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (this.jpc + getChildAt(this.aaj).getHeight()) / 2);
        }
        this.qdl.setInterpolator(new LinearInterpolator());
        this.qdl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kdv.2
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
            this.f16312ud = ObjectAnimator.ofFloat(childAt, "translationY", (-(this.jpc + childAt.getHeight())) / 2, 0.0f);
        } else {
            this.f16312ud = ObjectAnimator.ofFloat(childAt, "translationY", (this.jpc + childAt.getHeight()) / 2, 0.0f);
        }
        this.f16312ud.setInterpolator(new LinearInterpolator());
        this.f16312ud.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kdv.3
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
        this.f16312ud.setDuration(500L);
        this.qdl.start();
        this.f16312ud.start();
        if (this.jyq) {
            this.aaj--;
        } else {
            int i11 = this.aaj + 1;
            this.aaj = i11;
            this.aaj = i11 % getChildCount();
        }
        postDelayed(this.oth, 3000L);
    }
}
