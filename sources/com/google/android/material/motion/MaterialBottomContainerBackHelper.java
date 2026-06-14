package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f26950h;

    public MaterialBottomContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f26949g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f26950h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f26938b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.a() == null) {
            return;
        }
        Animator animatorD = d();
        animatorD.setDuration(this.f26941e);
        animatorD.start();
    }

    public void finishBackProgressNotPersistent(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.TRANSLATION_Y, this.f26938b.getHeight() * this.f26938b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.f26939c, this.f26940d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.f26938b.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        Animator animatorD = d();
        animatorD.setDuration(AnimationUtils.lerp(this.f26939c, this.f26940d, backEventCompat.getProgress()));
        if (animatorListener != null) {
            animatorD.addListener(animatorListener);
        }
        animatorD.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.b(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (super.c(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress());
    }

    @VisibleForTesting
    public void updateBackProgress(float f10) {
        float fInterpolateProgress = interpolateProgress(f10);
        float width = this.f26938b.getWidth();
        float height = this.f26938b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f26949g / width;
        float f12 = this.f26950h / height;
        float fLerp = 1.0f - AnimationUtils.lerp(0.0f, f11, fInterpolateProgress);
        float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f12, fInterpolateProgress);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2)) {
            return;
        }
        this.f26938b.setScaleX(fLerp);
        this.f26938b.setPivotY(height);
        this.f26938b.setScaleY(fLerp2);
        View view = this.f26938b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }
}
