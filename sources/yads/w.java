package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public class w implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f117259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f117260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f117261d;

    public w(x xVar) {
        this.f117261d = xVar;
        Collection collection = xVar.f117658c;
        this.f117260c = collection;
        this.f117259b = a0.a(collection);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f117261d.c();
        if (this.f117261d.f117658c == this.f117260c) {
            return this.f117259b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f117261d.c();
        if (this.f117261d.f117658c == this.f117260c) {
            return this.f117259b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f117259b.remove();
        x xVar = this.f117261d;
        a0 a0Var = xVar.f117661f;
        a0Var.f108503g--;
        xVar.d();
    }

    public w(x xVar, ListIterator listIterator) {
        this.f117261d = xVar;
        this.f117260c = xVar.f117658c;
        this.f117259b = listIterator;
    }
}
