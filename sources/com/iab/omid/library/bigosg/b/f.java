package com.iab.omid.library.bigosg.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bigosg.b.b;
import com.iab.omid.library.bigosg.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class f implements com.iab.omid.library.bigosg.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f34534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34535b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.e f34536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.b f34537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.a.d f34538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f34539f;

    public f(com.iab.omid.library.bigosg.a.e eVar, com.iab.omid.library.bigosg.a.b bVar) {
        this.f34536c = eVar;
        this.f34537d = bVar;
    }

    public static f a() {
        if (f34534a == null) {
            f34534a = new f(new com.iab.omid.library.bigosg.a.e(), new com.iab.omid.library.bigosg.a.b());
        }
        return f34534a;
    }

    private a e() {
        if (this.f34539f == null) {
            this.f34539f = a.a();
        }
        return this.f34539f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f34538e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f34538e.b();
    }

    public float d() {
        return this.f34535b;
    }

    @Override // com.iab.omid.library.bigosg.a.c
    public void a(float f10) {
        this.f34535b = f10;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f34538e = this.f34536c.a(new Handler(), context, this.f34537d.a(), this);
    }

    @Override // com.iab.omid.library.bigosg.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}
