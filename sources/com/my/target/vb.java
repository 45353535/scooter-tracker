package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class vb extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f60962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f60963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f60964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb f60965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f60966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f60967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f60968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f60969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f60970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f60971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f60972k;

    public vb(Context context) {
        super(context);
        this.f60962a = new Paint();
        this.f60963b = new Paint();
        this.f60964c = new Paint();
        this.f60966e = new RectF();
        this.f60967f = 0L;
        this.f60968g = 0.0f;
        this.f60969h = 0.0f;
        this.f60970i = 230.0f;
        this.f60971j = false;
        this.f60965d = kb.e(context);
    }

    public final void a() {
        this.f60962a.setColor(-1);
        this.f60962a.setAntiAlias(true);
        this.f60962a.setStyle(Paint.Style.STROKE);
        this.f60962a.setStrokeWidth(this.f60965d.b(1));
        this.f60963b.setColor(-2013265920);
        this.f60963b.setAntiAlias(true);
        this.f60963b.setStyle(Paint.Style.FILL);
        this.f60963b.setStrokeWidth(this.f60965d.b(4));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        canvas.drawOval(this.f60966e, this.f60963b);
        if (this.f60968g != this.f60969h) {
            this.f60968g = Math.min(this.f60968g + (((SystemClock.uptimeMillis() - this.f60967f) / 1000.0f) * this.f60970i), this.f60969h);
            this.f60967f = SystemClock.uptimeMillis();
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = this.f60968g;
        if (isInEditMode()) {
            f10 = 360.0f;
        }
        canvas.drawArc(this.f60966e, -90.0f, f10, false, this.f60962a);
        this.f60964c.setColor(-1);
        this.f60964c.setTextSize(this.f60965d.b(12));
        this.f60964c.setTextAlign(Paint.Align.CENTER);
        this.f60964c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f60972k), (int) this.f60966e.centerX(), (int) (this.f60966e.centerY() - ((this.f60964c.descent() + this.f60964c.ascent()) / 2.0f)), this.f60964c);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iB = this.f60965d.b(28) + getPaddingLeft() + getPaddingRight();
        int iB2 = this.f60965d.b(28) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            iB = size;
        } else if (mode == Integer.MIN_VALUE) {
            iB = Math.min(iB, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            iB2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iB2 = Math.min(iB2, size2);
        }
        setMeasuredDimension(iB, iB2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a(i10, i11);
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            this.f60967f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i10) {
        this.f60972k = i10;
    }

    public void setMax(float f10) {
        if (f10 > 0.0f) {
            this.f60970i = 360.0f / f10;
        }
    }

    public void setProgress(float f10) {
        if (this.f60971j) {
            this.f60968g = 0.0f;
            this.f60971j = false;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f11 = this.f60969h;
        if (f10 == f11) {
            return;
        }
        if (this.f60968g == f11) {
            this.f60967f = SystemClock.uptimeMillis();
        }
        this.f60969h = Math.min(f10 * 360.0f, 360.0f);
        invalidate();
    }

    public final void a(int i10, int i11) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f60966e = new RectF(getPaddingLeft() + this.f60965d.b(1), paddingTop + this.f60965d.b(1), (i10 - getPaddingRight()) - this.f60965d.b(1), (i11 - paddingBottom) - this.f60965d.b(1));
    }
}
