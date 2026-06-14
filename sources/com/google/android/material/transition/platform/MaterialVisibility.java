package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisibilityAnimatorProvider f28564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VisibilityAnimatorProvider f28565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28566d = new ArrayList();

    protected MaterialVisibility(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.f28564b = visibilityAnimatorProvider;
        this.f28565c = visibilityAnimatorProvider2;
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
        a(arrayList, this.f28564b, viewGroup, view, z10);
        a(arrayList, this.f28565c, viewGroup, view, z10);
        Iterator it = this.f28566d.iterator();
        while (it.hasNext()) {
            a(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z10);
        }
        f(viewGroup.getContext(), z10);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void f(Context context, boolean z10) {
        TransitionUtils.q(this, context, d(z10));
        TransitionUtils.r(this, context, e(z10), c(z10));
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f28566d.add(visibilityAnimatorProvider);
    }

    TimeInterpolator c(boolean z10) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void clearAdditionalAnimatorProvider() {
        this.f28566d.clear();
    }

    int d(boolean z10) {
        return 0;
    }

    int e(boolean z10) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return (P) this.f28564b;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f28565c;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f28566d.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f28565c = visibilityAnimatorProvider;
    }
}
