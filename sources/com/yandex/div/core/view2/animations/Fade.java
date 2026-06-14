package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J5\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/animations/Fade;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "", "alpha", "<init>", "(F)V", "Landroidx/transition/TransitionValues;", "transitionValues", "fallbackValue", "getCapturedAlpha", "(Landroidx/transition/TransitionValues;F)F", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "startAlpha", "endAlpha", "Landroid/animation/Animator;", "createFadeAnimator", "(Landroid/view/View;FF)Landroid/animation/Animator;", "", "captureStartValues", "(Landroidx/transition/TransitionValues;)V", "captureEndValues", "Landroid/view/ViewGroup;", "sceneRoot", "startValues", "endValues", "onAppear", "(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;", "onDisappear", "F", "getAlpha", "()F", y.f66058y, "FadeAnimatorListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Fade extends OutlineAwareVisibility {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float alpha;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/animations/Fade$Companion;", "", "()V", "PROPNAME_ALPHA", "", "PROPNAME_SCREEN_POSITION", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/animations/Fade$FadeAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "nonTransitionAlpha", "", "(Landroid/view/View;F)V", "isLayerTypeChanged", "", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean isLayerTypeChanged;
        private final float nonTransitionAlpha;

        @NotNull
        private final View view;

        public FadeAnimatorListener(@NotNull View view, float f10) {
            this.view = view;
            this.nonTransitionAlpha = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            this.view.setAlpha(this.nonTransitionAlpha);
            if (this.isLayerTypeChanged) {
                this.view.setLayerType(0, null);
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            this.view.setVisibility(0);
            if (ViewCompat.hasOverlappingRendering(this.view) && this.view.getLayerType() == 0) {
                this.isLayerTypeChanged = true;
                this.view.setLayerType(2, null);
            }
        }
    }

    public Fade(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.alpha = f10;
    }

    private final Animator createFadeAnimator(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        view.setAlpha(startAlpha);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, startAlpha, endAlpha);
        objectAnimatorOfFloat.addListener(new FadeAnimatorListener(view, view.getAlpha()));
        return objectAnimatorOfFloat;
    }

    private final float getCapturedAlpha(TransitionValues transitionValues, float fallbackValue) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:fade:alpha");
        Float f10 = obj instanceof Float ? (Float) obj : null;
        return f10 != null ? f10.floatValue() : fallbackValue;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int mode = getMode();
        if (mode == 1) {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
        } else if (mode == 2) {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        }
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Fade.captureEndValues.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(int[] iArr) {
                invoke2(iArr);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull int[] iArr) {
                transitionValues.values.put("yandex:fade:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int mode = getMode();
        if (mode == 1) {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        } else if (mode == 2) {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
        }
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Fade.captureStartValues.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(int[] iArr) {
                invoke2(iArr);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull int[] iArr) {
                transitionValues.values.put("yandex:fade:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        float capturedAlpha = getCapturedAlpha(startValues, this.alpha);
        float capturedAlpha2 = getCapturedAlpha(endValues, 1.0f);
        Object obj = endValues.values.get("yandex:fade:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createFadeAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj), capturedAlpha, capturedAlpha2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        return createFadeAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, startValues, "yandex:fade:screenPosition"), getCapturedAlpha(startValues, 1.0f), getCapturedAlpha(endValues, this.alpha));
    }
}
