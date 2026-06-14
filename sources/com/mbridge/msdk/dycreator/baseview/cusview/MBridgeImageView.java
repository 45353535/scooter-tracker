package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f47861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f47871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f47872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f47873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f47874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f47876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f47877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f47878r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f47869i, this.f47870j, this.f47874n, this.f47871k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f47871k == null || this.f47872l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f47871k;
                float f10 = this.f47865e;
                fArr[i13] = f10;
                this.f47872l[i13] = f10 - (this.f47869i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f47871k;
                float f11 = this.f47866f;
                fArr2[i10] = f11;
                this.f47872l[i10] = f11 - (this.f47869i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f47871k;
                float f12 = this.f47867g;
                fArr3[i11] = f12;
                this.f47872l[i11] = f12 - (this.f47869i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f47871k;
                float f13 = this.f47868h;
                fArr4[i12] = f13;
                this.f47872l[i12] = f13 - (this.f47869i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f47874n;
        if (rectF != null) {
            float f10 = this.f47869i / 2.0f;
            rectF.set(f10, f10, this.f47862b - f10, this.f47863c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f47873m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f47862b, this.f47863c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f47873m, null, 31);
            int i10 = this.f47862b;
            int i11 = this.f47869i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f47863c;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f47878r;
            if (paint != null) {
                paint.reset();
                this.f47878r.setAntiAlias(true);
                this.f47878r.setStyle(Paint.Style.FILL);
                this.f47878r.setXfermode(this.f47861a);
            }
            Path path = this.f47877q;
            if (path != null) {
                path.reset();
                this.f47877q.addRoundRect(this.f47873m, this.f47872l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f47877q, this.f47878r);
            Paint paint2 = this.f47878r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f47875o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f47862b = i10;
        this.f47863c = i11;
        if (this.f47876p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f47875o = true;
        this.f47869i = i11;
        this.f47870j = i12;
        this.f47864d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f47864d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f47875o = true;
        this.f47876p = true;
        this.f47869i = i14;
        this.f47870j = i15;
        this.f47865e = i10;
        this.f47867g = i12;
        this.f47866f = i11;
        this.f47868h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f47877q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f47877q, this.f47878r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47877q = new Path();
        this.f47878r = new Paint();
        this.f47871k = new float[8];
        this.f47872l = new float[8];
        this.f47874n = new RectF();
        this.f47873m = new RectF();
        this.f47861a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f47877q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f47878r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f47878r.setColor(i11);
            this.f47878r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f47871k == null || this.f47872l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f47871k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f47864d;
                fArr[i10] = f10;
                this.f47872l[i10] = f10 - (this.f47869i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
