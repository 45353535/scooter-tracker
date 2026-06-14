package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public class rdp extends com.bytedance.sdk.openadsdk.core.mo.mml {
    private Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private RectF f17578ud;

    public rdp(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.qdl.setColor(Color.parseColor("#99333333"));
        this.qdl.setAntiAlias(true);
        this.qdl.setStrokeWidth(0.0f);
        this.f17578ud = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f17578ud;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.qdl);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.mml, android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f17578ud.right == getMeasuredWidth() && this.f17578ud.bottom == getMeasuredHeight()) {
            return;
        }
        this.f17578ud.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
