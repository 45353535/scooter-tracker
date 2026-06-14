package com.iab.omid.library.mmadbridge.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35439c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f35440a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f35441b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35439c;
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35441b);
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35440a);
    }

    public boolean d() {
        return this.f35441b.size() > 0;
    }

    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        this.f35440a.add(aVar);
    }

    public void b(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f35440a.remove(aVar);
        this.f35441b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f35441b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
