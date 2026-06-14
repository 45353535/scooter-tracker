package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient Reference f30336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient GeneralRange f30337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient AvlNode f30338h;

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30347a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f30347a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30347a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int g(AvlNode avlNode) {
                return avlNode.f30350b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long h(AvlNode avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return avlNode.f30352d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int g(AvlNode avlNode) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long h(AvlNode avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return avlNode.f30351c;
            }
        };

        abstract int g(AvlNode avlNode);

        abstract long h(AvlNode avlNode);
    }

    private static final class Reference<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f30358a;

        private Reference() {
        }

        void a() {
            this.f30358a = null;
        }

        public void checkAndSet(T t10, T t11) {
            if (this.f30358a != t10) {
                throw new ConcurrentModificationException();
            }
            this.f30358a = t11;
        }

        public T get() {
            return (T) this.f30358a;
        }
    }

    TreeMultiset(Reference reference, GeneralRange generalRange, AvlNode avlNode) {
        super(generalRange.d());
        this.f30336f = reference;
        this.f30337g = generalRange;
        this.f30338h = avlNode;
    }

    private long A(Aggregate aggregate, AvlNode avlNode) {
        long jH;
        long jA;
        if (avlNode == null) {
            return 0L;
        }
        int iCompare = comparator().compare(NullnessCasts.a(this.f30337g.j()), avlNode.x());
        if (iCompare < 0) {
            return A(aggregate, avlNode.f30354f);
        }
        if (iCompare == 0) {
            int i10 = AnonymousClass4.f30347a[this.f30337g.i().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.h(avlNode.f30354f);
                }
                throw new AssertionError();
            }
            jH = aggregate.g(avlNode);
            jA = aggregate.h(avlNode.f30354f);
        } else {
            jH = aggregate.h(avlNode.f30354f) + ((long) aggregate.g(avlNode));
            jA = A(aggregate, avlNode.f30355g);
        }
        return jH + jA;
    }

    private long B(Aggregate aggregate) {
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        long jH = aggregate.h(avlNode);
        if (this.f30337g.m()) {
            jH -= A(aggregate, avlNode);
        }
        return this.f30337g.n() ? jH - x(aggregate, avlNode) : jH;
    }

    static int C(AvlNode avlNode) {
        if (avlNode == null) {
            return 0;
        }
        return avlNode.f30351c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvlNode D() {
        AvlNode avlNodeL;
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        if (avlNode == null) {
            return null;
        }
        if (this.f30337g.m()) {
            Object objA = NullnessCasts.a(this.f30337g.j());
            avlNodeL = avlNode.s(comparator(), objA);
            if (avlNodeL == null) {
                return null;
            }
            if (this.f30337g.i() == BoundType.OPEN && comparator().compare(objA, avlNodeL.x()) == 0) {
                avlNodeL = avlNodeL.L();
            }
        } else {
            avlNodeL = this.f30338h.L();
        }
        if (avlNodeL == this.f30338h || !this.f30337g.g(avlNodeL.x())) {
            return null;
        }
        return avlNodeL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvlNode E() {
        AvlNode avlNodeZ;
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        if (avlNode == null) {
            return null;
        }
        if (this.f30337g.n()) {
            Object objA = NullnessCasts.a(this.f30337g.l());
            avlNodeZ = avlNode.v(comparator(), objA);
            if (avlNodeZ == null) {
                return null;
            }
            if (this.f30337g.k() == BoundType.OPEN && comparator().compare(objA, avlNodeZ.x()) == 0) {
                avlNodeZ = avlNodeZ.z();
            }
        } else {
            avlNodeZ = this.f30338h.z();
        }
        if (avlNodeZ == this.f30338h || !this.f30337g.g(avlNodeZ.x())) {
            return null;
        }
        return avlNodeZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(AvlNode avlNode, AvlNode avlNode2) {
        avlNode.f30357i = avlNode2;
        avlNode2.f30356h = avlNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(AvlNode avlNode, AvlNode avlNode2, AvlNode avlNode3) {
        F(avlNode, avlNode2);
        F(avlNode2, avlNode3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry H(final AvlNode avlNode) {
        return new Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.TreeMultiset.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TreeMultiset f30340c;

            {
                this.f30340c = this;
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int iW = avlNode.w();
                return iW == 0 ? this.f30340c.count(getElement()) : iW;
            }

            @Override // com.google.common.collect.Multiset.Entry
            @ParametricNullness
            public E getElement() {
                return (E) avlNode.x();
            }
        };
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        Serialization.a(AbstractSortedMultiset.class, "comparator").b(this, comparator);
        Serialization.a(TreeMultiset.class, SessionDescription.ATTR_RANGE).b(this, GeneralRange.a(comparator));
        Serialization.a(TreeMultiset.class, "rootReference").b(this, new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.a(TreeMultiset.class, POBCTAOverlayData.KEY_CTA_HEADER).b(this, avlNode);
        F(avlNode, avlNode);
        Serialization.f(this, objectInputStream);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        Serialization.k(this, objectOutputStream);
    }

    private long x(Aggregate aggregate, AvlNode avlNode) {
        long jH;
        long jX;
        if (avlNode == null) {
            return 0L;
        }
        int iCompare = comparator().compare(NullnessCasts.a(this.f30337g.l()), avlNode.x());
        if (iCompare > 0) {
            return x(aggregate, avlNode.f30355g);
        }
        if (iCompare == 0) {
            int i10 = AnonymousClass4.f30347a[this.f30337g.k().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.h(avlNode.f30355g);
                }
                throw new AssertionError();
            }
            jH = aggregate.g(avlNode);
            jX = aggregate.h(avlNode.f30355g);
        } else {
            jH = aggregate.h(avlNode.f30355g) + ((long) aggregate.g(avlNode));
            jX = x(aggregate, avlNode.f30354f);
        }
        return jH + jX;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e10, int i10) {
        CollectPreconditions.b(i10, "occurrences");
        if (i10 == 0) {
            return count(e10);
        }
        Preconditions.checkArgument(this.f30337g.g(e10));
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.f30336f.checkAndSet(avlNode, avlNode.o(comparator(), e10, i10, iArr));
            return iArr[0];
        }
        comparator().compare(e10, e10);
        AvlNode avlNode2 = new AvlNode(e10, i10);
        AvlNode avlNode3 = this.f30338h;
        G(avlNode3, avlNode2, avlNode3);
        this.f30336f.checkAndSet(avlNode, avlNode2);
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f30337g.m() || this.f30337g.n()) {
            Iterators.b(k());
            return;
        }
        AvlNode avlNodeL = this.f30338h.L();
        while (true) {
            AvlNode avlNode = this.f30338h;
            if (avlNodeL == avlNode) {
                F(avlNode, avlNode);
                this.f30336f.a();
                return;
            }
            AvlNode avlNodeL2 = avlNodeL.L();
            avlNodeL.f30350b = 0;
            avlNodeL.f30354f = null;
            avlNodeL.f30355g = null;
            avlNodeL.f30356h = null;
            avlNodeL.f30357i = null;
            avlNodeL = avlNodeL2;
        }
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        try {
            AvlNode avlNode = (AvlNode) this.f30336f.get();
            if (this.f30337g.g(obj) && avlNode != null) {
                return avlNode.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e10, BoundType boundType) {
        return new TreeMultiset(this.f30336f, this.f30337g.o(GeneralRange.s(comparator(), e10, boundType)), this.f30338h);
    }

    @Override // com.google.common.collect.AbstractMultiset
    int i() {
        return Ints.saturatedCast(B(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator j() {
        return Multisets.e(k());
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator k() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            AvlNode f30341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Multiset.Entry f30342c;

            {
                this.f30341b = TreeMultiset.this.D();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f30341b == null) {
                    return false;
                }
                if (!TreeMultiset.this.f30337g.q(this.f30341b.x())) {
                    return true;
                }
                this.f30341b = null;
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f30342c != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.f30342c.getElement(), 0);
                this.f30342c = null;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                TreeMultiset treeMultiset = TreeMultiset.this;
                AvlNode avlNode = this.f30341b;
                Objects.requireNonNull(avlNode);
                Multiset.Entry<E> entryH = treeMultiset.H(avlNode);
                this.f30342c = entryH;
                if (this.f30341b.L() == TreeMultiset.this.f30338h) {
                    this.f30341b = null;
                    return entryH;
                }
                this.f30341b = this.f30341b.L();
                return entryH;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    Iterator n() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            AvlNode f30344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Multiset.Entry f30345c = null;

            {
                this.f30344b = TreeMultiset.this.E();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f30344b == null) {
                    return false;
                }
                if (!TreeMultiset.this.f30337g.r(this.f30344b.x())) {
                    return true;
                }
                this.f30344b = null;
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f30345c != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.f30345c.getElement(), 0);
                this.f30345c = null;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Objects.requireNonNull(this.f30344b);
                Multiset.Entry<E> entryH = TreeMultiset.this.H(this.f30344b);
                this.f30345c = entryH;
                if (this.f30344b.z() == TreeMultiset.this.f30338h) {
                    this.f30344b = null;
                    return entryH;
                }
                this.f30344b = this.f30344b.z();
                return entryH;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i10) {
        CollectPreconditions.b(i10, "occurrences");
        if (i10 == 0) {
            return count(obj);
        }
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        int[] iArr = new int[1];
        try {
            if (this.f30337g.g(obj) && avlNode != null) {
                this.f30336f.checkAndSet(avlNode, avlNode.E(comparator(), obj, i10, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e10, int i10) {
        CollectPreconditions.b(i10, "count");
        if (!this.f30337g.g(e10)) {
            Preconditions.checkArgument(i10 == 0);
            return 0;
        }
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        if (avlNode == null) {
            if (i10 > 0) {
                add(e10, i10);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f30336f.checkAndSet(avlNode, avlNode.K(comparator(), e10, i10, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(B(Aggregate.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@ParametricNullness Object obj, BoundType boundType, @ParametricNullness Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e10, BoundType boundType) {
        return new TreeMultiset(this.f30336f, this.f30337g.o(GeneralRange.h(comparator(), e10, boundType)), this.f30338h);
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.natural()) : new TreeMultiset<>(comparator);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        Iterables.addAll(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    TreeMultiset(Comparator comparator) {
        super(comparator);
        this.f30337g = GeneralRange.a(comparator);
        AvlNode avlNode = new AvlNode();
        this.f30338h = avlNode;
        F(avlNode, avlNode);
        this.f30336f = new Reference();
    }

    private static final class AvlNode<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f30349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f30351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f30352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f30353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private AvlNode f30354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AvlNode f30355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AvlNode f30356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AvlNode f30357i;

        AvlNode(Object obj, int i10) {
            Preconditions.checkArgument(i10 > 0);
            this.f30349a = obj;
            this.f30350b = i10;
            this.f30352d = i10;
            this.f30351c = 1;
            this.f30353e = 1;
            this.f30354f = null;
            this.f30355g = null;
        }

        private AvlNode A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.f30355g);
                if (this.f30355g.r() > 0) {
                    this.f30355g = this.f30355g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f30354f);
            if (this.f30354f.r() < 0) {
                this.f30354f = this.f30354f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.f30353e = Math.max(y(this.f30354f), y(this.f30355g)) + 1;
        }

        private void D() {
            this.f30351c = TreeMultiset.C(this.f30354f) + 1 + TreeMultiset.C(this.f30355g);
            this.f30352d = ((long) this.f30350b) + M(this.f30354f) + M(this.f30355g);
        }

        private AvlNode F(AvlNode avlNode) {
            AvlNode avlNode2 = this.f30355g;
            if (avlNode2 == null) {
                return this.f30354f;
            }
            this.f30355g = avlNode2.F(avlNode);
            this.f30351c--;
            this.f30352d -= (long) avlNode.f30350b;
            return A();
        }

        private AvlNode G(AvlNode avlNode) {
            AvlNode avlNode2 = this.f30354f;
            if (avlNode2 == null) {
                return this.f30355g;
            }
            this.f30354f = avlNode2.G(avlNode);
            this.f30351c--;
            this.f30352d -= (long) avlNode.f30350b;
            return A();
        }

        private AvlNode H() {
            Preconditions.checkState(this.f30355g != null);
            AvlNode avlNode = this.f30355g;
            this.f30355g = avlNode.f30354f;
            avlNode.f30354f = this;
            avlNode.f30352d = this.f30352d;
            avlNode.f30351c = this.f30351c;
            B();
            avlNode.C();
            return avlNode;
        }

        private AvlNode I() {
            Preconditions.checkState(this.f30354f != null);
            AvlNode avlNode = this.f30354f;
            this.f30354f = avlNode.f30355g;
            avlNode.f30355g = this;
            avlNode.f30352d = this.f30352d;
            avlNode.f30351c = this.f30351c;
            B();
            avlNode.C();
            return avlNode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode L() {
            AvlNode avlNode = this.f30357i;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        private static long M(AvlNode avlNode) {
            if (avlNode == null) {
                return 0L;
            }
            return avlNode.f30352d;
        }

        private AvlNode p(Object obj, int i10) {
            this.f30354f = new AvlNode(obj, i10);
            TreeMultiset.G(z(), this.f30354f, this);
            this.f30353e = Math.max(2, this.f30353e);
            this.f30351c++;
            this.f30352d += (long) i10;
            return this;
        }

        private AvlNode q(Object obj, int i10) {
            AvlNode avlNode = new AvlNode(obj, i10);
            this.f30355g = avlNode;
            TreeMultiset.G(this, avlNode, L());
            this.f30353e = Math.max(2, this.f30353e);
            this.f30351c++;
            this.f30352d += (long) i10;
            return this;
        }

        private int r() {
            return y(this.f30354f) - y(this.f30355g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode s(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode != null) {
                    return (AvlNode) MoreObjects.firstNonNull(avlNode.s(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                AvlNode avlNode2 = this.f30355g;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.s(comparator, obj);
            }
            return this;
        }

        private AvlNode u() {
            int i10 = this.f30350b;
            this.f30350b = 0;
            TreeMultiset.F(z(), L());
            AvlNode avlNode = this.f30354f;
            if (avlNode == null) {
                return this.f30355g;
            }
            AvlNode avlNode2 = this.f30355g;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.f30353e >= avlNode2.f30353e) {
                AvlNode avlNodeZ = z();
                avlNodeZ.f30354f = this.f30354f.F(avlNodeZ);
                avlNodeZ.f30355g = this.f30355g;
                avlNodeZ.f30351c = this.f30351c - 1;
                avlNodeZ.f30352d = this.f30352d - ((long) i10);
                return avlNodeZ.A();
            }
            AvlNode avlNodeL = L();
            avlNodeL.f30355g = this.f30355g.G(avlNodeL);
            avlNodeL.f30354f = this.f30354f;
            avlNodeL.f30351c = this.f30351c - 1;
            avlNodeL.f30352d = this.f30352d - ((long) i10);
            return avlNodeL.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode v(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare > 0) {
                AvlNode avlNode = this.f30355g;
                if (avlNode != null) {
                    return (AvlNode) MoreObjects.firstNonNull(avlNode.v(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                AvlNode avlNode2 = this.f30354f;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.v(comparator, obj);
            }
            return this;
        }

        private static int y(AvlNode avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f30353e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvlNode z() {
            AvlNode avlNode = this.f30356h;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        AvlNode E(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f30354f = avlNode.E(comparator, obj, i10, iArr);
                int i11 = iArr[0];
                if (i11 > 0) {
                    if (i10 >= i11) {
                        this.f30351c--;
                        this.f30352d -= (long) i11;
                    } else {
                        this.f30352d -= (long) i10;
                    }
                }
                return i11 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i12 = this.f30350b;
                iArr[0] = i12;
                if (i10 >= i12) {
                    return u();
                }
                this.f30350b = i12 - i10;
                this.f30352d -= (long) i10;
                return this;
            }
            AvlNode avlNode2 = this.f30355g;
            if (avlNode2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f30355g = avlNode2.E(comparator, obj, i10, iArr);
            int i13 = iArr[0];
            if (i13 > 0) {
                if (i10 >= i13) {
                    this.f30351c--;
                    this.f30352d -= (long) i13;
                } else {
                    this.f30352d -= (long) i10;
                }
            }
            return A();
        }

        AvlNode J(Comparator comparator, Object obj, int i10, int i11, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode != null) {
                    this.f30354f = avlNode.J(comparator, obj, i10, i11, iArr);
                    int i12 = iArr[0];
                    if (i12 == i10) {
                        if (i11 == 0 && i12 != 0) {
                            this.f30351c--;
                        } else if (i11 > 0 && i12 == 0) {
                            this.f30351c++;
                        }
                        this.f30352d += (long) (i11 - i12);
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return p(obj, i11);
                }
            } else if (iCompare > 0) {
                AvlNode avlNode2 = this.f30355g;
                if (avlNode2 != null) {
                    this.f30355g = avlNode2.J(comparator, obj, i10, i11, iArr);
                    int i13 = iArr[0];
                    if (i13 == i10) {
                        if (i11 == 0 && i13 != 0) {
                            this.f30351c--;
                        } else if (i11 > 0 && i13 == 0) {
                            this.f30351c++;
                        }
                        this.f30352d += (long) (i11 - i13);
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return q(obj, i11);
                }
            } else {
                int i14 = this.f30350b;
                iArr[0] = i14;
                if (i10 == i14) {
                    if (i11 == 0) {
                        return u();
                    }
                    this.f30352d += (long) (i11 - i14);
                    this.f30350b = i11;
                }
            }
            return this;
        }

        AvlNode K(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode != null) {
                    this.f30354f = avlNode.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f30351c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f30351c++;
                    }
                    this.f30352d += (long) (i10 - iArr[0]);
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return p(obj, i10);
                }
            } else {
                if (iCompare <= 0) {
                    int i11 = this.f30350b;
                    iArr[0] = i11;
                    if (i10 == 0) {
                        return u();
                    }
                    this.f30352d += (long) (i10 - i11);
                    this.f30350b = i10;
                    return this;
                }
                AvlNode avlNode2 = this.f30355g;
                if (avlNode2 != null) {
                    this.f30355g = avlNode2.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f30351c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f30351c++;
                    }
                    this.f30352d += (long) (i10 - iArr[0]);
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return q(obj, i10);
                }
            }
            return this;
        }

        AvlNode o(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return p(obj, i10);
                }
                int i11 = avlNode.f30353e;
                AvlNode avlNodeO = avlNode.o(comparator, obj, i10, iArr);
                this.f30354f = avlNodeO;
                if (iArr[0] == 0) {
                    this.f30351c++;
                }
                this.f30352d += (long) i10;
                if (avlNodeO.f30353e != i11) {
                    return A();
                }
            } else {
                if (iCompare <= 0) {
                    int i12 = this.f30350b;
                    iArr[0] = i12;
                    long j10 = i10;
                    Preconditions.checkArgument(((long) i12) + j10 <= SieveCacheKt.NodeLinkMask);
                    this.f30350b += i10;
                    this.f30352d += j10;
                    return this;
                }
                AvlNode avlNode2 = this.f30355g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return q(obj, i10);
                }
                int i13 = avlNode2.f30353e;
                AvlNode avlNodeO2 = avlNode2.o(comparator, obj, i10, iArr);
                this.f30355g = avlNodeO2;
                if (iArr[0] == 0) {
                    this.f30351c++;
                }
                this.f30352d += (long) i10;
                if (avlNodeO2.f30353e != i13) {
                    return A();
                }
            }
            return this;
        }

        int t(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                AvlNode avlNode = this.f30354f;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.t(comparator, obj);
            }
            if (iCompare <= 0) {
                return this.f30350b;
            }
            AvlNode avlNode2 = this.f30355g;
            if (avlNode2 == null) {
                return 0;
            }
            return avlNode2.t(comparator, obj);
        }

        public String toString() {
            return Multisets.immutableEntry(x(), w()).toString();
        }

        int w() {
            return this.f30350b;
        }

        Object x() {
            return NullnessCasts.a(this.f30349a);
        }

        AvlNode() {
            this.f30349a = null;
            this.f30350b = 1;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e10, int i10, int i11) {
        CollectPreconditions.b(i11, "newCount");
        CollectPreconditions.b(i10, "oldCount");
        Preconditions.checkArgument(this.f30337g.g(e10));
        AvlNode avlNode = (AvlNode) this.f30336f.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.f30336f.checkAndSet(avlNode, avlNode.J(comparator(), e10, i10, i11, iArr));
            return iArr[0] == i10;
        }
        if (i10 != 0) {
            return false;
        }
        if (i11 > 0) {
            add(e10, i11);
        }
        return true;
    }
}
