package com.google.common.primitives;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
@GwtCompatible(emulated = true)
public final class Chars {
    public static final int BYTES = 2;

    @GwtCompatible
    private static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final char[] f31077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f31078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31079d;

        CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.d(this.f31077b, ((Character) obj).charValue(), this.f31078c, this.f31079d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f31077b[this.f31078c + i10] != charArrayAsList.f31077b[charArrayAsList.f31078c + i10]) {
                    return false;
                }
            }
            return true;
        }

        char[] g() {
            return Arrays.copyOfRange(this.f31077b, this.f31078c, this.f31079d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f31078c; i10 < this.f31079d; i10++) {
                iHashCode = (iHashCode * 31) + Chars.hashCode(this.f31077b[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iD;
            if (!(obj instanceof Character) || (iD = Chars.d(this.f31077b, ((Character) obj).charValue(), this.f31078c, this.f31079d)) < 0) {
                return -1;
            }
            return iD - this.f31078c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iE;
            if (!(obj instanceof Character) || (iE = Chars.e(this.f31077b, ((Character) obj).charValue(), this.f31078c, this.f31079d)) < 0) {
                return -1;
            }
            return iE - this.f31078c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31079d - this.f31078c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.f31077b;
            int i12 = this.f31078c;
            return new CharArrayAsList(cArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append('[');
            sb2.append(this.f31077b[this.f31078c]);
            int i10 = this.f31078c;
            while (true) {
                i10++;
                if (i10 >= this.f31079d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f31077b[i10]);
            }
        }

        CharArrayAsList(char[] cArr, int i10, int i11) {
            this.f31077b = cArr;
            this.f31078c = i10;
            this.f31079d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Character.valueOf(this.f31077b[this.f31078c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i10, Character ch2) {
            Preconditions.checkElementIndex(i10, size());
            char[] cArr = this.f31077b;
            int i11 = this.f31078c;
            char c10 = cArr[i11 + i10];
            cArr[i11 + i10] = ((Character) Preconditions.checkNotNull(ch2)).charValue();
            return Character.valueOf(c10);
        }
    }

    private enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Character.compare(cArr[i10], cArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.EMPTY_LIST : new CharArrayAsList(cArr);
    }

    private static int c(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    public static char checkedCast(long j10) {
        char c10 = (char) j10;
        Preconditions.checkArgument(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    @InlineMe(replacement = "Character.compare(a, b)")
    public static int compare(char c10, char c11) {
        return Character.compare(c10, c11);
    }

    public static char[] concat(char[]... cArr) {
        long length = 0;
        for (char[] cArr2 : cArr) {
            length += (long) cArr2.length;
        }
        char[] cArr3 = new char[c(length)];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    public static char constrainToRange(char c10, char c11, char c12) {
        Preconditions.checkArgument(c11 <= c12, "min (%s) must be less than or equal to max (%s)", c11, c12);
        return c10 < c11 ? c11 : c10 < c12 ? c10 : c12;
    }

    public static boolean contains(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(char[] cArr, char c10, int i10, int i11) {
        while (i10 < i11) {
            if (cArr[i10] == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(char[] cArr, char c10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (cArr[i12] == c10) {
                return i12;
            }
        }
        return -1;
    }

    public static char[] ensureCapacity(char[] cArr, int i10, int i11) {
        Preconditions.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        Preconditions.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return cArr.length < i10 ? Arrays.copyOf(cArr, i10 + i11) : cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static char fromBytes(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public static int hashCode(char c10) {
        return c10;
    }

    public static int indexOf(char[] cArr, char c10) {
        return d(cArr, c10, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((str.length() * (length - 1)) + length);
        sb2.append(cArr[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(str);
            sb2.append(cArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(char[] cArr, char c10) {
        return e(cArr, c10, 0, cArr.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 > c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static char min(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 < c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static void rotate(char[] cArr, int i10) {
        rotate(cArr, i10, 0, cArr.length);
    }

    public static char saturatedCast(long j10) {
        if (j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j10 < 0) {
            return (char) 0;
        }
        return (char) j10;
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = ((Character) Preconditions.checkNotNull(array[i10])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c10) {
        return new byte[]{(byte) (c10 >> '\b'), (byte) c10};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(char[] r5, char[] r6) {
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Chars.indexOf(char[], char[]):int");
    }

    public static void rotate(char[] cArr, int i10, int i11, int i12) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i11, i12, cArr.length);
        if (cArr.length <= 1) {
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
        reverse(cArr, i11, i15);
        reverse(cArr, i15, i12);
        reverse(cArr, i11, i12);
    }

    public static void reverse(char[] cArr, int i10, int i11) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i10, i11, cArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i12];
            cArr[i12] = c10;
            i10++;
        }
    }

    public static void sortDescending(char[] cArr, int i10, int i11) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i10, i11, cArr.length);
        Arrays.sort(cArr, i10, i11);
        reverse(cArr, i10, i11);
    }
}
