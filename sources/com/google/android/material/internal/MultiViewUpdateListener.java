package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Listener f26775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View[] f26776c;

    interface Listener {
        void onAnimationUpdate(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener listener, @NonNull View... viewArr) {
        this.f26775b = listener;
        this.f26776c = viewArr;
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new e(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(ValueAnimator valueAnimator, View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new c(), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new b(), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new d(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f26776c) {
            this.f26775b.onAnimationUpdate(valueAnimator, view);
        }
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new e(), collection);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new c(), collection);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new b(), collection);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new d(), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener listener, @NonNull Collection<View> collection) {
        this.f26775b = listener;
        this.f26776c = (View[]) collection.toArray(new View[0]);
    }
}
