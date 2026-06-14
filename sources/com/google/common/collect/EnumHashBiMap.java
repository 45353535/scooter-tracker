package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Class f29451g;

    private EnumHashBiMap(Class cls) {
        super(new EnumMap(cls), new HashMap());
        this.f29451g = cls;
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f29451g = (Class) object;
        s(new EnumMap(this.f29451g), new HashMap());
        Serialization.b(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f29451g);
        Serialization.i(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @GwtIncompatible
    public Class<K> keyType() {
        return this.f29451g;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Enum k(Enum r12) {
        return (Enum) Preconditions.checkNotNull(r12);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> enumHashBiMapCreate = create(EnumBiMap.A(map));
        enumHashBiMapCreate.putAll(map);
        return enumHashBiMapCreate;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(K k10, @ParametricNullness V v10) {
        return (V) super.forcePut(k10, (Object) v10);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(K k10, @ParametricNullness V v10) {
        return (V) super.put(k10, (Object) v10);
    }
}
