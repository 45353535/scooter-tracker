package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedSet f84800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f84800f = sortedSet;
    }

    @Override // j$.util.p0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f84800f.comparator();
    }
}
