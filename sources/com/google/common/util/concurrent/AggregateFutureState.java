package com.google.common.util.concurrent;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.j2objc.annotations.ReflectionSupport;
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicHelper f31337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final LazyLogger f31338l = new LazyLogger(AggregateFutureState.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Set f31339i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f31340j;

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        abstract void a(AggregateFutureState aggregateFutureState, Set set, Set set2);

        abstract int b(AggregateFutureState aggregateFutureState);
    }

    private static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f31341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater f31342b;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f31341a = atomicReferenceFieldUpdater;
            this.f31342b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void a(AggregateFutureState aggregateFutureState, Set set, Set set2) {
            androidx.concurrent.futures.a.a(this.f31341a, aggregateFutureState, set, set2);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int b(AggregateFutureState aggregateFutureState) {
            return this.f31342b.decrementAndGet(aggregateFutureState);
        }
    }

    private static final class SynchronizedAtomicHelper extends AtomicHelper {
        private SynchronizedAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void a(AggregateFutureState aggregateFutureState, Set set, Set set2) {
            synchronized (aggregateFutureState) {
                try {
                    if (aggregateFutureState.f31339i == set) {
                        aggregateFutureState.f31339i = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int b(AggregateFutureState aggregateFutureState) {
            int iF;
            synchronized (aggregateFutureState) {
                iF = AggregateFutureState.F(aggregateFutureState);
            }
            return iF;
        }
    }

    static {
        AtomicHelper synchronizedAtomicHelper;
        Throwable th2 = null;
        byte b10 = 0;
        try {
            synchronizedAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT), AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "j"));
        } catch (Throwable th3) {
            synchronizedAtomicHelper = new SynchronizedAtomicHelper();
            th2 = th3;
        }
        f31337k = synchronizedAtomicHelper;
        if (th2 != null) {
            f31338l.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    AggregateFutureState(int i10) {
        this.f31340j = i10;
    }

    static /* synthetic */ int F(AggregateFutureState aggregateFutureState) {
        int i10 = aggregateFutureState.f31340j - 1;
        aggregateFutureState.f31340j = i10;
        return i10;
    }

    abstract void G(Set set);

    final void H() {
        this.f31339i = null;
    }

    final int I() {
        return f31337k.b(this);
    }

    final Set J() {
        Set set = this.f31339i;
        if (set != null) {
            return set;
        }
        Set setNewConcurrentHashSet = Sets.newConcurrentHashSet();
        G(setNewConcurrentHashSet);
        f31337k.a(this, null, setNewConcurrentHashSet);
        Set set2 = this.f31339i;
        Objects.requireNonNull(set2);
        return set2;
    }
}
