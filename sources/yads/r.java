package yads;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends u implements NavigableMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f115242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, NavigableMap navigableMap) {
        super(a0Var, navigableMap);
        this.f115242h = a0Var;
    }

    @Override // yads.u
    public final SortedSet a() {
        return new s(this.f115242h, b());
    }

    @Override // yads.u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f113665d);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = b().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((r) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new r(this.f115242h, b().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = b().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = b().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return b().floorKey(obj);
    }

    @Override // yads.u, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = b().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return b().higherKey(obj);
    }

    @Override // yads.u, yads.n, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = b().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = b().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        n nVar = ((l) entrySet()).f112898b;
        Iterator it = nVar.f113665d.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        t31 t31VarA = nVar.a(entry);
        List list = (List) ((ew1) this.f115242h).f110507h.get();
        list.addAll((Collection) t31VarA.getValue());
        if (!(collection != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        nVar.f113666e.f108503g -= collection.size();
        collection.clear();
        Object key = t31VarA.getKey();
        ((i) this.f115242h).getClass();
        return new t31(key, DesugarCollections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        n nVar = ((l) ((fh1) descendingMap()).entrySet()).f112898b;
        Iterator it = nVar.f113665d.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        t31 t31VarA = nVar.a(entry);
        List list = (List) ((ew1) this.f115242h).f110507h.get();
        list.addAll((Collection) t31VarA.getValue());
        if (!(collection != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        nVar.f113666e.f108503g -= collection.size();
        collection.clear();
        Object key = t31VarA.getKey();
        ((i) this.f115242h).getClass();
        return new t31(key, DesugarCollections.unmodifiableList(list));
    }

    @Override // yads.u, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // yads.u, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new r(this.f115242h, b().headMap(obj, z10));
    }

    @Override // yads.u, yads.n, java.util.AbstractMap, java.util.Map
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new r(this.f115242h, b().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new r(this.f115242h, b().tailMap(obj, z10));
    }
}
