package com.iab.omid.library.inmobi.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35169c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f35170a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f35171b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35169c;
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35171b);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35170a);
    }

    public boolean d() {
        return this.f35171b.size() > 0;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f35170a.add(aVar);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f35170a.remove(aVar);
        this.f35171b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f35171b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
