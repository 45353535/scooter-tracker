package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class ub extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f60911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f60912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f60913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb f60914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f60915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f60916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f60917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f60918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f60919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f60920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f60921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f60922l;

    public ub(Context context) {
        super(context);
        this.f60911a = new Paint();
        this.f60912b = new Paint();
        this.f60913c = new Paint();
        this.f60915e = new RectF();
        this.f60916f = 0L;
        this.f60917g = 0.0f;
        this.f60918h = 0.0f;
        this.f60919i = 230.0f;
        this.f60920j = false;
        kb kbVarE = kb.e(context);
        this.f60914d = kbVarE;
        this.f60922l = kbVarE.b(28);
    }

    public final void a() {
        this.f60911a.setColor(-1);
        this.f60911a.setAntiAlias(true);
        this.f60911a.setStyle(Paint.Style.STROKE);
        this.f60911a.setStrokeWidth(this.f60914d.b(1));
        this.f60912b.setColor(-2013265920);
        this.f60912b.setAntiAlias(true);
        this.f60912b.setStyle(Paint.Style.FILL);
        this.f60912b.setStrokeWidth(this.f60914d.b(4));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        canvas.drawOval(this.f60915e, this.f60912b);
        if (this.f60917g != this.f60918h) {
            this.f60917g = Math.min(this.f60917g + (((SystemClock.uptimeMillis() - this.f60916f) / 1000.0f) * this.f60919i), this.f60918h);
            this.f60916f = SystemClock.uptimeMillis();
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = this.f60917g;
        if (isInEditMode()) {
            f10 = 360.0f;
        }
        canvas.drawArc(this.f60915e, -90.0f, f10, false, this.f60911a);
        this.f60913c.setColor(-1);
        this.f60913c.setTextSize(this.f60914d.b(12));
        this.f60913c.setTextAlign(Paint.Align.CENTER);
        this.f60913c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f60921k), (int) this.f60915e.centerX(), (int) (this.f60915e.centerY() - ((this.f60913c.descent() + this.f60913c.ascent()) / 2.0f)), this.f60913c);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingLeft = this.f60922l + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f60922l + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
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
            this.f60916f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i10) {
        this.f60921k = i10;
    }

    public void setMax(float f10) {
        if (f10 > 0.0f) {
            this.f60919i = 360.0f / f10;
        }
    }

    public void setProgress(float f10) {
        if (this.f60920j) {
            this.f60917g = 0.0f;
            this.f60920j = false;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f11 = this.f60918h;
        if (f10 == f11) {
            return;
        }
        if (this.f60917g == f11) {
            this.f60916f = SystemClock.uptimeMillis();
        }
        this.f60918h = Math.min(f10 * 360.0f, 360.0f);
        invalidate();
    }

    public void setSize(int i10) {
        this.f60922l = i10;
    }

    public final void a(int i10, int i11) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f60915e = new RectF(getPaddingLeft() + this.f60914d.b(1), paddingTop + this.f60914d.b(1), (i10 - getPaddingRight()) - this.f60914d.b(1), (i11 - paddingBottom) - this.f60914d.b(1));
    }
}
