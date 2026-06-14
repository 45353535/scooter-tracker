package com.ktwapps.speedometer.Widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public class DividerView extends View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f46204e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f46205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f46207d;

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f46122i0, 0, 0);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 5);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 5);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 3);
            this.f46207d = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            this.f46206c = typedArrayObtainStyledAttributes.getInt(4, f46204e);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f46205b = paint;
            paint.setAntiAlias(true);
            this.f46205b.setStyle(Paint.Style.STROKE);
            this.f46205b.setStrokeWidth(dimensionPixelSize3);
            this.f46205b.setPathEffect(new DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize}, 0.0f));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f46205b.setColor(this.f46207d);
        if (this.f46206c == f46204e) {
            float height = getHeight() * 0.5f;
            canvas.drawLine(0.0f, height, getWidth(), height, this.f46205b);
        } else {
            float width = getWidth() * 0.5f;
            canvas.drawLine(width, 0.0f, width, getHeight(), this.f46205b);
        }
    }

    public void setColor(int i10) {
        this.f46207d = i10;
    }
}
