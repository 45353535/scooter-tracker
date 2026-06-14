package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderThumbAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationEnd", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "hasCanceled", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationRepeat", "onAnimationStart", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderThumbAnimatorListener implements Animator.AnimatorListener {
    private boolean hasCanceled;

    @NotNull
    private final Function1<Boolean, Unit> onAnimationEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderThumbAnimatorListener(@NotNull Function1<? super Boolean, Unit> function1) {
        this.onAnimationEnd = function1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        this.onAnimationEnd.invoke(Boolean.valueOf(this.hasCanceled));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        this.hasCanceled = false;
    }
}
