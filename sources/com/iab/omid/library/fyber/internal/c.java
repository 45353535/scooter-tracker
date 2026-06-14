package com.iab.omid.library.fyber.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35028c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f35029a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f35030b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35028c;
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35030b);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35029a);
    }

    public boolean d() {
        return this.f35030b.size() > 0;
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f35029a.add(aVar);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f35029a.remove(aVar);
        this.f35030b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f35030b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
