package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public class qdl extends com.bytedance.sdk.openadsdk.core.mo.mml {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17565ud;

    public qdl(Context context) {
        super(context);
        this.qdl = 0;
        this.f17565ud = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.qdl == 0) {
            this.qdl = getWidth();
        }
        if (this.f17565ud == 0) {
            this.f17565ud = getHeight();
        }
        int i10 = this.qdl;
        int i11 = this.f17565ud;
        if (i10 >= i11) {
            i10 = i11;
        }
        return i10 / 2;
    }

    private boolean qdl() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    private boolean ud() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            return (getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapQdl;
        if (qdl()) {
            return;
        }
        measure(0, 0);
        if (ud()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            bitmapQdl = qdl(bitmapCopy, getRadius());
        } catch (Throwable unused2) {
            bitmapQdl = null;
        }
        if (bitmapQdl == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapQdl, (this.qdl / 2) - r2, (this.f17565ud / 2) - r2, (Paint) null);
        }
    }

    private Bitmap qdl(Bitmap bitmap, int i10) {
        int i11 = i10 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = height > width ? Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width) : height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i11) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }
}
