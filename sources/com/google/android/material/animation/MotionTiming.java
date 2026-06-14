package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class MotionTiming {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f25301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25303e;

    public MotionTiming(long j10, long j11) {
        this.f25301c = null;
        this.f25302d = 0;
        this.f25303e = 1;
        this.f25299a = j10;
        this.f25300b = j11;
    }

    static MotionTiming a(ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        motionTiming.f25302d = valueAnimator.getRepeatCount();
        motionTiming.f25303e = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.f25299a;
    }

    public long getDuration() {
        return this.f25300b;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f25301c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.f25302d;
    }

    public int getRepeatMode() {
        return this.f25303e;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public MotionTiming(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f25302d = 0;
        this.f25303e = 1;
        this.f25299a = j10;
        this.f25300b = j11;
        this.f25301c = timeInterpolator;
    }
}
