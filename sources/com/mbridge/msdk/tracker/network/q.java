package com.mbridge.msdk.tracker.network;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f51917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f51918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f51919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f51921f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
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

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f51916a = i10;
        this.f51917b = bArr;
        this.f51918c = map;
        if (list == null) {
            this.f51919d = null;
        } else {
            this.f51919d = DesugarCollections.unmodifiableList(list);
        }
        this.f51920e = z10;
        this.f51921f = j10;
    }
}
