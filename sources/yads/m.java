package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f113278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f113279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f113280d;

    public m(n nVar) {
        this.f113280d = nVar;
        this.f113278b = nVar.f113665d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f113278b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f113278b.next();
        this.f113279c = (Collection) entry.getValue();
        return this.f113280d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f113279c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f113278b.remove();
        this.f113280d.f113666e.f108503g -= this.f113279c.size();
        this.f113279c.clear();
        this.f113279c = null;
    }
}
