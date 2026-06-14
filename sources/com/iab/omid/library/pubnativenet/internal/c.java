package com.iab.omid.library.pubnativenet.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f35850c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.pubnativenet.adsession.a> f35851a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.pubnativenet.adsession.a> f35852b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f35850c;
    }

    public Collection<com.iab.omid.library.pubnativenet.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f35852b);
    }

    public Collection<com.iab.omid.library.pubnativenet.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f35851a);
    }

    public boolean d() {
        return this.f35852b.size() > 0;
    }

    public void a(com.iab.omid.library.pubnativenet.adsession.a aVar) {
        this.f35851a.add(aVar);
    }

    public void b(com.iab.omid.library.pubnativenet.adsession.a aVar) {
        boolean zD = d();
        this.f35851a.remove(aVar);
        this.f35852b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.pubnativenet.adsession.a aVar) {
        boolean zD = d();
        this.f35852b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
