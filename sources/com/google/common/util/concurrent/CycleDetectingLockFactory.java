package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap f31424b = new MapMaker().weakKeys().makeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LazyLogger f31425c = new LazyLogger(CycleDetectingLockFactory.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f31426d = new ThreadLocal<ArrayList<LockGraphNode>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList initialValue() {
            return Lists.newArrayListWithCapacity(3);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Policy f31427a;

    private interface CycleDetectingLock {
        LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LockGraphNode f31428b;

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
            return this.f31428b;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        private CycleDetectingReentrantLock(LockGraphNode lockGraphNode, boolean z10) {
            super(z10);
            this.f31428b = (LockGraphNode) Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CycleDetectingReentrantReadLock f31432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CycleDetectingReentrantWriteLock f31433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final LockGraphNode f31434d;

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
            return this.f31434d;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        private CycleDetectingReentrantReadWriteLock(LockGraphNode lockGraphNode, boolean z10) {
            super(z10);
            this.f31432b = CycleDetectingLockFactory.this.new CycleDetectingReentrantReadLock(this);
            this.f31433c = CycleDetectingLockFactory.this.new CycleDetectingReentrantWriteLock(this);
            this.f31434d = (LockGraphNode) Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f31432b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f31433c;
        }
    }

    private static class ExampleStackTrace extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final StackTraceElement[] f31438b = new StackTraceElement[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final ImmutableSet f31439c = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());

        ExampleStackTrace(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2) {
            super(lockGraphNode.d() + " -> " + lockGraphNode2.d());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (WithExplicitOrdering.class.getName().equals(stackTrace[i10].getClassName())) {
                    setStackTrace(f31438b);
                    return;
                } else {
                    if (!f31439c.contains(stackTrace[i10].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10, length));
                        return;
                    }
                }
            }
        }
    }

    private static class LockGraphNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f31440a = new MapMaker().weakKeys().makeMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f31441b = new MapMaker().weakKeys().makeMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f31442c;

        LockGraphNode(String str) {
            this.f31442c = (String) Preconditions.checkNotNull(str);
        }

        private ExampleStackTrace c(LockGraphNode lockGraphNode, Set set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = (ExampleStackTrace) this.f31440a.get(lockGraphNode);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry entry : this.f31440a.entrySet()) {
                LockGraphNode lockGraphNode2 = (LockGraphNode) entry.getKey();
                ExampleStackTrace exampleStackTraceC = lockGraphNode2.c(lockGraphNode, set);
                if (exampleStackTraceC != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(lockGraphNode2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) entry.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(exampleStackTraceC);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        void a(Policy policy, LockGraphNode lockGraphNode) {
            Preconditions.checkState(this != lockGraphNode, "Attempted to acquire multiple locks with the same rank %s", lockGraphNode.d());
            if (this.f31440a.containsKey(lockGraphNode)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = (PotentialDeadlockException) this.f31441b.get(lockGraphNode);
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new PotentialDeadlockException(lockGraphNode, this, potentialDeadlockException.getConflictingStackTrace()));
                return;
            }
            ExampleStackTrace exampleStackTraceC = lockGraphNode.c(this, Sets.newIdentityHashSet());
            if (exampleStackTraceC == null) {
                this.f31440a.put(lockGraphNode, new ExampleStackTrace(lockGraphNode, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(lockGraphNode, this, exampleStackTraceC);
            this.f31441b.put(lockGraphNode, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        void b(Policy policy, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(policy, (LockGraphNode) it.next());
            }
        }

        String d() {
            return this.f31442c;
        }
    }

    public enum Policies implements Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f31425c.a().log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ExampleStackTrace f31444d;

        public ExampleStackTrace getConflictingStackTrace() {
            return this.f31444d;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f31444d; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }

        private PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
            super(lockGraphNode, lockGraphNode2);
            this.f31444d = exampleStackTrace;
            initCause(exampleStackTrace);
        }
    }

    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f31445e;

        WithExplicitOrdering(Policy policy, Map map) {
            super(policy);
            this.f31445e = map;
        }

        public ReentrantLock newReentrantLock(E e10) {
            return newReentrantLock((Enum) e10, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e10) {
            return newReentrantReadWriteLock((Enum) e10, false);
        }

        public ReentrantLock newReentrantLock(E e10, boolean z10) {
            if (this.f31427a == Policies.DISABLED) {
                return new ReentrantLock(z10);
            }
            LockGraphNode lockGraphNode = (LockGraphNode) this.f31445e.get(e10);
            Objects.requireNonNull(lockGraphNode);
            return new CycleDetectingReentrantLock(lockGraphNode, z10);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e10, boolean z10) {
            if (this.f31427a == Policies.DISABLED) {
                return new ReentrantReadWriteLock(z10);
            }
            LockGraphNode lockGraphNode = (LockGraphNode) this.f31445e.get(e10);
            Objects.requireNonNull(lockGraphNode);
            return new CycleDetectingReentrantReadWriteLock(lockGraphNode, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CycleDetectingLock cycleDetectingLock) {
        if (cycleDetectingLock.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList arrayList = (ArrayList) f31426d.get();
        Objects.requireNonNull(arrayList);
        LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
        lockGraphNode.b(this.f31427a, arrayList);
        arrayList.add(lockGraphNode);
    }

    static Map e(Class cls) {
        EnumMap enumMapNewEnumMap = Maps.newEnumMap(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(length);
        int i10 = 0;
        for (Enum r62 : enumArr) {
            LockGraphNode lockGraphNode = new LockGraphNode(f(r62));
            arrayListNewArrayListWithCapacity.add(lockGraphNode);
            enumMapNewEnumMap.put(r62, lockGraphNode);
        }
        for (int i11 = 1; i11 < length; i11++) {
            ((LockGraphNode) arrayListNewArrayListWithCapacity.get(i11)).b(Policies.THROW, arrayListNewArrayListWithCapacity.subList(0, i11));
        }
        while (i10 < length - 1) {
            i10++;
            ((LockGraphNode) arrayListNewArrayListWithCapacity.get(i10)).b(Policies.DISABLED, arrayListNewArrayListWithCapacity.subList(i10, length));
        }
        return DesugarCollections.unmodifiableMap(enumMapNewEnumMap);
    }

    private static String f(Enum r22) {
        return r22.getDeclaringClass().getSimpleName() + "." + r22.name();
    }

    private static Map g(Class cls) {
        ConcurrentMap concurrentMap = f31424b;
        Map map = (Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map mapE = e(cls);
        return (Map) MoreObjects.firstNonNull((Map) concurrentMap.putIfAbsent(cls, mapE), mapE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(CycleDetectingLock cycleDetectingLock) {
        if (cycleDetectingLock.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList arrayList = (ArrayList) f31426d.get();
        Objects.requireNonNull(arrayList);
        LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static CycleDetectingLockFactory newInstance(Policy policy) {
        return new CycleDetectingLockFactory(policy);
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(policy);
        return new WithExplicitOrdering<>(policy, g(cls));
    }

    public ReentrantLock newReentrantLock(String str) {
        return newReentrantLock(str, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
        return newReentrantReadWriteLock(str, false);
    }

    private CycleDetectingLockFactory(Policy policy) {
        this.f31427a = (Policy) Preconditions.checkNotNull(policy);
    }

    public ReentrantLock newReentrantLock(String str, boolean z10) {
        return this.f31427a == Policies.DISABLED ? new ReentrantLock(z10) : new CycleDetectingReentrantLock(new LockGraphNode(str), z10);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z10) {
        return this.f31427a == Policies.DISABLED ? new ReentrantReadWriteLock(z10) : new CycleDetectingReentrantReadWriteLock(new LockGraphNode(str), z10);
    }

    private class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CycleDetectingReentrantReadWriteLock f31430b;

        CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.f31430b = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f31430b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f31430b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f31430b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f31430b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f31430b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f31430b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f31430b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f31430b);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f31430b);
            }
        }
    }

    private class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CycleDetectingReentrantReadWriteLock f31436b;

        CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.f31436b = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f31436b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f31436b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f31436b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f31436b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f31436b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f31436b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f31436b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f31436b);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f31436b);
            }
        }
    }
}
