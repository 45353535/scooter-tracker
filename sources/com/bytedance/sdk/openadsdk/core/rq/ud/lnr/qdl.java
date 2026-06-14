package com.bytedance.sdk.openadsdk.core.rq.ud.lnr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.mml;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends View {
    private int exu;
    private ValueAnimator fs;
    private int jpc;
    private RectF lnr;
    private int mml;
    private float mo;
    private int mzz;
    private Paint qdl;
    private float rdp;
    private mml rq;
    private String to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Paint f17460ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f17461wd;

    public qdl(Context context) {
        super(context);
        this.mml = com.bytedance.adsdk.ugeno.wd.qdl.qdl("#FFD813");
        this.mzz = com.bytedance.adsdk.ugeno.wd.qdl.qdl("rgba(0, 0, 0, 0.5)");
        this.mo = 3.0f;
        this.f17461wd = 0.0f;
        this.jpc = 0;
        this.tvp = 100;
        this.to = "line";
        this.exu = 1000;
        setBackgroundColor(0);
        qdl();
    }

    private void ud(Canvas canvas) {
        Paint paint = this.qdl;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.mo;
        float f11 = this.f17461wd;
        canvas.drawRoundRect(0.0f, 0.0f, width, f10, f11, f11, this.qdl);
        float width2 = (getWidth() * this.rdp) / this.tvp;
        this.f17460ud.setStyle(style);
        if (!TextUtils.equals(this.to, "line_reverse")) {
            float f12 = this.mo;
            float f13 = this.f17461wd;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f12, f13, f13, this.f17460ud);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.mo;
            float f15 = this.f17461wd;
            canvas.drawRoundRect(width3, 0.0f, width4, f14, f15, f15, this.f17460ud);
        }
    }

    public int getMaxProgress() {
        return this.tvp;
    }

    public int getProgress() {
        return this.jpc;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.fs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.to, "ring") || TextUtils.equals(this.to, "ring_reverse")) {
            qdl(canvas);
        } else {
            ud(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.rq;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        if (TextUtils.equals(this.to, "ring") || TextUtils.equals(this.to, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.mo);
        }
        mml mmlVar2 = this.rq;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    public void setAnimationDuration(int i10) {
        this.exu = i10;
        this.fs.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.tvp = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.tvp);
        this.jpc = iMin;
        if (iMin < 0) {
            this.jpc = 0;
        }
        ValueAnimator valueAnimator = this.fs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fs.setFloatValues(this.rdp, this.jpc);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.rdp + " progress=" + i10);
            this.fs.start();
        }
    }

    private void qdl() {
        Paint paint = new Paint(1);
        this.qdl = paint;
        paint.setColor(this.mzz);
        Paint paint2 = this.qdl;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f17460ud = paint3;
        paint3.setColor(this.mml);
        this.f17460ud.setStyle(style);
        this.lnr = new RectF();
        this.rdp = this.jpc;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.fs = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.exu);
        this.fs.setInterpolator(new LinearInterpolator());
        this.fs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qdl.this.rdp = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qdl.this.invalidate();
            }
        });
    }

    public qdl ud(int i10) {
        this.qdl.setColor(i10);
        return this;
    }

    public qdl ud(float f10) {
        this.f17461wd = f10;
        return this;
    }

    private void qdl(Canvas canvas) {
        float f10;
        int i10;
        float f11 = this.mo / 2.0f;
        this.lnr.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.qdl;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.qdl.setStrokeWidth(this.mo);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.qdl);
        if (TextUtils.equals(this.to, "ring_reverse")) {
            f10 = this.rdp * (-360.0f);
            i10 = this.tvp;
        } else {
            f10 = this.rdp * 360.0f;
            i10 = this.tvp;
        }
        float f12 = f10 / i10;
        this.f17460ud.setStyle(style);
        this.f17460ud.setStrokeWidth(this.mo);
        if (this.f17461wd <= 0.0f) {
            this.f17460ud.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.f17460ud.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.lnr, -90.0f, f12, false, this.f17460ud);
    }

    public qdl qdl(int i10) {
        this.f17460ud.setColor(i10);
        return this;
    }

    public qdl qdl(float f10) {
        this.mo = f10;
        invalidate();
        return this;
    }

    public qdl qdl(String str) {
        this.to = str;
        return this;
    }

    public void qdl(mml mmlVar) {
        this.rq = mmlVar;
    }
}
