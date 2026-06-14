package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J9\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ5\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b!\u0010\"J5\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/div/core/view2/animations/Scale;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "", "scaleFactor", "pivotX", "pivotY", "<init>", "(FFF)V", "Landroidx/transition/TransitionValues;", "transitionValues", "", "captureStartScaleValues", "(Landroidx/transition/TransitionValues;)V", "captureEndScaleValues", "fallbackValue", "getCapturedScaleX", "(Landroidx/transition/TransitionValues;F)F", "getCapturedScaleY", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "startScaleX", "startScaleY", "endScaleX", "endScaleY", "Landroid/animation/Animator;", "createScaleAnimator", "(Landroid/view/View;FFFF)Landroid/animation/Animator;", "captureStartValues", "captureEndValues", "Landroid/view/ViewGroup;", "sceneRoot", "startValues", "endValues", "onAppear", "(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;", "onDisappear", "F", y.f66058y, "ScaleAnimatorListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Scale extends OutlineAwareVisibility {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float pivotX;
    private final float pivotY;
    private final float scaleFactor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/animations/Scale$Companion;", "", "()V", "NO_SCALE", "", "PIVOT_CENTER", "PROPNAME_SCALE_X", "", "PROPNAME_SCALE_Y", "PROPNAME_SCREEN_POSITION", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/animations/Scale$ScaleAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "nonTransitionScaleX", "", "nonTransitionScaleY", "(Lcom/yandex/div/core/view2/animations/Scale;Landroid/view/View;FF)V", "isPivotSet", "", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ScaleAnimatorListener extends AnimatorListenerAdapter {
        private boolean isPivotSet;
        private final float nonTransitionScaleX;
        private final float nonTransitionScaleY;

        @NotNull
        private final View view;

        public ScaleAnimatorListener(@NotNull View view, float f10, float f11) {
            this.view = view;
            this.nonTransitionScaleX = f10;
            this.nonTransitionScaleY = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            this.view.setScaleX(this.nonTransitionScaleX);
            this.view.setScaleY(this.nonTransitionScaleY);
            if (this.isPivotSet) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.view.resetPivot();
                } else {
                    this.view.setPivotX(r0.getWidth() * 0.5f);
                    this.view.setPivotY(r0.getHeight() * 0.5f);
                }
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            this.view.setVisibility(0);
            if (Scale.this.pivotX == 0.5f && Scale.this.pivotY == 0.5f) {
                return;
            }
            this.isPivotSet = true;
            this.view.setPivotX(r3.getWidth() * Scale.this.pivotX);
            this.view.setPivotY(r3.getHeight() * Scale.this.pivotY);
        }
    }

    public /* synthetic */ Scale(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? 0.5f : f11, (i10 & 4) != 0 ? 0.5f : f12);
    }

    private final void captureEndScaleValues(TransitionValues transitionValues) {
        int mode = getMode();
        if (mode == 1) {
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(1.0f));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(1.0f));
        } else {
            if (mode != 2) {
                return;
            }
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
        }
    }

    private final void captureStartScaleValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        int mode = getMode();
        if (mode == 1) {
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
        } else {
            if (mode != 2) {
                return;
            }
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
    }

    private final Animator createScaleAnimator(View view, float startScaleX, float startScaleY, float endScaleX, float endScaleY) {
        if (startScaleX == endScaleX && startScaleY == endScaleY) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, startScaleX, endScaleX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, startScaleY, endScaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new ScaleAnimatorListener(view, view.getScaleX(), view.getScaleY()));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private final float getCapturedScaleX(TransitionValues transitionValues, float fallbackValue) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:scale:scaleX");
        Float f10 = obj instanceof Float ? (Float) obj : null;
        return f10 != null ? f10.floatValue() : fallbackValue;
    }

    private final float getCapturedScaleY(TransitionValues transitionValues, float fallbackValue) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:scale:scaleY");
        Float f10 = obj instanceof Float ? (Float) obj : null;
        return f10 != null ? f10.floatValue() : fallbackValue;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureEndValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        captureEndScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Scale.captureEndValues.2
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
                transitionValues.values.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureStartValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        captureStartScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Scale.captureStartValues.2
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
                transitionValues.values.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        float capturedScaleX = getCapturedScaleX(startValues, this.scaleFactor);
        float capturedScaleY = getCapturedScaleY(startValues, this.scaleFactor);
        float capturedScaleX2 = getCapturedScaleX(endValues, 1.0f);
        float capturedScaleY2 = getCapturedScaleY(endValues, 1.0f);
        Object obj = endValues.values.get("yandex:scale:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createScaleAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj), capturedScaleX, capturedScaleY, capturedScaleX2, capturedScaleY2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        return createScaleAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, startValues, "yandex:scale:screenPosition"), getCapturedScaleX(startValues, 1.0f), getCapturedScaleY(startValues, 1.0f), getCapturedScaleX(endValues, this.scaleFactor), getCapturedScaleY(endValues, this.scaleFactor));
    }

    public Scale(@FloatRange(from = 0.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        this.scaleFactor = f10;
        this.pivotX = f11;
        this.pivotY = f12;
    }
}
