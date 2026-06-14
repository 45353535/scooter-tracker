package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5657i implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f84944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5657i f84945b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient C5659k f84946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient C5659k f84947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient C5655g f84948e;

    public C5657i(java.util.Map map) {
        this.f84944a = (java.util.Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f84945b) {
            size = this.f84944a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f84945b) {
            zIsEmpty = this.f84944a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f84945b) {
            zContainsKey = this.f84944a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f84945b) {
            zContainsValue = this.f84944a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f84945b) {
            obj2 = this.f84944a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f84945b) {
            objPut = this.f84944a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f84945b) {
            objRemove = this.f84944a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f84945b) {
            this.f84944a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f84945b) {
            this.f84944a.clear();
        }
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        C5659k c5659k;
        synchronized (this.f84945b) {
            try {
                if (this.f84946c == null) {
                    this.f84946c = new C5659k(this.f84944a.keySet(), this.f84945b);
                }
                c5659k = this.f84946c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5659k;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        C5659k c5659k;
        synchronized (this.f84945b) {
            try {
                if (this.f84947d == null) {
                    this.f84947d = new C5659k(this.f84944a.entrySet(), this.f84945b);
                }
                c5659k = this.f84947d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5659k;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        C5655g c5655g;
        synchronized (this.f84945b) {
            try {
                if (this.f84948e == null) {
                    this.f84948e = new C5655g(this.f84944a.values(), this.f84945b);
                }
                c5655g = this.f84948e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5655g;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f84945b) {
            zEquals = this.f84944a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f84945b) {
            iHashCode = this.f84944a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.f84945b) {
            string = this.f84944a.toString();
        }
        return string;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f84945b) {
            orDefault = Map.EL.getOrDefault(this.f84944a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f84945b) {
            Map.EL.forEach(this.f84944a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f84945b) {
            java.util.Map map = this.f84944a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objA;
        synchronized (this.f84945b) {
            objA = Map.EL.a(this.f84944a, obj, obj2);
        }
        return objA;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f84945b) {
            zRemove = Map.EL.remove(this.f84944a, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f84945b) {
            java.util.Map map = this.f84944a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f84945b) {
            java.util.Map map = this.f84944a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f84945b) {
            objComputeIfAbsent = Map.EL.computeIfAbsent(this.f84944a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        synchronized (this.f84945b) {
            java.util.Map map = this.f84944a;
            objComputeIfPresent = map instanceof Map ? ((Map) map).computeIfPresent(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        synchronized (this.f84945b) {
            java.util.Map map = this.f84944a;
            objCompute = map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        synchronized (this.f84945b) {
            objMerge = Map.EL.merge(this.f84944a, obj, obj2, biFunction);
        }
        return objMerge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f84945b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
