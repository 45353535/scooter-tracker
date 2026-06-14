package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23460h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23462b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f23463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d3 f23465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f23466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f23467g;

    public e3(int i10) {
        this.f23461a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f23463c = map;
        this.f23466f = map;
    }

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f23462b.get(iA)).setValue(obj);
        }
        a();
        if (this.f23462b.isEmpty() && !(this.f23462b instanceof ArrayList)) {
            this.f23462b = new ArrayList(this.f23461a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f23461a) {
            return c().put(comparable, obj);
        }
        int size = this.f23462b.size();
        int i11 = this.f23461a;
        if (size == i11) {
            b3 b3Var = (b3) this.f23462b.remove(i11 - 1);
            c().put(b3Var.f23443a, b3Var.f23444b);
        }
        this.f23462b.add(i10, new b3(this, comparable, obj));
        return null;
    }

    public final Iterable b() {
        return this.f23463c.isEmpty() ? a3.f23439b : this.f23463c.entrySet();
    }

    public final SortedMap c() {
        a();
        if (this.f23463c.isEmpty() && !(this.f23463c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23463c = treeMap;
            this.f23466f = treeMap.descendingMap();
        }
        return (SortedMap) this.f23463c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.f23462b.isEmpty()) {
            this.f23462b.clear();
        }
        if (this.f23463c.isEmpty()) {
            return;
        }
        this.f23463c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f23463c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f23465e == null) {
            this.f23465e = new d3(this);
        }
        return this.f23465e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return super.equals(obj);
        }
        e3 e3Var = (e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.f23462b.size();
        if (size2 != e3Var.f23462b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!((Map.Entry) this.f23462b.get(i10)).equals((Map.Entry) e3Var.f23462b.get(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f23463c.equals(e3Var.f23463c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f23462b.get(iA)).f23444b : this.f23463c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f23462b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((b3) this.f23462b.get(i10)).hashCode();
        }
        return this.f23463c.size() > 0 ? this.f23463c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA < 0) {
            if (this.f23463c.isEmpty()) {
                return null;
            }
            return this.f23463c.remove(comparable);
        }
        a();
        Object obj2 = ((b3) this.f23462b.remove(iA)).f23444b;
        if (!this.f23463c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            this.f23462b.add(new b3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23463c.size() + this.f23462b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f23462b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f23462b
            java.lang.Object r2 = r2.get(r1)
            com.fyber.inneractive.sdk.protobuf.b3 r2 = (com.fyber.inneractive.sdk.protobuf.b3) r2
            java.lang.Comparable r2 = r2.f23443a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f23462b
            java.lang.Object r3 = r3.get(r2)
            com.fyber.inneractive.sdk.protobuf.b3 r3 = (com.fyber.inneractive.sdk.protobuf.b3) r3
            java.lang.Comparable r3 = r3.f23443a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L22
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L22
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.e3.a(java.lang.Comparable):int");
    }

    public final void a() {
        if (this.f23464d) {
            throw new UnsupportedOperationException();
        }
    }
}
