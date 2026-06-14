package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeMonochrome extends DynamicScheme {
    public SchemeMonochrome(Hct hct, boolean z10, double d10) {
        super(hct, Variant.MONOCHROME, z10, d10, TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
