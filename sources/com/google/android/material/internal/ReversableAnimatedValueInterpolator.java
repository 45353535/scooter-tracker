package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f26829a;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.f26829a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator of(boolean z10, @NonNull TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f26829a.getInterpolation(f10);
    }
}
