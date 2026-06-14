package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry f114478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f114479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f114480d;

    public p(q qVar, Iterator it) {
        this.f114480d = qVar;
        this.f114479c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f114479c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f114479c.next();
        this.f114478b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f114478b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.f114479c.remove();
        this.f114480d.f114833c.f108503g -= collection.size();
        collection.clear();
        this.f114478b = null;
    }
}
