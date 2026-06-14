package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes6.dex */
public class exc extends Drawable {
    private int lnr;
    private RectF mml;
    private Paint qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16310ud;

    public exc(int i10, int i11) {
        this.lnr = i10;
        this.f16310ud = i11;
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setColor(0);
        this.qdl.setAntiAlias(true);
        this.qdl.setShadowLayer(i11, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.qdl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.mml;
        int i10 = this.lnr;
        canvas.drawRoundRect(rectF, i10, i10, this.qdl);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.qdl.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.f16310ud;
        this.mml = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.qdl.setColorFilter(colorFilter);
    }
}
