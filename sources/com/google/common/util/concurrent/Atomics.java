package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Atomics {
    public static <V> AtomicReference<V> newReference() {
        return new AtomicReference<>();
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int i10) {
        return new AtomicReferenceArray<>(i10);
    }

    public static <V> AtomicReference<V> newReference(@ParametricNullness V v10) {
        return new AtomicReference<>(v10);
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
