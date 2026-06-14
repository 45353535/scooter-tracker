package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.chartboost.internal.d;
import com.iab.omid.library.chartboost.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.chartboost.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f34797f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34798a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.e f34799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.b f34800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.chartboost.devicevolume.d f34801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34802e;

    public i(com.iab.omid.library.chartboost.devicevolume.e eVar, com.iab.omid.library.chartboost.devicevolume.b bVar) {
        this.f34799b = eVar;
        this.f34800c = bVar;
    }

    private c a() {
        if (this.f34802e == null) {
            this.f34802e = c.c();
        }
        return this.f34802e;
    }

    public static i c() {
        if (f34797f == null) {
            f34797f = new i(new com.iab.omid.library.chartboost.devicevolume.e(), new com.iab.omid.library.chartboost.devicevolume.b());
        }
        return f34797f;
    }

    public float b() {
        return this.f34798a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f34801d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f34801d.c();
    }

    @Override // com.iab.omid.library.chartboost.devicevolume.c
    public void a(float f10) {
        this.f34798a = f10;
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f34801d = this.f34799b.a(new Handler(), context, this.f34800c.a(), this);
    }

    @Override // com.iab.omid.library.chartboost.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
