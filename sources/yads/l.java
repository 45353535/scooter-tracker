package yads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ch1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f112898b;

    public l(n nVar) {
        this.f112898b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f112898b.f113665d.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m(this.f112898b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        Set setEntrySet = this.f112898b.f113665d.entrySet();
        setEntrySet.getClass();
        try {
            if (!setEntrySet.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            a0 a0Var = this.f112898b.f113666e;
            Object key = entry.getKey();
            Map map = a0Var.f108502f;
            map.getClass();
            try {
                objRemove = map.remove(key);
            } catch (ClassCastException | NullPointerException unused) {
                objRemove = null;
            }
            Collection collection = (Collection) objRemove;
            if (collection == null) {
                return true;
            }
            int size = collection.size();
            collection.clear();
            a0Var.f108503g -= size;
            return true;
        } catch (ClassCastException | NullPointerException unused2) {
            return false;
        }
    }
}
