package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    @J2ktIncompatible
    private static class EntrySetSerializedForm<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap f29592b;

        EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.f29592b = immutableMap;
        }

        Object readResolve() {
            return this.f29592b.entrySet();
        }
    }

    static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableMap f29593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient ImmutableList f29594e;

        @Override // com.google.common.collect.ImmutableCollection
        int a(Object[] objArr, int i10) {
            return this.f29594e.a(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList o() {
            return this.f29594e;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        ImmutableMap s() {
            return this.f29593d;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f29594e.iterator();
        }
    }

    ImmutableMapEntrySet() {
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return s().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return s().k();
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean q() {
        return s().j();
    }

    abstract ImmutableMap s();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return s().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new EntrySetSerializedForm(s());
    }
}
