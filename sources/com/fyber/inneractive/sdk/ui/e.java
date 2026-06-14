package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f23834a;

    public e(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f23834a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f23834a;
        fyberAdIdentifierLocal.f23806p = null;
        fyberAdIdentifierLocal.f23805o = !fyberAdIdentifierLocal.f23805o;
    }
}
