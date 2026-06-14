package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    Optional() {
    }

    public static <T> Optional<T> absent() {
        return Absent.d();
    }

    public static <T> Optional<T> fromNullable(T t10) {
        return t10 == null ? absent() : new Present(t10);
    }

    public static <T> Optional<T> of(T t10) {
        return new Present(Preconditions.checkNotNull(t10));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() { // from class: com.google.common.base.Optional.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new AbstractIterator<T>() { // from class: com.google.common.base.Optional.1.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final Iterator f28915d;

                    {
                        this.f28915d = (Iterator) Preconditions.checkNotNull(iterable.iterator());
                    }

                    @Override // com.google.common.base.AbstractIterator
                    protected Object a() {
                        while (this.f28915d.hasNext()) {
                            Optional optional = (Optional) this.f28915d.next();
                            if (optional.isPresent()) {
                                return optional.get();
                            }
                        }
                        return b();
                    }
                };
            }
        };
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t10);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
