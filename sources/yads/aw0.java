package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aw0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((dd0) this).f109884b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((dd0) this).f109884b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((dd0) this).f109884b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((dd0) this).f109884b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((dd0) this).f109884b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((dd0) this).f109884b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((dd0) this).f109884b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((dd0) this).f109884b.size();
    }

    public final String toString() {
        return ((dd0) this).f109884b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((dd0) this).f109884b.values();
    }
}
