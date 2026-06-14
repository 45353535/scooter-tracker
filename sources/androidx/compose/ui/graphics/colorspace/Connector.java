package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\"\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007B<\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0010ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", FirebaseAnalytics.Param.DESTINATION, com.taurusx.tax.g.n.f66171o, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", "r", "", "g", "b", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "a", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", y.f66058y, "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Connector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Connector OklabToSrgbPerceptual;

    @NotNull
    private static final Connector SrgbIdentity;

    @NotNull
    private static final Connector SrgbToOklabPerceptual;

    @NotNull
    private final ColorSpace destination;
    private final int renderIntent;

    @NotNull
    private final ColorSpace source;

    @Nullable
    private final float[] transform;

    @NotNull
    private final ColorSpace transformDestination;

    @NotNull
    private final ColorSpace transformSource;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "OklabToSrgbPerceptual", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getOklabToSrgbPerceptual$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/Connector;", "SrgbIdentity", "getSrgbIdentity$ui_graphics_release", "SrgbToOklabPerceptual", "getSrgbToOklabPerceptual$ui_graphics_release", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", FirebaseAnalytics.Param.DESTINATION, com.taurusx.tax.g.n.f66171o, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m1997computeTransformYBCOT_4(ColorSpace source, ColorSpace destination, int intent) {
            if (!RenderIntent.m2002equalsimpl0(intent, RenderIntent.INSTANCE.m2006getAbsoluteuksYyKA())) {
                return null;
            }
            long model = source.getModel();
            ColorModel.Companion companion = ColorModel.INSTANCE;
            boolean zM1981equalsimpl0 = ColorModel.m1981equalsimpl0(model, companion.m1988getRgbxdoWZVw());
            boolean zM1981equalsimpl02 = ColorModel.m1981equalsimpl0(destination.getModel(), companion.m1988getRgbxdoWZVw());
            if (zM1981equalsimpl0 && zM1981equalsimpl02) {
                return null;
            }
            if (!zM1981equalsimpl0 && !zM1981equalsimpl02) {
                return null;
            }
            if (!zM1981equalsimpl0) {
                source = destination;
            }
            Intrinsics.checkNotNull(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) source;
            float[] xyz$ui_graphics_release = zM1981equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM1981equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        @NotNull
        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.OklabToSrgbPerceptual;
        }

        @NotNull
        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.SrgbIdentity;
        }

        @NotNull
        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.SrgbToOklabPerceptual;
        }

        @NotNull
        public final Connector identity$ui_graphics_release(@NotNull final ColorSpace source) {
            Intrinsics.checkNotNullParameter(source, "source");
            final int iM2008getRelativeuksYyKA = RenderIntent.INSTANCE.m2008getRelativeuksYyKA();
            return new Connector(source, iM2008getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(source, source, iM2008getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                @NotNull
                public float[] transform(@NotNull float[] v10) {
                    Intrinsics.checkNotNullParameter(v10, "v");
                    return v10;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo1995transformToColorwmQWz5c$ui_graphics_release(float r10, float g10, float b10, float a10) {
                    return ColorKt.Color(r10, g10, b10, a10, getDestination());
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J-\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0010ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", com.taurusx.tax.g.n.f66171o, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", FirebaseAnalytics.Param.DESTINATION, "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "r", "", "g", "b", "a", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RgbConnector extends Connector {

        @NotNull
        private final Rgb mDestination;

        @NotNull
        private final Rgb mSource;

        @NotNull
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i10);
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m1998computeTransformYBCOT_4(Rgb source, Rgb destination, int intent) {
            if (ColorSpaceKt.compare(source.getWhitePoint(), destination.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] xyz$ui_graphics_release = source.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = destination.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = source.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform2 = Adaptation.INSTANCE.getBradford().getTransform();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                transform = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform2, xyz$ui_graphics_release, fArrCopyOf), source.getTransform());
            }
            if (!ColorSpaceKt.compare(destination.getWhitePoint(), illuminant.getD50())) {
                float[] transform3 = Adaptation.INSTANCE.getBradford().getTransform();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform3, xyz$ui_graphics_release2, fArrCopyOf2), destination.getTransform()));
            }
            if (RenderIntent.m2002equalsimpl0(intent, RenderIntent.INSTANCE.m2006getAbsoluteuksYyKA())) {
                transform = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform);
            }
            return ColorSpaceKt.mul3x3(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        @NotNull
        public float[] transform(@NotNull float[] v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            v10[0] = (float) this.mSource.getEotfFunc().invoke(v10[0]);
            v10[1] = (float) this.mSource.getEotfFunc().invoke(v10[1]);
            v10[2] = (float) this.mSource.getEotfFunc().invoke(v10[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, v10);
            v10[0] = (float) this.mDestination.getOetfFunc().invoke(v10[0]);
            v10[1] = (float) this.mDestination.getOetfFunc().invoke(v10[1]);
            v10[2] = (float) this.mDestination.getOetfFunc().invoke(v10[2]);
            return v10;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo1995transformToColorwmQWz5c$ui_graphics_release(float r10, float g10, float b10, float a10) {
            float fInvoke = (float) this.mSource.getEotfFunc().invoke(r10);
            float fInvoke2 = (float) this.mSource.getEotfFunc().invoke(g10);
            float fInvoke3 = (float) this.mSource.getEotfFunc().invoke(b10);
            return ColorKt.Color((float) this.mDestination.getOetfFunc().invoke(ColorSpaceKt.mul3x3Float3_0(this.mTransform, fInvoke, fInvoke2, fInvoke3)), (float) this.mDestination.getOetfFunc().invoke(ColorSpaceKt.mul3x3Float3_1(this.mTransform, fInvoke, fInvoke2, fInvoke3)), (float) this.mDestination.getOetfFunc().invoke(ColorSpaceKt.mul3x3Float3_2(this.mTransform, fInvoke, fInvoke2, fInvoke3)), a10, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i10) {
            super(rgb, rgb2, rgb, rgb2, i10, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m1998computeTransformYBCOT_4(rgb, rgb2, i10);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion companion = new Companion(defaultConstructorMarker);
        INSTANCE = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        SrgbIdentity = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.INSTANCE;
        SrgbToOklabPerceptual = new Connector(srgb, oklab, companion2.m2007getPerceptualuksYyKA(), defaultConstructorMarker);
        OklabToSrgbPerceptual = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m2007getPerceptualuksYyKA(), defaultConstructorMarker);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i10);
    }

    @NotNull
    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name and from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    @NotNull
    public final ColorSpace getSource() {
        return this.source;
    }

    @NotNull
    public final float[] transform(float r10, float g10, float b10) {
        return transform(new float[]{r10, g10, b10});
    }

    /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release, reason: not valid java name */
    public long mo1995transformToColorwmQWz5c$ui_graphics_release(float r10, float g10, float b10, float a10) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(r10, g10, b10);
        u uVar = u.f93332a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(r10, g10, b10);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f10 = fIntBitsToFloat2;
        float f11 = fIntBitsToFloat;
        return this.transformDestination.mo1991xyzaToColorJlNiLsg$ui_graphics_release(f11, f10, z$ui_graphics_release, a10, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i10, fArr);
    }

    @NotNull
    public float[] transform(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float[] xyz = this.transformSource.toXyz(v10);
        float[] fArr = this.transform;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i10, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i10;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i10) {
        long model = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        this(colorSpace, colorSpace2, ColorModel.m1981equalsimpl0(model, companion.m1988getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m1981equalsimpl0(colorSpace2.getModel(), companion.m1988getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i10, INSTANCE.m1997computeTransformYBCOT_4(colorSpace, colorSpace2, i10), null);
    }
}
