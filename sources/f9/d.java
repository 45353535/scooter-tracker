package f9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.NonNull;
import b9.j;
import b9.k;
import b9.u;

/* JADX INFO: loaded from: classes12.dex */
public class d extends View implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f71967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f71968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f71969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f71971f;

    public d(Context context) {
        super(context);
        this.f71967b = new Paint(1);
        this.f71968c = 0.0f;
        this.f71969d = 15.0f;
        this.f71970e = b9.a.f5837a;
        this.f71971f = 0;
        a();
    }

    private void a() {
        this.f71969d = u.p(getContext(), 4.0f);
    }

    public void b(float f10) {
        this.f71968c = f10;
        postInvalidate();
    }

    public int getLineColor() {
        return this.f71970e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f71967b.setStrokeWidth(this.f71969d);
        this.f71967b.setColor(this.f71971f);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f71967b);
        this.f71967b.setColor(this.f71970e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f71968c) / 100.0f), measuredHeight, this.f71967b);
    }

    @Override // b9.j
    public void setStyle(@NonNull k kVar) {
        this.f71970e = kVar.B().intValue();
        this.f71971f = kVar.i().intValue();
        this.f71969d = kVar.C(getContext()).floatValue();
        setAlpha(kVar.t().floatValue());
        postInvalidate();
    }
}
