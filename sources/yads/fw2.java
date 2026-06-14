package yads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class fw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f110952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f110953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f110954c;

    public fw2() {
        this(new Random());
    }

    public final fw2 a(int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = this.f110952a.nextInt(this.f110953b.length + 1);
            int i13 = i12 + 1;
            int iNextInt = this.f110952a.nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f110953b.length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.f110953b;
            if (i11 >= iArr4.length + i10) {
                return new fw2(iArr3, new Random(this.f110952a.nextLong()));
            }
            if (i14 >= i10 || i15 != iArr[i14]) {
                int i16 = i15 + 1;
                int i17 = iArr4[i15];
                iArr3[i11] = i17;
                if (i17 >= 0) {
                    iArr3[i11] = i17 + i10;
                }
                i15 = i16;
            } else {
                iArr3[i11] = iArr2[i14];
                i14++;
            }
            i11++;
        }
    }

    public fw2(Random random) {
        this(a(random), random);
    }

    public fw2(int[] iArr, Random random) {
        this.f110953b = iArr;
        this.f110952a = random;
        this.f110954c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f110954c[iArr[i10]] = i10;
        }
    }

    public static int[] a(Random random) {
        return new int[0];
    }

    public final int a() {
        return this.f110953b.length;
    }
}
