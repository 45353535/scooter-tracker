package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f63 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f110619b;

    public f63(Iterator it) {
        this.f110619b = (Iterator) ie2.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110619b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f110619b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f110619b.remove();
    }
}
