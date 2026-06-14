package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class n extends fh1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f113665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f113666e;

    public n(a0 a0Var, Map map) {
        this.f113666e = a0Var;
        this.f113665d = map;
    }

    public final t31 a(Map.Entry entry) {
        Object key = entry.getKey();
        a0 a0Var = this.f113666e;
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) a0Var;
        iVar.getClass();
        List list = (List) collection;
        return new t31(key, list instanceof RandomAccess ? new t(iVar, key, list, null) : new z(iVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f113665d;
        a0 a0Var = this.f113666e;
        Map map2 = a0Var.f108502f;
        if (map != map2) {
            m mVar = new m(this);
            while (mVar.hasNext()) {
                mVar.next();
                mVar.remove();
            }
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f108502f.clear();
        a0Var.f108503g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f113665d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f113665d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f113665d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        i iVar = (i) this.f113666e;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new t(iVar, obj, list, null) : new z(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f113665d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        a0 a0Var = this.f113666e;
        q qVar = a0Var.f110122c;
        if (qVar != null) {
            return qVar;
        }
        q qVarC = ((ew1) a0Var).c();
        a0Var.f110122c = qVarC;
        return qVarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f113665d.remove(obj);
        if (collection == null) {
            return null;
        }
        List list = (List) ((ew1) this.f113666e).f110507h.get();
        list.addAll(collection);
        this.f113666e.f108503g -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f113665d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f113665d.toString();
    }
}
