package j$.util;

/* JADX INFO: renamed from: j$.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5799w extends C5797u implements java.util.SortedSet, SortedSet {
    private static final long serialVersionUID = -4929149591599911165L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.SortedSet f85412b;

    public C5799w(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.f85412b = sortedSet;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return this.f85412b.comparator();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return new C5799w(this.f85412b.subSet(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        return new C5799w(this.f85412b.headSet(obj));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        return new C5799w(this.f85412b.tailSet(obj));
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f85412b.first();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f85412b.last();
    }
}
