package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient EnumSet f29558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f29559e;

    @J2ktIncompatible
    private static class EnumSerializedForm<E extends Enum<E>> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EnumSet f29560b;

        EnumSerializedForm(EnumSet enumSet) {
            this.f29560b = enumSet;
        }

        Object readResolve() {
            return new ImmutableEnumSet(this.f29560b.clone());
        }
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static ImmutableSet s(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : ImmutableSet.of((Enum) Iterables.getOnlyElement(enumSet)) : ImmutableSet.of();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f29558d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f29558d;
        }
        return this.f29558d.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f29558d;
        }
        return this.f29558d.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i10 = this.f29559e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f29558d.hashCode();
        this.f29559e = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f29558d.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f29558d.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f29558d.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return new EnumSerializedForm(this.f29558d);
    }

    private ImmutableEnumSet(EnumSet enumSet) {
        this.f29558d = enumSet;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return Iterators.unmodifiableIterator(this.f29558d.iterator());
    }
}
