package com.google.android.material.transition;

import androidx.transition.Transition;
import androidx.transition.e;

/* JADX INFO: loaded from: classes9.dex */
abstract class TransitionListenerAdapter implements Transition.TransitionListener {
    TransitionListenerAdapter() {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
        e.a(this, transition, z10);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
        e.b(this, transition, z10);
    }
}
