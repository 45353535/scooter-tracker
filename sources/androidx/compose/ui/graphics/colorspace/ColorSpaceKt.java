package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a8\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a+\u0010)\u001a\u00020**\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020-ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"absRcpResponse", "", "x", "a", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "response", "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", FirebaseAnalytics.Param.DESTINATION, com.taurusx.tax.g.n.f66171o, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(rcpResponse(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double absResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(response(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] fArrMul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] fArrMul3x3Float32 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(@NotNull TransferParameters a10, @Nullable TransferParameters transferParameters) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return transferParameters != null && Math.abs(a10.getA() - transferParameters.getA()) < 0.001d && Math.abs(a10.getB() - transferParameters.getB()) < 0.001d && Math.abs(a10.getC() - transferParameters.getC()) < 0.001d && Math.abs(a10.getD() - transferParameters.getD()) < 0.002d && Math.abs(a10.getE() - transferParameters.getE()) < 0.001d && Math.abs(a10.getF() - transferParameters.getF()) < 0.001d && Math.abs(a10.getGamma() - transferParameters.getGamma()) < 0.001d;
    }

    @NotNull
    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m1992connectYBCOT_4(@NotNull ColorSpace connect, @NotNull ColorSpace destination, int i10) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (connect == colorSpaces.getSrgb()) {
            if (destination == colorSpaces.getSrgb()) {
                return Connector.INSTANCE.getSrgbIdentity$ui_graphics_release();
            }
            if (destination == colorSpaces.getOklab() && RenderIntent.m2002equalsimpl0(i10, RenderIntent.INSTANCE.m2007getPerceptualuksYyKA())) {
                return Connector.INSTANCE.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (connect == colorSpaces.getOklab() && destination == colorSpaces.getSrgb() && RenderIntent.m2002equalsimpl0(i10, RenderIntent.INSTANCE.m2007getPerceptualuksYyKA())) {
            return Connector.INSTANCE.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (connect == destination) {
            return Connector.INSTANCE.identity$ui_graphics_release(connect);
        }
        long jM1990getModelxdoWZVw = connect.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return (ColorModel.m1981equalsimpl0(jM1990getModelxdoWZVw, companion.m1988getRgbxdoWZVw()) && ColorModel.m1981equalsimpl0(destination.getModel(), companion.m1988getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) connect, (Rgb) destination, i10, defaultConstructorMarker) : new Connector(connect, destination, i10, defaultConstructorMarker);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m1993connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i11 & 2) != 0) {
            i10 = RenderIntent.INSTANCE.m2007getPerceptualuksYyKA();
        }
        return m1992connectYBCOT_4(colorSpace, colorSpace2, i10);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        float f10 = m10[0];
        float f11 = m10[3];
        float f12 = m10[6];
        float f13 = m10[1];
        float f14 = m10[4];
        float f15 = m10[7];
        float f16 = m10[2];
        float f17 = m10[5];
        float f18 = m10[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr = new float[m10.length];
        fArr[0] = f19 / f22;
        fArr[1] = f20 / f22;
        fArr[2] = f21 / f22;
        fArr[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0];
        float f12 = lhs[3];
        float f13 = rhs[1];
        float f14 = lhs[6];
        float f15 = rhs[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = lhs[1];
        float f18 = lhs[4];
        float f19 = lhs[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = lhs[2];
        float f22 = lhs[5];
        float f23 = lhs[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = rhs[3];
        float f26 = rhs[4];
        float f27 = rhs[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f17 * f25) + (f18 * f26) + (f19 * f27);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = rhs[6];
        float f32 = rhs[7];
        float f33 = rhs[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f10 * f31) + (f12 * f32) + (f14 * f33), (f17 * f31) + (f18 * f32) + (f19 * f33), (f21 * f31) + (f22 * f32) + (f23 * f33)};
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0] * f10;
        float f12 = lhs[1];
        float f13 = rhs[1] * f12;
        float f14 = lhs[2];
        return new float[]{f11, f13, rhs[2] * f14, rhs[3] * f10, rhs[4] * f12, rhs[5] * f14, f10 * rhs[6], f12 * rhs[7], f14 * rhs[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = rhs[0];
        float f11 = rhs[1];
        float f12 = rhs[2];
        rhs[0] = (lhs[0] * f10) + (lhs[3] * f11) + (lhs[6] * f12);
        rhs[1] = (lhs[1] * f10) + (lhs[4] * f11) + (lhs[7] * f12);
        rhs[2] = (lhs[2] * f10) + (lhs[5] * f11) + (lhs[8] * f12);
        return rhs;
    }

    public static final float mul3x3Float3_0(@NotNull float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[0] * f10) + (lhs[3] * f11) + (lhs[6] * f12);
    }

    public static final float mul3x3Float3_1(@NotNull float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[1] * f10) + (lhs[4] * f11) + (lhs[7] * f12);
    }

    public static final float mul3x3Float3_2(@NotNull float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[2] * f10) + (lhs[5] * f11) + (lhs[8] * f12);
    }

    public static final double rcpResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double response(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (ColorModel.m1981equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m1988getRgbxdoWZVw())) {
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double response(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }

    public static final boolean compare(@NotNull WhitePoint a10, @NotNull WhitePoint b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.getX() - b10.getX()) < 0.001f && Math.abs(a10.getY() - b10.getY()) < 0.001f;
    }

    public static final boolean compare(@NotNull float[] a10, @NotNull float[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(a10[i10], b10[i10]) != 0 && Math.abs(a10[i10] - b10[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
