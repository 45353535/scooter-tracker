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
public class x2 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f61017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f61018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorFilter f61019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f61020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f61021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f61022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f61024h;

    public x2(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f61018b = paint;
        paint.setFilterBitmap(true);
        this.f61020d = kb.a();
        this.f61021e = kb.a(10, context);
        this.f61017a = new Rect();
        this.f61019c = new LightingColorFilter(-3355444, 1);
    }

    public void a(Bitmap bitmap, boolean z10) {
        this.f61022f = bitmap;
        if (bitmap == null) {
            this.f61024h = 0;
            this.f61023g = 0;
        } else if (z10) {
            float f10 = this.f61020d > 1.0f ? 2.0f : 1.0f;
            this.f61024h = (int) ((bitmap.getHeight() / f10) * this.f61020d);
            this.f61023g = (int) ((this.f61022f.getWidth() / f10) * this.f61020d);
        } else {
            this.f61023g = bitmap.getWidth();
            this.f61024h = this.f61022f.getHeight();
        }
        requestLayout();
    }

    public int getPadding() {
        return this.f61021e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f61022f != null) {
            Rect rect = this.f61017a;
            int i10 = this.f61021e;
            rect.left = i10;
            rect.top = i10;
            rect.right = getMeasuredWidth() - this.f61021e;
            this.f61017a.bottom = getMeasuredHeight() - this.f61021e;
            canvas.drawBitmap(this.f61022f, (Rect) null, this.f61017a, this.f61018b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            int r12 = android.view.View.MeasureSpec.getMode(r12)
            int r2 = r10.f61021e
            int r2 = r2 * 2
            int r3 = r0 - r2
            int r2 = r1 - r2
            android.graphics.Bitmap r4 = r10.f61022f
            if (r4 == 0) goto L64
            int r4 = r10.f61023g
            if (r4 <= 0) goto L64
            int r5 = r10.f61024h
            if (r5 <= 0) goto L64
            float r6 = (float) r4
            float r7 = (float) r5
            float r8 = r6 / r7
            r9 = 1073741824(0x40000000, float:2.0)
            if (r11 != r9) goto L32
            if (r12 != r9) goto L32
            r10.setMeasuredDimension(r0, r1)
            return
        L32:
            if (r11 != 0) goto L39
            if (r12 != 0) goto L39
            r3 = r4
            r2 = r5
            goto L5a
        L39:
            if (r11 != 0) goto L3f
            float r11 = (float) r2
            float r11 = r11 * r8
            int r3 = (int) r11
            goto L5a
        L3f:
            float r11 = (float) r3
            if (r12 != 0) goto L45
        L42:
            float r11 = r11 / r8
            int r2 = (int) r11
            goto L5a
        L45:
            float r12 = r11 / r6
            float r0 = (float) r2
            float r1 = r0 / r7
            float r1 = java.lang.Math.min(r12, r1)
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 != 0) goto L58
            r12 = 0
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 <= 0) goto L58
            goto L42
        L58:
            float r0 = r0 * r8
            int r3 = (int) r0
        L5a:
            int r11 = r10.f61021e
            int r11 = r11 * 2
            int r3 = r3 + r11
            int r2 = r2 + r11
            r10.setMeasuredDimension(r3, r2)
            return
        L64:
            r11 = 0
            r10.setMeasuredDimension(r11, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.x2.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f61018b.setColorFilter(this.f61019c);
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
        this.f61018b.setColorFilter(null);
        invalidate();
        return true;
    }

    public void setPadding(int i10) {
        this.f61021e = i10;
    }
}
