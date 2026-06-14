package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        boolean equals(Object obj);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    @CanIgnoreReturnValue
    int add(@ParametricNullness E e10, int i10);

    @CanIgnoreReturnValue
    boolean add(@ParametricNullness E e10);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(@CompatibleWith(ExifInterface.LONGITUDE_EAST) Object obj);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@CompatibleWith(ExifInterface.LONGITUDE_EAST) Object obj, int i10);

    @CanIgnoreReturnValue
    boolean remove(Object obj);

    @CanIgnoreReturnValue
    boolean removeAll(Collection<?> collection);

    @CanIgnoreReturnValue
    boolean retainAll(Collection<?> collection);

    @CanIgnoreReturnValue
    int setCount(@ParametricNullness E e10, int i10);

    @CanIgnoreReturnValue
    boolean setCount(@ParametricNullness E e10, int i10, int i11);

    int size();

    String toString();
}
