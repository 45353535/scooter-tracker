package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private State f29227b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f29228c;

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    private boolean b() {
        this.f29227b = State.FAILED;
        this.f29228c = computeNext();
        if (this.f29227b == State.DONE) {
            return false;
        }
        this.f29227b = State.READY;
        return true;
    }

    protected final Object a() {
        this.f29227b = State.DONE;
        return null;
    }

    protected abstract Object computeNext();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f29227b != State.FAILED);
        int iOrdinal = this.f29227b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return b();
        }
        return false;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29227b = State.NOT_READY;
        T t10 = (T) NullnessCasts.a(this.f29228c);
        this.f29228c = null;
        return t10;
    }

    @ParametricNullness
    public final T peek() {
        if (hasNext()) {
            return (T) NullnessCasts.a(this.f29228c);
        }
        throw new NoSuchElementException();
    }
}
