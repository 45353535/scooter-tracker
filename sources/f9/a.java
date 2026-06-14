package f9;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b9.j;
import b9.k;
import b9.u;

/* JADX INFO: loaded from: classes12.dex */
public class a extends View implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f71941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f71942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f71943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f71945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f71946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f71947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f71948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f71949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f71950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f71951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f71952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f71953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f71954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f71955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f71956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f71957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Paint f71958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f71959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f71960u;

    public a(Context context) {
        super(context);
        this.f71943d = b9.a.f5837a;
        this.f71944e = b9.a.f5839c;
        this.f71945f = false;
        this.f71946g = 0.0f;
        this.f71947h = 0.071428575f;
        this.f71948i = new RectF();
        this.f71949j = new RectF();
        this.f71950k = 54.0f;
        this.f71951l = 54.0f;
        this.f71952m = 5.0f;
        this.f71959t = 100.0f;
        c(context);
    }

    private float a(float f10, boolean z10) {
        float fWidth = this.f71948i.width();
        if (z10) {
            fWidth -= this.f71952m * 2.0f;
        }
        float fSqrt = (float) (((double) (fWidth / 2.0f)) * Math.sqrt(2.0d));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    private void b() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        this.f71948i.set(width, height, width + fMin, fMin + height);
        this.f71950k = this.f71948i.centerX();
        this.f71951l = this.f71948i.centerY();
        RectF rectF = this.f71949j;
        RectF rectF2 = this.f71948i;
        float f11 = rectF2.left;
        float f12 = this.f71952m / 2.0f;
        rectF.set(f11 + f12, rectF2.top + f12, rectF2.right - f12, rectF2.bottom - f12);
    }

    private void c(Context context) {
        setLayerType(1, null);
        this.f71952m = u.p(context, 3.0f);
    }

    private void d(Canvas canvas) {
        if (this.f71953n == null) {
            this.f71953n = new Paint(1);
        }
        float f10 = 360.0f - ((this.f71959t * 360.0f) * 0.01f);
        this.f71953n.setColor(this.f71944e);
        this.f71953n.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f71948i, 0.0f, 360.0f, false, this.f71953n);
        this.f71953n.setColor(this.f71943d);
        this.f71953n.setStyle(Paint.Style.STROKE);
        this.f71953n.setStrokeWidth(this.f71952m);
        canvas.drawArc(this.f71949j, 270.0f, f10, false, this.f71953n);
    }

    private void e(Canvas canvas, Bitmap bitmap) {
        if (this.f71957r == null) {
            Paint paint = new Paint(7);
            this.f71957r = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f71957r.setAntiAlias(true);
        }
        if (this.f71955p == null) {
            this.f71955p = new Rect();
        }
        if (this.f71956q == null) {
            this.f71956q = new RectF();
        }
        float fA = a(this.f71946g, this.f71945f);
        float f10 = fA / 2.0f;
        float f11 = this.f71950k - f10;
        float f12 = this.f71951l - f10;
        this.f71955p.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f71956q.set(f11, f12, f11 + fA, fA + f12);
        this.f71957r.setColorFilter(new PorterDuffColorFilter(this.f71943d, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, this.f71955p, this.f71956q, this.f71957r);
        if (this.f71945f) {
            if (this.f71958s == null) {
                Paint paint2 = new Paint(1);
                this.f71958s = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f71958s.setStrokeWidth(this.f71952m);
            this.f71958s.setColor(this.f71943d);
            canvas.drawArc(this.f71949j, 0.0f, 360.0f, false, this.f71958s);
        }
    }

    private void f(Canvas canvas) {
        if (this.f71954o == null) {
            Paint paint = new Paint(1);
            this.f71954o = paint;
            paint.setAntiAlias(true);
            this.f71954o.setStyle(Paint.Style.FILL);
            this.f71954o.setTextAlign(Paint.Align.CENTER);
        }
        String strValueOf = String.valueOf(this.f71960u);
        this.f71954o.setColor(this.f71943d);
        this.f71954o.setTypeface(Typeface.create(Typeface.DEFAULT, this.f71942c));
        this.f71954o.setTextSize(a(this.f71947h, true));
        canvas.drawText(strValueOf, this.f71950k, this.f71951l - ((this.f71954o.descent() + this.f71954o.ascent()) / 2.0f), this.f71954o);
    }

    public void g(float f10, int i10) {
        if (this.f71941b == null || f10 == 100.0f) {
            this.f71959t = f10;
            this.f71960u = i10;
            postInvalidate();
        }
    }

    public int getAccentColor() {
        return this.f71943d;
    }

    public int getBackgroundColor() {
        return this.f71944e;
    }

    public void h(int i10, int i11) {
        this.f71943d = i10;
        this.f71944e = i11;
        b();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f71960u == 0 && this.f71941b == null) {
            return;
        }
        d(canvas);
        Bitmap bitmap = this.f71941b;
        if (bitmap != null) {
            e(canvas, bitmap);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        this.f71941b = bitmap;
        if (bitmap != null) {
            this.f71959t = 100.0f;
        }
        postInvalidate();
    }

    @Override // b9.j
    public void setStyle(@NonNull k kVar) {
        this.f71942c = kVar.k().intValue();
        this.f71943d = kVar.B().intValue();
        this.f71944e = kVar.i().intValue();
        this.f71945f = kVar.I().booleanValue();
        this.f71952m = kVar.C(getContext()).floatValue();
        setPadding(kVar.v(getContext()).intValue(), kVar.A(getContext()).intValue(), kVar.x(getContext()).intValue(), kVar.u(getContext()).intValue());
        setAlpha(kVar.t().floatValue());
        b();
        postInvalidate();
    }
}
