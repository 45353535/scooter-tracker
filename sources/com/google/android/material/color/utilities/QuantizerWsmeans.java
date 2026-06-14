package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWsmeans {

    private static final class Distance implements Comparable<Distance> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26143b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f26144c = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.f26144c).compareTo(Double.valueOf(distance.f26144c));
        }
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i10) {
        double[][] dArr;
        char c10 = 1;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i11 = 0;
        for (int i12 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i12));
            if (num == null) {
                dArr2[i11] = pointProviderLab.fromInt(i12);
                iArr3[i11] = i12;
                i11++;
                linkedHashMap.put(Integer.valueOf(i12), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            iArr4[i13] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i13]))).intValue();
        }
        int iMin = Math.min(i10, i11);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i14 = 0;
        for (int i15 = 0; i15 < iArr2.length; i15++) {
            dArr3[i15] = pointProviderLab.fromInt(iArr2[i15]);
            i14++;
        }
        int i16 = iMin - i14;
        if (i16 > 0) {
            for (int i17 = 0; i17 < i16; i17++) {
            }
        }
        int[] iArr5 = new int[i11];
        for (int i18 = 0; i18 < i11; i18++) {
            iArr5[i18] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i19 = 0; i19 < iMin; i19++) {
            iArr6[i19] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i20 = 0; i20 < iMin; i20++) {
            distanceArr[i20] = new Distance[iMin];
            for (int i21 = 0; i21 < iMin; i21++) {
                distanceArr[i20][i21] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i22 = 0;
        while (true) {
            if (i22 >= 10) {
                dArr = dArr3;
                break;
            }
            int i23 = 0;
            while (i23 < iMin) {
                int i24 = i23 + 1;
                int i25 = i24;
                while (i25 < iMin) {
                    char c11 = c10;
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr3[i23], dArr3[i25]);
                    Distance distance = distanceArr[i25][i23];
                    distance.f26144c = dDistance;
                    distance.f26143b = i23;
                    Distance distance2 = distanceArr[i23][i25];
                    distance2.f26144c = dDistance;
                    distance2.f26143b = i25;
                    i25++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c10 = c11;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c12 = c10;
                Arrays.sort(distanceArr[i23]);
                for (int i26 = 0; i26 < iMin; i26++) {
                    iArr6[i23][i26] = distanceArr[i23][i26].f26143b;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i23 = i24;
                c10 = c12;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c13 = c10;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i11) {
                double[] dArr4 = dArr2[i27];
                int i29 = iArr12[i27];
                double dDistance2 = pointProviderLab.distance(dArr4, dArr3[i29]);
                int i30 = i27;
                double d10 = dDistance2;
                int i31 = -1;
                int i32 = 0;
                while (i32 < iMin) {
                    int i33 = i28;
                    double[][] dArr5 = dArr2;
                    double[][] dArr6 = dArr3;
                    if (distanceArr[i29][i32].f26144c < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr4, dArr6[i32]);
                        if (dDistance3 < d10) {
                            d10 = dDistance3;
                            i31 = i32;
                        }
                    }
                    i32++;
                    dArr2 = dArr5;
                    i28 = i33;
                    dArr3 = dArr6;
                }
                int i34 = i28;
                double[][] dArr7 = dArr2;
                double[][] dArr8 = dArr3;
                if (i31 == -1 || Math.abs(Math.sqrt(d10) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i28 = i34;
                } else {
                    i28 = i34 + 1;
                    iArr12[i30] = i31;
                }
                i27 = i30 + 1;
                dArr2 = dArr7;
                dArr3 = dArr8;
            }
            double[][] dArr9 = dArr2;
            dArr = dArr3;
            if (i28 == 0 && i22 != 0) {
                break;
            }
            double[] dArr10 = new double[iMin];
            double[] dArr11 = new double[iMin];
            double[] dArr12 = new double[iMin];
            char c14 = 0;
            Arrays.fill(iArr7, 0);
            int i35 = 0;
            while (i35 < i11) {
                int i36 = iArr12[i35];
                double[] dArr13 = dArr9[i35];
                int i37 = iArr11[i35];
                iArr7[i36] = iArr7[i36] + i37;
                double d11 = i37;
                dArr10[i36] = dArr10[i36] + (dArr13[c14] * d11);
                dArr11[i36] = dArr11[i36] + (dArr13[c13] * d11);
                dArr12[i36] = dArr12[i36] + (dArr13[2] * d11);
                i35++;
                distanceArr = distanceArr;
                c14 = 0;
            }
            Distance[][] distanceArr2 = distanceArr;
            for (int i38 = 0; i38 < iMin; i38++) {
                int i39 = iArr7[i38];
                if (i39 == 0) {
                    dArr[i38] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d12 = i39;
                    double d13 = dArr10[i38] / d12;
                    double d14 = dArr11[i38] / d12;
                    double d15 = dArr12[i38] / d12;
                    double[] dArr14 = dArr[i38];
                    dArr14[0] = d13;
                    dArr14[c13] = d14;
                    dArr14[2] = d15;
                }
            }
            i22++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            distanceArr = distanceArr2;
            c10 = c13;
            dArr2 = dArr9;
            dArr3 = dArr;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i40 = 0; i40 < iMin; i40++) {
            int i41 = iArr7[i40];
            if (i41 != 0) {
                int i42 = pointProviderLab.toInt(dArr[i40]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i42))) {
                    linkedHashMap2.put(Integer.valueOf(i42), Integer.valueOf(i41));
                }
            }
        }
        return linkedHashMap2;
    }
}
