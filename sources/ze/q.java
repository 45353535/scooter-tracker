package ze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class q implements Set, yf.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f119355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f119356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f119357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f119358e;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f119359b;

        a() {
            this.f119359b = q.this.f119355b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f119359b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return q.this.f119356c.invoke(this.f119359b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f119359b.remove();
        }
    }

    public q(Set delegate, Function1 convertTo, Function1 convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.f119355b = delegate;
        this.f119356c = convertTo;
        this.f119357d = convert;
        this.f119358e = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f119355b.add(this.f119357d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f119355b.addAll(e(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f119355b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f119355b.contains(this.f119357d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f119355b.containsAll(e(elements));
    }

    public Collection e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f119357d.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<?> collectionF = f(this.f119355b);
            if (((Set) obj).containsAll(collectionF) && collectionF.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection f(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f119356c.invoke(it.next()));
        }
        return arrayList;
    }

    public int g() {
        return this.f119358e;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f119355b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f119355b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f119355b.remove(this.f119357d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f119355b.removeAll(CollectionsKt.toSet(e(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f119355b.retainAll(CollectionsKt.toSet(e(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.s.a(this);
    }

    public String toString() {
        return f(this.f119355b).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.s.b(this, array);
    }
}
