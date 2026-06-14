package com.iab.omid.library.amazon.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f34123c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f34124a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f34125b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f34123c;
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f34125b);
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34124a);
    }

    public boolean d() {
        return this.f34125b.size() > 0;
    }

    public void a(com.iab.omid.library.amazon.adsession.a aVar) {
        this.f34124a.add(aVar);
    }

    public void b(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean zD = d();
        this.f34124a.remove(aVar);
        this.f34125b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean zD = d();
        this.f34125b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
