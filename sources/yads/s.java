package yads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends v implements NavigableSet {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f115653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, NavigableMap navigableMap) {
        super(a0Var, navigableMap);
        this.f115653e = a0Var;
    }

    @Override // yads.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.f109924b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((q) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new s(this.f115653e, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // yads.v, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        p pVar = (p) iterator();
        if (!pVar.hasNext()) {
            return null;
        }
        Object next = pVar.next();
        pVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        p pVar = (p) ((q) descendingSet()).iterator();
        if (!pVar.hasNext()) {
            return null;
        }
        Object next = pVar.next();
        pVar.remove();
        return next;
    }

    @Override // yads.v, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // yads.v, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new s(this.f115653e, a().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new s(this.f115653e, a().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new s(this.f115653e, a().tailMap(obj, z10));
    }
}
