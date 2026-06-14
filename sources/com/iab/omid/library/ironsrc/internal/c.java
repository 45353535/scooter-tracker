package com.iab.omid.library.ironsrc.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35304c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f35305a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f35306b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35304c;
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35306b);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35305a);
    }

    public boolean d() {
        return this.f35306b.size() > 0;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f35305a.add(aVar);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.f35305a.remove(aVar);
        this.f35306b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.f35306b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
