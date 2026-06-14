package q0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends ValueAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f98602b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f98603c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f98604d = new CopyOnWriteArraySet();

    void a() {
        Iterator it = this.f98603c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f98603c.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f98604d.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f98602b.add(animatorUpdateListener);
    }

    void b(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f98603c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void e() {
        Iterator it = this.f98604d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void i() {
        Iterator it = this.f98603c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
        }
    }

    void j() {
        Iterator it = this.f98604d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(this);
        }
    }

    void k(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f98603c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void l() {
        Iterator it = this.f98602b.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f98603c.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f98602b.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f98603c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f98604d.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f98602b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
