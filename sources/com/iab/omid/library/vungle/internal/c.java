package com.iab.omid.library.vungle.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f36376c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f36377a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f36378b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f36376c;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f36378b);
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f36377a);
    }

    public boolean d() {
        return this.f36378b.size() > 0;
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.f36377a.add(aVar);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f36377a.remove(aVar);
        this.f36378b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f36378b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
