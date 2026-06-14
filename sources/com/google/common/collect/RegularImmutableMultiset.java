package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final RegularImmutableMultiset f30157h = new RegularImmutableMultiset(ObjectCountHashMap.a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient ObjectCountHashMap f30158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f30159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient ImmutableSet f30160g;

    private final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        Object get(int i10) {
            return RegularImmutableMultiset.this.f30158e.g(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.f30158e.y();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @GwtIncompatible
    private static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f30162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f30163c;

        SerializedForm(Multiset multiset) {
            int size = multiset.entrySet().size();
            this.f30162b = new Object[size];
            this.f30163c = new int[size];
            int i10 = 0;
            for (Multiset.Entry<E> entry : multiset.entrySet()) {
                this.f30162b[i10] = entry.getElement();
                this.f30163c[i10] = entry.getCount();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(this.f30162b.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f30162b;
                if (i10 >= objArr.length) {
                    return builder.build();
                }
                builder.addCopies(objArr[i10], this.f30163c[i10]);
                i10++;
            }
        }
    }

    RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        this.f30158e = objectCountHashMap;
        long jI = 0;
        for (int i10 = 0; i10 < objectCountHashMap.y(); i10++) {
            jI += (long) objectCountHashMap.i(i10);
        }
        this.f30159f = Ints.saturatedCast(jI);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.f30158e.get(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    Multiset.Entry o(int i10) {
        return this.f30158e.e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.f30159f;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f30160g;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f30160g = elementSet;
        return elementSet;
    }
}
