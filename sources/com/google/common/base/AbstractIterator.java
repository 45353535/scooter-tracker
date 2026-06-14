package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private State f28812b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f28813c;

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    private boolean c() {
        this.f28812b = State.FAILED;
        this.f28813c = a();
        if (this.f28812b == State.DONE) {
            return false;
        }
        this.f28812b = State.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f28812b = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f28812b != State.FAILED);
        int iOrdinal = this.f28812b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f28812b = State.NOT_READY;
        T t10 = (T) NullnessCasts.a(this.f28813c);
        this.f28813c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
