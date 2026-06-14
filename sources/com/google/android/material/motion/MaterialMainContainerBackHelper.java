package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f26953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f26954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f26955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f26956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f26957l;

    public MaterialMainContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f26952g = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f26953h = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private float[] f() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f26938b.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.f26938b.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.f26938b.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int width = this.f26938b.getWidth();
        int height = this.f26938b.getHeight();
        int i14 = (i12 == 0 && i13 == 0) ? i(rootWindowInsets, 0) : 0;
        int i15 = width + i12;
        int i16 = (i15 < i10 || i13 != 0) ? 0 : i(rootWindowInsets, 1);
        int i17 = (i15 < i10 || i13 + height < i11) ? 0 : i(rootWindowInsets, 2);
        int i18 = (i12 != 0 || i13 + height < i11) ? 0 : i(rootWindowInsets, 3);
        float f10 = i14;
        float f11 = i16;
        float f12 = i17;
        float f13 = i18;
        return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    private ValueAnimator g(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: com.google.android.material.motion.c
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f10, Object obj, Object obj2) {
                return MaterialMainContainerBackHelper.k((float[]) obj, (float[]) obj2, f10);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), getExpandedCornerRadii());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return valueAnimatorOfObject;
    }

    private AnimatorSet h(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f26938b, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private int i(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static float[] j(float[] fArr, float f10, float f11) {
        return new float[]{AnimationUtils.lerp(fArr[0], f10, f11), AnimationUtils.lerp(fArr[1], f10, f11), AnimationUtils.lerp(fArr[2], f10, f11), AnimationUtils.lerp(fArr[3], f10, f11), AnimationUtils.lerp(fArr[4], f10, f11), AnimationUtils.lerp(fArr[5], f10, f11), AnimationUtils.lerp(fArr[6], f10, f11), AnimationUtils.lerp(fArr[7], f10, f11)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float[] k(float[] fArr, float[] fArr2, float f10) {
        return new float[]{AnimationUtils.lerp(fArr[0], fArr2[0], f10), AnimationUtils.lerp(fArr[1], fArr2[1], f10), AnimationUtils.lerp(fArr[2], fArr2[2], f10), AnimationUtils.lerp(fArr[3], fArr2[3], f10), AnimationUtils.lerp(fArr[4], fArr2[4], f10), AnimationUtils.lerp(fArr[5], fArr2[5], f10), AnimationUtils.lerp(fArr[6], fArr2[6], f10), AnimationUtils.lerp(fArr[7], fArr2[7], f10)};
    }

    private void l() {
        this.f26954i = 0.0f;
        this.f26955j = null;
        this.f26956k = null;
    }

    public void cancelBackProgress(@Nullable View view) {
        if (super.a() == null) {
            return;
        }
        AnimatorSet animatorSetH = h(view);
        View view2 = this.f26938b;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            animatorSetH.playTogether(g((ClippableRoundedCornerLayout) view2));
        }
        animatorSetH.setDuration(this.f26941e);
        animatorSetH.start();
        l();
    }

    public void clearExpandedCornerRadii() {
        this.f26957l = null;
    }

    public void finishBackProgress(long j10, @Nullable View view) {
        AnimatorSet animatorSetH = h(view);
        animatorSetH.setDuration(j10);
        animatorSetH.start();
        l();
    }

    @NonNull
    public float[] getExpandedCornerRadii() {
        if (this.f26957l == null) {
            this.f26957l = f();
        }
        return this.f26957l;
    }

    @Nullable
    public Rect getInitialHideFromClipBounds() {
        return this.f26956k;
    }

    @Nullable
    public Rect getInitialHideToClipBounds() {
        return this.f26955j;
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view) {
        super.b(backEventCompat);
        startBackProgress(backEventCompat.getTouchY(), view);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view, float f10) {
        if (super.c(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f10);
    }

    @VisibleForTesting
    public void startBackProgress(float f10, @Nullable View view) {
        this.f26955j = ViewUtils.calculateRectFromBounds(this.f26938b);
        if (view != null) {
            this.f26956k = ViewUtils.calculateOffsetRectFromBounds(this.f26938b, view);
        }
        this.f26954i = f10;
    }

    @VisibleForTesting
    public void updateBackProgress(float f10, boolean z10, float f11, float f12) {
        float fInterpolateProgress = interpolateProgress(f10);
        float width = this.f26938b.getWidth();
        float height = this.f26938b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = AnimationUtils.lerp(1.0f, 0.9f, fInterpolateProgress);
        float fLerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.f26952g), fInterpolateProgress) * (z10 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fLerp * height)) / 2.0f) - this.f26952g), this.f26953h);
        float f13 = f11 - this.f26954i;
        float fLerp3 = AnimationUtils.lerp(0.0f, fMin, Math.abs(f13) / height) * Math.signum(f13);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2) || Float.isNaN(fLerp3)) {
            return;
        }
        this.f26938b.setScaleX(fLerp);
        this.f26938b.setScaleY(fLerp);
        this.f26938b.setTranslationX(fLerp2);
        this.f26938b.setTranslationY(fLerp3);
        View view = this.f26938b;
        if (view instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) view).updateCornerRadii(j(getExpandedCornerRadii(), f12, fInterpolateProgress));
        }
    }
}
