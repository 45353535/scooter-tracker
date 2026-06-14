package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21162b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f21164d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f21166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PriorityQueue f21167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f21168h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f21175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f21176p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21165e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21169i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21170j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f21171k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f21172l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f21173m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f21174n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f21163c = new HashMap();

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f21164d = new PriorityQueue(1, gVar);
        this.f21168h = dVar;
        this.f21167g = new PriorityQueue(1, dVar);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f21163c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f21163c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f21163c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}
