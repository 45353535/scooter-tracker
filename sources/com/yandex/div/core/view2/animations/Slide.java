package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import androidx.transition.e;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0005,-./0B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006Jc\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\"\u0010#J5\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b$\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "", "distance", "slideEdge", "<init>", "(II)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/transition/Transition;", "transition", "Landroidx/transition/TransitionValues;", "values", "viewPositionX", "viewPositionY", "", "startX", "startY", "endX", "endY", "Landroid/animation/TimeInterpolator;", "interpolator", "Landroid/animation/Animator;", "createTranslateAnimator", "(Landroid/view/View;Landroidx/transition/Transition;Landroidx/transition/TransitionValues;IIFFFFLandroid/animation/TimeInterpolator;)Landroid/animation/Animator;", "transitionValues", "", "captureStartValues", "(Landroidx/transition/TransitionValues;)V", "captureEndValues", "Landroid/view/ViewGroup;", "sceneRoot", "startValues", "endValues", "onAppear", "(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;", "onDisappear", "I", "getDistance", "()I", "getSlideEdge", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "slideCalculator", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", y.f66058y, "HorizontalSlideCalculator", "SlideCalculator", "TransitionPositionListener", "VerticalSlideCalculator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Slide extends OutlineAwareVisibility {
    private final int distance;

    @NotNull
    private final SlideCalculator slideCalculator;
    private final int slideEdge;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Slide$Companion$calculatorLeft$1 calculatorLeft = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationX() - Slide.INSTANCE.exactValueBy(distance, view.getRight());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorTop$1 calculatorTop = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationY() - Slide.INSTANCE.exactValueBy(distance, view.getBottom());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorRight$1 calculatorRight = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationX() + Slide.INSTANCE.exactValueBy(distance, sceneRoot.getWidth() - view.getLeft());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorBottom$1 calculatorBottom = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationY() + Slide.INSTANCE.exactValueBy(distance, sceneRoot.getHeight() - view.getTop());
        }
    };

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0005*\u0004\b\u000b\u000e\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$Companion;", "", "()V", "DISTANCE_TO_EDGE", "", "PROPNAME_SCREEN_POSITION", "", "calculatorBottom", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorBottom$1", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorBottom$1;", "calculatorLeft", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorLeft$1", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorLeft$1;", "calculatorRight", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorRight$1", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorRight$1;", "calculatorTop", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorTop$1", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorTop$1;", "exactValueBy", "edgeDistance", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int exactValueBy(int i10, int i11) {
            return i10 == -1 ? i11 : i10;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$HorizontalSlideCalculator;", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "()V", "getGoneY", "", "sceneRoot", "Landroid/view/ViewGroup;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "distance", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationY();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "distance", "", "getGoneY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface SlideCalculator {
        float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance);

        float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$TransitionPositionListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroidx/transition/Transition$TransitionListener;", "Landroid/view/View;", "originalView", "movingView", "", "startX", "startY", "", "terminalX", "terminalY", "<init>", "(Landroid/view/View;Landroid/view/View;IIFF)V", "Landroid/animation/Animator;", "animation", "", "onAnimationCancel", "(Landroid/animation/Animator;)V", "animator", "onAnimationPause", "onAnimationResume", "Landroidx/transition/Transition;", "transition", "onTransitionStart", "(Landroidx/transition/Transition;)V", "onTransitionEnd", "onTransitionCancel", "onTransitionPause", "onTransitionResume", "Landroid/view/View;", "F", "getTerminalX", "()F", "getTerminalY", "I", "", "transitionPosition", "[I", "pausedX", "pausedY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        @NotNull
        private final View movingView;

        @NotNull
        private final View originalView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;

        @Nullable
        private int[] transitionPosition;

        public TransitionPositionListener(@NotNull View view, @NotNull View view2, int i10, int i11, float f10, float f11) {
            this.originalView = view;
            this.movingView = view2;
            this.terminalX = f10;
            this.terminalY = f11;
            this.startX = i10 - a.d(view2.getTranslationX());
            this.startY = i11 - a.d(view2.getTranslationY());
            int i12 = R$id.div_transition_position;
            Object tag = view.getTag(i12);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.transitionPosition = iArr;
            if (iArr != null) {
                view.setTag(i12, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{this.startX + a.d(this.movingView.getTranslationX()), this.startY + a.d(this.movingView.getTranslationY())};
            }
            this.originalView.setTag(R$id.div_transition_position, this.transitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            e.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NotNull Transition transition) {
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            e.b(this, transition, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$VerticalSlideCalculator;", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "()V", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "distance", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int distance) {
            return view.getTranslationX();
        }
    }

    public Slide(int i10, int i11) {
        this.distance = i10;
        this.slideEdge = i11;
        this.slideCalculator = i11 != 3 ? i11 != 5 ? i11 != 48 ? calculatorBottom : calculatorTop : calculatorRight : calculatorLeft;
    }

    private final Animator createTranslateAnimator(View view, Transition transition, TransitionValues values, int viewPositionX, int viewPositionY, float startX, float startY, float endX, float endY, TimeInterpolator interpolator) {
        float f10;
        float f11;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = values.view.getTag(R$id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f10 = (r6[0] - viewPositionX) + translationX;
            f11 = (r6[1] - viewPositionY) + translationY;
        } else {
            f10 = startX;
            f11 = startY;
        }
        int iD = viewPositionX + a.d(f10 - translationX);
        int iD2 = viewPositionY + a.d(f11 - translationY);
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == endX && f11 == endY) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, endX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, endY));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(values.view, view, iD, iD2, translationX, translationY);
        transition.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Slide.captureEndValues.1
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
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Slide.captureStartValues.1
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
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        Object obj = endValues.values.get("yandex:slide:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, iArr), this, endValues, iArr[0], iArr[1], this.slideCalculator.getGoneX(sceneRoot, view, this.distance), this.slideCalculator.getGoneY(sceneRoot, view, this.distance), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        Object obj = startValues.values.get("yandex:slide:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, startValues, "yandex:slide:screenPosition"), this, startValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(sceneRoot, view, this.distance), this.slideCalculator.getGoneY(sceneRoot, view, this.distance), getInterpolator());
    }
}
