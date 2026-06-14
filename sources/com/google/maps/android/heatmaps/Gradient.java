package com.google.maps.android.heatmaps;

import android.graphics.Color;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class Gradient {
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    private class ColorInterval {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f34027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f34029c;

        private ColorInterval(int i10, int i11, float f10) {
            this.f34027a = i10;
            this.f34028b = i11;
            this.f34029c = f10;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap a() {
        HashMap map = new HashMap();
        if (this.mStartPoints[0] != 0.0f) {
            map.put(0, new ColorInterval(Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0]));
        }
        for (int i10 = 1; i10 < this.mColors.length; i10++) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i11]));
            int[] iArr = this.mColors;
            int i12 = iArr[i11];
            int i13 = iArr[i10];
            float f10 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            map.put(numValueOf, new ColorInterval(i12, i13, f10 * (fArr[i10] - fArr[i11])));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i14 = this.mColors[length];
            map.put(numValueOf2, new ColorInterval(i14, i14, this.mColorMapSize * (1.0f - this.mStartPoints[length])));
        }
        return map;
    }

    static int c(int i10, int i11, float f10) {
        int iAlpha = (int) (((Color.alpha(i11) - Color.alpha(i10)) * f10) + Color.alpha(i10));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i11), Color.green(i11), Color.blue(i11), fArr2);
        float f11 = fArr[0];
        float f12 = fArr2[0];
        if (f11 - f12 > 180.0f) {
            fArr2[0] = f12 + 360.0f;
        } else if (f12 - f11 > 180.0f) {
            fArr[0] = f11 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i12 = 0; i12 < 3; i12++) {
            float f13 = fArr2[i12];
            float f14 = fArr[i12];
            fArr3[i12] = ((f13 - f14) * f10) + f14;
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    int[] b(double d10) {
        HashMap mapA = a();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = (ColorInterval) mapA.get(0);
        int i10 = 0;
        for (int i11 = 0; i11 < this.mColorMapSize; i11++) {
            if (mapA.containsKey(Integer.valueOf(i11))) {
                colorInterval = (ColorInterval) mapA.get(Integer.valueOf(i11));
                i10 = i11;
            }
            iArr[i11] = c(colorInterval.f34027a, colorInterval.f34028b, (i11 - i10) / colorInterval.f34029c);
        }
        if (d10 != 1.0d) {
            for (int i12 = 0; i12 < this.mColorMapSize; i12++) {
                int i13 = iArr[i12];
                iArr[i12] = Color.argb((int) (((double) Color.alpha(i13)) * d10), Color.red(i13), Color.green(i13), Color.blue(i13));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i10) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i11 = 1; i11 < fArr.length; i11++) {
            if (fArr[i11] <= fArr[i11 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.mColorMapSize = i10;
        int[] iArr2 = new int[iArr.length];
        this.mColors = iArr2;
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }
}
