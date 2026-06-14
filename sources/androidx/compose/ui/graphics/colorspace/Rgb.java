package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nBW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\u001e\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010?\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0006\u0010I\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010J\u001a\u00020\u0005J\u000e\u0010J\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010K\u001a\u00020\u0017H\u0016J\u001e\u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010L\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ@\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d10) {
            return Rgb.DoubleIdentity$lambda$12(d10);
        }
    };

    @NotNull
    private final Function1<Double, Double> eotf;

    @NotNull
    private final DoubleFunction eotfFunc;

    @NotNull
    private final DoubleFunction eotfOrig;

    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @NotNull
    private final Function1<Double, Double> oetf;

    @NotNull
    private final DoubleFunction oetfFunc;

    @NotNull
    private final DoubleFunction oetfOrig;

    @NotNull
    private final float[] primaries;

    @Nullable
    private final TransferParameters transferParameters;

    @NotNull
    private final float[] transform;

    @NotNull
    private final WhitePoint whitePoint;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean compare(double point, DoubleFunction a10, DoubleFunction b10) {
            return Math.abs(a10.invoke(point) - b10.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            return new WhitePoint(f10 / f12, f11 / f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float x10 = whitePoint.getX();
            float y10 = whitePoint.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean contains(float[] p12, float[] p22) {
            float f10 = p12[0];
            float f11 = p22[0];
            float f12 = p12[1];
            float f13 = p22[1];
            float f14 = p12[2] - p22[2];
            float f15 = p12[3] - p22[3];
            float f16 = p12[4];
            float f17 = p22[4];
            float f18 = p12[5];
            float f19 = p22[5];
            float[] fArr = {f10 - f11, f12 - f13, f14, f15, f16 - f17, f18 - f19};
            return cross(fArr[0], fArr[1], f11 - f17, f13 - f19) >= 0.0f && cross(p22[0] - p22[2], p22[1] - p22[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p22[2] - p22[0], p22[3] - p22[1]) >= 0.0f && cross(p22[2] - p22[4], p22[3] - p22[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p22[4] - p22[2], p22[5] - p22[3]) >= 0.0f && cross(p22[4] - p22[0], p22[5] - p22[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id2) {
            if (id2 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!compare(d10, OETF, srgb.getOetfOrig()) || !compare(d10, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) {
                return min < 0.0f && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                ArraysKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
                return fArr;
            }
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = f10 + f11 + primaries[2];
            fArr[0] = f10 / f12;
            fArr[1] = f11 / f12;
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = f13 + f14 + primaries[5];
            fArr[2] = f13 / f15;
            fArr[3] = f14 / f15;
            float f16 = primaries[6];
            float f17 = primaries[7];
            float f18 = f16 + f17 + primaries[8];
            fArr[4] = f16 / f18;
            fArr[5] = f17 / f18;
            return fArr;
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            float f13 = fArrMul3x3Float32[0];
            float f14 = fArrMul3x3Float32[1];
            float f15 = f13 + f14 + fArrMul3x3Float32[2];
            float f16 = fArrMul3x3Float33[0];
            float f17 = fArrMul3x3Float33[1];
            float f18 = f16 + f17 + fArrMul3x3Float33[2];
            return new float[]{f10 / f12, f11 / f12, f13 / f15, f14 / f15, f16 / f18, f17 / f18};
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] fArr, @NotNull DoubleFunction oetf, @NotNull DoubleFunction eotf, float f10, float f11, @Nullable TransferParameters transferParameters, int i10) {
        super(name, ColorModel.INSTANCE.m1988getRgbxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return invoke(d10.doubleValue());
            }

            @NotNull
            public final Double invoke(double d10) {
                return Double.valueOf(kotlin.ranges.g.l(this.this$0.getOetfOrig().invoke(d10), this.this$0.min, this.this$0.max));
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb.oetfFunc$lambda$0(this.f4387a, d10);
            }
        };
        this.eotfOrig = eotf;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return invoke(d10.doubleValue());
            }

            @NotNull
            public final Double invoke(double d10) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(kotlin.ranges.g.l(d10, this.this$0.min, this.this$0.max)));
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb.eotfFunc$lambda$1(this.f4391a, d10);
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(primaries);
        this.primaries = fArrXyPrimaries;
        if (fArr == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f10, f11);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, oetf, eotf, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 oetf, double d10) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 eotf, double d10) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 oetf, double d10) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 eotf, double d10) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d10, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d10, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d10, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d10, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb this$0, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.eotfOrig.invoke(kotlin.ranges.g.l(d10, this$0.min, this$0.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb this$0, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return kotlin.ranges.g.l(this$0.oetfOrig.invoke(d10), this$0.min, this$0.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @NotNull
    public final float[] fromLinear(float r10, float g10, float b10) {
        return fromLinear(new float[]{r10, g10, b10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v10);
        v10[0] = (float) this.oetfFunc.invoke(v10[0]);
        v10[1] = (float) this.oetfFunc.invoke(v10[1]);
        v10[2] = (float) this.oetfFunc.invoke(v10[2]);
        return v10;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    @NotNull
    /* JADX INFO: renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    @NotNull
    /* JADX INFO: renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    @NotNull
    /* JADX INFO: renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    @NotNull
    /* JADX INFO: renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @NotNull
    public final float[] toLinear(float r10, float g10, float b10) {
        return toLinear(new float[]{r10, g10, b10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fInvoke = (float) this.eotfFunc.invoke(v02);
        float fInvoke2 = (float) this.eotfFunc.invoke(v12);
        float fInvoke3 = (float) this.eotfFunc.invoke(v22);
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(this.transform, fInvoke, fInvoke2, fInvoke3))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(this.transform, fInvoke, fInvoke2, fInvoke3))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        v10[0] = (float) this.eotfFunc.invoke(v10[0]);
        v10[1] = (float) this.eotfFunc.invoke(v10[1]);
        v10[2] = (float) this.eotfFunc.invoke(v10[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(v02), (float) this.eotfFunc.invoke(v12), (float) this.eotfFunc.invoke(v22));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1991xyzaToColorJlNiLsg$ui_graphics_release(float x10, float y10, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, x10, y10, z10)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, x10, y10, z10)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, x10, y10, z10)), a10, colorSpace);
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        v10[0] = (float) this.oetfFunc.invoke(v10[0]);
        v10[1] = (float) this.oetfFunc.invoke(v10[1]);
        v10[2] = (float) this.oetfFunc.invoke(v10[2]);
        return v10;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        return ArraysKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        return ArraysKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return ArraysKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        v10[0] = (float) this.eotfFunc.invoke(v10[0]);
        v10[1] = (float) this.eotfFunc.invoke(v10[1]);
        v10[2] = (float) this.eotfFunc.invoke(v10[2]);
        return v10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, @NotNull final Function1<? super Double, Double> oetf, @NotNull final Function1<? super Double, Double> eotf) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.i
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$2(oetf, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$3(eotf, d10);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull final Function1<? super Double, Double> oetf, @NotNull final Function1<? super Double, Double> eotf, float f10, float f11) {
        this(name, primaries, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.m
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$4(oetf, d10);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$5(eotf, d10);
            }
        }, f10, f11, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, @NotNull TransferParameters function) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(function, "function");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), function, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull final TransferParameters function, int i10) {
        this(name, primaries, whitePoint, null, (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$6(function, d10);
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$7(function, d10);
            }
        }, (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.e
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$8(function, d10);
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.f
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d10) {
                return Rgb._init_$lambda$9(function, d10);
            }
        }, 0.0f, 1.0f, function, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, double d10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), companion.computeWhitePoint(toXYZ), d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double d10) {
        this(name, primaries, whitePoint, d10, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        if (d10 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.k
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    return Rgb._init_$lambda$10(d10, d11);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d10 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.l
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    return Rgb._init_$lambda$11(d10, d11);
                }
            };
        }
        this(name, primaries, whitePoint, null, doubleFunction3, doubleFunction2, f10, f11, new TransferParameters(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
