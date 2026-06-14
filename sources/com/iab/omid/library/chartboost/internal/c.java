package com.iab.omid.library.chartboost.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f34779c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f34780a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f34781b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f34779c;
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f34781b);
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34780a);
    }

    public boolean d() {
        return this.f34781b.size() > 0;
    }

    public void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        this.f34780a.add(aVar);
    }

    public void b(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f34780a.remove(aVar);
        this.f34781b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f34781b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
