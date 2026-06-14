package com.iab.omid.library.appodeal.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f34388c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f34389a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f34390b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f34388c;
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f34390b);
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34389a);
    }

    public boolean d() {
        return this.f34390b.size() > 0;
    }

    public void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        this.f34389a.add(aVar);
    }

    public void b(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f34389a.remove(aVar);
        this.f34390b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f34390b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
