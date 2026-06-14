package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class AtomicLongMap<K> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f31345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f31346c;

    private AtomicLongMap(ConcurrentHashMap concurrentHashMap) {
        this.f31345b = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map d() {
        return DesugarCollections.unmodifiableMap(Maps.transformValues(this.f31345b, new Function<AtomicLong, Long>() { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k10, long j10) {
        AtomicLong atomicLong;
        long j11;
        long j12;
        do {
            atomicLong = (AtomicLong) this.f31345b.get(k10);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.f31345b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                break;
            }
            do {
                j11 = atomicLong.get();
                if (j11 != 0) {
                    j12 = j11 + j10;
                }
            } while (!atomicLong.compareAndSet(j11, j12));
            return j12;
        } while (!this.f31345b.replace(k10, atomicLong, new AtomicLong(j10)));
        return j10;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.f31346c;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapD = d();
        this.f31346c = mapD;
        return mapD;
    }

    public void clear() {
        this.f31345b.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f31345b.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k10) {
        return addAndGet(k10, -1L);
    }

    boolean g(Object obj, long j10) {
        AtomicLong atomicLong = (AtomicLong) this.f31345b.get(obj);
        if (atomicLong == null) {
            return false;
        }
        long j11 = atomicLong.get();
        if (j11 != j10) {
            return false;
        }
        if (j11 != 0 && !atomicLong.compareAndSet(j11, 0L)) {
            return false;
        }
        this.f31345b.remove(obj, atomicLong);
        return true;
    }

    public long get(K k10) {
        AtomicLong atomicLong = (AtomicLong) this.f31345b.get(k10);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k10, long j10) {
        AtomicLong atomicLong;
        long j11;
        do {
            atomicLong = (AtomicLong) this.f31345b.get(k10);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.f31345b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLong.get();
                if (j11 == 0) {
                }
            } while (!atomicLong.compareAndSet(j11, j11 + j10));
            return j11;
        } while (!this.f31345b.replace(k10, atomicLong, new AtomicLong(j10)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k10) {
        return getAndAdd(k10, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k10) {
        return getAndAdd(k10, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k10) {
        return addAndGet(k10, 1L);
    }

    public boolean isEmpty() {
        return this.f31345b.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k10, long j10) {
        AtomicLong atomicLong;
        long j11;
        do {
            atomicLong = (AtomicLong) this.f31345b.get(k10);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.f31345b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLong.get();
                if (j11 == 0) {
                }
            } while (!atomicLong.compareAndSet(j11, j10));
            return j11;
        } while (!this.f31345b.replace(k10, atomicLong, new AtomicLong(j10)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    @CanIgnoreReturnValue
    public long remove(K k10) {
        long j10;
        AtomicLong atomicLong = (AtomicLong) this.f31345b.get(k10);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j10 = atomicLong.get();
            if (j10 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j10, 0L));
        this.f31345b.remove(k10, atomicLong);
        return j10;
    }

    public void removeAllZeros() {
        Iterator it = this.f31345b.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong atomicLong = (AtomicLong) ((Map.Entry) it.next()).getValue();
            if (atomicLong != null && atomicLong.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean removeIfZero(K k10) {
        return g(k10, 0L);
    }

    public int size() {
        return this.f31345b.size();
    }

    public long sum() {
        Iterator it = this.f31345b.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += ((AtomicLong) it.next()).get();
        }
        return j10;
    }

    public String toString() {
        return this.f31345b.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }
}
