package l3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import com.flask.colorpicker.R$dimen;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Bitmap f94024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Canvas f94025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Bitmap f94026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Canvas f94027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f94028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f94029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f94030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f94031i;

    public a(Context context) {
        super(context);
        this.f94029g = 20;
        this.f94030h = 5;
        this.f94031i = 1.0f;
    }

    protected void a() {
        int width = getWidth();
        int height = getHeight();
        int i10 = width - (this.f94028f * 2);
        int i11 = this.f94030h;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f94026d = Bitmap.createBitmap(i10, i11, config);
        this.f94027e = new Canvas(this.f94026d);
        Bitmap bitmap = this.f94024b;
        if (bitmap != null && bitmap.getWidth() == width && this.f94024b.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.f94024b;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f94024b = Bitmap.createBitmap(width, height, config);
        this.f94025c = new Canvas(this.f94024b);
    }

    protected abstract void b(Canvas canvas);

    protected abstract void c(Canvas canvas, float f10, float f11);

    protected int d(int i10) {
        return getResources().getDimensionPixelSize(i10);
    }

    protected abstract void e(float f10);

    protected void f() {
        this.f94029g = d(R$dimen.f20068b);
        this.f94030h = d(R$dimen.f20067a);
        this.f94028f = this.f94029g;
        if (this.f94026d == null) {
            a();
        }
        b(this.f94027e);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f94026d == null || (canvas2 = this.f94025c) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f94025c.drawBitmap(this.f94026d, this.f94028f, (getHeight() - this.f94026d.getHeight()) / 2, (Paint) null);
        c(this.f94025c, this.f94029g + (this.f94031i * (getWidth() - (this.f94029g * 2))), getHeight() / 2.0f);
        canvas.drawBitmap(this.f94024b, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i10) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i11 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i11) : 0;
        }
        setMeasuredDimension(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L16
            goto L3f
        Ld:
            float r4 = r3.f94031i
            r3.e(r4)
            r3.invalidate()
            goto L3f
        L16:
            android.graphics.Bitmap r0 = r3.f94026d
            if (r0 == 0) goto L3f
            float r4 = r4.getX()
            int r0 = r3.f94028f
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.f94026d
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            r3.f94031i = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r0)
            r0 = 0
            float r4 = java.lang.Math.max(r0, r4)
            r3.f94031i = r4
            r3.e(r4)
            r3.invalidate()
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnValueChangedListener(d dVar) {
    }
}
