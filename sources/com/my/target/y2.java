package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class y2 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f61056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f61057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorFilter f61058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f61059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f61061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f61063h;

    public y2(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f61057b = paint;
        paint.setFilterBitmap(true);
        this.f61059d = kb.a();
        this.f61060e = kb.a(10, context);
        this.f61056a = new Rect();
        this.f61058c = new LightingColorFilter(-3355444, 1);
    }

    public void a(Bitmap bitmap, boolean z10) {
        this.f61061f = bitmap;
        if (bitmap == null) {
            this.f61063h = 0;
            this.f61062g = 0;
        } else if (z10) {
            float f10 = this.f61059d > 1.0f ? 2.0f : 1.0f;
            this.f61063h = (int) ((bitmap.getHeight() / f10) * this.f61059d);
            this.f61062g = (int) ((this.f61061f.getWidth() / f10) * this.f61059d);
        } else {
            this.f61062g = bitmap.getWidth();
            this.f61063h = this.f61061f.getHeight();
        }
        int i10 = this.f61062g;
        int i11 = this.f61060e * 2;
        setMeasuredDimension(i10 + i11, this.f61063h + i11);
        requestLayout();
    }

    public int getPadding() {
        return this.f61060e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f61061f;
        if (bitmap != null) {
            Rect rect = this.f61056a;
            int i10 = this.f61060e;
            rect.left = i10;
            rect.top = i10;
            rect.right = this.f61062g + i10;
            rect.bottom = this.f61063h + i10;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f61057b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f61057b.setColorFilter(this.f61058c);
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
            performClick();
        }
        this.f61057b.setColorFilter(null);
        invalidate();
        return true;
    }
}
