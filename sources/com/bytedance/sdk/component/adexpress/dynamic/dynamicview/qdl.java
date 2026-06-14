package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends ud {
    private final Bitmap lnr;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Rect f16330ud = new Rect();
    private final Paint mml = new Paint(1);

    public qdl(Bitmap bitmap, ud udVar) {
        this.lnr = bitmap;
        if (udVar != null) {
            this.qdl = udVar.qdl;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.lnr.getWidth();
        int height = this.lnr.getHeight();
        this.f16330ud.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.f16330ud;
                int i10 = (width - iWidth) / 2;
                rect2.left = i10;
                rect2.right = i10 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.f16330ud;
                int i11 = (height - iHeight) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.f16330ud;
            int i13 = (height - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.f16330ud;
        int i15 = (width - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ud
    protected void qdl(Canvas canvas) {
        canvas.drawBitmap(this.lnr, this.f16330ud, getBounds(), this.mml);
    }
}
