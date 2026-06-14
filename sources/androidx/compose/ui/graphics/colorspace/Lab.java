package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    private static final float D = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String name, int i10) {
        super(name, ColorModel.INSTANCE.m1987getLabxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float f10 = v10[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f11 = f10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f12 = v10[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f13 = v10[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f11 > A ? (float) Math.pow(f11, 0.33333334f) : (f11 * B) + C;
        float fPow2 = f12 > A ? (float) Math.pow(f12, 0.33333334f) : (f12 * B) + C;
        float fPow3 = f13 > A ? (float) Math.pow(f13, 0.33333334f) : (f13 * B) + C;
        v10[0] = kotlin.ranges.g.m((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v10[1] = kotlin.ranges.g.m((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v10[2] = kotlin.ranges.g.m((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float fM = (kotlin.ranges.g.m(v02, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fM2 = (kotlin.ranges.g.m(v02, -128.0f, 128.0f) * 0.002f) + fM;
        float f10 = fM2 > D ? fM2 * fM2 * fM2 : (fM2 - C) * 0.12841855f;
        float f11 = fM > D ? fM * fM * fM : (fM - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (((long) Float.floatToIntBits(f10 * illuminant.getD50Xyz$ui_graphics_release()[0])) << 32) | (((long) Float.floatToIntBits(f11 * illuminant.getD50Xyz$ui_graphics_release()[1])) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        v10[0] = kotlin.ranges.g.m(v10[0], 0.0f, 100.0f);
        v10[1] = kotlin.ranges.g.m(v10[1], -128.0f, 128.0f);
        float fM = kotlin.ranges.g.m(v10[2], -128.0f, 128.0f);
        v10[2] = fM;
        float f10 = (v10[0] + 16.0f) / 116.0f;
        float f11 = (v10[1] * 0.002f) + f10;
        float f12 = f10 - (fM * 0.005f);
        float f13 = f11 > D ? f11 * f11 * f11 : (f11 - C) * 0.12841855f;
        float f14 = f10 > D ? f10 * f10 * f10 : (f10 - C) * 0.12841855f;
        float f15 = f12 > D ? f12 * f12 * f12 : (f12 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v10[0] = f13 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v10[1] = f14 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v10[2] = f15 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        float fM = ((kotlin.ranges.g.m(v02, 0.0f, 100.0f) + 16.0f) / 116.0f) - (kotlin.ranges.g.m(v22, -128.0f, 128.0f) * 0.005f);
        return (fM > D ? fM * fM * fM : 0.12841855f * (fM - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1991xyzaToColorJlNiLsg$ui_graphics_release(float x10, float y10, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f10 = x10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f11 = y10 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f12 = z10 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f10 > A ? (float) Math.pow(f10, 0.33333334f) : (f10 * B) + C;
        float fPow2 = f11 > A ? (float) Math.pow(f11, 0.33333334f) : (f11 * B) + C;
        return ColorKt.Color(kotlin.ranges.g.m((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), kotlin.ranges.g.m((fPow - fPow2) * 500.0f, -128.0f, 128.0f), kotlin.ranges.g.m((fPow2 - (f12 > A ? (float) Math.pow(f12, 0.33333334f) : (f12 * B) + C)) * 200.0f, -128.0f, 128.0f), a10, colorSpace);
    }
}
