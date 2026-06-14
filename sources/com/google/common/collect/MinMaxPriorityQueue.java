package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Heap f29984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Heap f29985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f29986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f29987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29989g;

    public static final class Builder<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparator f29990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29992c;

        /* JADX INFO: Access modifiers changed from: private */
        public Ordering c() {
            return Ordering.from(this.f29990a);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.EMPTY_SET);
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i10) {
            Preconditions.checkArgument(i10 >= 0);
            this.f29991b = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i10) {
            Preconditions.checkArgument(i10 > 0);
            this.f29992c = i10;
            return this;
        }

        private Builder(Comparator comparator) {
            this.f29991b = -1;
            this.f29992c = Integer.MAX_VALUE;
            this.f29990a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.n(this.f29991b, this.f29992c, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }
    }

    class Heap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Ordering f29993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Heap f29994b;

        Heap(Ordering ordering) {
            this.f29993a = ordering;
        }

        private int j(int i10) {
            return l(l(i10));
        }

        private int k(int i10) {
            return (i10 * 2) + 1;
        }

        private int l(int i10) {
            return (i10 - 1) / 2;
        }

        private int m(int i10) {
            return (i10 * 2) + 2;
        }

        void a(int i10, Object obj) {
            Heap heap;
            int iE = e(i10, obj);
            if (iE == i10) {
                iE = i10;
                heap = this;
            } else {
                heap = this.f29994b;
            }
            heap.b(iE, obj);
        }

        int b(int i10, Object obj) {
            while (i10 > 2) {
                int iJ = j(i10);
                Object objI = MinMaxPriorityQueue.this.i(iJ);
                if (this.f29993a.compare(objI, obj) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.f29987e[i10] = objI;
                i10 = iJ;
            }
            MinMaxPriorityQueue.this.f29987e[i10] = obj;
            return i10;
        }

        int c(int i10, int i11) {
            return this.f29993a.compare(MinMaxPriorityQueue.this.i(i10), MinMaxPriorityQueue.this.i(i11));
        }

        int d(int i10, Object obj) {
            int iH = h(i10);
            if (iH <= 0 || this.f29993a.compare(MinMaxPriorityQueue.this.i(iH), obj) >= 0) {
                return e(i10, obj);
            }
            MinMaxPriorityQueue.this.f29987e[i10] = MinMaxPriorityQueue.this.i(iH);
            MinMaxPriorityQueue.this.f29987e[iH] = obj;
            return iH;
        }

        int e(int i10, Object obj) {
            int iM;
            if (i10 == 0) {
                MinMaxPriorityQueue.this.f29987e[0] = obj;
                return 0;
            }
            int iL = l(i10);
            Object objI = MinMaxPriorityQueue.this.i(iL);
            if (iL != 0 && (iM = m(l(iL))) != iL && k(iM) >= MinMaxPriorityQueue.this.f29988f) {
                Object objI2 = MinMaxPriorityQueue.this.i(iM);
                if (this.f29993a.compare(objI2, objI) < 0) {
                    iL = iM;
                    objI = objI2;
                }
            }
            if (this.f29993a.compare(objI, obj) >= 0) {
                MinMaxPriorityQueue.this.f29987e[i10] = obj;
                return i10;
            }
            MinMaxPriorityQueue.this.f29987e[i10] = objI;
            MinMaxPriorityQueue.this.f29987e[iL] = obj;
            return iL;
        }

        int f(int i10) {
            while (true) {
                int i11 = i(i10);
                if (i11 <= 0) {
                    return i10;
                }
                MinMaxPriorityQueue.this.f29987e[i10] = MinMaxPriorityQueue.this.i(i11);
                i10 = i11;
            }
        }

        int g(int i10, int i11) {
            if (i10 >= MinMaxPriorityQueue.this.f29988f) {
                return -1;
            }
            Preconditions.checkState(i10 > 0);
            int iMin = Math.min(i10, MinMaxPriorityQueue.this.f29988f - i11) + i11;
            for (int i12 = i10 + 1; i12 < iMin; i12++) {
                if (c(i12, i10) < 0) {
                    i10 = i12;
                }
            }
            return i10;
        }

        int h(int i10) {
            return g(k(i10), 2);
        }

        int i(int i10) {
            int iK = k(i10);
            if (iK < 0) {
                return -1;
            }
            return g(k(iK), 4);
        }

        int n(Object obj) {
            int iM;
            int iL = l(MinMaxPriorityQueue.this.f29988f);
            if (iL != 0 && (iM = m(l(iL))) != iL && k(iM) >= MinMaxPriorityQueue.this.f29988f) {
                Object objI = MinMaxPriorityQueue.this.i(iM);
                if (this.f29993a.compare(objI, obj) < 0) {
                    MinMaxPriorityQueue.this.f29987e[iM] = obj;
                    MinMaxPriorityQueue.this.f29987e[MinMaxPriorityQueue.this.f29988f] = objI;
                    return iM;
                }
            }
            return MinMaxPriorityQueue.this.f29988f;
        }

        MoveDesc o(int i10, int i11, Object obj) {
            int iD = d(i11, obj);
            if (iD == i11) {
                return null;
            }
            Object objI = iD < i10 ? MinMaxPriorityQueue.this.i(i10) : MinMaxPriorityQueue.this.i(l(i10));
            if (this.f29994b.b(iD, obj) < i10) {
                return new MoveDesc(obj, objI);
            }
            return null;
        }
    }

    static class MoveDesc<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f29996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29997b;

        MoveDesc(Object obj, Object obj2) {
            this.f29996a = obj;
            this.f29997b = obj2;
        }
    }

    private class QueueIterator implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f30000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Queue f30001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f30002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f30003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f30004h;

        private QueueIterator() {
            this.f29998b = -1;
            this.f29999c = -1;
            this.f30000d = MinMaxPriorityQueue.this.f29989g;
        }

        private void a() {
            if (MinMaxPriorityQueue.this.f29989g != this.f30000d) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean b(Iterable iterable, Object obj) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        private void c(int i10) {
            if (this.f29999c < i10) {
                if (this.f30002f != null) {
                    while (i10 < MinMaxPriorityQueue.this.size() && b(this.f30002f, MinMaxPriorityQueue.this.i(i10))) {
                        i10++;
                    }
                }
                this.f29999c = i10;
            }
        }

        private boolean d(Object obj) {
            for (int i10 = 0; i10 < MinMaxPriorityQueue.this.f29988f; i10++) {
                if (MinMaxPriorityQueue.this.f29987e[i10] == obj) {
                    MinMaxPriorityQueue.this.q(i10);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue queue;
            a();
            c(this.f29998b + 1);
            return this.f29999c < MinMaxPriorityQueue.this.size() || !((queue = this.f30001e) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            c(this.f29998b + 1);
            if (this.f29999c < MinMaxPriorityQueue.this.size()) {
                int i10 = this.f29999c;
                this.f29998b = i10;
                this.f30004h = true;
                return (E) MinMaxPriorityQueue.this.i(i10);
            }
            if (this.f30001e != null) {
                this.f29998b = MinMaxPriorityQueue.this.size();
                E e10 = (E) this.f30001e.poll();
                this.f30003g = e10;
                if (e10 != null) {
                    this.f30004h = true;
                    return e10;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.e(this.f30004h);
            a();
            this.f30004h = false;
            this.f30000d++;
            if (this.f29998b >= MinMaxPriorityQueue.this.size()) {
                Object obj = this.f30003g;
                Objects.requireNonNull(obj);
                Preconditions.checkState(d(obj));
                this.f30003g = null;
                return;
            }
            MoveDesc moveDescQ = MinMaxPriorityQueue.this.q(this.f29998b);
            if (moveDescQ != null) {
                if (this.f30001e == null || this.f30002f == null) {
                    this.f30001e = new ArrayDeque();
                    this.f30002f = new ArrayList(3);
                }
                if (!b(this.f30002f, moveDescQ.f29996a)) {
                    this.f30001e.add(moveDescQ.f29996a);
                }
                if (!b(this.f30001e, moveDescQ.f29997b)) {
                    this.f30002f.add(moveDescQ.f29997b);
                }
            }
            this.f29998b--;
            this.f29999c--;
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    public static Builder<Comparable> expectedSize(int i10) {
        return new Builder(Ordering.natural()).expectedSize(i10);
    }

    private int f() {
        int length = this.f29987e.length;
        return g(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.f29986d);
    }

    private static int g(int i10, int i11) {
        return Math.min(i10 - 1, i11) + 1;
    }

    private MoveDesc j(int i10, Object obj) {
        Heap heapM = m(i10);
        int iF = heapM.f(i10);
        int iB = heapM.b(iF, obj);
        if (iB == iF) {
            return heapM.o(i10, iF, obj);
        }
        if (iB < i10) {
            return new MoveDesc(obj, i(i10));
        }
        return null;
    }

    private int k() {
        int i10 = this.f29988f;
        if (i10 != 1) {
            return (i10 == 2 || this.f29985c.c(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void l() {
        if (this.f29988f > this.f29987e.length) {
            Object[] objArr = new Object[f()];
            Object[] objArr2 = this.f29987e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f29987e = objArr;
        }
    }

    private Heap m(int i10) {
        return o(i10) ? this.f29984b : this.f29985c;
    }

    public static Builder<Comparable> maximumSize(int i10) {
        return new Builder(Ordering.natural()).maximumSize(i10);
    }

    static int n(int i10, int i11, Iterable iterable) {
        if (i10 == -1) {
            i10 = 11;
        }
        if (iterable instanceof Collection) {
            i10 = Math.max(i10, ((Collection) iterable).size());
        }
        return g(i10, i11);
    }

    static boolean o(int i10) {
        int i11 = ~(~(i10 + 1));
        Preconditions.checkState(i11 > 0, "negative index");
        return (1431655765 & i11) > (i11 & (-1431655766));
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    private Object p(int i10) {
        Object objI = i(i10);
        q(i10);
        return objI;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e10) {
        offer(e10);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            offer(it.next());
            z10 = true;
        }
        return z10;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i10 = 0; i10 < this.f29988f; i10++) {
            this.f29987e[i10] = null;
        }
        this.f29988f = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f29984b.f29993a;
    }

    Object i(int i10) {
        Object obj = this.f29987e[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e10) {
        Preconditions.checkNotNull(e10);
        this.f29989g++;
        int i10 = this.f29988f;
        this.f29988f = i10 + 1;
        l();
        m(i10).a(i10, e10);
        return this.f29988f <= this.f29986d || pollLast() != e10;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) i(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) i(k());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return (E) p(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) p(k());
    }

    MoveDesc q(int i10) {
        Preconditions.checkPositionIndex(i10, this.f29988f);
        this.f29989g++;
        int i11 = this.f29988f - 1;
        this.f29988f = i11;
        if (i11 == i10) {
            this.f29987e[i11] = null;
            return null;
        }
        Object objI = i(i11);
        int iN = m(this.f29988f).n(objI);
        if (iN == i10) {
            this.f29987e[this.f29988f] = null;
            return null;
        }
        Object objI2 = i(this.f29988f);
        this.f29987e[this.f29988f] = null;
        MoveDesc moveDescJ = j(i10, objI2);
        return iN < i10 ? moveDescJ == null ? new MoveDesc(objI, objI2) : new MoveDesc(objI, moveDescJ.f29997b) : moveDescJ;
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) p(k());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f29988f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public Object[] toArray() {
        int i10 = this.f29988f;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f29987e, 0, objArr, 0, i10);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder builder, int i10) {
        Ordering orderingC = builder.c();
        Heap heap = new Heap(orderingC);
        this.f29984b = heap;
        Heap heap2 = new Heap(orderingC.reverse());
        this.f29985c = heap2;
        heap.f29994b = heap2;
        heap2.f29994b = heap;
        this.f29986d = builder.f29992c;
        this.f29987e = new Object[i10];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
