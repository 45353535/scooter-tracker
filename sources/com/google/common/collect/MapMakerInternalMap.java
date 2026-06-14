package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final WeakValueReference f29855k = new WeakValueReference<Object, Object, DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<Object, Object, DummyInternalEntry> copyFor(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public DummyInternalEntry getEntry() {
            return null;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f29856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f29857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Segment[] f29858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f29859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Equivalence f29860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient InternalEntryHelper f29861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient Set f29862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient Collection f29863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    transient Set f29864j;

    static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Strength f29865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Strength f29866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Equivalence f29867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Equivalence f29868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f29869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient ConcurrentMap f29870g;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, Equivalence equivalence2, int i10, ConcurrentMap concurrentMap) {
            this.f29865b = strength;
            this.f29866c = strength2;
            this.f29867d = equivalence;
            this.f29868e = equivalence2;
            this.f29869f = i10;
            this.f29870g = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public ConcurrentMap n() {
            return this.f29870g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void i(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f29870g.put(object, objectInputStream.readObject());
            }
        }

        MapMaker j(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().initialCapacity(objectInputStream.readInt()).g(this.f29865b).h(this.f29866c).f(this.f29867d).concurrencyLevel(this.f29869f);
        }

        void k(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f29870g.size());
            for (Map.Entry<K, V> entry : this.f29870g.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29872c;

        AbstractStrongKeyEntry(Object obj, int i10) {
            this.f29871b = obj;
            this.f29872c = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.f29872c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return (K) this.f29871b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f29873b;

        AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object obj, int i10) {
            super(obj, referenceQueue);
            this.f29873b = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.f29873b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return null;
        }
    }

    static final class CleanupMapTask implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference f29874b;

        public CleanupMapTask(MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
            this.f29874b = new WeakReference(mapMakerInternalMap);
        }

        @Override // java.lang.Runnable
        public void run() {
            MapMakerInternalMap mapMakerInternalMap = (MapMakerInternalMap) this.f29874b.get();
            if (mapMakerInternalMap == null) {
                throw new CancellationException();
            }
            for (Segment segment : mapMakerInternalMap.f29858d) {
                segment.K();
            }
        }
    }

    static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public DummyInternalEntry getNext() {
            throw new AssertionError();
        }
    }

    final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        EntryIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.o().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29878c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Segment f29879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AtomicReferenceArray f29880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        InternalEntry f29881f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        WriteThroughEntry f29882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        WriteThroughEntry f29883h;

        HashIterator() {
            this.f29877b = MapMakerInternalMap.this.f29858d.length - 1;
            a();
        }

        final void a() {
            this.f29882g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f29877b;
                if (i10 < 0) {
                    return;
                }
                Segment[] segmentArr = MapMakerInternalMap.this.f29858d;
                this.f29877b = i10 - 1;
                Segment segment = segmentArr[i10];
                this.f29879d = segment;
                if (segment.f29888c != 0) {
                    this.f29880e = this.f29879d.f29891f;
                    this.f29878c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(InternalEntry internalEntry) {
            try {
                Object key = internalEntry.getKey();
                Object objG = MapMakerInternalMap.this.g(internalEntry);
                if (objG == null) {
                    this.f29879d.A();
                    return false;
                }
                this.f29882g = new WriteThroughEntry(key, objG);
                this.f29879d.A();
                return true;
            } catch (Throwable th2) {
                this.f29879d.A();
                throw th2;
            }
        }

        WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.f29882g;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f29883h = writeThroughEntry;
            a();
            return this.f29883h;
        }

        boolean d() {
            InternalEntry internalEntry = this.f29881f;
            if (internalEntry == null) {
                return false;
            }
            while (true) {
                this.f29881f = internalEntry.getNext();
                InternalEntry internalEntry2 = this.f29881f;
                if (internalEntry2 == null) {
                    return false;
                }
                if (b(internalEntry2)) {
                    return true;
                }
                internalEntry = this.f29881f;
            }
        }

        boolean e() {
            while (true) {
                int i10 = this.f29878c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f29880e;
                this.f29878c = i10 - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i10);
                this.f29881f = internalEntry;
                if (internalEntry != null && (b(internalEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29882g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.e(this.f29883h != null);
            MapMakerInternalMap.this.remove(this.f29883h.getKey());
            this.f29883h = null;
        }
    }

    interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s10, E e10, E e11);

        Strength keyStrength();

        E newEntry(S s10, K k10, int i10, E e10);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10);

        void setValue(S s10, E e10, V v10);

        Strength valueStrength();
    }

    final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        KeyIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
            return (K) c().getKey();
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MapMakerInternalMap f29887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f29888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f29890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile AtomicReferenceArray f29891f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicInteger f29892g = new AtomicInteger();

        Segment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            this.f29887b = mapMakerInternalMap;
            s(x(i10));
        }

        static boolean t(InternalEntry internalEntry) {
            return internalEntry.getValue() == null;
        }

        void A() {
            if ((this.f29892g.incrementAndGet() & 63) == 0) {
                K();
            }
        }

        void B() {
            L();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        Object C(Object obj, int i10, Object obj2, boolean z10) {
            lock();
            try {
                B();
                int i11 = this.f29888c + 1;
                if (i11 > this.f29890e) {
                    l();
                    i11 = this.f29888c + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29887b.f29860f.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            this.f29889d++;
                            N(next, obj2);
                            this.f29888c = this.f29888c;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return value;
                        }
                        this.f29889d++;
                        N(next, obj2);
                        unlock();
                        return value;
                    }
                }
                this.f29889d++;
                InternalEntry internalEntryNewEntry = this.f29887b.f29861g.newEntry(M(), obj, i10, internalEntry);
                N(internalEntryNewEntry, obj2);
                atomicReferenceArray.set(length, internalEntryNewEntry);
                this.f29888c = i11;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        boolean D(InternalEntry internalEntry, int i10) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = i10 & (atomicReferenceArray.length() - 1);
                InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry2; next != null; next = next.getNext()) {
                    if (next == internalEntry) {
                        this.f29889d++;
                        InternalEntry internalEntryH = H(internalEntry2, next);
                        int i11 = this.f29888c - 1;
                        atomicReferenceArray.set(length, internalEntryH);
                        this.f29888c = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        boolean E(Object obj, int i10, WeakValueReference weakValueReference) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29887b.f29860f.equivalent(obj, key)) {
                        if (((WeakValueEntry) next).getValueReference() != weakValueReference) {
                            return false;
                        }
                        this.f29889d++;
                        InternalEntry internalEntryH = H(internalEntry, next);
                        int i11 = this.f29888c - 1;
                        atomicReferenceArray.set(length, internalEntryH);
                        this.f29888c = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        Object F(Object obj, int i10) {
            lock();
            try {
                B();
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29887b.f29860f.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value == null && !t(next)) {
                            return null;
                        }
                        this.f29889d++;
                        InternalEntry internalEntryH = H(internalEntry, next);
                        int i11 = this.f29888c - 1;
                        atomicReferenceArray.set(length, internalEntryH);
                        this.f29888c = i11;
                        return value;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f29887b.o().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (t(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f29889d++;
            r9 = H(r3, r4);
            r10 = r8.f29888c - 1;
            r0.set(r1, r9);
            r8.f29888c = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean G(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.B()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r8.f29891f     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                com.google.common.collect.MapMakerInternalMap r7 = r8.f29887b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r7 = r7.f29860f     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap r10 = r8.f29887b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r10 = r10.o()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = t(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f29889d     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f29889d = r9     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.H(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f29888c     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f29888c = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.G(java.lang.Object, int, java.lang.Object):boolean");
        }

        InternalEntry H(InternalEntry internalEntry, InternalEntry internalEntry2) {
            int i10 = this.f29888c;
            InternalEntry next = internalEntry2.getNext();
            while (internalEntry != internalEntry2) {
                InternalEntry internalEntryI = i(internalEntry, next);
                if (internalEntryI != null) {
                    next = internalEntryI;
                } else {
                    i10--;
                }
                internalEntry = internalEntry.getNext();
            }
            this.f29888c = i10;
            return next;
        }

        Object I(Object obj, int i10, Object obj2) {
            lock();
            try {
                B();
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29887b.f29860f.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            this.f29889d++;
                            N(next, obj2);
                            return value;
                        }
                        if (t(next)) {
                            this.f29889d++;
                            InternalEntry internalEntryH = H(internalEntry, next);
                            int i11 = this.f29888c - 1;
                            atomicReferenceArray.set(length, internalEntryH);
                            this.f29888c = i11;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean J(Object obj, int i10, Object obj2, Object obj3) {
            lock();
            try {
                B();
                AtomicReferenceArray atomicReferenceArray = this.f29891f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry next = internalEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f29887b.f29860f.equivalent(obj, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.f29887b.o().equivalent(obj2, value)) {
                                return false;
                            }
                            this.f29889d++;
                            N(next, obj3);
                            return true;
                        }
                        if (t(next)) {
                            this.f29889d++;
                            InternalEntry internalEntryH = H(internalEntry, next);
                            int i11 = this.f29888c - 1;
                            atomicReferenceArray.set(length, internalEntryH);
                            this.f29888c = i11;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void K() {
            L();
        }

        void L() {
            if (tryLock()) {
                try {
                    v();
                    this.f29892g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract Segment M();

        /* JADX WARN: Multi-variable type inference failed */
        void N(InternalEntry internalEntry, Object obj) {
            this.f29887b.f29861g.setValue(M(), internalEntry, obj);
        }

        void O() {
            if (tryLock()) {
                try {
                    v();
                } finally {
                    unlock();
                }
            }
        }

        void d() {
            if (this.f29888c != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.f29891f;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    u();
                    this.f29892g.set(0);
                    this.f29889d++;
                    this.f29888c = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        void g(ReferenceQueue referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        boolean h(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f29888c == 0) {
                    return false;
                }
                InternalEntry internalEntryQ = q(obj, i10);
                if (internalEntryQ != null) {
                    if (internalEntryQ.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                A();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        InternalEntry i(InternalEntry internalEntry, InternalEntry internalEntry2) {
            return this.f29887b.f29861g.copy(M(), internalEntry, internalEntry2);
        }

        void j(ReferenceQueue referenceQueue) {
            int i10 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                this.f29887b.j((InternalEntry) objPoll);
                i10++;
            } while (i10 != 16);
        }

        void k(ReferenceQueue referenceQueue) {
            int i10 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                this.f29887b.k((WeakValueReference) objPoll);
                i10++;
            } while (i10 != 16);
        }

        void l() {
            AtomicReferenceArray atomicReferenceArray = this.f29891f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f29888c;
            AtomicReferenceArray atomicReferenceArrayX = x(length << 1);
            this.f29890e = (atomicReferenceArrayX.length() * 3) / 4;
            int length2 = atomicReferenceArrayX.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                InternalEntry next = (InternalEntry) atomicReferenceArray.get(i11);
                if (next != null) {
                    InternalEntry next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayX.set(hash, next);
                    } else {
                        InternalEntry internalEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                internalEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayX.set(hash, internalEntry);
                        while (next != internalEntry) {
                            int hash3 = next.getHash() & length2;
                            InternalEntry internalEntryI = i(next, (InternalEntry) atomicReferenceArrayX.get(hash3));
                            if (internalEntryI != null) {
                                atomicReferenceArrayX.set(hash3, internalEntryI);
                            } else {
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f29891f = atomicReferenceArrayX;
            this.f29888c = i10;
        }

        Object m(Object obj, int i10) {
            try {
                InternalEntry internalEntryQ = q(obj, i10);
                if (internalEntryQ == null) {
                    A();
                    return null;
                }
                Object value = internalEntryQ.getValue();
                if (value == null) {
                    O();
                }
                return value;
            } finally {
                A();
            }
        }

        InternalEntry n(Object obj, int i10) {
            if (this.f29888c == 0) {
                return null;
            }
            for (InternalEntry internalEntryO = o(i10); internalEntryO != null; internalEntryO = internalEntryO.getNext()) {
                if (internalEntryO.getHash() == i10) {
                    Object key = internalEntryO.getKey();
                    if (key == null) {
                        O();
                    } else if (this.f29887b.f29860f.equivalent(obj, key)) {
                        return internalEntryO;
                    }
                }
            }
            return null;
        }

        InternalEntry o(int i10) {
            return (InternalEntry) this.f29891f.get(i10 & (r0.length() - 1));
        }

        InternalEntry q(Object obj, int i10) {
            return n(obj, i10);
        }

        Object r(InternalEntry internalEntry) {
            if (internalEntry.getKey() == null) {
                O();
                return null;
            }
            Object value = internalEntry.getValue();
            if (value != null) {
                return value;
            }
            O();
            return null;
        }

        void s(AtomicReferenceArray atomicReferenceArray) {
            this.f29890e = (atomicReferenceArray.length() * 3) / 4;
            this.f29891f = atomicReferenceArray;
        }

        void u() {
        }

        void v() {
        }

        AtomicReferenceArray x(int i10) {
            return new AtomicReferenceArray(i10);
        }
    }

    private static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        SerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, Equivalence equivalence2, int i10, ConcurrentMap concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i10, concurrentMap);
        }

        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f29870g = j(objectInputStream).makeMap();
            i(objectInputStream);
        }

        private Object readResolve() {
            return this.f29870g;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            k(objectOutputStream);
        }
    }

    enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence g() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence g() {
                return Equivalence.identity();
            }
        };

        abstract Equivalence g();
    }

    static class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29894a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29894a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueEntry<K> copy(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
                return newEntry((StrongKeyDummyValueSegment<Object>) strongKeyDummyValueSegment, strongKeyDummyValueEntry.f29871b, strongKeyDummyValueEntry.f29872c, (StrongKeyDummyValueEntry<Object>) strongKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueEntry<K> newEntry(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k10, int i10, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                return strongKeyDummyValueEntry == null ? new StrongKeyDummyValueEntry<>(k10, i10) : new LinkedStrongKeyDummyValueEntry(k10, i10, strongKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i10);
            }
        }

        private static final class LinkedStrongKeyDummyValueEntry<K> extends StrongKeyDummyValueEntry<K> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final StrongKeyDummyValueEntry f29895d;

            LinkedStrongKeyDummyValueEntry(Object obj, int i10, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
                super(obj, i10);
                this.f29895d = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyDummyValueEntry<K> getNext() {
                return this.f29895d;
            }
        }

        private StrongKeyDummyValueEntry(Object obj, int i10) {
            super(obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        StrongKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public StrongKeyDummyValueSegment M() {
            return this;
        }

        public StrongKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (StrongKeyDummyValueEntry) internalEntry;
        }
    }

    static class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f29896d;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29897a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29897a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntryNewEntry = newEntry((StrongKeyStrongValueSegment<Object, V>) strongKeyStrongValueSegment, strongKeyStrongValueEntry.f29871b, strongKeyStrongValueEntry.f29872c, (StrongKeyStrongValueEntry<Object, V>) strongKeyStrongValueEntry2);
                ((StrongKeyStrongValueEntry) strongKeyStrongValueEntryNewEntry).f29896d = ((StrongKeyStrongValueEntry) strongKeyStrongValueEntry).f29896d;
                return strongKeyStrongValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueEntry<K, V> newEntry(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k10, int i10, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                return strongKeyStrongValueEntry == null ? new StrongKeyStrongValueEntry<>(k10, i10) : new LinkedStrongKeyStrongValueEntry(k10, i10, strongKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v10) {
                ((StrongKeyStrongValueEntry) strongKeyStrongValueEntry).f29896d = v10;
            }
        }

        private static final class LinkedStrongKeyStrongValueEntry<K, V> extends StrongKeyStrongValueEntry<K, V> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final StrongKeyStrongValueEntry f29898e;

            LinkedStrongKeyStrongValueEntry(Object obj, int i10, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
                super(obj, i10);
                this.f29898e = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyStrongValueEntry<K, V> getNext() {
                return this.f29898e;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return (V) this.f29896d;
        }

        private StrongKeyStrongValueEntry(Object obj, int i10) {
            super(obj, i10);
            this.f29896d = null;
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public StrongKeyStrongValueSegment M() {
            return this;
        }

        public StrongKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyStrongValueEntry) internalEntry;
        }
    }

    static class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile WeakValueReference f29899d;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29900a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29900a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueEntry<K, V> copy(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                if (Segment.t(strongKeyWeakValueEntry)) {
                    return null;
                }
                StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryNewEntry = newEntry((StrongKeyWeakValueSegment<Object, V>) strongKeyWeakValueSegment, strongKeyWeakValueEntry.f29871b, strongKeyWeakValueEntry.f29872c, (StrongKeyWeakValueEntry<Object, V>) strongKeyWeakValueEntry2);
                ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryNewEntry).f29899d = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).f29899d.copyFor(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f29902h, strongKeyWeakValueEntryNewEntry);
                return strongKeyWeakValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueEntry<K, V> newEntry(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k10, int i10, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                return strongKeyWeakValueEntry == null ? new StrongKeyWeakValueEntry<>(k10, i10) : new LinkedStrongKeyWeakValueEntry(k10, i10, strongKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v10) {
                WeakValueReference weakValueReference = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).f29899d;
                ((StrongKeyWeakValueEntry) strongKeyWeakValueEntry).f29899d = new WeakValueReferenceImpl(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f29902h, v10, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }
        }

        private static final class LinkedStrongKeyWeakValueEntry<K, V> extends StrongKeyWeakValueEntry<K, V> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final StrongKeyWeakValueEntry f29901e;

            LinkedStrongKeyWeakValueEntry(Object obj, int i10, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
                super(obj, i10);
                this.f29901e = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public StrongKeyWeakValueEntry<K, V> getNext() {
                return this.f29901e;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return (V) this.f29899d.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.f29899d;
        }

        private StrongKeyWeakValueEntry(Object obj, int i10) {
            super(obj, i10);
            this.f29899d = MapMakerInternalMap.n();
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue f29902h;

        StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f29902h = new ReferenceQueue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public StrongKeyWeakValueSegment M() {
            return this;
        }

        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v10) {
            return new WeakValueReferenceImpl(this.f29902h, v10, castForTesting((InternalEntry) internalEntry));
        }

        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryCastForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).f29899d;
            ((StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).f29899d = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void u() {
            g(this.f29902h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            k(this.f29902h);
        }

        public StrongKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyWeakValueEntry) internalEntry;
        }
    }

    interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        ValueIterator() {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
            return (V) c().getValue();
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    static class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29905a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29905a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueEntry<K> copy(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
                K key = weakKeyDummyValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                return newEntry((WeakKeyDummyValueSegment) weakKeyDummyValueSegment, (Object) key, weakKeyDummyValueEntry.f29873b, (WeakKeyDummyValueEntry) weakKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueEntry<K> newEntry(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k10, int i10, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                return weakKeyDummyValueEntry == null ? new WeakKeyDummyValueEntry<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f29907h, k10, i10) : new LinkedWeakKeyDummyValueEntry(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f29907h, k10, i10, weakKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i10) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i10);
            }
        }

        private static final class LinkedWeakKeyDummyValueEntry<K> extends WeakKeyDummyValueEntry<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final WeakKeyDummyValueEntry f29906c;

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            private LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i10, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
                super(referenceQueue, obj, i10);
                this.f29906c = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyDummyValueEntry<K> getNext() {
                return this.f29906c;
            }
        }

        private WeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i10) {
            super(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue f29907h;

        WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f29907h = new ReferenceQueue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public WeakKeyDummyValueSegment M() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void u() {
            g(this.f29907h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            j(this.f29907h);
        }

        public WeakKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (WeakKeyDummyValueEntry) internalEntry;
        }
    }

    static class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f29908c;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29909a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29909a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueEntry<K, V> copy(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                K key = weakKeyStrongValueEntry.getKey();
                if (key == null) {
                    return null;
                }
                WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntryNewEntry = newEntry((WeakKeyStrongValueSegment) weakKeyStrongValueSegment, (Object) key, weakKeyStrongValueEntry.f29873b, (WeakKeyStrongValueEntry) weakKeyStrongValueEntry2);
                ((WeakKeyStrongValueEntry) weakKeyStrongValueEntryNewEntry).f29908c = ((WeakKeyStrongValueEntry) weakKeyStrongValueEntry).f29908c;
                return weakKeyStrongValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueEntry<K, V> newEntry(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k10, int i10, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                return weakKeyStrongValueEntry == null ? new WeakKeyStrongValueEntry<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f29911h, k10, i10) : new LinkedWeakKeyStrongValueEntry(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f29911h, k10, i10, weakKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v10) {
                ((WeakKeyStrongValueEntry) weakKeyStrongValueEntry).f29908c = v10;
            }
        }

        private static final class LinkedWeakKeyStrongValueEntry<K, V> extends WeakKeyStrongValueEntry<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final WeakKeyStrongValueEntry f29910d;

            private LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i10, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
                super(referenceQueue, obj, i10);
                this.f29910d = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyStrongValueEntry<K, V> getNext() {
                return this.f29910d;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return (V) this.f29908c;
        }

        private WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i10) {
            super(referenceQueue, obj, i10);
            this.f29908c = null;
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue f29911h;

        WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f29911h = new ReferenceQueue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public WeakKeyStrongValueSegment M() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void u() {
            g(this.f29911h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            j(this.f29911h);
        }

        public WeakKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyStrongValueEntry) internalEntry;
        }
    }

    static class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile WeakValueReference f29912c;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Helper f29913a = new Helper();

            Helper() {
            }

            static Helper a() {
                return f29913a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueEntry<K, V> copy(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                K key = weakKeyWeakValueEntry.getKey();
                if (key == null || Segment.t(weakKeyWeakValueEntry)) {
                    return null;
                }
                WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryNewEntry = newEntry((WeakKeyWeakValueSegment) weakKeyWeakValueSegment, (Object) key, weakKeyWeakValueEntry.f29873b, (WeakKeyWeakValueEntry) weakKeyWeakValueEntry2);
                ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryNewEntry).f29912c = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).f29912c.copyFor(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f29916i, weakKeyWeakValueEntryNewEntry);
                return weakKeyWeakValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueEntry<K, V> newEntry(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k10, int i10, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                return weakKeyWeakValueEntry == null ? new WeakKeyWeakValueEntry<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f29915h, k10, i10) : new LinkedWeakKeyWeakValueEntry(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f29915h, k10, i10, weakKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v10) {
                WeakValueReference weakValueReference = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).f29912c;
                ((WeakKeyWeakValueEntry) weakKeyWeakValueEntry).f29912c = new WeakValueReferenceImpl(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f29916i, v10, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }
        }

        private static final class LinkedWeakKeyWeakValueEntry<K, V> extends WeakKeyWeakValueEntry<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final WeakKeyWeakValueEntry f29914d;

            LinkedWeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i10, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
                super(referenceQueue, obj, i10);
                this.f29914d = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public WeakKeyWeakValueEntry<K, V> getNext() {
                return this.f29914d;
            }
        }

        WeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i10) {
            super(referenceQueue, obj, i10);
            this.f29912c = MapMakerInternalMap.n();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return (V) this.f29912c.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.f29912c;
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue f29915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ReferenceQueue f29916i;

        WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f29915h = new ReferenceQueue();
            this.f29916i = new ReferenceQueue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public WeakKeyWeakValueSegment M() {
            return this;
        }

        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v10) {
            return new WeakValueReferenceImpl(this.f29916i, v10, castForTesting((InternalEntry) internalEntry));
        }

        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryCastForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).f29912c;
            ((WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).f29912c = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void u() {
            g(this.f29915h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            j(this.f29915h);
            k(this.f29916i);
        }

        public WeakKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyWeakValueEntry) internalEntry;
        }
    }

    interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference<K, V, E> getValueReference();
    }

    interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e10);

        V get();

        E getEntry();
    }

    static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final InternalEntry f29917b;

        WeakValueReferenceImpl(ReferenceQueue referenceQueue, Object obj, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.f29917b = internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e10) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
            return (E) this.f29917b;
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29919c;

        WriteThroughEntry(Object obj, Object obj2) {
            this.f29918b = obj;
            this.f29919c = obj2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f29918b.equals(entry.getKey()) && this.f29919c.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return (K) this.f29918b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return (V) this.f29919c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.f29918b.hashCode() ^ this.f29919c.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) MapMakerInternalMap.this.put(this.f29918b, v10);
            this.f29919c = v10;
            return v11;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper internalEntryHelper) {
        this.f29859e = Math.min(mapMaker.a(), 65536);
        this.f29860f = mapMaker.c();
        this.f29861g = internalEntryHelper;
        int iMin = Math.min(mapMaker.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f29859e) {
            i12++;
            i13 <<= 1;
        }
        this.f29857c = 32 - i12;
        this.f29856b = i13 - 1;
        this.f29858d = i(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.f29858d;
            if (i10 >= segmentArr.length) {
                return;
            }
            segmentArr[i10] = b(i11);
            i10++;
        }
    }

    static MapMakerInternalMap a(MapMaker mapMaker) {
        Strength strengthD = mapMaker.d();
        Strength strength = Strength.STRONG;
        if (strengthD == strength && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, StrongKeyStrongValueEntry.Helper.a());
        }
        if (mapMaker.d() == strength && mapMaker.e() == Strength.WEAK) {
            return new MapMakerInternalMap(mapMaker, StrongKeyWeakValueEntry.Helper.a());
        }
        Strength strengthD2 = mapMaker.d();
        Strength strength2 = Strength.WEAK;
        if (strengthD2 == strength2 && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, WeakKeyStrongValueEntry.Helper.a());
        }
        if (mapMaker.d() == strength2 && mapMaker.e() == strength2) {
            return new MapMakerInternalMap(mapMaker, WeakKeyWeakValueEntry.Helper.a());
        }
        throw new AssertionError();
    }

    static MapMakerInternalMap c(MapMaker mapMaker) {
        Strength strengthD = mapMaker.d();
        Strength strength = Strength.STRONG;
        if (strengthD == strength && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, StrongKeyDummyValueEntry.Helper.a());
        }
        Strength strengthD2 = mapMaker.d();
        Strength strength2 = Strength.WEAK;
        if (strengthD2 == strength2 && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, WeakKeyDummyValueEntry.Helper.a());
        }
        if (mapMaker.e() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    static int l(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    static WeakValueReference n() {
        return f29855k;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    Segment b(int i10) {
        return this.f29861g.newSegment(this, i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment segment : this.f29858d) {
            segment.d();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
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
        int iH = h(obj);
        return m(iH).h(obj, iH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        Segment[] segmentArr = this.f29858d;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = segmentArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                Segment segment = segmentArr[r10];
                int i11 = segment.f29888c;
                ?? r12 = segment.f29891f;
                for (?? r13 = z10; r13 < r12.length(); r13++) {
                    InternalEntry next = (InternalEntry) r12.get(r13);
                    while (next != null) {
                        Object objR = segment.r(next);
                        boolean z11 = z10;
                        if (objR != null && o().equivalent(obj, objR)) {
                            return true;
                        }
                        next = next.getNext();
                        z10 = z11;
                    }
                }
                j11 += (long) segment.f29889d;
                z10 = z10;
            }
            boolean z12 = z10;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
        }
        return z10;
    }

    InternalEntry d(Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return m(iH).n(obj, iH);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f29864j;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f29864j = entrySet;
        return entrySet;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    Object g(InternalEntry internalEntry) {
        if (internalEntry.getKey() == null) {
            return null;
        }
        return internalEntry.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return (V) m(iH).m(obj, iH);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    int h(Object obj) {
        return l(this.f29860f.hash(obj));
    }

    final Segment[] i(int i10) {
        return new Segment[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment[] segmentArr = this.f29858d;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].f29888c != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].f29889d;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].f29888c != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].f29889d;
        }
        return j10 == 0;
    }

    void j(InternalEntry internalEntry) {
        int hash = internalEntry.getHash();
        m(hash).D(internalEntry, hash);
    }

    void k(WeakValueReference weakValueReference) {
        InternalEntry entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        m(hash).E(entry.getKey(), hash, weakValueReference);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f29862h;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f29862h = keySet;
        return keySet;
    }

    Segment m(int i10) {
        return this.f29858d[(i10 >>> this.f29857c) & this.f29856b];
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    Equivalence o() {
        return this.f29861g.valueStrength().g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iH = h(k10);
        return (V) m(iH).C(k10, iH, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public V putIfAbsent(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iH = h(k10);
        return (V) m(iH).C(k10, iH, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return (V) m(iH).F(obj, iH);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public boolean replace(K k10, V v10, V v11) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v11);
        if (v10 == null) {
            return false;
        }
        int iH = h(k10);
        return m(iH).J(k10, iH, v10, v11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (Segment segment : this.f29858d) {
            j10 += (long) segment.f29888c;
        }
        return Ints.saturatedCast(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f29863i;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f29863i = values;
        return values;
    }

    Object writeReplace() {
        return new SerializationProxy(this.f29861g.keyStrength(), this.f29861g.valueStrength(), this.f29860f, this.f29861g.valueStrength().g(), this.f29859e, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iH = h(obj);
        return m(iH).G(obj, iH, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    @CanIgnoreReturnValue
    public V replace(K k10, V v10) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        int iH = h(k10);
        return (V) m(iH).I(k10, iH, v10);
    }
}
