package com.mobilefuse.sdk.ad.rendering.omniad.modifier;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedSizeModifier;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "durationMillis", "", "interpolator", "Landroid/animation/TimeInterpolator;", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;JLandroid/animation/TimeInterpolator;)V", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "cancelAnimators", "", "changeSize", "width", "", "height", "completeAction", "Lkotlin/Function0;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AnimatedSizeModifier implements SizeModifier {

    @Nullable
    private ValueAnimator animator;
    private final long durationMillis;
    private final TimeInterpolator interpolator;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    public AnimatedSizeModifier(@NotNull OmniAdContainer omniAdContainer, long j10, @NotNull TimeInterpolator interpolator) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.omniAdContainer = omniAdContainer;
        this.durationMillis = j10;
        this.interpolator = interpolator;
    }

    private final void cancelAnimators() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier
    public void changeSize(int width, int height, @NotNull final Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        cancelAnimators();
        Point currentSize = getOmniAdContainer().getCurrentSize();
        final float f10 = currentSize.x;
        final float f11 = currentSize.y;
        final float f12 = width - f10;
        final float f13 = height - f11;
        ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.durationMillis);
        this.animator = animator;
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.setInterpolator(this.interpolator);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier.changeSize.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NotNull ValueAnimator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                if (anim != AnimatedSizeModifier.this.getAnimator()) {
                    return;
                }
                OmniAdContainer omniAdContainer = AnimatedSizeModifier.this.getOmniAdContainer();
                float f14 = f10;
                Object animatedValue = anim.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                int iFloatValue = (int) (f14 + (((Float) animatedValue).floatValue() * f12));
                float f15 = f11;
                Object animatedValue2 = anim.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                omniAdContainer.changeSize(iFloatValue, (int) (f15 + (((Float) animatedValue2).floatValue() * f13)));
            }
        });
        animator.addListener(new Animator.AnimatorListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier.changeSize.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimatedSizeModifier.this.setAnimator(null);
                completeAction.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        animator.start();
    }

    @Nullable
    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    public final void setAnimator(@Nullable ValueAnimator valueAnimator) {
        this.animator = valueAnimator;
    }

    public /* synthetic */ AnimatedSizeModifier(OmniAdContainer omniAdContainer, long j10, TimeInterpolator timeInterpolator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(omniAdContainer, (i10 & 2) != 0 ? 500L : j10, (i10 & 4) != 0 ? new FastOutSlowInInterpolator() : timeInterpolator);
    }
}
