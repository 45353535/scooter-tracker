package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f26937a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f26938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f26939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f26940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f26941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BackEventCompat f26942f;

    public MaterialBackAnimationHelper(@NonNull V v10) {
        this.f26938b = v10;
        Context context = v10.getContext();
        this.f26939c = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.f26940d = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, TextFieldImplKt.AnimationDuration);
        this.f26941e = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    protected BackEventCompat a() {
        if (this.f26942f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f26942f;
        this.f26942f = null;
        return backEventCompat;
    }

    protected void b(BackEventCompat backEventCompat) {
        this.f26942f = backEventCompat;
    }

    protected BackEventCompat c(BackEventCompat backEventCompat) {
        if (this.f26942f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f26942f;
        this.f26942f = backEventCompat;
        return backEventCompat2;
    }

    public float interpolateProgress(float f10) {
        return this.f26937a.getInterpolation(f10);
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        BackEventCompat backEventCompat = this.f26942f;
        this.f26942f = null;
        return backEventCompat;
    }
}
