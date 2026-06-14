package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Bytes {

    @GwtCompatible
    private static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f31074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f31075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31076d;

        ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.d(this.f31074b, ((Byte) obj).byteValue(), this.f31075c, this.f31076d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f31074b[this.f31075c + i10] != byteArrayAsList.f31074b[byteArrayAsList.f31075c + i10]) {
                    return false;
                }
            }
            return true;
        }

        byte[] g() {
            return Arrays.copyOfRange(this.f31074b, this.f31075c, this.f31076d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f31075c; i10 < this.f31076d; i10++) {
                iHashCode = (iHashCode * 31) + Bytes.hashCode(this.f31074b[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iD;
            if (!(obj instanceof Byte) || (iD = Bytes.d(this.f31074b, ((Byte) obj).byteValue(), this.f31075c, this.f31076d)) < 0) {
                return -1;
            }
            return iD - this.f31075c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iE;
            if (!(obj instanceof Byte) || (iE = Bytes.e(this.f31074b, ((Byte) obj).byteValue(), this.f31075c, this.f31076d)) < 0) {
                return -1;
            }
            return iE - this.f31075c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31076d - this.f31075c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.f31074b;
            int i12 = this.f31075c;
            return new ByteArrayAsList(bArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append((int) this.f31074b[this.f31075c]);
            int i10 = this.f31075c;
            while (true) {
                i10++;
                if (i10 >= this.f31076d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f31074b[i10]);
            }
        }

        ByteArrayAsList(byte[] bArr, int i10, int i11) {
            this.f31074b = bArr;
            this.f31075c = i10;
            this.f31076d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Byte.valueOf(this.f31074b[this.f31075c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i10, Byte b10) {
            Preconditions.checkElementIndex(i10, size());
            byte[] bArr = this.f31074b;
            int i11 = this.f31075c;
            byte b11 = bArr[i11 + i10];
            bArr[i11 + i10] = ((Byte) Preconditions.checkNotNull(b10)).byteValue();
            return Byte.valueOf(b11);
        }
    }

    public static List<Byte> asList(byte... bArr) {
        return bArr.length == 0 ? Collections.EMPTY_LIST : new ByteArrayAsList(bArr);
    }

    private static int c(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    public static byte[] concat(byte[]... bArr) {
        long length = 0;
        for (byte[] bArr2 : bArr) {
            length += (long) bArr2.length;
        }
        byte[] bArr3 = new byte[c(length)];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean contains(byte[] bArr, byte b10) {
        for (byte b11 : bArr) {
            if (b11 == b10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(byte[] bArr, byte b10, int i10, int i11) {
        while (i10 < i11) {
            if (bArr[i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(byte[] bArr, byte b10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (bArr[i12] == b10) {
                return i12;
            }
        }
        return -1;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i10, int i11) {
        Preconditions.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        Preconditions.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return bArr.length < i10 ? Arrays.copyOf(bArr, i10 + i11) : bArr;
    }

    public static int hashCode(byte b10) {
        return b10;
    }

    public static int indexOf(byte[] bArr, byte b10) {
        return d(bArr, b10, 0, bArr.length);
    }

    public static int lastIndexOf(byte[] bArr, byte b10) {
        return e(bArr, b10, 0, bArr.length);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static void rotate(byte[] bArr, int i10) {
        rotate(bArr, i10, 0, bArr.length);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) Preconditions.checkNotNull(array[i10])).byteValue();
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(byte[] r5, byte[] r6) {
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
            r3 = r5[r3]
            r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Bytes.indexOf(byte[], byte[]):int");
    }

    public static void rotate(byte[] bArr, int i10, int i11, int i12) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i11, i12, bArr.length);
        if (bArr.length <= 1) {
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
        reverse(bArr, i11, i15);
        reverse(bArr, i15, i12);
        reverse(bArr, i11, i12);
    }

    public static void reverse(byte[] bArr, int i10, int i11) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i10, i11, bArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i12];
            bArr[i12] = b10;
            i10++;
        }
    }
}
