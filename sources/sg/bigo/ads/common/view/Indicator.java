package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public class Indicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f102874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f102876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f102877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f102879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f102881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f102883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f102884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f102885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f102886m;

    public Indicator(Context context) {
        this(context, null);
    }

    public static float a(int i10, float f10, float f11, float f12) {
        float f13 = i10 - 1;
        return (f11 * 2.0f * f13) + (f10 * f13) + f12;
    }

    public float getDistance() {
        return this.f102883j;
    }

    public float getLengthSelected() {
        return this.f102881h;
    }

    public float getRadius() {
        return this.f102879f;
    }

    public int getType() {
        return this.f102875b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f102875b != 1) {
            a(canvas);
            return;
        }
        if (this.f102886m > 0.0f) {
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            float f10 = this.f102886m;
            canvas.translate(((width - f10) / 2.0f) + this.f102879f, height / 2.0f);
            a();
            float f11 = this.f102879f;
            RectF rectF = new RectF(0.0f, -f11, f10, f11);
            float f12 = this.f102879f;
            canvas.drawRoundRect(rectF, f12, f12, this.f102876c);
            float f13 = (f10 - this.f102881h) * this.f102874a;
            float f14 = this.f102879f;
            RectF rectF2 = new RectF(f13, -f14, this.f102881h + f13, f14);
            float f15 = this.f102879f;
            canvas.drawRoundRect(rectF2, f15, f15, this.f102877d);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        float f10 = this.f102879f * 2.0f;
        int i12 = this.f102878e;
        float paddingLeft = (f10 * (i12 - 1)) + (this.f102883j * (i12 - 1)) + this.f102881h + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.f102879f * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, (int) paddingTop);
            return;
        }
        if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
        } else {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        }
    }

    public void setColor(int i10) {
        if (this.f102880g != i10) {
            this.f102880g = i10;
            invalidate();
        }
    }

    public void setColorSelected(int i10) {
        if (this.f102882i != i10) {
            this.f102882i = i10;
            invalidate();
        }
    }

    public void setLineLength(float f10) {
        if (this.f102886m != f10) {
            this.f102886m = f10;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i10) {
        if (this.f102878e != i10) {
            sg.bigo.ads.common.t.a.a("Indicator", "onMeasure, setNum=".concat(String.valueOf(i10)));
            this.f102878e = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f10) {
        if (f10 != this.f102879f) {
            this.f102879f = f10;
            this.f102881h = 8.0f * f10;
            this.f102883j = f10 * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f102875b != i10) {
            this.f102875b = i10;
            invalidate();
        }
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        Paint paint = new Paint();
        this.f102876c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f102876c.setColor(this.f102880g);
        this.f102876c.setAntiAlias(true);
        this.f102876c.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(this.f102876c);
        this.f102877d = paint2;
        paint2.setColor(this.f102882i);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102875b = 0;
        this.f102880g = -2130706433;
        float fA = e.a(getContext(), 2);
        this.f102879f = fA;
        this.f102882i = -1;
        this.f102881h = 8.0f * fA;
        this.f102883j = fA * 2.0f;
        this.f102878e = 0;
        this.f102884k = 0.0f;
        this.f102885l = 0;
    }

    public final void a(float f10, int i10) {
        if (i10 == this.f102885l) {
            this.f102884k = (-f10) * 2.0f;
            invalidate();
        }
    }

    public final void a(int i10) {
        if (this.f102885l != i10) {
            this.f102885l = i10;
            this.f102884k = 0.0f;
            invalidate();
        }
    }

    private void a(Canvas canvas) {
        float f10;
        if (this.f102878e <= 0) {
            return;
        }
        canvas.translate(((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - a(this.f102878e, this.f102883j, this.f102879f, this.f102881h)) / 2.0f) + getPaddingLeft() + this.f102879f, (((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        a();
        float f11 = -this.f102879f;
        for (int i10 = 0; i10 < this.f102878e; i10++) {
            if (i10 == this.f102885l) {
                float f12 = this.f102879f;
                canvas.drawCircle(f11 + f12, 0.0f, f12, this.f102876c);
                float f13 = this.f102881h + f11;
                float f14 = this.f102879f;
                canvas.drawCircle(f13 - f14, 0.0f, f14, this.f102876c);
                float f15 = (this.f102883j * this.f102884k) + f11;
                float f16 = this.f102879f;
                RectF rectF = new RectF(f15, -f16, this.f102881h + f15, f16);
                float f17 = this.f102879f;
                canvas.drawRoundRect(rectF, f17, f17, this.f102877d);
                f10 = this.f102881h;
            } else {
                float f18 = this.f102879f;
                canvas.drawCircle(f11 + f18, 0.0f, f18, this.f102876c);
                f10 = this.f102879f * 2.0f;
            }
            f11 = f11 + f10 + this.f102883j;
        }
    }
}
