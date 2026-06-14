package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class h implements Iterator, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f93308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93309c;

    public h(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93308b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93309c < this.f93308b.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f93308b;
            int i10 = this.f93309c;
            this.f93309c = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93309c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
