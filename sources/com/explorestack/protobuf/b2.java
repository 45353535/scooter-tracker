package com.explorestack.protobuf;

import com.explorestack.protobuf.c0;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
abstract class b2 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f18872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f18873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile e f18875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f18876g;

    static class a extends b2 {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.explorestack.protobuf.b2
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((c0.c) entryH.getKey()).isRepeated()) {
                        entryH.setValue(DesugarCollections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((c0.c) entry.getKey()).isRepeated()) {
                        entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((c0.c) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f18877a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f18878b = new C0322b();

        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.b2$b$b, reason: collision with other inner class name */
        static class C0322b implements Iterable {
            C0322b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f18877a;
            }
        }

        static Iterable b() {
            return f18878b;
        }
    }

    private class c implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparable f18879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f18880c;

        c(b2 b2Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f18879b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f18879b, entry.getKey()) && c(this.f18880c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f18880c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f18879b;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f18880c;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b2.this.f();
            Object obj2 = this.f18880c;
            this.f18880c = obj;
            return obj2;
        }

        public String toString() {
            return this.f18879b + C4240b4.j.f42668b + this.f18880c;
        }

        c(Comparable comparable, Object obj) {
            this.f18879b = comparable;
            this.f18880c = obj;
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b2.this.p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b2.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(b2.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b2.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b2.this.size();
        }

        /* synthetic */ e(b2 b2Var, a aVar) {
            this();
        }
    }

    /* synthetic */ b2(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f18872c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f18872c
            java.lang.Object r2 = r2.get(r1)
            com.explorestack.protobuf.b2$c r2 = (com.explorestack.protobuf.b2.c) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f18872c
            java.lang.Object r3 = r3.get(r2)
            com.explorestack.protobuf.b2$c r3 = (com.explorestack.protobuf.b2.c) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.b2.e(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f18874e) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f18872c.isEmpty() || (this.f18872c instanceof ArrayList)) {
            return;
        }
        this.f18872c = new ArrayList(this.f18871b);
    }

    private SortedMap l() {
        f();
        if (this.f18873d.isEmpty() && !(this.f18873d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18873d = treeMap;
            this.f18876g = treeMap.descendingMap();
        }
        return (SortedMap) this.f18873d;
    }

    static b2 o(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object q(int i10) {
        f();
        Object value = ((c) this.f18872c.remove(i10)).getValue();
        if (!this.f18873d.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f18872c.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f18872c.isEmpty()) {
            this.f18872c.clear();
        }
        if (this.f18873d.isEmpty()) {
            return;
        }
        this.f18873d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f18873d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f18875f == null) {
            this.f18875f = new e(this, null);
        }
        return this.f18875f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return super.equals(obj);
        }
        b2 b2Var = (b2) obj;
        int size = size();
        if (size != b2Var.size()) {
            return false;
        }
        int i10 = i();
        if (i10 != b2Var.i()) {
            return entrySet().equals(b2Var.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(b2Var.h(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f18873d.equals(b2Var.f18873d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f18872c.get(iE)).getValue() : this.f18873d.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f18872c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = i();
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += ((c) this.f18872c.get(i11)).hashCode();
        }
        return j() > 0 ? iHashCode + this.f18873d.hashCode() : iHashCode;
    }

    public int i() {
        return this.f18872c.size();
    }

    public int j() {
        return this.f18873d.size();
    }

    public Iterable k() {
        return this.f18873d.isEmpty() ? b.b() : this.f18873d.entrySet();
    }

    public boolean m() {
        return this.f18874e;
    }

    public void n() {
        if (this.f18874e) {
            return;
        }
        this.f18873d = this.f18873d.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f18873d);
        this.f18876g = this.f18876g.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f18876g);
        this.f18874e = true;
    }

    public Object p(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f18872c.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f18871b) {
            return l().put(comparable, obj);
        }
        int size = this.f18872c.size();
        int i11 = this.f18871b;
        if (size == i11) {
            c cVar = (c) this.f18872c.remove(i11 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.f18872c.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return q(iE);
        }
        if (this.f18873d.isEmpty()) {
            return null;
        }
        return this.f18873d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18872c.size() + this.f18873d.size();
    }

    private class d implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Iterator f18884d;

        private d() {
            this.f18882b = -1;
        }

        private Iterator a() {
            if (this.f18884d == null) {
                this.f18884d = b2.this.f18873d.entrySet().iterator();
            }
            return this.f18884d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f18883c = true;
            int i10 = this.f18882b + 1;
            this.f18882b = i10;
            return i10 < b2.this.f18872c.size() ? (Map.Entry) b2.this.f18872c.get(this.f18882b) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18882b + 1 < b2.this.f18872c.size() || (!b2.this.f18873d.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f18883c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f18883c = false;
            b2.this.f();
            if (this.f18882b >= b2.this.f18872c.size()) {
                a().remove();
                return;
            }
            b2 b2Var = b2.this;
            int i10 = this.f18882b;
            this.f18882b = i10 - 1;
            b2Var.q(i10);
        }

        /* synthetic */ d(b2 b2Var, a aVar) {
            this();
        }
    }

    private b2(int i10) {
        this.f18871b = i10;
        this.f18872c = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f18873d = map;
        this.f18876g = map;
    }
}
