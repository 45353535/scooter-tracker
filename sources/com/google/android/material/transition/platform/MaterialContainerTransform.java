package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class MaterialContainerTransform extends Transition {
    private static final String A = "MaterialContainerTransform";
    private static final String[] B = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    private static final ProgressThresholdsGroup C = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    private static final ProgressThresholdsGroup D = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    private static final ProgressThresholdsGroup E = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    private static final ProgressThresholdsGroup F = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f28489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f28490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ShapeAppearanceModel f28491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ShapeAppearanceModel f28492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ProgressThresholds f28493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ProgressThresholds f28494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ProgressThresholds f28495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ProgressThresholds f28496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f28497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f28498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f28499z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f28507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f28508b;

        public ProgressThresholds(@FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
            this.f28507a = f10;
            this.f28508b = f11;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getEnd() {
            return this.f28508b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getStart() {
            return this.f28507a;
        }
    }

    private static class ProgressThresholdsGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ProgressThresholds f28509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ProgressThresholds f28510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ProgressThresholds f28511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ProgressThresholds f28512d;

        private ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f28509a = progressThresholds;
            this.f28510b = progressThresholds2;
            this.f28511c = progressThresholds3;
            this.f28512d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TransitionDirection {
    }

    private static final class TransitionDrawable extends Drawable {
        private final ProgressThresholdsGroup A;
        private final FadeModeEvaluator B;
        private final FitModeEvaluator C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private FadeModeResult G;
        private FitModeResult H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f28513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f28514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ShapeAppearanceModel f28515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f28516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f28517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f28518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ShapeAppearanceModel f28519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f28520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f28521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f28522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f28523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f28524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f28525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MaskEvaluator f28526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f28527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f28528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f28529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f28530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f28531s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f28532t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f28533u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final MaterialShapeDrawable f28534v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f28535w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f28536x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f28537y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f28538z;

        private static float d(RectF rectF, float f10) {
            return ((rectF.centerX() / (f10 / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float e(RectF rectF, float f10) {
            return (rectF.centerY() / f10) * 1.5f;
        }

        private void f(Canvas canvas, RectF rectF, Path path, int i10) {
            PointF pointFM = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(pointFM.x, pointFM.y);
            } else {
                path.lineTo(pointFM.x, pointFM.y);
                this.E.setColor(i10);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, int i10) {
            this.E.setColor(i10);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f28526n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f28534v;
            RectF rectF = this.I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f28534v.setElevation(this.J);
            this.f28534v.setShadowVerticalOffset((int) this.K);
            this.f28534v.setShapeAppearanceModel(this.f28526n.c());
            this.f28534v.draw(canvas);
        }

        private void j(Canvas canvas) {
            ShapeAppearanceModel shapeAppearanceModelC = this.f28526n.c();
            if (!shapeAppearanceModelC.isRoundRect(this.I)) {
                canvas.drawPath(this.f28526n.d(), this.f28524l);
            } else {
                float cornerSize = shapeAppearanceModelC.getTopLeftCornerSize().getCornerSize(this.I);
                canvas.drawRoundRect(this.I, cornerSize, cornerSize, this.f28524l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f28523k);
            Rect bounds = getBounds();
            RectF rectF = this.f28537y;
            TransitionUtils.v(canvas, bounds, rectF.left, rectF.top, this.H.f28465b, this.G.f28444b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f28517e.draw(canvas2);
                }
            });
        }

        private void l(Canvas canvas) {
            n(canvas, this.f28522j);
            Rect bounds = getBounds();
            RectF rectF = this.f28535w;
            TransitionUtils.v(canvas, bounds, rectF.left, rectF.top, this.H.f28464a, this.G.f28443a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f28513a.draw(canvas2);
                }
            });
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f10) {
            if (this.L != f10) {
                p(f10);
            }
        }

        private void p(float f10) {
            float f11;
            float f12;
            this.L = f10;
            this.f28525m.setAlpha((int) (this.f28530r ? TransitionUtils.l(0.0f, 255.0f, f10) : TransitionUtils.l(255.0f, 0.0f, f10)));
            this.f28527o.getPosTan(this.f28528p * f10, this.f28529q, null);
            float[] fArr = this.f28529q;
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (f10 > 1.0f || f10 < 0.0f) {
                if (f10 > 1.0f) {
                    f12 = (f10 - 1.0f) / 0.00999999f;
                    f11 = 0.99f;
                } else {
                    f11 = 0.01f;
                    f12 = (f10 / 0.01f) * (-1.0f);
                }
                this.f28527o.getPosTan(this.f28528p * f11, fArr, null);
                float[] fArr2 = this.f28529q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            FitModeResult fitModeResultEvaluate = this.C.evaluate(f10, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28510b.f28507a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28510b.f28508b))).floatValue(), this.f28514b.width(), this.f28514b.height(), this.f28518f.width(), this.f28518f.height());
            this.H = fitModeResultEvaluate;
            RectF rectF = this.f28535w;
            float f17 = fitModeResultEvaluate.f28466c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, fitModeResultEvaluate.f28467d + f16);
            RectF rectF2 = this.f28537y;
            FitModeResult fitModeResult = this.H;
            float f18 = fitModeResult.f28468e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), fitModeResult.f28469f + f16);
            this.f28536x.set(this.f28535w);
            this.f28538z.set(this.f28537y);
            float fFloatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28511c.f28507a))).floatValue();
            float fFloatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28511c.f28508b))).floatValue();
            boolean zShouldMaskStartBounds = this.C.shouldMaskStartBounds(this.H);
            RectF rectF3 = zShouldMaskStartBounds ? this.f28536x : this.f28538z;
            float fM = TransitionUtils.m(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zShouldMaskStartBounds) {
                fM = 1.0f - fM;
            }
            this.C.applyMask(rectF3, fM, this.H);
            this.I = new RectF(Math.min(this.f28536x.left, this.f28538z.left), Math.min(this.f28536x.top, this.f28538z.top), Math.max(this.f28536x.right, this.f28538z.right), Math.max(this.f28536x.bottom, this.f28538z.bottom));
            this.f28526n.b(f10, this.f28515c, this.f28519g, this.f28535w, this.f28536x, this.f28538z, this.A.f28512d);
            this.J = TransitionUtils.l(this.f28516d, this.f28520h, f10);
            float fD = d(this.I, this.f28531s);
            float fE = e(this.I, this.f28532t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f28524l.setShadowLayer(f19, (int) (fD * f19), f20, 754974720);
            this.G = this.B.evaluate(f10, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28509a.f28507a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28509a.f28508b))).floatValue(), 0.35f);
            if (this.f28522j.getColor() != 0) {
                this.f28522j.setAlpha(this.G.f28443a);
            }
            if (this.f28523k.getColor() != 0) {
                this.f28523k.setAlpha(this.G.f28444b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f28525m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f28525m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f28533u && this.J > 0.0f) {
                h(canvas);
            }
            this.f28526n.a(canvas);
            n(canvas, this.f28521i);
            if (this.G.f28445c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f28535w, this.F, -65281);
                g(canvas, this.f28536x, -256);
                g(canvas, this.f28535w, -16711936);
                g(canvas, this.f28538z, -16711681);
                g(canvas, this.f28537y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f10, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z12) {
            Paint paint = new Paint();
            this.f28521i = paint;
            Paint paint2 = new Paint();
            this.f28522j = paint2;
            Paint paint3 = new Paint();
            this.f28523k = paint3;
            this.f28524l = new Paint();
            Paint paint4 = new Paint();
            this.f28525m = paint4;
            this.f28526n = new MaskEvaluator();
            this.f28529q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f28534v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f28513a = view;
            this.f28514b = rectF;
            this.f28515c = shapeAppearanceModel;
            this.f28516d = f10;
            this.f28517e = view2;
            this.f28518f = rectF2;
            this.f28519g = shapeAppearanceModel2;
            this.f28520h = f11;
            this.f28530r = z10;
            this.f28533u = z11;
            this.B = fadeModeEvaluator;
            this.C = fitModeEvaluator;
            this.A = progressThresholdsGroup;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f28531s = r9.widthPixels;
            this.f28532t = r9.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f28535w = rectF3;
            this.f28536x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f28537y = rectF4;
            this.f28538z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f28527o = pathMeasure;
            this.f28528p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f28475b = false;
        this.f28476c = false;
        this.f28477d = false;
        this.f28478e = false;
        this.f28479f = R.id.content;
        this.f28480g = -1;
        this.f28481h = -1;
        this.f28482i = 0;
        this.f28483j = 0;
        this.f28484k = 0;
        this.f28485l = 1375731712;
        this.f28486m = 0;
        this.f28487n = 0;
        this.f28488o = 0;
        this.f28497x = Build.VERSION.SDK_INT >= 28;
        this.f28498y = -1.0f;
        this.f28499z = -1.0f;
    }

    private ProgressThresholdsGroup b(boolean z10) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) ? h(z10, E, F) : h(z10, C, D);
    }

    private static RectF c(View view, View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFH = TransitionUtils.h(view2);
        rectFH.offset(f10, f11);
        return rectFH;
    }

    private static ShapeAppearanceModel d(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.c(g(view, shapeAppearanceModel), rectF);
    }

    private static void e(TransitionValues transitionValues, View view, int i10, ShapeAppearanceModel shapeAppearanceModel) {
        if (i10 != -1) {
            transitionValues.view = TransitionUtils.g(transitionValues.view, i10);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i11 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i11) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i11);
                transitionValues.view.setTag(i11, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!view4.isLaidOut() && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF rectFI = view4.getParent() == null ? TransitionUtils.i(view4) : TransitionUtils.h(view4);
        transitionValues.values.put("materialContainerTransition:bounds", rectFI);
        transitionValues.values.put("materialContainerTransition:shapeAppearance", d(view4, rectFI, shapeAppearanceModel));
    }

    private static float f(float f10, View view) {
        return f10 != -1.0f ? f10 : view.getElevation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ShapeAppearanceModel g(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i10 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i10) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i10);
        }
        Context context = view.getContext();
        int i11 = i(context);
        return i11 != -1 ? ShapeAppearanceModel.builder(context, i11, 0).build() : view instanceof Shapeable ? ((Shapeable) view).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
    }

    private ProgressThresholdsGroup h(boolean z10, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z10) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.e(this.f28493t, progressThresholdsGroup.f28509a), (ProgressThresholds) TransitionUtils.e(this.f28494u, progressThresholdsGroup.f28510b), (ProgressThresholds) TransitionUtils.e(this.f28495v, progressThresholdsGroup.f28511c), (ProgressThresholds) TransitionUtils.e(this.f28496w, progressThresholdsGroup.f28512d));
    }

    private static int i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean j(RectF rectF, RectF rectF2) {
        int i10 = this.f28486m;
        if (i10 == 0) {
            return TransitionUtils.b(rectF2) > TransitionUtils.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f28486m);
    }

    private void k(Context context, boolean z10) {
        TransitionUtils.r(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        TransitionUtils.q(this, context, z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.f28477d) {
            return;
        }
        TransitionUtils.s(this, context, com.google.android.material.R.attr.motionPath);
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f28490q, this.f28481h, this.f28492s);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f28489p, this.f28480g, this.f28491r);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        final View viewF;
        View view = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(A, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = transitionValues.view;
                final View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f28479f == view4.getId()) {
                    viewF = (View) view4.getParent();
                    view = view4;
                } else {
                    viewF = TransitionUtils.f(view4, this.f28479f);
                }
                RectF rectFH = TransitionUtils.h(viewF);
                float f10 = -rectFH.left;
                float f11 = -rectFH.top;
                RectF rectFC = c(viewF, view, f10, f11);
                rectF.offset(f10, f11);
                rectF2.offset(f10, f11);
                boolean zJ = j(rectF, rectF2);
                if (!this.f28478e) {
                    k(view4.getContext(), zJ);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, f(this.f28498y, view2), view3, rectF2, shapeAppearanceModel2, f(this.f28499z, view3), this.f28482i, this.f28483j, this.f28484k, this.f28485l, zJ, this.f28497x, FadeModeEvaluators.a(this.f28487n, zJ), FitModeEvaluators.a(this.f28488o, zJ, rectF, rectF2), b(zJ), this.f28475b);
                transitionDrawable.setBounds(Math.round(rectFC.left), Math.round(rectFC.top), Math.round(rectFC.right), Math.round(rectFC.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        transitionDrawable.o(valueAnimator.getAnimatedFraction());
                    }
                });
                addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(@NonNull Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (MaterialContainerTransform.this.f28476c) {
                            return;
                        }
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        viewF.getOverlay().remove(transitionDrawable);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(@NonNull Transition transition) {
                        viewF.getOverlay().add(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }
                });
                return valueAnimatorOfFloat;
            }
            Log.w(A, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f28482i;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f28479f;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f28484k;
    }

    public float getEndElevation() {
        return this.f28499z;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f28492s;
    }

    @Nullable
    public View getEndView() {
        return this.f28490q;
    }

    @IdRes
    public int getEndViewId() {
        return this.f28481h;
    }

    public int getFadeMode() {
        return this.f28487n;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f28493t;
    }

    public int getFitMode() {
        return this.f28488o;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f28495v;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f28494u;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f28485l;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f28496w;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f28483j;
    }

    public float getStartElevation() {
        return this.f28498y;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f28491r;
    }

    @Nullable
    public View getStartView() {
        return this.f28489p;
    }

    @IdRes
    public int getStartViewId() {
        return this.f28480g;
    }

    public int getTransitionDirection() {
        return this.f28486m;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return B;
    }

    public boolean isDrawDebugEnabled() {
        return this.f28475b;
    }

    public boolean isElevationShadowEnabled() {
        return this.f28497x;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f28476c;
    }

    public void setAllContainerColors(@ColorInt int i10) {
        this.f28482i = i10;
        this.f28483j = i10;
        this.f28484k = i10;
    }

    public void setContainerColor(@ColorInt int i10) {
        this.f28482i = i10;
    }

    public void setDrawDebugEnabled(boolean z10) {
        this.f28475b = z10;
    }

    public void setDrawingViewId(@IdRes int i10) {
        this.f28479f = i10;
    }

    public void setElevationShadowEnabled(boolean z10) {
        this.f28497x = z10;
    }

    public void setEndContainerColor(@ColorInt int i10) {
        this.f28484k = i10;
    }

    public void setEndElevation(float f10) {
        this.f28499z = f10;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f28492s = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f28490q = view;
    }

    public void setEndViewId(@IdRes int i10) {
        this.f28481h = i10;
    }

    public void setFadeMode(int i10) {
        this.f28487n = i10;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28493t = progressThresholds;
    }

    public void setFitMode(int i10) {
        this.f28488o = i10;
    }

    public void setHoldAtEndEnabled(boolean z10) {
        this.f28476c = z10;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f28477d = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28495v = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28494u = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i10) {
        this.f28485l = i10;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28496w = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i10) {
        this.f28483j = i10;
    }

    public void setStartElevation(float f10) {
        this.f28498y = f10;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f28491r = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f28489p = view;
    }

    public void setStartViewId(@IdRes int i10) {
        this.f28480g = i10;
    }

    public void setTransitionDirection(int i10) {
        this.f28486m = i10;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z10) {
        this.f28475b = false;
        this.f28476c = false;
        this.f28477d = false;
        this.f28478e = false;
        this.f28479f = R.id.content;
        this.f28480g = -1;
        this.f28481h = -1;
        this.f28482i = 0;
        this.f28483j = 0;
        this.f28484k = 0;
        this.f28485l = 1375731712;
        this.f28486m = 0;
        this.f28487n = 0;
        this.f28488o = 0;
        this.f28497x = Build.VERSION.SDK_INT >= 28;
        this.f28498y = -1.0f;
        this.f28499z = -1.0f;
        k(context, z10);
        this.f28478e = true;
    }
}
