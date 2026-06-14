package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.math.IntMath;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList f29327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int[] f29328c;

    CartesianList(ImmutableList immutableList) {
        this.f29327b = immutableList;
        int[] iArr = new int[immutableList.size() + 1];
        iArr[immutableList.size()] = 1;
        try {
            for (int size = immutableList.size() - 1; size >= 0; size--) {
                iArr[size] = IntMath.checkedMultiply(iArr[size + 1], ((List) immutableList.get(size)).size());
            }
            this.f29328c = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    static List e(List list) {
        ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) it.next());
            if (immutableListCopyOf.isEmpty()) {
                return ImmutableList.of();
            }
            builder.add(immutableListCopyOf);
        }
        return new CartesianList(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(int i10, int i11) {
        return (i10 / this.f29328c[i11 + 1]) % ((List) this.f29327b.get(i11)).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.f29327b.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!((List) this.f29327b.get(i10)).contains(it.next())) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f29327b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = ((List) this.f29327b.get(iNextIndex)).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i10 += iIndexOf * this.f29328c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f29327b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = ((List) this.f29327b.get(iNextIndex)).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i10 += iLastIndexOf * this.f29328c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29328c[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public ImmutableList<E> get(final int i10) {
        Preconditions.checkElementIndex(i10, size());
        return new ImmutableList<E>(this) { // from class: com.google.common.collect.CartesianList.1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CartesianList f29330e;

            {
                this.f29330e = this;
            }

            @Override // java.util.List
            public E get(int i11) {
                Preconditions.checkElementIndex(i11, size());
                return (E) ((List) this.f29330e.f29327b.get(i11)).get(this.f29330e.f(i10, i11));
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f29330e.f29327b.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }
        };
    }
}
