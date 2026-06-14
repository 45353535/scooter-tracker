package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", H2.f75840g, "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorKt {
    @Stable
    public static final long Color(float f10, float f11, float f12, float f13, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f10 <= colorSpace.getMaxValue(0) && minValue <= f10) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f11 <= colorSpace.getMaxValue(1) && minValue2 <= f11) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f12 <= colorSpace.getMaxValue(2) && minValue3 <= f12 && 0.0f <= f13 && f13 <= 1.0f) {
                    if (colorSpace.getIsSrgb()) {
                        return Color.m1600constructorimpl(lf.v.c(lf.v.c(lf.v.c((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int id$ui_graphics_release = colorSpace.getId();
                    if (id$ui_graphics_release == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sM1707constructorimpl = Float16.m1707constructorimpl(f10);
                    return Color.m1600constructorimpl(lf.v.c(lf.v.c(lf.v.c(lf.v.c(lf.v.c(lf.v.c(lf.v.c(Float16.m1707constructorimpl(f11)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | lf.v.c(lf.v.c(lf.v.c(sM1707constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | lf.v.c(lf.v.c(lf.v.c(Float16.m1707constructorimpl(f12)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | lf.v.c(lf.v.c(lf.v.c((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | lf.v.c(lf.v.c(id$ui_graphics_release) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f10, float f11, float f12, float f13, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f10, f11, f12, f13, colorSpace);
    }

    private static final float compositeComponent(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return ((f10 * f12) + ((f11 * f13) * (1.0f - f12))) / f14;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1649compositeOverOWjLjI(long j10, long j11) {
        long jM1601convertvNxB06k = Color.m1601convertvNxB06k(j10, Color.m1608getColorSpaceimpl(j11));
        float fM1606getAlphaimpl = Color.m1606getAlphaimpl(j11);
        float fM1606getAlphaimpl2 = Color.m1606getAlphaimpl(jM1601convertvNxB06k);
        float f10 = 1.0f - fM1606getAlphaimpl2;
        float f11 = (fM1606getAlphaimpl * f10) + fM1606getAlphaimpl2;
        return Color(f11 == 0.0f ? 0.0f : ((Color.m1610getRedimpl(jM1601convertvNxB06k) * fM1606getAlphaimpl2) + ((Color.m1610getRedimpl(j11) * fM1606getAlphaimpl) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Color.m1609getGreenimpl(jM1601convertvNxB06k) * fM1606getAlphaimpl2) + ((Color.m1609getGreenimpl(j11) * fM1606getAlphaimpl) * f10)) / f11, f11 != 0.0f ? ((Color.m1607getBlueimpl(jM1601convertvNxB06k) * fM1606getAlphaimpl2) + ((Color.m1607getBlueimpl(j11) * fM1606getAlphaimpl) * f10)) / f11 : 0.0f, f11, Color.m1608getColorSpaceimpl(j11));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m1650getComponents8_81llA(long j10) {
        return new float[]{Color.m1610getRedimpl(j10), Color.m1609getGreenimpl(j10), Color.m1607getBlueimpl(j10), Color.m1606getAlphaimpl(j10)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m1651isSpecified8_81llA(long j10) {
        return j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1652isSpecified8_81llA$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m1653isUnspecified8_81llA(long j10) {
        return j10 == Color.INSTANCE.m1640getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1654isUnspecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1655lerpjxsXWHM(long j10, long j11, float f10) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM1601convertvNxB06k = Color.m1601convertvNxB06k(j10, oklab);
        long jM1601convertvNxB06k2 = Color.m1601convertvNxB06k(j11, oklab);
        float fM1606getAlphaimpl = Color.m1606getAlphaimpl(jM1601convertvNxB06k);
        float fM1610getRedimpl = Color.m1610getRedimpl(jM1601convertvNxB06k);
        float fM1609getGreenimpl = Color.m1609getGreenimpl(jM1601convertvNxB06k);
        float fM1607getBlueimpl = Color.m1607getBlueimpl(jM1601convertvNxB06k);
        float fM1606getAlphaimpl2 = Color.m1606getAlphaimpl(jM1601convertvNxB06k2);
        float fM1610getRedimpl2 = Color.m1610getRedimpl(jM1601convertvNxB06k2);
        float fM1609getGreenimpl2 = Color.m1609getGreenimpl(jM1601convertvNxB06k2);
        float fM1607getBlueimpl2 = Color.m1607getBlueimpl(jM1601convertvNxB06k2);
        return Color.m1601convertvNxB06k(Color(MathHelpersKt.lerp(fM1610getRedimpl, fM1610getRedimpl2, f10), MathHelpersKt.lerp(fM1609getGreenimpl, fM1609getGreenimpl2, f10), MathHelpersKt.lerp(fM1607getBlueimpl, fM1607getBlueimpl2, f10), MathHelpersKt.lerp(fM1606getAlphaimpl, fM1606getAlphaimpl2, f10), oklab), Color.m1608getColorSpaceimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1656luminance8_81llA(long j10) {
        ColorSpace colorSpaceM1608getColorSpaceimpl = Color.m1608getColorSpaceimpl(j10);
        if (!ColorModel.m1981equalsimpl0(colorSpaceM1608getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m1988getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m1984toStringimpl(colorSpaceM1608getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM1608getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM1608getColorSpaceimpl).getEotfFunc();
        return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m1610getRedimpl(j10)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m1609getGreenimpl(j10)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m1607getBlueimpl(j10)) * 0.0722d)));
    }

    private static final float saturate(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m1657takeOrElseDxMtmZc(long j10, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU() ? j10 : block.invoke().m1614unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1658toArgb8_81llA(long j10) {
        return (int) lf.v.c(Color.m1601convertvNxB06k(j10, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    @Stable
    public static final long Color(int i10) {
        return Color.m1600constructorimpl(lf.v.c(lf.v.c(i10) << 32));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m1600constructorimpl(lf.v.c(lf.v.c(lf.v.c(j10) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i10, int i11, int i12, int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }
}
