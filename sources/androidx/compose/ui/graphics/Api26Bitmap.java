package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0001¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Api26Bitmap {

    @NotNull
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @DoNotInline
    @NotNull
    public static final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
        ColorSpace colorSpaceComposeColorSpace$ui_graphics_release;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (colorSpaceComposeColorSpace$ui_graphics_release = composeColorSpace$ui_graphics_release(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : colorSpaceComposeColorSpace$ui_graphics_release;
    }

    @DoNotInline
    @NotNull
    /* JADX INFO: renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m1519createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m1482toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @DoNotInline
    @NotNull
    public static final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb()) ? ColorSpace.Named.SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getAces()) ? ColorSpace.Named.ACES : Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg()) ? ColorSpace.Named.ACESCG : Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb()) ? ColorSpace.Named.ADOBE_RGB : Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020()) ? ColorSpace.Named.BT2020 : Intrinsics.areEqual(colorSpace, colorSpaces.getBt709()) ? ColorSpace.Named.BT709 : Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab()) ? ColorSpace.Named.CIE_LAB : Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz()) ? ColorSpace.Named.CIE_XYZ : Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3()) ? ColorSpace.Named.DCI_P3 : Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3()) ? ColorSpace.Named.DISPLAY_P3 : Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb()) ? ColorSpace.Named.EXTENDED_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb()) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb()) ? ColorSpace.Named.LINEAR_SRGB : Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953()) ? ColorSpace.Named.NTSC_1953 : Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb()) ? ColorSpace.Named.PRO_PHOTO_RGB : Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
        return colorSpace2;
    }

    @DoNotInline
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        return Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB)) ? ColorSpaces.INSTANCE.getSrgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACES)) ? ColorSpaces.INSTANCE.getAces() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG)) ? ColorSpaces.INSTANCE.getAcescg() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? ColorSpaces.INSTANCE.getAdobeRgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020)) ? ColorSpaces.INSTANCE.getBt2020() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT709)) ? ColorSpaces.INSTANCE.getBt709() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? ColorSpaces.INSTANCE.getCieLab() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? ColorSpaces.INSTANCE.getCieXyz() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3)) ? ColorSpaces.INSTANCE.getDciP3() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? ColorSpaces.INSTANCE.getDisplayP3() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? ColorSpaces.INSTANCE.getExtendedSrgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? ColorSpaces.INSTANCE.getLinearExtendedSrgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? ColorSpaces.INSTANCE.getLinearSrgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? ColorSpaces.INSTANCE.getNtsc1953() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? ColorSpaces.INSTANCE.getProPhotoRgb() : Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
    }
}
