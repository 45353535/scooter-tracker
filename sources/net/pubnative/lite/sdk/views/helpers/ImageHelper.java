package net.pubnative.lite.sdk.views.helpers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class ImageHelper {
    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        float f10 = i10;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = i11;
        float f13 = i12;
        if (Math.abs((f10 / f11) - (f12 / f13)) <= 0.2d) {
            float f14 = f13 / f11;
            Matrix matrix = new Matrix();
            matrix.postScale(f12 / f10, f14);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            bitmap.recycle();
        } else {
            float f15 = f13 / f11;
            Matrix matrix2 = new Matrix();
            matrix2.postScale(f15, f15);
            bitmapCreateBitmap = Bitmap.createBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix2, false), (int) ((r12.getWidth() / 2.0f) - (f12 / 2.0f)), 0, i11, i12);
            bitmap.recycle();
        }
        return getRoundedCornerBitmap(bitmapCreateBitmap, i10);
    }
}
