package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class Striped<L> {

    private static class CompactStriped<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f31594b;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i10) {
            return (L) this.f31594b[i10];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f31594b.length;
        }

        private CompactStriped(int i10, Supplier supplier) {
            super(i10);
            int i11 = 0;
            Preconditions.checkArgument(i10 <= 1073741824, "Stripes must be <= 2^30)");
            this.f31594b = new Object[this.f31598a + 1];
            while (true) {
                Object[] objArr = this.f31594b;
                if (i11 >= objArr.length) {
                    return;
                }
                objArr[i11] = supplier.get();
                i11++;
            }
        }
    }

    @VisibleForTesting
    static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ConcurrentMap f31595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Supplier f31596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31597d;

        LargeLazyStriped(int i10, Supplier supplier) {
            super(i10);
            int i11 = this.f31598a;
            this.f31597d = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f31596c = supplier;
            this.f31595b = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i10) {
            if (this.f31597d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i10, size());
            }
            L l10 = (L) this.f31595b.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10;
            }
            Object obj = this.f31596c.get();
            return (L) MoreObjects.firstNonNull(this.f31595b.putIfAbsent(Integer.valueOf(i10), obj), obj);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f31597d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaddedLock extends ReentrantLock {
        PaddedLock() {
            super(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaddedSemaphore extends Semaphore {
        PaddedSemaphore(int i10) {
            super(i10, false);
        }
    }

    private static abstract class PowerOfTwoStriped<L> extends Striped<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f31598a;

        PowerOfTwoStriped(int i10) {
            super();
            Preconditions.checkArgument(i10 > 0, "Stripes must be positive");
            this.f31598a = i10 > 1073741824 ? -1 : Striped.f(i10) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(h(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        final int h(Object obj) {
            return Striped.j(obj.hashCode()) & this.f31598a;
        }
    }

    @VisibleForTesting
    static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceArray f31599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Supplier f31600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ReferenceQueue f31602e;

        private static final class ArrayReference<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f31603a;

            ArrayReference(Object obj, int i10, ReferenceQueue referenceQueue) {
                super(obj, referenceQueue);
                this.f31603a = i10;
            }
        }

        SmallLazyStriped(int i10, Supplier supplier) {
            super(i10);
            this.f31602e = new ReferenceQueue();
            int i11 = this.f31598a;
            int i12 = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f31601d = i12;
            this.f31599b = new AtomicReferenceArray(i12);
            this.f31600c = supplier;
        }

        private void k() {
            while (true) {
                Reference referencePoll = this.f31602e.poll();
                if (referencePoll == null) {
                    return;
                }
                ArrayReference arrayReference = (ArrayReference) referencePoll;
                h0.a(this.f31599b, arrayReference.f31603a, arrayReference, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i10) {
            if (this.f31601d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i10, size());
            }
            ArrayReference arrayReference = (ArrayReference) this.f31599b.get(i10);
            L l10 = arrayReference == null ? null : arrayReference.get();
            if (l10 != null) {
                return l10;
            }
            L l11 = (L) this.f31600c.get();
            ArrayReference arrayReference2 = new ArrayReference(l11, i10, this.f31602e);
            while (!h0.a(this.f31599b, i10, arrayReference, arrayReference2)) {
                arrayReference = (ArrayReference) this.f31599b.get(i10);
                L l12 = arrayReference == null ? null : arrayReference.get();
                if (l12 != null) {
                    return l12;
                }
            }
            k();
            return l11;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f31601d;
        }
    }

    private static final class WeakSafeCondition extends ForwardingCondition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Condition f31604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakSafeReadWriteLock f31605b;

        WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f31604a = condition;
            this.f31605b = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        Condition a() {
            return this.f31604a;
        }
    }

    private static final class WeakSafeLock extends ForwardingLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lock f31606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakSafeReadWriteLock f31607c;

        WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f31606b = lock;
            this.f31607c = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        Lock a() {
            return this.f31606b;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.f31606b.newCondition(), this.f31607c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReadWriteLock f31608b = new ReentrantReadWriteLock();

        WeakSafeReadWriteLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.f31608b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.f31608b.writeLock(), this);
        }
    }

    public static /* synthetic */ Semaphore a(int i10) {
        return new PaddedSemaphore(i10);
    }

    public static /* synthetic */ Lock b() {
        return new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore c(int i10) {
        return new Semaphore(i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10) {
        return 1 << IntMath.log2(i10, RoundingMode.CEILING);
    }

    static Striped g(int i10, Supplier supplier) {
        return new CompactStriped(i10, supplier);
    }

    static Striped i(int i10, Supplier supplier) {
        return i10 < 1024 ? new SmallLazyStriped(i10, supplier) : new LargeLazyStriped(i10, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public static Striped<Lock> lazyWeakLock(int i10) {
        return i(i10, new Supplier() { // from class: com.google.common.util.concurrent.f0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.b();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i10) {
        return i(i10, new Supplier() { // from class: com.google.common.util.concurrent.b0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i10, final int i11) {
        return i(i10, new Supplier() { // from class: com.google.common.util.concurrent.e0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.c(i11);
            }
        });
    }

    public static Striped<Lock> lock(int i10) {
        return g(i10, new Supplier() { // from class: com.google.common.util.concurrent.c0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int i10) {
        return g(i10, new Supplier() { // from class: com.google.common.util.concurrent.g0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i10, final int i11) {
        return g(i10, new Supplier() { // from class: com.google.common.util.concurrent.d0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.a(i11);
            }
        });
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(iterable);
        if (arrayListNewArrayList.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i10 = 0; i10 < arrayListNewArrayList.size(); i10++) {
            iArr[i10] = h(arrayListNewArrayList.get(i10));
        }
        Arrays.sort(iArr);
        int i11 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i11));
        for (int i12 = 1; i12 < arrayListNewArrayList.size(); i12++) {
            int i13 = iArr[i12];
            if (i13 == i11) {
                arrayListNewArrayList.set(i12, arrayListNewArrayList.get(i12 - 1));
            } else {
                arrayListNewArrayList.set(i12, getAt(i13));
                i11 = i13;
            }
        }
        return DesugarCollections.unmodifiableList(arrayListNewArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i10);

    abstract int h(Object obj);

    public abstract int size();

    private Striped() {
    }
}
