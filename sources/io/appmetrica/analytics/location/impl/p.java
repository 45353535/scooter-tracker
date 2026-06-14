package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f78715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f78716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f78717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f78718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f78719e = new HashMap();

    public p(List list, i iVar) {
        this.f78718d = list;
        this.f78715a = iVar;
        m mVar = new m();
        this.f78716b = mVar;
        this.f78717c = new h(mVar);
    }

    public final m a() {
        return this.f78716b;
    }
}
