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
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Class f29449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient Class f29450h;

    private EnumBiMap(Class cls, Class cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.f29449g = cls;
        this.f29450h = cls2;
    }

    static Class A(Map map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).f29449g;
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).f29451g;
        }
        Preconditions.checkArgument(!map.isEmpty());
        return Platform.b((Enum) map.keySet().iterator().next());
    }

    private static Class B(Map map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).f29450h;
        }
        Preconditions.checkArgument(!map.isEmpty());
        return Platform.b((Enum) map.values().iterator().next());
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f29449g = (Class) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        this.f29450h = (Class) object2;
        s(new EnumMap(this.f29449g), new EnumMap(this.f29450h));
        Serialization.b(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f29449g);
        objectOutputStream.writeObject(this.f29450h);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object forcePut(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.forcePut(obj, obj2);
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
        return this.f29449g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
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

    @GwtIncompatible
    public Class<V> valueType() {
        return this.f29450h;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Enum l(Enum r12) {
        return (Enum) Preconditions.checkNotNull(r12);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> enumBiMapCreate = create(A(map), B(map));
        enumBiMapCreate.putAll(map);
        return enumBiMapCreate;
    }
}
