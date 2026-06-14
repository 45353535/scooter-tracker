package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.internal.d;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f36394f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36395a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f36396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f36397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.devicevolume.d f36398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36399e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f36396b = eVar;
        this.f36397c = bVar;
    }

    private c a() {
        if (this.f36399e == null) {
            this.f36399e = c.c();
        }
        return this.f36399e;
    }

    public static i c() {
        if (f36394f == null) {
            f36394f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f36394f;
    }

    public float b() {
        return this.f36395a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36398d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36398d.c();
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f10) {
        this.f36395a = f10;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f36398d = this.f36396b.a(new Handler(), context, this.f36397c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
