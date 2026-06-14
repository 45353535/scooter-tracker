package ga;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public interface e1 {

    public static class a implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f72242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f72243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f72244c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // ga.e1
        public e1 cloneAndClear() {
            return new a(0, new Random(this.f72242a.nextLong()));
        }

        @Override // ga.e1
        public e1 cloneAndInsert(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f72242a.nextInt(this.f72243b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f72242a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f72243b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f72243b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f72242a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // ga.e1
        public e1 cloneAndRemove(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f72243b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f72243b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f72242a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // ga.e1
        public int getFirstIndex() {
            int[] iArr = this.f72243b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // ga.e1
        public int getLastIndex() {
            int[] iArr = this.f72243b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // ga.e1
        public int getLength() {
            return this.f72243b.length;
        }

        @Override // ga.e1
        public int getNextIndex(int i10) {
            int i11 = this.f72244c[i10] + 1;
            int[] iArr = this.f72243b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // ga.e1
        public int getPreviousIndex(int i10) {
            int i11 = this.f72244c[i10] - 1;
            if (i11 >= 0) {
                return this.f72243b[i11];
            }
            return -1;
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f72243b = iArr;
            this.f72242a = random;
            this.f72244c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f72244c[iArr[i10]] = i10;
            }
        }
    }

    e1 cloneAndClear();

    e1 cloneAndInsert(int i10, int i11);

    e1 cloneAndRemove(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}
