package com.iab.omid.library.bigosg.b;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f34514a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f34515b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f34516c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f34514a;
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f34515b);
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> c() {
        return DesugarCollections.unmodifiableCollection(this.f34516c);
    }

    public boolean d() {
        return this.f34516c.size() > 0;
    }

    public void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        this.f34515b.add(aVar);
    }

    public void b(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f34516c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f34515b.remove(aVar);
        this.f34516c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
