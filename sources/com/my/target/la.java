package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class la extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Paint f60093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Path f60094b;

    static {
        Paint paint = new Paint();
        f60093a = paint;
        f60094b = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public la(Context context) {
        super(context);
    }

    public static Path a(float f10) {
        Path path = f60094b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f11 = 0.45f * f10;
        double d10 = f10;
        float f12 = f10 * 2.0f;
        path.moveTo((float) ((Math.sin(0.0d) * d10) + d10), f12 - ((float) ((Math.cos(0.0d) * d10) + d10)));
        double d11 = f11;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d11) + d10), f12 - ((float) ((Math.cos(0.6283185307179586d) * d11) + d10)));
        for (int i10 = 1; i10 < 5; i10++) {
            Path path2 = f60094b;
            double d12 = ((double) i10) * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d12) * d10) + d10), f12 - ((float) ((Math.cos(d12) * d10) + d10)));
            double d13 = d12 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d13) * d11) + d10), f12 - ((float) ((Math.cos(d13) * d11) + d10)));
        }
        Path path3 = f60094b;
        path3.close();
        return path3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == 0.0f) {
            return;
        }
        canvas.drawPath(a(measuredHeight), f60093a);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        setMeasuredDimension(iMin, iMin);
    }

    public void setColor(int i10) {
        f60093a.setColor(i10);
        invalidate();
    }
}
