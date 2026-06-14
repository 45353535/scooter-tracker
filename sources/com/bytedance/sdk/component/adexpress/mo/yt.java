package com.bytedance.sdk.component.adexpress.mo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class yt extends View {
    private RectF lnr;
    private float mml;
    private int mo;
    private ValueAnimator mzz;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Paint f16447ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16448wd;

    public yt(Context context) {
        super(context);
        this.mo = 1500;
        this.qdl = context;
        Paint paint = new Paint();
        this.f16447ud = paint;
        paint.setAntiAlias(true);
        this.f16447ud.setStyle(Paint.Style.STROKE);
        this.f16447ud.setStrokeWidth(10.0f);
        this.f16447ud.setColor(Color.parseColor("#80FFFFFF"));
        this.lnr = new RectF();
    }

    public void lnr() {
        this.f16448wd = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16448wd) {
            return;
        }
        canvas.drawArc(this.lnr, 270.0f, this.mml, false, this.f16447ud);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.lnr.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.mo = i10;
    }

    public void ud() {
        ValueAnimator valueAnimator = this.mzz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void qdl() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.mzz = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mo);
        this.mzz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.yt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                yt.this.mml = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yt.this.requestLayout();
            }
        });
        this.mzz.start();
    }
}
