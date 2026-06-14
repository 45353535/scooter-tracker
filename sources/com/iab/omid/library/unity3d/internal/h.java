package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.internal.d;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class h implements d.a, com.iab.omid.library.unity3d.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f36259f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36260a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.e f36261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.b f36262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.devicevolume.d f36263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36264e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.f36261b = eVar;
        this.f36262c = bVar;
    }

    private c a() {
        if (this.f36264e == null) {
            this.f36264e = c.c();
        }
        return this.f36264e;
    }

    public static h c() {
        if (f36259f == null) {
            f36259f = new h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f36259f;
    }

    public float b() {
        return this.f36260a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36263d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36263d.d();
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f10) {
        this.f36260a = f10;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f36263d = this.f36261b.a(new Handler(), context, this.f36262c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
