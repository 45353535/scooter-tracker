package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class tvp extends View {
    private int jpc;
    private final RectF lnr;
    private Paint mml;
    private int mo;
    private Paint mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16439ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private Paint f16440wd;

    public tvp(Context context) {
        super(context);
        this.lnr = new RectF();
        qdl();
    }

    private void qdl() {
        Paint paint = new Paint();
        this.mml = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f16440wd = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.mzz = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.lnr;
        int i10 = this.mo;
        canvas.drawRoundRect(rectF, i10, i10, this.mzz);
        RectF rectF2 = this.lnr;
        int i11 = this.mo;
        canvas.drawRoundRect(rectF2, i11, i11, this.mml);
        int i12 = this.qdl;
        int i13 = this.f16439ud;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.f16440wd);
        int i14 = this.qdl;
        int i15 = this.f16439ud;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.f16440wd);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.qdl = i10;
        this.f16439ud = i11;
        RectF rectF = this.lnr;
        int i14 = this.jpc;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.mzz.setStyle(Paint.Style.FILL);
        this.mzz.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.f16440wd.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.f16440wd.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.mo = i10;
    }

    public void setStrokeColor(int i10) {
        this.mml.setStyle(Paint.Style.STROKE);
        this.mml.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.mml.setStrokeWidth(i10);
        this.jpc = i10;
    }
}
