package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: loaded from: classes9.dex */
class AnimatorTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f26521a;

    AnimatorTracker() {
    }

    public void cancelCurrent() {
        Animator animator = this.f26521a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.f26521a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.f26521a = animator;
    }
}
