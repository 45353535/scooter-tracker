package com.iab.omid.library.applovin.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f34252c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f34253a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f34254b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f34252c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f34254b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34253a);
    }

    public boolean d() {
        return this.f34254b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f34253a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f34253a.remove(aVar);
        this.f34254b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f34254b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
