package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28577b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i10) {
        this.f28576a = i10;
    }

    private static Animator a(View view, View view2, int i10, int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return c(view2, i11 + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return c(view2, translationX - i11, translationX, translationX);
        }
        if (i10 == 48) {
            return d(view2, translationY - i11, translationY, translationY);
        }
        if (i10 == 80) {
            return d(view2, i11 + translationY, translationY, translationY);
        }
        if (i10 == 8388611) {
            return c(view2, f(view) ? i11 + translationX : translationX - i11, translationX, translationX);
        }
        if (i10 == 8388613) {
            return c(view2, f(view) ? translationX - i11 : i11 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator b(View view, View view2, int i10, int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return c(view2, translationX, translationX - i11, translationX);
        }
        if (i10 == 5) {
            return c(view2, translationX, i11 + translationX, translationX);
        }
        if (i10 == 48) {
            return d(view2, translationY, i11 + translationY, translationY);
        }
        if (i10 == 80) {
            return d(view2, translationY, translationY - i11, translationY);
        }
        if (i10 == 8388611) {
            return c(view2, translationX, f(view) ? translationX - i11 : i11 + translationX, translationX);
        }
        if (i10 == 8388613) {
            return c(view2, translationX, f(view) ? i11 + translationX : translationX - i11, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator c(final View view, float f10, float f11, final float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f12);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator d(final View view, float f10, float f11, final float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f12);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int e(Context context) {
        int i10 = this.f28577b;
        return i10 != -1 ? i10 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean f(View view) {
        return view.getLayoutDirection() == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return a(viewGroup, view, this.f28576a, e(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return b(viewGroup, view, this.f28576a, e(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.f28577b;
    }

    public int getSlideEdge() {
        return this.f28576a;
    }

    public void setSlideDistance(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f28577b = i10;
    }

    public void setSlideEdge(int i10) {
        this.f28576a = i10;
    }
}
