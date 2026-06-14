package b9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes12.dex */
public class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f5863h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Interpolator f5864i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f5865j = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f5866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C0128d f5867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f5869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f5870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5871g;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f5872a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f5873b = 1.0f / 200;

        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f5872a;
            int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
            float f11 = this.f5873b;
            float f12 = (f10 - (iMin * f11)) / f11;
            float[] fArr2 = this.f5872a;
            float f13 = fArr2[iMin];
            return f13 + (f12 * (fArr2[iMin + 1] - f13));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0128d f5874b;

        b(C0128d c0128d) {
            this.f5874b = c0128d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.k(fFloatValue, this.f5874b);
            d.this.g(fFloatValue, this.f5874b, false);
            d.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b9.d$d, reason: collision with other inner class name */
    static class C0128d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f5879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f5880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f5881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Paint f5882e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int[] f5887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5888k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f5889l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f5890m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f5891n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f5892o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5894q;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f5883f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f5884g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f5885h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f5886i = 5.0f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5893p = 255;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f5878a = new RectF();

        C0128d() {
            Paint paint = new Paint();
            this.f5879b = paint;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f5880c = paint2;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f5881d = paint3;
            paint3.setColor(0);
            Paint paint4 = new Paint();
            this.f5882e = paint4;
            paint4.setColor(0);
        }

        int a() {
            return this.f5893p;
        }

        void b(float f10) {
            this.f5892o = f10;
        }

        void c(int i10) {
            this.f5893p = i10;
        }

        void d(Canvas canvas, Rect rect) {
            RectF rectF = this.f5878a;
            float f10 = this.f5892o;
            float fMin = (this.f5886i / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f5886i / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f5883f;
            float f12 = this.f5885h;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f5884g + f12) * 360.0f) - f13;
            this.f5879b.setColor(this.f5894q);
            this.f5879b.setAlpha(this.f5893p);
            float f15 = this.f5886i / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5881d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f5879b);
        }

        void e(ColorFilter colorFilter) {
            this.f5879b.setColorFilter(colorFilter);
        }

        void f(Paint.Cap cap) {
            this.f5879b.setStrokeCap(cap);
        }

        void g(int[] iArr) {
            this.f5887j = iArr;
            n(0);
        }

        void h(float f10) {
            this.f5884g = f10;
        }

        float i() {
            return this.f5884g;
        }

        void j(float f10) {
            this.f5885h = f10;
        }

        void k(int i10) {
            this.f5894q = i10;
        }

        int l() {
            return this.f5887j[o()];
        }

        void m(float f10) {
            this.f5883f = f10;
        }

        void n(int i10) {
            this.f5888k = i10;
            this.f5894q = this.f5887j[i10];
        }

        int o() {
            return (this.f5888k + 1) % this.f5887j.length;
        }

        void p(float f10) {
            this.f5886i = f10;
            this.f5879b.setStrokeWidth(f10);
        }

        float q() {
            return this.f5883f;
        }

        int r() {
            return this.f5887j[this.f5888k];
        }

        float s() {
            return this.f5890m;
        }

        float t() {
            return this.f5891n;
        }

        float u() {
            return this.f5889l;
        }

        void v() {
            n(o());
        }

        void w() {
            this.f5889l = 0.0f;
            this.f5890m = 0.0f;
            this.f5891n = 0.0f;
            m(0.0f);
            h(0.0f);
            j(0.0f);
        }

        void x() {
            this.f5889l = this.f5883f;
            this.f5890m = this.f5884g;
            this.f5891n = this.f5885h;
        }
    }

    public d(Context context) {
        this.f5866b = context.getResources();
        C0128d c0128d = new C0128d();
        this.f5867c = c0128d;
        c0128d.g(f5865j);
        q(2.5f);
        d();
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void d() {
        C0128d c0128d = this.f5867c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(c0128d));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f5863h);
        valueAnimatorOfFloat.addListener(new c(c0128d));
        this.f5869e = valueAnimatorOfFloat;
    }

    private void e(float f10) {
        this.f5868d = f10;
    }

    private void f(float f10, C0128d c0128d) {
        k(f10, c0128d);
        float fFloor = (float) (Math.floor(c0128d.t() / 0.8f) + 1.0d);
        c0128d.m(c0128d.u() + (((c0128d.s() - 0.01f) - c0128d.u()) * f10));
        c0128d.h(c0128d.s());
        c0128d.j(c0128d.t() + ((fFloor - c0128d.t()) * f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f10, C0128d c0128d, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f5871g) {
            f(f10, c0128d);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fT = c0128d.t();
            if (f10 < 0.5f) {
                interpolation = c0128d.u();
                interpolation2 = (f5864i.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float fU = c0128d.u() + 0.79f;
                interpolation = fU - (((1.0f - f5864i.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fU;
            }
            float f11 = fT + (0.20999998f * f10);
            float f12 = (f10 + this.f5870f) * 216.0f;
            c0128d.m(interpolation);
            c0128d.h(interpolation2);
            c0128d.j(f11);
            e(f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(float f10, C0128d c0128d) {
        if (f10 > 0.75f) {
            c0128d.k(c((f10 - 0.75f) / 0.25f, c0128d.r(), c0128d.l()));
        } else {
            c0128d.k(c0128d.r());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5868d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5867c.d(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5867c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5869e.isRunning();
    }

    public float m() {
        return this.f5867c.f5886i;
    }

    public void n(float f10) {
        this.f5867c.b(f10);
        invalidateSelf();
    }

    public void o(int... iArr) {
        this.f5867c.g(iArr);
        this.f5867c.n(0);
        invalidateSelf();
    }

    public void p(Paint.Cap cap) {
        this.f5867c.f(cap);
        invalidateSelf();
    }

    public void q(float f10) {
        this.f5867c.p(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5867c.c(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5867c.e(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5869e.cancel();
        this.f5867c.x();
        if (this.f5867c.i() != this.f5867c.q()) {
            this.f5871g = true;
            this.f5869e.setDuration(666L);
            this.f5869e.start();
        } else {
            this.f5867c.n(0);
            this.f5867c.w();
            this.f5869e.setDuration(1332L);
            this.f5869e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5869e.cancel();
        e(0.0f);
        this.f5867c.n(0);
        this.f5867c.w();
        invalidateSelf();
    }

    class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0128d f5876b;

        c(C0128d c0128d) {
            this.f5876b = c0128d;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            d.this.g(1.0f, this.f5876b, true);
            this.f5876b.x();
            this.f5876b.v();
            if (!d.this.f5871g) {
                d.this.f5870f += 1.0f;
            } else {
                d.this.f5871g = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f5870f = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
