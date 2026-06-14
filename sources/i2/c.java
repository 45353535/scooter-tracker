package i2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.NonNull;
import e2.g;

/* JADX INFO: loaded from: classes5.dex */
public class c extends View implements e2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f73919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f73920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f73921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73923f;

    public c(Context context) {
        super(context);
        this.f73919b = new Paint(1);
        this.f73920c = 0.0f;
        this.f73921d = 15.0f;
        this.f73922e = e2.a.f68788a;
        this.f73923f = 0;
        a();
    }

    private void a() {
        this.f73921d = g.k(getContext(), 4.0f);
    }

    public void b(float f10) {
        this.f73920c = f10;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f73919b.setStrokeWidth(this.f73921d);
        this.f73919b.setColor(this.f73923f);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f73919b);
        this.f73919b.setColor(this.f73922e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f73920c) / 100.0f), measuredHeight, this.f73919b);
    }

    @Override // e2.d
    public void setStyle(@NonNull e2.e eVar) {
        this.f73922e = eVar.B().intValue();
        this.f73923f = eVar.i().intValue();
        this.f73921d = eVar.C(getContext()).floatValue();
        setAlpha(eVar.t().floatValue());
        postInvalidate();
    }
}
