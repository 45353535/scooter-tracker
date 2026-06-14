package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class r62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f115341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f115342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f115343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115344e;

    public r62(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f115340a = i10;
        this.f115341b = bArr;
        this.f115342c = map;
        if (list == null) {
            this.f115343d = null;
        } else {
            this.f115343d = DesugarCollections.unmodifiableList(list);
        }
        this.f115344e = z10;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new bz0((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Map a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bz0 bz0Var = (bz0) it.next();
            treeMap.put(bz0Var.f109154a, bz0Var.f109155b);
        }
        return treeMap;
    }
}
