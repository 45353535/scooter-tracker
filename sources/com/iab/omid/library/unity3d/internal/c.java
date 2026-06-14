package com.iab.omid.library.unity3d.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f36243c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f36244a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f36245b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f36243c;
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f36245b);
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f36244a);
    }

    public boolean d() {
        return this.f36245b.size() > 0;
    }

    public void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.f36244a.add(aVar);
    }

    public void b(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean zD = d();
        this.f36244a.remove(aVar);
        this.f36245b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean zD = d();
        this.f36245b.add(aVar);
        if (zD) {
            return;
        }
        h.c().d();
    }
}
