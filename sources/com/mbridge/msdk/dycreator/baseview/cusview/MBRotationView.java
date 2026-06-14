package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f47820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f47821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f47830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f47831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Runnable f47835p;

    public MBRotationView(Context context) {
        super(context);
        this.f47824e = 40;
        this.f47825f = 20;
        this.f47826g = 0;
        this.f47827h = 0;
        this.f47829j = 0;
        this.f47830k = 0.5f;
        this.f47831l = 0.9f;
        this.f47832m = true;
        this.f47833n = false;
        this.f47834o = false;
        this.f47835p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f47826g * this.f47822c) / 2) / this.f47824e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f47826g) > this.f47824e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f47834o ? this.f47827h - 2 : this.f47827h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f47827h;
            } else if (this.f47834o) {
                i12 = this.f47827h;
                i11 = i12 - 1;
            } else {
                i13 = this.f47827h;
                i11 = i13 + 1;
            }
        } else if (this.f47834o) {
            i13 = this.f47827h;
            i11 = i13 + 1;
        } else {
            i12 = this.f47827h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f47833n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f47830k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f47831l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f47822c = (int) (f12 * f13);
        this.f47823d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f47823d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f47822c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f47835p, 1000 / this.f47825f);
        }
        this.f47832m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f47831l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f47833n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f47830k = f10;
    }

    private void a() {
        this.f47820a = new Camera();
        this.f47821b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f47826g * this.f47823d) / 2) / this.f47824e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f47826g) > this.f47824e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f47820a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f47820a.rotateX(f11);
            this.f47820a.translate(0.0f, f10, 0.0f);
            this.f47820a.translate(0.0f, f10, 0.0f);
            this.f47820a.rotateX(f11);
            this.f47820a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f47820a.translate(0.0f, f10, 0.0f);
            this.f47820a.rotateX(i11);
            this.f47820a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f47820a.rotateX(0.0f);
        } else {
            this.f47820a.translate(0.0f, f10, 0.0f);
            this.f47820a.rotateX(-i11);
            this.f47820a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47824e = 40;
        this.f47825f = 20;
        this.f47826g = 0;
        this.f47827h = 0;
        this.f47829j = 0;
        this.f47830k = 0.5f;
        this.f47831l = 0.9f;
        this.f47832m = true;
        this.f47833n = false;
        this.f47834o = false;
        this.f47835p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f47820a.save();
        this.f47821b.reset();
        float f10 = i10;
        this.f47820a.translate(0.0f, f10, 0.0f);
        this.f47820a.rotateX(this.f47826g);
        this.f47820a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f47834o) {
                b(this.f47822c, this.f47824e, i12);
            } else {
                b(-this.f47822c, -this.f47824e, i12);
            }
        } else if (i10 > 0) {
            b(this.f47822c, this.f47824e, i12);
        } else if (i10 < 0) {
            b(-this.f47822c, -this.f47824e, i12);
        }
        this.f47820a.getMatrix(this.f47821b);
        this.f47820a.restore();
        this.f47821b.preTranslate((-getWidth()) / 2, -i11);
        this.f47821b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f47821b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f47826g - 1;
        this.f47826g = i10;
        this.f47828i = this.f47827h;
        a(i10);
        if (this.f47832m) {
            postDelayed(this.f47835p, 1000 / this.f47825f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47824e = 40;
        this.f47825f = 20;
        this.f47826g = 0;
        this.f47827h = 0;
        this.f47829j = 0;
        this.f47830k = 0.5f;
        this.f47831l = 0.9f;
        this.f47832m = true;
        this.f47833n = false;
        this.f47834o = false;
        this.f47835p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f47820a.save();
        this.f47821b.reset();
        float f10 = i10;
        this.f47820a.translate(f10, 0.0f, 0.0f);
        this.f47820a.rotateY(this.f47826g);
        this.f47820a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f47834o) {
                a(this.f47823d, this.f47824e, i12);
            } else {
                a(-this.f47823d, -this.f47824e, i12);
            }
        } else if (i10 > 0) {
            a(this.f47823d, this.f47824e, i12);
        } else if (i10 < 0) {
            a(-this.f47823d, -this.f47824e, i12);
        }
        this.f47820a.getMatrix(this.f47821b);
        this.f47820a.restore();
        this.f47821b.preTranslate(-i11, (-getHeight()) / 2);
        this.f47821b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f47821b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f47824e;
        int i12 = this.f47828i - (i10 / i11);
        this.f47826g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f47820a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f47820a.rotateY(f11);
            this.f47820a.translate(f10, 0.0f, 0.0f);
            this.f47820a.translate(f10, 0.0f, 0.0f);
            this.f47820a.rotateY(f11);
            this.f47820a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f47820a.translate(f12, 0.0f, 0.0f);
            this.f47820a.rotateY(i11);
            this.f47820a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f47820a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f47820a.translate(f13, 0.0f, 0.0f);
            this.f47820a.rotateY(-i11);
            this.f47820a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f47827h = i10;
        if (Math.abs(this.f47826g) > this.f47824e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f47829j != iC) {
            this.f47829j = iC;
        }
    }
}
