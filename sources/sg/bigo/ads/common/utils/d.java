package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f102790a = 16908288;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102791b = 40;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f102792c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f102793d = 128;

    /* JADX INFO: renamed from: sg.bigo.ads.common.utils.d$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueCallback f102799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f102800b;

        AnonymousClass2(ValueCallback valueCallback, Bitmap bitmap) {
            this.f102799a = valueCallback;
            this.f102800b = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f102799a.onReceiveValue(this.f102800b);
        }
    }

    public static Bitmap a(int i10, int i11, Bitmap.Config config) {
        try {
            return Bitmap.createBitmap(i10, i11, config);
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", Log.getStackTraceString(th2));
            return null;
        }
    }

    @RequiresApi(api = 17)
    @WorkerThread
    public static Bitmap b(Context context, Bitmap bitmap) {
        if (sg.bigo.ads.common.n.d.b()) {
            t.c();
        }
        return a(context, bitmap);
    }

    public static Bitmap a(Context context, float f10, @DrawableRes int i10, @DrawableRes int i11, @DrawableRes int i12) {
        return a(context, f10, i10, i11, i12, false);
    }

    private static Bitmap b(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", Log.getStackTraceString(th2));
            return null;
        }
    }

    public static Bitmap a(Context context, float f10, @DrawableRes int i10, @DrawableRes int i11, @DrawableRes int i12, boolean z10) {
        Drawable drawableA;
        Paint paint;
        Paint paint2;
        Context context2 = context;
        Paint paint3 = null;
        if (f10 <= 0.0f || (drawableA = a.a(context2, i10)) == null) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) a.a(context2, i11)).getBitmap();
        Bitmap bitmapExtractAlpha = z10 ? bitmap.extractAlpha() : null;
        Bitmap bitmap2 = ((BitmapDrawable) drawableA).getBitmap();
        Bitmap bitmapExtractAlpha2 = z10 ? bitmap2.extractAlpha() : null;
        int width = bitmap2.getWidth() / 4;
        int i13 = 5;
        Bitmap bitmapA = a((bitmap2.getWidth() * 5) + (width * 4), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapA == null) {
            return null;
        }
        bitmapA.setDensity(bitmap2.getDensity());
        if (z10) {
            paint = new Paint();
            paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.NORMAL));
        } else {
            paint = null;
        }
        Canvas canvas = new Canvas(bitmapA);
        int i14 = 1;
        int width2 = 0;
        while (i14 <= i13) {
            if (i14 <= f10) {
                if (paint != null && bitmapExtractAlpha2 != null) {
                    paint.setColor(-12303292);
                    canvas.drawBitmap(bitmapExtractAlpha2, width2, 0.0f, paint);
                }
                canvas.drawBitmap(bitmap2, width2, 0.0f, paint3);
                width2 += bitmap2.getWidth() + width;
                paint2 = paint3;
            } else {
                if (paint != null && bitmapExtractAlpha != null) {
                    paint.setColor(sg.bigo.ads.common.w.b.a(-12303292, 0.15f));
                    canvas.drawBitmap(bitmapExtractAlpha, width2, 0.0f, paint);
                }
                float f11 = width2;
                canvas.drawBitmap(bitmap, f11, 0.0f, paint3);
                if (i14 == ((int) (f10 + 0.5f))) {
                    Bitmap bitmap3 = ((BitmapDrawable) a.a(context2, i12)).getBitmap();
                    if (paint != null) {
                        Bitmap bitmapExtractAlpha3 = bitmap3.extractAlpha();
                        paint.setColor(-12303292);
                        canvas.drawBitmap(bitmapExtractAlpha3, f11, 0.0f, paint);
                    }
                    paint2 = null;
                    canvas.drawBitmap(bitmap3, f11, 0.0f, (Paint) null);
                } else {
                    paint2 = paint3;
                }
                width2 += bitmap.getWidth() + width;
            }
            i14++;
            paint3 = paint2;
            i13 = 5;
            context2 = context;
        }
        return bitmapA;
    }

    @Nullable
    public static sg.bigo.ads.common.c b(String str) {
        Bitmap bitmapDecodeFile;
        BitmapFactory.Options optionsA = a(str, f102792c, f102793d);
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, optionsA);
        } catch (OutOfMemoryError unused) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", "decodeIcon OutOfMemoryError:size = " + optionsA.inSampleSize + ",filePath=" + str);
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile != null) {
            return new sg.bigo.ads.common.c(bitmapDecodeFile, optionsA.outMimeType, str);
        }
        return null;
    }

    @RequiresApi(api = 17)
    @WorkerThread
    public static Bitmap a(Context context, Bitmap bitmap) {
        Bitmap bitmapA;
        if (bitmap != null && context != null) {
            int iRound = Math.round(bitmap.getWidth() * 0.25f);
            int iRound2 = Math.round(bitmap.getHeight() * 0.25f);
            if (iRound <= 0 || iRound2 <= 0 || (bitmapA = a(bitmap, iRound, iRound2)) == null) {
                return null;
            }
            Bitmap.Config config = bitmapA.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                bitmapA = bitmap.copy(config2, true);
            }
            Bitmap bitmapB = b(bitmapA);
            sg.bigo.ads.common.c.b bVar = new sg.bigo.ads.common.c.b(context);
            if (!bVar.a(10.0f)) {
                return null;
            }
            bVar.a(bitmapA, bitmapB);
            bitmapA.recycle();
            bVar.a();
            return bitmapB;
        }
        return null;
    }

    @Nullable
    public static sg.bigo.ads.common.c b(String str, Context context) {
        Bitmap bitmapDecodeFile;
        if (context == null) {
            return null;
        }
        BitmapFactory.Options optionsA = a(str, context.getResources().getDisplayMetrics().widthPixels, e.c(context));
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, optionsA);
        } catch (OutOfMemoryError unused) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", "decodeImage OutOfMemoryError:size = " + optionsA.inSampleSize + ",filePath=" + str);
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile != null) {
            return new sg.bigo.ads.common.c(bitmapDecodeFile, optionsA.outMimeType, str);
        }
        return null;
    }

    public static Bitmap a(Resources resources, int i10) {
        try {
            return BitmapFactory.decodeResource(resources, i10);
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", Log.getStackTraceString(th2));
            return null;
        }
    }

    @RequiresApi(api = 17)
    public static void b(final Context context, final Bitmap bitmap, final ValueCallback<Bitmap> valueCallback) {
        if (context == null || bitmap == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.utils.d.3
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapB = d.b(context, bitmap);
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.common.utils.d.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        valueCallback.onReceiveValue(bitmapB);
                    }
                });
            }
        });
    }

    public static Bitmap a(@NonNull Bitmap bitmap) {
        Bitmap bitmapA;
        LinearGradient linearGradient;
        float f10;
        float f11;
        float f12;
        float f13;
        if (bitmap.isRecycled()) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0 || (bitmapA = a(width, height, Bitmap.Config.ARGB_8888)) == null) {
            return bitmap;
        }
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        int i10 = f102791b;
        if (width >= height) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i10, ViewCompat.MEASURED_SIZE_MASK, -1, tileMode);
            paint.setShader(linearGradient);
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            f12 = width;
            f13 = 0.0f;
            canvas.drawRect(0.0f, 0.0f, f12, f102791b, paint);
            f10 = height;
            paint2.setShader(new LinearGradient(0.0f, height - f102791b, 0.0f, f10, -1, ViewCompat.MEASURED_SIZE_MASK, tileMode));
            paint2.setXfermode(new PorterDuffXfermode(mode));
            f11 = height - f102791b;
        } else {
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            linearGradient = new LinearGradient(0.0f, 0.0f, i10, 0.0f, ViewCompat.MEASURED_SIZE_MASK, -1, tileMode2);
            paint.setShader(linearGradient);
            PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode2));
            f10 = height;
            f11 = 0.0f;
            canvas.drawRect(0.0f, 0.0f, f102791b, f10, paint);
            f12 = width;
            paint2.setShader(new LinearGradient(width - f102791b, 0.0f, f12, 0.0f, -1, ViewCompat.MEASURED_SIZE_MASK, tileMode2));
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            f13 = width - f102791b;
        }
        canvas.drawRect(f13, f11, f12, f10, paint2);
        return bitmapA;
    }

    public static Bitmap a(Bitmap bitmap, int i10, int i11) {
        try {
            return Bitmap.createScaledBitmap(bitmap, i10, i11, false);
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "BitmapUtils", Log.getStackTraceString(th2));
            return null;
        }
    }

    @Nullable
    public static Bitmap a(String str) {
        sg.bigo.ads.common.c cVarB = b(str);
        if (cVarB != null) {
            return cVarB.f102292a;
        }
        return null;
    }

    @Nullable
    public static Bitmap a(String str, Context context) {
        sg.bigo.ads.common.c cVarB;
        if (context == null || (cVarB = b(str, context)) == null) {
            return null;
        }
        return cVarB.f102292a;
    }

    private static BitmapFactory.Options a(String str, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return new BitmapFactory.Options();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i12 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i13 = options.outWidth;
        int i14 = options.outHeight;
        if (i13 <= 0 || i14 <= 0) {
            return new BitmapFactory.Options();
        }
        if (i13 > i10 || i14 > i11) {
            int i15 = i13 / 2;
            int i16 = i14 / 2;
            while (true) {
                if (i15 / i12 < i10 && i16 / i12 < i11) {
                    break;
                }
                i12 *= 2;
            }
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i12;
        return options;
    }

    @Nullable
    public static AnimationDrawable a(ImageView imageView, Bitmap bitmap) {
        if (imageView == null || bitmap == null) {
            return null;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            animationDrawable.addFrame(drawable, 0);
        }
        animationDrawable.addFrame(new BitmapDrawable(imageView.getResources(), bitmap), 300);
        animationDrawable.setOneShot(true);
        animationDrawable.setEnterFadeDuration(300);
        animationDrawable.start();
        imageView.setImageDrawable(animationDrawable);
        return animationDrawable;
    }

    public static Drawable a(float f10, float f11, float f12, float f13, int i10, float f14, @Nullable boolean[] zArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(f14);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (k.a(zArr)) {
            return shapeDrawable;
        }
        float f15 = 0.0f;
        float f16 = (zArr.length <= 0 || !zArr[0]) ? 0.0f : -f14;
        float f17 = (zArr.length < 2 || !zArr[1]) ? 0.0f : -f14;
        float f18 = (zArr.length < 3 || !zArr[2]) ? 0.0f : -f14;
        if (zArr.length >= 4 && zArr[3]) {
            f15 = -f14;
        }
        return new InsetDrawable((Drawable) shapeDrawable, (int) f16, (int) f17, (int) f18, (int) f15);
    }

    public static Drawable a(float f10, float f11, float f12, float f13, int i10, int i11, float f14) {
        Drawable drawableA = a(f10, f11, f12, f13, (Rect) null, i10);
        if (i11 == 0 || f14 <= 0.0f) {
            return drawableA;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawableA, a(f10, f11, f12, f13, i11, f14, (boolean[]) null)});
        layerDrawable.setId(0, f102790a);
        return layerDrawable;
    }

    public static Drawable a(float f10, float f11, float f12, float f13, @Nullable Rect rect, int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i10);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return rect == null ? shapeDrawable : new InsetDrawable((Drawable) shapeDrawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void a(final Context context, final Bitmap bitmap, final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.utils.d.1
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapA = d.a(context, bitmap);
                if (valueCallback != null) {
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.common.utils.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            valueCallback.onReceiveValue(bitmapA);
                        }
                    });
                }
            }
        });
    }

    public static void a(@NonNull final Bitmap bitmap, final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.utils.d.4
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmapA = d.a(bitmap);
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    if (bitmapA == null) {
                        bitmapA = bitmap;
                    }
                    valueCallback2.onReceiveValue(bitmapA);
                }
            }
        });
    }
}
