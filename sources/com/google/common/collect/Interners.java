package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Interners {

    public static class InternerBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MapMaker f29713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29714b;

        public <E> Interner<E> build() {
            if (!this.f29714b) {
                this.f29713a.weakKeys();
            }
            return new InternerImpl(this.f29713a);
        }

        public InternerBuilder concurrencyLevel(int i10) {
            this.f29713a.concurrencyLevel(i10);
            return this;
        }

        public InternerBuilder strong() {
            this.f29714b = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.f29714b = false;
            return this;
        }

        private InternerBuilder() {
            this.f29713a = new MapMaker();
            this.f29714b = true;
        }
    }

    private static class InternerFunction<E> implements Function<E, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Interner f29715b;

        public InternerFunction(Interner<E> interner) {
            this.f29715b = interner;
        }

        @Override // com.google.common.base.Function
        public E apply(E e10) {
            return (E) this.f29715b.intern(e10);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.f29715b.equals(((InternerFunction) obj).f29715b);
            }
            return false;
        }

        public int hashCode() {
            return this.f29715b.hashCode();
        }
    }

    @VisibleForTesting
    static final class InternerImpl<E> implements Interner<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MapMakerInternalMap f29716a;

        @Override // com.google.common.collect.Interner
        public E intern(E e10) {
            E e11;
            do {
                MapMakerInternalMap.InternalEntry internalEntryD = this.f29716a.d(e10);
                if (internalEntryD != null && (e11 = (E) internalEntryD.getKey()) != null) {
                    return e11;
                }
            } while (((MapMaker.Dummy) this.f29716a.putIfAbsent(e10, MapMaker.Dummy.VALUE)) != null);
            return e10;
        }

        private InternerImpl(MapMaker mapMaker) {
            this.f29716a = MapMakerInternalMap.c(mapMaker.f(Equivalence.equals()));
        }
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new InternerFunction((Interner) Preconditions.checkNotNull(interner));
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    public static <E> Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}
