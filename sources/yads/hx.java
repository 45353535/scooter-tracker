package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hx implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f111792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111793d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx f111794e;

    public hx(lx lxVar) {
        this.f111794e = lxVar;
        this.f111791b = lxVar.f113250f;
        this.f111792c = lxVar.b();
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f111792c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f111794e.f113250f != this.f111791b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f111792c;
        this.f111793d = i10;
        Object objA = a(i10);
        lx lxVar = this.f111794e;
        int i11 = this.f111792c + 1;
        if (i11 >= lxVar.f113251g) {
            i11 = -1;
        }
        this.f111792c = i11;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        lx lxVar = this.f111794e;
        int i10 = lxVar.f113250f;
        int i11 = this.f111791b;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f111793d;
        if (!(i12 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f111791b = i11 + 32;
        lxVar.remove(lxVar.b(i12));
        lx lxVar2 = this.f111794e;
        int i13 = this.f111792c;
        lxVar2.getClass();
        this.f111792c = i13 - 1;
        this.f111793d = -1;
    }
}
