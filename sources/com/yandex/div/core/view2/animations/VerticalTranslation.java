package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "translatedValue", "", "stableValue", "(FF)V", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "startValues", "endValues", "onDisappear", "AnimationEndListener", y.f66058y, "TranslationYClipBounds", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerticalTranslation extends OutlineAwareVisibility {
    private final float stableValue;
    private final float translatedValue;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$AnimationEndListener;", "Landroid/animation/AnimatorListenerAdapter;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AnimationEndListener extends AnimatorListenerAdapter {

        @NotNull
        private final View view;

        public AnimationEndListener(@NotNull View view) {
            this.view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            this.view.setTranslationY(0.0f);
            ViewCompat.setClipBounds(this.view, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$TranslationYClipBounds;", "Landroid/util/Property;", "Landroid/view/View;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Landroid/view/View;)V", "clipBounds", "Landroid/graphics/Rect;", "clipFactor", "get", "(Landroid/view/View;)Ljava/lang/Float;", "set", "", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class TranslationYClipBounds extends Property<View, Float> {

        @NotNull
        private final Rect clipBounds;
        private float clipFactor;

        public TranslationYClipBounds(@NotNull View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f10) {
            set(view, f10.floatValue());
        }

        @Override // android.util.Property
        @NotNull
        public Float get(@NotNull View view) {
            return Float.valueOf(this.clipFactor);
        }

        public void set(@NotNull View view, float value) {
            this.clipFactor = value;
            if (value < 0.0f) {
                this.clipBounds.set(0, (int) ((-value) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (value > 0.0f) {
                float f10 = 1;
                this.clipBounds.set(0, 0, view.getWidth(), (int) (((f10 - this.clipFactor) * view.getHeight()) + f10));
            } else {
                this.clipBounds.set(0, 0, view.getWidth(), view.getHeight());
            }
            ViewCompat.setClipBounds(view, this.clipBounds);
        }
    }

    public VerticalTranslation(float f10, float f11) {
        this.translatedValue = f10;
        this.stableValue = f11;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation.captureEndValues.1
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
                transitionValues.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation.captureStartValues.1
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
                transitionValues.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        float height = view.getHeight();
        float f10 = this.translatedValue * height;
        float f11 = this.stableValue * height;
        Object obj = endValues.values.get("yandex:verticalTranslation:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View viewCreateOrGetVisualCopy = ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj);
        viewCreateOrGetVisualCopy.setTranslationY(f10);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(viewCreateOrGetVisualCopy);
        translationYClipBounds.set(viewCreateOrGetVisualCopy, this.translatedValue);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewCreateOrGetVisualCopy, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11), PropertyValuesHolder.ofFloat(translationYClipBounds, this.translatedValue, this.stableValue));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.getViewForAnimate(this, view, sceneRoot, startValues, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.stableValue, this.translatedValue * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.stableValue, this.translatedValue));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return objectAnimatorOfPropertyValuesHolder;
    }
}
