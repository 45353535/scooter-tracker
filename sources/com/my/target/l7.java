package com.my.target;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l7 {
    public static Bitmap a(int i10) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gb.a("NativeAdResources: Cannot build play icon - OOME");
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1157627904);
        float f10 = i10;
        canvas.drawOval(new RectF(0.0f, 0.0f, f10, f10), paint);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(8);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        float f11 = 4;
        float f12 = i10 - 4;
        canvas.drawOval(new RectF(f11, f11, f12, f12), paint2);
        Paint paint3 = new Paint();
        paint3.setColor(0);
        canvas.drawPaint(paint3);
        paint3.setStrokeWidth(4.0f);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setAntiAlias(true);
        float f13 = f10 / 160.0f;
        int i11 = (int) (60.0f * f13);
        Point point = new Point(i11, (int) (50.0f * f13));
        Point point2 = new Point(i11, (int) (110.0f * f13));
        Point point3 = new Point((int) (112.0f * f13), (int) (f13 * 80.0f));
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point.x, point.y);
        path.close();
        canvas.drawPath(path, paint3);
        return bitmapCreateBitmap;
    }

    public static Bitmap b() {
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = TypedValues.CycleType.TYPE_EASING;
        options.inTargetDensity = kb.b();
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
    }

    public static Bitmap c() {
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = TypedValues.CycleType.TYPE_EASING;
        options.inTargetDensity = kb.b();
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
    }

    public static Bitmap b(int i10) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gb.a("NativeAdResources: Cannot build icon - OOME");
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        float f10 = i10 / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        a(f10, i10, paint, canvas);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f11 = 62.0f * f10;
        float f12 = 40.0f * f10;
        path.moveTo(f11, f12);
        float f13 = 82.0f * f10;
        float f14 = f10 * 60.0f;
        path.lineTo(f13, f14);
        path.moveTo(f11, f14);
        path.lineTo(f13, f12);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap c(int i10) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gb.a("NativeAdResources: Cannot build icon - OOME");
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        float f10 = i10 / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        a(f10, i10, paint, canvas);
        canvas.drawArc(new RectF(57.0f * f10, 45.0f * f10, 67.0f * f10, 55.0f * f10), 90.0f, -180.0f, false, paint);
        canvas.drawArc(new RectF(52.0f * f10, 40.0f * f10, 72.0f * f10, f10 * 60.0f), 90.0f, -180.0f, false, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap a() {
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = TypedValues.CycleType.TYPE_EASING;
        options.inTargetDensity = kb.b();
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
    }

    public static Canvas a(float f10, int i10, Paint paint, Canvas canvas) {
        float f11 = 3.0f * f10;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-2013265920);
        float f12 = i10;
        canvas.drawOval(new RectF(0.0f, 0.0f, f12, f12), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(f11);
        paint3.setColor(-1);
        float f13 = f12 / 2.0f;
        canvas.drawCircle(f13, f13, f13 - (f11 / 2.0f), paint3);
        paint.setStrokeWidth(f11);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f14 = 23.0f * f10;
        float f15 = 38.0f * f10;
        path.moveTo(f14, f15);
        float f16 = 60.0f * f10;
        path.lineTo(f14, f16);
        path.lineTo(f15, f16);
        path.lineTo(f15, f15);
        float f17 = 56.0f * f10;
        path.lineTo(f17, 27.0f * f10);
        path.lineTo(f17, f10 * 71.0f);
        path.lineTo(f15, f16);
        path.moveTo(f15, f15);
        path.lineTo(f14, f15);
        path.close();
        canvas.drawPath(path, paint);
        return canvas;
    }
}
