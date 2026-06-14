package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.internal.d;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.fyber.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35046f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35047a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.e f35048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.b f35049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.devicevolume.d f35050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35051e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.f35048b = eVar;
        this.f35049c = bVar;
    }

    private c a() {
        if (this.f35051e == null) {
            this.f35051e = c.c();
        }
        return this.f35051e;
    }

    public static i c() {
        if (f35046f == null) {
            f35046f = new i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f35046f;
    }

    public float b() {
        return this.f35047a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35050d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35050d.d();
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f10) {
        this.f35047a = f10;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f35050d = this.f35048b.a(new Handler(), context, this.f35049c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
