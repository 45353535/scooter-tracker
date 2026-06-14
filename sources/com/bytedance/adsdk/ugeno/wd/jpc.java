package com.bytedance.adsdk.ugeno.wd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private static TypedValue lnr;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final Object f16271ud = new Object();
    public static Handler qdl = new Handler(Looper.getMainLooper());

    public static float qdl(Context context, String str) {
        float f10;
        float f11 = context.getResources().getDisplayMetrics().density;
        try {
            f10 = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f10 = 0.0f;
        }
        return (f10 * f11) + 0.5f;
    }

    public static int ud(Context context, float f10) {
        float f11 = context.getResources().getDisplayMetrics().density;
        if (f11 <= 0.0f) {
            f11 = 1.0f;
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    public static float qdl(Context context, float f10) {
        return (f10 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap qdl(Context context, Bitmap bitmap, int i10) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i10);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable qdl(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static boolean qdl() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void qdl(Runnable runnable) {
        if (qdl()) {
            runnable.run();
        } else {
            qdl.post(runnable);
        }
    }
}
