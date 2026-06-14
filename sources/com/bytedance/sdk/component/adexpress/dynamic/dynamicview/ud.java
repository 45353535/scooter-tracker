package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends GradientDrawable {
    protected Path qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Paint f16332ud;

    public ud() {
        this.qdl = new Path();
        Paint paint = new Paint(1);
        this.f16332ud = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.qdl;
        if (path == null || path.isEmpty()) {
            qdl(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f16332ud, 31);
        qdl(canvas);
        this.f16332ud.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.qdl, this.f16332ud);
        this.f16332ud.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void qdl(Canvas canvas) {
        super.draw(canvas);
    }

    public void qdl(int i10, int i11, int i12, int i13) {
        this.qdl.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public ud(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.qdl = new Path();
        Paint paint = new Paint(1);
        this.f16332ud = paint;
        paint.setColor(-1);
    }
}
