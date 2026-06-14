package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3359ma<E> extends AbstractCollection<E> implements Serializable {
    public static byte[] A00 = null;
    public static final Object[] A01;
    public static final long serialVersionUID = 912559;

    public static String A0E(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{-7, Ascii.ETB, 9, -60, -9, 9, Ascii.SYN, 13, 5, Ascii.DLE, 13, Ascii.RS, 9, 8, -22, 19, Ascii.SYN, 17};
    }

    public abstract int A0I(Object[] dst, int offset);

    public abstract AbstractC1964Am<E> A0J();

    public abstract boolean A0K();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object object);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        AbstractC3162jA.A04(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrA0L = A0L();
            if (objArrA0L != null) {
                return (T[]) AbstractC3478oY.A02(objArrA0L, A0H(), A0G(), tArr);
            }
            tArr = (T[]) AbstractC3472oR.A05(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        A0I(tArr, 0);
        return tArr;
    }

    static {
        A0F();
        A01 = new Object[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    public int A0G() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    public int A0H() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @CheckForNull
    public Object[] A0L() {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0E(0, 18, 75));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object object) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ma != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A01);
    }
}
