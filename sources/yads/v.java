package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public class v extends q implements SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f116819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f116819d = a0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f109924b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new v(this.f116819d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new v(this.f116819d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new v(this.f116819d, a().tailMap(obj));
    }
}
