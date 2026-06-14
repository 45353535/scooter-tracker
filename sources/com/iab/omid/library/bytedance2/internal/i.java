package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f34662f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34663a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f34664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f34665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f34666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34667e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f34664b = eVar;
        this.f34665c = bVar;
    }

    private c a() {
        if (this.f34667e == null) {
            this.f34667e = c.c();
        }
        return this.f34667e;
    }

    public static i c() {
        if (f34662f == null) {
            f34662f = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f34662f;
    }

    public float b() {
        return this.f34663a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f34666d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f34666d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f10) {
        this.f34663a = f10;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f34666d = this.f34664b.a(new Handler(), context, this.f34665c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
