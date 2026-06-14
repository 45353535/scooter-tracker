package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0001\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0001*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", TypedValues.TransitionType.S_FROM, "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidShader_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m1512ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i10, int i11) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m1517toAndroidTileMode0vamqd0(i10), AndroidTileMode_androidKt.m1517toAndroidTileMode0vamqd0(i11));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1513ActualLinearGradientShaderVjE6UOU(long j10, long j11, @NotNull List<Color> colors, @Nullable List<Float> list, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10), Offset.m1371getXimpl(j11), Offset.m1372getYimpl(j11), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m1517toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1514ActualRadialGradientShader8uybcMk(long j10, float f10, @NotNull List<Color> colors, @Nullable List<Float> list, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10), f10, makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m1517toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1515ActualSweepGradientShader9KIMszo(long j10, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(colors);
        for (int i11 = 1; i11 < lastIndex; i11++) {
            if (Color.m1606getAlphaimpl(colors.get(i11).m1614unboximpl()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = ColorKt.m1658toArgb8_81llA(colors.get(i12).m1614unboximpl());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i10];
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i13 = 0;
        while (i12 < size2) {
            long jM1614unboximpl = colors.get(i12).m1614unboximpl();
            if (Color.m1606getAlphaimpl(jM1614unboximpl) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m1658toArgb8_81llA(Color.m1603copywmQWz5c$default(colors.get(1).m1614unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == lastIndex) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m1658toArgb8_81llA(Color.m1603copywmQWz5c$default(colors.get(i12 - 1).m1614unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = ColorKt.m1658toArgb8_81llA(Color.m1603copywmQWz5c$default(colors.get(i12 - 1).m1614unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = ColorKt.m1658toArgb8_81llA(Color.m1603copywmQWz5c$default(colors.get(i12 + 1).m1614unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = ColorKt.m1658toArgb8_81llA(jM1614unboximpl);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i11 = 1;
        for (int i12 = 1; i12 < lastIndex; i12++) {
            long jM1614unboximpl = colors.get(i12).m1614unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt.getLastIndex(colors);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (Color.m1606getAlphaimpl(jM1614unboximpl) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
