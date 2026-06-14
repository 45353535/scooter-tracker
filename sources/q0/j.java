package q0;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes5.dex */
public class j extends c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d0.i f98628m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f98620e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98621f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f98622g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f98623h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f98624i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f98625j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f98626k = -2.1474836E9f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f98627l = 2.1474836E9f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f98629n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f98630o = false;

    private void L() {
        if (this.f98628m == null) {
            return;
        }
        float f10 = this.f98624i;
        if (f10 < this.f98626k || f10 > this.f98627l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f98626k), Float.valueOf(this.f98627l), Float.valueOf(this.f98624i)));
        }
    }

    private void n(float f10) {
        if (this.f98630o && this.f98623h == f10) {
            return;
        }
        l();
    }

    private float s() {
        d0.i iVar = this.f98628m;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f98620e);
    }

    private boolean w() {
        return v() < 0.0f;
    }

    protected void A() {
        B(true);
    }

    protected void B(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f98629n = false;
        }
    }

    public void C() {
        this.f98629n = true;
        z();
        this.f98622g = 0L;
        if (w() && r() == u()) {
            F(t());
        } else if (!w() && r() == t()) {
            F(u());
        }
        j();
    }

    public void D() {
        J(-v());
    }

    public void E(d0.i iVar) {
        boolean z10 = this.f98628m == null;
        this.f98628m = iVar;
        if (z10) {
            H(Math.max(this.f98626k, iVar.p()), Math.min(this.f98627l, iVar.f()));
        } else {
            H((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f98624i;
        this.f98624i = 0.0f;
        this.f98623h = 0.0f;
        F((int) f10);
        l();
    }

    public void F(float f10) {
        if (this.f98623h == f10) {
            return;
        }
        float fB = l.b(f10, u(), t());
        this.f98623h = fB;
        if (this.f98630o) {
            fB = (float) Math.floor(fB);
        }
        this.f98624i = fB;
        this.f98622g = 0L;
        l();
    }

    public void G(float f10) {
        H(this.f98626k, f10);
    }

    public void H(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        d0.i iVar = this.f98628m;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        d0.i iVar2 = this.f98628m;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = l.b(f10, fP, f12);
        float fB2 = l.b(f11, fP, f12);
        if (fB == this.f98626k && fB2 == this.f98627l) {
            return;
        }
        this.f98626k = fB;
        this.f98627l = fB2;
        F((int) l.b(this.f98624i, fB, fB2));
    }

    public void I(int i10) {
        H(i10, (int) this.f98627l);
    }

    public void J(float f10) {
        this.f98620e = f10;
    }

    public void K(boolean z10) {
        this.f98630o = z10;
    }

    @Override // q0.c
    void a() {
        super.a();
        b(w());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        A();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        z();
        if (this.f98628m == null || !isRunning()) {
            return;
        }
        if (d0.e.h()) {
            d0.e.b("LottieValueAnimator#doFrame");
        }
        float fS = (this.f98622g != 0 ? j10 - r2 : 0L) / s();
        float f10 = this.f98623h;
        if (w()) {
            fS = -fS;
        }
        float f11 = f10 + fS;
        boolean zD = l.d(f11, u(), t());
        float f12 = this.f98623h;
        float fB = l.b(f11, u(), t());
        this.f98623h = fB;
        if (this.f98630o) {
            fB = (float) Math.floor(fB);
        }
        this.f98624i = fB;
        this.f98622g = j10;
        if (zD) {
            n(f12);
        } else if (getRepeatCount() == -1 || this.f98625j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f98621f = !this.f98621f;
                D();
            } else {
                float fT = w() ? t() : u();
                this.f98623h = fT;
                this.f98624i = fT;
            }
            this.f98622g = j10;
            n(f12);
            i();
            this.f98625j++;
        } else {
            float fU = this.f98620e < 0.0f ? u() : t();
            this.f98623h = fU;
            this.f98624i = fU;
            A();
            n(f12);
            b(w());
        }
        L();
        if (d0.e.h()) {
            d0.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fU;
        float fT;
        float fU2;
        if (this.f98628m == null) {
            return 0.0f;
        }
        if (w()) {
            fU = t() - this.f98624i;
            fT = t();
            fU2 = u();
        } else {
            fU = this.f98624i - u();
            fT = t();
            fU2 = u();
        }
        return fU / (fT - fU2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        d0.i iVar = this.f98628m;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f98629n;
    }

    public void o() {
        this.f98628m = null;
        this.f98626k = -2.1474836E9f;
        this.f98627l = 2.1474836E9f;
    }

    public void p() {
        A();
        b(w());
    }

    public float q() {
        d0.i iVar = this.f98628m;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f98624i - iVar.p()) / (this.f98628m.f() - this.f98628m.p());
    }

    public float r() {
        return this.f98624i;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f98621f) {
            return;
        }
        this.f98621f = false;
        D();
    }

    public float t() {
        d0.i iVar = this.f98628m;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f98627l;
        return f10 == 2.1474836E9f ? iVar.f() : f10;
    }

    public float u() {
        d0.i iVar = this.f98628m;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f98626k;
        return f10 == -2.1474836E9f ? iVar.p() : f10;
    }

    public float v() {
        return this.f98620e;
    }

    public void x() {
        A();
        e();
    }

    public void y() {
        this.f98629n = true;
        k(w());
        F((int) (w() ? t() : u()));
        this.f98622g = 0L;
        this.f98625j = 0;
        z();
    }

    protected void z() {
        if (isRunning()) {
            B(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
