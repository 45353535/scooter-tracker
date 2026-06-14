package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient EnumMap f29556g;

    @J2ktIncompatible
    private static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EnumMap f29557b;

        EnumSerializedForm(EnumMap enumMap) {
            this.f29557b = enumMap;
        }

        Object readResolve() {
            return new ImmutableEnumMap(this.f29557b);
        }
    }

    static ImmutableMap n(EnumMap enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.of();
        }
        if (size != 1) {
            return new ImmutableEnumMap(enumMap);
        }
        Map.Entry entry = (Map.Entry) Iterables.getOnlyElement(enumMap.entrySet());
        return ImmutableMap.of((Enum) entry.getKey(), entry.getValue());
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f29556g.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).f29556g;
        }
        return this.f29556g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        return (V) this.f29556g.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean k() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    UnmodifiableIterator l() {
        return Iterators.unmodifiableIterator(this.f29556g.keySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    UnmodifiableIterator m() {
        return Maps.M(this.f29556g.entrySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f29556g.size();
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    Object writeReplace() {
        return new EnumSerializedForm(this.f29556g);
    }

    private ImmutableEnumMap(EnumMap enumMap) {
        this.f29556g = enumMap;
        Preconditions.checkArgument(!enumMap.isEmpty());
    }
}
