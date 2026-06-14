package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static float a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnitType.INSTANCE.m4165getSpUIouoOA())) {
            return Dp.m3951constructorimpl(TextUnit.m4132getValueimpl(j10) * lazyLayoutMeasureScope.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f10) {
        return Dp.m3951constructorimpl(f10 / lazyLayoutMeasureScope.getDensity());
    }

    public static float c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10) {
        return Dp.m3951constructorimpl(i10 / lazyLayoutMeasureScope.getDensity());
    }

    public static long d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        return j10 != Size.INSTANCE.m1448getUnspecifiedNHjbRc() ? DpKt.m3973DpSizeYgX7TsA(lazyLayoutMeasureScope.mo304toDpu2uoSUM(Size.m1440getWidthimpl(j10)), lazyLayoutMeasureScope.mo304toDpu2uoSUM(Size.m1437getHeightimpl(j10))) : DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ();
    }

    public static long e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10) {
        return j10 != DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ() ? SizeKt.Size(lazyLayoutMeasureScope.mo308toPx0680j_4(DpSize.m4049getWidthD9Ej5fM(j10)), lazyLayoutMeasureScope.mo308toPx0680j_4(DpSize.m4047getHeightD9Ej5fM(j10))) : Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    public static long f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f10) {
        return TextUnitKt.getSp(f10 / lazyLayoutMeasureScope.getFontScale());
    }

    public static long g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f10) {
        return TextUnitKt.getSp(f10 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }

    public static long h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10) {
        return TextUnitKt.getSp(i10 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }
}
