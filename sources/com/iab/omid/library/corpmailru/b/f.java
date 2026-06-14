package com.iab.omid.library.corpmailru.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.corpmailru.b.b;
import com.iab.omid.library.corpmailru.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class f implements com.iab.omid.library.corpmailru.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f34917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34918b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.a.e f34919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.a.b f34920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.a.d f34921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f34922f;

    public f(com.iab.omid.library.corpmailru.a.e eVar, com.iab.omid.library.corpmailru.a.b bVar) {
        this.f34919c = eVar;
        this.f34920d = bVar;
    }

    public static f a() {
        if (f34917a == null) {
            f34917a = new f(new com.iab.omid.library.corpmailru.a.e(), new com.iab.omid.library.corpmailru.a.b());
        }
        return f34917a;
    }

    private a e() {
        if (this.f34922f == null) {
            this.f34922f = a.a();
        }
        return this.f34922f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f34921e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f34921e.b();
    }

    public float d() {
        return this.f34918b;
    }

    @Override // com.iab.omid.library.corpmailru.a.c
    public void a(float f10) {
        this.f34918b = f10;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f34921e = this.f34919c.a(new Handler(), context, this.f34920d.a(), this);
    }

    @Override // com.iab.omid.library.corpmailru.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}
