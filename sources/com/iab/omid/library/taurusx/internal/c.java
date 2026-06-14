package com.iab.omid.library.taurusx.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f36115c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.taurusx.adsession.a> f36116a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.taurusx.adsession.a> f36117b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f36115c;
    }

    public Collection<com.iab.omid.library.taurusx.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f36117b);
    }

    public Collection<com.iab.omid.library.taurusx.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f36116a);
    }

    public boolean d() {
        return this.f36117b.size() > 0;
    }

    public void a(com.iab.omid.library.taurusx.adsession.a aVar) {
        this.f36116a.add(aVar);
    }

    public void b(com.iab.omid.library.taurusx.adsession.a aVar) {
        boolean zD = d();
        this.f36116a.remove(aVar);
        this.f36117b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.taurusx.adsession.a aVar) {
        boolean zD = d();
        this.f36117b.add(aVar);
        if (zD) {
            return;
        }
        h.c().d();
    }
}
