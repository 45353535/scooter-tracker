package com.explorestack.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class w0 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f19398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile d f19399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f19400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f19401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f19402e;

    private interface a {
        Message a(Object obj, Object obj2);

        void b(Message message, Map map);

        Message c();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u0 f19403a;

        public b(u0 u0Var) {
            this.f19403a = u0Var;
        }

        @Override // com.explorestack.protobuf.w0.a
        public Message a(Object obj, Object obj2) {
            return this.f19403a.newBuilderForType().t(obj).w(obj2).buildPartial();
        }

        @Override // com.explorestack.protobuf.w0.a
        public void b(Message message, Map map) {
            u0 u0Var = (u0) message;
            map.put(u0Var.i(), u0Var.k());
        }

        @Override // com.explorestack.protobuf.w0.a
        public Message c() {
            return this.f19403a;
        }
    }

    private static class c implements Map {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h1 f19404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f19405c;

        private static class a implements Collection {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final h1 f19406b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Collection f19407c;

            a(h1 h1Var, Collection collection) {
                this.f19406b = h1Var;
                this.f19407c = collection;
            }

            @Override // java.util.Collection
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.f19406b.ensureMutable();
                this.f19407c.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f19407c.contains(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.f19407c.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f19407c.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f19407c.hashCode();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f19407c.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new b(this.f19406b, this.f19407c.iterator());
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f19406b.ensureMutable();
                return this.f19407c.remove(obj);
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection collection) {
                this.f19406b.ensureMutable();
                return this.f19407c.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection collection) {
                this.f19406b.ensureMutable();
                return this.f19407c.retainAll(collection);
            }

            @Override // java.util.Collection
            public int size() {
                return this.f19407c.size();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f19407c.toArray();
            }

            public String toString() {
                return this.f19407c.toString();
            }

            @Override // java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.f19407c.toArray(objArr);
            }
        }

        private static class b implements Iterator {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final h1 f19408b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Iterator f19409c;

            b(h1 h1Var, Iterator it) {
                this.f19408b = h1Var;
                this.f19409c = it;
            }

            public boolean equals(Object obj) {
                return this.f19409c.equals(obj);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19409c.hasNext();
            }

            public int hashCode() {
                return this.f19409c.hashCode();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.f19409c.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f19408b.ensureMutable();
                this.f19409c.remove();
            }

            public String toString() {
                return this.f19409c.toString();
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.w0$c$c, reason: collision with other inner class name */
        private static class C0324c implements Set {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final h1 f19410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Set f19411c;

            C0324c(h1 h1Var, Set set) {
                this.f19410b = h1Var;
                this.f19411c = set;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Object obj) {
                this.f19410b.ensureMutable();
                return this.f19411c.add(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection collection) {
                this.f19410b.ensureMutable();
                return this.f19411c.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f19410b.ensureMutable();
                this.f19411c.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f19411c.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.f19411c.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f19411c.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f19411c.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f19411c.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new b(this.f19410b, this.f19411c.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f19410b.ensureMutable();
                return this.f19411c.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection collection) {
                this.f19410b.ensureMutable();
                return this.f19411c.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection collection) {
                this.f19410b.ensureMutable();
                return this.f19411c.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f19411c.size();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f19411c.toArray();
            }

            public String toString() {
                return this.f19411c.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.f19411c.toArray(objArr);
            }
        }

        c(h1 h1Var, Map map) {
            this.f19404b = h1Var;
            this.f19405c = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.f19404b.ensureMutable();
            this.f19405c.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f19405c.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f19405c.containsValue(obj);
        }

        @Override // java.util.Map
        public Set entrySet() {
            return new C0324c(this.f19404b, this.f19405c.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f19405c.equals(obj);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.f19405c.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f19405c.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f19405c.isEmpty();
        }

        @Override // java.util.Map
        public Set keySet() {
            return new C0324c(this.f19404b, this.f19405c.keySet());
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            this.f19404b.ensureMutable();
            j0.a(obj);
            j0.a(obj2);
            return this.f19405c.put(obj, obj2);
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            this.f19404b.ensureMutable();
            for (Object obj : map.keySet()) {
                j0.a(obj);
                j0.a(map.get(obj));
            }
            this.f19405c.putAll(map);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            this.f19404b.ensureMutable();
            return this.f19405c.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f19405c.size();
        }

        public String toString() {
            return this.f19405c.toString();
        }

        @Override // java.util.Map
        public Collection values() {
            return new a(this.f19404b, this.f19405c.values());
        }
    }

    private enum d {
        MAP,
        LIST,
        BOTH
    }

    private w0(a aVar, d dVar, Map map) {
        this.f19402e = aVar;
        this.f19398a = true;
        this.f19399b = dVar;
        this.f19400c = new c(this, map);
        this.f19401d = null;
    }

    private Message b(Object obj, Object obj2) {
        return this.f19402e.a(obj, obj2);
    }

    private c c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((Message) it.next(), linkedHashMap);
        }
        return new c(this, linkedHashMap);
    }

    private List d(c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.entrySet()) {
            arrayList.add(b(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private void e(Message message, Map map) {
        this.f19402e.b(message, map);
    }

    public static w0 g(u0 u0Var) {
        return new w0(u0Var, d.MAP, Collections.EMPTY_MAP);
    }

    public static w0 p(u0 u0Var) {
        return new w0(u0Var, d.MAP, new LinkedHashMap());
    }

    public void a() {
        this.f19400c = new c(this, new LinkedHashMap());
        this.f19399b = d.MAP;
    }

    @Override // com.explorestack.protobuf.h1
    public void ensureMutable() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof w0) {
            return x0.l(i(), ((w0) obj).i());
        }
        return false;
    }

    public w0 f() {
        return new w0(this.f19402e, d.MAP, x0.g(i()));
    }

    List h() {
        d dVar = this.f19399b;
        d dVar2 = d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f19399b == dVar2) {
                        this.f19401d = d(this.f19400c);
                        this.f19399b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableList(this.f19401d);
    }

    public int hashCode() {
        return x0.a(i());
    }

    public Map i() {
        d dVar = this.f19399b;
        d dVar2 = d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f19399b == dVar2) {
                        this.f19400c = c(this.f19401d);
                        this.f19399b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableMap(this.f19400c);
    }

    Message j() {
        return this.f19402e.c();
    }

    List k() {
        d dVar = this.f19399b;
        d dVar2 = d.LIST;
        if (dVar != dVar2) {
            if (this.f19399b == d.MAP) {
                this.f19401d = d(this.f19400c);
            }
            this.f19400c = null;
            this.f19399b = dVar2;
        }
        return this.f19401d;
    }

    public Map l() {
        d dVar = this.f19399b;
        d dVar2 = d.MAP;
        if (dVar != dVar2) {
            if (this.f19399b == d.LIST) {
                this.f19400c = c(this.f19401d);
            }
            this.f19401d = null;
            this.f19399b = dVar2;
        }
        return this.f19400c;
    }

    public boolean m() {
        return this.f19398a;
    }

    public void n() {
        this.f19398a = false;
    }

    public void o(w0 w0Var) {
        l().putAll(x0.g(w0Var.i()));
    }

    private w0(u0 u0Var, d dVar, Map map) {
        this(new b(u0Var), dVar, map);
    }
}
