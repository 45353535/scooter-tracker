package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z10, double d10) {
        super(hct, Variant.RAINBOW, z10, d10, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
