package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d10 = dArr[0] - dArr2[0];
        double d11 = dArr[1] - dArr2[1];
        double d12 = dArr[2] - dArr2[2];
        return (d10 * d10) + (d11 * d11) + (d12 * d12);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i10) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(i10);
        return new double[]{dArrLabFromArgb[0], dArrLabFromArgb[1], dArrLabFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
