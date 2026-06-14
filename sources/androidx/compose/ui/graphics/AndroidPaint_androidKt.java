package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\t\u001a\u00020\n*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0011\u001a\u00020\u0012*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u0013\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u0016*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a%\u0010\u001b\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001a\u0010#\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010$H\u0000\u001a%\u0010%\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001f\u001a\u001a\u0010'\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010(H\u0000\u001a \u0010)\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u000e\u0010\u0019\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0000\u001a%\u0010,\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0010H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001f\u001a%\u0010.\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0012H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a\u0018\u00100\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u00101\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a%\u00102\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0003*\n\u00105\"\u00020\u00032\u00020\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", C4240b4.a.f42515t, "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "toComposePaint", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidPaint_androidKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m1701getNonefv9h1I() : FilterQuality.INSTANCE.m1699getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeCap.INSTANCE.m1927getButtKaPHkGw() : StrokeCap.INSTANCE.m1929getSquareKaPHkGw() : StrokeCap.INSTANCE.m1928getRoundKaPHkGw() : StrokeCap.INSTANCE.m1927getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeJoin.INSTANCE.m1938getMiterLxFBmk8() : StrokeJoin.INSTANCE.m1939getRoundLxFBmk8() : StrokeJoin.INSTANCE.m1937getBevelLxFBmk8() : StrokeJoin.INSTANCE.m1938getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m1846getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m1845getFillTiuSbCo();
    }

    @NotNull
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@NotNull android.graphics.Paint paint, float f10) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull android.graphics.Paint paint, boolean z10) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z10);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m1497setNativeBlendModeGB0RdKg(@NotNull android.graphics.Paint setNativeBlendMode, int i10) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m1977setBlendModeGB0RdKg(setNativeBlendMode, i10);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m1464toPorterDuffModes9anfk8(i10)));
        }
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m1498setNativeColor4WTKRHQ(@NotNull android.graphics.Paint setNativeColor, long j10) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(ColorKt.m1658toArgb8_81llA(j10));
    }

    public static final void setNativeColorFilter(@NotNull android.graphics.Paint paint, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m1499setNativeFilterQuality50PEsBU(@NotNull android.graphics.Paint setNativeFilterQuality, int i10) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!FilterQuality.m1694equalsimpl0(i10, FilterQuality.INSTANCE.m1701getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull android.graphics.Paint paint, @Nullable PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@NotNull android.graphics.Paint paint, @Nullable Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m1500setNativeStrokeCapCSYIeUk(@NotNull android.graphics.Paint setNativeStrokeCap, int i10) {
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        setNativeStrokeCap.setStrokeCap(StrokeCap.m1923equalsimpl0(i10, companion.m1929getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m1923equalsimpl0(i10, companion.m1928getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m1923equalsimpl0(i10, companion.m1927getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m1501setNativeStrokeJoinkLtJ_vA(@NotNull android.graphics.Paint setNativeStrokeJoin, int i10) {
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        setNativeStrokeJoin.setStrokeJoin(StrokeJoin.m1933equalsimpl0(i10, companion.m1938getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m1933equalsimpl0(i10, companion.m1937getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m1933equalsimpl0(i10, companion.m1939getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint, float f10) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void setNativeStrokeWidth(@NotNull android.graphics.Paint paint, float f10) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m1502setNativeStyle5YerkU(@NotNull android.graphics.Paint setNativeStyle, int i10) {
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(PaintingStyle.m1841equalsimpl0(i10, PaintingStyle.INSTANCE.m1846getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @NotNull
    public static final Paint toComposePaint(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return new AndroidPaint(paint);
    }
}
