package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f34270f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34271a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f34272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f34273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f34274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34275e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f34272b = eVar;
        this.f34273c = bVar;
    }

    private c a() {
        if (this.f34275e == null) {
            this.f34275e = c.c();
        }
        return this.f34275e;
    }

    public static i c() {
        if (f34270f == null) {
            f34270f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f34270f;
    }

    public float b() {
        return this.f34271a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f34274d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f34274d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f34271a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f34274d = this.f34272b.a(new Handler(), context, this.f34273c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
