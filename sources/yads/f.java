package yads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends w73 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110534c;

    public f(int i10, int i11) {
        ie2.b(i11, i10);
        this.f110533b = i10;
        this.f110534c = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f110534c < this.f110533b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f110534c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f110534c;
        this.f110534c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f110534c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f110534c - 1;
        this.f110534c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f110534c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
