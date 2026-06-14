package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeVibrant extends DynamicScheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f26191a = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[] f26192b = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[] f26193c = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public SchemeVibrant(Hct hct, boolean z10, double d10) {
        Variant variant = Variant.VIBRANT;
        TonalPalette tonalPaletteFromHueAndChroma = TonalPalette.fromHueAndChroma(hct.getHue(), 200.0d);
        double[] dArr = f26191a;
        super(hct, variant, z10, d10, tonalPaletteFromHueAndChroma, TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, dArr, f26192b), 24.0d), TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, dArr, f26193c), 32.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 10.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d));
    }
}
