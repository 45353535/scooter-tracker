package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnmodifiableListIterator<E> extends UnmodifiableIterator<E> implements ListIterator<E> {
    protected UnmodifiableListIterator() {
    }

    @Override // java.util.ListIterator
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@ParametricNullness E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@ParametricNullness E e10) {
        throw new UnsupportedOperationException();
    }
}
