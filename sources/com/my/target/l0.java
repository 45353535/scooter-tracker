package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Base64;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l0 {
    public static Bitmap a(Context context) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int iA = kb.a(1, context);
        int i10 = iA * 20;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(iA * 2);
        paint.setAntiAlias(true);
        paint.setColor(-5131855);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f10 = iA * 7;
        path.moveTo(iA, f10);
        path.lineTo(iA * 10, iA * 14);
        path.lineTo(iA * 19, f10);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap b(Context context) {
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAQAAABIkb+zAAAAAmJLR0QAAKqNIzIAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfgAR0KGztQKbC4AAAA8UlEQVR42u2aQQ6EMAzE6IhH8wR+DfeVoCAySRfs82plQ0FNxTQBAAAAAMBXab0frFut4NIeBFTLX4lo4+ufJ+i1z8BI1//sHvz9HSCAAAIIIIAAAiqZo/bl0Vzdi7GECCCAAAJGDlg392wtr77/eEBufXeC/PreBGXoOxOUo+9LUJa+K0F5+p4EZeo7EpSrH5+gbP3oBOXrxyaoQj8yQTX6cQmq0o9KUJ1+TML89A+Ozot+1VznSkxkBBBAAAEEEEAAAQQQ4J8HeqPH3f3+UDMxS4iAgDXt5cVf7iruvVJx/Tuv0aWN//k9AAAAAAB8lx0xVUXCRDTw+wAAAABJRU5ErkJggg==", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 640;
        options.inTargetDensity = kb.b();
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
    }

    public static Bitmap a(int i10, int i11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(i11);
        paint.setAntiAlias(true);
        paint.setColor(-7829368);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStyle(Paint.Style.STROKE);
        float f10 = i10;
        canvas.drawLine(0.0f, 0.0f, f10, f10, paint);
        canvas.drawLine(0.0f, f10, f10, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap a(int i10) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gb.a("BaseResources: Cannot build icon - OOME");
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        float f10 = i10;
        float f11 = f10 / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f12 = 3.0f * f11;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-2013265920);
        canvas.drawOval(new RectF(0.0f, 0.0f, f10, f10), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f12);
        paint3.setColor(-1);
        float f13 = i10 / 2;
        canvas.drawCircle(f13, f13, f13 - (f12 / 2.0f), paint3);
        paint.setStrokeWidth(f12);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f14 = 33.0f * f11;
        path.moveTo(f14, f14);
        float f15 = 66.0f * f11;
        path.lineTo(f15, f15);
        path.moveTo(f14, f15);
        float f16 = 50.0f * f11;
        path.lineTo(f16, f16);
        path.moveTo(55.0f * f11, f11 * 45.0f);
        path.lineTo(f15, f14);
        path.close();
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }
}
