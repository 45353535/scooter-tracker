package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes4.dex */
public final class vq extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f117150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f117151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f117152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f117153f;

    public vq(Context context, wf0 wf0Var) {
        super(context);
        wf0Var.getClass();
        this.f117148a = wf0.a(context, 34.0f);
        float fA = wf0.a(context, 3.0f);
        this.f117149b = fA;
        float fA2 = wf0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f117150c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f117151d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f117152e = paint3;
        this.f117153f = 40.0f;
        a();
    }

    public final void a() {
        this.f117151d.setColor(qi3.a(SupportMenu.CATEGORY_MASK, this.f117153f));
        this.f117150c.setColor(qi3.a(-1, this.f117153f));
        this.f117152e.setColor(qi3.a(SupportMenu.CATEGORY_MASK, this.f117153f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f117148a / f10;
        canvas.drawCircle(f11, f11, f11, this.f117150c);
        canvas.drawCircle(f11, f11, f11 - (this.f117149b / f10), this.f117151d);
        float f12 = this.f117148a / f10;
        canvas.drawText("!", f12, f12 - ((this.f117152e.ascent() + this.f117152e.descent()) / f10), this.f117152e);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) this.f117148a;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        this.f117153f = z10 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
