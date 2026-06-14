package com.iab.omid.library.corpmailru.b;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f34900a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.corpmailru.adsession.a> f34901b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.corpmailru.adsession.a> f34902c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f34900a;
    }

    public Collection<com.iab.omid.library.corpmailru.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34901b);
    }

    public Collection<com.iab.omid.library.corpmailru.adsession.a> c() {
        return DesugarCollections.unmodifiableCollection(this.f34902c);
    }

    public boolean d() {
        return this.f34902c.size() > 0;
    }

    public void a(com.iab.omid.library.corpmailru.adsession.a aVar) {
        this.f34901b.add(aVar);
    }

    public void b(com.iab.omid.library.corpmailru.adsession.a aVar) {
        boolean zD = d();
        this.f34902c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.corpmailru.adsession.a aVar) {
        boolean zD = d();
        this.f34901b.remove(aVar);
        this.f34902c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
