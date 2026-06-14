package e2;

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

/* JADX INFO: loaded from: classes5.dex */
public class h extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f68844h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Interpolator f68845i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f68846j = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d f68847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f68848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Resources f68849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f68850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f68851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68852g;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f68853a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f68854b = 1.0f / 200;

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
            float[] fArr = this.f68853a;
            int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
            float f11 = this.f68854b;
            float f12 = (f10 - (iMin * f11)) / f11;
            float[] fArr2 = this.f68853a;
            float f13 = fArr2[iMin];
            return f13 + (f12 * (fArr2[iMin + 1] - f13));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f68855b;

        b(d dVar) {
            this.f68855b = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            h.this.o(fFloatValue, this.f68855b);
            h.this.g(fFloatValue, this.f68855b, false);
            h.this.invalidateSelf();
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f68859a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f68860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f68861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f68862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Paint f68863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f68864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f68865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f68866h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f68867i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int[] f68868j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f68869k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f68870l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f68871m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f68872n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f68873o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f68874p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f68875q;

        d() {
            Paint paint = new Paint();
            this.f68860b = paint;
            Paint paint2 = new Paint();
            this.f68861c = paint2;
            Paint paint3 = new Paint();
            this.f68862d = paint3;
            Paint paint4 = new Paint();
            this.f68863e = paint4;
            this.f68864f = 0.0f;
            this.f68865g = 0.0f;
            this.f68866h = 0.0f;
            this.f68867i = 5.0f;
            this.f68874p = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
            paint4.setColor(0);
        }

        int a() {
            return this.f68874p;
        }

        void b(float f10) {
            this.f68873o = f10;
        }

        void c(int i10) {
            this.f68874p = i10;
        }

        void d(Canvas canvas, Rect rect) {
            RectF rectF = this.f68859a;
            float f10 = this.f68873o;
            float fMin = (this.f68867i / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f68867i / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f68864f;
            float f12 = this.f68866h;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f68865g + f12) * 360.0f) - f13;
            this.f68860b.setColor(this.f68875q);
            this.f68860b.setAlpha(this.f68874p);
            float f15 = this.f68867i / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f68862d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f68860b);
        }

        void e(ColorFilter colorFilter) {
            this.f68860b.setColorFilter(colorFilter);
        }

        void f(Paint.Cap cap) {
            this.f68860b.setStrokeCap(cap);
        }

        void g(int[] iArr) {
            this.f68868j = iArr;
            m(0);
        }

        float h() {
            return this.f68865g;
        }

        void i(float f10) {
            this.f68865g = f10;
        }

        void j(int i10) {
            this.f68875q = i10;
        }

        int k() {
            return this.f68868j[n()];
        }

        void l(float f10) {
            this.f68866h = f10;
        }

        void m(int i10) {
            this.f68869k = i10;
            this.f68875q = this.f68868j[i10];
        }

        int n() {
            return (this.f68869k + 1) % this.f68868j.length;
        }

        void o(float f10) {
            this.f68864f = f10;
        }

        float p() {
            return this.f68864f;
        }

        void q(float f10) {
            this.f68867i = f10;
            this.f68860b.setStrokeWidth(f10);
        }

        int r() {
            return this.f68868j[this.f68869k];
        }

        float s() {
            return this.f68871m;
        }

        float t() {
            return this.f68872n;
        }

        float u() {
            return this.f68870l;
        }

        void v() {
            m(n());
        }

        void w() {
            this.f68870l = 0.0f;
            this.f68871m = 0.0f;
            this.f68872n = 0.0f;
            o(0.0f);
            i(0.0f);
            l(0.0f);
        }

        void x() {
            this.f68870l = this.f68864f;
            this.f68871m = this.f68865g;
            this.f68872n = this.f68866h;
        }
    }

    public h(Context context) {
        this.f68849d = context.getResources();
        d dVar = new d();
        this.f68847b = dVar;
        dVar.g(f68846j);
        q(2.5f);
        m();
    }

    private int d(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void f(float f10, d dVar) {
        o(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.t() / 0.8f) + 1.0d);
        dVar.o(dVar.u() + (((dVar.s() - 0.01f) - dVar.u()) * f10));
        dVar.i(dVar.s());
        dVar.l(dVar.t() + ((fFloor - dVar.t()) * f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f68852g) {
            f(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fT = dVar.t();
            if (f10 < 0.5f) {
                interpolation = dVar.u();
                interpolation2 = (f68845i.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float fU = dVar.u() + 0.79f;
                interpolation = fU - (((1.0f - f68845i.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fU;
            }
            float f11 = fT + (0.20999998f * f10);
            float f12 = (f10 + this.f68851f) * 216.0f;
            dVar.o(interpolation);
            dVar.i(interpolation2);
            dVar.l(f11);
            n(f12);
        }
    }

    private void m() {
        d dVar = this.f68847b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f68844h);
        valueAnimatorOfFloat.addListener(new c(dVar));
        this.f68850e = valueAnimatorOfFloat;
    }

    private void n(float f10) {
        this.f68848c = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(float f10, d dVar) {
        dVar.j(f10 > 0.75f ? d((f10 - 0.75f) / 0.25f, dVar.r(), dVar.k()) : dVar.r());
    }

    public float a() {
        return this.f68847b.f68867i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f68848c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f68847b.d(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f68847b.b(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f68847b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(Paint.Cap cap) {
        this.f68847b.f(cap);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f68850e.isRunning();
    }

    public void k(int... iArr) {
        this.f68847b.g(iArr);
        this.f68847b.m(0);
        invalidateSelf();
    }

    public void q(float f10) {
        this.f68847b.q(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f68847b.c(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f68847b.e(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f68850e.cancel();
        this.f68847b.x();
        if (this.f68847b.h() != this.f68847b.p()) {
            this.f68852g = true;
            animator = this.f68850e;
            j10 = 666;
        } else {
            this.f68847b.m(0);
            this.f68847b.w();
            animator = this.f68850e;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f68850e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f68850e.cancel();
        n(0.0f);
        this.f68847b.m(0);
        this.f68847b.w();
        invalidateSelf();
    }

    class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f68857b;

        c(d dVar) {
            this.f68857b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            h.this.g(1.0f, this.f68857b, true);
            this.f68857b.x();
            this.f68857b.v();
            if (!h.this.f68852g) {
                h.this.f68851f += 1.0f;
            } else {
                h.this.f68852g = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.f68851f = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
