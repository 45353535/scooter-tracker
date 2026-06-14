package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.internal.d;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35457f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35458a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f35459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f35460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f35461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35462e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f35459b = eVar;
        this.f35460c = bVar;
    }

    private c a() {
        if (this.f35462e == null) {
            this.f35462e = c.c();
        }
        return this.f35462e;
    }

    public static i c() {
        if (f35457f == null) {
            f35457f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f35457f;
    }

    public float b() {
        return this.f35458a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35461d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35461d.d();
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f35458a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f35461d = this.f35459b.a(new Handler(), context, this.f35460c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
