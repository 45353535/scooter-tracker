package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f26961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f26962i;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f26960g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f26961h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f26962i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean d(int i10, int i11) {
        return (Gravity.getAbsoluteGravity(i10, this.f26938b.getLayoutDirection()) & i11) == i11;
    }

    private int e(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f26938b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f26938b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f26941e);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i10, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z10 = backEventCompat.getSwipeEdge() == 0;
        boolean zD = d(i10, 3);
        float width = (this.f26938b.getWidth() * this.f26938b.getScaleX()) + e(zD);
        View view = this.f26938b;
        Property property = View.TRANSLATION_X;
        if (zD) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.f26939c, this.f26940d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.f26938b.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z10, i10);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.b(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i10) {
        if (super.c(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }

    @VisibleForTesting
    public void updateBackProgress(float f10, boolean z10, @GravityInt int i10) {
        int right;
        float fInterpolateProgress = interpolateProgress(f10);
        boolean zD = d(i10, 3);
        boolean z11 = z10 == zD;
        int width = this.f26938b.getWidth();
        int height = this.f26938b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f26960g / f11;
            float f14 = this.f26961h / f11;
            float f15 = this.f26962i / f12;
            View view = this.f26938b;
            if (zD) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f14, fInterpolateProgress);
            float f16 = fLerp + 1.0f;
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f15, fInterpolateProgress);
            if (Float.isNaN(f16) || Float.isNaN(fLerp2)) {
                return;
            }
            this.f26938b.setScaleX(f16);
            this.f26938b.setScaleY(fLerp2);
            View view2 = this.f26938b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (zD) {
                        right = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        right = -childAt.getLeft();
                    }
                    childAt.setPivotX(right);
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fLerp : 1.0f;
                    float f18 = fLerp2 != 0.0f ? (f16 / fLerp2) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }
}
