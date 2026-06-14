package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.internal.d;
import com.iab.omid.library.appodeal.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.appodeal.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f34406f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34407a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.e f34408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.b f34409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.devicevolume.d f34410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34411e;

    public i(com.iab.omid.library.appodeal.devicevolume.e eVar, com.iab.omid.library.appodeal.devicevolume.b bVar) {
        this.f34408b = eVar;
        this.f34409c = bVar;
    }

    private c a() {
        if (this.f34411e == null) {
            this.f34411e = c.c();
        }
        return this.f34411e;
    }

    public static i c() {
        if (f34406f == null) {
            f34406f = new i(new com.iab.omid.library.appodeal.devicevolume.e(), new com.iab.omid.library.appodeal.devicevolume.b());
        }
        return f34406f;
    }

    public float b() {
        return this.f34407a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f34410d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f34410d.c();
    }

    @Override // com.iab.omid.library.appodeal.devicevolume.c
    public void a(float f10) {
        this.f34407a = f10;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f34410d = this.f34408b.a(new Handler(), context, this.f34409c.a(), this);
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
