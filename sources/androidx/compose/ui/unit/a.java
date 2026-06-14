package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Density density, long j10) {
        return zf.a.d(density.mo307toPxR2X_6o(j10));
    }

    public static int b(Density density, float f10) {
        float fMo308toPx0680j_4 = density.mo308toPx0680j_4(f10);
        if (Float.isInfinite(fMo308toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return zf.a.d(fMo308toPx0680j_4);
    }

    public static float c(Density density, long j10) {
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4165getSpUIouoOA())) {
            return Dp.m3951constructorimpl(TextUnit.m4132getValueimpl(j10) * density.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float d(Density density, float f10) {
        return Dp.m3951constructorimpl(f10 / density.getDensity());
    }

    public static float e(Density density, int i10) {
        return Dp.m3951constructorimpl(i10 / density.getDensity());
    }

    public static long f(Density density, long j10) {
        return j10 != Size.INSTANCE.m1448getUnspecifiedNHjbRc() ? DpKt.m3973DpSizeYgX7TsA(density.mo304toDpu2uoSUM(Size.m1440getWidthimpl(j10)), density.mo304toDpu2uoSUM(Size.m1437getHeightimpl(j10))) : DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ();
    }

    public static float g(Density density, long j10) {
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4165getSpUIouoOA())) {
            return TextUnit.m4132getValueimpl(j10) * density.getFontScale() * density.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float h(Density density, float f10) {
        return f10 * density.getDensity();
    }

    public static Rect i(Density density, DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(density.mo308toPx0680j_4(dpRect.m4034getLeftD9Ej5fM()), density.mo308toPx0680j_4(dpRect.m4036getTopD9Ej5fM()), density.mo308toPx0680j_4(dpRect.m4035getRightD9Ej5fM()), density.mo308toPx0680j_4(dpRect.m4033getBottomD9Ej5fM()));
    }

    public static long j(Density density, long j10) {
        return j10 != DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ() ? SizeKt.Size(density.mo308toPx0680j_4(DpSize.m4049getWidthD9Ej5fM(j10)), density.mo308toPx0680j_4(DpSize.m4047getHeightD9Ej5fM(j10))) : Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    public static long k(Density density, float f10) {
        return TextUnitKt.getSp(f10 / density.getFontScale());
    }

    public static long l(Density density, float f10) {
        return TextUnitKt.getSp(f10 / (density.getFontScale() * density.getDensity()));
    }

    public static long m(Density density, int i10) {
        return TextUnitKt.getSp(i10 / (density.getFontScale() * density.getDensity()));
    }
}
