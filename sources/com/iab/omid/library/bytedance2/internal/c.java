package com.iab.omid.library.bytedance2.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f34644c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f34645a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f34646b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f34644c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f34646b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34645a);
    }

    public boolean d() {
        return this.f34646b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f34645a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f34645a.remove(aVar);
        this.f34646b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f34646b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
