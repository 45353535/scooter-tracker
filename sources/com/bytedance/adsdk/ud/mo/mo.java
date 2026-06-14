package com.bytedance.adsdk.ud.mo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.ud.qdl.qdl.jyq;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    private static final ThreadLocal<PathMeasure> qdl = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.ud.mo.mo.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final ThreadLocal<Path> f16069ud = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ud.mo.mo.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> lnr = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ud.mo.mo.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> mml = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.ud.mo.mo.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float mzz = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int qdl(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (f10 * 527.0f) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean ud(Matrix matrix) {
        float[] fArr = mml.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static boolean qdl(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static Path qdl(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f10 = pointF.x + pointF3.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float qdl(Matrix matrix) {
        float[] fArr = mml.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = mzz;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void qdl(Path path, jyq jyqVar) {
        if (jyqVar == null || jyqVar.mo()) {
            return;
        }
        qdl(path, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.lnr()).tvp() / 100.0f, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.mml()).tvp() / 100.0f, ((com.bytedance.adsdk.ud.qdl.ud.mml) jyqVar.mzz()).tvp() / 360.0f);
    }

    public static void qdl(Path path, float f10, float f11, float f12) {
        com.bytedance.adsdk.ud.mzz.qdl("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = qdl.get();
        Path path2 = f16069ud.get();
        Path path3 = lnr.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = mzz.qdl(fMin, length);
                fMax = mzz.qdl(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = mzz.qdl(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = mzz.qdl(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.ud.mzz.ud("applyTrimPathIfNeeded");
    }

    public static float qdl() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float qdl(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap qdl(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean qdl(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static void qdl(Canvas canvas, RectF rectF, Paint paint) {
        qdl(canvas, rectF, paint, 31);
    }

    public static void qdl(Canvas canvas, RectF rectF, Paint paint, int i10) {
        com.bytedance.adsdk.ud.mzz.qdl("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.ud.mzz.ud("Utils#saveLayer");
    }
}
