package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IndeterminateDrawable f27227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List f27228b = new ArrayList();

    protected IndeterminateAnimatorDelegate(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f27228b.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    protected float a(int i10, int i11, int i12) {
        return MathUtils.clamp((i10 - i11) / i12, 0.0f, 1.0f);
    }

    protected void b(IndeterminateDrawable indeterminateDrawable) {
        this.f27227a = indeterminateDrawable;
    }

    abstract void cancelAnimatorImmediately();

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
