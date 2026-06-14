package yads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f114139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f114140c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f114141d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f114142e = jc1.f112297b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f114143f;

    public o(a0 a0Var) {
        this.f114143f = a0Var;
        this.f114139b = a0Var.f108502f.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f114139b.hasNext() || this.f114142e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f114142e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f114139b.next();
            this.f114140c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f114141d = collection;
            this.f114142e = collection.iterator();
        }
        return a(this.f114140c, this.f114142e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f114142e.remove();
        Collection collection = this.f114141d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f114139b.remove();
        }
        a0 a0Var = this.f114143f;
        a0Var.f108503g--;
    }
}
