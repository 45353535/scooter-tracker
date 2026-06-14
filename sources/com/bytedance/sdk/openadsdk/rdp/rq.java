package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends View {
    private float lnr;
    private final Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f17810ud;

    public rq(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.lnr;
        if (f10 > 0.0f) {
            float f11 = this.f17810ud;
            canvas.drawLine(0.0f, f11, f10, f11, this.qdl);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.f17810ud = (1.0f * f10) / 2.0f;
        this.qdl.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.lnr = getWidth() * f10;
        invalidate();
    }
}
