package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LocalCache;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, j$.util.concurrent.ConcurrentMap {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Logger f29054x = Logger.getLogger(LocalCache.class.getName());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final ValueReference f29055y = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object waitForValue() {
            return null;
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Queue f29056z = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f29057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f29058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Segment[] f29059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f29060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Equivalence f29061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Equivalence f29062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Strength f29063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Strength f29064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f29065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Weigher f29066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f29067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final long f29068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f29069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Queue f29070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final RemovalListener f29071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Ticker f29072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final EntryFactory f29073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AbstractCache.StatsCounter f29074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final CacheLoader f29075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Set f29076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Collection f29077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Set f29078w;

    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }
    }

    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry f29080b = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.AccessQueue.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ReferenceEntry f29081b = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            ReferenceEntry f29082c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.f29081b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.f29082c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j10) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f29081b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f29082c = referenceEntry;
            }
        };

        AccessQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f29080b.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f29080b;
                if (nextInAccessQueue == referenceEntry) {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f29080b;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.u(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f29080b.getNextInAccessQueue() == this.f29080b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public ReferenceEntry a(ReferenceEntry referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == AccessQueue.this.f29080b) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.a(previousInAccessQueue, nextInAccessQueue);
            LocalCache.u(referenceEntry);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.f29080b.getNextInAccessQueue(); nextInAccessQueue != this.f29080b; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i10++;
            }
            return i10;
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.a(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.a(this.f29080b.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.a(referenceEntry, this.f29080b);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f29080b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f29080b) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f29080b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f29080b) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
  (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x005a: FILLED_NEW_ARRAY 
  (r0v0 com.google.common.cache.LocalCache$EntryFactory)
  (r1v1 com.google.common.cache.LocalCache$EntryFactory)
  (r3v1 com.google.common.cache.LocalCache$EntryFactory)
  (r5v1 com.google.common.cache.LocalCache$EntryFactory)
  (r7v1 com.google.common.cache.LocalCache$EntryFactory)
  (r9v1 com.google.common.cache.LocalCache$EntryFactory)
  (r11v1 com.google.common.cache.LocalCache$EntryFactory)
  (r13v1 com.google.common.cache.LocalCache$EntryFactory)
 A[WRAPPED] (LINE:91) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongEntry(obj, i10, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongAccessEntry(obj, i10, referenceEntry);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongWriteEntry(obj, i10, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongAccessWriteEntry(obj, i10, referenceEntry);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakAccessEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakWriteEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakAccessWriteEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        };


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final EntryFactory[] f29085b = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongEntry(obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongAccessEntry(obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongWriteEntry(obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new StrongAccessWriteEntry(obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakAccessEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakWriteEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryH = super.h(segment, referenceEntry, referenceEntry2, obj);
                g(referenceEntry, referenceEntryH);
                i(referenceEntry, referenceEntryH);
                return referenceEntryH;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry) {
                return new WeakAccessWriteEntry(segment.f29127i, obj, i10, referenceEntry);
            }
        }};

        static {
        }

        private EntryFactory() {
        }

        static EntryFactory j(Strength strength, boolean z10, boolean z11) {
            return f29085b[(strength == Strength.WEAK ? 4 : 0) | (z10 ? 1 : 0) | (z11 ? 2 : 0)];
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) f29086c.clone();
        }

        void g(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.a(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.a(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.u(referenceEntry);
        }

        ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
            return k(segment, obj, referenceEntry.getHash(), referenceEntry2);
        }

        void i(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.b(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.b(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.v(referenceEntry);
        }

        abstract ReferenceEntry k(Segment segment, Object obj, int i10, ReferenceEntry referenceEntry);
    }

    final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        EntryIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f29062g.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29090c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Segment f29091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AtomicReferenceArray f29092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ReferenceEntry f29093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        WriteThroughEntry f29094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        WriteThroughEntry f29095h;

        HashIterator() {
            this.f29089b = LocalCache.this.f29059d.length - 1;
            a();
        }

        final void a() {
            this.f29094g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f29089b;
                if (i10 < 0) {
                    return;
                }
                Segment[] segmentArr = LocalCache.this.f29059d;
                this.f29089b = i10 - 1;
                Segment segment = segmentArr[i10];
                this.f29091d = segment;
                if (segment.f29121c != 0) {
                    this.f29092e = this.f29091d.f29125g;
                    this.f29090c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(ReferenceEntry referenceEntry) {
            try {
                long j10 = LocalCache.this.f29072q.read();
                Object key = referenceEntry.getKey();
                Object objL = LocalCache.this.l(referenceEntry, j10);
                if (objL == null) {
                    this.f29091d.N();
                    return false;
                }
                this.f29094g = new WriteThroughEntry(key, objL);
                this.f29091d.N();
                return true;
            } catch (Throwable th2) {
                this.f29091d.N();
                throw th2;
            }
        }

        WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.f29094g;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f29095h = writeThroughEntry;
            a();
            return this.f29095h;
        }

        boolean d() {
            ReferenceEntry referenceEntry = this.f29093f;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f29093f = referenceEntry.getNext();
                ReferenceEntry referenceEntry2 = this.f29093f;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.f29093f;
            }
        }

        boolean e() {
            while (true) {
                int i10 = this.f29090c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f29092e;
                this.f29090c = i10 - 1;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i10);
                this.f29093f = referenceEntry;
                if (referenceEntry != null && (b(referenceEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29094g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f29095h != null);
            LocalCache.this.remove(this.f29095h.getKey());
            this.f29095h = null;
        }
    }

    final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        KeyIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return (K) c().getKey();
        }
    }

    final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        transient LoadingCache f29099o;

        LoadingSerializationProxy(LocalCache localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f29099o = i().build(this.f29117m);
        }

        private Object readResolve() {
            return this.f29099o;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public V apply(K k10) {
            return (V) this.f29099o.apply(k10);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k10) throws ExecutionException {
            return (V) this.f29099o.get(k10);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f29099o.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k10) {
            return (V) this.f29099o.getUnchecked(k10);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k10) {
            this.f29099o.refresh(k10);
        }
    }

    static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile ValueReference f29100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SettableFuture f29101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Stopwatch f29102d;

        public LoadingValueReference() {
            this(LocalCache.G());
        }

        public static /* synthetic */ Object a(LoadingValueReference loadingValueReference, Object obj) {
            loadingValueReference.set(obj);
            return obj;
        }

        private ListenableFuture b(Throwable th2) {
            return Futures.immediateFailedFuture(th2);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public long elapsedNanos() {
            return this.f29102d.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return (V) this.f29100b.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        public ValueReference<K, V> getOldValue() {
            return this.f29100b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f29100b.getWeight();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.f29100b.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ListenableFuture<V> loadFuture(K k10, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f29102d.start();
                Object obj = this.f29100b.get();
                if (obj == null) {
                    V vLoad = cacheLoader.load(k10);
                    return set(vLoad) ? this.f29101c : Futures.immediateFuture(vLoad);
                }
                ListenableFuture listenableFutureReload = cacheLoader.reload(k10, obj);
                return listenableFutureReload == null ? Futures.immediateFuture(null) : Futures.transform(listenableFutureReload, new Function() { // from class: com.google.common.cache.b
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj2) {
                        return LocalCache.LoadingValueReference.a(this.f29200b, obj2);
                    }
                }, MoreExecutors.directExecutor());
            } catch (Throwable th2) {
                ListenableFuture<V> listenableFutureB = setException(th2) ? this.f29101c : b(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureB;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v10) {
            if (v10 != null) {
                set(v10);
            } else {
                this.f29100b = LocalCache.G();
            }
        }

        @CanIgnoreReturnValue
        public boolean set(V v10) {
            return this.f29101c.set(v10);
        }

        @CanIgnoreReturnValue
        public boolean setException(Throwable th2) {
            return this.f29101c.setException(th2);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
            return (V) Uninterruptibles.getUninterruptibly(this.f29101c);
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.f29101c = SettableFuture.create();
            this.f29102d = Stopwatch.createUnstarted();
            this.f29100b = valueReference;
        }
    }

    static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        LocalLoadingCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
            super();
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k10) {
            return getUnchecked(k10);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k10) throws ExecutionException {
            return (V) this.f29103b.m(k10);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f29103b.j(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        @CanIgnoreReturnValue
        public V getUnchecked(K k10) {
            try {
                return get(k10);
            } catch (ExecutionException e10) {
                throw new UncheckedExecutionException(e10.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k10) {
            this.f29103b.C(k10);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        Object writeReplace() {
            return new LoadingSerializationProxy(this.f29103b);
        }
    }

    static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final LocalCache f29103b;

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.f29103b;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.f29103b.cleanUp();
        }

        @Override // com.google.common.cache.Cache
        public V get(K k10, final Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return (V) this.f29103b.i(k10, new CacheLoader<Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalManualCache f29105c;

                {
                    this.f29105c = this;
                }

                @Override // com.google.common.cache.CacheLoader
                public V load(Object obj) throws Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.f29103b.k(iterable);
        }

        @Override // com.google.common.cache.Cache
        public V getIfPresent(Object obj) {
            return (V) this.f29103b.getIfPresent(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.f29103b.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.f29103b.o(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k10, V v10) {
            this.f29103b.put(k10, v10);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f29103b.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.f29103b.r();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.f29103b.f29074s);
            for (Segment segment : this.f29103b.f29059d) {
                simpleStatsCounter.incrementBy(segment.f29133o);
            }
            return simpleStatsCounter.snapshot();
        }

        Object writeReplace() {
            return new ManualSerializationProxy(this.f29103b);
        }

        LocalManualCache(CacheBuilder cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() throws Throwable {
            this.f29103b.clear();
        }

        private LocalManualCache(LocalCache localCache) {
            this.f29103b = localCache;
        }
    }

    static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Strength f29106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Strength f29107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Equivalence f29108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Equivalence f29109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f29110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f29111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final long f29112h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Weigher f29113i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f29114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final RemovalListener f29115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final Ticker f29116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final CacheLoader f29117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        transient Cache f29118n;

        ManualSerializationProxy(LocalCache localCache) {
            this(localCache.f29063h, localCache.f29064i, localCache.f29061f, localCache.f29062g, localCache.f29068m, localCache.f29067l, localCache.f29065j, localCache.f29066k, localCache.f29060e, localCache.f29071p, localCache.f29072q, localCache.f29075t);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f29118n = i().build();
        }

        private Object readResolve() {
            return this.f29118n;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Cache n() {
            return this.f29118n;
        }

        CacheBuilder i() {
            CacheBuilder<K1, V1> cacheBuilderRemovalListener = CacheBuilder.newBuilder().s(this.f29106b).t(this.f29107c).q(this.f29108d).v(this.f29109e).concurrencyLevel(this.f29114j).removalListener(this.f29115k);
            cacheBuilderRemovalListener.f29003a = false;
            long j10 = this.f29110f;
            if (j10 > 0) {
                cacheBuilderRemovalListener.expireAfterWrite(j10, TimeUnit.NANOSECONDS);
            }
            long j11 = this.f29111g;
            if (j11 > 0) {
                cacheBuilderRemovalListener.expireAfterAccess(j11, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.f29113i;
            if (weigher != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilderRemovalListener.weigher(weigher);
                long j12 = this.f29112h;
                if (j12 != -1) {
                    cacheBuilderRemovalListener.maximumWeight(j12);
                }
            } else {
                long j13 = this.f29112h;
                if (j13 != -1) {
                    cacheBuilderRemovalListener.maximumSize(j13);
                }
            }
            Ticker ticker = this.f29116l;
            if (ticker != null) {
                cacheBuilderRemovalListener.ticker(ticker);
            }
            return cacheBuilderRemovalListener;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, Equivalence equivalence2, long j10, long j11, long j12, Weigher weigher, int i10, RemovalListener removalListener, Ticker ticker, CacheLoader cacheLoader) {
            this.f29106b = strength;
            this.f29107c = strength2;
            this.f29108d = equivalence;
            this.f29109e = equivalence2;
            this.f29110f = j10;
            this.f29111g = j11;
            this.f29112h = j12;
            this.f29113i = weigher;
            this.f29114j = i10;
            this.f29115k = removalListener;
            this.f29116l = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.f29002t) ? null : ticker;
            this.f29117m = cacheLoader;
        }
    }

    private enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
        }
    }

    static class Segment<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final LocalCache f29120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f29121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f29122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f29123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f29124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile AtomicReferenceArray f29125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final long f29126h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final ReferenceQueue f29127i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final ReferenceQueue f29128j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final Queue f29129k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicInteger f29130l = new AtomicInteger();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Queue f29131m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Queue f29132n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AbstractCache.StatsCounter f29133o;

        Segment(LocalCache localCache, int i10, long j10, AbstractCache.StatsCounter statsCounter) {
            this.f29120b = localCache;
            this.f29126h = j10;
            this.f29133o = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            G(M(i10));
            this.f29127i = localCache.J() ? new ReferenceQueue() : null;
            this.f29128j = localCache.K() ? new ReferenceQueue() : null;
            this.f29129k = localCache.I() ? new ConcurrentLinkedQueue() : LocalCache.e();
            this.f29131m = localCache.M() ? new WriteQueue() : LocalCache.e();
            this.f29132n = localCache.I() ? new AccessQueue() : LocalCache.e();
        }

        public static /* synthetic */ void a(Segment segment, Object obj, int i10, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) {
            segment.getClass();
            try {
                segment.A(obj, i10, loadingValueReference, listenableFuture);
            } catch (Throwable th2) {
                LocalCache.f29054x.log(Level.WARNING, "Exception thrown during refresh", th2);
                loadingValueReference.setException(th2);
            }
        }

        Object A(Object obj, int i10, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) throws Throwable {
            Object uninterruptibly;
            try {
                uninterruptibly = Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (uninterruptibly != null) {
                        this.f29133o.recordLoadSuccess(loadingValueReference.elapsedNanos());
                        l0(obj, i10, loadingValueReference, uninterruptibly);
                        return uninterruptibly;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (uninterruptibly == null) {
                        this.f29133o.recordLoadException(loadingValueReference.elapsedNanos());
                        d0(obj, i10, loadingValueReference);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                uninterruptibly = null;
            }
        }

        ReferenceEntry B(Object obj, int i10) {
            for (ReferenceEntry referenceEntryC = C(i10); referenceEntryC != null; referenceEntryC = referenceEntryC.getNext()) {
                if (referenceEntryC.getHash() == i10) {
                    Object key = referenceEntryC.getKey();
                    if (key == null) {
                        m0();
                    } else if (this.f29120b.f29061f.equivalent(obj, key)) {
                        return referenceEntryC;
                    }
                }
            }
            return null;
        }

        ReferenceEntry C(int i10) {
            return (ReferenceEntry) this.f29125g.get(i10 & (r0.length() - 1));
        }

        ReferenceEntry D(Object obj, int i10, long j10) {
            ReferenceEntry referenceEntryB = B(obj, i10);
            if (referenceEntryB == null) {
                return null;
            }
            if (!this.f29120b.p(referenceEntryB, j10)) {
                return referenceEntryB;
            }
            o0(j10);
            return null;
        }

        Object E(ReferenceEntry referenceEntry, long j10) {
            if (referenceEntry.getKey() == null) {
                m0();
                return null;
            }
            V v10 = referenceEntry.getValueReference().get();
            if (v10 == null) {
                m0();
                return null;
            }
            if (!this.f29120b.p(referenceEntry, j10)) {
                return v10;
            }
            o0(j10);
            return null;
        }

        ReferenceEntry F() {
            for (ReferenceEntry referenceEntry : this.f29132n) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        void G(AtomicReferenceArray atomicReferenceArray) {
            this.f29124f = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f29120b.d()) {
                int i10 = this.f29124f;
                if (i10 == this.f29126h) {
                    this.f29124f = i10 + 1;
                }
            }
            this.f29125g = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        LoadingValueReference H(Object obj, int i10, boolean z10) {
            lock();
            try {
                long j10 = this.f29120b.f29072q.read();
                P(j10);
                AtomicReferenceArray atomicReferenceArray = this.f29125g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                for (ReferenceEntry next = referenceEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29120b.f29061f.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z10 || j10 - next.getWriteTime() >= this.f29120b.f29069n)) {
                            this.f29123e++;
                            LoadingValueReference loadingValueReference = new LoadingValueReference(valueReference);
                            next.setValueReference(loadingValueReference);
                            unlock();
                            O();
                            return loadingValueReference;
                        }
                        unlock();
                        O();
                        return null;
                    }
                }
                this.f29123e++;
                LoadingValueReference loadingValueReference2 = new LoadingValueReference();
                ReferenceEntry referenceEntryL = L(obj, i10, referenceEntry);
                referenceEntryL.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, referenceEntryL);
                unlock();
                O();
                return loadingValueReference2;
            } catch (Throwable th2) {
                unlock();
                O();
                throw th2;
            }
        }

        ListenableFuture I(final Object obj, final int i10, final LoadingValueReference loadingValueReference, CacheLoader cacheLoader) {
            final ListenableFuture<V> listenableFutureLoadFuture = loadingValueReference.loadFuture(obj, cacheLoader);
            listenableFutureLoadFuture.addListener(new Runnable() { // from class: com.google.common.cache.c
                @Override // java.lang.Runnable
                public final void run() {
                    LocalCache.Segment.a(this.f29201b, obj, i10, loadingValueReference, listenableFutureLoadFuture);
                }
            }, MoreExecutors.directExecutor());
            return listenableFutureLoadFuture;
        }

        Object J(Object obj, int i10, LoadingValueReference loadingValueReference, CacheLoader cacheLoader) {
            return A(obj, i10, loadingValueReference, loadingValueReference.loadFuture(obj, cacheLoader));
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        
            if (r2 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        
            r13 = new com.google.common.cache.LocalCache.LoadingValueReference();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        
            if (r12 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        
            r12 = L(r16, r3, r11);
            r12.setValueReference(r13);
            r9.set(r10, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
        
            r12.setValueReference(r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        
            unlock();
            O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (r2 == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        
            monitor-enter(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
        
            r0 = J(r16, r3, r13, r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        
            monitor-exit(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
        
            r15.f29133o.recordMisses(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
        
            return p0(r12, r16, r14);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object K(java.lang.Object r16, int r17, com.google.common.cache.CacheLoader r18) {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.K(java.lang.Object, int, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        ReferenceEntry L(Object obj, int i10, ReferenceEntry referenceEntry) {
            return this.f29120b.f29073r.k(this, Preconditions.checkNotNull(obj), i10, referenceEntry);
        }

        AtomicReferenceArray M(int i10) {
            return new AtomicReferenceArray(i10);
        }

        void N() {
            if ((this.f29130l.incrementAndGet() & 63) == 0) {
                d();
            }
        }

        void O() {
            i0();
        }

        void P(long j10) {
            h0(j10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        
            unlock();
            O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object Q(java.lang.Object r13, int r14, java.lang.Object r15, boolean r16) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.Q(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        boolean S(ReferenceEntry referenceEntry, int i10) throws Throwable {
            AtomicReferenceArray atomicReferenceArray;
            int length;
            ReferenceEntry referenceEntry2;
            ReferenceEntry next;
            lock();
            try {
                atomicReferenceArray = this.f29125g;
                length = (atomicReferenceArray.length() - 1) & i10;
                referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
                next = referenceEntry2;
            } catch (Throwable th2) {
                th = th2;
            }
            while (next != null) {
                if (next == referenceEntry) {
                    this.f29123e++;
                    ReferenceEntry referenceEntryE0 = e0(referenceEntry2, next, next.getKey(), i10, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                    int i11 = this.f29121c - 1;
                    atomicReferenceArray.set(length, referenceEntryE0);
                    this.f29121c = i11;
                    unlock();
                    O();
                    return true;
                }
                int i12 = i10;
                try {
                    next = next.getNext();
                    i10 = i12;
                } catch (Throwable th3) {
                    th = th3;
                }
                th = th3;
                Throwable th4 = th;
                unlock();
                O();
                throw th4;
            }
            unlock();
            O();
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean T(java.lang.Object r13, int r14, com.google.common.cache.LocalCache.ValueReference r15) throws java.lang.Throwable {
            /*
                r12 = this;
                r12.lock()
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f29125g     // Catch: java.lang.Throwable -> L5d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5d
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L5d
                r6 = r5
            L14:
                r3 = 0
                if (r6 == 0) goto L78
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L5d
                if (r4 != r14) goto L6e
                if (r7 == 0) goto L6e
                com.google.common.cache.LocalCache r4 = r12.f29120b     // Catch: java.lang.Throwable -> L5d
                com.google.common.base.Equivalence r4 = r4.f29061f     // Catch: java.lang.Throwable -> L5d
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L5d
                if (r4 == 0) goto L6e
                com.google.common.cache.LocalCache$ValueReference r13 = r6.getValueReference()     // Catch: java.lang.Throwable -> L5d
                if (r13 != r15) goto L60
                int r13 = r12.f29123e     // Catch: java.lang.Throwable -> L5d
                int r13 = r13 + r2
                r12.f29123e = r13     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r9 = r15.get()     // Catch: java.lang.Throwable -> L5d
                com.google.common.cache.RemovalCause r11 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L5d
                r4 = r12
                r8 = r14
                r10 = r15
                com.google.common.cache.ReferenceEntry r13 = r4.e0(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5a
                int r14 = r4.f29121c     // Catch: java.lang.Throwable -> L5a
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L5a
                r4.f29121c = r14     // Catch: java.lang.Throwable -> L5a
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L59
                r12.O()
            L59:
                return r2
            L5a:
                r0 = move-exception
            L5b:
                r13 = r0
                goto L86
            L5d:
                r0 = move-exception
                r4 = r12
                goto L5b
            L60:
                r4 = r12
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L6d
                r12.O()
            L6d:
                return r3
            L6e:
                r4 = r12
                r8 = r14
                r10 = r15
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L5a
                r14 = r8
                r15 = r10
                goto L14
            L78:
                r4 = r12
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L85
                r12.O()
            L85:
                return r3
            L86:
                r12.unlock()
                boolean r14 = r12.isHeldByCurrentThread()
                if (r14 != 0) goto L92
                r12.O()
            L92:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.T(java.lang.Object, int, com.google.common.cache.LocalCache$ValueReference):boolean");
        }

        void U(ReferenceEntry referenceEntry, long j10) {
            if (this.f29120b.z()) {
                referenceEntry.setAccessTime(j10);
            }
            this.f29132n.add(referenceEntry);
        }

        void V(ReferenceEntry referenceEntry, long j10) {
            if (this.f29120b.z()) {
                referenceEntry.setAccessTime(j10);
            }
            this.f29129k.add(referenceEntry);
        }

        void W(ReferenceEntry referenceEntry, int i10, long j10) {
            n();
            this.f29122d += (long) i10;
            if (this.f29120b.z()) {
                referenceEntry.setAccessTime(j10);
            }
            if (this.f29120b.B()) {
                referenceEntry.setWriteTime(j10);
            }
            this.f29132n.add(referenceEntry);
            this.f29131m.add(referenceEntry);
        }

        Object X(Object obj, int i10, CacheLoader cacheLoader, boolean z10) {
            LoadingValueReference loadingValueReferenceH = H(obj, i10, z10);
            if (loadingValueReferenceH == null) {
                return null;
            }
            ListenableFuture listenableFutureI = I(obj, i10, loadingValueReferenceH, cacheLoader);
            if (listenableFutureI.isDone()) {
                try {
                    return Uninterruptibles.getUninterruptibly(listenableFutureI);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r9 = r5.getValueReference();
            r8 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if (r8 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            r12 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r9.isActive() == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            r12 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            r11.f29123e++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        
            r12 = e0(r4, r5, r6, r13, r8, r9, r10);
            r13 = r11.f29121c - 1;
            r0.set(r1, r12);
            r11.f29121c = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        
            unlock();
            O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        
            return r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object Y(java.lang.Object r12, int r13) throws java.lang.Throwable {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.LocalCache r0 = r11.f29120b     // Catch: java.lang.Throwable -> L72
                com.google.common.base.Ticker r0 = r0.f29072q     // Catch: java.lang.Throwable -> L72
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L72
                r11.P(r0)     // Catch: java.lang.Throwable -> L72
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f29125g     // Catch: java.lang.Throwable -> L72
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L72
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L72
                r4 = r2
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L72
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L75
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L72
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L72
                if (r3 != r13) goto L7d
                if (r6 == 0) goto L7d
                com.google.common.cache.LocalCache r3 = r11.f29120b     // Catch: java.lang.Throwable -> L72
                com.google.common.base.Equivalence r3 = r3.f29061f     // Catch: java.lang.Throwable -> L72
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L72
                if (r3 == 0) goto L7d
                com.google.common.cache.LocalCache$ValueReference r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L72
                java.lang.Object r8 = r9.get()     // Catch: java.lang.Throwable -> L72
                if (r8 == 0) goto L4a
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r12
                goto L53
            L46:
                r0 = move-exception
                r12 = r0
                r3 = r11
                goto L85
            L4a:
                boolean r12 = r9.isActive()     // Catch: java.lang.Throwable -> L72
                if (r12 == 0) goto L75
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L72
                goto L44
            L53:
                int r12 = r11.f29123e     // Catch: java.lang.Throwable -> L72
                int r12 = r12 + 1
                r11.f29123e = r12     // Catch: java.lang.Throwable -> L72
                r3 = r11
                r7 = r13
                com.google.common.cache.ReferenceEntry r12 = r3.e0(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6f
                int r13 = r3.f29121c     // Catch: java.lang.Throwable -> L6f
                int r13 = r13 + (-1)
                r0.set(r1, r12)     // Catch: java.lang.Throwable -> L6f
                r3.f29121c = r13     // Catch: java.lang.Throwable -> L6f
                r11.unlock()
                r11.O()
                return r8
            L6f:
                r0 = move-exception
            L70:
                r12 = r0
                goto L85
            L72:
                r0 = move-exception
                r3 = r11
                goto L70
            L75:
                r3 = r11
                r11.unlock()
                r11.O()
                return r2
            L7d:
                r3 = r11
                r7 = r13
                com.google.common.cache.ReferenceEntry r5 = r5.getNext()     // Catch: java.lang.Throwable -> L6f
                r13 = r7
                goto L1f
            L85:
                r11.unlock()
                r11.O()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.Y(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (r12.f29120b.f29062g.equivalent(r15, r9) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            r11 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            r13 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r9 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r10.isActive() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            r13 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            r12.f29123e++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        
            r13 = e0(r5, r6, r7, r14, r9, r10, r11);
            r14 = r12.f29121c - 1;
            r0.set(r1, r13);
            r12.f29121c = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            if (r11 != com.google.common.cache.RemovalCause.EXPLICIT) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        
            unlock();
            O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean Z(java.lang.Object r13, int r14, java.lang.Object r15) throws java.lang.Throwable {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.LocalCache r0 = r12.f29120b     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Ticker r0 = r0.f29072q     // Catch: java.lang.Throwable -> L80
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L80
                r12.P(r0)     // Catch: java.lang.Throwable -> L80
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f29125g     // Catch: java.lang.Throwable -> L80
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L80
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L80
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L80
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L92
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L80
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L80
                if (r4 != r14) goto L8a
                if (r7 == 0) goto L8a
                com.google.common.cache.LocalCache r4 = r12.f29120b     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence r4 = r4.f29061f     // Catch: java.lang.Throwable -> L80
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L80
                if (r4 == 0) goto L8a
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L80
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L80
                com.google.common.cache.LocalCache r13 = r12.f29120b     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence r13 = r13.f29062g     // Catch: java.lang.Throwable -> L80
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L52
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4e
            L4c:
                r11 = r13
                goto L5d
            L4e:
                r0 = move-exception
                r13 = r0
                r4 = r12
                goto L94
            L52:
                if (r9 != 0) goto L92
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L92
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L80
                goto L4c
            L5d:
                int r13 = r12.f29123e     // Catch: java.lang.Throwable -> L80
                int r13 = r13 + r2
                r12.f29123e = r13     // Catch: java.lang.Throwable -> L80
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r13 = r4.e0(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
                int r14 = r4.f29121c     // Catch: java.lang.Throwable -> L7d
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L7d
                r4.f29121c = r14     // Catch: java.lang.Throwable -> L7d
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L7d
                if (r11 != r13) goto L75
                goto L76
            L75:
                r2 = r3
            L76:
                r12.unlock()
                r12.O()
                return r2
            L7d:
                r0 = move-exception
            L7e:
                r13 = r0
                goto L94
            L80:
                r0 = move-exception
                r4 = r12
                goto L7e
            L83:
                r12.unlock()
                r12.O()
                return r3
            L8a:
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L7d
                r14 = r8
                goto L1f
            L92:
                r4 = r12
                goto L83
            L94:
                r12.unlock()
                r12.O()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.Z(java.lang.Object, int, java.lang.Object):boolean");
        }

        void a0(ReferenceEntry referenceEntry) {
            r(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.f29131m.remove(referenceEntry);
            this.f29132n.remove(referenceEntry);
        }

        boolean b0(ReferenceEntry referenceEntry, int i10, RemovalCause removalCause) {
            AtomicReferenceArray atomicReferenceArray = this.f29125g;
            int length = (atomicReferenceArray.length() - 1) & i10;
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry next = referenceEntry2; next != null; next = next.getNext()) {
                if (next == referenceEntry) {
                    this.f29123e++;
                    ReferenceEntry referenceEntryE0 = e0(referenceEntry2, next, next.getKey(), i10, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i11 = this.f29121c - 1;
                    atomicReferenceArray.set(length, referenceEntryE0);
                    this.f29121c = i11;
                    return true;
                }
            }
            return false;
        }

        ReferenceEntry c0(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            int i10 = this.f29121c;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryL = l(referenceEntry, next);
                if (referenceEntryL != null) {
                    next = referenceEntryL;
                } else {
                    a0(referenceEntry);
                    i10--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.f29121c = i10;
            return next;
        }

        void d() {
            h0(this.f29120b.f29072q.read());
            i0();
        }

        boolean d0(Object obj, int i10, LoadingValueReference loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f29125g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry next = referenceEntry;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() != i10 || key == null || !this.f29120b.f29061f.equivalent(obj, key)) {
                        next = next.getNext();
                    } else if (next.getValueReference() == loadingValueReference) {
                        if (loadingValueReference.isActive()) {
                            next.setValueReference(loadingValueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, c0(referenceEntry, next));
                        }
                        unlock();
                        O();
                        return true;
                    }
                }
                unlock();
                O();
                return false;
            } catch (Throwable th2) {
                unlock();
                O();
                throw th2;
            }
        }

        ReferenceEntry e0(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj, int i10, Object obj2, ValueReference valueReference, RemovalCause removalCause) {
            r(obj, i10, obj2, valueReference.getWeight(), removalCause);
            this.f29131m.remove(referenceEntry2);
            this.f29132n.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return c0(referenceEntry, referenceEntry2);
            }
            valueReference.notifyNewValue(null);
            return referenceEntry;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object f0(java.lang.Object r14, int r15, java.lang.Object r16) {
            /*
                r13 = this;
                r13.lock()
                com.google.common.cache.LocalCache r0 = r13.f29120b     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Ticker r0 = r0.f29072q     // Catch: java.lang.Throwable -> L63
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L63
                r13.P(r7)     // Catch: java.lang.Throwable -> L63
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f29125g     // Catch: java.lang.Throwable -> L63
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L63
                int r1 = r1 + (-1)
                r9 = r15 & r1
                java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L63
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L63
                r1 = r2
            L20:
                r10 = 0
                if (r1 == 0) goto L66
                java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L63
                int r5 = r1.getHash()     // Catch: java.lang.Throwable -> L63
                if (r5 != r15) goto L95
                if (r4 == 0) goto L95
                com.google.common.cache.LocalCache r5 = r13.f29120b     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Equivalence r5 = r5.f29061f     // Catch: java.lang.Throwable -> L63
                boolean r5 = r5.equivalent(r14, r4)     // Catch: java.lang.Throwable -> L63
                if (r5 == 0) goto L95
                r11 = r7
                com.google.common.cache.LocalCache$ValueReference r7 = r1.getValueReference()     // Catch: java.lang.Throwable -> L63
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L63
                if (r6 != 0) goto L6d
                boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L63
                if (r14 == 0) goto L66
                int r14 = r13.f29123e     // Catch: java.lang.Throwable -> L63
                int r14 = r14 + 1
                r13.f29123e = r14     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L63
                r5 = r15
                r3 = r1
                r1 = r13
                com.google.common.cache.ReferenceEntry r14 = r1.e0(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63
                int r2 = r13.f29121c     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + (-1)
                r0.set(r9, r14)     // Catch: java.lang.Throwable -> L63
                r13.f29121c = r2     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r0 = move-exception
                r14 = r0
                goto La0
            L66:
                r13.unlock()
                r13.O()
                return r10
            L6d:
                r0 = r1
                r4 = r6
                int r2 = r13.f29123e     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + 1
                r13.f29123e = r2     // Catch: java.lang.Throwable -> L63
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L63
                r1 = r13
                r2 = r14
                r3 = r15
                r1.r(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
                r7 = r4
                r1 = r13
                r3 = r14
                r4 = r16
                r2 = r0
                r5 = r11
                r1.k0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L63
                r13.s(r2)     // Catch: java.lang.Throwable -> L63
                r13.unlock()
                r13.O()
                return r7
            L95:
                r3 = r2
                r5 = r7
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = r2.getNext()     // Catch: java.lang.Throwable -> L63
                r1 = r2
                r2 = r3
                r7 = r5
                goto L20
            La0:
                r13.unlock()
                r13.O()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.f0(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        void g() throws Throwable {
            if (this.f29121c == 0) {
                return;
            }
            lock();
            try {
                P(this.f29120b.f29072q.read());
                AtomicReferenceArray atomicReferenceArray = this.f29125g;
                for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                    for (ReferenceEntry next = (ReferenceEntry) atomicReferenceArray.get(i10); next != null; next = next.getNext()) {
                        if (next.getValueReference().isActive()) {
                            Object key = next.getKey();
                            V v10 = next.getValueReference().get();
                            try {
                                r(key, next.getHash(), v10, next.getValueReference().getWeight(), (key == null || v10 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            } catch (Throwable th2) {
                                th = th2;
                                unlock();
                                O();
                                throw th;
                            }
                        }
                    }
                }
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    atomicReferenceArray.set(i11, null);
                }
                i();
                this.f29131m.clear();
                this.f29132n.clear();
                this.f29130l.set(0);
                this.f29123e++;
                this.f29121c = 0;
                unlock();
                O();
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean g0(java.lang.Object r17, int r18, java.lang.Object r19, java.lang.Object r20) {
            /*
                r16 = this;
                r1 = r16
                r3 = r18
                r1.lock()
                com.google.common.cache.LocalCache r0 = r1.f29120b     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Ticker r0 = r0.f29072q     // Catch: java.lang.Throwable -> L67
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L67
                r1.P(r7)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f29125g     // Catch: java.lang.Throwable -> L67
                int r2 = r0.length()     // Catch: java.lang.Throwable -> L67
                r9 = 1
                int r2 = r2 - r9
                r10 = r3 & r2
                java.lang.Object r2 = r0.get(r10)     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L67
                r4 = r2
            L23:
                r11 = 0
                if (r4 == 0) goto L69
                r5 = r4
                java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> L67
                int r6 = r5.getHash()     // Catch: java.lang.Throwable -> L67
                if (r6 != r3) goto La9
                if (r4 == 0) goto La9
                com.google.common.cache.LocalCache r6 = r1.f29120b     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence r6 = r6.f29061f     // Catch: java.lang.Throwable -> L67
                r12 = r17
                boolean r6 = r6.equivalent(r12, r4)     // Catch: java.lang.Throwable -> L67
                if (r6 == 0) goto La9
                r13 = r7
                com.google.common.cache.LocalCache$ValueReference r7 = r5.getValueReference()     // Catch: java.lang.Throwable -> L67
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L67
                if (r6 != 0) goto L70
                boolean r8 = r7.isActive()     // Catch: java.lang.Throwable -> L67
                if (r8 == 0) goto L69
                int r8 = r1.f29123e     // Catch: java.lang.Throwable -> L67
                int r8 = r8 + r9
                r1.f29123e = r8     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L67
                r15 = r5
                r5 = r3
                r3 = r15
                com.google.common.cache.ReferenceEntry r2 = r1.e0(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
                int r3 = r1.f29121c     // Catch: java.lang.Throwable -> L67
                int r3 = r3 - r9
                r0.set(r10, r2)     // Catch: java.lang.Throwable -> L67
                r1.f29121c = r3     // Catch: java.lang.Throwable -> L67
                goto L69
            L67:
                r0 = move-exception
                goto Lba
            L69:
                r1.unlock()
                r1.O()
                return r11
            L70:
                r0 = r5
                r4 = r6
                com.google.common.cache.LocalCache r2 = r1.f29120b     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence r2 = r2.f29062g     // Catch: java.lang.Throwable -> L67
                r3 = r19
                boolean r2 = r2.equivalent(r3, r4)     // Catch: java.lang.Throwable -> L67
                if (r2 == 0) goto La4
                int r2 = r1.f29123e     // Catch: java.lang.Throwable -> L67
                int r2 = r2 + r9
                r1.f29123e = r2     // Catch: java.lang.Throwable -> L67
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L67
                r3 = r18
                r2 = r12
                r1.r(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
                r1 = r16
                r3 = r17
                r4 = r20
                r2 = r0
                r5 = r13
                r1.k0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
                r1.s(r2)     // Catch: java.lang.Throwable -> L67
                r1.unlock()
                r1.O()
                return r9
            La4:
                r2 = r0
                r1.U(r2, r13)     // Catch: java.lang.Throwable -> L67
                goto L69
            La9:
                r3 = r19
                r4 = r2
                r2 = r5
                r13 = r7
                com.google.common.cache.ReferenceEntry r2 = r2.getNext()     // Catch: java.lang.Throwable -> L67
                r3 = r4
                r4 = r2
                r2 = r3
                r3 = r18
                r7 = r13
                goto L23
            Lba:
                r1.unlock()
                r1.O()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.g0(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        void h() {
            while (this.f29127i.poll() != null) {
            }
        }

        void h0(long j10) {
            if (tryLock()) {
                try {
                    o();
                    u(j10);
                    this.f29130l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void i() {
            if (this.f29120b.J()) {
                h();
            }
            if (this.f29120b.K()) {
                j();
            }
        }

        void i0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f29120b.w();
        }

        void j() {
            while (this.f29128j.poll() != null) {
            }
        }

        Object j0(ReferenceEntry referenceEntry, Object obj, int i10, Object obj2, long j10, CacheLoader cacheLoader) {
            Object objX;
            return (!this.f29120b.D() || j10 - referenceEntry.getWriteTime() <= this.f29120b.f29069n || referenceEntry.getValueReference().isLoading() || (objX = X(obj, i10, cacheLoader, true)) == null) ? obj2 : objX;
        }

        boolean k(Object obj, int i10) {
            try {
                if (this.f29121c == 0) {
                    return false;
                }
                ReferenceEntry referenceEntryD = D(obj, i10, this.f29120b.f29072q.read());
                if (referenceEntryD == null) {
                    return false;
                }
                return referenceEntryD.getValueReference().get() != null;
            } finally {
                N();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        void k0(ReferenceEntry referenceEntry, Object obj, Object obj2, long j10) {
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int iWeigh = this.f29120b.f29066k.weigh(obj, obj2);
            Preconditions.checkState(iWeigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.f29120b.f29064i.h(this, referenceEntry, obj2, iWeigh));
            W(referenceEntry, iWeigh, j10);
            valueReference.notifyNewValue(obj2);
        }

        ReferenceEntry l(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            Object key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v10 = valueReference.get();
            if (v10 == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry referenceEntryH = this.f29120b.f29073r.h(this, referenceEntry, referenceEntry2, key);
            referenceEntryH.setValueReference(valueReference.copyFor(this.f29128j, v10, referenceEntryH));
            return referenceEntryH;
        }

        boolean l0(Object obj, int i10, LoadingValueReference loadingValueReference, Object obj2) {
            lock();
            try {
                long j10 = this.f29120b.f29072q.read();
                P(j10);
                int i11 = this.f29121c + 1;
                if (i11 > this.f29124f) {
                    t();
                    i11 = this.f29121c + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f29125g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry next = referenceEntry;
                while (true) {
                    if (next == null) {
                        this.f29123e++;
                        ReferenceEntry referenceEntryL = L(obj, i10, referenceEntry);
                        k0(referenceEntryL, obj, obj2, j10);
                        atomicReferenceArray.set(length, referenceEntryL);
                        this.f29121c = i11;
                        s(referenceEntryL);
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29120b.f29061f.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v10 = valueReference.get();
                        if (loadingValueReference != valueReference && (v10 != null || valueReference == LocalCache.f29055y)) {
                            r(obj, i10, obj2, 0, RemovalCause.REPLACED);
                            unlock();
                            O();
                            return false;
                        }
                        this.f29123e++;
                        if (loadingValueReference.isActive()) {
                            r(obj, i10, v10, loadingValueReference.getWeight(), v10 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i11--;
                        }
                        ReferenceEntry referenceEntry2 = next;
                        k0(referenceEntry2, obj, obj2, j10);
                        this.f29121c = i11;
                        s(referenceEntry2);
                    } else {
                        next = next.getNext();
                    }
                }
                unlock();
                O();
                return true;
            } catch (Throwable th2) {
                unlock();
                O();
                throw th2;
            }
        }

        void m() throws Throwable {
            int i10 = 0;
            do {
                Object objPoll = this.f29127i.poll();
                if (objPoll == null) {
                    return;
                }
                this.f29120b.x((ReferenceEntry) objPoll);
                i10++;
            } while (i10 != 16);
        }

        void m0() {
            if (tryLock()) {
                try {
                    o();
                } finally {
                    unlock();
                }
            }
        }

        void n() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.f29129k.poll();
                if (referenceEntry == null) {
                    return;
                }
                if (this.f29132n.contains(referenceEntry)) {
                    this.f29132n.add(referenceEntry);
                }
            }
        }

        void o() throws Throwable {
            if (this.f29120b.J()) {
                m();
            }
            if (this.f29120b.K()) {
                q();
            }
        }

        void o0(long j10) {
            if (tryLock()) {
                try {
                    u(j10);
                } finally {
                    unlock();
                }
            }
        }

        Object p0(ReferenceEntry referenceEntry, Object obj, ValueReference valueReference) {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            Preconditions.checkState(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", obj);
            try {
                Object objWaitForValue = valueReference.waitForValue();
                if (objWaitForValue != null) {
                    V(referenceEntry, this.f29120b.f29072q.read());
                    return objWaitForValue;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
            } finally {
                this.f29133o.recordMisses(1);
            }
        }

        void q() throws Throwable {
            int i10 = 0;
            do {
                Object objPoll = this.f29128j.poll();
                if (objPoll == null) {
                    return;
                }
                this.f29120b.y((ValueReference) objPoll);
                i10++;
            } while (i10 != 16);
        }

        void r(Object obj, int i10, Object obj2, int i11, RemovalCause removalCause) {
            this.f29122d -= (long) i11;
            if (removalCause.g()) {
                this.f29133o.recordEviction();
            }
            if (this.f29120b.f29070o != LocalCache.f29056z) {
                this.f29120b.f29070o.offer(RemovalNotification.create(obj, obj2, removalCause));
            }
        }

        void s(ReferenceEntry referenceEntry) {
            if (this.f29120b.f()) {
                n();
                if (referenceEntry.getValueReference().getWeight() > this.f29126h && !b0(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f29122d > this.f29126h) {
                    ReferenceEntry referenceEntryF = F();
                    if (!b0(referenceEntryF, referenceEntryF.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        void t() {
            AtomicReferenceArray atomicReferenceArray = this.f29125g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f29121c;
            AtomicReferenceArray atomicReferenceArrayM = M(length << 1);
            this.f29124f = (atomicReferenceArrayM.length() * 3) / 4;
            int length2 = atomicReferenceArrayM.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                ReferenceEntry<K, V> next = (ReferenceEntry) atomicReferenceArray.get(i11);
                if (next != null) {
                    ReferenceEntry<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayM.set(hash, next);
                    } else {
                        ReferenceEntry<K, V> referenceEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayM.set(hash, referenceEntry);
                        while (next != referenceEntry) {
                            int hash3 = next.getHash() & length2;
                            ReferenceEntry referenceEntryL = l(next, (ReferenceEntry) atomicReferenceArrayM.get(hash3));
                            if (referenceEntryL != null) {
                                atomicReferenceArrayM.set(hash3, referenceEntryL);
                            } else {
                                a0(next);
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f29125g = atomicReferenceArrayM;
            this.f29121c = i10;
        }

        void u(long j10) {
            ReferenceEntry referenceEntry;
            ReferenceEntry referenceEntry2;
            n();
            do {
                referenceEntry = (ReferenceEntry) this.f29131m.peek();
                if (referenceEntry == null || !this.f29120b.p(referenceEntry, j10)) {
                    do {
                        referenceEntry2 = (ReferenceEntry) this.f29132n.peek();
                        if (referenceEntry2 == null || !this.f29120b.p(referenceEntry2, j10)) {
                            return;
                        }
                    } while (b0(referenceEntry2, referenceEntry2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (b0(referenceEntry, referenceEntry.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        Object v(Object obj, int i10) {
            try {
                if (this.f29121c != 0) {
                    long j10 = this.f29120b.f29072q.read();
                    ReferenceEntry referenceEntryD = D(obj, i10, j10);
                    if (referenceEntryD == null) {
                        N();
                        return null;
                    }
                    V v10 = referenceEntryD.getValueReference().get();
                    if (v10 != null) {
                        V(referenceEntryD, j10);
                        Object objJ0 = j0(referenceEntryD, referenceEntryD.getKey(), i10, v10, j10, this.f29120b.f29075t);
                        N();
                        return objJ0;
                    }
                    m0();
                }
                N();
                return null;
            } catch (Throwable th2) {
                N();
                throw th2;
            }
        }

        Object x(Object obj, int i10, CacheLoader cacheLoader) throws Throwable {
            Object obj2;
            int i11;
            CacheLoader cacheLoader2;
            ReferenceEntry referenceEntryB;
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    try {
                    } catch (ExecutionException e10) {
                        e = e10;
                    }
                } catch (ExecutionException e11) {
                    e = e11;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    N();
                    throw th3;
                }
                if (this.f29121c != 0 && (referenceEntryB = B(obj, i10)) != null) {
                    long j10 = this.f29120b.f29072q.read();
                    Object objE = E(referenceEntryB, j10);
                    if (objE != null) {
                        V(referenceEntryB, j10);
                        this.f29133o.recordHits(1);
                        Object objJ0 = j0(referenceEntryB, obj, i10, objE, j10, cacheLoader);
                        N();
                        return objJ0;
                    }
                    obj2 = obj;
                    i11 = i10;
                    cacheLoader2 = cacheLoader;
                    ValueReference<K, V> valueReference = referenceEntryB.getValueReference();
                    if (valueReference.isLoading()) {
                        Object objP0 = p0(referenceEntryB, obj2, valueReference);
                        N();
                        return objP0;
                    }
                    ExecutionException executionException = e;
                    Throwable cause = executionException.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw executionException;
                }
                obj2 = obj;
                i11 = i10;
                cacheLoader2 = cacheLoader;
                Object objK = K(obj2, i11, cacheLoader2);
                N();
                return objK;
            } catch (Throwable th4) {
                th = th4;
                Throwable th32 = th;
                N();
                throw th32;
            }
        }
    }

    static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry f29134b;

        SoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f29134b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v10, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f29134b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence g() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i10) {
                return i10 == 1 ? new StrongValueReference(obj) : new WeightedStrongValueReference(obj, i10);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence g() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i10) {
                return i10 == 1 ? new SoftValueReference(segment.f29128j, obj, referenceEntry) : new WeightedSoftValueReference(segment.f29128j, obj, referenceEntry, i10);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence g() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i10) {
                return i10 == 1 ? new WeakValueReference(segment.f29128j, obj, referenceEntry) : new WeightedWeakValueReference(segment.f29128j, obj, referenceEntry, i10);
            }
        };

        abstract Equivalence g();

        abstract ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i10);
    }

    static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f29136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ReferenceEntry f29138h;

        StrongAccessEntry(Object obj, int i10, ReferenceEntry referenceEntry) {
            super(obj, i10, referenceEntry);
            this.f29136f = Long.MAX_VALUE;
            this.f29137g = LocalCache.t();
            this.f29138h = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f29136f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f29137g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f29138h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
            this.f29136f = j10;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29137g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29138h = referenceEntry;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f29139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ReferenceEntry f29141h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile long f29142i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ReferenceEntry f29143j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        ReferenceEntry f29144k;

        StrongAccessWriteEntry(Object obj, int i10, ReferenceEntry referenceEntry) {
            super(obj, i10, referenceEntry);
            this.f29139f = Long.MAX_VALUE;
            this.f29140g = LocalCache.t();
            this.f29141h = LocalCache.t();
            this.f29142i = Long.MAX_VALUE;
            this.f29143j = LocalCache.t();
            this.f29144k = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f29139f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f29140g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f29143j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f29141h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f29144k;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f29142i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
            this.f29139f = j10;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29140g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29143j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29141h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29144k = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
            this.f29142i = j10;
        }
    }

    static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ReferenceEntry f29147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile ValueReference f29148e = LocalCache.G();

        StrongEntry(Object obj, int i10, ReferenceEntry referenceEntry) {
            this.f29145b = obj;
            this.f29146c = i10;
            this.f29147d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.f29146c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return (K) this.f29145b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.f29147d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.f29148e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.f29148e = valueReference;
        }
    }

    static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29149b;

        StrongValueReference(Object obj) {
            this.f29149b = obj;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return (V) this.f29149b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f29150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ReferenceEntry f29152h;

        StrongWriteEntry(Object obj, int i10, ReferenceEntry referenceEntry) {
            super(obj, i10, referenceEntry);
            this.f29150f = Long.MAX_VALUE;
            this.f29151g = LocalCache.t();
            this.f29152h = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f29151g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f29152h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f29150f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29151g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29152h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
            this.f29150f = j10;
        }
    }

    final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        ValueIterator() {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return (V) c().getValue();
        }
    }

    interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v10);

        V waitForValue() throws ExecutionException;
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }
    }

    static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f29155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ReferenceEntry f29156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29157g;

        WeakAccessEntry(ReferenceQueue referenceQueue, Object obj, int i10, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i10, referenceEntry);
            this.f29155e = Long.MAX_VALUE;
            this.f29156f = LocalCache.t();
            this.f29157g = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f29155e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f29156f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f29157g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
            this.f29155e = j10;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29156f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29157g = referenceEntry;
        }
    }

    static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f29158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ReferenceEntry f29159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f29161h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ReferenceEntry f29162i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ReferenceEntry f29163j;

        WeakAccessWriteEntry(ReferenceQueue referenceQueue, Object obj, int i10, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i10, referenceEntry);
            this.f29158e = Long.MAX_VALUE;
            this.f29159f = LocalCache.t();
            this.f29160g = LocalCache.t();
            this.f29161h = Long.MAX_VALUE;
            this.f29162i = LocalCache.t();
            this.f29163j = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f29158e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f29159f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f29162i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f29160g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f29163j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f29161h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j10) {
            this.f29158e = j10;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29159f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29162i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29160g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29163j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
            this.f29161h = j10;
        }
    }

    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f29164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ReferenceEntry f29165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile ValueReference f29166d;

        WeakEntry(ReferenceQueue referenceQueue, Object obj, int i10, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f29166d = LocalCache.G();
            this.f29164b = i10;
            this.f29165c = referenceEntry;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.f29164b;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.f29165c;
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.f29166d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.f29166d = valueReference;
        }

        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry f29167b;

        WeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f29167b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v10, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f29167b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f29168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ReferenceEntry f29169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ReferenceEntry f29170g;

        WeakWriteEntry(ReferenceQueue referenceQueue, Object obj, int i10, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i10, referenceEntry);
            this.f29168e = Long.MAX_VALUE;
            this.f29169f = LocalCache.t();
            this.f29170g = LocalCache.t();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f29169f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f29170g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f29168e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29169f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f29170g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j10) {
            this.f29168e = j10;
        }
    }

    static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29171c;

        WeightedSoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry, int i10) {
            super(referenceQueue, obj, referenceEntry);
            this.f29171c = i10;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v10, referenceEntry, this.f29171c);
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f29171c;
        }
    }

    static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29172c;

        WeightedStrongValueReference(Object obj, int i10) {
            super(obj);
            this.f29172c = i10;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f29172c;
        }
    }

    static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29173c;

        WeightedWeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry, int i10) {
            super(referenceQueue, obj, referenceEntry);
            this.f29173c = i10;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v10, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v10, referenceEntry, this.f29173c);
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f29173c;
        }
    }

    static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry f29174b = new AbstractReferenceEntry<K, V>() { // from class: com.google.common.cache.LocalCache.WriteQueue.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ReferenceEntry f29175b = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            ReferenceEntry f29176c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.f29175b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.f29176c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f29175b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f29176c = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j10) {
            }
        };

        WriteQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f29174b.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f29174b;
                if (nextInWriteQueue == referenceEntry) {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f29174b;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                } else {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.v(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f29174b.getNextInWriteQueue() == this.f29174b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public ReferenceEntry a(ReferenceEntry referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == WriteQueue.this.f29174b) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.b(previousInWriteQueue, nextInWriteQueue);
            LocalCache.v(referenceEntry);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.f29174b.getNextInWriteQueue(); nextInWriteQueue != this.f29174b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i10++;
            }
            return i10;
        }

        @Override // java.util.Queue
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.b(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.b(this.f29174b.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.b(referenceEntry, this.f29174b);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f29174b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f29174b) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f29174b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f29174b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }
    }

    final class WriteThroughEntry implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29180c;

        WriteThroughEntry(Object obj, Object obj2) {
            this.f29179b = obj;
            this.f29180c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f29179b.equals(entry.getKey()) && this.f29180c.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.f29179b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) this.f29180c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f29179b.hashCode() ^ this.f29180c.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) LocalCache.this.put(this.f29179b, v10);
            this.f29180c = v10;
            return v11;
        }

        public String toString() {
            return getKey() + C4240b4.j.f42668b + getValue();
        }
    }

    LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        this.f29060e = Math.min(cacheBuilder.c(), 65536);
        Strength strengthH = cacheBuilder.h();
        this.f29063h = strengthH;
        this.f29064i = cacheBuilder.o();
        this.f29061f = cacheBuilder.g();
        this.f29062g = cacheBuilder.n();
        long jI = cacheBuilder.i();
        this.f29065j = jI;
        this.f29066k = cacheBuilder.p();
        this.f29067l = cacheBuilder.d();
        this.f29068m = cacheBuilder.e();
        this.f29069n = cacheBuilder.j();
        RemovalListener removalListenerK = cacheBuilder.k();
        this.f29071p = removalListenerK;
        this.f29070o = removalListenerK == CacheBuilder.NullListener.INSTANCE ? e() : new ConcurrentLinkedQueue();
        this.f29072q = cacheBuilder.m(A());
        this.f29073r = EntryFactory.j(strengthH, H(), L());
        this.f29074s = (AbstractCache.StatsCounter) cacheBuilder.l().get();
        this.f29075t = cacheLoader;
        int iMin = Math.min(cacheBuilder.f(), 1073741824);
        if (f() && !d()) {
            iMin = (int) Math.min(iMin, jI);
        }
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f29060e && (!f() || ((long) i13) * 20 <= this.f29065j)) {
            i12++;
            i13 <<= 1;
        }
        this.f29058c = 32 - i12;
        this.f29057b = i13 - 1;
        this.f29059d = s(i13);
        int i14 = iMin / i13;
        while (i11 < (i14 * i13 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        if (f()) {
            long j10 = this.f29065j;
            long j11 = i13;
            long j12 = (j10 / j11) + 1;
            long j13 = j10 % j11;
            while (true) {
                Segment[] segmentArr = this.f29059d;
                if (i10 >= segmentArr.length) {
                    return;
                }
                if (i10 == j13) {
                    j12--;
                }
                segmentArr[i10] = c(i11, j12, (AbstractCache.StatsCounter) cacheBuilder.l().get());
                i10++;
            }
        } else {
            while (true) {
                Segment[] segmentArr2 = this.f29059d;
                if (i10 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i10] = c(i11, -1L, (AbstractCache.StatsCounter) cacheBuilder.l().get());
                i10++;
            }
        }
    }

    static int E(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    static ValueReference G() {
        return f29055y;
    }

    static void a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    static void b(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    static Queue e() {
        return f29056z;
    }

    static ReferenceEntry t() {
        return NullEntry.INSTANCE;
    }

    static void u(ReferenceEntry referenceEntry) {
        ReferenceEntry<K, V> referenceEntryT = t();
        referenceEntry.setNextInAccessQueue(referenceEntryT);
        referenceEntry.setPreviousInAccessQueue(referenceEntryT);
    }

    static void v(ReferenceEntry referenceEntry) {
        ReferenceEntry<K, V> referenceEntryT = t();
        referenceEntry.setNextInWriteQueue(referenceEntryT);
        referenceEntry.setPreviousInWriteQueue(referenceEntryT);
    }

    boolean A() {
        return B() || z();
    }

    boolean B() {
        return h() || D();
    }

    void C(Object obj) {
        int iN = n(Preconditions.checkNotNull(obj));
        F(iN).X(obj, iN, this.f29075t, false);
    }

    boolean D() {
        return this.f29069n > 0;
    }

    Segment F(int i10) {
        return this.f29059d[(i10 >>> this.f29058c) & this.f29057b];
    }

    boolean H() {
        return I() || z();
    }

    boolean I() {
        return g() || f();
    }

    boolean J() {
        return this.f29063h != Strength.STRONG;
    }

    boolean K() {
        return this.f29064i != Strength.STRONG;
    }

    boolean L() {
        return M() || B();
    }

    boolean M() {
        return h();
    }

    Segment c(int i10, long j10, AbstractCache.StatsCounter statsCounter) {
        return new Segment(this, i10, j10, statsCounter);
    }

    public void cleanUp() {
        for (Segment segment : this.f29059d) {
            segment.d();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (Segment segment : this.f29059d) {
            segment.g();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iN = n(obj);
        return F(iN).k(obj, iN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        int i10 = 0;
        if (obj == null) {
            return false;
        }
        long j10 = this.f29072q.read();
        Segment[] segmentArr = this.f29059d;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = segmentArr.length;
            long j12 = 0;
            int i12 = i10 == true ? 1 : 0;
            while (i12 < length) {
                Segment segment = segmentArr[i12];
                int i13 = segment.f29121c;
                AtomicReferenceArray atomicReferenceArray = segment.f29125g;
                int i14 = i10;
                while (i14 < atomicReferenceArray.length()) {
                    ReferenceEntry next = (ReferenceEntry) atomicReferenceArray.get(i14);
                    while (next != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object objE = segment.E(next, j10);
                        ReferenceEntry referenceEntry = next;
                        if (objE != null && this.f29062g.equivalent(obj, objE)) {
                            return true;
                        }
                        next = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                    }
                    i14++;
                }
                j12 += (long) segment.f29123e;
                i12++;
                i10 = i14;
            }
            boolean z10 = i10;
            Segment[] segmentArr3 = segmentArr;
            if (j12 == j11) {
                return z10;
            }
            i11++;
            j11 = j12;
            i10 = z10 ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i10 == true ? 1 : 0;
    }

    boolean d() {
        return this.f29066k != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f29078w;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f29078w = entrySet;
        return entrySet;
    }

    boolean f() {
        return this.f29065j >= 0;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    boolean g() {
        return this.f29067l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iN = n(obj);
        return (V) F(iN).v(obj, iN);
    }

    public V getIfPresent(Object obj) {
        int iN = n(Preconditions.checkNotNull(obj));
        V v10 = (V) F(iN).v(obj, iN);
        if (v10 == null) {
            this.f29074s.recordMisses(1);
            return v10;
        }
        this.f29074s.recordHits(1);
        return v10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    boolean h() {
        return this.f29068m > 0;
    }

    Object i(Object obj, CacheLoader cacheLoader) {
        int iN = n(Preconditions.checkNotNull(obj));
        return F(iN).x(obj, iN, cacheLoader);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment[] segmentArr = this.f29059d;
        long j10 = 0;
        for (Segment segment : segmentArr) {
            if (segment.f29121c != 0) {
                return false;
            }
            j10 += (long) segment.f29123e;
        }
        if (j10 == 0) {
            return true;
        }
        for (Segment segment2 : segmentArr) {
            if (segment2.f29121c != 0) {
                return false;
            }
            j10 -= (long) segment2.f29123e;
        }
        return j10 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap j(Iterable iterable) {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet linkedHashSetNewLinkedHashSet = Sets.newLinkedHashSet();
        int i10 = 0;
        int i11 = 0;
        for (Object obj : iterable) {
            V v10 = get(obj);
            if (!linkedHashMapNewLinkedHashMap.containsKey(obj)) {
                linkedHashMapNewLinkedHashMap.put(obj, v10);
                if (v10 == null) {
                    i11++;
                    linkedHashSetNewLinkedHashSet.add(obj);
                } else {
                    i10++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    Map mapQ = q(DesugarCollections.unmodifiableSet(linkedHashSetNewLinkedHashSet), this.f29075t);
                    for (Object obj2 : linkedHashSetNewLinkedHashSet) {
                        Object obj3 = mapQ.get(obj2);
                        if (obj3 == null) {
                            throw new CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i11--;
                        linkedHashMapNewLinkedHashMap.put(obj4, i(obj4, this.f29075t));
                    }
                }
            }
            ImmutableMap immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
            this.f29074s.recordHits(i10);
            this.f29074s.recordMisses(i11);
            return immutableMapCopyOf;
        } catch (Throwable th2) {
            this.f29074s.recordHits(i10);
            this.f29074s.recordMisses(i11);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap k(Iterable iterable) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i10 = 0;
        int i11 = 0;
        for (Object obj : iterable) {
            V v10 = get(obj);
            if (v10 == null) {
                i11++;
            } else {
                builder.put(obj, v10);
                i10++;
            }
        }
        this.f29074s.recordHits(i10);
        this.f29074s.recordMisses(i11);
        return builder.buildKeepingLast();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f29076u;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f29076u = keySet;
        return keySet;
    }

    Object l(ReferenceEntry referenceEntry, long j10) {
        V v10;
        if (referenceEntry.getKey() == null || (v10 = referenceEntry.getValueReference().get()) == null || p(referenceEntry, j10)) {
            return null;
        }
        return v10;
    }

    Object m(Object obj) {
        return i(obj, this.f29075t);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    int n(Object obj) {
        return E(this.f29061f.hash(obj));
    }

    void o(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    boolean p(ReferenceEntry referenceEntry, long j10) {
        Preconditions.checkNotNull(referenceEntry);
        if (!g() || j10 - referenceEntry.getAccessTime() < this.f29067l) {
            return h() && j10 - referenceEntry.getWriteTime() >= this.f29068m;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iN = n(k10);
        return (V) F(iN).Q(k10, iN, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iN = n(k10);
        return (V) F(iN).Q(k10, iN, v10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.util.Map q(java.util.Set r7, com.google.common.cache.CacheLoader r8) throws java.lang.Throwable {
        /*
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createStarted()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lb4
            if (r7 == 0) goto L6c
            r0.stop()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f29074s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadSuccess(r0)
            return r7
        L4a:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f29074s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f29074s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = r2
            goto Lb7
        L91:
            r7 = move-exception
            com.google.common.util.concurrent.ExecutionError r8 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f29074s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadException(r0)
        Lc4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.q(java.util.Set, com.google.common.cache.CacheLoader):java.util.Map");
    }

    long r() {
        long jMax = 0;
        for (Segment segment : this.f29059d) {
            jMax += (long) Math.max(0, segment.f29121c);
        }
        return jMax;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iN = n(obj);
        return (V) F(iN).Y(obj, iN);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public boolean replace(K k10, V v10, V v11) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v11);
        if (v10 == null) {
            return false;
        }
        int iN = n(k10);
        return F(iN).g0(k10, iN, v10, v11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    final Segment[] s(int i10) {
        return new Segment[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(r());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f29077v;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f29077v = values;
        return values;
    }

    void w() {
        while (true) {
            RemovalNotification<K, V> removalNotification = (RemovalNotification) this.f29070o.poll();
            if (removalNotification == null) {
                return;
            }
            try {
                this.f29071p.onRemoval(removalNotification);
            } catch (Throwable th2) {
                f29054x.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    void x(ReferenceEntry referenceEntry) throws Throwable {
        int hash = referenceEntry.getHash();
        F(hash).S(referenceEntry, hash);
    }

    void y(ValueReference valueReference) throws Throwable {
        ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        F(hash).T(entry.getKey(), hash, valueReference);
    }

    boolean z() {
        return g();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iN = n(obj);
        return F(iN).Z(obj, iN, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public V replace(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iN = n(k10);
        return (V) F(iN).f0(k10, iN, v10);
    }
}
