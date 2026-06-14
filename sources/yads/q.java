package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class q extends dh1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f114833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, Map map) {
        super(map);
        this.f114833c = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            p pVar = (p) it;
            if (!pVar.hasNext()) {
                return;
            }
            pVar.next();
            pVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f109924b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f109924b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f109924b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new p(this, this.f109924b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f109924b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f114833c.f108503g -= size;
        return size > 0;
    }
}
