package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f48709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f48710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f48711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48712d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f48712d = i10;
        this.f48709a = bArr;
        this.f48711c = map;
        if (list == null) {
            this.f48710b = null;
        } else {
            this.f48710b = DesugarCollections.unmodifiableList(list);
        }
    }
}
