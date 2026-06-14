package com.mobilefuse.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ:\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/ui/Animations;", "", "()V", "swipeDownAnimation", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "duration", "", "onAnimationEnd", "Lkotlin/Function0;", "swipeUpAnimation", "onAnimationStart", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class Animations {

    @NotNull
    public static final Animations INSTANCE = new Animations();

    private Animations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void swipeDownAnimation$default(Animations animations, View view, long j10, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        animations.swipeDownAnimation(view, j10, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void swipeUpAnimation$default(Animations animations, View view, long j10, Function0 function0, Function0 function02, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        if ((i10 & 8) != 0) {
            function02 = null;
        }
        animations.swipeUpAnimation(view, j10, function0, function02);
    }

    public final void swipeDownAnimation(@NotNull View view, long duration, @Nullable final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, view.getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(duration);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.mobilefuse.sdk.ui.Animations.swipeDownAnimation.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                Function0 function0 = onAnimationEnd;
                if (function0 != null) {
                }
            }
        });
        animatorSet.start();
    }

    public final void swipeUpAnimation(@NotNull View view, final long duration, @Nullable final Function0<Unit> onAnimationEnd, @Nullable final Function0<Unit> onAnimationStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        final ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(duration);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.mobilefuse.sdk.ui.Animations$swipeUpAnimation$$inlined$apply$lambda$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                Function0 function0 = onAnimationEnd;
                if (function0 != null) {
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                Function0 function0 = onAnimationStart;
                if (function0 != null) {
                }
            }
        });
        animatorSet.start();
    }
}
