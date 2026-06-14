package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class FloatingActionButtonImpl {
    static final TimeInterpolator C = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    private static final int D = R.attr.motionDurationLong2;
    private static final int E = R.attr.motionEasingEmphasizedInterpolator;
    private static final int F = R.attr.motionDurationMedium1;
    private static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] H = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] J = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] K = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] L = {android.R.attr.state_enabled};
    static final int[] M = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ShapeAppearanceModel f26601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    MaterialShapeDrawable f26602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f26603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    BorderDrawable f26604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f26605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f26606f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f26608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f26609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f26610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f26611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StateListAnimator f26612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animator f26613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MotionSpec f26614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MotionSpec f26615o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26617q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f26619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f26620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f26621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final FloatingActionButton f26622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ShadowViewDelegate f26623w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f26607g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f26616p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26618r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Rect f26624x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f26625y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f26626z = new RectF();
    private final Matrix A = new Matrix();

    static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        AlwaysStatefulMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f26622v = floatingActionButton;
        this.f26623w = shadowViewDelegate;
    }

    public static /* synthetic */ void a(FloatingActionButtonImpl floatingActionButtonImpl, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix, ValueAnimator valueAnimator) {
        floatingActionButtonImpl.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        floatingActionButtonImpl.f26622v.setAlpha(AnimationUtils.lerp(f10, f11, 0.0f, 0.2f, fFloatValue));
        floatingActionButtonImpl.f26622v.setScaleX(AnimationUtils.lerp(f12, f13, fFloatValue));
        floatingActionButtonImpl.f26622v.setScaleY(AnimationUtils.lerp(f14, f13, fFloatValue));
        floatingActionButtonImpl.f26616p = AnimationUtils.lerp(f15, f16, fFloatValue);
        floatingActionButtonImpl.g(AnimationUtils.lerp(f15, f16, fFloatValue), matrix);
        floatingActionButtonImpl.f26622v.setImageMatrix(matrix);
    }

    private boolean a0() {
        return this.f26622v.isLaidOut() && !this.f26622v.isInEditMode();
    }

    private void f0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final FloatEvaluator f26635a = new FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public Float evaluate(float f10, Float f11, Float f12) {
                float fFloatValue = this.f26635a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            }
        });
    }

    private void g(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f26622v.getDrawable() == null || this.f26617q == 0) {
            return;
        }
        RectF rectF = this.f26625y;
        RectF rectF2 = this.f26626z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f26617q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f26617q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet h(MotionSpec motionSpec, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26622v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        motionSpec.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f26622v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat2);
        f0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f26622v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat3);
        f0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        g(f12, this.A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f26622v, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f13, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.f26616p = f13;
                return super.evaluate(f13, matrix, matrix2);
            }
        }, new Matrix(this.A));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f26622v.getAlpha();
        final float scaleX = this.f26622v.getScaleX();
        final float scaleY = this.f26622v.getScaleY();
        final float f13 = this.f26616p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FloatingActionButtonImpl.a(this.f26637b, alpha, f10, scaleX, f11, scaleY, f13, f12, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.f26622v.getContext(), i10, this.f26622v.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.f26622v.getContext(), i11, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private StateListAnimator k(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(H, l(f10, f12));
        stateListAnimator.addState(I, l(f10, f11));
        stateListAnimator.addState(J, l(f10, f11));
        stateListAnimator.addState(K, l(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f26622v, "elevation", f10).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f26622v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f26622v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C);
        stateListAnimator.addState(L, animatorSet);
        stateListAnimator.addState(M, l(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator l(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f26622v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f26622v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C);
        return animatorSet;
    }

    boolean A() {
        return this.f26622v.getVisibility() == 0 ? this.f26618r == 1 : this.f26618r != 2;
    }

    boolean B() {
        return this.f26622v.getVisibility() != 0 ? this.f26618r == 2 : this.f26618r != 1;
    }

    void C() {
        MaterialShapeDrawable materialShapeDrawable = this.f26602b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.f26622v, materialShapeDrawable);
        }
    }

    void D() {
        d0();
    }

    void E() {
        ViewTreeObserver viewTreeObserver = this.f26622v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    void F(float f10, float f11, float f12) {
        if (this.f26622v.getStateListAnimator() == this.f26612l) {
            StateListAnimator stateListAnimatorK = k(f10, f11, f12);
            this.f26612l = stateListAnimatorK;
            this.f26622v.setStateListAnimator(stateListAnimatorK);
        }
        if (Z()) {
            d0();
        }
    }

    void G(Rect rect) {
        Preconditions.checkNotNull(this.f26605e, "Didn't initialize content background");
        if (!Z()) {
            this.f26623w.setBackgroundDrawable(this.f26605e);
        } else {
            this.f26623w.setBackgroundDrawable(new InsetDrawable(this.f26605e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        ArrayList arrayList = this.f26621u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InternalTransformationCallback) it.next()).onScaleChanged();
            }
        }
    }

    void I() {
        ArrayList arrayList = this.f26621u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InternalTransformationCallback) it.next()).onTranslationChanged();
            }
        }
    }

    void J(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f26619s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void K(InternalTransformationCallback internalTransformationCallback) {
        ArrayList arrayList = this.f26621u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    void L(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f26602b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.f26604d;
        if (borderDrawable != null) {
            borderDrawable.c(colorStateList);
        }
    }

    void M(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f26602b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    final void N(float f10) {
        if (this.f26608h != f10) {
            this.f26608h = f10;
            F(f10, this.f26609i, this.f26610j);
        }
    }

    void O(boolean z10) {
        this.f26606f = z10;
    }

    final void P(MotionSpec motionSpec) {
        this.f26615o = motionSpec;
    }

    final void Q(float f10) {
        if (this.f26609i != f10) {
            this.f26609i = f10;
            F(this.f26608h, f10, this.f26610j);
        }
    }

    final void R(float f10) {
        this.f26616p = f10;
        Matrix matrix = this.A;
        g(f10, matrix);
        this.f26622v.setImageMatrix(matrix);
    }

    final void S(int i10) {
        if (this.f26617q != i10) {
            this.f26617q = i10;
            c0();
        }
    }

    void T(int i10) {
        this.f26611k = i10;
    }

    final void U(float f10) {
        if (this.f26610j != f10) {
            this.f26610j = f10;
            F(this.f26608h, this.f26609i, f10);
        }
    }

    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f26603c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    void W(boolean z10) {
        this.f26607g = z10;
        d0();
    }

    final void X(ShapeAppearanceModel shapeAppearanceModel) {
        this.f26601a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f26602b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.f26603c;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.f26604d;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    final void Y(MotionSpec motionSpec) {
        this.f26614n = motionSpec;
    }

    boolean Z() {
        return this.f26623w.isCompatPaddingEnabled() || y();
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f26620t == null) {
            this.f26620t = new ArrayList();
        }
        this.f26620t.add(animatorListener);
    }

    void b0(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z10) {
        AnimatorSet animatorSetJ;
        FloatingActionButtonImpl floatingActionButtonImpl;
        if (B()) {
            return;
        }
        Animator animator = this.f26613m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f26614n == null;
        if (!a0()) {
            this.f26622v.internalSetVisibility(0, z10);
            this.f26622v.setAlpha(1.0f);
            this.f26622v.setScaleY(1.0f);
            this.f26622v.setScaleX(1.0f);
            R(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onShown();
                return;
            }
            return;
        }
        if (this.f26622v.getVisibility() != 0) {
            this.f26622v.setAlpha(0.0f);
            this.f26622v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f26622v.setScaleX(z11 ? 0.4f : 0.0f);
            R(z11 ? 0.4f : 0.0f);
        }
        MotionSpec motionSpec = this.f26614n;
        if (motionSpec != null) {
            animatorSetJ = h(motionSpec, 1.0f, 1.0f, 1.0f);
            floatingActionButtonImpl = this;
        } else {
            animatorSetJ = j(1.0f, 1.0f, 1.0f, D, E);
            floatingActionButtonImpl = this;
        }
        animatorSetJ.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl.this.f26618r = 0;
                FloatingActionButtonImpl.this.f26613m = null;
                InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                if (internalVisibilityChangedListener2 != null) {
                    internalVisibilityChangedListener2.onShown();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.f26622v.internalSetVisibility(0, z10);
                FloatingActionButtonImpl.this.f26618r = 2;
                FloatingActionButtonImpl.this.f26613m = animator2;
            }
        });
        ArrayList arrayList = floatingActionButtonImpl.f26619s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetJ.start();
    }

    final void c0() {
        R(this.f26616p);
    }

    final void d0() {
        Rect rect = this.f26624x;
        s(rect);
        G(rect);
        this.f26623w.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    void e(Animator.AnimatorListener animatorListener) {
        if (this.f26619s == null) {
            this.f26619s = new ArrayList();
        }
        this.f26619s.add(animatorListener);
    }

    void e0(float f10) {
        MaterialShapeDrawable materialShapeDrawable = this.f26602b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f10);
        }
    }

    void f(InternalTransformationCallback internalTransformationCallback) {
        if (this.f26621u == null) {
            this.f26621u = new ArrayList();
        }
        this.f26621u.add(internalTransformationCallback);
    }

    BorderDrawable i(int i10, ColorStateList colorStateList) {
        Context context = this.f26622v.getContext();
        BorderDrawable borderDrawable = new BorderDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.f26601a));
        borderDrawable.d(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        borderDrawable.setBorderWidth(i10);
        borderDrawable.c(colorStateList);
        return borderDrawable;
    }

    MaterialShapeDrawable m() {
        return new AlwaysStatefulMaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.f26601a));
    }

    final Drawable n() {
        return this.f26605e;
    }

    float o() {
        return this.f26622v.getElevation();
    }

    boolean p() {
        return this.f26606f;
    }

    final MotionSpec q() {
        return this.f26615o;
    }

    float r() {
        return this.f26609i;
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f26620t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void s(Rect rect) {
        if (this.f26623w.isCompatPaddingEnabled()) {
            int iW = w();
            int iMax = Math.max(iW, (int) Math.ceil(this.f26607g ? o() + this.f26610j : 0.0f));
            int iMax2 = Math.max(iW, (int) Math.ceil(r1 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!y()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f26611k - this.f26622v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    float t() {
        return this.f26610j;
    }

    final ShapeAppearanceModel u() {
        return this.f26601a;
    }

    final MotionSpec v() {
        return this.f26614n;
    }

    int w() {
        if (this.f26606f) {
            return Math.max((this.f26611k - this.f26622v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void x(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z10) {
        FloatingActionButtonImpl floatingActionButtonImpl;
        AnimatorSet animatorSetJ;
        if (A()) {
            return;
        }
        Animator animator = this.f26613m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f26622v.internalSetVisibility(z10 ? 8 : 4, z10);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onHidden();
                return;
            }
            return;
        }
        MotionSpec motionSpec = this.f26615o;
        if (motionSpec != null) {
            animatorSetJ = h(motionSpec, 0.0f, 0.0f, 0.0f);
            floatingActionButtonImpl = this;
        } else {
            floatingActionButtonImpl = this;
            animatorSetJ = floatingActionButtonImpl.j(0.0f, 0.4f, 0.4f, F, G);
        }
        animatorSetJ.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f26627b;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                this.f26627b = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl.this.f26618r = 0;
                FloatingActionButtonImpl.this.f26613m = null;
                if (this.f26627b) {
                    return;
                }
                FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.f26622v;
                boolean z11 = z10;
                floatingActionButton.internalSetVisibility(z11 ? 8 : 4, z11);
                InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                if (internalVisibilityChangedListener2 != null) {
                    internalVisibilityChangedListener2.onHidden();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.f26622v.internalSetVisibility(0, z10);
                FloatingActionButtonImpl.this.f26618r = 1;
                FloatingActionButtonImpl.this.f26613m = animator2;
                this.f26627b = false;
            }
        });
        ArrayList arrayList = floatingActionButtonImpl.f26620t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetJ.start();
    }

    final boolean y() {
        return this.f26606f && this.f26622v.getSizeDimension() < this.f26611k;
    }

    void z(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableM = m();
        this.f26602b = materialShapeDrawableM;
        materialShapeDrawableM.setTintList(colorStateList);
        if (mode != null) {
            this.f26602b.setTintMode(mode);
        }
        this.f26602b.initializeElevationOverlay(this.f26622v.getContext());
        if (i10 > 0) {
            this.f26604d = i(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f26604d), (Drawable) Preconditions.checkNotNull(this.f26602b)});
        } else {
            this.f26604d = null;
            layerDrawable = this.f26602b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), layerDrawable, null);
        this.f26603c = rippleDrawable;
        this.f26605e = rippleDrawable;
    }
}
