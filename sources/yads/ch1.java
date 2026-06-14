package yads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ch1 extends xv2 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((l) this).f112898b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((l) this).f112898b.isEmpty();
    }

    @Override // yads.xv2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= ((l) this).remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // yads.xv2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i10;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                uw.a(size, "expectedSize");
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                Set setEntrySet = ((l) this).f112898b.f113665d.entrySet();
                setEntrySet.getClass();
                try {
                    if (setEntrySet.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return ((l) this).f112898b.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((l) this).f112898b.f113665d.size();
    }
}
