package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35322f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35323a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f35324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f35325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f35326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35327e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f35324b = eVar;
        this.f35325c = bVar;
    }

    private c a() {
        if (this.f35327e == null) {
            this.f35327e = c.c();
        }
        return this.f35327e;
    }

    public static i c() {
        if (f35322f == null) {
            f35322f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f35322f;
    }

    public float b() {
        return this.f35323a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35326d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35326d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f35323a = f10;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f35326d = this.f35324b.a(new Handler(), context, this.f35325c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
