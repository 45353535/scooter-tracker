package com.bytedance.adsdk.ud.mo;

import android.view.Choreographer;
import com.bytedance.adsdk.ud.wd;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends qdl implements Choreographer.FrameCallback {
    private wd to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16066ud = 1.0f;
    private boolean lnr = false;
    private long mml = 0;
    private float mzz = 0.0f;
    private float mo = 0.0f;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16067wd = 0;
    private float jpc = -2.1474836E9f;
    private float tvp = 2.1474836E9f;
    protected boolean qdl = false;
    private boolean rq = false;

    private boolean aaj() {
        return to() < 0.0f;
    }

    private float exc() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / wdVar.fs()) / Math.abs(this.f16066ud);
    }

    private void jyq() {
        if (this.to == null) {
            return;
        }
        float f10 = this.mo;
        if (f10 < this.jpc || f10 > this.tvp) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.jpc), Float.valueOf(this.tvp), Float.valueOf(this.mo)));
        }
    }

    public float bjy() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        float f10 = this.jpc;
        return f10 == -2.1474836E9f ? wdVar.mo() : f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        ud();
        jl();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        yt();
        if (this.to == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.ud.mzz.qdl("LottieValueAnimator#doFrame");
        float fExc = (this.mml != 0 ? j10 - r1 : 0L) / exc();
        float f10 = this.mzz;
        if (aaj()) {
            fExc = -fExc;
        }
        float f11 = f10 + fExc;
        boolean zLnr = mzz.lnr(f11, bjy(), jtx());
        float f12 = this.mzz;
        float fUd = mzz.ud(f11, bjy(), jtx());
        this.mzz = fUd;
        if (this.rq) {
            fUd = (float) Math.floor(fUd);
        }
        this.mo = fUd;
        this.mml = j10;
        if (!this.rq || this.mzz != f12) {
            lnr();
        }
        if (!zLnr) {
            if (getRepeatCount() == -1 || this.f16067wd < getRepeatCount()) {
                qdl();
                this.f16067wd++;
                if (getRepeatMode() == 2) {
                    this.lnr = !this.lnr;
                    tvp();
                } else {
                    float fJtx = aaj() ? jtx() : bjy();
                    this.mzz = fJtx;
                    this.mo = fJtx;
                }
                this.mml = j10;
            } else {
                float fBjy = this.f16066ud < 0.0f ? bjy() : jtx();
                this.mzz = fBjy;
                this.mo = fBjy;
                jl();
                ud(aaj());
            }
        }
        jyq();
        com.bytedance.adsdk.ud.mzz.ud("LottieValueAnimator#doFrame");
    }

    public void exu() {
        jl();
        mml();
    }

    public void fs() {
        jl();
        ud(aaj());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fBjy;
        float fJtx;
        float fBjy2;
        if (this.to == null) {
            return 0.0f;
        }
        if (aaj()) {
            fBjy = jtx() - this.mo;
            fJtx = jtx();
            fBjy2 = bjy();
        } else {
            fBjy = this.mo - bjy();
            fJtx = jtx();
            fBjy2 = bjy();
        }
        return fBjy / (fJtx - fBjy2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(mo());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0L;
        }
        return (long) wdVar.mzz();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.qdl;
    }

    protected void jl() {
        mml(true);
    }

    public void jpc() {
        this.to = null;
        this.jpc = -2.1474836E9f;
        this.tvp = 2.1474836E9f;
    }

    public float jtx() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        float f10 = this.tvp;
        return f10 == 2.1474836E9f ? wdVar.wd() : f10;
    }

    public void lnr(boolean z10) {
        this.rq = z10;
    }

    protected void mml(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.qdl = false;
        }
    }

    public float mo() {
        wd wdVar = this.to;
        if (wdVar == null) {
            return 0.0f;
        }
        return (this.mo - wdVar.mo()) / (this.to.wd() - this.to.mo());
    }

    public void qdl(wd wdVar) {
        boolean z10 = this.to == null;
        this.to = wdVar;
        if (z10) {
            qdl(Math.max(this.jpc, wdVar.mo()), Math.min(this.tvp, wdVar.wd()));
        } else {
            qdl((int) wdVar.mo(), (int) wdVar.wd());
        }
        float f10 = this.mo;
        this.mo = 0.0f;
        this.mzz = 0.0f;
        qdl((int) f10);
        lnr();
    }

    public void rdp() {
        this.qdl = true;
        yt();
        this.mml = 0L;
        if (aaj() && wd() == bjy()) {
            qdl(jtx());
        } else if (!aaj() && wd() == jtx()) {
            qdl(bjy());
        }
        mzz();
    }

    public void rq() {
        this.qdl = true;
        qdl(aaj());
        qdl((int) (aaj() ? jtx() : bjy()));
        this.mml = 0L;
        this.f16067wd = 0;
        yt();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.lnr) {
            return;
        }
        this.lnr = false;
        tvp();
    }

    public float to() {
        return this.f16066ud;
    }

    public void tvp() {
        lnr(-to());
    }

    public void ud(float f10) {
        qdl(this.jpc, f10);
    }

    public float wd() {
        return this.mo;
    }

    protected void yt() {
        if (isRunning()) {
            mml(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void lnr(float f10) {
        this.f16066ud = f10;
    }

    @Override // com.bytedance.adsdk.ud.mo.qdl
    void ud() {
        super.ud();
        ud(aaj());
    }

    public void qdl(float f10) {
        if (this.mzz == f10) {
            return;
        }
        float fUd = mzz.ud(f10, bjy(), jtx());
        this.mzz = fUd;
        if (this.rq) {
            fUd = (float) Math.floor(fUd);
        }
        this.mo = fUd;
        this.mml = 0L;
        lnr();
    }

    public void qdl(int i10) {
        qdl(i10, (int) this.tvp);
    }

    public void qdl(float f10, float f11) {
        if (f10 <= f11) {
            wd wdVar = this.to;
            float fMo = wdVar == null ? -3.4028235E38f : wdVar.mo();
            wd wdVar2 = this.to;
            float fWd = wdVar2 == null ? Float.MAX_VALUE : wdVar2.wd();
            float fUd = mzz.ud(f10, fMo, fWd);
            float fUd2 = mzz.ud(f11, fMo, fWd);
            if (fUd == this.jpc && fUd2 == this.tvp) {
                return;
            }
            this.jpc = fUd;
            this.tvp = fUd2;
            qdl((int) mzz.ud(this.mo, fUd, fUd2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
