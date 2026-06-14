package com.iab.omid.library.pubnativenet.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.pubnativenet.internal.d;
import com.iab.omid.library.pubnativenet.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.pubnativenet.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f35868f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35869a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.pubnativenet.devicevolume.e f35870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.pubnativenet.devicevolume.b f35871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.pubnativenet.devicevolume.d f35872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f35873e;

    public i(com.iab.omid.library.pubnativenet.devicevolume.e eVar, com.iab.omid.library.pubnativenet.devicevolume.b bVar) {
        this.f35870b = eVar;
        this.f35871c = bVar;
    }

    private c a() {
        if (this.f35873e == null) {
            this.f35873e = c.c();
        }
        return this.f35873e;
    }

    public static i c() {
        if (f35868f == null) {
            f35868f = new i(new com.iab.omid.library.pubnativenet.devicevolume.e(), new com.iab.omid.library.pubnativenet.devicevolume.b());
        }
        return f35868f;
    }

    public float b() {
        return this.f35869a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f35872d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f35872d.d();
    }

    @Override // com.iab.omid.library.pubnativenet.devicevolume.c
    public void a(float f10) {
        this.f35869a = f10;
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f35872d = this.f35870b.a(new Handler(), context, this.f35871c.a(), this);
    }

    @Override // com.iab.omid.library.pubnativenet.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
