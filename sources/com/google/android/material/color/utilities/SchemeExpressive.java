package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeExpressive extends DynamicScheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f26188a = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[] f26189b = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[] f26190c = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public SchemeExpressive(Hct hct, boolean z10, double d10) {
        Variant variant = Variant.EXPRESSIVE;
        TonalPalette tonalPaletteFromHueAndChroma = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 240.0d), 40.0d);
        double[] dArr = f26188a;
        super(hct, variant, z10, d10, tonalPaletteFromHueAndChroma, TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, dArr, f26189b), 24.0d), TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, dArr, f26190c), 32.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 15.0d), 8.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 15.0d), 12.0d));
    }
}
