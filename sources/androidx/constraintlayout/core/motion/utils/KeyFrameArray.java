package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import com.ironsource.C4240b4;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i10, CustomAttribute customAttribute) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = customAttribute;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(valueAt(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4240b4.j.f42674e);
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 >= i13) {
                    this.mCount = i13 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i10, CustomVariable customVariable) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = customVariable;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(valueAt(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4240b4.j.f42674e);
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 >= i13) {
                    this.mCount = i13 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        float[][] mValues = new float[101][];

        FloatArray() {
            clear();
        }

        public void append(int i10, float[] fArr) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = fArr;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(Arrays.toString(valueAt(i10)));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4240b4.j.f42674e);
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 >= i13) {
                    this.mCount = i13 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }
}
