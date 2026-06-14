package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class eh1 extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f110375b;

    public eh1(Map map) {
        this.f110375b = (Map) ie2.a(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f110375b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f110375b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f110375b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bh1(this.f110375b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f110375b.entrySet()) {
                if (y72.a(obj, entry.getValue())) {
                    this.f110375b.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f110375b.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f110375b.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f110375b.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f110375b.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f110375b.size();
    }
}
