package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f29289b;

    protected AbstractSequentialIterator(Object obj) {
        this.f29289b = obj;
    }

    protected abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29289b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = (T) this.f29289b;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f29289b = a(t10);
        return t10;
    }
}
