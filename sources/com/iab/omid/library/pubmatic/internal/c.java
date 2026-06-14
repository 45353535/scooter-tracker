package com.iab.omid.library.pubmatic.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35715c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.pubmatic.adsession.a> f35716a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.pubmatic.adsession.a> f35717b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35715c;
    }

    public Collection<com.iab.omid.library.pubmatic.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35717b);
    }

    public Collection<com.iab.omid.library.pubmatic.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35716a);
    }

    public boolean d() {
        return this.f35717b.size() > 0;
    }

    public void a(com.iab.omid.library.pubmatic.adsession.a aVar) {
        this.f35716a.add(aVar);
    }

    public void b(com.iab.omid.library.pubmatic.adsession.a aVar) {
        boolean zD = d();
        this.f35716a.remove(aVar);
        this.f35717b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.pubmatic.adsession.a aVar) {
        boolean zD = d();
        this.f35717b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
