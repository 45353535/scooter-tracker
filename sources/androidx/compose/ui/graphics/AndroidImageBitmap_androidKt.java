package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u0011H\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m1481ActualImageBitmapx__hDU(int i10, int i11, int i12, boolean z10, @NotNull ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap.Config configM1482toBitmapConfig1JJdX4A = m1482toBitmapConfig1JJdX4A(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Api26Bitmap.m1519createBitmapx__hDU$ui_graphics_release(i10, i11, i12, z10, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM1482toBitmapConfig1JJdX4A);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "<this>");
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m1482toBitmapConfig1JJdX4A(int i10) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        if (ImageBitmapConfig.m1796equalsimpl0(i10, companion.m1801getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m1796equalsimpl0(i10, companion.m1800getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m1796equalsimpl0(i10, companion.m1804getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !ImageBitmapConfig.m1796equalsimpl0(i10, companion.m1802getF16_sVssgQ())) ? (i11 < 26 || !ImageBitmapConfig.m1796equalsimpl0(i10, companion.m1803getGpu_sVssgQ())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.INSTANCE.m1800getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.INSTANCE.m1804getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.INSTANCE.m1801getArgb8888_sVssgQ();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? ImageBitmapConfig.INSTANCE.m1801getArgb8888_sVssgQ() : ImageBitmapConfig.INSTANCE.m1803getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m1802getF16_sVssgQ();
    }
}
