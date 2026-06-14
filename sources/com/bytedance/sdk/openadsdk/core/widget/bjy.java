package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class bjy extends com.bytedance.sdk.openadsdk.core.mo.jpc {
    private int lnr;
    private Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private RectF f17555ud;

    public bjy(Context context) {
        this(context, null);
    }

    private void qdl() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.qdl.setColor(Color.parseColor("#99333333"));
        this.qdl.setAntiAlias(true);
        this.qdl.setStrokeWidth(0.0f);
        this.f17555ud = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f17555ud;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.qdl);
        canvas.translate((this.f17555ud.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.jpc, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f17555ud.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.lnr = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i12 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i12, measuredHeight);
        this.f17555ud.set(0.0f, 0.0f, i12, measuredHeight);
    }

    public bjy(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bjy(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.lnr = 0;
        qdl();
    }
}
