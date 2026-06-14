package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.e;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f8358c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f8359d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f8360e = new Paint(1);

    public n(Context context) {
        super(context);
        f8358c.setColor(-1);
        f8359d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f8360e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f8326a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f8326a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f8326a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f8358c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f8359d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f8360e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
