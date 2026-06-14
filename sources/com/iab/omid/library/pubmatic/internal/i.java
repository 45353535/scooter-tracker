package com.iab.omid.library.pubmatic.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.pubmatic.internal.d;
import com.iab.omid.library.pubmatic.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.pubmatic.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35733f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35734a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.pubmatic.devicevolume.e f35735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.pubmatic.devicevolume.b f35736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.devicevolume.d f35737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35738e;

    public i(com.iab.omid.library.pubmatic.devicevolume.e eVar, com.iab.omid.library.pubmatic.devicevolume.b bVar) {
        this.f35735b = eVar;
        this.f35736c = bVar;
    }

    private c a() {
        if (this.f35738e == null) {
            this.f35738e = c.c();
        }
        return this.f35738e;
    }

    public static i c() {
        if (f35733f == null) {
            f35733f = new i(new com.iab.omid.library.pubmatic.devicevolume.e(), new com.iab.omid.library.pubmatic.devicevolume.b());
        }
        return f35733f;
    }

    public float b() {
        return this.f35734a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35737d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35737d.c();
    }

    @Override // com.iab.omid.library.pubmatic.devicevolume.c
    public void a(float f10) {
        this.f35734a = f10;
        Iterator<com.iab.omid.library.pubmatic.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f35737d = this.f35735b.a(new Handler(), context, this.f35736c.a(), this);
    }

    @Override // com.iab.omid.library.pubmatic.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
