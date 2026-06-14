package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class BaseMotionStrategy implements MotionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtendedFloatingActionButton f26523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f26524c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AnimatorTracker f26525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MotionSpec f26526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MotionSpec f26527f;

    BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.f26523b = extendedFloatingActionButton;
        this.f26522a = extendedFloatingActionButton.getContext();
        this.f26525d = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f26524c.add(animatorListener);
    }

    AnimatorSet b(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.f26523b, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.f26523b, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.f26523b, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.f26523b, ExtendedFloatingActionButton.f26547e0));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.f26523b, ExtendedFloatingActionButton.f26548f0));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.f26523b, ExtendedFloatingActionButton.f26549g0));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.f26523b, ExtendedFloatingActionButton.f26550h0));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.f26523b, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                @Override // android.util.Property
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.W.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f26523b.W.getDefaultColor()))));
                }

                @Override // android.util.Property
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
                    int colorForState = extendedFloatingActionButton.W.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f26523b.W.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f10.floatValue() == 1.0f) {
                        extendedFloatingActionButton.L(extendedFloatingActionButton.W);
                    } else {
                        extendedFloatingActionButton.L(colorStateListValueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
        return b(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec = this.f26527f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f26526e == null) {
            this.f26526e = MotionSpec.createFromResource(this.f26522a, getDefaultMotionSpecResource());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.f26526e);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @NonNull
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f26524c;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @Nullable
    public MotionSpec getMotionSpec() {
        return this.f26527f;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationCancel() {
        this.f26525d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationEnd() {
        this.f26525d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationStart(Animator animator) {
        this.f26525d.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f26524c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f26527f = motionSpec;
    }
}
