package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f28278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f28279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f28280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f28281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f28282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f28283i;

    protected static class FabTransformationSpec {
        public Positioning positioning;

        @Nullable
        public MotionSpec timings;

        protected FabTransformationSpec() {
        }
    }

    public FabTransformationBehavior() {
        this.f28278d = new Rect();
        this.f28279e = new RectF();
        this.f28280f = new RectF();
        this.f28281g = new int[2];
    }

    private ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private ViewGroup g(View view) {
        View viewFindViewById = view.findViewById(R.id.mtrl_child_content_container);
        return viewFindViewById != null ? B(viewFindViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? B(((ViewGroup) view).getChildAt(0)) : B(view);
    }

    private void h(View view, FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, MotionTiming motionTiming2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fO = o(fabTransformationSpec, motionTiming, f10, f12);
        float fO2 = o(fabTransformationSpec, motionTiming2, f11, f13);
        Rect rect = this.f28278d;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f28279e;
        rectF2.set(rect);
        RectF rectF3 = this.f28280f;
        p(view, rectF3);
        rectF3.offset(fO, fO2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void i(View view, RectF rectF) {
        p(view, rectF);
        rectF.offset(this.f28282h, this.f28283i);
    }

    private Pair j(float f10, float f11, boolean z10, FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f10 == 0.0f || f11 == 0.0f) {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
        }
        return new Pair(timing, timing2);
    }

    private float k(View view, View view2, Positioning positioning) {
        RectF rectF = this.f28279e;
        RectF rectF2 = this.f28280f;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(-m(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float l(View view, View view2, Positioning positioning) {
        RectF rectF = this.f28279e;
        RectF rectF2 = this.f28280f;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(0.0f, -n(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    private float m(View view, View view2, Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f28279e;
        RectF rectF2 = this.f28280f;
        i(view, rectF);
        p(view2, rectF2);
        int i10 = positioning.gravity & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + positioning.xAdjustment;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + positioning.xAdjustment;
    }

    private float n(View view, View view2, Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f28279e;
        RectF rectF2 = this.f28280f;
        i(view, rectF);
        p(view2, rectF2);
        int i10 = positioning.gravity & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + positioning.yAdjustment;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + positioning.yAdjustment;
    }

    private float o(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f10, float f11) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f10, f11, motionTiming.getInterpolator().getInterpolation((((timing.getDelay() + timing.getDuration()) + 17) - delay) / duration));
    }

    private void p(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f28281g);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void q(View view, View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            boolean z12 = view2 instanceof CircularRevealWidget;
            ViewGroup viewGroupG = g(view2);
            if (viewGroupG == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroupG, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
            }
            fabTransformationSpec.timings.getTiming("contentFade").apply(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(View view, View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            int iZ = z(view);
            int i10 = 16777215 & iZ;
            if (z10) {
                if (!z11) {
                    circularRevealWidget.setCircularRevealScrimColor(iZ);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, iZ);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
            fabTransformationSpec.timings.getTiming("color").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void s(View view, View view2, boolean z10, FabTransformationSpec fabTransformationSpec, List list) {
        float fM = m(view, view2, fabTransformationSpec.positioning);
        float fN = n(view, view2, fabTransformationSpec.positioning);
        Pair pairJ = j(fM, fN, z10, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) pairJ.first;
        MotionTiming motionTiming2 = (MotionTiming) pairJ.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fM = this.f28282h;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fN = this.f28283i;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fN);
        motionTiming.apply(objectAnimatorOfFloat);
        motionTiming2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void t(View view, View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(View view, View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, float f10, float f11, List list, List list2) {
        Animator animatorCreateCircularReveal;
        if (view2 instanceof CircularRevealWidget) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            float fK = k(view, view2, fabTransformationSpec.positioning);
            float fL = l(view, view2, fabTransformationSpec.positioning);
            ((FloatingActionButton) view).getMeasuredContentRect(this.f28278d);
            float fWidth = this.f28278d.width() / 2.0f;
            MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
            if (z10) {
                if (!z11) {
                    circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(fK, fL, fWidth));
                }
                if (z11) {
                    fWidth = circularRevealWidget.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget, fK, fL, MathUtils.distanceToFurthestCorner(fK, fL, 0.0f, 0.0f, f10, f11));
                animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                        revealInfo.radius = Float.MAX_VALUE;
                        circularRevealWidget.setRevealInfo(revealInfo);
                    }
                });
                x(view2, timing.getDelay(), (int) fK, (int) fL, fWidth, list);
            } else {
                float f12 = circularRevealWidget.getRevealInfo().radius;
                Animator animatorCreateCircularReveal2 = CircularRevealCompat.createCircularReveal(circularRevealWidget, fK, fL, fWidth);
                int i10 = (int) fK;
                int i11 = (int) fL;
                x(view2, timing.getDelay(), i10, i11, f12, list);
                w(view2, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i10, i11, fWidth, list);
                animatorCreateCircularReveal = animatorCreateCircularReveal2;
            }
            timing.apply(animatorCreateCircularReveal);
            list.add(animatorCreateCircularReveal);
            list2.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(View view, final View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view2.invalidate();
                }
            });
            fabTransformationSpec.timings.getTiming("iconFade").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(null);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                }
            });
        }
    }

    private void w(View view, long j10, long j11, long j12, int i10, int i11, float f10, List list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void x(View view, long j10, int i10, int i11, float f10, List list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void y(View view, View view2, boolean z10, boolean z11, FabTransformationSpec fabTransformationSpec, List list, List list2, RectF rectF) {
        MotionTiming motionTiming;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM = m(view, view2, fabTransformationSpec.positioning);
        float fN = n(view, view2, fabTransformationSpec.positioning);
        Pair pairJ = j(fM, fN, z10, fabTransformationSpec);
        MotionTiming motionTiming2 = (MotionTiming) pairJ.first;
        MotionTiming motionTiming3 = (MotionTiming) pairJ.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fM);
                view2.setTranslationY(-fN);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            h(view2, fabTransformationSpec, motionTiming2, motionTiming3, -fM, -fN, 0.0f, 0.0f, rectF);
            motionTiming2 = motionTiming2;
            motionTiming = motionTiming3;
        } else {
            motionTiming = motionTiming3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fN);
        }
        motionTiming2.apply(objectAnimatorOfFloat);
        motionTiming.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int z(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    protected abstract FabTransformationSpec A(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet f(final View view, final View view2, final boolean z10, boolean z11) {
        FabTransformationSpec fabTransformationSpecA = A(view2.getContext(), z10);
        if (z10) {
            this.f28282h = view.getTranslationX();
            this.f28283i = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t(view, view2, z10, z11, fabTransformationSpecA, arrayList, arrayList2);
        RectF rectF = this.f28279e;
        y(view, view2, z10, z11, fabTransformationSpecA, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        s(view, view2, z10, fabTransformationSpecA, arrayList);
        v(view, view2, z10, z11, fabTransformationSpecA, arrayList, arrayList2);
        u(view, view2, z10, z11, fabTransformationSpecA, fWidth, fHeight, arrayList, arrayList2);
        r(view, view2, z10, z11, fabTransformationSpecA, arrayList, arrayList2);
        q(view, view2, z10, z11, fabTransformationSpecA, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z10) {
                    return;
                }
                view2.setVisibility(4);
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z10) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28278d = new Rect();
        this.f28279e = new RectF();
        this.f28280f = new RectF();
        this.f28281g = new int[2];
    }
}
