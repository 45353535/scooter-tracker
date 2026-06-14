package com.iab.omid.library.mobilefuse.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mobilefuse.internal.d;
import com.iab.omid.library.mobilefuse.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.mobilefuse.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35592f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35593a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mobilefuse.devicevolume.e f35594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mobilefuse.devicevolume.b f35595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mobilefuse.devicevolume.d f35596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35597e;

    public i(com.iab.omid.library.mobilefuse.devicevolume.e eVar, com.iab.omid.library.mobilefuse.devicevolume.b bVar) {
        this.f35594b = eVar;
        this.f35595c = bVar;
    }

    private c a() {
        if (this.f35597e == null) {
            this.f35597e = c.c();
        }
        return this.f35597e;
    }

    public static i c() {
        if (f35592f == null) {
            f35592f = new i(new com.iab.omid.library.mobilefuse.devicevolume.e(), new com.iab.omid.library.mobilefuse.devicevolume.b());
        }
        return f35592f;
    }

    public float b() {
        return this.f35593a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35596d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35596d.d();
    }

    @Override // com.iab.omid.library.mobilefuse.devicevolume.c
    public void a(float f10) {
        this.f35593a = f10;
        Iterator<com.iab.omid.library.mobilefuse.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f35596d = this.f35594b.a(new Handler(), context, this.f35595c.a(), this);
    }

    @Override // com.iab.omid.library.mobilefuse.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
