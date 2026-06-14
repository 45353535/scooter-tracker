package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f28146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ValueAnimator f28147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f28149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f28150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f28154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f28155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f28156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f28157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f28158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f28159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f28160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f28161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private OnActionUpListener f28162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f28163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28165v;

    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.k(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void b(float f10, float f11) {
        this.f28165v = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) f(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float f11 = f(this.f28165v);
        float fCos = (((float) Math.cos(this.f28163t)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f28163t))) + f12;
        this.f28157n.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f28155l, this.f28157n);
        double dSin = Math.sin(this.f28163t);
        double dCos = Math.cos(this.f28163t);
        this.f28157n.setStrokeWidth(this.f28159p);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f28157n);
        canvas.drawCircle(f10, f12, this.f28156m, this.f28157n);
    }

    private int e(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int f(int i10) {
        return i10 == 2 ? Math.round(this.f28164u * 0.66f) : this.f28164u;
    }

    private Pair g(float f10) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f10) > 180.0f) {
            if (handRotation > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (handRotation < 180.0f && f10 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair(Float.valueOf(handRotation), Float.valueOf(f10));
    }

    private boolean h(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fE = e(f10, f11);
        boolean z13 = false;
        boolean z14 = getHandRotation() != fE;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f28148e) {
            z13 = true;
        }
        setHandRotation(fE, z13);
        return true;
    }

    private void i() {
        this.f28147d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f28261b, valueAnimator);
            }
        });
        this.f28147d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    private void k(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f28160q = f11;
        this.f28163t = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f12 = f(this.f28165v);
        float fCos = width + (((float) Math.cos(this.f28163t)) * f12);
        float fSin = height + (f12 * ((float) Math.sin(this.f28163t)));
        RectF rectF = this.f28158o;
        int i10 = this.f28155l;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f28154k.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotate(f11, z10);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.f28154k.add(onRotateListener);
    }

    int d() {
        return this.f28165v;
    }

    public RectF getCurrentSelectorBox() {
        return this.f28158o;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.f28160q;
    }

    public int getSelectorRadius() {
        return this.f28155l;
    }

    void j(int i10) {
        this.f28165v = i10;
        invalidate();
    }

    void l(boolean z10) {
        if (this.f28153j && !z10) {
            this.f28165v = 1;
        }
        this.f28153j = z10;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f28147d.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f28149f = x10;
            this.f28150g = y10;
            this.f28151h = true;
            this.f28161r = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f28149f);
            int i11 = (int) (y10 - this.f28150g);
            this.f28151h = (i10 * i10) + (i11 * i11) > this.f28152i;
            z11 = this.f28161r;
            boolean z13 = actionMasked == 1;
            if (this.f28153j) {
                b(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        boolean zH = this.f28161r | h(x10, y10, z11, z10, z12);
        this.f28161r = zH;
        if (zH && z12 && (onActionUpListener = this.f28162s) != null) {
            onActionUpListener.onActionUp(e(x10, y10), this.f28151h);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f28148e = z10;
    }

    public void setCircleRadius(@Dimension int i10) {
        this.f28164u = i10;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f10) {
        setHandRotation(f10, false);
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.f28162s = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        this.f28147d.cancel();
        if (!z10) {
            k(f10, false);
            return;
        }
        Pair pairG = g(f10);
        this.f28147d.setFloatValues(((Float) pairG.first).floatValue(), ((Float) pairG.second).floatValue());
        this.f28147d.setDuration(this.f28145b);
        this.f28147d.setInterpolator(this.f28146c);
        this.f28147d.start();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28147d = new ValueAnimator();
        this.f28154k = new ArrayList();
        Paint paint = new Paint();
        this.f28157n = paint;
        this.f28158o = new RectF();
        this.f28165v = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f28145b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.f28146c = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.f28164u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f28155l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.f28159p = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f28156m = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.f28152i = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        i();
    }
}
