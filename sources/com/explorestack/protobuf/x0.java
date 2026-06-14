package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends LinkedHashMap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x0 f19459c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19460b;

    static {
        x0 x0Var = new x0();
        f19459c = x0Var;
        x0Var.o();
    }

    private x0() {
        this.f19460b = true;
    }

    static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return j0.e((byte[]) obj);
        }
        if (obj instanceof j0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void c(Map map) {
        for (Object obj : map.keySet()) {
            j0.a(obj);
            j0.a(map.get(obj));
        }
    }

    private static Object d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static Map g(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), d(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static x0 i() {
        return f19459c;
    }

    private void j() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean k(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean l(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !k(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean n() {
        return this.f19460b;
    }

    public void o() {
        this.f19460b = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        j();
        j0.a(obj);
        j0.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        j();
        c(map);
        super.putAll(map);
    }

    public void q(x0 x0Var) {
        j();
        if (x0Var.isEmpty()) {
            return;
        }
        putAll(x0Var);
    }

    public x0 r() {
        return isEmpty() ? new x0() : new x0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        return super.remove(obj);
    }

    private x0(Map map) {
        super(map);
        this.f19460b = true;
    }
}
