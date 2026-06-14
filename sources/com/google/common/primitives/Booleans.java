package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Booleans {

    @GwtCompatible
    private static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f31067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f31068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31069d;

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.d(this.f31067b, ((Boolean) obj).booleanValue(), this.f31068c, this.f31069d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f31067b[this.f31068c + i10] != booleanArrayAsList.f31067b[booleanArrayAsList.f31068c + i10]) {
                    return false;
                }
            }
            return true;
        }

        boolean[] g() {
            return Arrays.copyOfRange(this.f31067b, this.f31068c, this.f31069d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f31068c; i10 < this.f31069d; i10++) {
                iHashCode = (iHashCode * 31) + Booleans.hashCode(this.f31067b[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iD;
            if (!(obj instanceof Boolean) || (iD = Booleans.d(this.f31067b, ((Boolean) obj).booleanValue(), this.f31068c, this.f31069d)) < 0) {
                return -1;
            }
            return iD - this.f31068c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iE;
            if (!(obj instanceof Boolean) || (iE = Booleans.e(this.f31067b, ((Boolean) obj).booleanValue(), this.f31068c, this.f31069d)) < 0) {
                return -1;
            }
            return iE - this.f31068c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31069d - this.f31068c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.f31067b;
            int i12 = this.f31068c;
            return new BooleanArrayAsList(zArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f31067b[this.f31068c] ? "[true" : "[false");
            int i10 = this.f31068c;
            while (true) {
                i10++;
                if (i10 >= this.f31069d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(this.f31067b[i10] ? ", true" : ", false");
            }
        }

        BooleanArrayAsList(boolean[] zArr, int i10, int i11) {
            this.f31067b = zArr;
            this.f31068c = i10;
            this.f31069d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Boolean.valueOf(this.f31067b[this.f31068c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i10, Boolean bool) {
            Preconditions.checkElementIndex(i10, size());
            boolean[] zArr = this.f31067b;
            int i11 = this.f31068c;
            boolean z10 = zArr[i11 + i10];
            zArr[i11 + i10] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z10);
        }
    }

    private enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f31071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f31072c;

        BooleanComparator(int i10, String str) {
            this.f31071b = i10;
            this.f31072c = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f31072c;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.f31071b : 0) - (bool.booleanValue() ? this.f31071b : 0);
        }
    }

    private enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Boolean.compare(zArr[i10], zArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new BooleanArrayAsList(zArr);
    }

    private static int c(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    @InlineMe(replacement = "Boolean.compare(a, b)")
    public static int compare(boolean z10, boolean z11) {
        return Boolean.compare(z10, z11);
    }

    public static boolean[] concat(boolean[]... zArr) {
        long length = 0;
        for (boolean[] zArr2 : zArr) {
            length += (long) zArr2.length;
        }
        boolean[] zArr3 = new boolean[c(length)];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z10) {
        for (boolean z11 : zArr) {
            if (z11 == z10) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(boolean[] zArr, boolean z10, int i10, int i11) {
        while (i10 < i11) {
            if (zArr[i10] == z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(boolean[] zArr, boolean z10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (zArr[i12] == z10) {
                return i12;
            }
        }
        return -1;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i10, int i11) {
        Preconditions.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        Preconditions.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return zArr.length < i10 ? Arrays.copyOf(zArr, i10 + i11) : zArr;
    }

    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z10) {
        return d(zArr, z10, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i10 = 1; i10 < zArr.length; i10++) {
            sb2.append(str);
            sb2.append(zArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z10) {
        return e(zArr, z10, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i10) {
        rotate(zArr, i10, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) Preconditions.checkNotNull(array[i10])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(boolean[] r5, boolean[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Booleans.indexOf(boolean[], boolean[]):int");
    }

    public static void rotate(boolean[] zArr, int i10, int i11, int i12) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i11, i12, zArr.length);
        if (zArr.length <= 1) {
            return;
        }
        int i13 = i12 - i11;
        int i14 = (-i10) % i13;
        if (i14 < 0) {
            i14 += i13;
        }
        int i15 = i14 + i11;
        if (i15 == i11) {
            return;
        }
        reverse(zArr, i11, i15);
        reverse(zArr, i15, i12);
        reverse(zArr, i11, i12);
    }

    public static void reverse(boolean[] zArr, int i10, int i11) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i10, i11, zArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i12];
            zArr[i12] = z10;
            i10++;
        }
    }
}
