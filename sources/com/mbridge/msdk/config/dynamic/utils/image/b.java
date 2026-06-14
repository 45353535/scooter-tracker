package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.u1;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f47671a;

        a(ImageView imageView) {
            this.f47671a = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("ImageOperateUtil", "图片下载失败: " + str + " URL: " + str2);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ImageView imageView = this.f47671a;
                if (imageView instanceof ComponentImageView) {
                    ((ComponentImageView) imageView).setBitmap(bitmap);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th2) {
                q0.b("ImageOperateUtil", "设置图片异常: " + th2.getMessage());
            }
        }
    }

    public static void a(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Bitmap bitmap, final ImageView imageView) {
        final Bitmap bitmapB = b(bitmap);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.c
            @Override // java.lang.Runnable
            public final void run() {
                b.b(bitmapB, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final float f10, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.h
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmap, f10, tileMode, imageView);
                }
            });
        } else {
            imageView.setImageBitmap(bitmap);
            a(imageView, f10, tileMode);
        }
    }

    public static void b(final ImageView imageView, final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.i
            @Override // java.lang.Runnable
            public final void run() {
                b.c(bitmap, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    float f10 = iMin;
                    canvas.drawCircle(f10, f10, f10, paint);
                    return bitmapCreateBitmap;
                }
            } catch (Throwable th2) {
                q0.b("ImageOperateUtil", th2.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, float f10, Shader.TileMode tileMode, final ImageView imageView) {
        final Bitmap bitmapA = a(bitmap, f10, tileMode);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.d
            @Override // java.lang.Runnable
            public final void run() {
                b.a(bitmapA, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final int i10, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final int iA = a(str);
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.e
            @Override // java.lang.Runnable
            public final void run() {
                b.a(bitmap, i10, iA, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, int i10, int i11, final ImageView imageView) {
        final Bitmap bitmapA = a(bitmap, i10, i11);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.g
            @Override // java.lang.Runnable
            public final void run() {
                b.d(bitmapA, imageView);
            }
        });
    }

    public static void a(final ImageView imageView, final Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(a());
        } else if (bitmapArr.length == 1) {
            a(imageView, bitmapArr[0]);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.f
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmapArr, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap[] bitmapArr, final ImageView imageView) {
        final com.mbridge.msdk.video.dynview.shape.a aVarBuild;
        ArrayList arrayList = new ArrayList();
        for (Bitmap bitmap : bitmapArr) {
            arrayList.add(a(bitmap, 25.0f, Shader.TileMode.MIRROR));
        }
        if (arrayList.size() <= 1 || (aVarBuild = com.mbridge.msdk.video.dynview.shape.a.a().b((Bitmap) arrayList.get(0)).a((Bitmap) arrayList.get(1)).a(5).orientation(m0.F(com.mbridge.msdk.foundation.controller.c.n().d())).build()) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.j
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageDrawable(aVarBuild);
            }
        });
    }

    public static void a(View view, float f10, Shader.TileMode tileMode) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f10 <= 0.0f) {
                    f10 = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                view.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            }
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
        }
    }

    public static Bitmap a(Bitmap bitmap, float f10, Shader.TileMode tileMode) {
        if (f10 <= 0.0f) {
            f10 = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f10, f10, tileMode);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                y0.d.a();
                RenderNode renderNodeA = u1.a("BlurEffect");
                y0.e.a();
                HardwareRenderer hardwareRendererA = y0.c.a();
                hardwareRendererA.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererA.setContentRoot(renderNodeA);
                renderNodeA.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                renderNodeA.setRenderEffect(renderEffectCreateBlurEffect);
                renderNodeA.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNodeA.endRecording();
                hardwareRendererA.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    imageAcquireNextImage.close();
                    hardwareBuffer.close();
                    return bitmapWrapHardwareBuffer;
                }
                return a();
            }
            return a(bitmap);
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        try {
            Bitmap bitmapA = com.mbridge.msdk.config.dynamic.utils.image.a.a(bitmap, 10);
            if (bitmapA != null && !bitmapA.isRecycled()) {
                return bitmapA;
            }
            return a();
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    private static Bitmap a() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor("#FF0000"));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f10, int i10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                Path path = new Path();
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                switch (i10) {
                    case 0:
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        break;
                    case 1:
                        path.addRoundRect(rectF, new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 2:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 3:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10}, Path.Direction.CW);
                        break;
                    case 4:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 5:
                        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 6:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10}, Path.Direction.CW);
                        break;
                    case 7:
                        path.addRoundRect(rectF, new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10}, Path.Direction.CW);
                        break;
                    case 8:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 9:
                        path.addRoundRect(rectF, new float[]{f10, f10, 0.0f, 0.0f, f10, f10, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 10:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f10, f10, 0.0f, 0.0f, f10, f10}, Path.Direction.CW);
                        break;
                }
                canvas.clipPath(path);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                q0.b("ImageOperateUtil", th2.getMessage());
            }
        }
        return null;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("corner")) {
            return 0;
        }
        String strReplace = str.replace("corner", "");
        if (TextUtils.isEmpty(strReplace)) {
            return 0;
        }
        String upperCase = strReplace.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
        }
        return 0;
    }

    public static void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new a(imageView));
    }
}
