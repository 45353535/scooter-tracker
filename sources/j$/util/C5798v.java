package j$.util;

import java.util.SortedMap;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5798v extends C5666s implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SortedMap f85411e;

    public C5798v(SortedMap sortedMap) {
        super(sortedMap);
        this.f85411e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.f85411e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C5798v(this.f85411e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C5798v(this.f85411e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C5798v(this.f85411e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f85411e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f85411e.lastKey();
    }
}
