package com.iab.omid.library.mobilefuse.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35574c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mobilefuse.adsession.a> f35575a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mobilefuse.adsession.a> f35576b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35574c;
    }

    public Collection<com.iab.omid.library.mobilefuse.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35576b);
    }

    public Collection<com.iab.omid.library.mobilefuse.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35575a);
    }

    public boolean d() {
        return this.f35576b.size() > 0;
    }

    public void a(com.iab.omid.library.mobilefuse.adsession.a aVar) {
        this.f35575a.add(aVar);
    }

    public void b(com.iab.omid.library.mobilefuse.adsession.a aVar) {
        boolean zD = d();
        this.f35575a.remove(aVar);
        this.f35576b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mobilefuse.adsession.a aVar) {
        boolean zD = d();
        this.f35576b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
