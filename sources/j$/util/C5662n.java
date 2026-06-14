package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5662n implements ListIterator, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f84956a;

    public C5662n(C5663o c5663o, int i10) {
        this.f84956a = c5663o.f84961b.listIterator(i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f84956a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f84956a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f84956a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f84956a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f84956a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f84956a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC5802z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC5650b.r(this.f84956a, consumer);
    }
}
