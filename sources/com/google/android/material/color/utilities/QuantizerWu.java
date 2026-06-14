package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu implements Quantizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f26145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f26146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f26147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f26148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f26149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Box[] f26150f;

    private static final class Box {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f26156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26157g;

        private Box() {
            this.f26151a = 0;
            this.f26152b = 0;
            this.f26153c = 0;
            this.f26154d = 0;
            this.f26155e = 0;
            this.f26156f = 0;
            this.f26157g = 0;
        }
    }

    private static final class CreateBoxesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26158a;

        CreateBoxesResult(int i10, int i11) {
            this.f26158a = i11;
        }
    }

    private enum Direction {
        RED,
        GREEN,
        BLUE
    }

    private static final class MaximizeResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f26161b;

        MaximizeResult(int i10, double d10) {
            this.f26160a = i10;
            this.f26161b = d10;
        }
    }

    static int a(Box box, Direction direction, int[] iArr) {
        int i10;
        int i11;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i10 = (-iArr[g(box.f26151a, box.f26154d, box.f26156f)]) + iArr[g(box.f26151a, box.f26154d, box.f26155e)] + iArr[g(box.f26151a, box.f26153c, box.f26156f)];
            i11 = iArr[g(box.f26151a, box.f26153c, box.f26155e)];
        } else if (iOrdinal == 1) {
            i10 = (-iArr[g(box.f26152b, box.f26153c, box.f26156f)]) + iArr[g(box.f26152b, box.f26153c, box.f26155e)] + iArr[g(box.f26151a, box.f26153c, box.f26156f)];
            i11 = iArr[g(box.f26151a, box.f26153c, box.f26155e)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i10 = (-iArr[g(box.f26152b, box.f26154d, box.f26155e)]) + iArr[g(box.f26152b, box.f26153c, box.f26155e)] + iArr[g(box.f26151a, box.f26154d, box.f26155e)];
            i11 = iArr[g(box.f26151a, box.f26153c, box.f26155e)];
        }
        return i10 - i11;
    }

    static int g(int i10, int i11, int i12) {
        return (i10 << 10) + (i10 << 6) + i10 + (i11 << 5) + i11 + i12;
    }

    static int i(Box box, Direction direction, int i10, int[] iArr) {
        int i11;
        int i12;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i11 = (iArr[g(i10, box.f26154d, box.f26156f)] - iArr[g(i10, box.f26154d, box.f26155e)]) - iArr[g(i10, box.f26153c, box.f26156f)];
            i12 = iArr[g(i10, box.f26153c, box.f26155e)];
        } else if (iOrdinal == 1) {
            i11 = (iArr[g(box.f26152b, i10, box.f26156f)] - iArr[g(box.f26152b, i10, box.f26155e)]) - iArr[g(box.f26151a, i10, box.f26156f)];
            i12 = iArr[g(box.f26151a, i10, box.f26155e)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i11 = (iArr[g(box.f26152b, box.f26154d, i10)] - iArr[g(box.f26152b, box.f26153c, i10)]) - iArr[g(box.f26151a, box.f26154d, i10)];
            i12 = iArr[g(box.f26151a, box.f26153c, i10)];
        }
        return i11 + i12;
    }

    static int k(Box box, int[] iArr) {
        return ((((((iArr[g(box.f26152b, box.f26154d, box.f26156f)] - iArr[g(box.f26152b, box.f26154d, box.f26155e)]) - iArr[g(box.f26152b, box.f26153c, box.f26156f)]) + iArr[g(box.f26152b, box.f26153c, box.f26155e)]) - iArr[g(box.f26151a, box.f26154d, box.f26156f)]) + iArr[g(box.f26151a, box.f26154d, box.f26155e)]) + iArr[g(box.f26151a, box.f26153c, box.f26156f)]) - iArr[g(box.f26151a, box.f26153c, box.f26155e)];
    }

    void b(Map map) {
        this.f26145a = new int[35937];
        this.f26146b = new int[35937];
        this.f26147c = new int[35937];
        this.f26148d = new int[35937];
        this.f26149e = new double[35937];
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int iG = g((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.f26145a;
            iArr[iG] = iArr[iG] + iIntValue2;
            int[] iArr2 = this.f26146b;
            iArr2[iG] = iArr2[iG] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.f26147c;
            iArr3[iG] = iArr3[iG] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.f26148d;
            iArr4[iG] = iArr4[iG] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.f26149e;
            dArr[iG] = dArr[iG] + ((double) (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb))));
        }
    }

    CreateBoxesResult c(int i10) {
        int i11;
        this.f26150f = new Box[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f26150f[i12] = new Box();
        }
        double[] dArr = new double[i10];
        Box box = this.f26150f[0];
        box.f26152b = 32;
        box.f26154d = 32;
        box.f26156f = 32;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            if (i14 >= i10) {
                i11 = i10;
                break;
            }
            Box[] boxArr = this.f26150f;
            if (f(boxArr[i13], boxArr[i14]).booleanValue()) {
                Box box2 = this.f26150f[i13];
                dArr[i13] = box2.f26157g > 1 ? j(box2) : 0.0d;
                Box box3 = this.f26150f[i14];
                dArr[i14] = box3.f26157g > 1 ? j(box3) : 0.0d;
            } else {
                dArr[i13] = 0.0d;
                i14--;
            }
            double d10 = dArr[0];
            int i15 = 0;
            for (int i16 = 1; i16 <= i14; i16++) {
                double d11 = dArr[i16];
                if (d11 > d10) {
                    i15 = i16;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i11 = i14 + 1;
                break;
            }
            i14++;
            i13 = i15;
        }
        return new CreateBoxesResult(i10, i11);
    }

    void d() {
        int i10 = 1;
        while (true) {
            int i11 = 33;
            if (i10 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i12 = 1;
            while (i12 < i11) {
                int i13 = 0;
                int i14 = 0;
                double d10 = 0.0d;
                int i15 = 1;
                int i16 = 0;
                int i17 = 0;
                while (i15 < i11) {
                    int iG = g(i10, i12, i15);
                    i13 += this.f26145a[iG];
                    i16 += this.f26146b[iG];
                    i17 += this.f26147c[iG];
                    i14 += this.f26148d[iG];
                    d10 += this.f26149e[iG];
                    iArr[i15] = iArr[i15] + i13;
                    iArr2[i15] = iArr2[i15] + i16;
                    iArr3[i15] = iArr3[i15] + i17;
                    iArr4[i15] = iArr4[i15] + i14;
                    dArr[i15] = dArr[i15] + d10;
                    int iG2 = g(i10 - 1, i12, i15);
                    int i18 = i15;
                    int[] iArr5 = this.f26145a;
                    iArr5[iG] = iArr5[iG2] + iArr[i18];
                    int[] iArr6 = this.f26146b;
                    iArr6[iG] = iArr6[iG2] + iArr2[i18];
                    int[] iArr7 = this.f26147c;
                    iArr7[iG] = iArr7[iG2] + iArr3[i18];
                    int[] iArr8 = this.f26148d;
                    iArr8[iG] = iArr8[iG2] + iArr4[i18];
                    double[] dArr2 = this.f26149e;
                    dArr2[iG] = dArr2[iG2] + dArr[i18];
                    i15 = i18 + 1;
                    i11 = 33;
                }
                i12++;
                i11 = 33;
            }
            i10++;
        }
    }

    List e(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            Box box = this.f26150f[i11];
            int iK = k(box, this.f26145a);
            if (iK > 0) {
                int iK2 = k(box, this.f26146b) / iK;
                int iK3 = k(box, this.f26147c) / iK;
                arrayList.add(Integer.valueOf(((k(box, this.f26148d) / iK) & 255) | ((iK2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((iK3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    Boolean f(Box box, Box box2) {
        int iK = k(box, this.f26146b);
        int iK2 = k(box, this.f26147c);
        int iK3 = k(box, this.f26148d);
        int iK4 = k(box, this.f26145a);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultH = h(box, direction, box.f26151a + 1, box.f26152b, iK, iK2, iK3, iK4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultH2 = h(box, direction2, box.f26153c + 1, box.f26154d, iK, iK2, iK3, iK4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultH3 = h(box, direction3, box.f26155e + 1, box.f26156f, iK, iK2, iK3, iK4);
        double d10 = maximizeResultH.f26161b;
        double d11 = maximizeResultH2.f26161b;
        double d12 = maximizeResultH3.f26161b;
        if (d10 < d11 || d10 < d12) {
            if (d11 >= d10 && d11 >= d12) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultH.f26160a < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f26152b = box.f26152b;
        box2.f26154d = box.f26154d;
        box2.f26156f = box.f26156f;
        int iOrdinal = direction3.ordinal();
        if (iOrdinal == 0) {
            int i10 = maximizeResultH.f26160a;
            box.f26152b = i10;
            box2.f26151a = i10;
            box2.f26153c = box.f26153c;
            box2.f26155e = box.f26155e;
        } else if (iOrdinal == 1) {
            int i11 = maximizeResultH2.f26160a;
            box.f26154d = i11;
            box2.f26151a = box.f26151a;
            box2.f26153c = i11;
            box2.f26155e = box.f26155e;
        } else if (iOrdinal == 2) {
            int i12 = maximizeResultH3.f26160a;
            box.f26156f = i12;
            box2.f26151a = box.f26151a;
            box2.f26153c = box.f26153c;
            box2.f26155e = i12;
        }
        box.f26157g = (box.f26152b - box.f26151a) * (box.f26154d - box.f26153c) * (box.f26156f - box.f26155e);
        box2.f26157g = (box2.f26152b - box2.f26151a) * (box2.f26154d - box2.f26153c) * (box2.f26156f - box2.f26155e);
        return Boolean.TRUE;
    }

    MaximizeResult h(Box box, Direction direction, int i10, int i11, int i12, int i13, int i14, int i15) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iA = a(box2, direction, quantizerWu.f26146b);
        int iA2 = a(box2, direction, quantizerWu.f26147c);
        int iA3 = a(box2, direction, quantizerWu.f26148d);
        int iA4 = a(box2, direction, quantizerWu.f26145a);
        int i16 = -1;
        double d10 = 0.0d;
        int i17 = i10;
        while (i17 < i11) {
            int i18 = i(box2, direction, i17, quantizerWu.f26146b) + iA;
            int i19 = i(box2, direction, i17, quantizerWu.f26147c) + iA2;
            int i20 = i(box2, direction, i17, quantizerWu.f26148d) + iA3;
            int i21 = i(box2, direction, i17, quantizerWu.f26145a) + iA4;
            if (i21 != 0) {
                double d11 = ((double) (((i18 * i18) + (i19 * i19)) + (i20 * i20))) / ((double) i21);
                int i22 = i12 - i18;
                int i23 = i13 - i19;
                int i24 = i14 - i20;
                int i25 = i15 - i21;
                if (i25 != 0) {
                    double d12 = d11 + (((double) (((i22 * i22) + (i23 * i23)) + (i24 * i24))) / ((double) i25));
                    if (d12 > d10) {
                        d10 = d12;
                        i16 = i17;
                    }
                }
            }
            i17++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i16, d10);
    }

    double j(Box box) {
        int iK = k(box, this.f26146b);
        int iK2 = k(box, this.f26147c);
        int iK3 = k(box, this.f26148d);
        return (((((((this.f26149e[g(box.f26152b, box.f26154d, box.f26156f)] - this.f26149e[g(box.f26152b, box.f26154d, box.f26155e)]) - this.f26149e[g(box.f26152b, box.f26153c, box.f26156f)]) + this.f26149e[g(box.f26152b, box.f26153c, box.f26155e)]) - this.f26149e[g(box.f26151a, box.f26154d, box.f26156f)]) + this.f26149e[g(box.f26151a, box.f26154d, box.f26155e)]) + this.f26149e[g(box.f26151a, box.f26153c, box.f26156f)]) - this.f26149e[g(box.f26151a, box.f26153c, box.f26155e)]) - (((double) (((iK * iK) + (iK2 * iK2)) + (iK3 * iK3))) / ((double) k(box, this.f26145a)));
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i10) {
        b(new QuantizerMap().quantize(iArr, i10).colorToCount);
        d();
        List<Integer> listE = e(c(i10).f26158a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listE) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }
}
