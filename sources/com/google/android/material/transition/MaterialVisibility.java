package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisibilityAnimatorProvider f28414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VisibilityAnimatorProvider f28415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28416d = new ArrayList();

    protected MaterialVisibility(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.f28414b = visibilityAnimatorProvider;
        this.f28415c = visibilityAnimatorProvider2;
    }

    private static void a(List list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z10) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z10 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            list.add(animatorCreateAppear);
        }
    }

    private Animator b(ViewGroup viewGroup, View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.f28414b, viewGroup, view, z10);
        a(arrayList, this.f28415c, viewGroup, view, z10);
        Iterator it = this.f28416d.iterator();
        while (it.hasNext()) {
            a(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z10);
        }
        f(viewGroup.getContext(), z10);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void f(Context context, boolean z10) {
        TransitionUtils.p(this, context, d(z10));
        TransitionUtils.q(this, context, e(z10), c(z10));
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f28416d.add(visibilityAnimatorProvider);
    }

    TimeInterpolator c(boolean z10) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void clearAdditionalAnimatorProvider() {
        this.f28416d.clear();
    }

    int d(boolean z10) {
        return 0;
    }

    int e(boolean z10) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return (P) this.f28414b;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f28415c;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f28416d.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f28415c = visibilityAnimatorProvider;
    }
}
