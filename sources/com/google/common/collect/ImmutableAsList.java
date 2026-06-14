package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @J2ktIncompatible
    @GwtIncompatible
    static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableCollection f29546b;

        SerializedForm(ImmutableCollection immutableCollection) {
            this.f29546b = immutableCollection;
        }

        Object readResolve() {
            return this.f29546b.asList();
        }
    }

    ImmutableAsList() {
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return o().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return o().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return o().isPartialView();
    }

    abstract ImmutableCollection o();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return o().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(o());
    }
}
