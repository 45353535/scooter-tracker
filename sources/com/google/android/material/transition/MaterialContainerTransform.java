package com.google.android.material.transition;

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
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
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
    private boolean f28337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f28351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f28352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ShapeAppearanceModel f28353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ShapeAppearanceModel f28354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ProgressThresholds f28355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ProgressThresholds f28356u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ProgressThresholds f28357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ProgressThresholds f28358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f28359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f28360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f28361z;

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
        private final float f28369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f28370b;

        public ProgressThresholds(@FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
            this.f28369a = f10;
            this.f28370b = f11;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getEnd() {
            return this.f28370b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getStart() {
            return this.f28369a;
        }
    }

    private static class ProgressThresholdsGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ProgressThresholds f28371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ProgressThresholds f28372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ProgressThresholds f28373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ProgressThresholds f28374d;

        private ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f28371a = progressThresholds;
            this.f28372b = progressThresholds2;
            this.f28373c = progressThresholds3;
            this.f28374d = progressThresholds4;
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
        private final View f28375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f28376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ShapeAppearanceModel f28377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f28378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f28379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final RectF f28380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ShapeAppearanceModel f28381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f28382h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Paint f28383i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Paint f28384j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Paint f28385k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Paint f28386l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Paint f28387m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MaskEvaluator f28388n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final PathMeasure f28389o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f28390p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final float[] f28391q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f28392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f28393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f28394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f28395u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final MaterialShapeDrawable f28396v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f28397w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f28398x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final RectF f28399y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final RectF f28400z;

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
            canvas.clipPath(this.f28388n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f28396v;
            RectF rectF = this.I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f28396v.setElevation(this.J);
            this.f28396v.setShadowVerticalOffset((int) this.K);
            this.f28396v.setShapeAppearanceModel(this.f28388n.c());
            this.f28396v.draw(canvas);
        }

        private void j(Canvas canvas) {
            ShapeAppearanceModel shapeAppearanceModelC = this.f28388n.c();
            if (!shapeAppearanceModelC.isRoundRect(this.I)) {
                canvas.drawPath(this.f28388n.d(), this.f28386l);
            } else {
                float cornerSize = shapeAppearanceModelC.getTopLeftCornerSize().getCornerSize(this.I);
                canvas.drawRoundRect(this.I, cornerSize, cornerSize, this.f28386l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f28385k);
            Rect bounds = getBounds();
            RectF rectF = this.f28399y;
            TransitionUtils.u(canvas, bounds, rectF.left, rectF.top, this.H.f28327b, this.G.f28306b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f28379e.draw(canvas2);
                }
            });
        }

        private void l(Canvas canvas) {
            n(canvas, this.f28384j);
            Rect bounds = getBounds();
            RectF rectF = this.f28397w;
            TransitionUtils.u(canvas, bounds, rectF.left, rectF.top, this.H.f28326a, this.G.f28305a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.f28375a.draw(canvas2);
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
            this.f28387m.setAlpha((int) (this.f28392r ? TransitionUtils.k(0.0f, 255.0f, f10) : TransitionUtils.k(255.0f, 0.0f, f10)));
            this.f28389o.getPosTan(this.f28390p * f10, this.f28391q, null);
            float[] fArr = this.f28391q;
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
                this.f28389o.getPosTan(this.f28390p * f11, fArr, null);
                float[] fArr2 = this.f28391q;
                f13 += (f13 - fArr2[0]) * f12;
                f14 += (f14 - fArr2[1]) * f12;
            }
            float f15 = f13;
            float f16 = f14;
            FitModeResult fitModeResultEvaluate = this.C.evaluate(f10, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28372b.f28369a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28372b.f28370b))).floatValue(), this.f28376b.width(), this.f28376b.height(), this.f28380f.width(), this.f28380f.height());
            this.H = fitModeResultEvaluate;
            RectF rectF = this.f28397w;
            float f17 = fitModeResultEvaluate.f28328c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, fitModeResultEvaluate.f28329d + f16);
            RectF rectF2 = this.f28399y;
            FitModeResult fitModeResult = this.H;
            float f18 = fitModeResult.f28330e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), fitModeResult.f28331f + f16);
            this.f28398x.set(this.f28397w);
            this.f28400z.set(this.f28399y);
            float fFloatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28373c.f28369a))).floatValue();
            float fFloatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28373c.f28370b))).floatValue();
            boolean zShouldMaskStartBounds = this.C.shouldMaskStartBounds(this.H);
            RectF rectF3 = zShouldMaskStartBounds ? this.f28398x : this.f28400z;
            float fL = TransitionUtils.l(0.0f, 1.0f, fFloatValue, fFloatValue2, f10);
            if (!zShouldMaskStartBounds) {
                fL = 1.0f - fL;
            }
            this.C.applyMask(rectF3, fL, this.H);
            this.I = new RectF(Math.min(this.f28398x.left, this.f28400z.left), Math.min(this.f28398x.top, this.f28400z.top), Math.max(this.f28398x.right, this.f28400z.right), Math.max(this.f28398x.bottom, this.f28400z.bottom));
            this.f28388n.b(f10, this.f28377c, this.f28381g, this.f28397w, this.f28398x, this.f28400z, this.A.f28374d);
            this.J = TransitionUtils.k(this.f28378d, this.f28382h, f10);
            float fD = d(this.I, this.f28393s);
            float fE = e(this.I, this.f28394t);
            float f19 = this.J;
            float f20 = (int) (fE * f19);
            this.K = f20;
            this.f28386l.setShadowLayer(f19, (int) (fD * f19), f20, 754974720);
            this.G = this.B.evaluate(f10, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28371a.f28369a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f28371a.f28370b))).floatValue(), 0.35f);
            if (this.f28384j.getColor() != 0) {
                this.f28384j.setAlpha(this.G.f28305a);
            }
            if (this.f28385k.getColor() != 0) {
                this.f28385k.setAlpha(this.G.f28306b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f28387m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f28387m);
            }
            int iSave = this.D ? canvas.save() : -1;
            if (this.f28395u && this.J > 0.0f) {
                h(canvas);
            }
            this.f28388n.a(canvas);
            n(canvas, this.f28383i);
            if (this.G.f28307c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(iSave);
                f(canvas, this.f28397w, this.F, -65281);
                g(canvas, this.f28398x, -256);
                g(canvas, this.f28397w, -16711936);
                g(canvas, this.f28400z, -16711681);
                g(canvas, this.f28399y, -16776961);
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
            this.f28383i = paint;
            Paint paint2 = new Paint();
            this.f28384j = paint2;
            Paint paint3 = new Paint();
            this.f28385k = paint3;
            this.f28386l = new Paint();
            Paint paint4 = new Paint();
            this.f28387m = paint4;
            this.f28388n = new MaskEvaluator();
            this.f28391q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f28396v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f28375a = view;
            this.f28376b = rectF;
            this.f28377c = shapeAppearanceModel;
            this.f28378d = f10;
            this.f28379e = view2;
            this.f28380f = rectF2;
            this.f28381g = shapeAppearanceModel2;
            this.f28382h = f11;
            this.f28392r = z10;
            this.f28395u = z11;
            this.B = fadeModeEvaluator;
            this.C = fitModeEvaluator;
            this.A = progressThresholdsGroup;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f28393s = r9.widthPixels;
            this.f28394t = r9.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f28397w = rectF3;
            this.f28398x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f28399y = rectF4;
            this.f28400z = new RectF(rectF4);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.f28389o = pathMeasure;
            this.f28390p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.d(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f28337b = false;
        this.f28338c = false;
        this.f28339d = false;
        this.f28340e = false;
        this.f28341f = R.id.content;
        this.f28342g = -1;
        this.f28343h = -1;
        this.f28344i = 0;
        this.f28345j = 0;
        this.f28346k = 0;
        this.f28347l = 1375731712;
        this.f28348m = 0;
        this.f28349n = 0;
        this.f28350o = 0;
        this.f28359x = Build.VERSION.SDK_INT >= 28;
        this.f28360y = -1.0f;
        this.f28361z = -1.0f;
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
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.e(this.f28355t, progressThresholdsGroup.f28371a), (ProgressThresholds) TransitionUtils.e(this.f28356u, progressThresholdsGroup.f28372b), (ProgressThresholds) TransitionUtils.e(this.f28357v, progressThresholdsGroup.f28373c), (ProgressThresholds) TransitionUtils.e(this.f28358w, progressThresholdsGroup.f28374d));
    }

    private static int i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean j(RectF rectF, RectF rectF2) {
        int i10 = this.f28348m;
        if (i10 == 0) {
            return TransitionUtils.b(rectF2) > TransitionUtils.b(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f28348m);
    }

    private void k(Context context, boolean z10) {
        TransitionUtils.q(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        TransitionUtils.p(this, context, z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.f28339d) {
            return;
        }
        TransitionUtils.r(this, context, com.google.android.material.R.attr.motionPath);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f28352q, this.f28343h, this.f28354s);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f28351p, this.f28342g, this.f28353r);
    }

    @Override // androidx.transition.Transition
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
                if (this.f28341f == view4.getId()) {
                    viewF = (View) view4.getParent();
                    view = view4;
                } else {
                    viewF = TransitionUtils.f(view4, this.f28341f);
                }
                RectF rectFH = TransitionUtils.h(viewF);
                float f10 = -rectFH.left;
                float f11 = -rectFH.top;
                RectF rectFC = c(viewF, view, f10, f11);
                rectF.offset(f10, f11);
                rectF2.offset(f10, f11);
                boolean zJ = j(rectF, rectF2);
                if (!this.f28340e) {
                    k(view4.getContext(), zJ);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, f(this.f28360y, view2), view3, rectF2, shapeAppearanceModel2, f(this.f28361z, view3), this.f28344i, this.f28345j, this.f28346k, this.f28347l, zJ, this.f28359x, FadeModeEvaluators.a(this.f28349n, zJ), FitModeEvaluators.a(this.f28350o, zJ, rectF, rectF2), b(zJ), this.f28337b);
                transitionDrawable.setBounds(Math.round(rectFC.left), Math.round(rectFC.top), Math.round(rectFC.right), Math.round(rectFC.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        transitionDrawable.o(valueAnimator.getAnimatedFraction());
                    }
                });
                addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(@NonNull Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (MaterialContainerTransform.this.f28338c) {
                            return;
                        }
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        viewF.getOverlay().remove(transitionDrawable);
                    }

                    @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
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
        return this.f28344i;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f28341f;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f28346k;
    }

    public float getEndElevation() {
        return this.f28361z;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f28354s;
    }

    @Nullable
    public View getEndView() {
        return this.f28352q;
    }

    @IdRes
    public int getEndViewId() {
        return this.f28343h;
    }

    public int getFadeMode() {
        return this.f28349n;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f28355t;
    }

    public int getFitMode() {
        return this.f28350o;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f28357v;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f28356u;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f28347l;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f28358w;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f28345j;
    }

    public float getStartElevation() {
        return this.f28360y;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f28353r;
    }

    @Nullable
    public View getStartView() {
        return this.f28351p;
    }

    @IdRes
    public int getStartViewId() {
        return this.f28342g;
    }

    public int getTransitionDirection() {
        return this.f28348m;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return B;
    }

    public boolean isDrawDebugEnabled() {
        return this.f28337b;
    }

    public boolean isElevationShadowEnabled() {
        return this.f28359x;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f28338c;
    }

    public void setAllContainerColors(@ColorInt int i10) {
        this.f28344i = i10;
        this.f28345j = i10;
        this.f28346k = i10;
    }

    public void setContainerColor(@ColorInt int i10) {
        this.f28344i = i10;
    }

    public void setDrawDebugEnabled(boolean z10) {
        this.f28337b = z10;
    }

    public void setDrawingViewId(@IdRes int i10) {
        this.f28341f = i10;
    }

    public void setElevationShadowEnabled(boolean z10) {
        this.f28359x = z10;
    }

    public void setEndContainerColor(@ColorInt int i10) {
        this.f28346k = i10;
    }

    public void setEndElevation(float f10) {
        this.f28361z = f10;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f28354s = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f28352q = view;
    }

    public void setEndViewId(@IdRes int i10) {
        this.f28343h = i10;
    }

    public void setFadeMode(int i10) {
        this.f28349n = i10;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28355t = progressThresholds;
    }

    public void setFitMode(int i10) {
        this.f28350o = i10;
    }

    public void setHoldAtEndEnabled(boolean z10) {
        this.f28338c = z10;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f28339d = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28357v = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28356u = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i10) {
        this.f28347l = i10;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f28358w = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i10) {
        this.f28345j = i10;
    }

    public void setStartElevation(float f10) {
        this.f28360y = f10;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f28353r = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f28351p = view;
    }

    public void setStartViewId(@IdRes int i10) {
        this.f28342g = i10;
    }

    public void setTransitionDirection(int i10) {
        this.f28348m = i10;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z10) {
        this.f28337b = false;
        this.f28338c = false;
        this.f28339d = false;
        this.f28340e = false;
        this.f28341f = R.id.content;
        this.f28342g = -1;
        this.f28343h = -1;
        this.f28344i = 0;
        this.f28345j = 0;
        this.f28346k = 0;
        this.f28347l = 1375731712;
        this.f28348m = 0;
        this.f28349n = 0;
        this.f28350o = 0;
        this.f28359x = Build.VERSION.SDK_INT >= 28;
        this.f28360y = -1.0f;
        this.f28361z = -1.0f;
        k(context, z10);
        this.f28340e = true;
    }
}
