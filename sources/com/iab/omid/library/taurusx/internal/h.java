package com.iab.omid.library.taurusx.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.taurusx.internal.d;
import com.iab.omid.library.taurusx.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class h implements d.a, com.iab.omid.library.taurusx.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f36131f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36132a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.taurusx.devicevolume.e f36133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.taurusx.devicevolume.b f36134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.taurusx.devicevolume.d f36135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36136e;

    public h(com.iab.omid.library.taurusx.devicevolume.e eVar, com.iab.omid.library.taurusx.devicevolume.b bVar) {
        this.f36133b = eVar;
        this.f36134c = bVar;
    }

    private c a() {
        if (this.f36136e == null) {
            this.f36136e = c.c();
        }
        return this.f36136e;
    }

    public static h c() {
        if (f36131f == null) {
            f36131f = new h(new com.iab.omid.library.taurusx.devicevolume.e(), new com.iab.omid.library.taurusx.devicevolume.b());
        }
        return f36131f;
    }

    public float b() {
        return this.f36132a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36135d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36135d.d();
    }

    @Override // com.iab.omid.library.taurusx.devicevolume.c
    public void a(float f10) {
        this.f36132a = f10;
        Iterator<com.iab.omid.library.taurusx.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f36135d = this.f36133b.a(new Handler(), context, this.f36134c.a(), this);
    }

    @Override // com.iab.omid.library.taurusx.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
