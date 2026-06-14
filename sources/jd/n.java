package jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f85823a = new n();

    private n() {
    }

    public final Drawable a(Context context, String str) {
        byte[] bArrE;
        Bitmap bitmapD;
        BitmapDrawable bitmapDrawableH;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
            try {
                String strZ = g0.z(str);
                if (strZ != null && (bArrE = g0.e(strZ, 0)) != null && (bitmapD = pd.j.d(bArrE, null, 1, null)) != null && (bitmapDrawableH = pd.j.h(bitmapD, context)) != null) {
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawableH.setTileModeXY(tileMode, tileMode);
                    return bitmapDrawableH;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
