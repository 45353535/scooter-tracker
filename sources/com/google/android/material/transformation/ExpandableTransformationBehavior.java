package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f28276c;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean d(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f28276c;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetF = f(view, view2, z10, z12);
        this.f28276c = animatorSetF;
        animatorSetF.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f28276c = null;
            }
        });
        this.f28276c.start();
        if (!z11) {
            this.f28276c.end();
        }
        return true;
    }

    protected abstract AnimatorSet f(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
