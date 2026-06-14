package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.internal.d;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35187f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35188a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f35189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f35190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f35191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35192e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f35189b = eVar;
        this.f35190c = bVar;
    }

    private c a() {
        if (this.f35192e == null) {
            this.f35192e = c.c();
        }
        return this.f35192e;
    }

    public static i c() {
        if (f35187f == null) {
            f35187f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f35187f;
    }

    public float b() {
        return this.f35188a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35191d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35191d.c();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f35188a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f35191d = this.f35189b.a(new Handler(), context, this.f35190c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
