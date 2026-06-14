package com.bytedance.adsdk.ud.mo;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> qdl = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f16070ud = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> lnr = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f16070ud.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lnr.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.qdl.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void lnr() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.qdl.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void mml() {
        Iterator<Animator.AnimatorPauseListener> it = this.lnr.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void mzz() {
        Iterator<Animator.AnimatorPauseListener> it = this.lnr.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    void qdl(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f16070ud) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f16070ud.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.qdl.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f16070ud.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lnr.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.qdl.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    void ud(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f16070ud) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    void qdl() {
        Iterator<Animator.AnimatorListener> it = this.f16070ud.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void ud() {
        Iterator<Animator.AnimatorListener> it = this.f16070ud.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
