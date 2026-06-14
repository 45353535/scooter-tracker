package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DrawerLayoutUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26968a = Color.alpha(-1728053248);

    @NonNull
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@NonNull final DrawerLayout drawerLayout, @NonNull final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                drawerLayout.closeDrawer(view, false);
                drawerLayout.setScrimColor(-1728053248);
            }
        };
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@NonNull final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(ColorUtils.setAlphaComponent(-1728053248, AnimationUtils.lerp(DrawerLayoutUtils.f26968a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
