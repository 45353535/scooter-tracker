package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5666s implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f84978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient java.util.Set f84979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient r f84980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient java.util.Collection f84981d;

    public C5666s(java.util.Map map) {
        map.getClass();
        this.f84978a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f84978a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f84978a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f84978a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f84978a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f84978a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f84979b == null) {
            this.f84979b = DesugarCollections.unmodifiableSet(this.f84978a.keySet());
        }
        return this.f84979b;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f84980c == null) {
            this.f84980c = new r(this.f84978a.entrySet());
        }
        return this.f84980c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f84981d == null) {
            this.f84981d = DesugarCollections.unmodifiableCollection(this.f84978a.values());
        }
        return this.f84981d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f84978a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f84978a.hashCode();
    }

    public final String toString() {
        return this.f84978a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f84978a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.forEach(this.f84978a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
