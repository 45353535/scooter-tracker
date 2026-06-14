package i2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import e2.g;

/* JADX INFO: loaded from: classes5.dex */
public class a extends View implements e2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f73895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f73899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f73900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f73901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f73902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f73903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f73904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f73905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f73906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f73907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f73908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f73909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f73910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f73911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Paint f73912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f73913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f73914u;

    public a(Context context) {
        super(context);
        this.f73897d = e2.a.f68788a;
        this.f73898e = e2.a.f68790c;
        this.f73899f = false;
        this.f73900g = 0.0f;
        this.f73901h = 0.071428575f;
        this.f73902i = new RectF();
        this.f73903j = new RectF();
        this.f73904k = 54.0f;
        this.f73905l = 54.0f;
        this.f73906m = 5.0f;
        this.f73913t = 100.0f;
        c(context);
    }

    private float a(float f10, boolean z10) {
        float fWidth = this.f73902i.width();
        if (z10) {
            fWidth -= this.f73906m * 2.0f;
        }
        float fSqrt = (float) (((double) (fWidth / 2.0f)) * Math.sqrt(2.0d));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    private void b() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        this.f73902i.set(width, height, width + fMin, fMin + height);
        this.f73904k = this.f73902i.centerX();
        this.f73905l = this.f73902i.centerY();
        RectF rectF = this.f73903j;
        RectF rectF2 = this.f73902i;
        float f11 = rectF2.left;
        float f12 = this.f73906m / 2.0f;
        rectF.set(f11 + f12, rectF2.top + f12, rectF2.right - f12, rectF2.bottom - f12);
    }

    private void c(Context context) {
        setLayerType(1, null);
        this.f73906m = g.k(context, 3.0f);
    }

    private void d(Canvas canvas) {
        if (this.f73911r == null) {
            Paint paint = new Paint(7);
            this.f73911r = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f73911r.setAntiAlias(true);
        }
        if (this.f73909p == null) {
            this.f73909p = new Rect();
        }
        if (this.f73910q == null) {
            this.f73910q = new RectF();
        }
        float fA = a(this.f73900g, this.f73899f);
        float f10 = fA / 2.0f;
        float f11 = this.f73904k - f10;
        float f12 = this.f73905l - f10;
        this.f73909p.set(0, 0, this.f73895b.getWidth(), this.f73895b.getHeight());
        this.f73910q.set(f11, f12, f11 + fA, fA + f12);
        this.f73911r.setColorFilter(new PorterDuffColorFilter(this.f73897d, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f73895b, this.f73909p, this.f73910q, this.f73911r);
        if (this.f73899f) {
            if (this.f73912s == null) {
                Paint paint2 = new Paint(1);
                this.f73912s = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f73912s.setStrokeWidth(this.f73906m);
            this.f73912s.setColor(this.f73897d);
            canvas.drawArc(this.f73903j, 0.0f, 360.0f, false, this.f73912s);
        }
    }

    private void e(Canvas canvas) {
        if (this.f73907n == null) {
            this.f73907n = new Paint(1);
        }
        float f10 = 360.0f - ((this.f73913t * 360.0f) * 0.01f);
        this.f73907n.setColor(this.f73898e);
        this.f73907n.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f73902i, 0.0f, 360.0f, false, this.f73907n);
        this.f73907n.setColor(this.f73897d);
        this.f73907n.setStyle(Paint.Style.STROKE);
        this.f73907n.setStrokeWidth(this.f73906m);
        canvas.drawArc(this.f73903j, 270.0f, f10, false, this.f73907n);
    }

    private void f(Canvas canvas) {
        if (this.f73908o == null) {
            Paint paint = new Paint(1);
            this.f73908o = paint;
            paint.setAntiAlias(true);
            this.f73908o.setStyle(Paint.Style.FILL);
            this.f73908o.setTextAlign(Paint.Align.CENTER);
        }
        String strValueOf = String.valueOf(this.f73914u);
        this.f73908o.setColor(this.f73897d);
        this.f73908o.setTypeface(Typeface.create(Typeface.DEFAULT, this.f73896c));
        this.f73908o.setTextSize(a(this.f73901h, true));
        canvas.drawText(strValueOf, this.f73904k, this.f73905l - ((this.f73908o.descent() + this.f73908o.ascent()) / 2.0f), this.f73908o);
    }

    public void g(float f10, int i10) {
        if (this.f73895b == null || f10 == 100.0f) {
            this.f73913t = f10;
            this.f73914u = i10;
            postInvalidate();
        }
    }

    public void h(int i10, int i11) {
        this.f73897d = i10;
        this.f73898e = i11;
        b();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f73914u == 0 && this.f73895b == null) {
            return;
        }
        e(canvas);
        if (this.f73895b != null) {
            d(canvas);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    public void setImage(Bitmap bitmap) {
        this.f73895b = bitmap;
        if (bitmap != null) {
            this.f73913t = 100.0f;
        }
        postInvalidate();
    }

    @Override // e2.d
    public void setStyle(e2.e eVar) {
        this.f73896c = eVar.k().intValue();
        this.f73897d = eVar.B().intValue();
        this.f73898e = eVar.i().intValue();
        this.f73899f = eVar.I().booleanValue();
        this.f73906m = eVar.C(getContext()).floatValue();
        setPadding(eVar.v(getContext()).intValue(), eVar.A(getContext()).intValue(), eVar.x(getContext()).intValue(), eVar.u(getContext()).intValue());
        setAlpha(eVar.t().floatValue());
        b();
        postInvalidate();
    }
}
